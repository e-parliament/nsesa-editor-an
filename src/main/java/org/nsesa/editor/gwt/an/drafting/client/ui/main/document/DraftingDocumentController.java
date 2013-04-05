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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.HierarchyComplexType;
import org.nsesa.editor.gwt.an.drafting.client.event.DocumentToggleStructureEvent;
import org.nsesa.editor.gwt.an.drafting.client.event.DocumentToggleStructureEventHandler;
import org.nsesa.editor.gwt.an.drafting.client.mode.StructureViewMode;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.outline.OutlineController;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.event.*;
import org.nsesa.editor.gwt.core.client.event.document.DocumentScrollToEvent;
import org.nsesa.editor.gwt.core.client.event.document.DocumentScrollToEventHandler;
import org.nsesa.editor.gwt.core.client.event.widget.OverlayWidgetSelectEvent;
import org.nsesa.editor.gwt.core.client.event.widget.OverlayWidgetSelectEventHandler;
import org.nsesa.editor.gwt.core.client.keyboard.KeyboardListener;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.ui.document.DefaultDocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentInjector;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.create.ActionBarCreatePanelController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Creator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetSelector;
import org.nsesa.editor.gwt.core.shared.DocumentDTO;

import java.util.List;
import java.util.logging.Logger;

/**
 * Date: 05/02/13 09:32
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class DraftingDocumentController extends DefaultDocumentController {

    private static final Logger LOG = Logger.getLogger(DraftingDocumentController.class.getName());

    private OutlineController outlineController;

    // popup with available child controllers
    private ActionBarCreatePanelController actionBarCreatePanelController;

    private PopupPanel actionBarCreatePanelControllerPopup = new PopupPanel();

    // ------------- event handler registration -----------
    private HandlerRegistration documentToggleStructureEventHandler;
    private HandlerRegistration bootstrapEventHandlerRegistration;
    private HandlerRegistration switchTabEventHandlerRegistration;
    private HandlerRegistration notificationEventHandlerRegistration;
    private HandlerRegistration confirmationEventHandlerRegistration;
    private HandlerRegistration criticalEventHandlerRegistration;
    private HandlerRegistration overlayWidgetSelectEventHandlerRegistration;
    private HandlerRegistration resizeEventHandlerRegistration;
    private HandlerRegistration documentScrollToEventHandlerRegistration;
    private HandlerRegistration keyComboHandlerRegistration;

    // ----------------- keyboard shortcuts ---------------------
    private KeyboardListener.KeyCombo ctrlEnter = new KeyboardListener.KeyCombo(false, true, KeyCodes.KEY_ENTER);
    private KeyboardListener.KeyCombo escape = new KeyboardListener.KeyCombo(false, false, KeyCodes.KEY_ESCAPE);

    private KeyboardListener.KeyCombo upArrow = new KeyboardListener.KeyCombo(false, false, KeyCodes.KEY_UP);
    private KeyboardListener.KeyCombo downArrow = new KeyboardListener.KeyCombo(false, false, KeyCodes.KEY_DOWN);

    @Inject
    public DraftingDocumentController(final ClientFactory clientFactory,
                                      final ServiceFactory serviceFactory,
                                      final OverlayFactory overlayFactory,
                                      final Locator locator,
                                      final Creator creator) {
        super(clientFactory, serviceFactory, overlayFactory, locator, creator);
    }

    @Override
    public void registerKeyCombos() {
        super.registerKeyCombos();
        clientFactory.getKeyboardListener().register(ctrlEnter);
        clientFactory.getKeyboardListener().register(escape);
        clientFactory.getKeyboardListener().register(upArrow);
        clientFactory.getKeyboardListener().register(downArrow);
    }

    @Override
    public void registerModes() {
        super.registerModes();
        registerMode(StructureViewMode.KEY, new StructureViewMode(this));
    }

    @Override
    public void registerListeners() {

        documentScrollToEventHandlerRegistration = clientFactory.getEventBus().addHandler(DocumentScrollToEvent.TYPE, new DocumentScrollToEventHandler() {
            @Override
            public void onEvent(DocumentScrollToEvent event) {
                sourceFileController.scrollTo(event.getTarget());
            }
        });

        // forward the resize event
        resizeEventHandlerRegistration = clientFactory.getEventBus().addHandler(ResizeEvent.TYPE, new ResizeEventHandler() {
            @Override
            public void onEvent(ResizeEvent event) {
                documentEventBus.fireEvent(event);
                view.setDocumentHeight(event.getHeight());
            }
        });

        overlayWidgetSelectEventHandlerRegistration = documentEventBus.addHandler(OverlayWidgetSelectEvent.TYPE, new OverlayWidgetSelectEventHandler() {
            @Override
            public void onEvent(OverlayWidgetSelectEvent event) {
                boolean alreadySelected = false;
                if (sourceFileController.getActiveOverlayWidget() == event.getOverlayWidget()) {
                    alreadySelected = true;
                }
                if (sourceFileController.getActiveOverlayWidget() != null) {
                    sourceFileController.getActiveOverlayWidget().asWidget().removeStyleName(style.selected());
                }
                sourceFileController.setActiveOverlayWidget(event.getOverlayWidget());
                if (sourceFileController.getActiveOverlayWidget() != null) {
                    sourceFileController.getActiveOverlayWidget().asWidget().addStyleName(style.selected());
                    actionBarCreatePanelController.setOverlayWidget(sourceFileController.getActiveOverlayWidget());
                }

                // inline editing is currently disabled
                        /*final InlineEditingMode inlineEditingMode = (InlineEditingMode) getMode(InlineEditingMode.KEY);
                        if (alreadySelected && inlineEditingMode != null && inlineEditingMode.getState().isActive()) {
                            clientFactory.getEventBus().fireEvent(new AttachInlineEditorEvent(event.getAmendableWidget(), DocumentController.this));
                        }*/
            }
        });

        // forward the critical error event
        criticalEventHandlerRegistration = documentEventBus.addHandler(CriticalErrorEvent.TYPE, new CriticalErrorEventHandler() {
            @Override
            public void onEvent(CriticalErrorEvent event) {
                clientFactory.getEventBus().fireEvent(event);
            }
        });

        // forward the confirmation event
        confirmationEventHandlerRegistration = documentEventBus.addHandler(ConfirmationEvent.TYPE, new ConfirmationEventHandler() {
            @Override
            public void onEvent(ConfirmationEvent event) {
                clientFactory.getEventBus().fireEvent(event);
            }
        });

        // forward the notification event to the parent event bus
        notificationEventHandlerRegistration = documentEventBus.addHandler(NotificationEvent.TYPE, new NotificationEventHandler() {
            @Override
            public void onEvent(NotificationEvent event) {
                clientFactory.getEventBus().fireEvent(event);
            }
        });

        // handle requests to switch the document tabs
        switchTabEventHandlerRegistration = documentEventBus.addHandler(SwitchTabEvent.TYPE, new SwitchTabEventHandler() {
            @Override
            public void onEvent(SwitchTabEvent event) {
                view.switchToTab(event.getTabIndex());
            }
        });

        documentToggleStructureEventHandler = documentEventBus.addHandler(DocumentToggleStructureEvent.TYPE, new DocumentToggleStructureEventHandler() {
            @Override
            public void onEvent(DocumentToggleStructureEvent event) {
                applyState(StructureViewMode.KEY, new ActiveState(event.isToggle()));
            }
        });

        // listen for keyboard combos
        keyComboHandlerRegistration = clientFactory.getEventBus().addHandler(KeyComboEvent.TYPE, new KeyComboEventHandler() {
            @Override
            public void onEvent(KeyComboEvent event) {

                final OverlayWidgetSelector overlayWidgetSelector = new OverlayWidgetSelector() {
                    @Override
                    public boolean select(OverlayWidget toSelect) {
                        return toSelect instanceof BasehierarchyComplexType;
                    }
                };

                if (ctrlEnter.equals(event.getKeyCombo())) {
                    actionBarCreatePanelControllerPopup.center();
                    actionBarCreatePanelControllerPopup.show();
                } else if (escape.equals(event.getKeyCombo())) {
                    if (actionBarCreatePanelControllerPopup.isShowing()) {
                        actionBarCreatePanelControllerPopup.hide();
                    }
                } else if (downArrow.equals(event.getKeyCombo())) {
                    if (actionBarCreatePanelControllerPopup.isShowing()) {
                        actionBarCreatePanelController.highlightNext();
                    } else {
                        final OverlayWidget activeOverlayWidget = sourceFileController.getActiveOverlayWidget();
                        final OverlayWidget next = activeOverlayWidget != null ? activeOverlayWidget.next(overlayWidgetSelector) : sourceFileController.getOverlayWidgets().get(0);
                        if (next != null) {
                            documentEventBus.fireEvent(new OverlayWidgetSelectEvent(next, DraftingDocumentController.this));
                            clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(next.asWidget(), DraftingDocumentController.this));
                        }
                    }
                } else if (upArrow.equals(event.getKeyCombo())) {
                    if (actionBarCreatePanelControllerPopup.isShowing()) {
                        actionBarCreatePanelController.highlightPrevious();
                    } else {
                        final OverlayWidget activeOverlayWidget = sourceFileController.getActiveOverlayWidget();
                        if (activeOverlayWidget != null) {
                            final OverlayWidget previous = activeOverlayWidget.previous(overlayWidgetSelector);
                            if (previous != null) {
                                documentEventBus.fireEvent(new OverlayWidgetSelectEvent(previous, DraftingDocumentController.this));
                                clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(previous.asWidget(), DraftingDocumentController.this));
                            }
                        }
                    }
                }
            }
        });
    }

    @Override
    public void onDocumentContentLoaded(String content) {
        showLoadingIndicator(true, "Parsing document.");
        sourceFileController.setContent(content);
        showLoadingIndicator(true, "Building document tree.");
        clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
            @Override
            public void execute() {
                sourceFileController.overlay();
                showLoadingIndicator(true, "Done overlaying document.");
                clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                    @Override
                    public void execute() {
                        clientFactory.getEventBus().fireEvent(new ResizeEvent(Window.getClientHeight(), Window.getClientWidth()));
                        showLoadingIndicator(false, "Done retrieving document.");
                        clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                            @Override
                            public void execute() {
                                final List<OverlayWidget> overlayWidgets = sourceFileController.getOverlayWidgets();
                                if (overlayWidgets != null && !overlayWidgets.isEmpty()) {
                                    // only display the first one
                                    outlineController.setRootOverlayWidget(overlayWidgets.get(0));
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    @Override
    public void setDocument(DocumentDTO document) {
        this.document = document;
        this.documentID = document.getDocumentID();
        // update the document title
        this.view.setDocumentTitle(document.getName());

        // set the deadline
        this.deadlineController.setDeadline(document.getDeadline());
    }

    @Override
    public void removeListeners() {
        switchTabEventHandlerRegistration.removeHandler();
        notificationEventHandlerRegistration.removeHandler();
        confirmationEventHandlerRegistration.removeHandler();
        criticalEventHandlerRegistration.removeHandler();
        overlayWidgetSelectEventHandlerRegistration.removeHandler();
        resizeEventHandlerRegistration.removeHandler();
        documentScrollToEventHandlerRegistration.removeHandler();
        documentToggleStructureEventHandler.removeHandler();
        bootstrapEventHandlerRegistration.removeHandler();
        keyComboHandlerRegistration.removeHandler();
    }

    public void setInjector(DocumentInjector injector) {
        this.documentEventBus = injector.getDocumentEventBus();
        this.view = injector.getDocumentView();
        this.deadlineController = injector.getDeadlineController();
        this.deadlineController.setDocumentController(this);
        this.sourceFileController = injector.getSourceFileController();
        this.sourceFileController.setDocumentController(this);

        if (injector instanceof DraftingDocumentInjector) {
            final DraftingDocumentInjector draftingDocumentInjector = (DraftingDocumentInjector) injector;
            this.outlineController = draftingDocumentInjector.getOutlineController();
            this.outlineController.setDocumentController(this);
            this.actionBarCreatePanelController = draftingDocumentInjector.getActionBarCreatePanelController();
            this.actionBarCreatePanelController.setSourceFileController(sourceFileController);
            this.actionBarCreatePanelControllerPopup.setWidget(actionBarCreatePanelController.getView());
            this.style = draftingDocumentInjector.getDocumentViewCss();
        }
    }

    @Override
    public DocumentInjector getInjector() {
        return GWT.create(DraftingDocumentInjector.class);
    }
}
