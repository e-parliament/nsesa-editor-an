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

import com.allen_sauer.gwt.dnd.client.DragContext;
import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.VetoDragException;
import com.allen_sauer.gwt.dnd.client.drop.VerticalPanelDropController;
import com.bfr.client.selection.Range;
import com.bfr.client.selection.RangeEndPoint;
import com.bfr.client.selection.Selection;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Text;
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
import org.nsesa.editor.gwt.an.common.client.event.SelectionEvent;
import org.nsesa.editor.gwt.an.common.client.event.SelectionEventHandler;
import org.nsesa.editor.gwt.an.common.client.mode.StructureViewMode;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.AkomaNtosoUtil;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Num;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Preface;
import org.nsesa.editor.gwt.an.drafting.client.event.DocumentToggleStructureEvent;
import org.nsesa.editor.gwt.an.drafting.client.event.DocumentToggleStructureEventHandler;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.numbering.NumberingController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.outline.OutlineController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.source.SourceController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.path.PathController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.picker.PickerController;
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
import org.nsesa.editor.gwt.core.client.ui.rte.event.RTEStructureChangedEvent;
import org.nsesa.editor.gwt.core.client.ui.rte.event.RTEStructureChangedEventHandler;
import org.nsesa.editor.gwt.core.client.util.NodeUtil;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.core.client.util.OverlayWidgetHolder;
import org.nsesa.editor.gwt.core.shared.DocumentContentDTO;
import org.nsesa.editor.gwt.core.shared.DocumentDTO;
import org.nsesa.editor.gwt.core.shared.OverlayWidgetOrigin;
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
public class DraftingDocumentController extends DefaultDocumentController {

    private static final Logger LOG = Logger.getLogger(DraftingDocumentController.class.getName());

    public static final int SCROLL_TO_OFFSET = 200;

    private final OverlaySnippetFactory overlaySnippetFactory;

    private final OverlaySnippetEvaluator overlaySnippetEvaluator;

    private final OverlayWidgetInjectionStrategy overlayWidgetInjectionStrategy;

    private final Formatter formatter;

    private OutlineController outlineController;

    private SourceController sourceController;

    private ActionBarController actionBarController;

    private PickerController pickerController;

    private NumberingController numberingController;

    private PathController pathController;

    // popup with available child controllers
    private ActionBarCreatePanelController actionBarCreatePanelController;

    private FocusPanel actionBarCreatePanelFocusPanel = new FocusPanel();

    private PopupPanel actionBarCreatePanelControllerPopup = new PopupPanel();

    // ------------- selector ------------------------
    private final OverlayWidgetSelector upDownOverlayWidgetSelector = new OverlayWidgetSelector() {
        @Override
        public boolean select(OverlayWidget toSelect) {
            return toSelect.getOverlayElement().getClassName().contains("nsesa-inline")
                    || AkomaNtosoUtil.representsBlock(toSelect);
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
    private HandlerRegistration rteStructureChangedEventHandlerRegistration;
    private HandlerRegistration documentScrollToEventHandlerRegistration;
    private HandlerRegistration keyComboHandlerRegistration;
    private HandlerRegistration draftingToggleEventHandlerRegistration;
    private HandlerRegistration draftingAttributesToggleEventHandlerRegistration;
    private HandlerRegistration numberingTypeEventHandlerRegistration;
    private HandlerRegistration formatEventHandlerRegistration;

    // ----------------- keyboard shortcuts ---------------------
    private KeyboardListener.KeyCombo ctrlEnter = new KeyboardListener.KeyCombo(false, false, true, KeyCodes.KEY_ENTER);
    private KeyboardListener.KeyCombo enter = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_ENTER);
    private KeyboardListener.KeyCombo tab = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_TAB);
    private KeyboardListener.KeyCombo escape = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_ESCAPE);
    private KeyboardListener.KeyCombo delete = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_DELETE);

    private KeyboardListener.KeyCombo ctrlS = new KeyboardListener.KeyCombo(false, false, true, 83); // 83 is 's' key

    private KeyboardListener.KeyCombo upArrow = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_UP);
    private KeyboardListener.KeyCombo downArrow = new KeyboardListener.KeyCombo(false, false, false, KeyCodes.KEY_DOWN);

    private KeyboardListener.KeyCombo altUpArrow = new KeyboardListener.KeyCombo(false, true, false, KeyCodes.KEY_UP);
    private KeyboardListener.KeyCombo altDownArrow = new KeyboardListener.KeyCombo(false, true, false, KeyCodes.KEY_DOWN);

    private Range currentSelectionRange;
    private HandlerRegistration selectionEventHandlerRegistration;

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
                                      final OverlayWidgetInjectionStrategy overlayWidgetInjectionStrategy,
                                      final OverlaySnippetFactory overlaySnippetFactory,
                                      final OverlaySnippetEvaluator overlaySnippetEvaluator,
                                      final @Named("xml") Formatter formatter) {
        super(clientFactory, serviceFactory, overlayFactory, locator, creator, mover);
        this.overlaySnippetFactory = overlaySnippetFactory;
        this.overlaySnippetEvaluator = overlaySnippetEvaluator;
        this.formatter = formatter;
        this.overlayWidgetInjectionStrategy = overlayWidgetInjectionStrategy;
    }

    @Override
    public void registerKeyCombos() {
        super.registerKeyCombos();
        clientFactory.getKeyboardListener().register(ctrlEnter, enter, tab, escape, delete, ctrlS, upArrow, downArrow, altUpArrow, altDownArrow);
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

        rteStructureChangedEventHandlerRegistration = clientFactory.getEventBus().addHandler(RTEStructureChangedEvent.TYPE, new RTEStructureChangedEventHandler() {
            @Override
            public void onEvent(final RTEStructureChangedEvent event) {
                clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                    @Override
                    public void execute() {
                        handleRTEOverlayWidgetModify(event.getOverlayWidget());
                    }
                });

            }
        });

        selectionEventHandlerRegistration = clientFactory.getEventBus().addHandler(SelectionEvent.TYPE, new SelectionEventHandler() {
            @Override
            public void onEvent(SelectionEvent event) {
                if (event.getSelection().getRange() != null && !"".equalsIgnoreCase(event.getSelection().getRange().getText().trim())) {
                    setCurrentSelectionRange(event.getSelection().getRange());
                    if (LOG.isLoggable(Level.FINE)) {
                        LOG.fine("Current selection: " + (currentSelectionRange != null ? currentSelectionRange.getHtmlText() : "<<null>>"));
                    }
                }
            }
        });

        overlayWidgetSelectEventHandlerRegistration = documentEventBus.addHandler(OverlayWidgetSelectEvent.TYPE, new OverlayWidgetSelectEventHandler() {
            @Override
            public void onEvent(OverlayWidgetSelectEvent event) {
                final OverlayWidget activeOverlayWidget = event.getOverlayWidget();
                sourceFileController.setActiveOverlayWidget(activeOverlayWidget);

                sourceController.setOverlayWidget(activeOverlayWidget);

                if (activeOverlayWidget != null) {

                    final OverlayWidget block = AkomaNtosoUtil.findEnclosingBlock(activeOverlayWidget);

                    if (block != null) {
                        //actionBarCreatePanelController.setOverlayWidget(block);

                        //actionBarController.attach(block, DraftingDocumentController.this);
                        // actionBarController.setLocation(locator.getLocation(block, document.getLanguageIso(), true));
                        numberingController.setOverlayWidget(block);
                    }

                    pickerController.setOverlayWidget(activeOverlayWidget);
                    pathController.setOverlayWidget(activeOverlayWidget);

                    // set the cursor
                    final Range browserRange = Selection.getBrowserRange();
                    if (browserRange != null) {

                        final OverlayWidgetHolder holder = new OverlayWidgetHolder();
                        activeOverlayWidget.walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                            @Override
                            public boolean visit(OverlayWidget visited) {
                                if (holder.getOverlayWidget() == null /* only find the first one */ && visited.getOverlayElement().getClassName().contains("caretPosition")) {
                                    holder.setOverlayWidget(visited);
                                    return false;
                                }
                                return true;
                            }
                        });
                        if (holder.getOverlayWidget() == null) {
                            activeOverlayWidget.walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                                @Override
                                public boolean visit(OverlayWidget visited) {
                                    if (holder.getOverlayWidget() == null /* only find the first one */ && activeOverlayWidget != visited) {
                                        if (AkomaNtosoUtil.representsNum(visited)) {
                                            holder.setOverlayWidget(visited.getNextSibling(new OverlayWidgetSelector.AnyOverlayWidgetSelector()));
                                        }
                                        return false;
                                    }
                                    return true;
                                }
                            });
                        }
                        final OverlayWidget toFocus = holder.getOverlayWidget() != null ? holder.getOverlayWidget() : activeOverlayWidget;
                        activeOverlayWidget.getOverlayElement().focus();

                        final Text text = NodeUtil.getText(toFocus.getOverlayElement(), true);

                        if (text != null) {
                            final String trimmedContent = text.getData().trim();
                            if (toFocus.getOverlayElement().getClassName().contains("caretPosition") || (trimmedContent.startsWith("{")) && trimmedContent.endsWith("}")) {
                                Selection.getSelection().setRange(new Range(new RangeEndPoint(text, true), new RangeEndPoint(text, false)));
                            }
                        } else {
                            // no text part found? Hmmm ...
                        }

                        // clean up the caret position
                        toFocus.getOverlayElement().removeClassName("caretPosition");
                    }
                }

            }
        });

        numberingTypeEventHandlerRegistration = documentEventBus.addHandler(OverlayWidgetNumberingTypeEvent.TYPE, new OverlayWidgetNumberingTypeEventHandler() {
            @Override
            public void onEvent(OverlayWidgetNumberingTypeEvent event) {
                event.getOverlayWidget().setOrigin(OverlayWidgetOrigin.GENERATED);
                setNumbering(event.getOverlayWidget().getParentOverlayWidget(), event.getNumberingType());
            }
        });

        formatEventHandlerRegistration = documentEventBus.addHandler(OverlayWidgetFormatEvent.TYPE, new OverlayWidgetFormatEventHandler() {
            @Override
            public void onEvent(OverlayWidgetFormatEvent event) {
                event.getOverlayWidget().setOrigin(OverlayWidgetOrigin.GENERATED);
                setFormat(event.getOverlayWidget().getParentOverlayWidget(), event.getFormat());
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

                final OverlayWidget activeOverlayWidget = sourceFileController.getActiveOverlayWidget();

                if (AkomaNtosoUtil.representsBlock(activeOverlayWidget)) {
                    OverlayWidget result = event.getChild();
                    result.setOrigin(OverlayWidgetOrigin.GENERATED);
                    OverlaySnippet snippet = overlaySnippetFactory.getSnippet(activeOverlayWidget);
                    if (snippet != null) {
                        overlaySnippetEvaluator.addEvaluator(
                                new DefaultNumEvaluator(
                                        clientFactory,
                                        overlayWidgetInjectionStrategy,
                                        locator,
                                        result,
                                        event.getParentOverlayWidget(),
                                        event.getReference()));

                        final String content = snippet.getContent(overlaySnippetEvaluator);
                        if (content != null) {
                            result.getOverlayElement().setInnerHTML(content);

                            result.getChildOverlayWidgets().clear();
                            result = overlayFactory.getAmendableWidget(result.getOverlayElement());

                            overlayWidgetInjectionStrategy.injectAsSibling(activeOverlayWidget, result);

                            result.walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                                @Override
                                public boolean visit(OverlayWidget visited) {
                                    //if (AkomaNtosoUtil.representsBlock(visited)) {
                                    visited.setUIListener(sourceFileController);
                                    //}
                                    return super.visit(visited);
                                }
                            });

                            // make sure we can edit this
                            result.setAmendable(true);
                            markOverlayWidgetAsAmendable(result);

                            documentEventBus.fireEvent(new OverlayWidgetSelectEvent(result, DraftingDocumentController.this));

                            reCalculateNumbering(activeOverlayWidget.getParentOverlayWidget());
                            redrawOutline(activeOverlayWidget.getRoot());
                        }
                    }
                }
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
                            actionBarCreatePanelControllerPopup.showRelativeTo(actionBarController.getView().getChildHandler());
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
                    } else {
                        cancelModify();
                    }
                } else if (ctrlS.equals(event.getKeyCombo())) {


                    // ------------- CTRL + s -------------
                    final String content = formatter.format(sourceFileController.getOverlayWidgets().get(0));
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

                } else if (downArrow.equals(event.getKeyCombo())) {


                    // ------------- Down arrow -------------
                    if (actionBarCreatePanelControllerPopup.isShowing()) {
                        actionBarCreatePanelFocusPanel.setFocus(true);
                        actionBarCreatePanelController.highlightNext();
                    } else {

                        final OverlayWidget next = activeOverlayWidget != null ? activeOverlayWidget.next(upDownOverlayWidgetSelector) : sourceFileController.getOverlayWidgets().get(0);
                        if (next != null) {
                            documentEventBus.fireEvent(new OverlayWidgetSelectEvent(next, DraftingDocumentController.this));
                            clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(next.asWidget(), DraftingDocumentController.this, false, SCROLL_TO_OFFSET));
                        }
                    }

                } else if (upArrow.equals(event.getKeyCombo())) {


                    // ------------- Up arrow -------------

                    if (actionBarCreatePanelControllerPopup.isShowing()) {
                        actionBarCreatePanelFocusPanel.setFocus(true);
                        actionBarCreatePanelController.highlightPrevious();
                    } else {
                        if (activeOverlayWidget != null) {
                            final OverlayWidget previous = activeOverlayWidget.previous(upDownOverlayWidgetSelector);
                            if (previous != null) {
                                documentEventBus.fireEvent(new OverlayWidgetSelectEvent(previous, DraftingDocumentController.this));
                                clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(previous.asWidget(), DraftingDocumentController.this, false, SCROLL_TO_OFFSET));
                            }
                        }
                    }

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
                            cloneSibling.setNumberingType(actionBarCreatePanelController.getSelectedSibling().getNumberingType());
                            cloneSibling.setFormat(actionBarCreatePanelController.getSelectedSibling().getFormat());

                            documentEventBus.fireEvent(new OverlayWidgetNewEvent(activeOverlayWidget.getParentOverlayWidget(), activeOverlayWidget, cloneSibling));

                        }

                        final OverlayWidget selectedChild = actionBarCreatePanelController.getSelectedChild();

                        if (selectedChild != null) {

                            LOG.info("Selected as child: " + selectedChild);
                            final com.google.gwt.user.client.Element clone = DOM.clone(selectedChild.asWidget().getElement(), true);
                            final OverlayWidget cloneChild = overlayFactory.getAmendableWidget(clone);
                            cloneChild.setNumberingType(actionBarCreatePanelController.getSelectedChild().getNumberingType());
                            cloneChild.setFormat(actionBarCreatePanelController.getSelectedChild().getFormat());

                            documentEventBus.fireEvent(new OverlayWidgetNewEvent(activeOverlayWidget, activeOverlayWidget, cloneChild));
                        }
                    } else if (activeOverlayWidget != null) {

                        // we might not have selected a block, so go up

                        final OverlayWidget block = AkomaNtosoUtil.findEnclosingBlock(activeOverlayWidget);

                        if (block != null) {
                            OverlayWidget result = overlayFactory.getAmendableWidget(block.getNamespaceURI(), block.getType());
                            result.setOrigin(OverlayWidgetOrigin.GENERATED);
                            OverlaySnippet snippet = overlaySnippetFactory.getSnippet(block);
                            if (snippet != null) {
                                overlaySnippetEvaluator.addEvaluator(
                                        new DefaultNumEvaluator(
                                                clientFactory,
                                                overlayWidgetInjectionStrategy,
                                                locator,
                                                result,
                                                block.getParentOverlayWidget(),
                                                block));

                                final String content = snippet.getContent(overlaySnippetEvaluator);
                                if (content != null) {
                                    result.getOverlayElement().setInnerHTML(content);

                                    result.getChildOverlayWidgets().clear();
                                    result = overlayFactory.getAmendableWidget(result.getOverlayElement());

                                    overlayWidgetInjectionStrategy.injectAsSibling(block, result);

                                    result.walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                                        @Override
                                        public boolean visit(OverlayWidget visited) {
//                                            if (AkomaNtosoUtil.representsBlock(visited)) {
                                            visited.setUIListener(sourceFileController);
//                                            }
                                            return super.visit(visited);
                                        }
                                    });

                                    // make sure we can edit this
                                    result.setAmendable(true);
                                    markOverlayWidgetAsAmendable(result);

                                    documentEventBus.fireEvent(new OverlayWidgetSelectEvent(result, DraftingDocumentController.this));

                                    reCalculateNumbering(block.getParentOverlayWidget());
                                    redrawOutline(block.getRoot());
                                }
                            }
                        }

                    }
                } else if (tab.equals(event.getKeyCombo())) {


                    // ------------- Single TAB -------------

                } else if (delete.equals(event.getKeyCombo())) {


                    // ------------- DELETE -------------
                    if (activeOverlayWidget != null) {
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
                                    clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(activeOverlayWidget.asWidget(), DraftingDocumentController.this, false, SCROLL_TO_OFFSET));
                                    // TODO schedule via timer
                                    reCalculateNumbering(activeOverlayWidget.getParentOverlayWidget());
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
                                    clientFactory.getEventBus().fireEvent(new DocumentScrollToEvent(activeOverlayWidget.asWidget(), DraftingDocumentController.this, false, SCROLL_TO_OFFSET));
                                    // TODO schedule via timer
                                    reCalculateNumbering(activeOverlayWidget.getParentOverlayWidget());
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
                //inlineEditorController.getRichTextEditor().toggleVisualStructure(event.isShown());
            }
        });
        draftingAttributesToggleEventHandlerRegistration = clientFactory.getEventBus().addHandler(VisualStructureAttributesToggleEvent.TYPE, new VisualStructureAttributesToggleEventHandler() {
            @Override
            public void onEvent(VisualStructureAttributesToggleEvent event) {
                //inlineEditorController.getRichTextEditor().toggleVisualStructureAttributes(event.isShown());
            }
        });
    }

    public void handleOverlayWidgetDelete(final OverlayWidget overlayWidget) {
        final OverlayWidget parentOverlayWidget = overlayWidget.getParentOverlayWidget();
        if (parentOverlayWidget != null) {

            // find the target to make active after the deletion
            OverlayWidget target = overlayWidget.next(upDownOverlayWidgetSelector);
            if (target == null) target = overlayWidget.previous(upDownOverlayWidgetSelector);

            parentOverlayWidget.removeOverlayWidget(overlayWidget);
            overlayWidget.getOverlayElement().removeFromParent();

            if (target != null) {
                documentEventBus.fireEvent(new OverlayWidgetSelectEvent(target, DraftingDocumentController.this));
            }
            // redraw the outline
            reCalculateNumbering(parentOverlayWidget);
            redrawOutline(parentOverlayWidget.getRoot());
        }
    }

    public void handleRTEOverlayWidgetModify(final OverlayWidget parent) {
        for (final OverlayWidget child : parent.getChildOverlayWidgets()) {
            OverlayWidget num = OverlayUtil.findSingle("num", child);
            if (num != null && num.getParentOverlayWidget() == child) {
                num.setInnerHTML(locator.getNum(child, document.getLanguageIso(), true));
            }
        }
    }

    public void cancelModify() {
        restoreFocusOnViewPort();
    }

    public void modifyOverlayWidget(final OverlayWidget overlayWidget, final String innerHTML) {

        /*final Element overlayElement = inlineEditorController.getOverlayWidget().getOverlayElement();

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
        }*/

        // highlight
        // sourceFileController.highlight(overlayWidget.asWidget(), "black", 1);

        reCalculateNumbering(overlayWidget.getParentOverlayWidget());
    }

    public void redrawOutline(OverlayWidget root) {
        outlineController.setRootOverlayWidget(root);
    }

    public void reCalculateNumbering(OverlayWidget parent) {
        if (parent != null) {
            for (final OverlayWidget child : parent.getChildOverlayWidgets()) {
                OverlayWidget num = OverlayUtil.xpathSingle("//*/num", child);
                if (num != null) {
                    final String formatted = locator.getNum(child, document.getLanguageIso(), true);
                    num.setInnerHTML(formatted);
                    // force a reset
                    child.setUnformattedIndex(null);
                    child.setFormattedIndex(null);
                }
            }
            redrawOutline(parent.getRoot());
        }
    }

    public void setNumbering(OverlayWidget parent, NumberingType numberingType) {
        if (parent != null) {
            for (final OverlayWidget child : parent.getChildOverlayWidgets()) {
                child.setOrigin(OverlayWidgetOrigin.GENERATED);
                child.setNumberingType(numberingType);
                child.setUnformattedIndex(null);
                child.setFormattedIndex(null);
            }
            reCalculateNumbering(parent);
        }
    }

    public void setFormat(OverlayWidget parent, Format format) {
        if (parent != null) {
            for (final OverlayWidget child : parent.getChildOverlayWidgets()) {
                child.setOrigin(OverlayWidgetOrigin.GENERATED);
                child.setFormat(format);
                child.setUnformattedIndex(null);
                child.setFormattedIndex(null);
            }
        }
        reCalculateNumbering(parent);
    }

    @Override
    public void onDocumentContentLoaded(DocumentContentDTO content) {
        showLoadingIndicator(true, "Parsing document.");
        sourceFileController.setContent(content);
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
                        // find the first element that has the nsesa-inline class name, and select it
                        clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                            @Override
                            public void execute() {
                                final List<OverlayWidget> overlayWidgets = sourceFileController.getOverlayWidgets();
                                if (overlayWidgets != null && !overlayWidgets.isEmpty()) {
                                    // only display the first one
                                    overlayWidgets.get(0).walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                                        @Override
                                        public boolean visit(OverlayWidget visited) {
                                            if (visited.getOverlayElement().getClassName().contains("nsesa-select")) {
                                                documentEventBus.fireEvent(new OverlayWidgetSelectEvent(visited, DraftingDocumentController.this));
                                                return false;
                                            }
                                            return true;
                                        }
                                    });
                                }
                            }
                        });

                        // for giggles, set the document root
                        clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                            @Override
                            public void execute() {
                                final List<OverlayWidget> overlayWidgets = sourceFileController.getOverlayWidgets();
                                if (overlayWidgets != null && !overlayWidgets.isEmpty()) {
                                    // only display the first one
                                    sourceController.setOverlayWidget(overlayWidgets.get(0));
                                }
                            }
                        });

                        // set content editable on certain elements
                        clientFactory.getScheduler().scheduleDeferred(new Scheduler.ScheduledCommand() {
                            @Override
                            public void execute() {
                                final List<OverlayWidget> overlayWidgets = sourceFileController.getOverlayWidgets();
                                if (overlayWidgets != null && !overlayWidgets.isEmpty()) {
                                    for (OverlayWidget root : overlayWidgets) {
                                        root.walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
                                            @Override
                                            public boolean visit(OverlayWidget visited) {
                                                markOverlayWidgetAsAmendable(visited);
                                                return super.visit(visited);
                                            }
                                        });
                                    }
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
        });
    }

    private void markOverlayWidgetAsAmendable(OverlayWidget visited) {
        if (visited.isAmendable()) {
            visited.getOverlayElement().setAttribute("contenteditable", "true");
        }
        if (visited instanceof Preface) {
            visited.getOverlayElement().setAttribute("contenteditable", "true");
        }
        if (visited.isImmutable()) {
            visited.getOverlayElement().setAttribute("contenteditable", "false");
        }
        if (visited instanceof Num) {
            visited.getOverlayElement().setAttribute("contenteditable", "false");
        }
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
        rteStructureChangedEventHandlerRegistration.removeHandler();
        documentScrollToEventHandlerRegistration.removeHandler();
        documentToggleStructureEventHandler.removeHandler();
        keyComboHandlerRegistration.removeHandler();
        draftingToggleEventHandlerRegistration.removeHandler();
        draftingAttributesToggleEventHandlerRegistration.removeHandler();
        overlayWidgetDeleteHandlerRegistration.removeHandler();
        overlayWidgetModifyHandlerRegistration.removeHandler();
        overlayWidgetNewEventHandlerRegistration.removeHandler();
        selectionEventHandlerRegistration.removeHandler();
        numberingTypeEventHandlerRegistration.removeHandler();
        formatEventHandlerRegistration.removeHandler();
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
        if (injector instanceof DraftingDocumentInjector) {
            final DraftingDocumentInjector draftingDocumentInjector = (DraftingDocumentInjector) injector;
            this.outlineController = draftingDocumentInjector.getOutlineController();
            this.outlineController.setDocumentController(this);
            this.sourceController = draftingDocumentInjector.getSourceController();
            this.sourceController.setDocumentController(this);
            this.sourceController.setFormatter(formatter);
            this.actionBarController = draftingDocumentInjector.getActionBarController();
            this.actionBarController.setSourceFileController(sourceFileController);

            this.actionBarCreatePanelController = draftingDocumentInjector.getActionBarCreatePanelController();
            this.actionBarCreatePanelController.setSourceFileController(sourceFileController);
            this.actionBarCreatePanelFocusPanel.setWidget(actionBarCreatePanelController.getView());
            this.actionBarCreatePanelControllerPopup.setWidget(actionBarCreatePanelFocusPanel);

            this.pathController = draftingDocumentInjector.getPathController();
            this.pathController.setDocumentController(this);

            this.pickerController = draftingDocumentInjector.getPickerController();
            this.pickerController.setDocumentController(this);

            this.numberingController = draftingDocumentInjector.getNumberingController();
            this.numberingController.setDocumentController(this);
        }
    }

    @Override
    public DocumentInjector getInjector() {
        return GWT.create(DraftingDocumentInjector.class);
    }

    public Range getCurrentSelectionRange() {
        return currentSelectionRange;
    }

    public void setCurrentSelectionRange(Range currentSelectionRange) {
        this.currentSelectionRange = currentSelectionRange;
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
