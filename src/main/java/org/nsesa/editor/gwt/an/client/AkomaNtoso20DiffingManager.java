package org.nsesa.editor.gwt.an.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.diffing.DefaultDiffingManager;
import org.nsesa.editor.gwt.core.client.event.CriticalErrorEvent;
import org.nsesa.editor.gwt.core.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.shared.DiffMethod;
import org.nsesa.editor.gwt.core.shared.DiffRequest;
import org.nsesa.editor.gwt.core.shared.DiffResult;
import org.nsesa.editor.gwt.editor.client.ui.document.DocumentEventBus;

import java.util.ArrayList;

/**
 * Date: 07/01/13 17:21
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20DiffingManager extends DefaultDiffingManager {

    @Inject
    public AkomaNtoso20DiffingManager(final ServiceFactory serviceFactory,
                                      final ClientFactory clientFactory,
                                      final DocumentEventBus documentEventBus) {
        super(serviceFactory, clientFactory, documentEventBus);
    }

    @Override
    public void diff(final DiffMethod method, final AmendmentController... amendmentControllers) {
        final ArrayList<DiffRequest> diffRequests = new ArrayList<DiffRequest>();
        for (final AmendmentController amendmentController : amendmentControllers) {
            diffRequests.add(new DiffRequest(amendmentController.getOriginalContentFromModel(),
                    amendmentController.getAmendmentContentFromModel()));
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
                    amendmentController.setOriginalContent(complexDiffResult.getOriginal());
                    amendmentController.setAmendmentContent(complexDiffResult.getAmendment());
                    index++;
                }
            }
        });
    }


}
