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
package org.nsesa.editor.gwt.an.amendments.server.controller;

import org.nsesa.editor.gwt.an.amendments.server.service.*;
import org.nsesa.server.dto.AmendmentContainerDTO;
import org.nsesa.server.service.api.AmendmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Spring controller class used to download amendments in different formats
 *
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 29/04/13 11:44
 */
@Controller
@RequestMapping("/amendment")
public class AmendmentDownloadController {
    @Autowired
    AmendmentService amendmentService;
    @Autowired
    private PdfExportService pdfExportService;
    @Autowired
    private HtmlExportService htmlExportService;
    @Autowired
    private XMLExportService xmlExportService;
    @Autowired
    private WordExportService wordExportService;

    @RequestMapping(value="/{type}/{amendmentContainerID}", method = RequestMethod.GET)
    public void download( @PathVariable("type") String type, @PathVariable("amendmentContainerID") String amendmentContainerID,
                         HttpServletResponse response) {
        Map<String, ExportService> registered = new LinkedHashMap<String, ExportService>();
        registered.put("xml", xmlExportService);
        registered.put("html", htmlExportService);
        registered.put("pdf", pdfExportService);
        registered.put("word", wordExportService);

        AmendmentContainerDTO amendmentContainerDTO = amendmentService.getAmendmentContainer(amendmentContainerID);
        if (amendmentContainerDTO != null) {
            try {
                ExportService exportService = registered.get(type);
                if (exportService != null) {
                    exportService.export(amendmentContainerDTO, response.getOutputStream());
                    response.setContentType(exportService.getContentType());
                    response.setHeader("Content-Disposition", "attachment;filename=" + exportService.getName());
                    response.setContentLength(exportService.getLength());
                    response.setCharacterEncoding("UTF8");
                    response.flushBuffer();

                }
            } catch(IOException ioe) {
                throw new RuntimeException("IOError writing to output stream", ioe);
            }
        }
    }


}
