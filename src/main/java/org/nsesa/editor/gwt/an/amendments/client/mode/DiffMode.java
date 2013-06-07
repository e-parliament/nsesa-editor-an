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
package org.nsesa.editor.gwt.an.amendments.client.mode;

import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.an.amendments.client.AmendmentDiffingManager;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtoso20AmendmentControllerUtil;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.diffing.DiffingManager;
import org.nsesa.editor.gwt.core.client.event.NotificationEvent;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.OverlayWidgetAware;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetWalker;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 26/11/12 14:11
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class DiffMode implements org.nsesa.editor.gwt.core.client.mode.DiffMode {

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
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Diffing is now active."));

            final List<AmendmentController> amendmentControllers = new ArrayList<AmendmentController>();

            documentController.getSourceFileController().walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.isAmended()) {
                        for (final OverlayWidgetAware temp : visited.getOverlayWidgetAwareList()) {
                            if (temp instanceof AmendmentController) {
                                final AmendmentController amendmentController = (AmendmentController) temp;
                                amendmentControllers.add(amendmentController);
                            }
                        }
                    }
                    return true;
                }
            });
            final DiffingManager diffingManager = documentController.getDiffingManager();
            if (diffingManager instanceof AmendmentDiffingManager) {
                ((AmendmentDiffingManager) diffingManager).diff(amendmentControllers.toArray(new AmendmentController[amendmentControllers.size()]));
            }
        } else {
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Diffing is now inactive."));
            documentController.getSourceFileController().walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.isAmended()) {
                        for (final OverlayWidgetAware temp : visited.getOverlayWidgetAwareList()) {
                            if (temp instanceof AmendmentController) {
                                final AmendmentController amendmentController = (AmendmentController) temp;
                                AkomaNtoso20AmendmentControllerUtil.setOriginalContentOnViews(amendmentController, AkomaNtoso20AmendmentControllerUtil.getOriginalContentFromModel(amendmentController));
                                AkomaNtoso20AmendmentControllerUtil.setAmendmentContentOnViews(amendmentController, AkomaNtoso20AmendmentControllerUtil.getAmendmentContentFromModel(amendmentController));
                            }
                        }
                    }
                    return true;
                }
            }

            );
        }
        this.activeState = state;
        return true;
    }

    @Override
    public ActiveState getState() {
        return activeState;
    }
}
