package org.nsesa.editor.gwt.an.server.service.gwt;

import ec.ep.diff4ep.service.AmendmentDiffingService;
import ec.ep.diff4ep.service.model.DiffMethod;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTDiffService;
import org.nsesa.editor.gwt.core.shared.ComplexDiffCommand;
import org.nsesa.editor.gwt.core.shared.ComplexDiffContext;
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

    private AmendmentDiffingService amendmentDiffingService;

    @Override
    public ArrayList<ComplexDiffResult> complexDiff(ArrayList<ComplexDiffCommand> commands) {
        List<ec.ep.diff4ep.service.model.ComplexDiffCommand> epComplexDiffCommands = new ArrayList<ec.ep.diff4ep.service.model.ComplexDiffCommand>();
        for (final ComplexDiffCommand complexDiffCommand : commands) {
            final ComplexDiffContext context = complexDiffCommand.getContext();
            final ec.ep.diff4ep.service.model.ComplexDiffContext epContext = new ec.ep.diff4ep.service.model.ComplexDiffContext(
                    context.getOriginalChangeTemplate(), context.getOriginalComplexChangeTemplate(), context.getComplexInsertTemplate(), context.getComplexDeleteTemplate(),
                    context.getComplexChangeTemplate(), DiffMethod.valueOf(context.getDiffMethod().toString())
            );

            ec.ep.diff4ep.service.model.ComplexDiffCommand epComplexDiffCommand = new ec.ep.diff4ep.service.model.ComplexDiffCommand(
                    complexDiffCommand.getOriginal(), complexDiffCommand.getModified(), complexDiffCommand.getOverrideModified(), epContext);
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
