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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document.sourcefile.actionbar;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.event.widget.OverlayWidgetDeleteEvent;
import org.nsesa.editor.gwt.core.client.event.widget.OverlayWidgetModifyEvent;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.ActionBarController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.ActionBarViewCss;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.create.ActionBarCreatePanelController;

/**
 * Date: 10/04/13 09:57
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class StaticActionBarController extends ActionBarController {

    @Inject
    public StaticActionBarController(final DocumentEventBus documentEventBus,
                                     final StaticActionBarViewImpl view,
                                     final ActionBarViewCss actionBarViewCss,
                                     final ActionBarCreatePanelController actionBarCreatePanelController) {
        super(documentEventBus, view, actionBarViewCss, actionBarCreatePanelController);
    }

    @Override
    protected void onScroll() {
        // doesn't do anything
    }

    @Override
    protected void onModifyClick(ClickEvent event) {
        event.stopPropagation();
        if (overlayWidget != null) {
            documentEventBus.fireEvent(new OverlayWidgetModifyEvent(overlayWidget));
        }
    }

    @Override
    protected void onDeleteClick(ClickEvent event) {
        event.stopPropagation();
        if (overlayWidget != null) {
            documentEventBus.fireEvent(new OverlayWidgetDeleteEvent(overlayWidget));
        }
    }


    @Override
    public void adaptPosition(Widget container) {

        if (overlayWidget != null && overlayWidget.getParentOverlayWidget() != null) {

            if (getView().asWidget().getParent() != null) getView().asWidget().removeFromParent();

            DOM.insertBefore(overlayWidget.getParentOverlayWidget().asWidget().getElement(), getView().asWidget().getElement(), overlayWidget.asWidget().getElement());

            if (!view.asWidget().isAttached()) {
                view.attach();
            }

            getView().asWidget().getElement().getStyle().setPosition(Style.Position.STATIC);

            view.asWidget().setVisible(true);
        }
    }
}
