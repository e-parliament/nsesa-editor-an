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
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtoso20AmendmentControllerUtil;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.diffing.DefaultDiffingManager;
import org.nsesa.editor.gwt.core.client.event.CriticalErrorEvent;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.shared.DiffMethod;
import org.nsesa.editor.gwt.core.shared.DiffRequest;
import org.nsesa.editor.gwt.core.shared.DiffResult;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;

import java.util.ArrayList;

/**
 * Date: 07/01/13 17:21
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AmendmentDiffingManager extends DefaultDiffingManager {

    @Inject
    public AmendmentDiffingManager(final DocumentEventBus documentEventBus) {
        super(documentEventBus);
    }

    @Override
    public void diff(final DiffMethod method, final AmendmentController... amendmentControllers) {

        final ServiceFactory serviceFactory = documentController.getServiceFactory();
        final ClientFactory clientFactory = documentController.getClientFactory();

        final ArrayList<DiffRequest> diffRequests = new ArrayList<DiffRequest>();
        for (final AmendmentController amendmentController : amendmentControllers) {
            final String amendmentContentFromModel = AkomaNtoso20AmendmentControllerUtil.getAmendmentContentFromModel(amendmentController);
            final String originalContentFromModel = AkomaNtoso20AmendmentControllerUtil.getOriginalContentFromModel(amendmentController);

            diffRequests.add(new DiffRequest(originalContentFromModel, amendmentContentFromModel));
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
                    AkomaNtoso20AmendmentControllerUtil.setOriginalContentOnViews(amendmentController, complexDiffResult.getOriginal());
                    AkomaNtoso20AmendmentControllerUtil.setAmendmentContentOnViews(amendmentController, complexDiffResult.getAmendment());
                    index++;
                }
            }
        });
    }


}
