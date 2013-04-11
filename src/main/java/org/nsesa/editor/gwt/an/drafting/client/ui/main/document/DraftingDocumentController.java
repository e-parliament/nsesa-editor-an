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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.drafting.client.event.DocumentToggleStructureEvent;
import org.nsesa.editor.gwt.an.drafting.client.event.DocumentToggleStructureEventHandler;
import org.nsesa.editor.gwt.an.drafting.client.mode.StructureViewMode;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.outline.OutlineController;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.amendment.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.client.event.*;
import org.nsesa.editor.gwt.core.client.event.document.DocumentScrollToEvent;
import org.nsesa.editor.gwt.core.client.event.document.DocumentScrollToEventHandler;
import org.nsesa.editor.gwt.core.client.event.visualstructure.VisualStructureAttributesToggleEvent;
import org.nsesa.editor.gwt.core.client.event.visualstructure.VisualStructureAttributesToggleEventHandler;
import org.nsesa.editor.gwt.core.client.event.visualstructure.VisualStructureToggleEvent;
import org.nsesa.editor.gwt.core.client.event.visualstructure.VisualStructureToggleEventHandler;
import org.nsesa.editor.gwt.core.client.event.widget.*;
import org.nsesa.editor.gwt.core.client.keyboard.KeyboardListener;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.ui.document.DefaultDocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentInjector;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.ActionBarController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.create.ActionBarCreatePanelController;
import org.nsesa.editor.gwt.core.client.ui.overlay.*;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.*;
import org.nsesa.editor.gwt.core.client.ui.rte.RichTextEditor;
import org.nsesa.editor.gwt.core.shared.DocumentDTO;
import org.nsesa.editor.gwt.inline.client.event.AttachInlineEditorEvent;
import org.nsesa.editor.gwt.inline.client.event.DetachInlineEditorEvent;
import org.nsesa.editor.gwt.inline.client.ui.inline.InlineEditorController;

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

    private final OverlaySnippetFactory overlaySnippetFactory;

    private final OverlaySnippetEvaluator overlaySnippetEvaluator;

    private final InlineEditorController inlineEditorController;

    private OutlineController outlineController;

    private ActionBarController actionBarController;

    // popup with available child controllers
    private ActionBarCreatePanelController actionBarCreatePanelController;

    private FocusPanel actionBarCreatePanelFocusPanel = new FocusPanel();

    private PopupPanel actionBarCreatePanelControllerPopup = new PopupPanel();

    // ------------- selector ------------------------
    private final OverlayWidgetSelector overlayWidgetSelector = new OverlayWidgetSelector() {
        @Override
        public boolean select(OverlayWidget toSelect) {
            return toSelect instanceof BasehierarchyComplexType;
        }
    };

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
    private HandlerRegistration draftingToggleEventHandlerRegistration;
    private HandlerRegistration draftingAttributesToggleEventHandlerRegistration;

    // ----------------- keyboard shortcuts ---------------------
    private KeyboardListener.KeyCombo ctrlEnter = new KeyboardListener.KeyCombo(false, false, true, KeyCodes.KEY_ENTER);
    private KeyboardListener.KeyCombo enter = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_ENTER);
    private KeyboardListener.KeyCombo tab = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_TAB);
    private KeyboardListener.KeyCombo escape = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_ESCAPE);
    private KeyboardListener.KeyCombo delete = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_DELETE);

    private KeyboardListener.KeyCombo upArrow = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_UP);
    private KeyboardListener.KeyCombo downArrow = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_DOWN);

    private KeyboardListener.KeyCombo altUpArrow = new KeyboardListener.KeyCombo(false, true, false, KeyCodes.KEY_UP);
    private KeyboardListener.KeyCombo altDownArrow = new KeyboardListener.KeyCombo(false, true, false, KeyCodes.KEY_DOWN);


    private HandlerRegistration overlayWidgetModifyHandlerRegistration;
    private HandlerRegistration overlayWidgetDeleteHandlerRegistration;
    private HandlerRegistration overlayWidgetNewEventHandlerRegistration;

    @Inject
    public DraftingDocumentController(final ClientFactory clientFactory,
                                      final ServiceFactory serviceFactory,
                                      final OverlayFactory overlayFactory,
                                      final Locator locator,
                                      final Creator creator,
                                      final Mover mover,
                                      final InlineEditorController inlineEditorController,
                                      final OverlaySnippetFactory overlaySnippetFactory,
                                      final OverlaySnippetEvaluator overlaySnippetEvaluator) {
        super(clientFactory, serviceFactory, overlayFactory, locator, creator, mover);
        this.inlineEditorController = inlineEditorController;
        this.overlaySnippetFactory = overlaySnippetFactory;
        this.overlaySnippetEvaluator = overlaySnippetEvaluator;
    }

    @Override
    public void registerKeyCombos() {
        super.registerKeyCombos();
        clientFactory.getKeyboardListener().register(ctrlEnter);
        clientFactory.getKeyboardListener().register(enter);
        clientFactory.getKeyboardListener().register(tab);
        clientFactory.getKeyboardListener().register(escape);
        clientFactory.getKeyboardListener().register(delete);
        clientFactory.getKeyboardListener().register(upArrow);
        clientFactory.getKeyboardListener().register(downArrow);
        clientFactory.getKeyboardListener().register(altUpArrow);
        clientFactory.getKeyboardListener().register(altDownArrow);
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
                sourceFileController.scrollTo(event.getTarget(), event.getOffset());
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

                if (sourceFileController.getActiveOverlayWidget() != null) {
                    sourceFileController.getActiveOverlayWidget().asWidget().removeStyleName(style.selected());
                }

                sourceFileController.setActiveOverlayWidget(event.getOverlayWidget());

                if (sourceFileController.getActiveOverlayWidget() != null) {
                    sourceFileController.getActiveOverlayWidget().asWidget().addStyleName(style.selected());

                    actionBarCreatePanelController.setOverlayWidget(sourceFileController.getActiveOverlayWidget());

                    actionBarController.attach(event.getOverlayWidget(), DraftingDocumentController.this);
                    actionBarController.setLocation(locator.getLocation(event.getOverlayWidget(), document.getLanguageIso(), true));
                }

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

        overlayWidgetModifyHandlerRegistration = documentEventBus.addHandler(OverlayWidgetModifyEvent.TYPE, new OverlayWidgetModifyEventHandler() {
            @Override
            public void onEvent(OverlayWidgetModifyEvent event) {
                documentEventBus.fireEvent(new OverlayWidgetSelectEvent(event.getOverlayWidget(), DraftingDocumentController.this));
                clientFactory.getEventBus().fireEvent(new AttachInlineEditorEvent(event.getOverlayWidget(), DraftingDocumentController.this));
            }
        });

        overlayWidgetDeleteHandlerRegistration = documentEventBus.addHandler(OverlayWidgetDeleteEvent.TYPE, new OverlayWidgetDeleteEventHandler() {
            @Override
            public void onEvent(OverlayWidgetDeleteEvent event) {
                handleOverlayWidgetDelete(event.getOverlayWidget());
            }
        });

        overlayWidgetNewEventHandlerRegistration = documentEventBus.addHandler(OverlayWidgetNewEvent.TYPE, new OverlayWidgetNewEventHandler() {
            @Override
            public void onEvent(final OverlayWidgetNewEvent event) {
                final OverlayWidget child = event.getChild();
                // TODO does not work yet for create-child
                event.getOverlayWidget().addOverlayWidget(child, event.getReference().getIndex() + 1, true);
                DOM.insertChild(event.getOverlayWidget().asWidget().getElement(), child.asWidget().getElement(), event.getPosition());
                if (!child.isAttached()) child.onAttach();

                clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                    @Override
                    public void execute() {
                        documentEventBus.fireEvent(new OverlayWidgetSelectEvent(child, DraftingDocumentController.this));
                        clientFactory.getEventBus().fireEvent(new AttachInlineEditorEvent(child, DraftingDocumentController.this));

                        final OverlaySnippet overlaySnippet = overlaySnippetFactory.getSnippet(child);

                        if (overlaySnippet != null) {
                            overlaySnippetEvaluator.addEvaluator(new OverlaySnippetEvaluator.Evaluator() {
                                @Override
                                public String getPlaceHolder() {
                                    return "${widget.num}";
                                }

                                @Override
                                public String evaluate() {
                                    if (child.getNumberingType() == null || child.getFormat() == null) {

                                        if (child.getType().equalsIgnoreCase(event.getReference().getType())) {
                                            // we're the same type, so inherit the numbering type
                                            child.setNumberingType(event.getReference().getNumberingType());
                                            child.setFormat(event.getReference().getFormat());
                                        } else {
                                            // find similar type, if any
                                            final OverlayWidget previous = event.getReference().getPreviousNonIntroducedOverlayWidget(true);
                                            if (previous != null) {
                                                child.setNumberingType(previous.getNumberingType());
                                                child.setFormat(previous.getFormat());
                                            } else {
                                                final OverlayWidget next = event.getReference().getNextNonIntroducedOverlayWidget(true);
                                                if (next != null) {
                                                    child.setNumberingType(next.getNumberingType());
                                                    child.setFormat(next.getFormat());
                                                } else {
                                                    // free to choose, but should be different from parent
                                                    child.setNumberingType(NumberingType.ROMANITO);
                                                    child.setFormat(Format.BRACKET);
                                                }
                                            }
                                        }
                                    }

                                    child.setParentOverlayWidget(event.getOverlayWidget());
                                    //add the overlay widget in the parent children collection to compute the num
                                    String num = locator.getNum(child, document.getLanguageIso());
                                    return num == null ? "" : child.getFormat().format(num);
                                }
                            });
                            child.getOverlayElement().setInnerHTML(overlaySnippet.getContent(overlaySnippetEvaluator));
                        } else {
                            child.getOverlayElement().setInnerHTML("");
                        }
                        inlineEditorController.getRichTextEditor().setHTML(child.getInnerHTML());
                    }
                });
            }
        });

        // listen for keyboard combos
        keyComboHandlerRegistration = clientFactory.getEventBus().addHandler(KeyComboEvent.TYPE, new KeyComboEventHandler() {
            @Override
            public void onEvent(KeyComboEvent event) {
                event.getNativeEvent().preventDefault();

                final OverlayWidget activeOverlayWidget = sourceFileController.getActiveOverlayWidget();
                if (ctrlEnter.equals(event.getKeyCombo())) {


                    // ------------- CTRL + ENTER -------------
                    if (!actionBarCreatePanelControllerPopup.isShowing()) {
                        if (activeOverlayWidget != null) {
                            actionBarCreatePanelController.setOverlayWidget(activeOverlayWidget);

                            if (inlineEditorController.isShowing()) {
                                final RichTextEditor.CaretPosition caretPosition = inlineEditorController.getRichTextEditor().getCaretPosition();
                                if (caretPosition != null) {
                                    actionBarCreatePanelControllerPopup.setPopupPosition(caretPosition.getLeft(), caretPosition.getTop());
                                }
                            } else {
                                actionBarCreatePanelControllerPopup.showRelativeTo(actionBarController.getView().getChildHandler());
                            }
                            actionBarCreatePanelController.getView().asWidget().setVisible(true);
                            actionBarCreatePanelControllerPopup.show();
                        }
                    }

                } else if (escape.equals(event.getKeyCombo())) {


                    // ------------- Escape -------------
                    if (actionBarCreatePanelControllerPopup.isShowing()) {
                        actionBarCreatePanelControllerPopup.hide();
                        actionBarCreatePanelFocusPanel.setFocus(false);
                        inlineEditorController.getRichTextEditor().setFocus(true);
                    } else if (inlineEditorController.isShowing()) {
                        clientFactory.getEventBus().fireEvent(new DetachInlineEditorEvent(DraftingDocumentController.this));
                        inlineEditorController.getRichTextEditor().setFocus(false);
                        restoreFocusOnViewPort();
                    }
                } else if (downArrow.equals(event.getKeyCombo())) {


                    // ------------- Down arrow -------------
                    if (actionBarCreatePanelControllerPopup.isShowing()) {
                        actionBarCreatePanelFocusPanel.setFocus(true);
                        actionBarCreatePanelController.highlightNext();
                    } else if (!inlineEditorController.isShowing()) {

                        final OverlayWidget next = activeOverlayWidget != null ? activeOverlayWidget.next(overlayWidgetSelector) : sourceFileController.getOverlayWidgets().get(0);
                        if (next != null) {
                            documentEventBus.fireEvent(new OverlayWidgetSelectEvent(next, DraftingDocumentController.this));
                            clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(next.asWidget(), DraftingDocumentController.this, false, 100));
                        }
                    }

                } else if (upArrow.equals(event.getKeyCombo())) {


                    // ------------- Up arrow -------------

                    if (actionBarCreatePanelControllerPopup.isShowing()) {
                        actionBarCreatePanelFocusPanel.setFocus(true);
                        actionBarCreatePanelController.highlightPrevious();
                    } else if (!inlineEditorController.isShowing()) {
                        if (activeOverlayWidget != null) {
                            final OverlayWidget previous = activeOverlayWidget.previous(overlayWidgetSelector);
                            if (previous != null) {
                                documentEventBus.fireEvent(new OverlayWidgetSelectEvent(previous, DraftingDocumentController.this));
                                clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(previous.asWidget(), DraftingDocumentController.this, false, 100));
                            }
                        }
                    }

                } else if (enter.equals(event.getKeyCombo())) {


                    // ------------- Single ENTER -------------
                    if (actionBarCreatePanelControllerPopup.isShowing()) {

                        actionBarCreatePanelControllerPopup.hide();
                        clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(activeOverlayWidget.asWidget(), DraftingDocumentController.this, false, 100));

                        final OverlayWidget selectedSibling = actionBarCreatePanelController.getSelectedSibling();
                        if (selectedSibling != null) {
                            LOG.info("Selected as sibling: " + selectedSibling);
                            // get the correct index
                            documentEventBus.fireEvent(new OverlayWidgetNewEvent(activeOverlayWidget.getParentOverlayWidget(), activeOverlayWidget, selectedSibling, activeOverlayWidget.getDomIndex() + 1));
                        }
                        final OverlayWidget selectedChild = actionBarCreatePanelController.getSelectedChild();
                        if (selectedChild != null) {
                            LOG.info("Selected as child: " + selectedChild);
                            documentEventBus.fireEvent(new OverlayWidgetNewEvent(activeOverlayWidget, activeOverlayWidget, selectedChild, -1));
                        }

                        // TODO
                    } else if (activeOverlayWidget != null || !(inlineEditorController.getOverlayWidget().equals(activeOverlayWidget))) {

                        handleOverlayWidgetModify(activeOverlayWidget);
                    }
                } else if (tab.equals(event.getKeyCombo())) {


                    // ------------- Single TAB -------------
                    if (inlineEditorController.isShowing()) {
                        // close the editor, copy the value into the overlay widget
                        modifyOverlayWidget(activeOverlayWidget, inlineEditorController.getRichTextEditor().getHTML());
                        // and finally destroy the instance
                        clientFactory.getEventBus().fireEvent(new DetachInlineEditorEvent(DraftingDocumentController.this));
                        inlineEditorController.getRichTextEditor().setFocus(false);
                        restoreFocusOnViewPort();
                    }
                } else if (delete.equals(event.getKeyCombo())) {


                    // ------------- DELETE -------------
                    if (!inlineEditorController.isShowing() && activeOverlayWidget != null) {
                        handleOverlayWidgetDelete(activeOverlayWidget);
                        restoreFocusOnViewPort();
                    }
                } else if (altUpArrow.equals(event.getKeyCombo())) {


                    // ------------- CTRL + Up arrow -------------

                    if (activeOverlayWidget != null) {
                        if (mover.canMoveUp(activeOverlayWidget)) {
                            activeOverlayWidget.moveUp();
                            clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                                @Override
                                public void execute() {
                                    documentEventBus.fireEvent(new OverlayWidgetSelectEvent(activeOverlayWidget, DraftingDocumentController.this));
                                    clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(activeOverlayWidget.asWidget(), DraftingDocumentController.this, false, 100));
                                    // TODO schedule via timer
                                    redrawOutline(activeOverlayWidget.getRoot());
                                }
                            });
                        }
                    }

                } else if (altDownArrow.equals(event.getKeyCombo())) {


                    // ------------- CTRL + Down arrow -------------

                    if (activeOverlayWidget != null) {
                        if (mover.canMoveDown(activeOverlayWidget)) {
                            activeOverlayWidget.moveDown();
                            clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                                @Override
                                public void execute() {
                                    documentEventBus.fireEvent(new OverlayWidgetSelectEvent(activeOverlayWidget, DraftingDocumentController.this));
                                    clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(activeOverlayWidget.asWidget(), DraftingDocumentController.this, false, 100));
                                    // TODO schedule via timer
                                    redrawOutline(activeOverlayWidget.getRoot());
                                }
                            });
                        }
                    }

                }
            }
        });

        draftingToggleEventHandlerRegistration = clientFactory.getEventBus().addHandler(VisualStructureToggleEvent.TYPE, new VisualStructureToggleEventHandler() {
            @Override
            public void onEvent(VisualStructureToggleEvent event) {
                inlineEditorController.getRichTextEditor().toggleVisualStructure(event.isShown());
            }
        });
        draftingAttributesToggleEventHandlerRegistration = clientFactory.getEventBus().addHandler(VisualStructureAttributesToggleEvent.TYPE, new VisualStructureAttributesToggleEventHandler() {
            @Override
            public void onEvent(VisualStructureAttributesToggleEvent event) {
                inlineEditorController.getRichTextEditor().toggleVisualStructureAttributes(event.isShown());
            }
        });
    }

    public void handleOverlayWidgetDelete(final OverlayWidget overlayWidget) {
        final OverlayWidget parentOverlayWidget = overlayWidget.getParentOverlayWidget();
        if (parentOverlayWidget != null) {

            // find the target to make active after the deletion
            OverlayWidget target = overlayWidget.next(overlayWidgetSelector);
            if (target == null) target = overlayWidget.previous(overlayWidgetSelector);

            parentOverlayWidget.removeOverlayWidget(overlayWidget);
            overlayWidget.getOverlayElement().removeFromParent();

            if (target != null) {
                documentEventBus.fireEvent(new OverlayWidgetSelectEvent(target, DraftingDocumentController.this));
            }
            // redraw the outline
            redrawOutline(parentOverlayWidget.getRoot());
        }
    }

    public void handleOverlayWidgetModify(final OverlayWidget overlayWidget) {
        if (!inlineEditorController.isShowing()) {
            // first scroll to the widget
            documentEventBus.fireEvent(new DocumentScrollToEvent(overlayWidget.asWidget(), DraftingDocumentController.this));
            // then attach the inline editor
            clientFactory.getEventBus().fireEvent(new AttachInlineEditorEvent(overlayWidget, DraftingDocumentController.this));
        }
    }

    public void modifyOverlayWidget(final OverlayWidget overlayWidget, final String innerHTML) {

        final Element overlayElement = inlineEditorController.getOverlayWidget().getOverlayElement();

        // TODO overlay again, and correct the tree
        for (OverlayWidget child : inlineEditorController.getOverlayWidget().getChildOverlayWidgets()) {
            child.onDetach();
        }
        inlineEditorController.getOverlayWidget().getChildOverlayWidgets().clear();

        overlayElement.setInnerHTML(innerHTML);
        for (int i = 0; i < overlayElement.getChildCount(); i++) {
            final Node child = overlayElement.getChild(i);
            if (Node.ELEMENT_NODE == child.getNodeType()) {
                final OverlayWidget amendableWidget = overlayFactory.getAmendableWidget((Element) child);
                if (amendableWidget != null) {
                    overlayWidget.addOverlayWidget(amendableWidget);
                }
                else {
                    LOG.warning("Could not get overlay for " + child);
                }
            }
        }
        overlayWidget.walk(new OverlayWidgetWalker.OverlayWidgetVisitor() {
            @Override
            public boolean visit(OverlayWidget visited) {
                // if the widget is amendable, register a listener for its events
                if (visited != null && visited.isAmendable() != null && visited.isAmendable()) {
                    visited.setUIListener(sourceFileController);
                }
                return true;
            }
                        });

        redrawOutline(overlayWidget.getRoot());
    }

    public void redrawOutline(OverlayWidget root) {
        outlineController.setRootOverlayWidget(root);
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
                                    redrawOutline(overlayWidgets.get(0));
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
        draftingToggleEventHandlerRegistration.removeHandler();
        draftingAttributesToggleEventHandlerRegistration.removeHandler();
        overlayWidgetDeleteHandlerRegistration.removeHandler();
        overlayWidgetModifyHandlerRegistration.removeHandler();
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
            this.actionBarController = draftingDocumentInjector.getActionBarController();
            this.actionBarController.setSourceFileController(sourceFileController);

            this.actionBarCreatePanelController = draftingDocumentInjector.getActionBarCreatePanelController();
            this.actionBarCreatePanelController.setSourceFileController(sourceFileController);
            this.actionBarCreatePanelFocusPanel.setWidget(actionBarCreatePanelController.getView());
            this.actionBarCreatePanelControllerPopup.setWidget(actionBarCreatePanelFocusPanel);
            this.style = draftingDocumentInjector.getDocumentViewCss();
        }
    }

    @Override
    public DocumentInjector getInjector() {
        return GWT.create(DraftingDocumentInjector.class);
    }


    /**
     * Force focus on the page since when we are using keyboards in the editor we are loosing the focus
     * on the document
     */
    private void restoreFocusOnViewPort() {
        TextBox dummyBox = new TextBox();
        RootLayoutPanel.get().add(dummyBox);
        dummyBox.setFocus(true);
        dummyBox.removeFromParent();
    }
}
