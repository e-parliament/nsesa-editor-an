package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen;

import com.google.gwt.dom.client.Element;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Object;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Process;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;

import java.util.logging.Logger;
/**
* Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayFactory.ftl</tt>.
*/
public class Akomantoso20OverlayFactory extends DefaultOverlayFactory  {

    private final static Logger LOG = Logger.getLogger(Akomantoso20OverlayFactory.class.getName());
    // the namespace of the overlay factory
    private final String namespace = "http://www.akomantoso.org/2.0";

    @Inject
    public Akomantoso20OverlayFactory(final OverlayStrategy overlayStrategy, final ClientFactory clientFactory) {
        super(overlayStrategy, clientFactory);
    }
    @Override
    public String getNamespace() {
        return namespace;
    }
    @Override
    public AmendableWidget toAmendableWidget(final Element element) {
        final String nodeName = overlayStrategy.getType(element);
        final String namespaceURI = overlayStrategy.getNamespaceURI(element);

        if ("".equals(nodeName)) {
            throw new IllegalArgumentException("Empty element or null passed.");
        }
        else if ("container".equalsIgnoreCase(nodeName)) {
            return new Container(element);
        }
        else if ("judgement".equalsIgnoreCase(nodeName)) {
            return new Judgement(element);
        }
        else if ("ul".equalsIgnoreCase(nodeName)) {
            return new Ul(element);
        }
        else if ("ol".equalsIgnoreCase(nodeName)) {
            return new Ol(element);
        }
        else if ("parliamentary".equalsIgnoreCase(nodeName)) {
            return new Parliamentary(element);
        }
        else if ("akomaNtoso".equalsIgnoreCase(nodeName)) {
            return new AkomaNtoso(element);
        }
        else if ("amendment".equalsIgnoreCase(nodeName)) {
            return new Amendment(element);
        }
        else if ("quorumVerification".equalsIgnoreCase(nodeName)) {
            return new QuorumVerification(element);
        }
        else if ("voting".equalsIgnoreCase(nodeName)) {
            return new Voting(element);
        }
        else if ("recount".equalsIgnoreCase(nodeName)) {
            return new Recount(element);
        }
        else if ("FRBRalias".equalsIgnoreCase(nodeName)) {
            return new FRBRalias(element);
        }
        else if ("FRBRthis".equalsIgnoreCase(nodeName)) {
            return new FRBRthis(element);
        }
        else if ("FRBRname".equalsIgnoreCase(nodeName)) {
            return new FRBRname(element);
        }
        else if ("FRBRuri".equalsIgnoreCase(nodeName)) {
            return new FRBRuri(element);
        }
        else if ("FRBRsubtype".equalsIgnoreCase(nodeName)) {
            return new FRBRsubtype(element);
        }
        else if ("FRBRcountry".equalsIgnoreCase(nodeName)) {
            return new FRBRcountry(element);
        }
        else if ("FRBRformat".equalsIgnoreCase(nodeName)) {
            return new FRBRformat(element);
        }
        else if ("FRBRnumber".equalsIgnoreCase(nodeName)) {
            return new FRBRnumber(element);
        }
        else if ("FRBRlanguage".equalsIgnoreCase(nodeName)) {
            return new FRBRlanguage(element);
        }
        else if ("timeInterval".equalsIgnoreCase(nodeName)) {
            return new TimeInterval(element);
        }
        else if ("FRBRdate".equalsIgnoreCase(nodeName)) {
            return new FRBRdate(element);
        }
        else if ("FRBRauthor".equalsIgnoreCase(nodeName)) {
            return new FRBRauthor(element);
        }
        else if ("keyword".equalsIgnoreCase(nodeName)) {
            return new Keyword(element);
        }
        else if ("publication".equalsIgnoreCase(nodeName)) {
            return new Publication(element);
        }
        else if ("FRBRtranslation".equalsIgnoreCase(nodeName)) {
            return new FRBRtranslation(element);
        }
        else if ("header".equalsIgnoreCase(nodeName)) {
            return new Header(element);
        }
        else if ("content".equalsIgnoreCase(nodeName)) {
            return new Content(element);
        }
        else if ("intro".equalsIgnoreCase(nodeName)) {
            return new Intro(element);
        }
        else if ("amendmentJustification".equalsIgnoreCase(nodeName)) {
            return new AmendmentJustification(element);
        }
        else if ("td".equalsIgnoreCase(nodeName)) {
            return new Td(element);
        }
        else if ("th".equalsIgnoreCase(nodeName)) {
            return new Th(element);
        }
        else if ("amendmentReference".equalsIgnoreCase(nodeName)) {
            return new AmendmentReference(element);
        }
        else if ("amendmentContent".equalsIgnoreCase(nodeName)) {
            return new AmendmentContent(element);
        }
        else if ("longTitle".equalsIgnoreCase(nodeName)) {
            return new LongTitle(element);
        }
        else if ("wrap".equalsIgnoreCase(nodeName)) {
            return new Wrap(element);
        }
        else if ("amendmentHeading".equalsIgnoreCase(nodeName)) {
            return new AmendmentHeading(element);
        }
        else if ("other".equalsIgnoreCase(nodeName)) {
            return new Other(element);
        }
        else if ("formula".equalsIgnoreCase(nodeName)) {
            return new Formula(element);
        }
        else if ("bill".equalsIgnoreCase(nodeName)) {
            return new Bill(element);
        }
        else if ("act".equalsIgnoreCase(nodeName)) {
            return new Act(element);
        }
        else if ("judgementBody".equalsIgnoreCase(nodeName)) {
            return new JudgementBody(element);
        }
        else if ("rref".equalsIgnoreCase(nodeName)) {
            return new Rref(element);
        }
        else if ("ref".equalsIgnoreCase(nodeName)) {
            return new Ref(element);
        }
        else if ("eol".equalsIgnoreCase(nodeName)) {
            return new Eol(element);
        }
        else if ("eop".equalsIgnoreCase(nodeName)) {
            return new Eop(element);
        }
        else if ("noteRef".equalsIgnoreCase(nodeName)) {
            return new NoteRef(element);
        }
        else if ("br".equalsIgnoreCase(nodeName)) {
            return new Br(element);
        }
        else if ("img".equalsIgnoreCase(nodeName)) {
            return new Img(element);
        }
        else if ("amendmentBody".equalsIgnoreCase(nodeName)) {
            return new AmendmentBody(element);
        }
        else if ("preamble".equalsIgnoreCase(nodeName)) {
            return new Preamble(element);
        }
        else if ("judicial".equalsIgnoreCase(nodeName)) {
            return new Judicial(element);
        }
        else if ("mod".equalsIgnoreCase(nodeName)) {
            return new Mod(element);
        }
        else if ("mmod".equalsIgnoreCase(nodeName)) {
            return new Mmod(element);
        }
        else if ("rmod".equalsIgnoreCase(nodeName)) {
            return new Rmod(element);
        }
        else if ("efficacy".equalsIgnoreCase(nodeName)) {
            return new Efficacy(element);
        }
        else if ("force".equalsIgnoreCase(nodeName)) {
            return new Force(element);
        }
        else if ("application".equalsIgnoreCase(nodeName)) {
            return new Application(element);
        }
        else if ("duration".equalsIgnoreCase(nodeName)) {
            return new Duration(element);
        }
        else if ("references".equalsIgnoreCase(nodeName)) {
            return new References(element);
        }
        else if ("collectionBody".equalsIgnoreCase(nodeName)) {
            return new CollectionBody(element);
        }
        else if ("preface".equalsIgnoreCase(nodeName)) {
            return new Preface(element);
        }
        else if ("quorum".equalsIgnoreCase(nodeName)) {
            return new Quorum(element);
        }
        else if ("count".equalsIgnoreCase(nodeName)) {
            return new Count(element);
        }
        else if ("debate".equalsIgnoreCase(nodeName)) {
            return new Debate(element);
        }
        else if ("textualMod".equalsIgnoreCase(nodeName)) {
            return new TextualMod(element);
        }
        else if ("scopeMod".equalsIgnoreCase(nodeName)) {
            return new ScopeMod(element);
        }
        else if ("legalSystemMod".equalsIgnoreCase(nodeName)) {
            return new LegalSystemMod(element);
        }
        else if ("meaningMod".equalsIgnoreCase(nodeName)) {
            return new MeaningMod(element);
        }
        else if ("efficacyMod".equalsIgnoreCase(nodeName)) {
            return new EfficacyMod(element);
        }
        else if ("forceMod".equalsIgnoreCase(nodeName)) {
            return new ForceMod(element);
        }
        else if ("supports".equalsIgnoreCase(nodeName)) {
            return new Supports(element);
        }
        else if ("contrasts".equalsIgnoreCase(nodeName)) {
            return new Contrasts(element);
        }
        else if ("restricts".equalsIgnoreCase(nodeName)) {
            return new Restricts(element);
        }
        else if ("putsInQuestion".equalsIgnoreCase(nodeName)) {
            return new PutsInQuestion(element);
        }
        else if ("applies".equalsIgnoreCase(nodeName)) {
            return new Applies(element);
        }
        else if ("distinguishes".equalsIgnoreCase(nodeName)) {
            return new Distinguishes(element);
        }
        else if ("isAnalogTo".equalsIgnoreCase(nodeName)) {
            return new IsAnalogTo(element);
        }
        else if ("dissentsFrom".equalsIgnoreCase(nodeName)) {
            return new DissentsFrom(element);
        }
        else if ("overrules".equalsIgnoreCase(nodeName)) {
            return new Overrules(element);
        }
        else if ("derogates".equalsIgnoreCase(nodeName)) {
            return new Derogates(element);
        }
        else if ("extends".equalsIgnoreCase(nodeName)) {
            return new Extends(element);
        }
        else if ("coverPage".equalsIgnoreCase(nodeName)) {
            return new CoverPage(element);
        }
        else if ("conclusions".equalsIgnoreCase(nodeName)) {
            return new Conclusions(element);
        }
        else if ("componentRef".equalsIgnoreCase(nodeName)) {
            return new ComponentRef(element);
        }
        else if ("body".equalsIgnoreCase(nodeName)) {
            return new Body(element);
        }
        else if ("FRBRExpression".equalsIgnoreCase(nodeName)) {
            return new FRBRExpression(element);
        }
        else if ("FRBRItem".equalsIgnoreCase(nodeName)) {
            return new FRBRItem(element);
        }
        else if ("FRBRManifestation".equalsIgnoreCase(nodeName)) {
            return new FRBRManifestation(element);
        }
        else if ("FRBRWork".equalsIgnoreCase(nodeName)) {
            return new FRBRWork(element);
        }
        else if ("activeModifications".equalsIgnoreCase(nodeName)) {
            return new ActiveModifications(element);
        }
        else if ("passiveModifications".equalsIgnoreCase(nodeName)) {
            return new PassiveModifications(element);
        }
        else if ("TLCEvent".equalsIgnoreCase(nodeName)) {
            return new TLCEvent(element);
        }
        else if ("TLCLocation".equalsIgnoreCase(nodeName)) {
            return new TLCLocation(element);
        }
        else if ("passiveRef".equalsIgnoreCase(nodeName)) {
            return new PassiveRef(element);
        }
        else if ("activeRef".equalsIgnoreCase(nodeName)) {
            return new ActiveRef(element);
        }
        else if ("original".equalsIgnoreCase(nodeName)) {
            return new Original(element);
        }
        else if ("TLCConcept".equalsIgnoreCase(nodeName)) {
            return new TLCConcept(element);
        }
        else if ("jurisprudence".equalsIgnoreCase(nodeName)) {
            return new Jurisprudence(element);
        }
        else if ("attachmentOf".equalsIgnoreCase(nodeName)) {
            return new AttachmentOf(element);
        }
        else if ("TLCObject".equalsIgnoreCase(nodeName)) {
            return new TLCObject(element);
        }
        else if ("TLCPerson".equalsIgnoreCase(nodeName)) {
            return new TLCPerson(element);
        }
        else if ("TLCReference".equalsIgnoreCase(nodeName)) {
            return new TLCReference(element);
        }
        else if ("TLCRole".equalsIgnoreCase(nodeName)) {
            return new TLCRole(element);
        }
        else if ("TLCProcess".equalsIgnoreCase(nodeName)) {
            return new TLCProcess(element);
        }
        else if ("hasAttachment".equalsIgnoreCase(nodeName)) {
            return new HasAttachment(element);
        }
        else if ("TLCOrganization".equalsIgnoreCase(nodeName)) {
            return new TLCOrganization(element);
        }
        else if ("TLCTerm".equalsIgnoreCase(nodeName)) {
            return new TLCTerm(element);
        }
        else if ("fragmentBody".equalsIgnoreCase(nodeName)) {
            return new FragmentBody(element);
        }
        else if ("summary".equalsIgnoreCase(nodeName)) {
            return new Summary(element);
        }
        else if ("fillIn".equalsIgnoreCase(nodeName)) {
            return new FillIn(element);
        }
        else if ("signature".equalsIgnoreCase(nodeName)) {
            return new Signature(element);
        }
        else if ("vote".equalsIgnoreCase(nodeName)) {
            return new Vote(element);
        }
        else if ("listIntroduction".equalsIgnoreCase(nodeName)) {
            return new ListIntroduction(element);
        }
        else if ("docPurpose".equalsIgnoreCase(nodeName)) {
            return new DocPurpose(element);
        }
        else if ("date".equalsIgnoreCase(nodeName)) {
            return new Date(element);
        }
        else if ("quotedText".equalsIgnoreCase(nodeName)) {
            return new QuotedText(element);
        }
        else if ("inline".equalsIgnoreCase(nodeName)) {
            return new Inline(element);
        }
        else if ("relatedDocument".equalsIgnoreCase(nodeName)) {
            return new RelatedDocument(element);
        }
        else if ("docIntroducer".equalsIgnoreCase(nodeName)) {
            return new DocIntroducer(element);
        }
        else if ("b".equalsIgnoreCase(nodeName)) {
            return new B(element);
        }
        else if ("a".equalsIgnoreCase(nodeName)) {
            return new A(element);
        }
        else if ("i".equalsIgnoreCase(nodeName)) {
            return new I(element);
        }
        else if ("num".equalsIgnoreCase(nodeName)) {
            return new Num(element);
        }
        else if ("u".equalsIgnoreCase(nodeName)) {
            return new U(element);
        }
        else if ("p".equalsIgnoreCase(nodeName)) {
            return new P(element);
        }
        else if ("docType".equalsIgnoreCase(nodeName)) {
            return new DocType(element);
        }
        else if ("change".equalsIgnoreCase(nodeName)) {
            return new Change(element);
        }
        else if ("opinion".equalsIgnoreCase(nodeName)) {
            return new Opinion(element);
        }
        else if ("docStage".equalsIgnoreCase(nodeName)) {
            return new DocStage(element);
        }
        else if ("docCommittee".equalsIgnoreCase(nodeName)) {
            return new DocCommittee(element);
        }
        else if ("docNumber".equalsIgnoreCase(nodeName)) {
            return new DocNumber(element);
        }
        else if ("extractText".equalsIgnoreCase(nodeName)) {
            return new ExtractText(element);
        }
        else if ("span".equalsIgnoreCase(nodeName)) {
            return new Span(element);
        }
        else if ("sub".equalsIgnoreCase(nodeName)) {
            return new Sub(element);
        }
        else if ("sup".equalsIgnoreCase(nodeName)) {
            return new Sup(element);
        }
        else if ("docketNumber".equalsIgnoreCase(nodeName)) {
            return new DocketNumber(element);
        }
        else if ("mref".equalsIgnoreCase(nodeName)) {
            return new Mref(element);
        }
        else if ("neutralCitation".equalsIgnoreCase(nodeName)) {
            return new NeutralCitation(element);
        }
        else if ("docStatus".equalsIgnoreCase(nodeName)) {
            return new DocStatus(element);
        }
        else if ("legislature".equalsIgnoreCase(nodeName)) {
            return new Legislature(element);
        }
        else if ("tocItem".equalsIgnoreCase(nodeName)) {
            return new TocItem(element);
        }
        else if ("session".equalsIgnoreCase(nodeName)) {
            return new Session(element);
        }
        else if ("recordedTime".equalsIgnoreCase(nodeName)) {
            return new RecordedTime(element);
        }
        else if ("scene".equalsIgnoreCase(nodeName)) {
            return new Scene(element);
        }
        else if ("heading".equalsIgnoreCase(nodeName)) {
            return new Heading(element);
        }
        else if ("block".equalsIgnoreCase(nodeName)) {
            return new Block(element);
        }
        else if ("docJurisdiction".equalsIgnoreCase(nodeName)) {
            return new DocJurisdiction(element);
        }
        else if ("docProponent".equalsIgnoreCase(nodeName)) {
            return new DocProponent(element);
        }
        else if ("omissis".equalsIgnoreCase(nodeName)) {
            return new Omissis(element);
        }
        else if ("def".equalsIgnoreCase(nodeName)) {
            return new Def(element);
        }
        else if ("docTitle".equalsIgnoreCase(nodeName)) {
            return new DocTitle(element);
        }
        else if ("del".equalsIgnoreCase(nodeName)) {
            return new Del(element);
        }
        else if ("affectedDocument".equalsIgnoreCase(nodeName)) {
            return new AffectedDocument(element);
        }
        else if ("placeholder".equalsIgnoreCase(nodeName)) {
            return new Placeholder(element);
        }
        else if ("caption".equalsIgnoreCase(nodeName)) {
            return new Caption(element);
        }
        else if ("outcome".equalsIgnoreCase(nodeName)) {
            return new Outcome(element);
        }
        else if ("shortTitle".equalsIgnoreCase(nodeName)) {
            return new ShortTitle(element);
        }
        else if ("remark".equalsIgnoreCase(nodeName)) {
            return new Remark(element);
        }
        else if ("narrative".equalsIgnoreCase(nodeName)) {
            return new Narrative(element);
        }
        else if ("listConclusion".equalsIgnoreCase(nodeName)) {
            return new ListConclusion(element);
        }
        else if ("ins".equalsIgnoreCase(nodeName)) {
            return new Ins(element);
        }
        else if ("subheading".equalsIgnoreCase(nodeName)) {
            return new Subheading(element);
        }
        else if ("courtType".equalsIgnoreCase(nodeName)) {
            return new CourtType(element);
        }
        else if ("from".equalsIgnoreCase(nodeName)) {
            return new From(element);
        }
        else if ("docDate".equalsIgnoreCase(nodeName)) {
            return new DocDate(element);
        }
        else if ("introduction".equalsIgnoreCase(nodeName)) {
            return new Introduction(element);
        }
        else if ("background".equalsIgnoreCase(nodeName)) {
            return new Background(element);
        }
        else if ("mainBody".equalsIgnoreCase(nodeName)) {
            return new MainBody(element);
        }
        else if ("motivation".equalsIgnoreCase(nodeName)) {
            return new Motivation(element);
        }
        else if ("decision".equalsIgnoreCase(nodeName)) {
            return new Decision(element);
        }
        else if ("answer".equalsIgnoreCase(nodeName)) {
            return new Answer(element);
        }
        else if ("speech".equalsIgnoreCase(nodeName)) {
            return new Speech(element);
        }
        else if ("question".equalsIgnoreCase(nodeName)) {
            return new Question(element);
        }
        else if ("tome".equalsIgnoreCase(nodeName)) {
            return new Tome(element);
        }
        else if ("division".equalsIgnoreCase(nodeName)) {
            return new Division(element);
        }
        else if ("part".equalsIgnoreCase(nodeName)) {
            return new Part(element);
        }
        else if ("subchapter".equalsIgnoreCase(nodeName)) {
            return new Subchapter(element);
        }
        else if ("subdivision".equalsIgnoreCase(nodeName)) {
            return new Subdivision(element);
        }
        else if ("subsection".equalsIgnoreCase(nodeName)) {
            return new Subsection(element);
        }
        else if ("transitional".equalsIgnoreCase(nodeName)) {
            return new Transitional(element);
        }
        else if ("chapter".equalsIgnoreCase(nodeName)) {
            return new Chapter(element);
        }
        else if ("clause".equalsIgnoreCase(nodeName)) {
            return new Clause(element);
        }
        else if ("paragraph".equalsIgnoreCase(nodeName)) {
            return new Paragraph(element);
        }
        else if ("subclause".equalsIgnoreCase(nodeName)) {
            return new Subclause(element);
        }
        else if ("sublist".equalsIgnoreCase(nodeName)) {
            return new Sublist(element);
        }
        else if ("subparagraph".equalsIgnoreCase(nodeName)) {
            return new Subparagraph(element);
        }
        else if ("title".equalsIgnoreCase(nodeName)) {
            return new Title(element);
        }
        else if ("point".equalsIgnoreCase(nodeName)) {
            return new Point(element);
        }
        else if ("article".equalsIgnoreCase(nodeName)) {
            return new Article(element);
        }
        else if ("hcontainer".equalsIgnoreCase(nodeName)) {
            return new Hcontainer(element);
        }
        else if ("alinea".equalsIgnoreCase(nodeName)) {
            return new Alinea(element);
        }
        else if ("indent".equalsIgnoreCase(nodeName)) {
            return new Indent(element);
        }
        else if ("list".equalsIgnoreCase(nodeName)) {
            return new List(element);
        }
        else if ("section".equalsIgnoreCase(nodeName)) {
            return new Section(element);
        }
        else if ("subpart".equalsIgnoreCase(nodeName)) {
            return new Subpart(element);
        }
        else if ("subtitle".equalsIgnoreCase(nodeName)) {
            return new Subtitle(element);
        }
        else if ("book".equalsIgnoreCase(nodeName)) {
            return new Book(element);
        }
        else if ("citation".equalsIgnoreCase(nodeName)) {
            return new Citation(element);
        }
        else if ("item".equalsIgnoreCase(nodeName)) {
            return new Item(element);
        }
        else if ("tblock".equalsIgnoreCase(nodeName)) {
            return new Tblock(element);
        }
        else if ("recital".equalsIgnoreCase(nodeName)) {
            return new Recital(element);
        }
        else if ("administrationOfOath".equalsIgnoreCase(nodeName)) {
            return new AdministrationOfOath(element);
        }
        else if ("papers".equalsIgnoreCase(nodeName)) {
            return new Papers(element);
        }
        else if ("proceduralMotions".equalsIgnoreCase(nodeName)) {
            return new ProceduralMotions(element);
        }
        else if ("nationalInterest".equalsIgnoreCase(nodeName)) {
            return new NationalInterest(element);
        }
        else if ("noticesOfMotion".equalsIgnoreCase(nodeName)) {
            return new NoticesOfMotion(element);
        }
        else if ("adjournment".equalsIgnoreCase(nodeName)) {
            return new Adjournment(element);
        }
        else if ("communication".equalsIgnoreCase(nodeName)) {
            return new Communication(element);
        }
        else if ("oralStatements".equalsIgnoreCase(nodeName)) {
            return new OralStatements(element);
        }
        else if ("questions".equalsIgnoreCase(nodeName)) {
            return new Questions(element);
        }
        else if ("debateSection".equalsIgnoreCase(nodeName)) {
            return new DebateSection(element);
        }
        else if ("personalStatements".equalsIgnoreCase(nodeName)) {
            return new PersonalStatements(element);
        }
        else if ("pointOfOrder".equalsIgnoreCase(nodeName)) {
            return new PointOfOrder(element);
        }
        else if ("declarationOfVote".equalsIgnoreCase(nodeName)) {
            return new DeclarationOfVote(element);
        }
        else if ("petitions".equalsIgnoreCase(nodeName)) {
            return new Petitions(element);
        }
        else if ("resolutions".equalsIgnoreCase(nodeName)) {
            return new Resolutions(element);
        }
        else if ("rollCall".equalsIgnoreCase(nodeName)) {
            return new RollCall(element);
        }
        else if ("address".equalsIgnoreCase(nodeName)) {
            return new Address(element);
        }
        else if ("writtenStatements".equalsIgnoreCase(nodeName)) {
            return new WrittenStatements(element);
        }
        else if ("prayers".equalsIgnoreCase(nodeName)) {
            return new Prayers(element);
        }
        else if ("ministerialStatements".equalsIgnoreCase(nodeName)) {
            return new MinisterialStatements(element);
        }
        else if ("domain".equalsIgnoreCase(nodeName)) {
            return new Domain(element);
        }
        else if ("new".equalsIgnoreCase(nodeName)) {
            return new New(element);
        }
        else if ("condition".equalsIgnoreCase(nodeName)) {
            return new Condition(element);
        }
        else if ("otherAnalysis".equalsIgnoreCase(nodeName)) {
            return new OtherAnalysis(element);
        }
        else if ("foreign".equalsIgnoreCase(nodeName)) {
            return new Foreign(element);
        }
        else if ("result".equalsIgnoreCase(nodeName)) {
            return new Result(element);
        }
        else if ("eventRef".equalsIgnoreCase(nodeName)) {
            return new EventRef(element);
        }
        else if ("proprietary".equalsIgnoreCase(nodeName)) {
            return new Proprietary(element);
        }
        else if ("old".equalsIgnoreCase(nodeName)) {
            return new Old(element);
        }
        else if ("presentation".equalsIgnoreCase(nodeName)) {
            return new Presentation(element);
        }
        else if ("step".equalsIgnoreCase(nodeName)) {
            return new Step(element);
        }
        else if ("preservation".equalsIgnoreCase(nodeName)) {
            return new Preservation(element);
        }
        else if ("debateBody".equalsIgnoreCase(nodeName)) {
            return new DebateBody(element);
        }
        else if ("party".equalsIgnoreCase(nodeName)) {
            return new Party(element);
        }
        else if ("event".equalsIgnoreCase(nodeName)) {
            return new Event(element);
        }
        else if ("role".equalsIgnoreCase(nodeName)) {
            return new Role(element);
        }
        else if ("quantity".equalsIgnoreCase(nodeName)) {
            return new Quantity(element);
        }
        else if ("entity".equalsIgnoreCase(nodeName)) {
            return new Entity(element);
        }
        else if ("organization".equalsIgnoreCase(nodeName)) {
            return new Organization(element);
        }
        else if ("person".equalsIgnoreCase(nodeName)) {
            return new Person(element);
        }
        else if ("judge".equalsIgnoreCase(nodeName)) {
            return new Judge(element);
        }
        else if ("process".equalsIgnoreCase(nodeName)) {
            return new Process(element);
        }
        else if ("location".equalsIgnoreCase(nodeName)) {
            return new Location(element);
        }
        else if ("lawyer".equalsIgnoreCase(nodeName)) {
            return new Lawyer(element);
        }
        else if ("concept".equalsIgnoreCase(nodeName)) {
            return new Concept(element);
        }
        else if ("object".equalsIgnoreCase(nodeName)) {
            return new Object(element);
        }
        else if ("term".equalsIgnoreCase(nodeName)) {
            return new Term(element);
        }
        else if ("note".equalsIgnoreCase(nodeName)) {
            return new Note(element);
        }
        else if ("div".equalsIgnoreCase(nodeName)) {
            return new Div(element);
        }
        else if ("interstitial".equalsIgnoreCase(nodeName)) {
            return new Interstitial(element);
        }
        else if ("fragment".equalsIgnoreCase(nodeName)) {
            return new Fragment(element);
        }
        else if ("quotedStructure".equalsIgnoreCase(nodeName)) {
            return new QuotedStructure(element);
        }
        else if ("extractStructure".equalsIgnoreCase(nodeName)) {
            return new ExtractStructure(element);
        }
        else if ("popup".equalsIgnoreCase(nodeName)) {
            return new Popup(element);
        }
        else if ("authorialNote".equalsIgnoreCase(nodeName)) {
            return new AuthorialNote(element);
        }
        else if ("source".equalsIgnoreCase(nodeName)) {
            return new Source(element);
        }
        else if ("destination".equalsIgnoreCase(nodeName)) {
            return new Destination(element);
        }
        else if ("doc".equalsIgnoreCase(nodeName)) {
            return new Doc(element);
        }
        else if ("debateReport".equalsIgnoreCase(nodeName)) {
            return new DebateReport(element);
        }
        else if ("marker".equalsIgnoreCase(nodeName)) {
            return new Marker(element);
        }
        else if ("amendmentList".equalsIgnoreCase(nodeName)) {
            return new AmendmentList(element);
        }
        else if ("documentCollection".equalsIgnoreCase(nodeName)) {
            return new DocumentCollection(element);
        }
        else if ("officialGazette".equalsIgnoreCase(nodeName)) {
            return new OfficialGazette(element);
        }
        else if ("components".equalsIgnoreCase(nodeName)) {
            return new Components(element);
        }
        else if ("meta".equalsIgnoreCase(nodeName)) {
            return new Meta(element);
        }
        else if ("temporalData".equalsIgnoreCase(nodeName)) {
            return new TemporalData(element);
        }
        else if ("notes".equalsIgnoreCase(nodeName)) {
            return new Notes(element);
        }
        else if ("tr".equalsIgnoreCase(nodeName)) {
            return new Tr(element);
        }
        else if ("component".equalsIgnoreCase(nodeName)) {
            return new Component(element);
        }
        else if ("workflow".equalsIgnoreCase(nodeName)) {
            return new Workflow(element);
        }
        else if ("toc".equalsIgnoreCase(nodeName)) {
            return new Toc(element);
        }
        else if ("analysis".equalsIgnoreCase(nodeName)) {
            return new Analysis(element);
        }
        else if ("citations".equalsIgnoreCase(nodeName)) {
            return new Citations(element);
        }
        else if ("recitals".equalsIgnoreCase(nodeName)) {
            return new Recitals(element);
        }
        else if ("lifecycle".equalsIgnoreCase(nodeName)) {
            return new Lifecycle(element);
        }
        else if ("table".equalsIgnoreCase(nodeName)) {
            return new Table(element);
        }
        else if ("componentData".equalsIgnoreCase(nodeName)) {
            return new ComponentData(element);
        }
        else if ("classification".equalsIgnoreCase(nodeName)) {
            return new Classification(element);
        }
        else if ("blockList".equalsIgnoreCase(nodeName)) {
            return new BlockList(element);
        }
        else if ("temporalGroup".equalsIgnoreCase(nodeName)) {
            return new TemporalGroup(element);
        }
        else if ("li".equalsIgnoreCase(nodeName)) {
            return new Li(element);
        }
        else if ("componentInfo".equalsIgnoreCase(nodeName)) {
            return new ComponentInfo(element);
        }
        else if ("attachments".equalsIgnoreCase(nodeName)) {
            return new Attachments(element);
        }
        else if ("identification".equalsIgnoreCase(nodeName)) {
            return new Identification(element);
        }
        // nothing found
        LOG.warning("Could not find overlay element (nodename: " + nodeName + " in namespace URI '" + namespaceURI + "')");
        return null;
    }
}