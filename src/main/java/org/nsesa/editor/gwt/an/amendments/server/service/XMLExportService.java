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

import org.apache.cxf.helpers.IOUtils;
import org.nsesa.server.dto.AmendmentContainerDTO;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Export the amendment container DTO in xml format
 *
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 30/04/13 11:31
 */
@Service
public class XMLExportService implements ExportService<AmendmentContainerDTO> {

    @Override
    public void export(AmendmentContainerDTO object, HttpServletResponse response) throws IOException {
        try {
            response.setContentType("text/xml");
            response.setHeader("Content-Disposition", "attachment;filename=" + object.getAmendmentContainerID() + ".xml");
            response.setCharacterEncoding("UTF8");

            byte[] bytes = object.getBody().getBytes("utf-8");
            IOUtils.copy(new ByteArrayInputStream(bytes), response.getOutputStream());
            response.setContentLength(bytes.length);
            response.flushBuffer();
        } catch (IOException e) {
            throw new RuntimeException("Failed to xml export", e);
        }
    }
}
