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

import com.lowagie.text.DocumentException;
import freemarker.ext.dom.NodeModel;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.nsesa.server.dto.AmendmentContainerDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Export the amendment container in pdf format
 *
 * @author <a href="mailto:stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 29/04/13 13:38
 */
@Service
public class PdfExportService implements ExportService<AmendmentContainerDTO> {
    @Value("classpath:/export/pdfAmendmentTemplate.ftl")
    private Resource template;
    @Value("${editor.url}")
    private String editorUrl;


    @Override
    public void export(AmendmentContainerDTO object, HttpServletResponse response) {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment;filename=" + object.getAmendmentContainerID() + ".pdf");
        response.setCharacterEncoding("UTF8");
        final String content = object.getBody();
        final InputSource inputSource;

        try {
            byte[] bytes = content.getBytes("utf-8");
            inputSource = new InputSource(new ByteArrayInputStream(bytes));
            final NodeModel model = NodeModel.parse(inputSource);
            final Configuration configuration = new Configuration();
            configuration.setDefaultEncoding("UTF-8");
            configuration.setDirectoryForTemplateLoading(template.getFile().getParentFile());
            final StringWriter sw = new StringWriter();
            Map<String, Object> root = new HashMap<String, Object>();
            root.put("amendment", model);
            configuration.getTemplate(template.getFile().getName()).process(root, sw);
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(sw.toString(), editorUrl + "/");
            renderer.layout();
            renderer.createPDF(response.getOutputStream());
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
        } catch (DocumentException e) {
            throw new RuntimeException("Export to pdf failed", e);
        }

    }
}
