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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document.numbering;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.core.client.event.widget.OverlayWidgetFormatEvent;
import org.nsesa.editor.gwt.core.client.event.widget.OverlayWidgetNumberingTypeEvent;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Format;
import org.nsesa.editor.gwt.core.client.ui.overlay.NumberingType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.logging.Logger;

/**
 * Date: 05/02/13 09:32
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
public class NumberingController {

    private static final Logger LOG = Logger.getLogger(NumberingController.class.getName());

    final NumberingView view;

    private OverlayWidget overlayWidget;

    private DocumentController documentController;

    @Inject
    public NumberingController(NumberingView view) {
        this.view = view;
        this.view.getNumberingTypePanel().clear();
        for (final NumberingType numberingType : NumberingType.values()) {
            Anchor anchor = new Anchor(numberingType.name());
            anchor.getElement().getStyle().setColor("#fff");
            anchor.addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    documentController.getDocumentEventBus().fireEvent(new OverlayWidgetNumberingTypeEvent(overlayWidget, numberingType));
                }
            });
            this.view.getNumberingTypePanel().add(anchor);
        }
        this.view.getFormatPanel().clear();
        for (final Format format : Format.values()) {
            Anchor anchor = new Anchor(format.name());
            anchor.getElement().getStyle().setColor("#fff");
            anchor.addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    documentController.getDocumentEventBus().fireEvent(new OverlayWidgetFormatEvent(overlayWidget, format));
                }
            });
            this.view.getFormatPanel().add(anchor);
        }
    }

    public NumberingView getView() {
        return view;
    }

    public void setDocumentController(DocumentController documentController) {
        this.documentController = documentController;
    }

    public void setOverlayWidget(OverlayWidget overlayWidget) {
        this.overlayWidget = overlayWidget;
    }
}
