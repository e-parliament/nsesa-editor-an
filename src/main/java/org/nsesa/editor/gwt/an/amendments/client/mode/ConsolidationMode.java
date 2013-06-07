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
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentView;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.event.NotificationEvent;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.mode.DocumentMode;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.OverlayWidgetAware;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetWalker;

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

    private ActiveState state = new ActiveState(false);

    public ConsolidationMode(DocumentController documentController, ClientFactory clientFactory) {
        this.documentController = documentController;
        this.clientFactory = clientFactory;
    }

    @Override
    public boolean apply(ActiveState state) {
        if (state.isActive()) {
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Consolidation view is now active."));
            documentController.getSourceFileController().walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.isAmended()) {
                        for (final OverlayWidgetAware t : visited.getOverlayWidgetAwareList()) {
                            if (t instanceof AmendmentController) {
                                AmendmentController amendmentController = (AmendmentController) t;
                                amendmentController.switchTemplate(AmendmentView.CONSOLIDATION, AmendmentView.DEFAULT);
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
                                amendmentController.switchTemplate(AmendmentView.DEFAULT, AmendmentView.DEFAULT);
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
        return true;
    }


    @Override
    public ActiveState getState() {
        return state;
    }
}
