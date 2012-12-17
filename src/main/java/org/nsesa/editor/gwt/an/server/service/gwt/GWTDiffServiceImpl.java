package org.nsesa.editor.gwt.an.server.service.gwt;

import ec.ep.diff4ep.service.AmendmentDiffingService;
import ec.ep.diff4ep.service.model.ComplexDiffCommand;
import ec.ep.diff4ep.service.model.ComplexDiffContext;
import ec.ep.diff4ep.service.model.ComplexDiffResult;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTDiffService;
import org.nsesa.editor.gwt.core.shared.DiffMethod;
import org.nsesa.editor.gwt.core.shared.DiffRequest;
import org.nsesa.editor.gwt.core.shared.DiffResult;

import java.util.ArrayList;
import java.util.List;

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

    private AmendmentDiffingService amendmentDiffingService;

    @Override
    public ArrayList<DiffResult> diff(final ArrayList<DiffRequest> diffRequests) {

        // NOTE: we don't actually do any diffing in here .. replace it with a diffing of your choice.
        final ArrayList<DiffResult> results = new ArrayList<DiffResult>();
        final ArrayList<ComplexDiffCommand> commands = new ArrayList<ComplexDiffCommand>();
        for (final DiffRequest diffRequest : diffRequests) {
            final ComplexDiffCommand command = new ComplexDiffCommand(diffRequest.getOriginal(),
                    diffRequest.getAmendment(), diffRequest.getAmendment(), getDiffContext(diffRequest.getDiffMethod()));
            commands.add(command);
        }
        List<ComplexDiffResult> complexDiffResults = amendmentDiffingService.complexDiff(commands);
        for (final ComplexDiffResult complexDiffResult : complexDiffResults) {
            results.add(new DiffResult(complexDiffResult.getTrackChangesOriginal(), complexDiffResult.getTrackChangesAmendment(), diffRequests.get(complexDiffResults.indexOf(complexDiffResult)).getDiffMethod()));
        }
        return results;
    }

    @Override
    public String getVersion() {
        return "no-diffing-0.0";
    }

    public void setAmendmentDiffingService(AmendmentDiffingService amendmentDiffingService) {
        this.amendmentDiffingService = amendmentDiffingService;
    }

    public ComplexDiffContext getDiffContext(DiffMethod method) {
        return new ComplexDiffContext( originalChangeTemplate, originalComplexChangeTemplate, complexInsertTemplate,
                complexDeleteTemplate, complexChangeTemplate,
                ec.ep.diff4ep.service.model.DiffMethod.valueOf(method.name()));
    }
}
