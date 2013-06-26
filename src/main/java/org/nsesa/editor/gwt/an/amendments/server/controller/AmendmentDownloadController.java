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

import org.nsesa.editor.gwt.an.amendments.server.service.DiffHandlerService;
import org.nsesa.editor.gwt.an.amendments.server.service.ExportService;
import org.nsesa.server.dto.AmendmentContainerDTO;
import org.nsesa.server.exception.ResourceNotFoundException;
import org.nsesa.server.service.api.AmendmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Spring controller class used to download amendments in different formats
 *
 * @author <a href="mailto:stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 29/04/13 11:44
 */
@Controller
@RequestMapping("/amendment")
public class AmendmentDownloadController {

    private static final Logger LOG = LoggerFactory.getLogger(AmendmentDownloadController.class);

    @Autowired
    AmendmentService amendmentService;

    @Autowired
    DiffHandlerService diffHandlerService;

    @Resource(name = "exportServices")
    Map<String, ExportService<AmendmentContainerDTO>> exportServices;

    @RequestMapping(value = "/{type}/{amendmentContainerID}", method = RequestMethod.GET)
    public void download(@PathVariable("type") String type, @PathVariable("amendmentContainerID") String amendmentContainerID,
                         HttpServletResponse response) {

        try {
            AmendmentContainerDTO amendmentContainerDTO = amendmentService.getAmendmentContainer(amendmentContainerID);
            if (amendmentContainerDTO != null) {
                try {
                    ExportService exportService = exportServices.get(type);
                    if (exportService != null) {
                        // diff now
                        diffHandlerService.diff(amendmentContainerDTO);
                        // and export it
                        exportService.export(amendmentContainerDTO, response);
                    }
                } catch (IOException ioe) {
                    throw new RuntimeException("IOError writing to output stream", ioe);
                }
            }
        } catch (ResourceNotFoundException e) {
            LOG.error("Could not find the amendment with amendmentContainerID " + amendmentContainerID);
        }
    }
}
