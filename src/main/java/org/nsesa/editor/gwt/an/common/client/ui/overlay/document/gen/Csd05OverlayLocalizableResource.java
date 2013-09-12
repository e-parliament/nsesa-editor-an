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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen;

import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayLocalizableResource;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

/**
 * An implementation of <code>OverlayLocalizableResource</code> interface by getting the localizable information
 * from GWT properties files.
 * Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayLocalizableResource.ftl</tt>.
 */
public class Csd05OverlayLocalizableResource extends DefaultOverlayLocalizableResource {

    private static Csd05OverlayMessages MESSAGES = GWT.create(Csd05OverlayMessages.class);
    private final String namespaceURI = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05";

    @Override
    public String getName(final OverlayWidget widget) {
        if (widget == null) {
            throw new IllegalArgumentException("Null widget passed.");
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.container".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameContainer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ul".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameUl();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ol".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOl();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.parliamentary".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameParliamentary();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.akomaNtoso".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAkomaNtoso();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quorumVerification".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameQuorumVerification();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.voting".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameVoting();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.recount".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRecount();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAmendment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRauthoritative".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRauthoritative();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRprescriptive".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRprescriptive();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRalias".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRalias();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRthis".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRthis();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRname".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRname();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRuri".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRuri();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRsubtype".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRsubtype();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRcountry".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRcountry();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRformat".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRformat();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRnumber".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRnumber();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRlanguage".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRlanguage();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.timeInterval".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTimeInterval();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRdate".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRdate();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRauthor".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRauthor();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.keyword".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameKeyword();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.publication".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePublication();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRtranslation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRtranslation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.header".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameHeader();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentJustification".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAmendmentJustification();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.td".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTd();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.th".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTh();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentReference".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAmendmentReference();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentContent".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAmendmentContent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentHeading".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAmendmentHeading();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.bill".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameBill();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.act".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAct();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.rref".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRref();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ref".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.heading".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameHeading();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.eol".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameEol();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.eop".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameEop();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.noteRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameNoteRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.br".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameBr();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.img".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameImg();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAmendmentBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.judicial".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameJudicial();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.preamble".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePreamble();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.mod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.mmod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameMmod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.rmod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRmod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.efficacy".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameEfficacy();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.force".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameForce();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.application".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameApplication();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.duration".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDuration();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.references".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameReferences();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quorum".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameQuorum();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.count".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameCount();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.collectionBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameCollectionBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.preface".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePreface();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.debate".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDebate();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.textualMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTextualMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.scopeMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameScopeMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.legalSystemMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameLegalSystemMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.meaningMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameMeaningMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.efficacyMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameEfficacyMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.forceMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameForceMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.supports".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSupports();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.contrasts".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameContrasts();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.restricts".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRestricts();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.putsInQuestion".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePutsInQuestion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.applies".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameApplies();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.distinguishes".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDistinguishes();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.isAnalogTo".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameIsAnalogTo();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.dissentsFrom".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDissentsFrom();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.overrules".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOverrules();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.derogates".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDerogates();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.extends".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameExtends();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.coverPage".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameCoverPage();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.conclusions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameConclusions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.componentRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameComponentRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.body".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRExpression".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRExpression();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRItem".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRItem();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRManifestation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRManifestation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRWork".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFRBRWork();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.activeModifications".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameActiveModifications();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.passiveModifications".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePassiveModifications();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.judgmentBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameJudgmentBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCEvent".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCEvent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCLocation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCLocation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.passiveRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePassiveRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.activeRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameActiveRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.original".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOriginal();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCConcept".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCConcept();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.jurisprudence".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameJurisprudence();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.attachmentOf".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAttachmentOf();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCObject".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCObject();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCPerson".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCPerson();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCReference".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCReference();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCRole".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCRole();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCProcess".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCProcess();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.hasAttachment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameHasAttachment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCOrganization".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCOrganization();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCTerm".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTLCTerm();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.fragmentBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFragmentBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.summary".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSummary();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.time".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTime();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.fillIn".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFillIn();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.signature".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSignature();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.vote".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameVote();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.listIntroduction".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameListIntroduction();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docPurpose".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocPurpose();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.date".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDate();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quotedText".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameQuotedText();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.inline".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameInline();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.relatedDocument".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRelatedDocument();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docIntroducer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocIntroducer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.b".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameB();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.a".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameA();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.i".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameI();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.num".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameNum();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.u".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameU();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.p".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameP();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docType".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocType();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.change".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameChange();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.opinion".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOpinion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docStage".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocStage();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docCommittee".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocCommittee();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.abbr".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAbbr();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docNumber".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocNumber();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.extractText".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameExtractText();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.span".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSpan();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.sub".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSub();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.sup".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSup();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docketNumber".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocketNumber();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.mref".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameMref();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.decoration".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDecoration();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.neutralCitation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameNeutralCitation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docStatus".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocStatus();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.legislature".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameLegislature();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.tocItem".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTocItem();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.session".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSession();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.recordedTime".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRecordedTime();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.scene".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameScene();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.block".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameBlock();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docJurisdiction".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocJurisdiction();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docProponent".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocProponent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.omissis".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOmissis();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.def".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docTitle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocTitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.del".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDel();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.affectedDocument".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAffectedDocument();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.placeholder".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePlaceholder();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.caption".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameCaption();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.outcome".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOutcome();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.shortTitle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameShortTitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.remark".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRemark();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.narrative".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameNarrative();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.listConclusion".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameListConclusion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.argument".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameArgument();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ins".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameIns();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subheading".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubheading();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.courtType".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameCourtType();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.from".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFrom();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docDate".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocDate();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.introduction".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameIntroduction();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.arguments".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameArguments();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.background".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameBackground();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.mainBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameMainBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.motivation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameMotivation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.decision".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDecision();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.remedies".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRemedies();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.blockContainer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameBlockContainer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.answer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAnswer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.speech".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSpeech();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.question".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameQuestion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.recitals".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRecitals();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.citations".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameCitations();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.tome".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTome();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.division".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDivision();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.part".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePart();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subchapter".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubchapter();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subdivision".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubdivision();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subsection".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubsection();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.transitional".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTransitional();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.chapter".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameChapter();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.clause".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameClause();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.paragraph".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameParagraph();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subclause".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubclause();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.sublist".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSublist();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subparagraph".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubparagraph();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.title".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.point".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePoint();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.article".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameArticle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.hcontainer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameHcontainer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.proviso".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameProviso();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.alinea".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAlinea();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.indent".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameIndent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subrule".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubrule();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.rule".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRule();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.list".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameList();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.section".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSection();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subpart".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubpart();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subtitle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubtitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.book".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameBook();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.citation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameCitation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.item".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameItem();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.tblock".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTblock();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.recital".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRecital();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.administrationOfOath".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAdministrationOfOath();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.papers".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePapers();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.proceduralMotions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameProceduralMotions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.nationalInterest".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameNationalInterest();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.noticesOfMotion".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameNoticesOfMotion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.adjournment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAdjournment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.communication".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameCommunication();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.oralStatements".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOralStatements();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.questions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameQuestions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.debateSection".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDebateSection();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.personalStatements".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePersonalStatements();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.pointOfOrder".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePointOfOrder();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.declarationOfVote".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDeclarationOfVote();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.petitions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePetitions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.resolutions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameResolutions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.rollCall".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRollCall();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.speechGroup".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSpeechGroup();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.address".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAddress();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.writtenStatements".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameWrittenStatements();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.prayers".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePrayers();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ministerialStatements".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameMinisterialStatements();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.renumberingInfo".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRenumberingInfo();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.domain".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDomain();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.new".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameNew();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.condition".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameCondition();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.otherAnalysis".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOtherAnalysis();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.foreign".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameForeign();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.result".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameResult();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.eventRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameEventRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.proprietary".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameProprietary();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.old".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOld();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.presentation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePresentation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.step".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameStep();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.preservation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePreservation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.documentRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocumentRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.debateBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDebateBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.party".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameParty();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.event".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameEvent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.role".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameRole();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quantity".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameQuantity();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.entity".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameEntity();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.organization".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOrganization();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.person".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.namePerson();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.judge".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameJudge();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.process".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameProcess();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.location".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameLocation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.lawyer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameLawyer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.concept".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameConcept();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.object".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameObject();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.term".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTerm();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.content".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameContent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.intro".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameIntro();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.longTitle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameLongTitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.note".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameNote();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.wrap".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameWrap();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.other".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOther();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.div".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDiv();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.interstitial".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameInterstitial();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.formula".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFormula();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.fragment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameFragment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.judgment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameJudgment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quotedStructure".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameQuotedStructure();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.extractStructure".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameExtractStructure();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subFlow".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSubFlow();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.authorialNote".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAuthorialNote();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.source".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameSource();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.destination".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDestination();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.doc".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDoc();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.debateReport".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDebateReport();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.statement".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameStatement();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.marker".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameMarker();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentList".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAmendmentList();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.documentCollection".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameDocumentCollection();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.officialGazette".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameOfficialGazette();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.components".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameComponents();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.meta".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameMeta();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.temporalData".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTemporalData();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.notes".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameNotes();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.tr".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTr();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.component".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameComponent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.workflow".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameWorkflow();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.toc".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameToc();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.analysis".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAnalysis();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.lifecycle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameLifecycle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.table".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTable();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.componentData".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameComponentData();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.classification".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameClassification();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.blockList".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameBlockList();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.temporalGroup".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameTemporalGroup();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.li".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameLi();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.componentInfo".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameComponentInfo();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.attachments".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameAttachments();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.identification".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.nameIdentification();
        } else {
            return widget.getType();
        }
    }

    @Override
    public String getDescription(final OverlayWidget widget) {
        if (widget == null) {
            throw new IllegalArgumentException("Null widget passed.");
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.container".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionContainer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ul".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionUl();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ol".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOl();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.parliamentary".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionParliamentary();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.akomaNtoso".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAkomaNtoso();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quorumVerification".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionQuorumVerification();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.voting".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionVoting();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.recount".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRecount();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAmendment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRauthoritative".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRauthoritative();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRprescriptive".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRprescriptive();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRalias".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRalias();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRthis".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRthis();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRname".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRname();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRuri".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRuri();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRsubtype".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRsubtype();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRcountry".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRcountry();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRformat".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRformat();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRnumber".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRnumber();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRlanguage".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRlanguage();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.timeInterval".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTimeInterval();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRdate".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRdate();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRauthor".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRauthor();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.keyword".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionKeyword();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.publication".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPublication();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRtranslation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRtranslation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.header".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionHeader();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentJustification".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAmendmentJustification();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.td".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTd();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.th".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTh();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentReference".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAmendmentReference();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentContent".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAmendmentContent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentHeading".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAmendmentHeading();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.bill".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionBill();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.act".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAct();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.rref".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRref();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ref".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.heading".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionHeading();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.eol".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionEol();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.eop".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionEop();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.noteRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionNoteRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.br".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionBr();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.img".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionImg();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAmendmentBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.judicial".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionJudicial();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.preamble".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPreamble();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.mod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.mmod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionMmod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.rmod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRmod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.efficacy".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionEfficacy();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.force".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionForce();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.application".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionApplication();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.duration".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDuration();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.references".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionReferences();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quorum".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionQuorum();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.count".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionCount();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.collectionBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionCollectionBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.preface".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPreface();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.debate".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDebate();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.textualMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTextualMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.scopeMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionScopeMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.legalSystemMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionLegalSystemMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.meaningMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionMeaningMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.efficacyMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionEfficacyMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.forceMod".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionForceMod();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.supports".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSupports();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.contrasts".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionContrasts();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.restricts".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRestricts();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.putsInQuestion".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPutsInQuestion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.applies".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionApplies();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.distinguishes".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDistinguishes();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.isAnalogTo".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionIsAnalogTo();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.dissentsFrom".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDissentsFrom();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.overrules".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOverrules();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.derogates".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDerogates();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.extends".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionExtends();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.coverPage".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionCoverPage();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.conclusions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionConclusions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.componentRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionComponentRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.body".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRExpression".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRExpression();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRItem".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRItem();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRManifestation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRManifestation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.FRBRWork".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFRBRWork();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.activeModifications".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionActiveModifications();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.passiveModifications".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPassiveModifications();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.judgmentBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionJudgmentBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCEvent".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCEvent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCLocation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCLocation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.passiveRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPassiveRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.activeRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionActiveRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.original".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOriginal();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCConcept".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCConcept();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.jurisprudence".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionJurisprudence();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.attachmentOf".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAttachmentOf();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCObject".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCObject();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCPerson".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCPerson();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCReference".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCReference();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCRole".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCRole();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCProcess".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCProcess();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.hasAttachment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionHasAttachment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCOrganization".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCOrganization();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.TLCTerm".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTLCTerm();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.fragmentBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFragmentBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.summary".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSummary();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.time".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTime();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.fillIn".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFillIn();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.signature".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSignature();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.vote".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionVote();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.listIntroduction".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionListIntroduction();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docPurpose".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocPurpose();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.date".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDate();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quotedText".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionQuotedText();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.inline".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionInline();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.relatedDocument".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRelatedDocument();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docIntroducer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocIntroducer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.b".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionB();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.a".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionA();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.i".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionI();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.num".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionNum();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.u".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionU();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.p".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionP();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docType".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocType();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.change".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionChange();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.opinion".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOpinion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docStage".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocStage();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docCommittee".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocCommittee();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.abbr".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAbbr();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docNumber".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocNumber();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.extractText".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionExtractText();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.span".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSpan();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.sub".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSub();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.sup".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSup();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docketNumber".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocketNumber();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.mref".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionMref();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.decoration".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDecoration();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.neutralCitation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionNeutralCitation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docStatus".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocStatus();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.legislature".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionLegislature();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.tocItem".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTocItem();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.session".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSession();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.recordedTime".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRecordedTime();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.scene".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionScene();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.block".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionBlock();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docJurisdiction".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocJurisdiction();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docProponent".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocProponent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.omissis".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOmissis();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.def".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docTitle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocTitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.del".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDel();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.affectedDocument".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAffectedDocument();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.placeholder".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPlaceholder();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.caption".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionCaption();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.outcome".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOutcome();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.shortTitle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionShortTitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.remark".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRemark();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.narrative".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionNarrative();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.listConclusion".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionListConclusion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.argument".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionArgument();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ins".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionIns();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subheading".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubheading();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.courtType".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionCourtType();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.from".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFrom();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.docDate".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocDate();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.introduction".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionIntroduction();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.arguments".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionArguments();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.background".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionBackground();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.mainBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionMainBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.motivation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionMotivation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.decision".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDecision();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.remedies".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRemedies();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.blockContainer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionBlockContainer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.answer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAnswer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.speech".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSpeech();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.question".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionQuestion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.recitals".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRecitals();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.citations".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionCitations();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.tome".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTome();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.division".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDivision();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.part".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPart();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subchapter".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubchapter();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subdivision".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubdivision();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subsection".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubsection();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.transitional".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTransitional();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.chapter".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionChapter();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.clause".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionClause();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.paragraph".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionParagraph();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subclause".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubclause();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.sublist".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSublist();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subparagraph".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubparagraph();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.title".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.point".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPoint();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.article".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionArticle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.hcontainer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionHcontainer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.proviso".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionProviso();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.alinea".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAlinea();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.indent".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionIndent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subrule".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubrule();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.rule".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRule();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.list".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionList();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.section".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSection();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subpart".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubpart();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subtitle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubtitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.book".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionBook();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.citation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionCitation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.item".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionItem();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.tblock".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTblock();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.recital".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRecital();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.administrationOfOath".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAdministrationOfOath();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.papers".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPapers();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.proceduralMotions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionProceduralMotions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.nationalInterest".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionNationalInterest();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.noticesOfMotion".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionNoticesOfMotion();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.adjournment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAdjournment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.communication".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionCommunication();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.oralStatements".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOralStatements();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.questions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionQuestions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.debateSection".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDebateSection();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.personalStatements".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPersonalStatements();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.pointOfOrder".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPointOfOrder();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.declarationOfVote".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDeclarationOfVote();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.petitions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPetitions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.resolutions".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionResolutions();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.rollCall".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRollCall();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.speechGroup".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSpeechGroup();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.address".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAddress();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.writtenStatements".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionWrittenStatements();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.prayers".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPrayers();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.ministerialStatements".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionMinisterialStatements();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.renumberingInfo".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRenumberingInfo();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.domain".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDomain();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.new".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionNew();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.condition".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionCondition();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.otherAnalysis".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOtherAnalysis();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.foreign".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionForeign();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.result".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionResult();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.eventRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionEventRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.proprietary".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionProprietary();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.old".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOld();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.presentation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPresentation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.step".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionStep();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.preservation".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPreservation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.documentRef".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocumentRef();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.debateBody".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDebateBody();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.party".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionParty();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.event".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionEvent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.role".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionRole();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quantity".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionQuantity();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.entity".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionEntity();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.organization".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOrganization();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.person".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionPerson();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.judge".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionJudge();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.process".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionProcess();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.location".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionLocation();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.lawyer".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionLawyer();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.concept".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionConcept();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.object".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionObject();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.term".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTerm();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.content".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionContent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.intro".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionIntro();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.longTitle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionLongTitle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.note".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionNote();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.wrap".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionWrap();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.other".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOther();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.div".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDiv();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.interstitial".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionInterstitial();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.formula".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFormula();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.fragment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionFragment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.judgment".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionJudgment();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.quotedStructure".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionQuotedStructure();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.extractStructure".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionExtractStructure();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.subFlow".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSubFlow();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.authorialNote".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAuthorialNote();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.source".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionSource();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.destination".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDestination();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.doc".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDoc();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.debateReport".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDebateReport();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.statement".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionStatement();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.marker".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionMarker();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.amendmentList".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAmendmentList();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.documentCollection".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionDocumentCollection();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.officialGazette".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionOfficialGazette();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.components".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionComponents();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.meta".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionMeta();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.temporalData".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTemporalData();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.notes".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionNotes();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.tr".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTr();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.component".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionComponent();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.workflow".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionWorkflow();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.toc".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionToc();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.analysis".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAnalysis();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.lifecycle".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionLifecycle();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.table".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTable();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.componentData".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionComponentData();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.classification".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionClassification();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.blockList".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionBlockList();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.temporalGroup".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionTemporalGroup();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.li".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionLi();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.componentInfo".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionComponentInfo();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.attachments".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionAttachments();
        } else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.identification".equalsIgnoreCase(widget.getClass().getName())) {
            return MESSAGES.descriptionIdentification();
        } else {
            return widget.getType();
        }
    }

    @Override
    public String getNamespaceURI() {
        return namespaceURI;
    }

}