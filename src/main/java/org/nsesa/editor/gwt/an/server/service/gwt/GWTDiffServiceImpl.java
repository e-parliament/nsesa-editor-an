package org.nsesa.editor.gwt.an.server.service.gwt;

import org.nsesa.editor.gwt.core.client.service.gwt.GWTDiffService;
import org.nsesa.editor.gwt.core.shared.DiffRequest;
import org.nsesa.editor.gwt.core.shared.DiffResult;

import java.util.ArrayList;

/**
 * Date: 24/06/12 19:57
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class GWTDiffServiceImpl extends SpringRemoteServiceServlet implements GWTDiffService {

    @Override
    public ArrayList<DiffResult> diff(final ArrayList<DiffRequest> diffRequests) {

        // NOTE: we don't actually do any diffing in here .. replace it with a diffing of your choice.
        final ArrayList<DiffResult> results = new ArrayList<DiffResult>();
        for (final DiffRequest diffRequest : diffRequests) {
            results.add(new DiffResult(diffRequest.getOriginal(), diffRequest.getAmendment(), diffRequest.getDiffMethod()));
        }
        return results;
    }

    @Override
    public String getVersion() {
        return "no-diffing-0.0";
    }
}
