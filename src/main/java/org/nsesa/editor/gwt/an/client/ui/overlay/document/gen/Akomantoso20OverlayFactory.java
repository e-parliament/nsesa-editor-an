package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen;

import com.google.gwt.dom.client.Element;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Object;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Process;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;

import java.util.Map;
import java.util.logging.Logger;

/**
 * This file is generated.
 */
public class Akomantoso20OverlayFactory extends DefaultOverlayFactory {

    private final static Logger LOG = Logger.getLogger(Akomantoso20OverlayFactory.class.getName());

    @Inject
    public Akomantoso20OverlayFactory(final OverlayStrategy overlayStrategy) {
        super(overlayStrategy);
    }

    public AmendableWidget toAmendableWidget(final Element element, final Map<String, String> namespaces) {
        //LOG.info("Overlaying element (nodename: " + element.getNodeName() + ", tagname: " + element.getTagName() + ")");
        if ("".equals(element.getNodeName())) {
            throw new IllegalArgumentException("Empty element or null passed.");
        } else if (element.getNodeName().startsWith("/")) {
            // assume IE8
            LOG.warning("A node with a name starting with a slash was passed. Enjoy IE8!");
            return null;
        } else if ("container".equalsIgnoreCase(element.getNodeName())) {
            return new Container(element);
        } else if ("judgement".equalsIgnoreCase(element.getNodeName())) {
            return new Judgement(element);
        } else if ("ul".equalsIgnoreCase(element.getNodeName())) {
            return new Ul(element);
        } else if ("ol".equalsIgnoreCase(element.getNodeName())) {
            return new Ol(element);
        } else if ("parliamentary".equalsIgnoreCase(element.getNodeName())) {
            return new Parliamentary(element);
        } else if ("akomaNtoso".equalsIgnoreCase(element.getNodeName())) {
            return new AkomaNtoso(element);
        } else if ("amendment".equalsIgnoreCase(element.getNodeName())) {
            return new Amendment(element);
        } else if ("quorumVerification".equalsIgnoreCase(element.getNodeName())) {
            return new QuorumVerification(element);
        } else if ("voting".equalsIgnoreCase(element.getNodeName())) {
            return new Voting(element);
        } else if ("recount".equalsIgnoreCase(element.getNodeName())) {
            return new Recount(element);
        } else if ("FRBRalias".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRalias(element);
        } else if ("FRBRthis".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRthis(element);
        } else if ("FRBRname".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRname(element);
        } else if ("FRBRuri".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRuri(element);
        } else if ("FRBRsubtype".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRsubtype(element);
        } else if ("FRBRcountry".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRcountry(element);
        } else if ("FRBRformat".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRformat(element);
        } else if ("FRBRnumber".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRnumber(element);
        } else if ("FRBRlanguage".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRlanguage(element);
        } else if ("timeInterval".equalsIgnoreCase(element.getNodeName())) {
            return new TimeInterval(element);
        } else if ("FRBRdate".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRdate(element);
        } else if ("FRBRauthor".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRauthor(element);
        } else if ("keyword".equalsIgnoreCase(element.getNodeName())) {
            return new Keyword(element);
        } else if ("publication".equalsIgnoreCase(element.getNodeName())) {
            return new Publication(element);
        } else if ("FRBRtranslation".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRtranslation(element);
        } else if ("header".equalsIgnoreCase(element.getNodeName())) {
            return new Header(element);
        } else if ("content".equalsIgnoreCase(element.getNodeName())) {
            return new Content(element);
        } else if ("intro".equalsIgnoreCase(element.getNodeName())) {
            return new Intro(element);
        } else if ("amendmentJustification".equalsIgnoreCase(element.getNodeName())) {
            return new AmendmentJustification(element);
        } else if ("td".equalsIgnoreCase(element.getNodeName())) {
            return new Td(element);
        } else if ("th".equalsIgnoreCase(element.getNodeName())) {
            return new Th(element);
        } else if ("amendmentReference".equalsIgnoreCase(element.getNodeName())) {
            return new AmendmentReference(element);
        } else if ("amendmentContent".equalsIgnoreCase(element.getNodeName())) {
            return new AmendmentContent(element);
        } else if ("longTitle".equalsIgnoreCase(element.getNodeName())) {
            return new LongTitle(element);
        } else if ("wrap".equalsIgnoreCase(element.getNodeName())) {
            return new Wrap(element);
        } else if ("amendmentHeading".equalsIgnoreCase(element.getNodeName())) {
            return new AmendmentHeading(element);
        } else if ("other".equalsIgnoreCase(element.getNodeName())) {
            return new Other(element);
        } else if ("formula".equalsIgnoreCase(element.getNodeName())) {
            return new Formula(element);
        } else if ("bill".equalsIgnoreCase(element.getNodeName())) {
            return new Bill(element);
        } else if ("act".equalsIgnoreCase(element.getNodeName())) {
            return new Act(element);
        } else if ("judgementBody".equalsIgnoreCase(element.getNodeName())) {
            return new JudgementBody(element);
        } else if ("rref".equalsIgnoreCase(element.getNodeName())) {
            return new Rref(element);
        } else if ("ref".equalsIgnoreCase(element.getNodeName())) {
            return new Ref(element);
        } else if ("eol".equalsIgnoreCase(element.getNodeName())) {
            return new Eol(element);
        } else if ("eop".equalsIgnoreCase(element.getNodeName())) {
            return new Eop(element);
        } else if ("noteRef".equalsIgnoreCase(element.getNodeName())) {
            return new NoteRef(element);
        } else if ("br".equalsIgnoreCase(element.getNodeName())) {
            return new Br(element);
        } else if ("img".equalsIgnoreCase(element.getNodeName())) {
            return new Img(element);
        } else if ("amendmentBody".equalsIgnoreCase(element.getNodeName())) {
            return new AmendmentBody(element);
        } else if ("preamble".equalsIgnoreCase(element.getNodeName())) {
            return new Preamble(element);
        } else if ("judicial".equalsIgnoreCase(element.getNodeName())) {
            return new Judicial(element);
        } else if ("mod".equalsIgnoreCase(element.getNodeName())) {
            return new Mod(element);
        } else if ("mmod".equalsIgnoreCase(element.getNodeName())) {
            return new Mmod(element);
        } else if ("rmod".equalsIgnoreCase(element.getNodeName())) {
            return new Rmod(element);
        } else if ("efficacy".equalsIgnoreCase(element.getNodeName())) {
            return new Efficacy(element);
        } else if ("force".equalsIgnoreCase(element.getNodeName())) {
            return new Force(element);
        } else if ("application".equalsIgnoreCase(element.getNodeName())) {
            return new Application(element);
        } else if ("duration".equalsIgnoreCase(element.getNodeName())) {
            return new Duration(element);
        } else if ("references".equalsIgnoreCase(element.getNodeName())) {
            return new References(element);
        } else if ("collectionBody".equalsIgnoreCase(element.getNodeName())) {
            return new CollectionBody(element);
        } else if ("preface".equalsIgnoreCase(element.getNodeName())) {
            return new Preface(element);
        } else if ("quorum".equalsIgnoreCase(element.getNodeName())) {
            return new Quorum(element);
        } else if ("count".equalsIgnoreCase(element.getNodeName())) {
            return new Count(element);
        } else if ("debate".equalsIgnoreCase(element.getNodeName())) {
            return new Debate(element);
        } else if ("textualMod".equalsIgnoreCase(element.getNodeName())) {
            return new TextualMod(element);
        } else if ("scopeMod".equalsIgnoreCase(element.getNodeName())) {
            return new ScopeMod(element);
        } else if ("legalSystemMod".equalsIgnoreCase(element.getNodeName())) {
            return new LegalSystemMod(element);
        } else if ("meaningMod".equalsIgnoreCase(element.getNodeName())) {
            return new MeaningMod(element);
        } else if ("efficacyMod".equalsIgnoreCase(element.getNodeName())) {
            return new EfficacyMod(element);
        } else if ("forceMod".equalsIgnoreCase(element.getNodeName())) {
            return new ForceMod(element);
        } else if ("supports".equalsIgnoreCase(element.getNodeName())) {
            return new Supports(element);
        } else if ("contrasts".equalsIgnoreCase(element.getNodeName())) {
            return new Contrasts(element);
        } else if ("restricts".equalsIgnoreCase(element.getNodeName())) {
            return new Restricts(element);
        } else if ("putsInQuestion".equalsIgnoreCase(element.getNodeName())) {
            return new PutsInQuestion(element);
        } else if ("applies".equalsIgnoreCase(element.getNodeName())) {
            return new Applies(element);
        } else if ("distinguishes".equalsIgnoreCase(element.getNodeName())) {
            return new Distinguishes(element);
        } else if ("isAnalogTo".equalsIgnoreCase(element.getNodeName())) {
            return new IsAnalogTo(element);
        } else if ("dissentsFrom".equalsIgnoreCase(element.getNodeName())) {
            return new DissentsFrom(element);
        } else if ("overrules".equalsIgnoreCase(element.getNodeName())) {
            return new Overrules(element);
        } else if ("derogates".equalsIgnoreCase(element.getNodeName())) {
            return new Derogates(element);
        } else if ("extends".equalsIgnoreCase(element.getNodeName())) {
            return new Extends(element);
        } else if ("coverPage".equalsIgnoreCase(element.getNodeName())) {
            return new CoverPage(element);
        } else if ("conclusions".equalsIgnoreCase(element.getNodeName())) {
            return new Conclusions(element);
        } else if ("componentRef".equalsIgnoreCase(element.getNodeName())) {
            return new ComponentRef(element);
        } else if ("body".equalsIgnoreCase(element.getNodeName())) {
            return new Body(element);
        } else if ("FRBRExpression".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRExpression(element);
        } else if ("FRBRItem".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRItem(element);
        } else if ("FRBRManifestation".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRManifestation(element);
        } else if ("FRBRWork".equalsIgnoreCase(element.getNodeName())) {
            return new FRBRWork(element);
        } else if ("activeModifications".equalsIgnoreCase(element.getNodeName())) {
            return new ActiveModifications(element);
        } else if ("passiveModifications".equalsIgnoreCase(element.getNodeName())) {
            return new PassiveModifications(element);
        } else if ("TLCEvent".equalsIgnoreCase(element.getNodeName())) {
            return new TLCEvent(element);
        } else if ("TLCLocation".equalsIgnoreCase(element.getNodeName())) {
            return new TLCLocation(element);
        } else if ("passiveRef".equalsIgnoreCase(element.getNodeName())) {
            return new PassiveRef(element);
        } else if ("activeRef".equalsIgnoreCase(element.getNodeName())) {
            return new ActiveRef(element);
        } else if ("original".equalsIgnoreCase(element.getNodeName())) {
            return new Original(element);
        } else if ("TLCConcept".equalsIgnoreCase(element.getNodeName())) {
            return new TLCConcept(element);
        } else if ("jurisprudence".equalsIgnoreCase(element.getNodeName())) {
            return new Jurisprudence(element);
        } else if ("attachmentOf".equalsIgnoreCase(element.getNodeName())) {
            return new AttachmentOf(element);
        } else if ("TLCObject".equalsIgnoreCase(element.getNodeName())) {
            return new TLCObject(element);
        } else if ("TLCPerson".equalsIgnoreCase(element.getNodeName())) {
            return new TLCPerson(element);
        } else if ("TLCReference".equalsIgnoreCase(element.getNodeName())) {
            return new TLCReference(element);
        } else if ("TLCRole".equalsIgnoreCase(element.getNodeName())) {
            return new TLCRole(element);
        } else if ("TLCProcess".equalsIgnoreCase(element.getNodeName())) {
            return new TLCProcess(element);
        } else if ("hasAttachment".equalsIgnoreCase(element.getNodeName())) {
            return new HasAttachment(element);
        } else if ("TLCOrganization".equalsIgnoreCase(element.getNodeName())) {
            return new TLCOrganization(element);
        } else if ("TLCTerm".equalsIgnoreCase(element.getNodeName())) {
            return new TLCTerm(element);
        } else if ("fragmentBody".equalsIgnoreCase(element.getNodeName())) {
            return new FragmentBody(element);
        } else if ("summary".equalsIgnoreCase(element.getNodeName())) {
            return new Summary(element);
        } else if ("fillIn".equalsIgnoreCase(element.getNodeName())) {
            return new FillIn(element);
        } else if ("signature".equalsIgnoreCase(element.getNodeName())) {
            return new Signature(element);
        } else if ("vote".equalsIgnoreCase(element.getNodeName())) {
            return new Vote(element);
        } else if ("listIntroduction".equalsIgnoreCase(element.getNodeName())) {
            return new ListIntroduction(element);
        } else if ("docPurpose".equalsIgnoreCase(element.getNodeName())) {
            return new DocPurpose(element);
        } else if ("date".equalsIgnoreCase(element.getNodeName())) {
            return new Date(element);
        } else if ("quotedText".equalsIgnoreCase(element.getNodeName())) {
            return new QuotedText(element);
        } else if ("inline".equalsIgnoreCase(element.getNodeName())) {
            return new Inline(element);
        } else if ("relatedDocument".equalsIgnoreCase(element.getNodeName())) {
            return new RelatedDocument(element);
        } else if ("docIntroducer".equalsIgnoreCase(element.getNodeName())) {
            return new DocIntroducer(element);
        } else if ("b".equalsIgnoreCase(element.getNodeName())) {
            return new B(element);
        } else if ("a".equalsIgnoreCase(element.getNodeName())) {
            return new A(element);
        } else if ("i".equalsIgnoreCase(element.getNodeName())) {
            return new I(element);
        } else if ("num".equalsIgnoreCase(element.getNodeName())) {
            return new Num(element);
        } else if ("u".equalsIgnoreCase(element.getNodeName())) {
            return new U(element);
        } else if ("p".equalsIgnoreCase(element.getNodeName())) {
            return new P(element);
        } else if ("docType".equalsIgnoreCase(element.getNodeName())) {
            return new DocType(element);
        } else if ("change".equalsIgnoreCase(element.getNodeName())) {
            return new Change(element);
        } else if ("opinion".equalsIgnoreCase(element.getNodeName())) {
            return new Opinion(element);
        } else if ("docStage".equalsIgnoreCase(element.getNodeName())) {
            return new DocStage(element);
        } else if ("docCommittee".equalsIgnoreCase(element.getNodeName())) {
            return new DocCommittee(element);
        } else if ("docNumber".equalsIgnoreCase(element.getNodeName())) {
            return new DocNumber(element);
        } else if ("extractText".equalsIgnoreCase(element.getNodeName())) {
            return new ExtractText(element);
        } else if ("span".equalsIgnoreCase(element.getNodeName())) {
            return new Span(element);
        } else if ("sub".equalsIgnoreCase(element.getNodeName())) {
            return new Sub(element);
        } else if ("sup".equalsIgnoreCase(element.getNodeName())) {
            return new Sup(element);
        } else if ("docketNumber".equalsIgnoreCase(element.getNodeName())) {
            return new DocketNumber(element);
        } else if ("mref".equalsIgnoreCase(element.getNodeName())) {
            return new Mref(element);
        } else if ("neutralCitation".equalsIgnoreCase(element.getNodeName())) {
            return new NeutralCitation(element);
        } else if ("docStatus".equalsIgnoreCase(element.getNodeName())) {
            return new DocStatus(element);
        } else if ("legislature".equalsIgnoreCase(element.getNodeName())) {
            return new Legislature(element);
        } else if ("tocItem".equalsIgnoreCase(element.getNodeName())) {
            return new TocItem(element);
        } else if ("session".equalsIgnoreCase(element.getNodeName())) {
            return new Session(element);
        } else if ("recordedTime".equalsIgnoreCase(element.getNodeName())) {
            return new RecordedTime(element);
        } else if ("scene".equalsIgnoreCase(element.getNodeName())) {
            return new Scene(element);
        } else if ("heading".equalsIgnoreCase(element.getNodeName())) {
            return new Heading(element);
        } else if ("block".equalsIgnoreCase(element.getNodeName())) {
            return new Block(element);
        } else if ("docJurisdiction".equalsIgnoreCase(element.getNodeName())) {
            return new DocJurisdiction(element);
        } else if ("docProponent".equalsIgnoreCase(element.getNodeName())) {
            return new DocProponent(element);
        } else if ("omissis".equalsIgnoreCase(element.getNodeName())) {
            return new Omissis(element);
        } else if ("def".equalsIgnoreCase(element.getNodeName())) {
            return new Def(element);
        } else if ("docTitle".equalsIgnoreCase(element.getNodeName())) {
            return new DocTitle(element);
        } else if ("del".equalsIgnoreCase(element.getNodeName())) {
            return new Del(element);
        } else if ("affectedDocument".equalsIgnoreCase(element.getNodeName())) {
            return new AffectedDocument(element);
        } else if ("placeholder".equalsIgnoreCase(element.getNodeName())) {
            return new Placeholder(element);
        } else if ("caption".equalsIgnoreCase(element.getNodeName())) {
            return new Caption(element);
        } else if ("outcome".equalsIgnoreCase(element.getNodeName())) {
            return new Outcome(element);
        } else if ("shortTitle".equalsIgnoreCase(element.getNodeName())) {
            return new ShortTitle(element);
        } else if ("remark".equalsIgnoreCase(element.getNodeName())) {
            return new Remark(element);
        } else if ("narrative".equalsIgnoreCase(element.getNodeName())) {
            return new Narrative(element);
        } else if ("listConclusion".equalsIgnoreCase(element.getNodeName())) {
            return new ListConclusion(element);
        } else if ("ins".equalsIgnoreCase(element.getNodeName())) {
            return new Ins(element);
        } else if ("subheading".equalsIgnoreCase(element.getNodeName())) {
            return new Subheading(element);
        } else if ("courtType".equalsIgnoreCase(element.getNodeName())) {
            return new CourtType(element);
        } else if ("from".equalsIgnoreCase(element.getNodeName())) {
            return new From(element);
        } else if ("docDate".equalsIgnoreCase(element.getNodeName())) {
            return new DocDate(element);
        } else if ("introduction".equalsIgnoreCase(element.getNodeName())) {
            return new Introduction(element);
        } else if ("background".equalsIgnoreCase(element.getNodeName())) {
            return new Background(element);
        } else if ("mainBody".equalsIgnoreCase(element.getNodeName())) {
            return new MainBody(element);
        } else if ("motivation".equalsIgnoreCase(element.getNodeName())) {
            return new Motivation(element);
        } else if ("decision".equalsIgnoreCase(element.getNodeName())) {
            return new Decision(element);
        } else if ("answer".equalsIgnoreCase(element.getNodeName())) {
            return new Answer(element);
        } else if ("speech".equalsIgnoreCase(element.getNodeName())) {
            return new Speech(element);
        } else if ("question".equalsIgnoreCase(element.getNodeName())) {
            return new Question(element);
        } else if ("tome".equalsIgnoreCase(element.getNodeName())) {
            return new Tome(element);
        } else if ("division".equalsIgnoreCase(element.getNodeName())) {
            return new Division(element);
        } else if ("part".equalsIgnoreCase(element.getNodeName())) {
            return new Part(element);
        } else if ("subchapter".equalsIgnoreCase(element.getNodeName())) {
            return new Subchapter(element);
        } else if ("subdivision".equalsIgnoreCase(element.getNodeName())) {
            return new Subdivision(element);
        } else if ("subsection".equalsIgnoreCase(element.getNodeName())) {
            return new Subsection(element);
        } else if ("transitional".equalsIgnoreCase(element.getNodeName())) {
            return new Transitional(element);
        } else if ("chapter".equalsIgnoreCase(element.getNodeName())) {
            return new Chapter(element);
        } else if ("clause".equalsIgnoreCase(element.getNodeName())) {
            return new Clause(element);
        } else if ("paragraph".equalsIgnoreCase(element.getNodeName())) {
            return new Paragraph(element);
        } else if ("subclause".equalsIgnoreCase(element.getNodeName())) {
            return new Subclause(element);
        } else if ("sublist".equalsIgnoreCase(element.getNodeName())) {
            return new Sublist(element);
        } else if ("subparagraph".equalsIgnoreCase(element.getNodeName())) {
            return new Subparagraph(element);
        } else if ("title".equalsIgnoreCase(element.getNodeName())) {
            return new Title(element);
        } else if ("point".equalsIgnoreCase(element.getNodeName())) {
            return new Point(element);
        } else if ("article".equalsIgnoreCase(element.getNodeName())) {
            return new Article(element);
        } else if ("hcontainer".equalsIgnoreCase(element.getNodeName())) {
            return new Hcontainer(element);
        } else if ("alinea".equalsIgnoreCase(element.getNodeName())) {
            return new Alinea(element);
        } else if ("indent".equalsIgnoreCase(element.getNodeName())) {
            return new Indent(element);
        } else if ("list".equalsIgnoreCase(element.getNodeName())) {
            return new List(element);
        } else if ("section".equalsIgnoreCase(element.getNodeName())) {
            return new Section(element);
        } else if ("subpart".equalsIgnoreCase(element.getNodeName())) {
            return new Subpart(element);
        } else if ("subtitle".equalsIgnoreCase(element.getNodeName())) {
            return new Subtitle(element);
        } else if ("book".equalsIgnoreCase(element.getNodeName())) {
            return new Book(element);
        } else if ("citation".equalsIgnoreCase(element.getNodeName())) {
            return new Citation(element);
        } else if ("item".equalsIgnoreCase(element.getNodeName())) {
            return new Item(element);
        } else if ("tblock".equalsIgnoreCase(element.getNodeName())) {
            return new Tblock(element);
        } else if ("recital".equalsIgnoreCase(element.getNodeName())) {
            return new Recital(element);
        } else if ("administrationOfOath".equalsIgnoreCase(element.getNodeName())) {
            return new AdministrationOfOath(element);
        } else if ("papers".equalsIgnoreCase(element.getNodeName())) {
            return new Papers(element);
        } else if ("proceduralMotions".equalsIgnoreCase(element.getNodeName())) {
            return new ProceduralMotions(element);
        } else if ("nationalInterest".equalsIgnoreCase(element.getNodeName())) {
            return new NationalInterest(element);
        } else if ("noticesOfMotion".equalsIgnoreCase(element.getNodeName())) {
            return new NoticesOfMotion(element);
        } else if ("adjournment".equalsIgnoreCase(element.getNodeName())) {
            return new Adjournment(element);
        } else if ("communication".equalsIgnoreCase(element.getNodeName())) {
            return new Communication(element);
        } else if ("oralStatements".equalsIgnoreCase(element.getNodeName())) {
            return new OralStatements(element);
        } else if ("questions".equalsIgnoreCase(element.getNodeName())) {
            return new Questions(element);
        } else if ("debateSection".equalsIgnoreCase(element.getNodeName())) {
            return new DebateSection(element);
        } else if ("personalStatements".equalsIgnoreCase(element.getNodeName())) {
            return new PersonalStatements(element);
        } else if ("pointOfOrder".equalsIgnoreCase(element.getNodeName())) {
            return new PointOfOrder(element);
        } else if ("declarationOfVote".equalsIgnoreCase(element.getNodeName())) {
            return new DeclarationOfVote(element);
        } else if ("petitions".equalsIgnoreCase(element.getNodeName())) {
            return new Petitions(element);
        } else if ("resolutions".equalsIgnoreCase(element.getNodeName())) {
            return new Resolutions(element);
        } else if ("rollCall".equalsIgnoreCase(element.getNodeName())) {
            return new RollCall(element);
        } else if ("address".equalsIgnoreCase(element.getNodeName())) {
            return new Address(element);
        } else if ("writtenStatements".equalsIgnoreCase(element.getNodeName())) {
            return new WrittenStatements(element);
        } else if ("prayers".equalsIgnoreCase(element.getNodeName())) {
            return new Prayers(element);
        } else if ("ministerialStatements".equalsIgnoreCase(element.getNodeName())) {
            return new MinisterialStatements(element);
        } else if ("domain".equalsIgnoreCase(element.getNodeName())) {
            return new Domain(element);
        } else if ("new".equalsIgnoreCase(element.getNodeName())) {
            return new New(element);
        } else if ("condition".equalsIgnoreCase(element.getNodeName())) {
            return new Condition(element);
        } else if ("otherAnalysis".equalsIgnoreCase(element.getNodeName())) {
            return new OtherAnalysis(element);
        } else if ("foreign".equalsIgnoreCase(element.getNodeName())) {
            return new Foreign(element);
        } else if ("result".equalsIgnoreCase(element.getNodeName())) {
            return new Result(element);
        } else if ("eventRef".equalsIgnoreCase(element.getNodeName())) {
            return new EventRef(element);
        } else if ("proprietary".equalsIgnoreCase(element.getNodeName())) {
            return new Proprietary(element);
        } else if ("old".equalsIgnoreCase(element.getNodeName())) {
            return new Old(element);
        } else if ("presentation".equalsIgnoreCase(element.getNodeName())) {
            return new Presentation(element);
        } else if ("step".equalsIgnoreCase(element.getNodeName())) {
            return new Step(element);
        } else if ("preservation".equalsIgnoreCase(element.getNodeName())) {
            return new Preservation(element);
        } else if ("debateBody".equalsIgnoreCase(element.getNodeName())) {
            return new DebateBody(element);
        } else if ("party".equalsIgnoreCase(element.getNodeName())) {
            return new Party(element);
        } else if ("event".equalsIgnoreCase(element.getNodeName())) {
            return new Event(element);
        } else if ("role".equalsIgnoreCase(element.getNodeName())) {
            return new Role(element);
        } else if ("quantity".equalsIgnoreCase(element.getNodeName())) {
            return new Quantity(element);
        } else if ("entity".equalsIgnoreCase(element.getNodeName())) {
            return new Entity(element);
        } else if ("organization".equalsIgnoreCase(element.getNodeName())) {
            return new Organization(element);
        } else if ("person".equalsIgnoreCase(element.getNodeName())) {
            return new Person(element);
        } else if ("judge".equalsIgnoreCase(element.getNodeName())) {
            return new Judge(element);
        } else if ("process".equalsIgnoreCase(element.getNodeName())) {
            return new Process(element);
        } else if ("location".equalsIgnoreCase(element.getNodeName())) {
            return new Location(element);
        } else if ("lawyer".equalsIgnoreCase(element.getNodeName())) {
            return new Lawyer(element);
        } else if ("concept".equalsIgnoreCase(element.getNodeName())) {
            return new Concept(element);
        } else if ("object".equalsIgnoreCase(element.getNodeName())) {
            return new Object(element);
        } else if ("term".equalsIgnoreCase(element.getNodeName())) {
            return new Term(element);
        } else if ("note".equalsIgnoreCase(element.getNodeName())) {
            return new Note(element);
        } else if ("div".equalsIgnoreCase(element.getNodeName())) {
            return new Div(element);
        } else if ("interstitial".equalsIgnoreCase(element.getNodeName())) {
            return new Interstitial(element);
        } else if ("fragment".equalsIgnoreCase(element.getNodeName())) {
            return new Fragment(element);
        } else if ("quotedStructure".equalsIgnoreCase(element.getNodeName())) {
            return new QuotedStructure(element);
        } else if ("extractStructure".equalsIgnoreCase(element.getNodeName())) {
            return new ExtractStructure(element);
        } else if ("popup".equalsIgnoreCase(element.getNodeName())) {
            return new Popup(element);
        } else if ("authorialNote".equalsIgnoreCase(element.getNodeName())) {
            return new AuthorialNote(element);
        } else if ("source".equalsIgnoreCase(element.getNodeName())) {
            return new Source(element);
        } else if ("destination".equalsIgnoreCase(element.getNodeName())) {
            return new Destination(element);
        } else if ("doc".equalsIgnoreCase(element.getNodeName())) {
            return new Doc(element);
        } else if ("debateReport".equalsIgnoreCase(element.getNodeName())) {
            return new DebateReport(element);
        } else if ("marker".equalsIgnoreCase(element.getNodeName())) {
            return new Marker(element);
        } else if ("amendmentList".equalsIgnoreCase(element.getNodeName())) {
            return new AmendmentList(element);
        } else if ("documentCollection".equalsIgnoreCase(element.getNodeName())) {
            return new DocumentCollection(element);
        } else if ("officialGazette".equalsIgnoreCase(element.getNodeName())) {
            return new OfficialGazette(element);
        } else if ("components".equalsIgnoreCase(element.getNodeName())) {
            return new Components(element);
        } else if ("meta".equalsIgnoreCase(element.getNodeName())) {
            return new Meta(element);
        } else if ("temporalData".equalsIgnoreCase(element.getNodeName())) {
            return new TemporalData(element);
        } else if ("notes".equalsIgnoreCase(element.getNodeName())) {
            return new Notes(element);
        } else if ("tr".equalsIgnoreCase(element.getNodeName())) {
            return new Tr(element);
        } else if ("component".equalsIgnoreCase(element.getNodeName())) {
            return new Component(element);
        } else if ("workflow".equalsIgnoreCase(element.getNodeName())) {
            return new Workflow(element);
        } else if ("toc".equalsIgnoreCase(element.getNodeName())) {
            return new Toc(element);
        } else if ("analysis".equalsIgnoreCase(element.getNodeName())) {
            return new Analysis(element);
        } else if ("citations".equalsIgnoreCase(element.getNodeName())) {
            return new Citations(element);
        } else if ("recitals".equalsIgnoreCase(element.getNodeName())) {
            return new Recitals(element);
        } else if ("lifecycle".equalsIgnoreCase(element.getNodeName())) {
            return new Lifecycle(element);
        } else if ("table".equalsIgnoreCase(element.getNodeName())) {
            return new Table(element);
        } else if ("componentData".equalsIgnoreCase(element.getNodeName())) {
            return new ComponentData(element);
        } else if ("classification".equalsIgnoreCase(element.getNodeName())) {
            return new Classification(element);
        } else if ("blockList".equalsIgnoreCase(element.getNodeName())) {
            return new BlockList(element);
        } else if ("temporalGroup".equalsIgnoreCase(element.getNodeName())) {
            return new TemporalGroup(element);
        } else if ("li".equalsIgnoreCase(element.getNodeName())) {
            return new Li(element);
        } else if ("componentInfo".equalsIgnoreCase(element.getNodeName())) {
            return new ComponentInfo(element);
        } else if ("attachments".equalsIgnoreCase(element.getNodeName())) {
            return new Attachments(element);
        } else if ("identification".equalsIgnoreCase(element.getNodeName())) {
            return new Identification(element);
        }
        LOG.warning("Could not find overlay element (nodename: " + element.getNodeName() + ", tagname: " + element.getTagName() + ")");
        // nothing found
        return null;
    }
}