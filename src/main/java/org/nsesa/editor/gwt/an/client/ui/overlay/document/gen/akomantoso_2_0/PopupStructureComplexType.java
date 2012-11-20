package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class PopupStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public PopupStructureComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType refersToAttr;
    private LanguageSimpleType langAttr;
    private StatusTypeSimpleType statusAttr;
    private AmendableWidgetImpl wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType alternativeToAttr;
    private AnyURISimpleType periodAttr;
    public java.util.List<Intro> getIntros() {
        java.util.List<Intro> result = new ArrayList<Intro>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Intro".equalsIgnoreCase(widget.getType())) {
                result.add((Intro)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Wrap> getWraps() {
        java.util.List<Wrap> result = new ArrayList<Wrap>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Wrap".equalsIgnoreCase(widget.getType())) {
                result.add((Wrap)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Heading> getHeadings() {
        java.util.List<Heading> result = new ArrayList<Heading>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Heading".equalsIgnoreCase(widget.getType())) {
                result.add((Heading)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subheading> getSubheadings() {
        java.util.List<Subheading> result = new ArrayList<Subheading>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subheading".equalsIgnoreCase(widget.getType())) {
                result.add((Subheading)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Content> getContent_s() {
        java.util.List<Content> result = new ArrayList<Content>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Content".equalsIgnoreCase(widget.getType())) {
                result.add((Content)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Num> getNums() {
        java.util.List<Num> result = new ArrayList<Num>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Num".equalsIgnoreCase(widget.getType())) {
                result.add((Num)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Recital> getRecitals() {
        java.util.List<Recital> result = new ArrayList<Recital>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Recital".equalsIgnoreCase(widget.getType())) {
                result.add((Recital)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Citation> getCitations() {
        java.util.List<Citation> result = new ArrayList<Citation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Citation".equalsIgnoreCase(widget.getType())) {
                result.add((Citation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType())) {
                result.add((ComponentRef)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Hcontainer> getHcontainers() {
        java.util.List<Hcontainer> result = new ArrayList<Hcontainer>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Hcontainer".equalsIgnoreCase(widget.getType())) {
                result.add((Hcontainer)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Foreign> getForeigns() {
        java.util.List<Foreign> result = new ArrayList<Foreign>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Foreign".equalsIgnoreCase(widget.getType())) {
                result.add((Foreign)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Block> getBlocks() {
        java.util.List<Block> result = new ArrayList<Block>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Block".equalsIgnoreCase(widget.getType())) {
                result.add((Block)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Container> getContainers() {
        java.util.List<Container> result = new ArrayList<Container>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType())) {
                result.add((Container)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Speech> getSpeechs() {
        java.util.List<Speech> result = new ArrayList<Speech>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Speech".equalsIgnoreCase(widget.getType())) {
                result.add((Speech)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Question> getQuestions() {
        java.util.List<Question> result = new ArrayList<Question>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Question".equalsIgnoreCase(widget.getType())) {
                result.add((Question)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Answer> getAnswers() {
        java.util.List<Answer> result = new ArrayList<Answer>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Answer".equalsIgnoreCase(widget.getType())) {
                result.add((Answer)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Other> getOthers() {
        java.util.List<Other> result = new ArrayList<Other>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Other".equalsIgnoreCase(widget.getType())) {
                result.add((Other)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Scene> getScenes() {
        java.util.List<Scene> result = new ArrayList<Scene>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Scene".equalsIgnoreCase(widget.getType())) {
                result.add((Scene)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Narrative> getNarratives() {
        java.util.List<Narrative> result = new ArrayList<Narrative>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Narrative".equalsIgnoreCase(widget.getType())) {
                result.add((Narrative)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Summary> getSummaries() {
        java.util.List<Summary> result = new ArrayList<Summary>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Summary".equalsIgnoreCase(widget.getType())) {
                result.add((Summary)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public AnyURISimpleType getRefersToAttr() {
        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public LanguageSimpleType getLangAttr() {
        return langAttr;
    }
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
    public StatusTypeSimpleType getStatusAttr() {
        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    public AmendableWidgetImpl getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public IDSimpleType getIdAttr() {
        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public StringSimpleType getClassAttr() {
        return classAttr;
    }
    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
    public StringSimpleType getStyleAttr() {
        return styleAttr;
    }
    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
    public StringSimpleType getTitleAttr() {
        return titleAttr;
    }
    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
    public AnyURISimpleType getAlternativeToAttr() {
        return alternativeToAttr;
    }
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
    public java.util.List<Clause> getClauses() {
        java.util.List<Clause> result = new ArrayList<Clause>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Clause".equalsIgnoreCase(widget.getType())) {
                result.add((Clause)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Section> getSections() {
        java.util.List<Section> result = new ArrayList<Section>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Section".equalsIgnoreCase(widget.getType())) {
                result.add((Section)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Part> getParts() {
        java.util.List<Part> result = new ArrayList<Part>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Part".equalsIgnoreCase(widget.getType())) {
                result.add((Part)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Paragraph> getParagraphs() {
        java.util.List<Paragraph> result = new ArrayList<Paragraph>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Paragraph".equalsIgnoreCase(widget.getType())) {
                result.add((Paragraph)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Chapter> getChapters() {
        java.util.List<Chapter> result = new ArrayList<Chapter>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Chapter".equalsIgnoreCase(widget.getType())) {
                result.add((Chapter)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Title> getTitle_s() {
        java.util.List<Title> result = new ArrayList<Title>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Title".equalsIgnoreCase(widget.getType())) {
                result.add((Title)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Article> getArticles() {
        java.util.List<Article> result = new ArrayList<Article>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Article".equalsIgnoreCase(widget.getType())) {
                result.add((Article)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Book> getBooks() {
        java.util.List<Book> result = new ArrayList<Book>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Book".equalsIgnoreCase(widget.getType())) {
                result.add((Book)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Tome> getTomes() {
        java.util.List<Tome> result = new ArrayList<Tome>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tome".equalsIgnoreCase(widget.getType())) {
                result.add((Tome)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Division> getDivisions() {
        java.util.List<Division> result = new ArrayList<Division>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Division".equalsIgnoreCase(widget.getType())) {
                result.add((Division)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<List> getLists() {
        java.util.List<List> result = new ArrayList<List>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("List".equalsIgnoreCase(widget.getType())) {
                result.add((List)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Point> getPoints() {
        java.util.List<Point> result = new ArrayList<Point>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Point".equalsIgnoreCase(widget.getType())) {
                result.add((Point)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Indent> getIndents() {
        java.util.List<Indent> result = new ArrayList<Indent>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Indent".equalsIgnoreCase(widget.getType())) {
                result.add((Indent)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Alinea> getAlineas() {
        java.util.List<Alinea> result = new ArrayList<Alinea>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Alinea".equalsIgnoreCase(widget.getType())) {
                result.add((Alinea)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subsection> getSubsections() {
        java.util.List<Subsection> result = new ArrayList<Subsection>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subsection".equalsIgnoreCase(widget.getType())) {
                result.add((Subsection)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subpart> getSubparts() {
        java.util.List<Subpart> result = new ArrayList<Subpart>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subpart".equalsIgnoreCase(widget.getType())) {
                result.add((Subpart)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subparagraph> getSubparagraphs() {
        java.util.List<Subparagraph> result = new ArrayList<Subparagraph>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subparagraph".equalsIgnoreCase(widget.getType())) {
                result.add((Subparagraph)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subchapter> getSubchapters() {
        java.util.List<Subchapter> result = new ArrayList<Subchapter>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subchapter".equalsIgnoreCase(widget.getType())) {
                result.add((Subchapter)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subtitle> getSubtitles() {
        java.util.List<Subtitle> result = new ArrayList<Subtitle>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subtitle".equalsIgnoreCase(widget.getType())) {
                result.add((Subtitle)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subclause> getSubclauses() {
        java.util.List<Subclause> result = new ArrayList<Subclause>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subclause".equalsIgnoreCase(widget.getType())) {
                result.add((Subclause)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Sublist> getSublists() {
        java.util.List<Sublist> result = new ArrayList<Sublist>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Sublist".equalsIgnoreCase(widget.getType())) {
                result.add((Sublist)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<BlockList> getBlockLists() {
        java.util.List<BlockList> result = new ArrayList<BlockList>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("BlockList".equalsIgnoreCase(widget.getType())) {
                result.add((BlockList)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Toc> getTocs() {
        java.util.List<Toc> result = new ArrayList<Toc>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Toc".equalsIgnoreCase(widget.getType())) {
                result.add((Toc)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Tblock> getTblocks() {
        java.util.List<Tblock> result = new ArrayList<Tblock>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tblock".equalsIgnoreCase(widget.getType())) {
                result.add((Tblock)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Ul> getUls() {
        java.util.List<Ul> result = new ArrayList<Ul>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ul".equalsIgnoreCase(widget.getType())) {
                result.add((Ul)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Ol> getOls() {
        java.util.List<Ol> result = new ArrayList<Ol>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ol".equalsIgnoreCase(widget.getType())) {
                result.add((Ol)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Table> getTables() {
        java.util.List<Table> result = new ArrayList<Table>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Table".equalsIgnoreCase(widget.getType())) {
                result.add((Table)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<P> getPs() {
        java.util.List<P> result = new ArrayList<P>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("P".equalsIgnoreCase(widget.getType())) {
                result.add((P)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<AdministrationOfOath> getAdministrationOfOaths() {
        java.util.List<AdministrationOfOath> result = new ArrayList<AdministrationOfOath>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType())) {
                result.add((AdministrationOfOath)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<RollCall> getRollCalls() {
        java.util.List<RollCall> result = new ArrayList<RollCall>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
                result.add((RollCall)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Prayers> getPrayerses() {
        java.util.List<Prayers> result = new ArrayList<Prayers>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType())) {
                result.add((Prayers)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<OralStatements> getOralStatementses() {
        java.util.List<OralStatements> result = new ArrayList<OralStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
                result.add((OralStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<WrittenStatements> getWrittenStatementses() {
        java.util.List<WrittenStatements> result = new ArrayList<WrittenStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType())) {
                result.add((WrittenStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<PersonalStatements> getPersonalStatementses() {
        java.util.List<PersonalStatements> result = new ArrayList<PersonalStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
                result.add((PersonalStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<MinisterialStatements> getMinisterialStatementses() {
        java.util.List<MinisterialStatements> result = new ArrayList<MinisterialStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType())) {
                result.add((MinisterialStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Resolutions> getResolutionses() {
        java.util.List<Resolutions> result = new ArrayList<Resolutions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
                result.add((Resolutions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<NationalInterest> getNationalInterests() {
        java.util.List<NationalInterest> result = new ArrayList<NationalInterest>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType())) {
                result.add((NationalInterest)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DeclarationOfVote> getDeclarationOfVotes() {
        java.util.List<DeclarationOfVote> result = new ArrayList<DeclarationOfVote>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
                result.add((DeclarationOfVote)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Communication> getCommunications() {
        java.util.List<Communication> result = new ArrayList<Communication>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType())) {
                result.add((Communication)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Petitions> getPetitionses() {
        java.util.List<Petitions> result = new ArrayList<Petitions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
                result.add((Petitions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Papers> getPaperses() {
        java.util.List<Papers> result = new ArrayList<Papers>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType())) {
                result.add((Papers)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<NoticesOfMotion> getNoticesOfMotions() {
        java.util.List<NoticesOfMotion> result = new ArrayList<NoticesOfMotion>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
                result.add((NoticesOfMotion)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Questions> getQuestionses() {
        java.util.List<Questions> result = new ArrayList<Questions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType())) {
                result.add((Questions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Address> getAddresses() {
        java.util.List<Address> result = new ArrayList<Address>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
                result.add((Address)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<ProceduralMotions> getProceduralMotionses() {
        java.util.List<ProceduralMotions> result = new ArrayList<ProceduralMotions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType())) {
                result.add((ProceduralMotions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<PointOfOrder> getPointOfOrders() {
        java.util.List<PointOfOrder> result = new ArrayList<PointOfOrder>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
                result.add((PointOfOrder)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Adjournment> getAdjournments() {
        java.util.List<Adjournment> result = new ArrayList<Adjournment>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType())) {
                result.add((Adjournment)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DebateSection> getDebateSections() {
        java.util.List<DebateSection> result = new ArrayList<DebateSection>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
                result.add((DebateSection)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Div> getDivs() {
        java.util.List<Div> result = new ArrayList<Div>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Div".equalsIgnoreCase(widget.getType())) {
                result.add((Div)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public AnyURISimpleType getPeriodAttr() {
        return periodAttr;
    }
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"summary","paragraph","tblock","narrative","oralStatements","alinea","blockList","declarationOfVote","adjournment","ol","petitions","componentRef","subchapter","wrap","citation","administrationOfOath","indent","subclause","answer","questions","papers","table","sublist","proceduralMotions","content","speech","nationalInterest","container","scene","foreign","heading","tome","other","subparagraph","toc","subheading","subsection","debateSection","div","resolutions","block","personalStatements","recital","chapter","title","rollCall","division","question","ul","communication","noticesOfMotion","list","section","intro","point","num","article","subpart","address","writtenStatements","hcontainer","p","book","subtitle","pointOfOrder","prayers","ministerialStatements","part","clause"};
    }

}

