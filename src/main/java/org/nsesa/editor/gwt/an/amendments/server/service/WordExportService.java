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

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Export the amendment container in word format
 *
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 30/04/13 11:33
 */
@Service
public class WordExportService implements ExportService<AmendmentContainerDTO> {
    @Value("classpath:/export/wordAmendmentTemplate.ftl")
    private Resource template;
    private String name;
    private int length;


    @Override
    public void export(AmendmentContainerDTO object, OutputStream outputStream) {
        this.name = object.getAmendmentContainerID();

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
            configuration.getTemplate(template.getFile().getName()).process(root, sw);
            byte[] bytes = sw.toString().getBytes("utf-8");
            this.length = bytes.length;
            IOUtils.copy(new ByteArrayInputStream(bytes), outputStream);
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

    @Override
    public String getContentType() {
        return "application/octet-stream";
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String getName() {
        return name + ".docx";
    }


}
