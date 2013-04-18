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
package org.nsesa.editor.gwt.an.common.server.service.gwt;

import org.nsesa.diff.diffUtils.service.DiffService;
import org.nsesa.diff.diffUtils.service.model.ComplexDiffResult;
import org.nsesa.diff.diffUtils.service.model.DiffMethod;
import org.nsesa.diff.diffUtils.service.model.ThreeWayDiffContext;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTDiffService;
import org.nsesa.editor.gwt.core.shared.DiffRequest;
import org.nsesa.editor.gwt.core.shared.DiffResult;
import org.nsesa.editor.gwt.core.shared.DiffStyle;

import java.util.ArrayList;

/**
 * Date: 24/06/12 19:57
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class GWTDiffServiceImpl extends SpringRemoteServiceServlet implements GWTDiffService {

    // style for BI diffing
    public static final String originalChangeTemplate = "<span class=\"widget change highlight-diff\" type=\"change\" ns=\"http://www.akomantoso.org/2.0\">{0}</span>";

    // style for complex diffing
    public static final String originalComplexChangeTemplate = "<span class=\"widget change highlight-red\" type=\"change\" ns=\"http://www.akomantoso.org/2.0\">{0}</span>";
    public static final String complexInsertTemplate = "<span class=\"widget change highlight-ins\" type=\"change\" ns=\"http://www.akomantoso.org/2.0\">{0}</span>";
    public static final String complexDeleteTemplate = "<span class=\"widget change highlight-del\" type=\"change\" ns=\"http://www.akomantoso.org/2.0\">{0}</span>";
    public static final String complexInsertNormalTemplate = "<span class=\"widget change highlight-ins-normal\" type=\"change\" ns=\"http://www.akomantoso.org/2.0\">{0}</span>";
    public static final String complexDeleteNormalTemplate = "<span class=\"widget change highlight-del-normal\" type=\"change\" ns=\"http://www.akomantoso.org/2.0\">{0}</span>";
    public static final String complexChangeTemplate = "<span class=\"widget change highlight-change\" type=\"change\" ns=\"http://www.akomantoso.org/2.0\">{0}</span>";

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
                    DiffStyle.EP == diffRequest.getDiffStyle() ? diffRequest.getAmendment() : diffRequest.getOriginal(),
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
    public DiffResult diff(DiffRequest diffRequest) {
        final ThreeWayDiffContext diffContext = new ThreeWayDiffContext(originalChangeTemplate,
                originalComplexChangeTemplate, complexInsertTemplate,
                complexDeleteTemplate, complexChangeTemplate,
                DiffMethod.valueOf(diffRequest.getDiffMethod().name()));

        final ComplexDiffResult complexDiffResult = diffService.complexDiff(
                diffRequest.getOriginal(),
                // if the EP style is selected, we use a slight different input
                DiffStyle.EP == diffRequest.getDiffStyle() ? diffRequest.getAmendment() : diffRequest.getOriginal(),
                diffRequest.getAmendment(),
                diffContext);

        return new DiffResult(
                complexDiffResult.getTrackChangesOriginal(),
                complexDiffResult.getTrackChangesAmendment(),
                diffRequest.getDiffMethod());
    }

    @Override
    public String getVersion() {
        return "ep-diffing-0.1";
    }

    public void setDiffService(DiffService diffService) {
        this.diffService = diffService;
    }
}
