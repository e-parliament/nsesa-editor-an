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
package org.nsesa.editor.gwt.an.amendments.client.ui.amendment.action;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.amendment.client.event.amendment.AmendmentContainerSaveEvent;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.action.AmendmentActionPanelController;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.action.AmendmentActionPanelView;
import org.nsesa.editor.gwt.compare.client.event.ShowComparePanelEvent;
import org.nsesa.editor.gwt.compare.client.ui.compare.ComparisonProvider;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.event.CriticalErrorEvent;
import org.nsesa.editor.gwt.core.client.ui.i18n.CoreMessages;
import org.nsesa.editor.gwt.core.shared.AmendmentContainerDTO;
import org.nsesa.editor.gwt.core.shared.RevisionDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 06/02/13 16:19
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentActionPanelController extends AmendmentActionPanelController {

    private final PopupPanel exportPopupPanel = new DecoratedPopupPanel(false, false) {
        {
            setGlassEnabled(true);
        }
    };
    private final FlowPanel mainPanel = new FlowPanel();
    private final HorizontalPanel buttonPanel = new HorizontalPanel();
    private final Button closeButton = new Button("Close");
    private final ScrollPanel scrollPanel = new ScrollPanel();
    private final HTML content = new HTML();

    @Inject
    public AkomaNtoso20AmendmentActionPanelController(final AmendmentActionPanelView amendmentActionPanelView,
                                                      final CoreMessages coreMessages) {
        super(amendmentActionPanelView, coreMessages);
        this.exportPopupPanel.setWidget(mainPanel);

        this.mainPanel.setHeight("600px");
        this.mainPanel.setWidth("800px");
        this.mainPanel.add(scrollPanel);
        buttonPanel.setWidth("800px");
        buttonPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        this.mainPanel.add(buttonPanel);
        buttonPanel.add(closeButton);
        this.scrollPanel.setHeight("570px");
        this.scrollPanel.setWidth("100%");
        this.scrollPanel.setWidget(content);
        this.content.setHeight("100%");
        this.content.setWidth("100%");

        closeButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                exportPopupPanel.hide();
            }
        });

        final Anchor history = new Anchor("History");
        history.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                final ServiceFactory serviceFactory = amendmentController.getDocumentController().getServiceFactory();
                final ClientFactory clientFactory = amendmentController.getDocumentController().getClientFactory();

                final ComparisonProvider comparisonProvider = new ComparisonProvider() {
                    @Override
                    public void getRevisionContent(final String revisionID, final AsyncCallback<String> asyncCallback) {
                        serviceFactory.getGwtAmendmentService().getAmendmentContainerRevision(clientFactory.getClientContext(), revisionID, new AsyncCallback<AmendmentContainerDTO>() {
                            @Override
                            public void onFailure(final Throwable caught) {
                                asyncCallback.onFailure(caught);
                            }

                            @Override
                            public void onSuccess(final AmendmentContainerDTO result) {
                                // wrap in a span to correct the rendering via amendment.css
                                final Element span = DOM.createSpan();
                                span.setInnerHTML(result.getBody());
                                final String body = "<div class='amendmentHolder'><div>" + span.getFirstChildElement() + "</div></div>";
                                asyncCallback.onSuccess(body);
                            }
                        });
                    }

                    @Override
                    public void getRevisions(final AsyncCallback<List<RevisionDTO>> asyncCallback) {
                        serviceFactory.getGwtAmendmentService().getRevisions(clientFactory.getClientContext(), amendmentController.getModel().getId(), new AsyncCallback<ArrayList<RevisionDTO>>() {
                            @Override
                            public void onFailure(final Throwable caught) {
                                asyncCallback.onFailure(caught);
                            }

                            @Override
                            public void onSuccess(final ArrayList<RevisionDTO> result) {
                                asyncCallback.onSuccess(result);
                            }
                        });
                    }

                    @Override
                    public void rollback(final String revisionID) {
                        serviceFactory.getGwtAmendmentService().getAmendmentContainerRevision(clientFactory.getClientContext(), revisionID, new AsyncCallback<AmendmentContainerDTO>() {
                            @Override
                            public void onFailure(Throwable caught) {
                                clientFactory.getEventBus().fireEvent(new CriticalErrorEvent("Could not rollback revision: " + caught.getMessage(), caught));
                            }

                            @Override
                            public void onSuccess(AmendmentContainerDTO result) {
                                // force an update of the revision ID to let the backend know we're aware of the latest version
                                result.setRevisionID(amendmentController.getModel().getRevisionID());
                                amendmentController.getDocumentController().getDocumentEventBus().fireEvent(new AmendmentContainerSaveEvent(result));
                                popupPanel.hide();
                            }
                        });
                    }
                };

                amendmentController.getDocumentController().getClientFactory().getEventBus().fireEvent(new ShowComparePanelEvent(amendmentController.getDocumentController(), comparisonProvider));
                popupPanel.hide();
            }
        });
//        TODO not finished yet (needs extraction of the amendment text).
        addSeparator();
        addWidget(history);

        final Anchor xmlExport = new Anchor("Export to XML");
        xmlExport.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final String url = GWT.getModuleBaseURL() + "download/amendment/xml/" + amendmentController.getModel().getId();
                Window.open(URL.encode(url), "download", "");
                popupPanel.hide();
            }
        });
        final Anchor pdfExport = new Anchor("Export to PDF");
        pdfExport.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final String url = GWT.getModuleBaseURL() + "download/amendment/pdf/" + amendmentController.getModel().getId();
                Window.open(URL.encode(url), "download", "");
                popupPanel.hide();
            }
        });
        final Anchor wordExport = new Anchor("Export to Word");
        wordExport.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final String url = GWT.getModuleBaseURL() + "download/amendment/word/" + amendmentController.getModel().getId();
                Window.open(URL.encode(url), "download", "");
                popupPanel.hide();
            }
        });
        final Anchor htmlExport = new Anchor("Export to HTML");
        htmlExport.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final String url = GWT.getModuleBaseURL() + "download/amendment/html/" + amendmentController.getModel().getId();
                Window.open(URL.encode(url), "download", "");
                popupPanel.hide();
            }
        });
        addSeparator();
        addWidget(xmlExport);
        addWidget(pdfExport);
        addWidget(wordExport);
        addWidget(htmlExport);

    }
}
