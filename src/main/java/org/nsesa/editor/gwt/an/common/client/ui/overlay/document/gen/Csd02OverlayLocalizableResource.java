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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen;

import com.google.inject.Inject;
import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayLocalizableResource;
import com.google.gwt.i18n.client.Messages;
import java.util.logging.Logger;
import java.util.Map;
/**
* An implementation of <code>OverlayLocalizableResource</code> interface by getting the localizable information
* from GWT properties files.
* Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayLocalizableResource.ftl</tt>.
*/
public class Csd02OverlayLocalizableResource extends DefaultOverlayLocalizableResource {
private static Csd02OverlayMessages MESSAGES = GWT.create(Csd02OverlayMessages.class);

@Override
public String getName(final OverlayWidget widget) {
if (widget == null) {
throw new IllegalArgumentException("Null widget passed.");
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.container".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameContainer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.judgement".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameJudgement();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ul".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameUl();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ol".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOl();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.parliamentary".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameParliamentary();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.akomaNtoso".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAkomaNtoso();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quorumVerification".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameQuorumVerification();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.voting".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameVoting();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.recount".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRecount();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendment".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAmendment();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRalias".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRalias();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRthis".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRthis();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRname".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRname();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRuri".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRuri();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRsubtype".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRsubtype();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRcountry".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRcountry();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRformat".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRformat();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRnumber".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRnumber();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRlanguage".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRlanguage();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.timeInterval".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTimeInterval();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRdate".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRdate();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRauthor".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRauthor();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.keyword".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameKeyword();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.publication".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePublication();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRtranslation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRtranslation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.header".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameHeader();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentJustification".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAmendmentJustification();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.td".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTd();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.th".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTh();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentReference".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAmendmentReference();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentContent".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAmendmentContent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentHeading".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAmendmentHeading();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.bill".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameBill();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.act".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAct();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.judgementBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameJudgementBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.rref".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRref();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ref".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.heading".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameHeading();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.eol".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameEol();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.eop".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameEop();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.noteRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameNoteRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.br".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameBr();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.img".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameImg();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAmendmentBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.preamble".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePreamble();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.judicial".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameJudicial();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.mod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.mmod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameMmod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.rmod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRmod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.efficacy".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameEfficacy();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.force".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameForce();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.application".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameApplication();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.duration".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDuration();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.references".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameReferences();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quorum".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameQuorum();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.count".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameCount();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.collectionBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameCollectionBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.preface".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePreface();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.debate".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDebate();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.textualMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTextualMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.scopeMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameScopeMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.legalSystemMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameLegalSystemMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.meaningMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameMeaningMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.efficacyMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameEfficacyMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.forceMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameForceMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.supports".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSupports();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.contrasts".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameContrasts();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.restricts".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRestricts();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.putsInQuestion".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePutsInQuestion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.applies".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameApplies();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.distinguishes".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDistinguishes();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.isAnalogTo".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameIsAnalogTo();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.dissentsFrom".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDissentsFrom();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.overrules".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOverrules();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.derogates".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDerogates();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.extends".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameExtends();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.coverPage".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameCoverPage();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.conclusions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameConclusions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.componentRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameComponentRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.body".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRExpression".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRExpression();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRItem".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRItem();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRManifestation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRManifestation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRWork".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFRBRWork();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.activeModifications".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameActiveModifications();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.passiveModifications".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePassiveModifications();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCEvent".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCEvent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCLocation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCLocation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.passiveRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePassiveRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.activeRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameActiveRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.original".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOriginal();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCConcept".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCConcept();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.jurisprudence".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameJurisprudence();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.attachmentOf".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAttachmentOf();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCObject".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCObject();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCPerson".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCPerson();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCReference".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCReference();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCRole".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCRole();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCProcess".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCProcess();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.hasAttachment".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameHasAttachment();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCOrganization".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCOrganization();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCTerm".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTLCTerm();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.fragmentBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFragmentBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.summary".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSummary();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.time".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTime();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.fillIn".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFillIn();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.signature".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSignature();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.vote".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameVote();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.listIntroduction".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameListIntroduction();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docPurpose".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocPurpose();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.date".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDate();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quotedText".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameQuotedText();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.inline".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameInline();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.relatedDocument".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRelatedDocument();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docIntroducer".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocIntroducer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.b".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameB();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.a".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameA();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.i".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameI();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.num".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameNum();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.u".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameU();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.p".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameP();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docType".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocType();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.change".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameChange();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.opinion".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOpinion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docStage".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocStage();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docCommittee".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocCommittee();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.abbr".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAbbr();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docNumber".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocNumber();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.extractText".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameExtractText();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.span".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSpan();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.sub".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSub();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.sup".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSup();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docketNumber".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocketNumber();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.mref".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameMref();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.neutralCitation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameNeutralCitation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docStatus".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocStatus();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.legislature".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameLegislature();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.tocItem".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTocItem();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.session".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSession();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.recordedTime".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRecordedTime();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.scene".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameScene();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.block".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameBlock();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docJurisdiction".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocJurisdiction();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docProponent".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocProponent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.omissis".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOmissis();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.def".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docTitle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocTitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.del".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDel();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.affectedDocument".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAffectedDocument();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.placeholder".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePlaceholder();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.caption".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameCaption();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.outcome".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOutcome();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.shortTitle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameShortTitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.remark".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRemark();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.narrative".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameNarrative();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.listConclusion".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameListConclusion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ins".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameIns();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subheading".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSubheading();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.courtType".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameCourtType();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.from".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFrom();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docDate".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocDate();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.introduction".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameIntroduction();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.arguments".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameArguments();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.background".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameBackground();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.mainBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameMainBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.motivation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameMotivation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.decision".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDecision();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.remedies".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRemedies();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.answer".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAnswer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.speech".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSpeech();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.question".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameQuestion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.recitals".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRecitals();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.citations".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameCitations();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.tome".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTome();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.division".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDivision();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.part".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePart();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subchapter".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSubchapter();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subdivision".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSubdivision();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subsection".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSubsection();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.transitional".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTransitional();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.chapter".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameChapter();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.clause".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameClause();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.paragraph".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameParagraph();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subclause".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSubclause();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.sublist".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSublist();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subparagraph".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSubparagraph();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.title".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.point".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePoint();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.article".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameArticle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.hcontainer".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameHcontainer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.alinea".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAlinea();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.indent".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameIndent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.list".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameList();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.section".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSection();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subpart".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSubpart();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subtitle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSubtitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.book".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameBook();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.toc".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameToc();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.citation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameCitation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.item".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameItem();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.tblock".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTblock();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.recital".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRecital();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.administrationOfOath".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAdministrationOfOath();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.papers".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePapers();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.proceduralMotions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameProceduralMotions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.nationalInterest".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameNationalInterest();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.noticesOfMotion".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameNoticesOfMotion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.adjournment".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAdjournment();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.communication".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameCommunication();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.oralStatements".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOralStatements();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.questions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameQuestions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.debateSection".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDebateSection();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.personalStatements".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePersonalStatements();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.pointOfOrder".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePointOfOrder();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.declarationOfVote".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDeclarationOfVote();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.petitions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePetitions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.resolutions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameResolutions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.rollCall".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRollCall();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.speechGroup".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSpeechGroup();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.address".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAddress();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.writtenStatements".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameWrittenStatements();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.prayers".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePrayers();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ministerialStatements".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameMinisterialStatements();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.domain".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDomain();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.new".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameNew();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.condition".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameCondition();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.otherAnalysis".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOtherAnalysis();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.foreign".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameForeign();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.result".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameResult();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.eventRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameEventRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.proprietary".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameProprietary();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.old".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOld();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.presentation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePresentation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.step".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameStep();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.preservation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePreservation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.documentRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocumentRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.debateBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDebateBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.party".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameParty();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.event".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameEvent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.role".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameRole();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quantity".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameQuantity();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.entity".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameEntity();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.organization".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOrganization();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.person".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePerson();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.judge".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameJudge();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.process".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameProcess();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.location".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameLocation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.lawyer".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameLawyer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.concept".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameConcept();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.object".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameObject();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.term".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTerm();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.content".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameContent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.intro".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameIntro();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.longTitle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameLongTitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.note".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameNote();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.wrap".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameWrap();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.other".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOther();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.div".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDiv();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.interstitial".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameInterstitial();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.formula".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFormula();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.fragment".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameFragment();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quotedStructure".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameQuotedStructure();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.extractStructure".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameExtractStructure();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.popup".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.namePopup();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.authorialNote".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAuthorialNote();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.source".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameSource();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.destination".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDestination();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.doc".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDoc();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.debateReport".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDebateReport();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.marker".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameMarker();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentList".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAmendmentList();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.documentCollection".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameDocumentCollection();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.officialGazette".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameOfficialGazette();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.components".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameComponents();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.meta".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameMeta();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.temporalData".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTemporalData();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.notes".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameNotes();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.tr".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTr();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.component".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameComponent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.workflow".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameWorkflow();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.analysis".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAnalysis();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.lifecycle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameLifecycle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.table".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTable();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.componentData".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameComponentData();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.classification".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameClassification();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.blockList".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameBlockList();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.temporalGroup".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameTemporalGroup();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.li".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameLi();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.componentInfo".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameComponentInfo();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.attachments".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameAttachments();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.identification".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.nameIdentification();
}
else {
return widget.getType();
}
}

@Override
public String getDescription(final OverlayWidget widget) {
if (widget == null) {
throw new IllegalArgumentException("Null widget passed.");
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.container".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionContainer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.judgement".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionJudgement();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ul".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionUl();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ol".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOl();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.parliamentary".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionParliamentary();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.akomaNtoso".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAkomaNtoso();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quorumVerification".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionQuorumVerification();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.voting".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionVoting();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.recount".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRecount();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendment".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAmendment();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRalias".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRalias();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRthis".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRthis();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRname".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRname();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRuri".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRuri();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRsubtype".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRsubtype();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRcountry".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRcountry();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRformat".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRformat();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRnumber".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRnumber();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRlanguage".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRlanguage();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.timeInterval".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTimeInterval();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRdate".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRdate();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRauthor".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRauthor();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.keyword".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionKeyword();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.publication".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPublication();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRtranslation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRtranslation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.header".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionHeader();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentJustification".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAmendmentJustification();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.td".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTd();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.th".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTh();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentReference".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAmendmentReference();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentContent".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAmendmentContent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentHeading".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAmendmentHeading();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.bill".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionBill();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.act".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAct();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.judgementBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionJudgementBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.rref".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRref();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ref".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.heading".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionHeading();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.eol".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionEol();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.eop".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionEop();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.noteRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionNoteRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.br".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionBr();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.img".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionImg();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAmendmentBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.preamble".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPreamble();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.judicial".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionJudicial();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.mod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.mmod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionMmod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.rmod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRmod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.efficacy".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionEfficacy();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.force".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionForce();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.application".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionApplication();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.duration".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDuration();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.references".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionReferences();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quorum".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionQuorum();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.count".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionCount();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.collectionBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionCollectionBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.preface".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPreface();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.debate".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDebate();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.textualMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTextualMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.scopeMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionScopeMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.legalSystemMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionLegalSystemMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.meaningMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionMeaningMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.efficacyMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionEfficacyMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.forceMod".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionForceMod();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.supports".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSupports();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.contrasts".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionContrasts();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.restricts".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRestricts();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.putsInQuestion".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPutsInQuestion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.applies".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionApplies();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.distinguishes".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDistinguishes();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.isAnalogTo".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionIsAnalogTo();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.dissentsFrom".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDissentsFrom();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.overrules".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOverrules();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.derogates".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDerogates();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.extends".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionExtends();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.coverPage".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionCoverPage();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.conclusions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionConclusions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.componentRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionComponentRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.body".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRExpression".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRExpression();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRItem".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRItem();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRManifestation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRManifestation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.FRBRWork".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFRBRWork();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.activeModifications".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionActiveModifications();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.passiveModifications".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPassiveModifications();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCEvent".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCEvent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCLocation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCLocation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.passiveRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPassiveRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.activeRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionActiveRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.original".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOriginal();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCConcept".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCConcept();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.jurisprudence".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionJurisprudence();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.attachmentOf".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAttachmentOf();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCObject".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCObject();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCPerson".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCPerson();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCReference".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCReference();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCRole".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCRole();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCProcess".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCProcess();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.hasAttachment".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionHasAttachment();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCOrganization".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCOrganization();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TLCTerm".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTLCTerm();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.fragmentBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFragmentBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.summary".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSummary();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.time".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTime();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.fillIn".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFillIn();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.signature".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSignature();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.vote".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionVote();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.listIntroduction".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionListIntroduction();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docPurpose".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocPurpose();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.date".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDate();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quotedText".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionQuotedText();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.inline".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionInline();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.relatedDocument".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRelatedDocument();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docIntroducer".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocIntroducer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.b".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionB();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.a".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionA();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.i".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionI();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.num".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionNum();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.u".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionU();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.p".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionP();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docType".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocType();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.change".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionChange();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.opinion".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOpinion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docStage".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocStage();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docCommittee".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocCommittee();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.abbr".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAbbr();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docNumber".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocNumber();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.extractText".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionExtractText();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.span".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSpan();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.sub".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSub();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.sup".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSup();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docketNumber".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocketNumber();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.mref".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionMref();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.neutralCitation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionNeutralCitation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docStatus".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocStatus();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.legislature".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionLegislature();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.tocItem".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTocItem();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.session".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSession();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.recordedTime".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRecordedTime();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.scene".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionScene();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.block".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionBlock();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docJurisdiction".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocJurisdiction();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docProponent".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocProponent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.omissis".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOmissis();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.def".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docTitle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocTitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.del".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDel();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.affectedDocument".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAffectedDocument();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.placeholder".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPlaceholder();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.caption".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionCaption();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.outcome".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOutcome();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.shortTitle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionShortTitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.remark".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRemark();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.narrative".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionNarrative();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.listConclusion".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionListConclusion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ins".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionIns();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subheading".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSubheading();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.courtType".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionCourtType();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.from".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFrom();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.docDate".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocDate();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.introduction".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionIntroduction();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.arguments".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionArguments();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.background".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionBackground();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.mainBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionMainBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.motivation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionMotivation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.decision".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDecision();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.remedies".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRemedies();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.answer".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAnswer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.speech".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSpeech();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.question".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionQuestion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.recitals".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRecitals();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.citations".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionCitations();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.tome".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTome();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.division".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDivision();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.part".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPart();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subchapter".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSubchapter();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subdivision".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSubdivision();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subsection".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSubsection();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.transitional".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTransitional();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.chapter".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionChapter();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.clause".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionClause();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.paragraph".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionParagraph();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subclause".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSubclause();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.sublist".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSublist();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subparagraph".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSubparagraph();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.title".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.point".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPoint();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.article".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionArticle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.hcontainer".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionHcontainer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.alinea".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAlinea();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.indent".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionIndent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.list".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionList();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.section".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSection();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subpart".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSubpart();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.subtitle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSubtitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.book".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionBook();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.toc".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionToc();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.citation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionCitation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.item".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionItem();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.tblock".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTblock();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.recital".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRecital();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.administrationOfOath".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAdministrationOfOath();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.papers".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPapers();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.proceduralMotions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionProceduralMotions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.nationalInterest".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionNationalInterest();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.noticesOfMotion".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionNoticesOfMotion();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.adjournment".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAdjournment();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.communication".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionCommunication();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.oralStatements".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOralStatements();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.questions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionQuestions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.debateSection".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDebateSection();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.personalStatements".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPersonalStatements();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.pointOfOrder".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPointOfOrder();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.declarationOfVote".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDeclarationOfVote();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.petitions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPetitions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.resolutions".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionResolutions();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.rollCall".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRollCall();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.speechGroup".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSpeechGroup();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.address".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAddress();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.writtenStatements".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionWrittenStatements();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.prayers".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPrayers();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ministerialStatements".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionMinisterialStatements();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.domain".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDomain();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.new".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionNew();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.condition".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionCondition();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.otherAnalysis".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOtherAnalysis();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.foreign".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionForeign();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.result".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionResult();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.eventRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionEventRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.proprietary".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionProprietary();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.old".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOld();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.presentation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPresentation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.step".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionStep();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.preservation".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPreservation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.documentRef".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocumentRef();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.debateBody".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDebateBody();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.party".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionParty();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.event".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionEvent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.role".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionRole();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quantity".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionQuantity();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.entity".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionEntity();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.organization".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOrganization();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.person".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPerson();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.judge".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionJudge();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.process".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionProcess();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.location".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionLocation();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.lawyer".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionLawyer();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.concept".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionConcept();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.object".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionObject();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.term".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTerm();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.content".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionContent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.intro".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionIntro();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.longTitle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionLongTitle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.note".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionNote();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.wrap".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionWrap();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.other".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOther();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.div".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDiv();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.interstitial".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionInterstitial();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.formula".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFormula();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.fragment".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionFragment();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.quotedStructure".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionQuotedStructure();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.extractStructure".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionExtractStructure();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.popup".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionPopup();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.authorialNote".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAuthorialNote();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.source".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionSource();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.destination".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDestination();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.doc".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDoc();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.debateReport".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDebateReport();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.marker".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionMarker();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.amendmentList".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAmendmentList();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.documentCollection".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionDocumentCollection();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.officialGazette".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionOfficialGazette();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.components".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionComponents();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.meta".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionMeta();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.temporalData".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTemporalData();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.notes".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionNotes();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.tr".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTr();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.component".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionComponent();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.workflow".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionWorkflow();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.analysis".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAnalysis();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.lifecycle".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionLifecycle();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.table".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTable();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.componentData".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionComponentData();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.classification".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionClassification();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.blockList".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionBlockList();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.temporalGroup".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionTemporalGroup();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.li".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionLi();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.componentInfo".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionComponentInfo();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.attachments".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionAttachments();
}
else if ("org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.identification".equalsIgnoreCase(widget.getClass().getName())) {
return MESSAGES.descriptionIdentification();
}
else {
return widget.getType();
}
}

}