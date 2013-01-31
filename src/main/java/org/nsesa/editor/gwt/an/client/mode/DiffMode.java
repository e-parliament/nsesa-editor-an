package org.nsesa.editor.gwt.an.client.mode;

import com.google.gwt.user.client.rpc.AsyncCallback;
import org.nsesa.editor.gwt.an.client.ui.amendment.AkomaNtoso20AmendmentControllerUtil;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.amendment.AmendableWidgetWalker;
import org.nsesa.editor.gwt.core.client.event.CriticalErrorEvent;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.mode.DocumentMode;
import org.nsesa.editor.gwt.core.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.shared.DiffRequest;
import org.nsesa.editor.gwt.core.shared.DiffResult;
import org.nsesa.editor.gwt.editor.client.ui.document.DocumentController;

import java.util.ArrayList;

/**
 * Date: 26/11/12 14:11
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class DiffMode implements DocumentMode<ActiveState> {

    public static final String KEY = "diff";

    private final DocumentController documentController;
    private final ClientFactory clientFactory;
    private final ServiceFactory serviceFactory;

    private ActiveState activeState = new ActiveState(false);

    public DiffMode(DocumentController documentController, ClientFactory clientFactory, ServiceFactory serviceFactory) {
        this.documentController = documentController;
        this.clientFactory = clientFactory;
        this.serviceFactory = serviceFactory;
    }

    @Override
    public boolean apply(ActiveState state) {
        // TODO: actually change the diffing for the amendments ...
        if (state.isActive()) {
            documentController.getSourceFileController().walk(new AmendableWidgetWalker.AmendableVisitor() {
                @Override
                public boolean visit(AmendableWidget visited) {
                    if (visited.isAmended()) {
                        for (final AmendmentController amendmentController : visited.getAmendmentControllers()) {
                            ArrayList<DiffRequest> diffRequests = new ArrayList<DiffRequest>();
                            final String amendmentContentFromModel = AkomaNtoso20AmendmentControllerUtil.getAmendmentContentFromModel(amendmentController);
                            final String originalContentFromModel = AkomaNtoso20AmendmentControllerUtil.getOriginalContentFromModel(amendmentController);
                            diffRequests.add(new DiffRequest(originalContentFromModel, amendmentContentFromModel));
                            serviceFactory.getGwtDiffService().diff(diffRequests, new AsyncCallback<ArrayList<DiffResult>>() {
                                @Override
                                public void onFailure(Throwable caught) {
                                    documentController.getDocumentEventBus().fireEvent(new CriticalErrorEvent("Could not perform diffing ...", caught));
                                }

                                @Override
                                public void onSuccess(ArrayList<DiffResult> result) {
                                    AkomaNtoso20AmendmentControllerUtil.setOriginalContentOnViews(amendmentController, result.get(0).getOriginal());
                                    AkomaNtoso20AmendmentControllerUtil.setAmendmentContentOnViews(amendmentController, result.get(0).getAmendment());

                                }
                            });
                        }
                    }
                    return true;
                }
            });
        } else {
            documentController.getSourceFileController().walk(new AmendableWidgetWalker.AmendableVisitor() {
                @Override
                public boolean visit(AmendableWidget visited) {
                    if (visited.isAmended()) {
                        for (final AmendmentController amendmentController : visited.getAmendmentControllers()) {
                            AkomaNtoso20AmendmentControllerUtil.setOriginalContentOnViews(amendmentController, AkomaNtoso20AmendmentControllerUtil.getOriginalContentFromModel(amendmentController));
                            AkomaNtoso20AmendmentControllerUtil.setAmendmentContentOnViews(amendmentController, AkomaNtoso20AmendmentControllerUtil.getAmendmentContentFromModel(amendmentController));
                        }
                    }
                    return true;
                }
            });
        }
        this.activeState = state;
        return true;
    }

    @Override
    public ActiveState getState() {
        return activeState;
    }
}
