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
package org.nsesa.editor.gwt.an.amendments.client.handler.create;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.amendment.client.amendment.AmendmentInjectionPointFinder;
import org.nsesa.editor.gwt.an.amendments.client.handler.common.content.AkomaNtoso20AmendmentBuilder;
import org.nsesa.editor.gwt.an.amendments.client.handler.common.content.AkomaNtoso30AmendmentBuilder;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtosoAmendmentControllerUtil;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.*;
import org.nsesa.editor.gwt.core.client.ui.visualstructure.VisualStructureController;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.core.client.validation.Validator;
import org.nsesa.editor.gwt.core.shared.PersonDTO;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.authors.AuthorsPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.meta.MetaPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.create.AmendmentDialogCreateController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.create.AmendmentDialogCreateView;

import java.util.logging.Logger;

/**
 * Date: 05/12/12 14:36
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoAmendmentDialogCreateController extends AmendmentDialogCreateController {

    private static final Logger LOG = Logger.getLogger(AkomaNtosoAmendmentDialogCreateController.class.getName());

    private OverlaySnippetFactory overlaySnippetFactory;
    private OverlaySnippetEvaluator overlaySnippetEvaluator;
    final AuthorsPanelController authorsPanelController;
    final MetaPanelController metaPanelController;
    final ServiceFactory serviceFactory;
    final OverlayWidgetInjectionStrategy overlayWidgetInjectionStrategy;


    @Inject
    public AkomaNtosoAmendmentDialogCreateController(final ClientFactory clientFactory,
                                                     final ServiceFactory serviceFactory,
                                                     final AmendmentDialogCreateView view,
                                                     final Locator locator,
                                                     final OverlayFactory overlayFactory,
                                                     final VisualStructureController visualStructureController,
                                                     final AmendmentInjectionPointFinder amendmentInjectionPointFinder,
                                                     final OverlaySnippetFactory overlaySnippetFactory,
                                                     final OverlaySnippetEvaluator overlaySnippetEvaluator,
                                                     final Validator<OverlayWidget> overlayWidgetValidator,
                                                     final AuthorsPanelController authorsPanelController,
                                                     final MetaPanelController metaPanelController,
                                                     final OverlayWidgetInjectionStrategy overlayWidgetInjectionStrategy
    ) {
        super(clientFactory, view, locator, overlayFactory, visualStructureController,
                amendmentInjectionPointFinder, overlayWidgetValidator);
        this.serviceFactory = serviceFactory;
        this.overlaySnippetFactory = overlaySnippetFactory;
        this.overlaySnippetEvaluator = overlaySnippetEvaluator;

        this.authorsPanelController = authorsPanelController;
        this.authorsPanelController.registerListeners();
        this.metaPanelController = metaPanelController;
        this.overlayWidgetInjectionStrategy = overlayWidgetInjectionStrategy;

        addChildControllers(authorsPanelController, metaPanelController);
    }

    @Override
    public void handleSave() {

        final OverlayWidget overlayWidget = dialogContext.getOverlayWidget();
        final String languageIso = dialogContext.getDocumentController().getDocument().getLanguageIso();

        final String location;
        if (dialogContext.getAmendmentController() == null) {
            // temporarily add the widget to calculate its position
            final int injectionPosition = overlayWidgetInjectionStrategy.getProposedInjectionPosition(dialogContext.getParentOverlayWidget(),
                    dialogContext.getReferenceOverlayWidget(), dialogContext.getOverlayWidget());
            dialogContext.getParentOverlayWidget().addOverlayWidget(dialogContext.getOverlayWidget(), injectionPosition);
            location = locator.getLocation(dialogContext.getOverlayWidget(), languageIso, true);
            // we're done, so remove it again
            dialogContext.getParentOverlayWidget().removeOverlayWidget(dialogContext.getOverlayWidget());
        } else {
            // edit
            location = locator.getLocation(dialogContext.getOverlayWidget(), languageIso, true);
        }

        // we create the amendment based on the namespace of the overlay widget
        final OverlayWidget amendment;
        if (overlayWidget.getNamespaceURI().equalsIgnoreCase(new AkomaNtoso().getNamespaceURI())) {
            final AkomaNtoso20AmendmentBuilder akomaNtoso20AmendmentBuilder = new AkomaNtoso20AmendmentBuilder(overlayFactory);
            // use AkomaNtoso 2.0
            akomaNtoso20AmendmentBuilder
                    .setOverlayWidget(overlayWidget)
                    .setDocumentController(dialogContext.getDocumentController())
                    .setLanguageIso(languageIso)
                    .setAuthors(authorsPanelController.getSelectedPersons())
                    .setLocation(location)
                    .setOriginalText("") // TODO null?
                    .setAmendmentText(view.getAmendmentContent())
                    .setJustification(metaPanelController.getJustification())
                    .setNotes(metaPanelController.getNotes());
            amendment = akomaNtoso20AmendmentBuilder.build();
        } else {
            // use AkomaNtoso 3.0 draft
            final AkomaNtoso30AmendmentBuilder akomaNtoso30AmendmentBuilder = new AkomaNtoso30AmendmentBuilder(overlayFactory);
            akomaNtoso30AmendmentBuilder
                    .setOverlayWidget(overlayWidget)
                    .setDocumentController(dialogContext.getDocumentController())
                    .setLanguageIso(languageIso)
                    .setAuthors(authorsPanelController.getSelectedPersons())
                    .setLocation(location)
                    .setOriginalText("") // TODO null?
                    .setAmendmentText(view.getAmendmentContent())
                    .setJustification(metaPanelController.getJustification())
                    .setNotes(metaPanelController.getNotes());
            amendment = akomaNtoso30AmendmentBuilder.build();
        }
        dialogContext.getAmendment().setRoot(amendment);
        super.handleSave();
    }

    @Override
    public void setContext(final DialogContext dialogContext) {
        super.setContext(dialogContext);
        final OverlayWidget overlayWidget = dialogContext.getOverlayWidget();

        assert overlayWidget.getOrigin() != null : "Origin has not been set on the overlay widget -- BUG";

        view.getRichTextEditor().setOverlayWidget(overlayWidget);

        if (dialogContext.getAmendmentController() == null) {

            OverlaySnippet overlaySnippet = overlaySnippetFactory.getSnippet(overlayWidget);
            overlaySnippetEvaluator.addEvaluator(
                    new DefaultNumEvaluator(
                            clientFactory,
                            overlayWidgetInjectionStrategy,
                            locator,
                            overlayWidget,
                            dialogContext.getParentOverlayWidget(),
                            dialogContext.getReferenceOverlayWidget()));
            view.setAmendmentContent(overlaySnippet != null ? overlaySnippet.getContent(overlaySnippetEvaluator) : "");
        } else {
            final OverlayWidget amendmentContentFromModel = AkomaNtosoAmendmentControllerUtil.getAmendmentContentFromModel(dialogContext.getAmendmentController());
            view.setAmendmentContent(amendmentContentFromModel.getInnerHTML());
        }

        // clear author panel
        authorsPanelController.clear();

        // clear meta panel
        metaPanelController.clear();

        if (dialogContext.getAmendmentController() != null) {
            // get the location from the amendable widget, if it is passed
            view.setTitle("Edit amendment");

            // set the amendment content
            final OverlayWidget amendmentBodyOverlayWidget = dialogContext.getAmendmentController().asAmendableWidget(dialogContext.getAmendmentController().getModel().getBody());

            // TODO nsesa-editor-an #86: won't work if the amendment itself contains already a quoted structure

            final java.util.List<OverlayWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendmentBodyOverlayWidget);
            view.setAmendmentContent(quotedStructures.get(1).getOverlayElement().getFirstChildElement().getInnerHTML());


            // set the author(s)
            final Preface preface = (Preface) OverlayUtil.findSingle("preface", amendmentBodyOverlayWidget);

            final Container container = preface.getContainers().get(0);
            if (container != null && "authors".equals(container.nameAttr().getValue())) {
                final java.util.List<OverlayWidget> docProponents = OverlayUtil.find("docProponent", container);
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
                                authorsPanelController.addPerson(result, docProponents.indexOf(docProponent));
                            }
                        });
                    }
                }
            }

            // set the meta (justification, notes, ...)
            final AmendmentJustification amendmentJustification = (AmendmentJustification) OverlayUtil.findSingle("amendmentJustification", amendmentBodyOverlayWidget);
            if (amendmentJustification != null) {
                final String justification = amendmentJustification.getPs().get(0).getInnerHTML().trim();
                metaPanelController.setJustification(justification);
            }
            final Mod mod = (Mod) OverlayUtil.findSingle("mod", amendmentBodyOverlayWidget);
            if (mod != null) {
                final java.util.List<AuthorialNote> authorialNotes = mod.getAuthorialNotes();
                if (authorialNotes != null && !authorialNotes.isEmpty()) {
                    metaPanelController.setNotes(authorialNotes.get(0).getPs().get(0).getInnerHTML().trim());
                }
            }

        } else {
            view.setTitle(locator.getLocation(dialogContext.getOverlayWidget(), clientFactory.getClientContext().getDocumentTranslationLanguageCode(), false));

        }
    }
}
