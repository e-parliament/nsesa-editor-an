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
package org.nsesa.editor.gwt.an.amendments.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtosoAmendmentControllerUtil;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.diffing.DiffingManager;
import org.nsesa.editor.gwt.core.client.event.CriticalErrorEvent;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.shared.DiffRequest;
import org.nsesa.editor.gwt.core.shared.DiffResult;

import java.util.ArrayList;

/**
 * Date: 07/01/13 17:21
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AmendmentDiffingManager implements DiffingManager<AmendmentController> {

    /**
     * Reference to the parent document controller.
     */
    protected DocumentController documentController;

    /**
     * Reference to the parent document event bus.
     */
    protected final DocumentEventBus documentEventBus;

    @Inject
    public AmendmentDiffingManager(final DocumentEventBus documentEventBus) {
        this.documentEventBus = documentEventBus;
    }

    @Override
    public void diff(final AmendmentController... amendmentControllers) {

        final ServiceFactory serviceFactory = documentController.getServiceFactory();
        final ClientFactory clientFactory = documentController.getClientFactory();

        final ArrayList<DiffRequest> diffRequests = new ArrayList<DiffRequest>();
        for (final AmendmentController amendmentController : amendmentControllers) {
            final OverlayWidget amendmentContentFromModel1 = AkomaNtosoAmendmentControllerUtil.getAmendmentContentFromModel(amendmentController);
            final String amendmentContentFromModel = amendmentContentFromModel1.getInnerHTML();
            final OverlayWidget contentFromModel = AkomaNtosoAmendmentControllerUtil.getOriginalContentFromModel(amendmentController);
            final String originalContentFromModel = contentFromModel.getInnerHTML();

            diffRequests.add(new DiffRequest(originalContentFromModel, amendmentContentFromModel,
                    amendmentController.getDiffMethod(), amendmentController.getDiffStyle()));
        }

        // request diffing from the backend service
        serviceFactory.getGwtDiffService().diff(diffRequests, new AsyncCallback<ArrayList<DiffResult>>() {
            @Override
            public void onFailure(Throwable caught) {
                clientFactory.getEventBus().fireEvent(new CriticalErrorEvent("Could not perform diffing.", caught));
            }

            @Override
            public void onSuccess(ArrayList<DiffResult> result) {
                int index = 0;
                for (final DiffResult complexDiffResult : result) {
                    final AmendmentController amendmentController = amendmentControllers[index];
                    AkomaNtosoAmendmentControllerUtil.setOriginalContentOnViews(amendmentController, complexDiffResult.getOriginal());
                    AkomaNtosoAmendmentControllerUtil.setAmendmentContentOnViews(amendmentController, complexDiffResult.getAmendment());
                    index++;
                }
            }
        });
    }

    @Override
    public void setDocumentController(DocumentController documentController) {
        this.documentController = documentController;
    }
}
