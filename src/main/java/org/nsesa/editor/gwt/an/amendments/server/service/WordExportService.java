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
import org.apache.cxf.helpers.IOUtils;
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
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Export the amendment container in word format
 *
 * @author <a href="mailto:stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 30/04/13 11:33
 */
@Service
public class WordExportService implements ExportService<AmendmentContainerDTO> {
    @Value("classpath:/export/wordAmendmentTemplate.ftl")
    private Resource template;

    @Value("classpath:/export/BASIC IP_To_Word.xslt")
    private Resource htmlToWordTransformationTemplate;

    @Value("classpath:/export/htmlAmendmentBodyTemplate.ftl")
    private Resource htmlTemplate;

    @Override
    public void export(AmendmentContainerDTO object, HttpServletResponse response) throws IOException {

        response.setContentType("application/msword");
        response.setHeader("Content-Disposition", "attachment;filename=" + object.getAmendmentContainerID() + ".doc");
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

            // validate, and transform use the HTML-to-Word
            TransformerFactory tFactory = TransformerFactory.newInstance();
            StreamSource xmlSource = new StreamSource(new ByteArrayInputStream(bytes));
            Transformer transformer = tFactory.newTransformer(new StreamSource(htmlToWordTransformationTemplate.getFile()));

            StringWriter html2Word = new StringWriter();
            transformer.transform(xmlSource, new StreamResult(html2Word));
            // set the body

            final NodeModel nodeModel = NodeModel.parse(new InputSource(new ByteArrayInputStream(html2Word.toString().getBytes("utf-8"))));
            final StringWriter swWord = new StringWriter();
            root.put("doc", nodeModel);
            configuration.getTemplate(template.getFile().getName()).process(root, swWord);
            byte[] bytesWord = swWord.toString().getBytes("utf-8");
            IOUtils.copy(new ByteArrayInputStream(bytesWord), response.getOutputStream());
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

}
