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
package org.nsesa.editor.gwt.an.markup.client.ui.main.document;

import com.bfr.client.selection.Range;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.google.web.bindery.event.shared.HandlerRegistration;
import org.nsesa.editor.gwt.an.common.client.mode.StructureViewMode;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.AkomaNtosoUtil;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AkomaNtoso;
import org.nsesa.editor.gwt.an.markup.client.event.*;
import org.nsesa.editor.gwt.an.markup.client.mode.WhitespacePreservationMode;
import org.nsesa.editor.gwt.an.markup.client.ui.main.document.outline.OutlineController;
import org.nsesa.editor.gwt.an.markup.client.ui.main.document.path.PathController;
import org.nsesa.editor.gwt.an.markup.client.ui.main.document.picker.PickerController;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.event.*;
import org.nsesa.editor.gwt.core.client.event.document.DocumentScrollToEvent;
import org.nsesa.editor.gwt.core.client.event.document.DocumentScrollToEventHandler;
import org.nsesa.editor.gwt.core.client.event.visualstructure.*;
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
import org.nsesa.editor.gwt.core.shared.DocumentContentDTO;
import org.nsesa.editor.gwt.core.shared.DocumentDTO;
import org.nsesa.editor.gwt.inline.client.event.AttachInlineEditorEvent;
import org.nsesa.editor.gwt.inline.client.event.DetachInlineEditorEvent;
import org.nsesa.editor.gwt.inline.client.ui.inline.InlineEditorController;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Date: 05/02/13 09:32
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class MarkupDocumentController extends DefaultDocumentController {

    private static final Logger LOG = Logger.getLogger(MarkupDocumentController.class.getName());

    public static final int SCROLL_TO_OFFSET = 200;

    private final OverlaySnippetFactory overlaySnippetFactory;

    private final OverlaySnippetEvaluator overlaySnippetEvaluator;

    private final InlineEditorController inlineEditorController;

    private final Transformer xmlTransformer;
    private final Transformer htmlTransformer;

    private OutlineController outlineController;

    private PickerController pickerController;

    private PathController pathController;

    private ActionBarController actionBarController;

    // popup with available child controllers
    private ActionBarCreatePanelController actionBarCreatePanelController;

    private FocusPanel actionBarCreatePanelFocusPanel = new FocusPanel();

    private PopupPanel actionBarCreatePanelControllerPopup = new PopupPanel();

    // ------------- selector ------------------------
    private final OverlayWidgetSelector overlayWidgetSelector = new OverlayWidgetSelector() {
        @Override
        public boolean select(OverlayWidget toSelect) {
            return AkomaNtosoUtil.representsBlock(toSelect) || toSelect.getOverlayElement().getClassName().contains("nsesa-inline");
        }
    };

    // ------------- event handler registration -----------
    private HandlerRegistration documentToggleStructureEventHandler;
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
    private KeyboardListener.KeyCombo escape = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_ESCAPE);
    private KeyboardListener.KeyCombo delete = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_DELETE);

    private KeyboardListener.KeyCombo ctrlS = new KeyboardListener.KeyCombo(false, false, true, 83); // 83 is 's' key

    private HandlerRegistration overlayWidgetModifyHandlerRegistration;
    private HandlerRegistration overlayWidgetDeleteHandlerRegistration;
    private HandlerRegistration overlayWidgetNewEventHandlerRegistration;
    private com.google.gwt.event.shared.HandlerRegistration inlineEditorControllerSaveHandlerRegistration;
    private com.google.gwt.event.shared.HandlerRegistration inlineEditorControllerCancelHandlerRegistration;
    private HandlerRegistration whiteSpaceEventHandlerRegistration;

    private Range currentSelectionRange;
    private HandlerRegistration selectionEventHandlerRegistration;

    @Inject
    public MarkupDocumentController(final ClientFactory clientFactory,
                                    final ServiceFactory serviceFactory,
                                    final OverlayFactory overlayFactory,
                                    final Locator locator,
                                    final Creator creator,
                                    final Mover mover,
                                    final InlineEditorController inlineEditorController,
                                    final OverlaySnippetFactory overlaySnippetFactory,
                                    final OverlaySnippetEvaluator overlaySnippetEvaluator,
                                    final @Named("xml") Transformer xmlTransformer,
                                    final @Named("html") Transformer htmlTransformer) {
        super(clientFactory, serviceFactory, overlayFactory, locator, creator, mover);
        this.inlineEditorController = inlineEditorController;
        this.inlineEditorController.registerListeners();
        this.overlaySnippetFactory = overlaySnippetFactory;
        this.overlaySnippetEvaluator = overlaySnippetEvaluator;
        this.xmlTransformer = xmlTransformer;
        this.htmlTransformer = htmlTransformer;
    }

    @Override
    public void registerKeyCombos() {
        super.registerKeyCombos();
        clientFactory.getKeyboardListener().register(ctrlEnter, enter, escape, delete, ctrlS);
    }

    @Override
    public void registerModes() {
        super.registerModes();
        final StructureViewMode structureViewMode = new StructureViewMode(this);
        registerMode(StructureViewMode.KEY, structureViewMode);
        documentEventBus.fireEvent(new VisualStructureToggleEvent(true));

        final WhitespacePreservationMode whitespacePreservationMode = new WhitespacePreservationMode(this, clientFactory);
        registerMode(WhitespacePreservationMode.KEY, whitespacePreservationMode);
        documentEventBus.fireEvent(new WhitespaceToggleEvent(this, true));
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
                final OverlayWidget activeOverlayWidget = event.getOverlayWidget();
                sourceFileController.setActiveOverlayWidget(activeOverlayWidget);

                if (activeOverlayWidget != null) {
                    pickerController.setOverlayWidget(activeOverlayWidget);
                    pathController.setOverlayWidget(activeOverlayWidget);
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

        whiteSpaceEventHandlerRegistration = documentEventBus.addHandler(WhitespaceToggleEvent.TYPE, new WhitespaceToggleEventHandler() {
            @Override
            public void onEvent(WhitespaceToggleEvent event) {
                applyState(WhitespacePreservationMode.KEY, new ActiveState(event.isToggle()));
            }
        });

        selectionEventHandlerRegistration = clientFactory.getEventBus().addHandler(SelectionEvent.TYPE, new SelectionEventHandler() {
            @Override
            public void onEvent(SelectionEvent event) {
                if (event.getSelection().getRange() != null && !"".equalsIgnoreCase(event.getSelection().getRange().getText().trim())) {
                    currentSelectionRange = event.getSelection().getRange();
                    if (LOG.isLoggable(Level.FINE)) {
                        LOG.fine("Current selection: " + (currentSelectionRange != null ? currentSelectionRange.getHtmlText() : "<<null>>"));
                    }
                }
            }
        });

        overlayWidgetModifyHandlerRegistration = documentEventBus.addHandler(OverlayWidgetModifyEvent.TYPE, new OverlayWidgetModifyEventHandler() {
            @Override
            public void onEvent(OverlayWidgetModifyEvent event) {
                documentEventBus.fireEvent(new OverlayWidgetSelectEvent(event.getOverlayWidget(), MarkupDocumentController.this));
                clientFactory.getEventBus().fireEvent(new AttachInlineEditorEvent(event.getOverlayWidget(), MarkupDocumentController.this));
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
                if (event.getReference() == event.getParentOverlayWidget()) {
                    // this is a new child
                    event.getParentOverlayWidget().addOverlayWidget(child);
                    DOM.appendChild(event.getParentOverlayWidget().asWidget().getElement(), child.asWidget().getElement());
                    if (!child.isAttached()) child.onAttach();
                } else {
                    // this is a sibling
                    event.getParentOverlayWidget().addOverlayWidget(child, event.getReference().getIndex() + 1, true);
                    DOM.insertChild(event.getParentOverlayWidget().asWidget().getElement(), child.asWidget().getElement(), event.getReference().getDomIndex());
                    if (!child.isAttached()) child.onAttach();
                }

                clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                    @Override
                    public void execute() {
                        documentEventBus.fireEvent(new OverlayWidgetSelectEvent(child, MarkupDocumentController.this));
                        clientFactory.getEventBus().fireEvent(new AttachInlineEditorEvent(child, MarkupDocumentController.this));

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
                                            final OverlayWidget previous = event.getReference().getPreviousSibling(new OverlayWidgetSelector() {
                                                @Override
                                                public boolean select(OverlayWidget toSelect) {
                                                    return !toSelect.isIntroducedByAnAmendment() && event.getReference().getType().equalsIgnoreCase(toSelect.getType());
                                                }
                                            });
                                            if (previous != null) {
                                                child.setNumberingType(previous.getNumberingType());
                                                child.setFormat(previous.getFormat());
                                            } else {
                                                final OverlayWidget next = event.getReference().getNextSibling(new OverlayWidgetSelector() {
                                                    @Override
                                                    public boolean select(OverlayWidget toSelect) {
                                                        return !toSelect.isIntroducedByAnAmendment() && event.getReference().getType().equalsIgnoreCase(toSelect.getType());
                                                    }
                                                });
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

                                    child.setParentOverlayWidget(event.getParentOverlayWidget());
                                    //add the overlay widget in the parent children collection to compute the num
                                    String num = locator.getNum(child, document.getLanguageIso(), true);
                                    return num == null ? "" : num;
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
                            actionBarCreatePanelFocusPanel.setFocus(true);
                        }
                    }

                } else if (escape.equals(event.getKeyCombo())) {


                    // ------------- Escape -------------
                    if (actionBarCreatePanelControllerPopup.isShowing()) {
                        actionBarCreatePanelControllerPopup.hide();
                        actionBarCreatePanelFocusPanel.setFocus(false);
                        inlineEditorController.getRichTextEditor().setFocus(true);
                    } else if (inlineEditorController.isShowing()) {
                        cancelModify();
                    }
                } else if (ctrlS.equals(event.getKeyCombo())) {


                    // ------------- CTRL + s -------------
                    final String content = xmlTransformer.transform(sourceFileController.getOverlayWidgets().get(0));
                    serviceFactory.getGwtDocumentService().saveDocumentContent(clientFactory.getClientContext(), document.getDocumentID(), content, new AsyncCallback<Void>() {
                        @Override
                        public void onFailure(Throwable caught) {
                            clientFactory.getEventBus().fireEvent(new CriticalErrorEvent("Could not save document.", caught));
                        }

                        @Override
                        public void onSuccess(Void result) {
                            // all fine!
                            clientFactory.getEventBus().fireEvent(new NotificationEvent("Document successfully saved."));
                        }
                    });

                } else if (enter.equals(event.getKeyCombo())) {


                    // ------------- Single ENTER -------------
                    if (actionBarCreatePanelControllerPopup.isShowing()) {

                        actionBarCreatePanelControllerPopup.hide();
                        // there is no need to scroll into document
                        // clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(activeOverlayWidget.asWidget(), DraftingDocumentController.this, false, SCROLL_TO_OFFSET));

                        final OverlayWidget selectedSibling = actionBarCreatePanelController.getSelectedSibling();

                        if (selectedSibling != null) {
                            LOG.info("Selected as sibling: " + selectedSibling);

                            final com.google.gwt.user.client.Element clone = DOM.clone(selectedSibling.asWidget().getElement(), true);
                            final OverlayWidget cloneSibling = overlayFactory.getAmendableWidget(clone);

                            // number and format get given by the siblings
                            // but they need to be explicitly set to null
                            cloneSibling.setOverlayStrategy(null);
                            cloneSibling.setFormat(null);
                            cloneSibling.setNumberingType(null);
                            // get the correct index

                            if (inlineEditorController.isShowing()) {
                                clientFactory.getEventBus().fireEvent(new VisualStructureInsertionEvent(cloneSibling));
                            } else {
                                documentEventBus.fireEvent(new OverlayWidgetNewEvent(activeOverlayWidget.getParentOverlayWidget(), activeOverlayWidget, cloneSibling));
                            }

                        }

                        final OverlayWidget selectedChild = actionBarCreatePanelController.getSelectedChild();

                        if (selectedChild != null) {

                            LOG.info("Selected as child: " + selectedChild);
                            final com.google.gwt.user.client.Element clone = DOM.clone(selectedChild.asWidget().getElement(), true);
                            final OverlayWidget cloneChild = overlayFactory.getAmendableWidget(clone);
                            cloneChild.setNumberingType(actionBarCreatePanelController.getSelectedChild().getNumberingType());
                            cloneChild.setFormat(actionBarCreatePanelController.getSelectedChild().getFormat());

                            if (inlineEditorController.isShowing()) {
                                clientFactory.getEventBus().fireEvent(new VisualStructureInsertionEvent(cloneChild));
                            } else {
                                documentEventBus.fireEvent(new OverlayWidgetNewEvent(activeOverlayWidget, activeOverlayWidget, cloneChild));
                            }
                        }
                    } else if (activeOverlayWidget != null || !(inlineEditorController.getOverlayWidget().equals(activeOverlayWidget))) {

                        handleOverlayWidgetModify(activeOverlayWidget);
                    }
                } else if (delete.equals(event.getKeyCombo())) {


                    // ------------- DELETE -------------
                    if (!inlineEditorController.isShowing() && activeOverlayWidget != null) {
                        handleOverlayWidgetDelete(activeOverlayWidget);
                        restoreFocusOnViewPort();
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

        inlineEditorControllerSaveHandlerRegistration = inlineEditorController.getView().getSaveButton().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                modifyOverlayWidget(sourceFileController.getActiveOverlayWidget(), inlineEditorController.getRichTextEditor().getHTML());
                // and finally destroy the instance
                clientFactory.getEventBus().fireEvent(new DetachInlineEditorEvent(MarkupDocumentController.this));
                inlineEditorController.getRichTextEditor().setFocus(false);
                restoreFocusOnViewPort();
            }
        });

        inlineEditorControllerCancelHandlerRegistration = inlineEditorController.getView().getCancelAnchor().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                cancelModify();
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
                documentEventBus.fireEvent(new OverlayWidgetSelectEvent(target, MarkupDocumentController.this));
            }
            // redraw the outline
            redrawOutline(parentOverlayWidget.getRoot());
        }
    }

    public void handleOverlayWidgetModify(final OverlayWidget overlayWidget) {
        if (!inlineEditorController.isShowing()) {
            // first scroll to the widget
            clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                @Override
                public void execute() {
                    clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(overlayWidget.asWidget(), MarkupDocumentController.this, false, SCROLL_TO_OFFSET));
                    // then attach the inline editor
                    clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                        @Override
                        public void execute() {
                            clientFactory.getEventBus().fireEvent(new AttachInlineEditorEvent(overlayWidget, MarkupDocumentController.this));
                        }
                    });
                }
            });


        }
    }

    public void cancelModify() {
        clientFactory.getEventBus().fireEvent(new DetachInlineEditorEvent(MarkupDocumentController.this));
        inlineEditorController.getRichTextEditor().setFocus(false);
        restoreFocusOnViewPort();
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
                } else {
                    LOG.warning("Could not get overlay for " + child);
                }
            }
        }
        overlayWidget.walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
            @Override
            public boolean visit(OverlayWidget visited) {
                // if the widget is amendable, register a listener for its events
                if (visited != null && visited.isAmendable() != null && visited.isAmendable()) {
                    visited.setUIListener(sourceFileController);
                } else {
                    LOG.info(visited + " is NOT amendable.");
                }
                return true;
            }
        });

        // remove the nsesa-inline class name if it's there
        // so the next time we don't automatically attach the inline editor
        final String className = overlayElement.getClassName();
        if (className.contains("nsesa-inline")) {
            overlayElement.setClassName(className.replace("nsesa-inline", ""));
        }

        // highlight
        sourceFileController.highlight(overlayWidget.asWidget(), "black", 1);

        redrawOutline(overlayWidget.getRoot());
    }

    public void redrawOutline(OverlayWidget root) {
        outlineController.setRootOverlayWidget(root);
    }

    @Override
    public void onDocumentContentLoaded(DocumentContentDTO documentContent) {
        showLoadingIndicator(true, "Parsing document.");
        if ("XML".equalsIgnoreCase(documentContent.getDocumentContentType())) {
            sourceFileController.setContent(documentContent);
        } else if ("PLAIN".equalsIgnoreCase(documentContent.getDocumentContentType())) {
            // wrap it in an akoma ntoso body
            final AkomaNtoso akomaNtoso = new AkomaNtoso();
            akomaNtoso.html(documentContent.getContent());

            // replace the original content with the wrapped one
            documentContent.setContent(htmlTransformer.transform(akomaNtoso));
            sourceFileController.setContent(documentContent);
        } else {
            throw new UnsupportedOperationException("The document content type '" + documentContent.getDocumentContentType()
                    + "' is currently unsupported in the client.");
        }
        showLoadingIndicator(true, "Building document tree.");

        clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
            @Override
            public void execute() {
                overlay();
            }
        });
    }

    public void overlay() {
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
                            overlayWidgets.get(0).walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                                @Override
                                public boolean visit(OverlayWidget visited) {
                                    visited.setAmendable(true);
                                    visited.setUIListener(sourceFileController);
                                    return true;
                                }
                            });
                        }
                    }
                });

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

                clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                    @Override
                    public void execute() {
                        final List<OverlayWidget> overlayWidgets = sourceFileController.getOverlayWidgets();
                        if (overlayWidgets != null && !overlayWidgets.isEmpty()) {
                            // only display the first one
                            pickerController.setOverlayWidget(overlayWidgets.get(0));
                            pathController.setOverlayWidget(overlayWidgets.get(0));
                        }
                    }
                });
            }
        });
    }

    public Range getCurrentSelectionRange() {
        return currentSelectionRange;
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
        whiteSpaceEventHandlerRegistration.removeHandler();
        keyComboHandlerRegistration.removeHandler();
        draftingToggleEventHandlerRegistration.removeHandler();
        draftingAttributesToggleEventHandlerRegistration.removeHandler();
        overlayWidgetDeleteHandlerRegistration.removeHandler();
        overlayWidgetModifyHandlerRegistration.removeHandler();
        overlayWidgetNewEventHandlerRegistration.removeHandler();
        inlineEditorControllerSaveHandlerRegistration.removeHandler();
        inlineEditorControllerCancelHandlerRegistration.removeHandler();
        selectionEventHandlerRegistration.removeHandler();
    }

    @Override
    public void setInjector(DocumentInjector injector) {
        this.documentEventBus = injector.getDocumentEventBus();
        this.view = injector.getDocumentView();
        this.deadlineController = injector.getDeadlineController();
        this.deadlineController.setDocumentController(this);
        this.sourceFileController = injector.getSourceFileController();
        this.sourceFileController.setDocumentController(this);

        // TODO this is ugly ...
        if (injector instanceof MarkupDocumentInjector) {
            final MarkupDocumentInjector markupDocumentInjector = (MarkupDocumentInjector) injector;
            this.outlineController = markupDocumentInjector.getOutlineController();
            this.outlineController.setDocumentController(this);

            this.pathController = markupDocumentInjector.getPathController();
            this.pathController.setDocumentController(this);

            this.pickerController = markupDocumentInjector.getPickerController();
            this.pickerController.setDocumentController(this);

            this.actionBarController = markupDocumentInjector.getActionBarController();
            this.actionBarController.setSourceFileController(sourceFileController);

            this.actionBarCreatePanelController = markupDocumentInjector.getActionBarCreatePanelController();
            this.actionBarCreatePanelController.setSourceFileController(sourceFileController);
            this.actionBarCreatePanelFocusPanel.setWidget(actionBarCreatePanelController.getView());
            this.actionBarCreatePanelControllerPopup.setWidget(actionBarCreatePanelFocusPanel);
        }
    }

    @Override
    public DocumentInjector getInjector() {
        return GWT.create(MarkupDocumentInjector.class);
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
