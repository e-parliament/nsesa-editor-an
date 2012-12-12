package org.nsesa.editor.gwt.an.server.service.gwt;

import ec.ep.diff4ep.service.AmendmentDiffingService;
import ec.ep.diff4ep.service.model.ComplexDiffContext;
import ec.ep.diff4ep.service.model.DiffMethod;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTDiffService;
import org.nsesa.editor.gwt.core.shared.ComplexDiffCommand;
import org.nsesa.editor.gwt.core.shared.ComplexDiffResult;

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
    public static final String originalChangeTemplate = "<span class=\"widget change highlight-diff\">{0}</span>";

    // style for complex diffing
    public static final String originalComplexChangeTemplate = "<span class=\"widget change highlight-red\">{0}</span>";
    public static final String complexInsertTemplate = "<span class=\"widget change highlight-ins\">{0}</span>";
    public static final String complexDeleteTemplate = "<span class=\"widget change highlight-del\">{0}</span>";
    public static final String complexInsertNormalTemplate = "<span class=\"widget change highlight-ins-normal\">{0}</span>";
    public static final String complexDeleteNormalTemplate = "<span class=\"widget change highlight-del-normal\">{0}</span>";
    public static final String complexChangeTemplate = "<span class=\"widget change highlight-change\">{0}</span>";

    private AmendmentDiffingService amendmentDiffingService;

    @Override
    public ArrayList<ComplexDiffResult> complexDiff(ArrayList<ComplexDiffCommand> commands) {
        List<ec.ep.diff4ep.service.model.ComplexDiffCommand> epComplexDiffCommands = new ArrayList<ec.ep.diff4ep.service.model.ComplexDiffCommand>();
        for (final ComplexDiffCommand complexDiffCommand : commands) {
            ec.ep.diff4ep.service.model.ComplexDiffCommand epComplexDiffCommand = new ec.ep.diff4ep.service.model.ComplexDiffCommand(
                    complexDiffCommand.getOriginal(), complexDiffCommand.getModified(), complexDiffCommand.getOverrideModified(), new ComplexDiffContext(originalChangeTemplate, originalComplexChangeTemplate, complexInsertTemplate, complexDeleteTemplate, complexChangeTemplate, DiffMethod.WORD));
            epComplexDiffCommands.add(epComplexDiffCommand);
        }
        final List<ec.ep.diff4ep.service.model.ComplexDiffResult> epComplexDiffResults = amendmentDiffingService.complexDiff(epComplexDiffCommands);

        final ArrayList<ComplexDiffResult> diffResults = new ArrayList<ComplexDiffResult>();
        for (ec.ep.diff4ep.service.model.ComplexDiffResult epComplexDiffResult : epComplexDiffResults) {
            ComplexDiffResult result = new ComplexDiffResult(
                    epComplexDiffResult.getOriginal(),
                    epComplexDiffResult.getAmendment(),
                    epComplexDiffResult.getTrackChangesOriginal(),
                    epComplexDiffResult.getTrackChangesAmendment());
            diffResults.add(result);
        }
        return diffResults;
    }

    @Override
    public String getVersion() {
        return "test-0.0";
    }

    public void setAmendmentDiffingService(AmendmentDiffingService amendmentDiffingService) {
        this.amendmentDiffingService = amendmentDiffingService;
    }
}
