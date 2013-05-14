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
