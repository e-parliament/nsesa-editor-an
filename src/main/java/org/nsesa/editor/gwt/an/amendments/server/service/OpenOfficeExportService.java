/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.amendments.server.service;

import freemarker.ext.dom.NodeModel;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.nsesa.server.dto.AmendmentContainerDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Export the amendment container in word format
 *
 * @author <a href="mailto:stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 30/04/13 11:33
 */
@Service
public class OpenOfficeExportService implements ExportService<AmendmentContainerDTO> {
    @Value("classpath:/export/openOfficeAmendmentTemplate.ftl")
    private Resource template;

    @Value("classpath:/openOffice/template/")
    private Resource templateDirectory;

    @Value("classpath:/openOffice/xsl/xhtml2odt.xsl")
    private Resource htmlToOpenOfficeTransformationTemplate;

    @Value("classpath:/export/htmlAmendmentBodyTemplate.ftl")
    private Resource htmlTemplate;

    @Override
    public void export(AmendmentContainerDTO object, HttpServletResponse response) throws IOException {

        response.setContentType("application/vnd.oasis.opendocument.text");
        response.setHeader("Content-Disposition", "attachment;filename=" + object.getAmendmentContainerID() + ".odt");
        response.setCharacterEncoding("UTF8");

        final String content = object.getBody();
        final InputSource inputSource;
        inputSource = new InputSource(new StringReader(content));

        try {

            // transform the amendment to HTML
            final NodeModel model = NodeModel.parse(inputSource);
            final Configuration configuration = new Configuration();
            configuration.setDefaultEncoding("UTF-8");
            configuration.setDirectoryForTemplateLoading(htmlTemplate.getFile().getParentFile());
            final StringWriter sw = new StringWriter();
            Map<String, Object> root = new HashMap<String, Object>();
            root.put("amendment", model);
            root.put("editorUrl", "");
            configuration.getTemplate(htmlTemplate.getFile().getName()).process(root, sw);
            byte[] bytes = sw.toString().getBytes("utf-8");

            // validate, and transform the body using HTML-to-OpenOffice
            TransformerFactory tFactory = TransformerFactory.newInstance();
            StreamSource xmlSource = new StreamSource(new ByteArrayInputStream(bytes));
            Transformer transformer = tFactory.newTransformer(new StreamSource(htmlToOpenOfficeTransformationTemplate.getFile()));

            StringWriter html2Word = new StringWriter();
            transformer.transform(xmlSource, new StreamResult(html2Word));

            // set the body into the template

            final NodeModel nodeModel = NodeModel.parse(new InputSource(new ByteArrayInputStream(html2Word.toString().getBytes("utf-8"))));
            final StringWriter swWord = new StringWriter();
            root.put("doc", nodeModel);

            configuration.getTemplate(template.getFile().getName()).process(root, swWord);
            byte[] bytesWord = swWord.toString().getBytes("utf-8");

            // create a new zip file with the content from the export
            ZipOutputStream zip = null;

//            FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/pluppens/Projects/Work/test.odt"));

            zip = new ZipOutputStream(response.getOutputStream());
//            zip = new ZipOutputStream(fileOutputStream);


            for (File file : templateDirectory.getFile().listFiles()) {
                // exclude the content.xml file - we'll add it later, and zip does not allow for duplicates.
                if (!file.getName().equalsIgnoreCase("content.xml")) {
                    addToZip(templateDirectory.getFile(), file, zip);
                }
            }

            // add content.xml
            ZipEntry zipEntry = new ZipEntry("content.xml");
            zip.putNextEntry(zipEntry);
            zip.write(bytesWord, 0, bytesWord.length);
            zip.closeEntry();

//            fileOutputStream.close();

            //IOUtils.copy(new ByteArrayInputStream(bytesWord), response.getOutputStream());
            response.setContentLength(sw.toString().length());
            response.flushBuffer();

        } catch (IOException e) {
            throw new RuntimeException("Could not read file.", e);
        } catch (SAXException e) {
            throw new RuntimeException("Could not parse file.", e);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException("Could not parse file.", e);
        } catch (TemplateException e) {
            throw new RuntimeException("Could not load template.", e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException("Could not perform transformation.", e);
        } catch (TransformerException e) {
            throw new RuntimeException("Could not perform transformation.", e);
        }
    }

    private void addToZip(File root, File file, ZipOutputStream zipOutputStream) throws IOException {
        if (file.isDirectory()) {
            final File[] files = file.listFiles();
            for (File nested : files) {
                addToZip(root, nested, zipOutputStream);
            }
        } else {
            String fileName = file.getAbsolutePath().substring(root.getAbsolutePath().length(), file.getAbsolutePath().length());
            fileName = fileName.replaceAll(File.pathSeparator, "/");

            FileInputStream fis = new FileInputStream(file);
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOutputStream.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOutputStream.write(bytes, 0, length);
            }

            zipOutputStream.closeEntry();
            fis.close();
        }
    }

}
