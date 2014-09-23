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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document.path;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.AkomaNtosoUtil;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.DraftingDocumentController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.path.replace.ReplaceController;
import org.nsesa.editor.gwt.core.client.event.document.DocumentScrollToEvent;
import org.nsesa.editor.gwt.core.client.event.widget.OverlayWidgetSelectEvent;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.logging.Logger;

/**
 * Date: 05/02/13 09:32
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
public class PathController {

    private static final Logger LOG = Logger.getLogger(PathController.class.getName());

    private final PathView view;

    private final ReplaceController replaceController;

    private final PopupPanel popupPanel = new PopupPanel(true, false);

    private DocumentController documentController;

    private boolean oneSecondPassed;

    private Timer clickTimeoutTimer;

    @Inject
    public PathController(PathView view, ReplaceController replaceController) {
        this.view = view;
        this.replaceController = replaceController;
    }

    public void setOverlayWidget(final OverlayWidget overlayWidget) {
        final HorizontalPanel pathPanel = new HorizontalPanel();

        for (final OverlayWidget parent : overlayWidget.getParentOverlayWidgets()) {
            pathPanel.add(createAnchor(parent));
            pathPanel.add(new HTML("&raquo;"));
        }
        pathPanel.add(createAnchor(overlayWidget));

        view.setPath(pathPanel);
    }

    private Anchor createAnchor(final OverlayWidget overlayWidget) {
        final Anchor anchor = new Anchor();
        final String type = overlayWidget.getType();
        if (AkomaNtosoUtil.representsBlock(overlayWidget) || AkomaNtosoUtil.representsContainer(overlayWidget)) {
            anchor.setText("[" + type + "]");
        }
        else {
            anchor.setText(type);
        }
        anchor.getElement().getStyle().setMargin(10, Style.Unit.PX);
        anchor.getElement().getStyle().setColor("#fff");
        anchor.getElement().getStyle().setCursor(Style.Cursor.POINTER);
        addHandlers(anchor, overlayWidget);
        return anchor;
    }

    private void addHandlers(final Anchor anchor, final OverlayWidget parent) {
        anchor.addMouseDownHandler(new MouseDownHandler() {
            @Override
            public void onMouseDown(MouseDownEvent event) {
                oneSecondPassed = false;
                clickTimeoutTimer = new Timer() {
                    @Override
                    public void run() {
                        oneSecondPassed = true;
                        LOG.info("One second passed - showing change panel instead.");
                        if (parent.getParentOverlayWidget() != null) {
                            replaceController.setDocumentController(documentController);
                            replaceController.setOverlayWidget(parent);
                            replaceController.setListener(new ReplaceController.Listener() {
                                @Override
                                public void onClick(OverlayWidget toReplace, OverlayWidget replacement) {
                                    final Element element = toReplace.getOverlayElement();

                                    // TODO: check if this is enough
                                    element.setAttribute("type", replacement.getType());
                                    element.setAttribute("class",
                                            element.getAttribute("class").replace(toReplace.getType(), replacement.getType()));
                                    documentController.getClientFactory().getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                                        @Override
                                        public void execute() {
                                            ((DraftingDocumentController) documentController).overlay();
                                        }
                                    });
                                    popupPanel.hide();
                                }
                            });
                            popupPanel.setWidget(replaceController.getView());
                            popupPanel.show();
                            popupPanel.setPopupPosition(anchor.getAbsoluteLeft(), anchor.getAbsoluteTop() - replaceController.getView().asWidget().getOffsetHeight());
                        }
                    }
                };
                clickTimeoutTimer.schedule(500);
            }
        });
        anchor.addMouseUpHandler(new MouseUpHandler() {
            @Override
            public void onMouseUp(MouseUpEvent event) {
                clickTimeoutTimer.cancel();
                if (!oneSecondPassed) {
                    LOG.info("Normal click - change selection and scroll to.");
                    documentController.getClientFactory().getEventBus().fireEvent(
                            new DocumentScrollToEvent(parent.asWidget(), documentController, true, 150));
                    documentController.getDocumentEventBus().fireEvent(
                            new OverlayWidgetSelectEvent(parent, documentController));
                }
            }
        });
    }

    public PathView getView() {
        return view;
    }

    public void setDocumentController(final DocumentController documentController) {
        this.documentController = documentController;
    }
}
