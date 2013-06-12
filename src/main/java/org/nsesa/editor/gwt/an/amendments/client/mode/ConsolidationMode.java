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

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.Style;
import com.google.web.bindery.event.shared.HandlerRegistration;
import org.nsesa.editor.gwt.amendment.client.event.amendment.AmendmentContainerInjectedEvent;
import org.nsesa.editor.gwt.amendment.client.event.amendment.AmendmentContainerInjectedEventHandler;
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

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 26/11/12 14:11
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class ConsolidationMode implements DocumentMode<ActiveState> {

    public static final String KEY = "consolidation";

    private final DocumentController documentController;
    private final ClientFactory clientFactory;
    private HandlerRegistration amendmentContainerInjectedHandlerRegistration;

    private ActiveState state = new ActiveState(false);

    public ConsolidationMode(DocumentController documentController, ClientFactory clientFactory) {
        this.documentController = documentController;
        this.clientFactory = clientFactory;


    }

    @Override
    public void registerListeners() {
        amendmentContainerInjectedHandlerRegistration = documentController.getDocumentEventBus().addHandler(AmendmentContainerInjectedEvent.TYPE, new AmendmentContainerInjectedEventHandler() {
            @Override
            public void onEvent(AmendmentContainerInjectedEvent event) {
                event.getAmendmentController().switchTemplate(AmendmentView.CONSOLIDATION, null);
            }
        });
    }

    @Override
    public void removeListeners() {
        amendmentContainerInjectedHandlerRegistration.removeHandler();
    }

    @Override
    public boolean apply(ActiveState state) {
        final List<AmendmentController> amendmentControllers = new ArrayList<AmendmentController>();
        if (state.isActive()) {
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Consolidation view is now active."));
            documentController.getSourceFileController().walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.isAmended()) {
                        for (final OverlayWidgetAware t : visited.getOverlayWidgetAwareList()) {
                            if (t instanceof AmendmentController) {
                                AmendmentController amendmentController = (AmendmentController) t;
                                amendmentController.switchTemplate(AmendmentView.CONSOLIDATION, null);
                                amendmentControllers.add(amendmentController);
                            }
                        }

                        for (int i = 0; i < visited.asWidget().getElement().getChildNodes().getLength(); i++) {
                            final Node node = visited.asWidget().getElement().getChild(i);
                            if (node.getNodeType() == Node.ELEMENT_NODE) {
                                Element childElement = Element.as(node);
                                if (childElement != visited.getAmendmentControllersHolderElement().getElement()) {
                                    final String display = childElement.getStyle().getDisplay();
                                    childElement.setAttribute("display-temp", display);
                                    childElement.getStyle().setDisplay(Style.Display.NONE);
                                }
                            }
                        }
                    }
                    return true;
                }
            });
        } else {
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Consolidation view is now inactive."));
            documentController.getSourceFileController().walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.isAmended()) {

                        for (final OverlayWidgetAware t : visited.getOverlayWidgetAwareList()) {
                            if (t instanceof AmendmentController) {
                                AmendmentController amendmentController = (AmendmentController) t;
                                amendmentController.resetTemplate();
                                amendmentControllers.add(amendmentController);
                            }
                        }
                        for (int i = 0; i < visited.asWidget().getElement().getChildNodes().getLength(); i++) {
                            final Node node = visited.asWidget().getElement().getChild(i);
                            if (node.getNodeType() == Node.ELEMENT_NODE) {
                                Element childElement = Element.as(node);
                                if (childElement != visited.getAmendmentControllersHolderElement().getElement()) {
                                    final String previousDisplayValue = childElement.getAttribute("display-temp");
                                    if (previousDisplayValue != null && !"".equalsIgnoreCase(previousDisplayValue.trim())) {
                                        childElement.getStyle().setDisplay(Style.Display.valueOf(previousDisplayValue.toUpperCase()));
                                        childElement.removeAttribute("display-temp");
                                    } else {
                                        childElement.getStyle().setDisplay(Style.Display.INLINE);
                                    }
                                }
                            }
                        }

                    }
                    return true;
                }
            }

            );
        }
        documentController.getSourceFileController().renumberOverlayWidgetsAware();
        this.state = state;

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
        return true;
    }


    @Override
    public ActiveState getState() {
        return state;
    }
}
