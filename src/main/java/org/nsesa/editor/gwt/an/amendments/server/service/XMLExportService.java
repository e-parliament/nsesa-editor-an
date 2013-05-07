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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Export the amendment container DTO in xml format
 *
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 30/04/13 11:31
 */
@Service
public class XMLExportService implements ExportService<AmendmentContainerDTO> {
    private String name;
    private int length;

    @Override
    public void export(AmendmentContainerDTO object, OutputStream outputStream) {
        name = object.getAmendmentContainerID();
        try {
            byte[] bytes = object.getBody().getBytes("utf-8");
            IOUtils.copy(new ByteArrayInputStream(bytes), outputStream);
            this.length = bytes.length;
        } catch (IOException e) {
            throw new RuntimeException("Failed to xml export", e);
        }

    }

    @Override
    public String getContentType() {
        return "application/xml";
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String getName() {
        return name + ".xml";
    }
}
