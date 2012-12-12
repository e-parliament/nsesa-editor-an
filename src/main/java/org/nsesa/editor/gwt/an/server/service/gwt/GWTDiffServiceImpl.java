package org.nsesa.editor.gwt.an.server.service.gwt;

import org.nsesa.editor.gwt.core.client.service.gwt.GWTDiffService;
import org.nsesa.editor.gwt.core.shared.ComplexDiffCommand;
import org.nsesa.editor.gwt.core.shared.ComplexDiffResult;

import java.util.List;

/**
 * Date: 24/06/12 19:57
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class GWTDiffServiceImpl extends SpringRemoteServiceServlet implements GWTDiffService {
    @Override
    public List<ComplexDiffResult> complexDiff(List<ComplexDiffCommand> commands) {
        return null;
    }

    @Override
    public String getVersion() {
        return null;
    }
}
