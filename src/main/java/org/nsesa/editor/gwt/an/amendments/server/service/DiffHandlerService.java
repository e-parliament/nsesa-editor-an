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

import org.nsesa.server.dto.AmendmentContainerDTO;

/**
 * Interface responsible to call the backend diffing service and to apply
 * the result of diffing against the {@link org.nsesa.server.dto.AmendmentContainerDTO} data
 *
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 13/05/13 16:50
 */
public interface DiffHandlerService {
    /**
     * Apply the diffing operation against the amendmentContainerDTO
     * @param amendmentContainerDTO the {@link AmendmentContainerDTO} that need to be diffed
     */
    abstract void diff(AmendmentContainerDTO amendmentContainerDTO);
}
