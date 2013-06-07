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
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentView;
import org.nsesa.editor.gwt.an.amendments.client.AmendmentDiffingManager;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.diffing.DiffingManager;
import org.nsesa.editor.gwt.core.client.event.NotificationEvent;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.mode.DocumentMode;
import org.nsesa.editor.gwt.core.client.mode.DocumentState;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.OverlayWidgetAware;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.shared.DiffStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 26/11/12 14:11
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class ColumnMode implements DocumentMode<ActiveState> {

    public static final String KEY = "column";

    private final DocumentController documentController;
    private final ClientFactory clientFactory;

    private ActiveState state = new ActiveState(false);

    public ColumnMode(DocumentController documentController, ClientFactory clientFactory) {
        this.documentController = documentController;
        this.clientFactory = clientFactory;
    }

    @Override
    public boolean apply(ActiveState state) {
        final List<AmendmentController> amendmentControllers = new ArrayList<AmendmentController>();
        if (state.isActive()) {
            // single column
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Single column-mode is now active."));
            documentController.getSourceFileController().walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.isAmended()) {
                        for (final OverlayWidgetAware t : visited.getOverlayWidgetAwareList()) {
                            if (t instanceof AmendmentController) {
                                AmendmentController amendmentController = (AmendmentController) t;
                                amendmentController.switchTemplate(AmendmentView.SINGLE, AmendmentView.SINGLE);
                                amendmentController.setDiffStyle(DiffStyle.TRACK_CHANGES);
                                amendmentControllers.add(amendmentController);
                            }
                        }
                    }
                    return true;
                }
            });
        } else {
            // two column
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Two column-mode is now active."));
            documentController.getSourceFileController().walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.isAmended()) {

                        for (final OverlayWidgetAware t : visited.getOverlayWidgetAwareList()) {
                            if (t instanceof AmendmentController) {
                                AmendmentController amendmentController = (AmendmentController) t;
                                amendmentController.switchTemplate(AmendmentView.DEFAULT, AmendmentView.DEFAULT);
                                amendmentController.setDiffStyle(DiffStyle.EP);
                                amendmentControllers.add(amendmentController);
                            }
                        }

                    }
                    return true;
                }
            }

            );
        }
        // renumber (just to make sure that the title is set correctly)
        documentController.getSourceFileController().renumberOverlayWidgetsAware();

        // rediff
        final DocumentMode<? extends DocumentState> diffMode = documentController.getMode(org.nsesa.editor.gwt.core.client.mode.DiffMode.KEY);
        if (diffMode != null) {
            final boolean diffingActive = ((org.nsesa.editor.gwt.core.client.mode.DiffMode) diffMode).getState().isActive();
            if (diffingActive) {
                final DiffingManager diffingManager = documentController.getDiffingManager();
                if (diffingManager instanceof AmendmentDiffingManager) {
                    ((AmendmentDiffingManager) diffingManager).diff(amendmentControllers.toArray(new AmendmentController[amendmentControllers.size()]));
                }
            }
        }

        this.state = state;
        return true;
    }


    @Override
    public ActiveState getState() {
        return state;
    }
}
