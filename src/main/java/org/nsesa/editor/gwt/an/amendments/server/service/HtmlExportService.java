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
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Export the amendment container in HTML format
 *
 * @author <a href="mailto:stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 30/04/13 11:30
 */
@Service
public class HtmlExportService implements ExportService<AmendmentContainerDTO> {
    @Value("classpath:/export/htmlAmendmentTemplate.ftl")
    private Resource template;
    @Value("${editor.url}")
    private String editorUrl;

    @Override
    public void export(final AmendmentContainerDTO object, final HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + object.getAmendmentContainerID() + ".html");
        response.setCharacterEncoding("UTF8");

        final String content = object.getBody();
        final InputSource inputSource;
        inputSource = new InputSource(new StringReader(content));

        try {
            final NodeModel model = NodeModel.parse(inputSource);
            final Configuration configuration = new Configuration();
            configuration.setDefaultEncoding("UTF-8");
            configuration.setDirectoryForTemplateLoading(template.getFile().getParentFile());
            final StringWriter sw = new StringWriter();
            Map<String, Object> root = new HashMap<String, Object>();
            root.put("amendment", model);
            root.put("editorUrl", editorUrl);
            configuration.getTemplate(template.getFile().getName()).process(root, sw);
            byte[] bytes = sw.toString().getBytes("utf-8");
            IOUtils.copy(new ByteArrayInputStream(bytes), response.getOutputStream());
            response.setContentLength(bytes.length);
            response.flushBuffer();

        } catch (IOException e) {
            throw new RuntimeException("Could not read file.", e);
        } catch (SAXException e) {
            throw new RuntimeException("Could not parse file.", e);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException("Could not parse file.", e);
        } catch (TemplateException e) {
            throw new RuntimeException("Could not load template.", e);
        }
    }

}
