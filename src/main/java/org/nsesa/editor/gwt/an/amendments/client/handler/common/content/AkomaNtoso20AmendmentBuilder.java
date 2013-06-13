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
package org.nsesa.editor.gwt.an.amendments.client.handler.common.content;

import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.user.client.DOM;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.TextUtils;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.client.util.Counter;
import org.nsesa.editor.gwt.core.shared.PersonDTO;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.nsesa.editor.gwt.an.common.client.ui.overlay.document.AkomaNtoso20XMLUtil.*;

/**
 * Date: 25/03/13 16:33
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentBuilder {

    private String languageIso, location, justification, notes, originalText, amendmentText;

    private DocumentController documentController;

    private boolean modifyIds;

    private OverlayWidget overlayWidget;

    private Set<PersonDTO> authors = new HashSet<PersonDTO>();

    private final OverlayFactory overlayFactory;

    @Inject
    public AkomaNtoso20AmendmentBuilder(OverlayFactory overlayFactory) {
        this.overlayFactory = overlayFactory;
    }

    public AkomaNtoso20AmendmentBuilder setLanguageIso(String languageIso) {
        this.languageIso = languageIso;
        return this;
    }

    public AkomaNtoso20AmendmentBuilder setJustification(String justification) {
        this.justification = justification;
        return this;
    }

    public AkomaNtoso20AmendmentBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public AkomaNtoso20AmendmentBuilder setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public AkomaNtoso20AmendmentBuilder setAuthors(Set<PersonDTO> authors) {
        this.authors = authors;
        return this;
    }

    public AkomaNtoso20AmendmentBuilder setOriginalText(String originalText) {
        this.originalText = originalText;
        return this;
    }

    public AkomaNtoso20AmendmentBuilder setAmendmentText(String amendmentText) {
        this.amendmentText = amendmentText;
        return this;
    }

    public AkomaNtoso20AmendmentBuilder setOverlayWidget(OverlayWidget overlayWidget) {
        this.overlayWidget = overlayWidget;
        return this;
    }

    public AkomaNtoso20AmendmentBuilder setModifyIds(boolean modifyIds) {
        this.modifyIds = modifyIds;
        return this;
    }

    public AkomaNtoso20AmendmentBuilder setDocumentController(DocumentController documentController) {
        this.documentController = documentController;
        return this;
    }

    public OverlayWidget build() {
        final Counter idGenerator = new Counter();

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
        // keep a reference to the amended document
        if (documentController != null) {
            references.addActiveRef(new ActiveRef(u("TODO"), s(documentController.getDocument().getName()), id(documentController.getDocument().getDocumentID())));
        }

        for (final PersonDTO authorial : authors) {
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
        for (final PersonDTO authorial : authors) {
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
                .addBlock(new Block()).nameAttr(s("heading")).html(TextUtils.capitalize(location));

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

        final com.google.gwt.user.client.Element cloneOriginal = DOM.clone(overlayWidget.asWidget().getElement(), false);
        cloneOriginal.setInnerHTML(originalText);
        final OverlayWidget overlayedOriginal = overlayFactory.getAmendableWidget(cloneOriginal);
        quotedStructureOriginal.addOverlayWidget(overlayedOriginal);

        // amendment content
        final QuotedStructure quotedStructureAmendment = mod.addQuotedStructure(new QuotedStructure()).idAttr(id("quotedStructure-" + idGenerator.incrementAndGet()));
        final com.google.gwt.user.client.Element clone = DOM.clone(overlayWidget.asWidget().getElement(), false);
        clone.setInnerHTML(amendmentText);
        final OverlayWidget overlayed = overlayFactory.getAmendableWidget(clone);
        if (modifyIds) {
            modifyIds(overlayed);
        }
        quotedStructureAmendment.addOverlayWidget(overlayed);

        // amendment notes
        mod.addAuthorialNote(new AuthorialNote()).idAttr(id("note-" + idGenerator.incrementAndGet())).addP(new P()).html(notes);

        // amendment justification

        if (justification != null && !"".equalsIgnoreCase(justification.trim())) {
            final AmendmentJustification amendmentJustification = new AmendmentJustification();
            amendmentJustification.addBlock(new Block()).nameAttr(s("justificationHeading")).html("Justification");
            amendmentJustification.addP(new P()).html(justification);
            amendmentBody.addAmendmentJustification(amendmentJustification);
        }

        akomaNtoso.addOverlayWidget(root);
        return akomaNtoso;
    }

    public void modifyIds(final OverlayWidget root) {
        // we only need to modify the ids if we're a new amendment (not editing an existing one)
        // now we need to make sure that the new structure has new ids assigned
        root.walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
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
