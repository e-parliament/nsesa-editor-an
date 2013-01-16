package org.nsesa.editor.gwt.an.server.service.gwt;

import org.nsesa.diff.diffUtils.service.DiffService;
import org.nsesa.diff.diffUtils.service.model.ComplexDiffResult;
import org.nsesa.diff.diffUtils.service.model.DiffMethod;
import org.nsesa.diff.diffUtils.service.model.ThreeWayDiffContext;
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

    // style for BI diffing
    public static final String originalChangeTemplate = "<span class=\"highlight-diff\">{0}</span>";

    // style for complex diffing
    public static final String originalComplexChangeTemplate = "<span class=\"highlight-red\">{0}</span>";
    public static final String complexInsertTemplate = "<span class=\"highlight-ins\">{0}</span>";
    public static final String complexDeleteTemplate = "<span class=\"highlight-del\">{0}</span>";
    public static final String complexInsertNormalTemplate = "<span class=\"highlight-ins-normal\">{0}</span>";
    public static final String complexDeleteNormalTemplate = "<span class=\"highlight-del-normal\">{0}</span>";
    public static final String complexChangeTemplate = "<span class=\"highlight-change\">{0}</span>";

    private DiffService diffService;

    @Override
    public ArrayList<DiffResult> diff(final ArrayList<DiffRequest> diffRequests) {
        final ArrayList<DiffResult> results = new ArrayList<DiffResult>();
        for (final DiffRequest diffRequest : diffRequests) {

            final ThreeWayDiffContext diffContext = new ThreeWayDiffContext(originalChangeTemplate,
                    originalComplexChangeTemplate, complexInsertTemplate,
                    complexDeleteTemplate, complexChangeTemplate,
                    DiffMethod.valueOf(diffRequest.getDiffMethod().name()));

            final ComplexDiffResult complexDiffResult = diffService.complexDiff(
                    diffRequest.getOriginal(),
                    // if the EP style is selected, we use a slight different input
                    "epStyle".equalsIgnoreCase(diffRequest.getDiffStyle()) ? diffRequest.getAmendment() : diffRequest.getOriginal(),
                    diffRequest.getAmendment(),
                    diffContext);

            results.add(new DiffResult(
                    complexDiffResult.getTrackChangesOriginal(),
                    complexDiffResult.getTrackChangesAmendment(),
                    diffRequest.getDiffMethod()));
        }
        return results;
    }

    @Override
    public String getVersion() {
        return "ep-diffing-0.1";
    }

    public void setDiffService(DiffService diffService) {
        this.diffService = diffService;
    }
}
