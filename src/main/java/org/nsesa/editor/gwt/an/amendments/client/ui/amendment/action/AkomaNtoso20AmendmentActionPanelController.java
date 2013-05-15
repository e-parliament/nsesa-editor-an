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
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.action.AmendmentActionPanelController;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.action.AmendmentActionPanelView;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.core.client.ui.i18n.CoreMessages;
import org.nsesa.editor.gwt.core.client.ui.overlay.Transformer;

/**
 * Date: 06/02/13 16:19
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentActionPanelController extends AmendmentActionPanelController {

    private final Transformer transformer;

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
    public AkomaNtoso20AmendmentActionPanelController(AmendmentActionPanelView amendmentActionPanelView,
                                                      final DocumentEventBus documentEventBus,
                                                      final CoreMessages coreMessages,
                                                      final Transformer transformer) {
        super(amendmentActionPanelView, documentEventBus, coreMessages);
        this.transformer = transformer;
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

        final Anchor xmlExport = new Anchor("Export to XML");
        xmlExport.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final String url = GWT.getModuleBaseURL() + "download/amendment/xml/" + amendmentController.getModel().getId();
                Window.open(URL.encode(url), "download", "");
                popupPanel.hide();
            };
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
