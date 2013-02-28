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
package org.nsesa.editor.gwt.an.client.handler.delete;

import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.core.shared.PersonDTO;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.author.AuthorPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.meta.MetaPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.delete.AmendmentDialogDeleteController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.delete.AmendmentDialogDeleteView;

import java.util.logging.Logger;

import static org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20XMLUtil.*;

/**
 * Date: 23/11/12 10:14
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentDialogDeleteController extends AmendmentDialogDeleteController {

    private static final Logger LOG = Logger.getLogger(AkomaNtoso20AmendmentDialogDeleteController.class.getName());

    final AuthorPanelController authorPanelController;
    final MetaPanelController metaPanelController;
    final ContentPanelController contentPanelController;

    final ServiceFactory serviceFactory;

    @Inject
    public AkomaNtoso20AmendmentDialogDeleteController(final ClientFactory clientFactory,
                                                       final ServiceFactory serviceFactory,
                                                       final AmendmentDialogDeleteView view,
                                                       final Locator locator,
                                                       final OverlayFactory overlayFactory,
                                                       final AuthorPanelController authorPanelController,
                                                       final ContentPanelController contentPanelController,
                                                       final MetaPanelController metaPanelController
    ) {
        super(clientFactory, view, locator, overlayFactory);
        this.serviceFactory = serviceFactory;
        this.authorPanelController = authorPanelController;
        this.contentPanelController = contentPanelController;
        this.metaPanelController = metaPanelController;

        addChildControllers(contentPanelController, authorPanelController, metaPanelController);
    }

    @Override
    public void handleSave() {
        final String languageIso = dialogContext.getDocumentController().getDocument().getLanguageIso();

        OverlayWidget overlayWidget = dialogContext.getOverlayWidget();

        final AkomaNtoso akomaNtoso = new AkomaNtoso();
        final Amendment root = akomaNtoso.setAmendment(new Amendment());

        // meta
        final Identification identification = new Identification();
        final String formattedDate = DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.ISO_8601).format(new java.util.Date());
        identification.setFRBRWork(new FRBRWork() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri(new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                setFRBRcountry(new FRBRcountry().valueAttr(s("TODO")));
            }
        });

        identification.setFRBRExpression(new FRBRExpression() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri(new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                addFRBRlanguage(new FRBRlanguage().languageAttr(l(languageIso)));
            }
        });

        identification.setFRBRManifestation(new FRBRManifestation() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri(new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
            }
        });

        final Meta meta = new Meta();

        root.setMeta(meta).setIdentification(identification);

        References references = new References();

        for (final PersonDTO authorial : authorPanelController.getSelectedPersons()) {
            final IDSimpleType idSimpleType = new IDSimpleType();
            idSimpleType.setValue("person-" + authorial.getId());

            final StringSimpleType stringSimpleType = new StringSimpleType();
            stringSimpleType.setValue(authorial.getDisplayName());

            final AnyURISimpleType anyURISimpleType = new AnyURISimpleType();
            anyURISimpleType.setValue("urn:lex:eu:parliament:codict:person:" + authorial.getId());

            references.addTLCPerson(new TLCPerson().idAttr(idSimpleType).showAsAttr(stringSimpleType).hrefAttr(anyURISimpleType));
        }

        meta.addReferences(references);

        // preface;
        final P p = new P();
        for (final PersonDTO authorial : authorPanelController.getSelectedPersons()) {
            final DocProponent docProponent = new DocProponent().refersToAttr(u("#person-" + authorial.getId()));
            docProponent.html(authorial.getDisplayName());
            p.addDocProponent(docProponent);
        }
        root.setPreface(new Preface())
                .addContainer(new Container().nameAttr(s("authors")))
                .addP(p);

        // amendment body
        final AmendmentBody amendmentBody = root.setAmendmentBody(new AmendmentBody());

        amendmentBody
                .addAmendmentHeading(new AmendmentHeading())
                .addBlock(new Block()).html(locator.getLocation(overlayWidget, null, languageIso, true));

        // amendment content
        final AmendmentContent amendmentContent = amendmentBody
                .addAmendmentContent(new AmendmentContent());

        amendmentContent
                .addBlock(new Block()).nameAttr(s("versionTitle")).html("Text proposed by ...");
        amendmentContent
                .addBlock(new Block()).nameAttr(s("versionTitle")).html("Amendment");

        final Mod mod = amendmentContent
                .addBlock(new Block()).nameAttr(s("changeBlock"))
                .addMod(new Mod());

        // original content
        final QuotedStructure quotedStructureOriginal = mod.addQuotedStructure(new QuotedStructure());

        final String originalText = contentPanelController.getView().getOriginalText();
        final com.google.gwt.user.client.Element cloneOriginal = DOM.clone(overlayWidget.asWidget().getElement(), false);
        cloneOriginal.setInnerHTML(originalText);
        final OverlayWidget overlayedOriginal = overlayFactory.getAmendableWidget(cloneOriginal);
        quotedStructureOriginal.addOverlayWidget(overlayedOriginal);

        // amendment content
        final QuotedStructure quotedStructureAmendment = mod.addQuotedStructure(new QuotedStructure());
        final com.google.gwt.user.client.Element clone = DOM.clone(overlayWidget.asWidget().getElement(), false);
        clone.setInnerHTML("Deleted");
        final OverlayWidget overlayed = overlayFactory.getAmendableWidget(clone);
        quotedStructureAmendment.addOverlayWidget(overlayed);

        // amendment notes
        mod.addAuthorialNote(new AuthorialNote()).html(metaPanelController.getNotes());

        // amendment justification
        final String justification = metaPanelController.getJustification();

        if (justification != null && !"".equalsIgnoreCase(justification.trim())) {
            final AmendmentJustification amendmentJustification = new AmendmentJustification();
            amendmentJustification.addBlock(new Block()).nameAttr(s("justificationHeading")).html("Justification");
            amendmentJustification.addP(new P()).html(justification);
            amendmentBody.addAmendmentJustification(amendmentJustification);
        }

        akomaNtoso.addOverlayWidget(root);
        dialogContext.getAmendment().setRoot(akomaNtoso);

        super.handleSave();
    }

    private <T extends OverlayWidget> T a(final String tag) {
        return (T) overlayFactory.getAmendableWidget(tag);
    }

    @Override
    public void setContext(DialogContext dialogContext) {
        super.setContext(dialogContext);
        // clear author panel
        authorPanelController.clear();

        // clear meta panel
        metaPanelController.setJustification("");
        metaPanelController.setNotes("");

        if (dialogContext.getAmendmentController() != null) {
            // get the location from the amendable widget, if it is passed
            view.setTitle("Edit amendment");

            final OverlayWidget amendmentBodyOverlayWidget = dialogContext.getAmendmentController().asAmendableWidget(dialogContext.getAmendmentController().getModel().getBody());

            // set the author(s)
            final Preface preface = OverlayUtil.findSingle("preface", amendmentBodyOverlayWidget, new Preface());

            final Container container = preface.getContainers().get(0);
            if (container != null && "authors".equals(container.nameAttr().getValue())) {
                java.util.List<OverlayWidget> docProponents = OverlayUtil.find("docProponent", container);
                for (final OverlayWidget docProponent : docProponents) {
                    if (docProponent instanceof DocProponent) {
                        final DocProponent proponent = (DocProponent) docProponent;
                        final String refersToID = proponent.refersToAttr().getValue();

                        final TLCPerson tlcPerson = OverlayUtil.xpathSingle(refersToID, amendmentBodyOverlayWidget, new TLCPerson());
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
            final AmendmentJustification amendmentJustification = OverlayUtil.findSingle("amendmentJustification", amendmentBodyOverlayWidget, new AmendmentJustification());
            if (amendmentJustification != null) {
                final String justification = amendmentJustification.getPs().get(0).getInnerHTML().trim();
                metaPanelController.setJustification(justification);
            }
            final Mod mod = OverlayUtil.findSingle("mod", amendmentBodyOverlayWidget, new Mod());
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
