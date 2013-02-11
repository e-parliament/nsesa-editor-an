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
package org.nsesa.editor.gwt.an.client.ui.amendment.action;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.ui.amendment.action.AmendmentActionPanelController;
import org.nsesa.editor.gwt.core.client.ui.amendment.action.AmendmentActionPanelView;
import org.nsesa.editor.gwt.core.client.ui.overlay.Transformer;

/**
 * Date: 06/02/13 16:19
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentActionPanelController extends AmendmentActionPanelController {

    private final Transformer transformer;

    private final PopupPanel popupPanel = new DecoratedPopupPanel(true, false) {
        {
            setGlassEnabled(true);
        }
    };
    private final FlowPanel mainPanel = new FlowPanel();
    private final ScrollPanel scrollPanel = new ScrollPanel();
    private final HTML content = new HTML();

    @Inject
    public AkomaNtoso20AmendmentActionPanelController(ClientFactory clientFactory, ServiceFactory serviceFactory, AmendmentActionPanelView amendmentActionPanelView, final Transformer transformer) {
        super(clientFactory, serviceFactory, amendmentActionPanelView);
        this.transformer = transformer;
        this.popupPanel.setWidget(mainPanel);

        this.mainPanel.setHeight("600px");
        this.mainPanel.setWidth("800px");
        this.mainPanel.add(scrollPanel);
        this.scrollPanel.setHeight("100%");
        this.scrollPanel.setWidth("100%");
        this.scrollPanel.setWidget(content);
        this.content.setHeight("100%");
        this.content.setWidth("100%");

        final Anchor xmlExport = new Anchor("Export to XML");
        xmlExport.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final String xmlSerialized = transformer.transform(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()));

                final Element pre = DOM.createElement("pre");
                pre.setInnerText(xmlSerialized);
                content.getElement().appendChild(pre);

                popupPanel.center();
                popupPanel.show();
            }
        });
        addWidget(xmlExport);
    }
}
