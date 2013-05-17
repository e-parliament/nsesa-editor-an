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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.NumberingType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.*;
import org.nsesa.editor.gwt.core.client.ui.visualstructure.VisualStructureController;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.core.client.validation.Validator;
import org.nsesa.editor.gwt.core.shared.OverlayWidgetOrigin;
import org.nsesa.editor.gwt.core.shared.PersonDTO;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.author.AuthorPanelController;
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
public class AkomaNtoso20AmendmentDialogCreateController extends AmendmentDialogCreateController {

    private static final Logger LOG = Logger.getLogger(AkomaNtoso20AmendmentDialogCreateController.class.getName());

    private OverlaySnippetFactory overlaySnippetFactory;
    private OverlaySnippetEvaluator overlaySnippetEvaluator;
    final AuthorPanelController authorPanelController;
    final MetaPanelController metaPanelController;
    final ServiceFactory serviceFactory;


    @Inject
    public AkomaNtoso20AmendmentDialogCreateController(final ClientFactory clientFactory,
                                                       final ServiceFactory serviceFactory,
                                                       final AmendmentDialogCreateView view,
                                                       final Locator locator,
                                                       final OverlayFactory overlayFactory,
                                                       final VisualStructureController visualStructureController,
                                                       final AmendmentInjectionPointFinder amendmentInjectionPointFinder,
                                                       final OverlaySnippetFactory overlaySnippetFactory,
                                                       final OverlaySnippetEvaluator overlaySnippetEvaluator,
                                                       final Validator<OverlayWidget> overlayWidgetValidator,
                                                       final AuthorPanelController authorPanelController,
                                                       final MetaPanelController metaPanelController
    ) {
        super(clientFactory, view, locator, overlayFactory, visualStructureController,
                amendmentInjectionPointFinder, overlayWidgetValidator);
        this.serviceFactory = serviceFactory;
        this.overlaySnippetFactory = overlaySnippetFactory;
        this.overlaySnippetEvaluator = overlaySnippetEvaluator;

        this.authorPanelController = authorPanelController;
        this.metaPanelController = metaPanelController;

        addChildControllers(authorPanelController, metaPanelController);
    }

    @Override
    public void handleSave() {

        final AkomaNtoso20AmendmentBuilder builder = new AkomaNtoso20AmendmentBuilder(overlayFactory);

        final OverlayWidget overlayWidget = dialogContext.getOverlayWidget();
        final String languageIso = dialogContext.getDocumentController().getDocument().getLanguageIso();
        builder
                .setOverlayWidget(overlayWidget)
                .setLanguageIso(languageIso)
                .setAuthors(authorPanelController.getSelectedPersons())
                .setLocation(locator.getLocation(overlayWidget, null, languageIso, true))
                .setOriginalText("") // TODO null?
                .setAmendmentText(view.getAmendmentContent())
                .setJustification(metaPanelController.getJustification())
                .setNotes(metaPanelController.getNotes());
        dialogContext.getAmendment().setRoot(builder.build());


        super.handleSave();
    }

    @Override
    public void setContext(final DialogContext dialogContext) {
        super.setContext(dialogContext);
        final OverlayWidget overlayWidget = dialogContext.getOverlayWidget();
        //set the origin
        overlayWidget.setOrigin(OverlayWidgetOrigin.AMENDMENT);

        view.getRichTextEditor().setOverlayWidget(overlayWidget);

        OverlaySnippet overlaySnippet = overlaySnippetFactory.getSnippet(overlayWidget);
        overlaySnippetEvaluator.addEvaluator(new OverlaySnippetEvaluator.Evaluator() {
            @Override
            public String getPlaceHolder() {
                return "${widget.num}";
            }

            @Override
            public String evaluate() {
                if (overlayWidget.getNumberingType() == null) {
                    // if there is a sibling of the same type, use that one
                    OverlayWidget sibling = dialogContext.getParentOverlayWidget().getChildOverlayWidgets().get(dialogContext.getIndex());
                    if (sibling != null) {
                        overlayWidget.setNumberingType(sibling.getNumberingType());
                    } else {
                        // take the parent's numbering, but use a different one
                        // TODO
                        overlayWidget.setNumberingType(NumberingType.ROMANITO);
                    }
                }
                //add the overlay widget in the parent children collection to compute the num
                dialogContext.getParentOverlayWidget().addOverlayWidget(overlayWidget, dialogContext.getIndex());
                String num = locator.getNum(overlayWidget, clientFactory.getClientContext().getDocumentTranslationLanguageCode());
                dialogContext.getParentOverlayWidget().removeOverlayWidget(overlayWidget);
                return num == null ? "" : num;
            }
        });
        view.setAmendmentContent(overlaySnippet != null ? overlaySnippet.getContent(overlaySnippetEvaluator) : "");

        // clear author panel
        authorPanelController.clear();

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
                java.util.List<OverlayWidget> docProponents = OverlayUtil.find("docProponent", container);
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
                                authorPanelController.addPerson(result);
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
                    metaPanelController.setNotes(authorialNotes.get(0).html().trim());
                }
            }

        } else {
            view.setTitle(locator.getLocation(dialogContext.getOverlayWidget(), clientFactory.getClientContext().getDocumentTranslationLanguageCode(), false));

        }
    }
}
