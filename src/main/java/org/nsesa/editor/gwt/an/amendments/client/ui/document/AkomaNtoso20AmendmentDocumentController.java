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
package org.nsesa.editor.gwt.an.amendments.client.ui.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;
import org.nsesa.editor.gwt.amendment.client.amendment.AmendmentInjectionPointFinder;
import org.nsesa.editor.gwt.amendment.client.event.amendment.AmendmentContainerSaveEvent;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.amendment.client.ui.document.AmendmentDocumentController;
import org.nsesa.editor.gwt.an.amendments.client.MyAmendmentDocumentInjector;
import org.nsesa.editor.gwt.an.amendments.client.handler.common.content.AkomaNtoso20AmendmentBuilder;
import org.nsesa.editor.gwt.an.amendments.client.mode.ColumnMode;
import org.nsesa.editor.gwt.an.amendments.client.mode.ConsolidationMode;
import org.nsesa.editor.gwt.an.amendments.client.mode.DiffMode;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtosoAmendmentControllerUtil;
import org.nsesa.editor.gwt.an.common.client.mode.StructureViewMode;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.event.KeyComboEvent;
import org.nsesa.editor.gwt.core.client.event.KeyComboEventHandler;
import org.nsesa.editor.gwt.core.client.event.document.DocumentOverlayCompletedEvent;
import org.nsesa.editor.gwt.core.client.event.document.DocumentOverlayCompletedEventHandler;
import org.nsesa.editor.gwt.core.client.event.widget.OverlayWidgetStructureChangeEvent;
import org.nsesa.editor.gwt.core.client.event.widget.OverlayWidgetStructureChangeEventHandler;
import org.nsesa.editor.gwt.core.client.keyboard.KeyboardListener;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.ui.overlay.Creator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Mover;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetSelector;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.core.shared.AmendableWidgetReference;
import org.nsesa.editor.gwt.core.shared.AmendmentContainerDTO;
import org.nsesa.editor.gwt.core.shared.PersonDTO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;

/**
 * Date: 10/01/13 11:23
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentDocumentController extends AmendmentDocumentController {

    private static final Logger LOG = Logger.getLogger(AkomaNtoso20AmendmentDocumentController.class.getName());

    private final KeyboardListener keyboardListener;
    private AmendmentInjectionPointFinder amendmentInjectionPointFinder;

    // --- key combos ---

    final KeyboardListener.KeyCombo ctrlEnter = new KeyboardListener.KeyCombo(false, false, true, KeyCodes.KEY_ENTER);

    private HandlerRegistration documentOverlayCompletedEventHandler;
    private HandlerRegistration keyComboHandlerRegistration;
    private HandlerRegistration structureChangeHandlerRegistration;

    @Inject
    public AkomaNtoso20AmendmentDocumentController(final ClientFactory clientFactory,
                                                   final ServiceFactory serviceFactory,
                                                   final OverlayFactory overlayFactory,
                                                   final Locator locator,
                                                   final Creator creator,
                                                   final Mover mover,
                                                   final KeyboardListener keyboardListener,
                                                   final AmendmentInjectionPointFinder amendmentInjectionPointFinder) {
        super(clientFactory, serviceFactory, overlayFactory, locator, creator, mover);
        this.keyboardListener = keyboardListener;
        this.amendmentInjectionPointFinder = amendmentInjectionPointFinder;
    }

    @Override
    public void registerKeyCombos() {
        super.registerKeyCombos();
        keyboardListener.register(ctrlEnter);
    }

    @Override
    public void registerModes() {
        super.registerModes();
        registerMode(DiffMode.KEY, new DiffMode(this, clientFactory, serviceFactory));
        registerMode(ConsolidationMode.KEY, new ConsolidationMode(this, clientFactory));
        registerMode(ColumnMode.KEY, new ColumnMode(this, clientFactory));
        registerMode(StructureViewMode.KEY, new StructureViewMode(this));
    }

    public void registerListeners() {
        super.registerListeners();
        documentOverlayCompletedEventHandler = documentEventBus.addHandler(DocumentOverlayCompletedEvent.TYPE, new DocumentOverlayCompletedEventHandler() {
            @Override
            public void onEvent(DocumentOverlayCompletedEvent event) {
                applyState(DiffMode.KEY, new ActiveState(true));
            }
        });

        keyComboHandlerRegistration = clientFactory.getEventBus().addHandler(KeyComboEvent.TYPE, new KeyComboEventHandler() {
            @Override
            public void onEvent(KeyComboEvent event) {
                LOG.info("Key combo " + event.getKeyCombo());
            }
        });

        structureChangeHandlerRegistration = documentEventBus.addHandler(OverlayWidgetStructureChangeEvent.TYPE, new OverlayWidgetStructureChangeEventHandler() {
            @Override
            public void onEvent(OverlayWidgetStructureChangeEvent event) {
                final ArrayList<AmendmentContainerDTO> amendments = new ArrayList<AmendmentContainerDTO>();
                for (final OverlayWidget widget : event.getAffectedWidgets()) {
                    if (widget.getOverlayWidgetAwareList() != null && !widget.getOverlayWidgetAwareList().isEmpty()) {
                        AmendmentController controller = (AmendmentController) widget.getOverlayWidgetAwareList().get(0);
                        boolean needUpdate = updateAmendmentAfterStructuralChange(controller);
                        if (needUpdate) {
                            amendments.add(controller.getModel());
                        }
                    }
                }
                if (!amendments.isEmpty()) {
                    documentEventBus.fireEvent(new AmendmentContainerSaveEvent(amendments.toArray(new AmendmentContainerDTO[0])));
                }
            }
        });

    }

    @Override
    public org.nsesa.editor.gwt.amendment.client.ui.document.AmendmentDocumentInjector getInjector() {
        return GWT.create(MyAmendmentDocumentInjector.class);
    }

    @Override
    public void removeListeners() {
        super.removeListeners();
        documentOverlayCompletedEventHandler.removeHandler();
        keyComboHandlerRegistration.removeHandler();
        structureChangeHandlerRegistration.removeHandler();
    }

    /**
     * Update an amendment after structural change
     *
     * @param amendmentController
     * @return True when the amendment content needs to be changed
     */
    private boolean updateAmendmentAfterStructuralChange(AmendmentController amendmentController) {
        //identify the new overlay widget reference to be used when determining widget reference
        final OverlayWidget newWidgetReference = determineWidgetReference(amendmentController.getOverlayWidget());
        AmendableWidgetReference newReference = amendmentInjectionPointFinder.getInjectionPoint(
                amendmentController.getOverlayWidget().getParentOverlayWidget(),
                newWidgetReference,
                amendmentController.getOverlayWidget());

        AmendableWidgetReference oldReference = amendmentController.getModel().getSourceReference();

        // oldReference and newReference are the same no need to update the amendment content
        if (oldReference.getPath().equalsIgnoreCase(newReference.getPath()) && oldReference.getOffset().equals(newReference.getOffset())) {
            return false;
        }

        final HashSet<PersonDTO> persons = new HashSet<PersonDTO>();
        String justification = "";
        String notes = "";
        final OverlayWidget amendmentBodyOverlayWidget = amendmentController.asAmendableWidget(amendmentController.getModel().getBody());

        final Preface preface = (Preface) OverlayUtil.findSingle("preface", amendmentBodyOverlayWidget);
        final Container container = preface.getContainers().get(0);
        if (container != null && "authors".equals(container.nameAttr().getValue())) {
            List<OverlayWidget> docProponents = OverlayUtil.find("docProponent", container);
            for (final OverlayWidget docProponent : docProponents) {
                if (docProponent instanceof DocProponent) {
                    final DocProponent proponent = (DocProponent) docProponent;
                    final String refersToID = proponent.refersToAttr().getValue();

                    final TLCPerson tlcPerson = (TLCPerson) OverlayUtil.xpathSingle(refersToID, amendmentBodyOverlayWidget);
                    final String id = tlcPerson.hrefAttr().getValue().substring(tlcPerson.hrefAttr().getValue().lastIndexOf(":") + 1);
                    serviceFactory.getGwtService().getPerson(clientFactory.getClientContext(), id, new AsyncCallback<PersonDTO>() {
                        @Override
                        public void onFailure(Throwable caught) {
                            LOG.warning("Could not retrieve person: " + caught);
                        }

                        @Override
                        public void onSuccess(PersonDTO result) {
                            persons.add(result);
                        }
                    });
                }
            }
        }

        // get meta (justification, notes, ...)
        final AmendmentJustification amendmentJustification =
                (AmendmentJustification) OverlayUtil.findSingle("amendmentJustification", amendmentBodyOverlayWidget);
        if (amendmentJustification != null) {
            justification = amendmentJustification.getPs().get(0).getInnerHTML().trim();
        }
        final Mod mod = (Mod) OverlayUtil.findSingle("mod", amendmentBodyOverlayWidget);
        if (mod != null) {
            final List<AuthorialNote> authorialNotes = mod.getAuthorialNotes();
            if (authorialNotes != null && !authorialNotes.isEmpty()) {
                notes = authorialNotes.get(0).html().trim();
            }
        }

        final AkomaNtoso20AmendmentBuilder builder = new AkomaNtoso20AmendmentBuilder(overlayFactory);
        final String languageIso = amendmentController.getDocumentController().getDocument().getLanguageIso();
        // set the num
        String num = locator.getNum(amendmentController.getOverlayWidget(), clientFactory.getClientContext().getDocumentTranslationLanguageCode(), true);
        AkomaNtosoAmendmentControllerUtil.setAmendmentNumOnModel(amendmentController, num);

        final OverlayWidget amendmentContentFromModel = AkomaNtosoAmendmentControllerUtil.getAmendmentContentFromModel(amendmentController);
        String content = amendmentContentFromModel.getInnerHTML();
        final OverlayWidget amendmentOverlayWidget = amendmentController.asAmendableWidget(content);

        //build again the amendment
        final OverlayWidget originalContentFromModel = AkomaNtosoAmendmentControllerUtil.getOriginalContentFromModel(amendmentController);
        builder
                .setOverlayWidget(amendmentController.getOverlayWidget())
                .setLanguageIso(languageIso)
                .setAuthors(persons)
                .setLocation(locator.getLocation(amendmentController.getOverlayWidget(), languageIso, true))
                .setOriginalText(originalContentFromModel.getInnerHTML())
                .setAmendmentText(amendmentOverlayWidget.getInnerHTML())
                .setModifyIds(true)
                .setJustification(justification)
                .setNotes(notes);
        amendmentController.getModel().setSourceReference(newReference);
        amendmentController.getModel().setRoot(builder.build());

        return true;
    }

    /**
     * Determine the overlay widget reference
     *
     * @param overlayWidget
     * @return {@link OverlayWidget} as reference
     */
    private OverlayWidget determineWidgetReference(OverlayWidget overlayWidget) {
        OverlayWidget reference = overlayWidget.getPreviousSibling(new OverlayWidgetSelector() {
            @Override
            public boolean select(OverlayWidget toSelect) {
                return !toSelect.isIntroducedByAnAmendment() &&
                        (toSelect instanceof BasehierarchyComplexType || toSelect instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType);
            }
        });
        if (reference == null) {
            reference = overlayWidget.getNextSibling(new OverlayWidgetSelector() {
                @Override
                public boolean select(OverlayWidget toSelect) {
                    return !toSelect.isIntroducedByAnAmendment() &&
                            (toSelect instanceof BasehierarchyComplexType || toSelect instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType);
                }
            });
        }
        if (reference == null) {
            reference = overlayWidget.getParentOverlayWidget();
        }
        return reference;
    }
}
