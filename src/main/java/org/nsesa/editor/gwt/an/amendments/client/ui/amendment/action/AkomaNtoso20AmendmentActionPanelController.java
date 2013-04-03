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
package org.nsesa.editor.gwt.an.amendments.client.ui.amendment.action;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.amendment.action.AmendmentActionPanelController;
import org.nsesa.editor.gwt.core.client.ui.amendment.action.AmendmentActionPanelView;
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

    private final PopupPanel popupPanel = new DecoratedPopupPanel(false, false) {
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
                                                      final CoreMessages coreMessages,
                                                      final Transformer transformer) {
        super(amendmentActionPanelView, coreMessages);
        this.transformer = transformer;
        this.popupPanel.setWidget(mainPanel);

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
                popupPanel.hide();
            }
        });

        final Anchor xmlExport = new Anchor("Export to XML");
        xmlExport.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final String xmlSerialized = transformer.transform(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()));

                AkomaNtoso20AmendmentActionPanelController.this.hide();

                final Element pre = DOM.createElement("pre");
                pre.setInnerText(xmlSerialized);
                //reset the content
                content.getElement().setInnerHTML("");
                content.getElement().appendChild(pre);

                popupPanel.center();
                popupPanel.show();
            }
        });
        addWidget(xmlExport);
    }
}
