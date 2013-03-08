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
package org.nsesa.editor.gwt.an.client.handler.modify;

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
import org.nsesa.editor.gwt.core.client.amendment.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.client.ui.drafting.DraftingController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.util.Counter;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.core.shared.PersonDTO;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.author.AuthorPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.meta.MetaPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyView;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import static org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20XMLUtil.*;

/**
 * Date: 23/11/12 10:14
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentDialogModifyController extends AmendmentDialogModifyController {

    private static final Logger LOG = Logger.getLogger(AkomaNtoso20AmendmentDialogModifyController.class.getName());

    final AuthorPanelController authorPanelController;
    final MetaPanelController metaPanelController;
    final ContentPanelController contentPanelController;
    final ServiceFactory serviceFactory;

    @Inject
    public AkomaNtoso20AmendmentDialogModifyController(final ClientFactory clientFactory,
                                                       final AmendmentDialogModifyView view,
                                                       final Locator locator,
                                                       final OverlayFactory overlayFactory,
                                                       final DraftingController draftingController,
                                                       final AuthorPanelController authorPanelController,
                                                       final ContentPanelController contentPanelController,
                                                       final MetaPanelController metaPanelController,
                                                       final ServiceFactory serviceFactory
    ) {
        super(clientFactory, view, locator, overlayFactory, draftingController);
        this.authorPanelController = authorPanelController;
        this.contentPanelController = contentPanelController;
        this.metaPanelController = metaPanelController;
        this.serviceFactory = serviceFactory;

        addChildControllers(contentPanelController, authorPanelController, metaPanelController);
    }

    @Override
    public void handleSave() {
        OverlayWidget overlayWidget = dialogContext.getOverlayWidget();
        final Counter idGenerator = new Counter();
        final String languageIso = dialogContext.getDocumentController().getDocument().getLanguageIso();

        final AkomaNtoso akomaNtoso = new AkomaNtoso();
        final Amendment root = akomaNtoso.setAmendment(new Amendment());

        // meta
        final Identification identification = new Identification();
//        final String formattedDate = DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.ISO_8601).format(new Date());
        final String formattedDate = DateTimeFormat.getFormat("yyyy-MM-dd").format(new Date());
        identification.setFRBRWork(new FRBRWork() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri(new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)).nameAttr(s("instantiation")));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                setFRBRcountry(new FRBRcountry().valueAttr(s("TODO")));
            }
        });

        identification.setFRBRExpression(new FRBRExpression() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri(new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)).nameAttr(s("instantiation")));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                addFRBRlanguage(new FRBRlanguage().languageAttr(l(languageIso)));
            }
        });

        identification.setFRBRManifestation(new FRBRManifestation() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri(new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)).nameAttr(s("instantiation")));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
            }
        });

        final Meta meta = new Meta();
        root.setMeta(meta);
        meta.setIdentification(identification).sourceAttr(u("http://at4am.org/"));

        References references = new References();

        references.addTLCOrganization(new TLCOrganization().idAttr(id("ep-parliament")).showAsAttr(s("European Parliament")).hrefAttr(u("http://www.europarl.europa.eu")));

        for (final PersonDTO authorial : authorPanelController.getSelectedPersons()) {
            final IDSimpleType idSimpleType = new IDSimpleType();
            idSimpleType.setValue("person-" + authorial.getId());

            final StringSimpleType stringSimpleType = new StringSimpleType();
            stringSimpleType.setValue(authorial.getDisplayName());

            final AnyURISimpleType anyURISimpleType = new AnyURISimpleType();
            anyURISimpleType.setValue("urn:lex:eu:parliament:codict:person:" + authorial.getId());

            references.addTLCPerson(new TLCPerson().idAttr(idSimpleType).showAsAttr(stringSimpleType).hrefAttr(anyURISimpleType));
        }

        meta.addReferences(references).sourceAttr(u("http://at4am.org/"));


        // preface;
        final P p = new P();
        for (final PersonDTO authorial : authorPanelController.getSelectedPersons()) {
            final DocProponent docProponent = new DocProponent().refersToAttr(u("#person-" + authorial.getId()));
            docProponent.html(authorial.getDisplayName());
            p.addDocProponent(docProponent);
        }
        root.setPreface(new Preface())
                .addContainer(new Container().idAttr(id("container-" + idGenerator.incrementAndGet())).nameAttr(s("authors")))
                .addP(p);

        // amendment body
        final AmendmentBody amendmentBody = root.setAmendmentBody(new AmendmentBody());

        amendmentBody
                .addAmendmentHeading(new AmendmentHeading())
                .addBlock(new Block()).nameAttr(s("heading")).html(locator.getLocation(overlayWidget, null, languageIso, true));

        // amendment content
        final AmendmentContent amendmentContent = amendmentBody
                .addAmendmentContent(new AmendmentContent());

        amendmentContent
                .addBlock(new Block()).nameAttr(s("versionTitle")).html("Text proposed");
        amendmentContent
                .addBlock(new Block()).nameAttr(s("versionTitle")).html("Amendment");

        final Mod mod = amendmentContent
                .addBlock(new Block()).nameAttr(s("changeBlock"))
                .addMod(new Mod()).idAttr(id("mod-" + idGenerator.incrementAndGet()));

        // original content
        final QuotedStructure quotedStructureOriginal = mod.addQuotedStructure(new QuotedStructure()).idAttr(id("quotedStructure-" + idGenerator.incrementAndGet()));

        final String originalText = contentPanelController.getView().getOriginalText();
        final com.google.gwt.user.client.Element cloneOriginal = DOM.clone(overlayWidget.asWidget().getElement(), false);
        cloneOriginal.setInnerHTML(originalText);
        final OverlayWidget overlayedOriginal = overlayFactory.getAmendableWidget(cloneOriginal);
        quotedStructureOriginal.addOverlayWidget(overlayedOriginal);

        // amendment content
        final QuotedStructure quotedStructureAmendment = mod.addQuotedStructure(new QuotedStructure()).idAttr(id("quotedStructure-" + idGenerator.incrementAndGet()));
        final String amendmentText = view.getAmendmentContent();
        final com.google.gwt.user.client.Element clone = DOM.clone(overlayWidget.asWidget().getElement(), false);
        clone.setInnerHTML(amendmentText);
        final OverlayWidget overlayed = overlayFactory.getAmendableWidget(clone);
        modifyIdsIfNeeded(overlayed);
        quotedStructureAmendment.addOverlayWidget(overlayed);

        // amendment notes
        mod.addAuthorialNote(new AuthorialNote()).idAttr(id("note-" + idGenerator.incrementAndGet())).addP(new P()).html(metaPanelController.getNotes());

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

    public void modifyIdsIfNeeded(final OverlayWidget root) {
        // we only need to modify the ids if we're a new amendment (not editing an existing one)
        if (dialogContext.getAmendmentController() == null) {
            // now we need to make sure that the new structure has new ids assigned
            root.walk(new OverlayWidgetWalker.OverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.getOverlayElement().getId() != null && !"".equals(visited.getOverlayElement().getId().trim())) {
                        visited.getOverlayElement().setId(visited.getOverlayElement().getId() + "-mod");
                    }
                    return true;
                }
            });
        }
    }

    @Override
    public void setContext(DialogContext dialogContext) {
        super.setContext(dialogContext);
        // clear author panel
        authorPanelController.clear();

        // clear meta panel
        metaPanelController.setJustification("");
        metaPanelController.setNotes("");

        view.resetBodyClass();
        view.addBodyClass(dialogContext.getOverlayWidget().getOverlayElement().getClassName());

        if (dialogContext.getAmendmentController() != null) {
            // get the location from the amendable widget, if it is passed
            view.setTitle("Edit amendment");

            // set the amendment content
            final OverlayWidget amendmentBodyOverlayWidget = dialogContext.getAmendmentController().asAmendableWidget(dialogContext.getAmendmentController().getModel().getBody());
            final java.util.List<OverlayWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendmentBodyOverlayWidget);
            view.setAmendmentContent(quotedStructures.get(1).getOverlayElement().getFirstChildElement().getInnerHTML());

            // set the author(s)
            final Preface preface = OverlayUtil.findSingle("preface", amendmentBodyOverlayWidget, new Preface());

            final Container container = preface.getContainers().get(0);
            if (container != null && "authors".equals(container.nameAttr().getValue())) {
                List<OverlayWidget> docProponents = OverlayUtil.find("docProponent", container);
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
                final List<AuthorialNote> authorialNotes = mod.getAuthorialNotes();
                if (authorialNotes != null && !authorialNotes.isEmpty()) {
                    metaPanelController.setNotes(authorialNotes.get(0).html().trim());
                }
            }


        } else {
            view.setTitle(locator.getLocation(dialogContext.getOverlayWidget(), clientFactory.getClientContext().getDocumentTranslationLanguageCode(), false));
            view.setAmendmentContent(dialogContext.getOverlayWidget().getInnerHTML());
        }
    }
}
