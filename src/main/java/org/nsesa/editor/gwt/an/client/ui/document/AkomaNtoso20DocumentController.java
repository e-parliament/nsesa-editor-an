/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.HTML;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;
import org.nsesa.editor.gwt.an.client.AkomaNtoso20DocumentInjector;
import org.nsesa.editor.gwt.an.client.mode.ConsolidationMode;
import org.nsesa.editor.gwt.an.client.mode.DiffMode;
import org.nsesa.editor.gwt.an.client.mode.InlineEditingMode;
import org.nsesa.editor.gwt.an.client.ui.amendment.AkomaNtoso20AmendmentControllerUtil;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.amendment.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.client.event.document.DocumentModeStateChangedEvent;
import org.nsesa.editor.gwt.core.client.event.document.DocumentOverlayCompletedEvent;
import org.nsesa.editor.gwt.core.client.event.document.DocumentOverlayCompletedEventHandler;
import org.nsesa.editor.gwt.core.client.event.document.DocumentScrollToEvent;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentInjector;
import org.nsesa.editor.gwt.core.client.ui.overlay.Creator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.logging.Logger;

/**
 * Date: 10/01/13 11:23
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20DocumentController extends DocumentController {

    private static final Logger LOG = Logger.getLogger(AkomaNtoso20DocumentController.class.getName());

    private HandlerRegistration documentOverlayCompletedEventHandler;

    @Inject
    public AkomaNtoso20DocumentController(final ClientFactory clientFactory,
                                          final ServiceFactory serviceFactory,
                                          final OverlayFactory overlayFactory,
                                          final Locator locator,
                                          final Creator creator) {
        super(clientFactory, serviceFactory, overlayFactory, locator, creator);
        registerMode(ConsolidationMode.KEY, new ConsolidationMode(this, clientFactory) {
            @Override
            public boolean apply(final ActiveState state) {
                final OverlayWidget topVisibleAmenableWidget = getSourceFileController().getTopVisibleOverlayWidget();
                getSourceFileController().walk(new OverlayWidgetWalker.OverlayWidgetVisitor() {
                    @Override
                    public boolean visit(final OverlayWidget visited) {
                        if (visited.isAmended()) {
                            if (state.isActive()) {
                                // build up a new panel
                                final StringBuilder sb = new StringBuilder();
                                boolean addSplitter = false;
                                for (final AmendmentController amendmentController : visited.getAmendmentControllers()) {
                                    if (addSplitter) {
                                        sb.append(new HTML("<div style='width:100%;text-align:center;'><h2> -Or- </h2></div>"));
                                    }
                                    sb.append(AkomaNtoso20AmendmentControllerUtil.getAmendmentContentFromView(amendmentController));
                                    addSplitter = true;
                                }

                                final com.google.gwt.dom.client.Element amendmentsHolder = DOM.createSpan();
                                amendmentsHolder.setInnerHTML(sb.toString());
                                amendmentsHolder.setClassName(amendmentsHolder.getClassName() + " amendments consolidationCopy");
                                DOM.insertBefore(visited.getParentOverlayWidget().asWidget().getElement(), (Element) amendmentsHolder, visited.asWidget().getElement());
                                amendmentsHolder.getStyle().setColor("green");
                                visited.asWidget().setVisible(false);
                            } else {
                                // restore from the first amendment
                                visited.asWidget().setVisible(true);
                                final NodeList<Node> childNodes = visited.getParentOverlayWidget().asWidget().getElement().getChildNodes();
                                for (int i = 0; i < childNodes.getLength(); i++) {
                                    Node node = childNodes.getItem(i);
                                    if (Node.ELEMENT_NODE == node.getNodeType()) {
                                        Element el = node.cast();
                                        if (el.getClassName().contains("consolidationCopy")) {
                                            el.removeFromParent();
                                        }
                                    }
                                }
                            }

                        }
                        return true;
                    }
                });
                if (topVisibleAmenableWidget != null)
                    clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(topVisibleAmenableWidget.asWidget(), AkomaNtoso20DocumentController.this));
                return super.apply(state);
            }
        });

        registerMode(InlineEditingMode.KEY, new InlineEditingMode(this, clientFactory));
        registerMode(DiffMode.KEY, new DiffMode(this, clientFactory, serviceFactory));
        registerMode(ConsolidationMode.KEY, new ConsolidationMode(this, clientFactory));

        registerListeners();
    }

    private void registerListeners() {
        documentOverlayCompletedEventHandler = documentEventBus.addHandler(DocumentOverlayCompletedEvent.TYPE, new DocumentOverlayCompletedEventHandler() {
            @Override
            public void onEvent(DocumentOverlayCompletedEvent event) {
                applyState(DiffMode.KEY, new ActiveState(true));
            }
        });
    }

    @Override
    public DocumentInjector getInjector() {
        return GWT.create(AkomaNtoso20DocumentInjector.class);
    }

    @Override
    public void removeListeners() {
        super.removeListeners();
        documentOverlayCompletedEventHandler.removeHandler();
    }
}
