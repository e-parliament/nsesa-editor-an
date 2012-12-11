package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class MaincontentComplexType extends AmendableWidgetImpl {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "maincontentComplexType");
        span.setClassName("widget maincontentComplexType");
        return span;
    }

    // CONSTRUCTORS ------------------

    public MaincontentComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType alternativeToAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType refersToAttr;
    private StatusTypeSimpleType statusAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType periodAttr;

    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType())) {
                result.add((ComponentRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<ComponentRef> getComponentRefList() {
        return getComponentRefs();
    }

    //DSL Style set value
    public ComponentRef addComponentRef(ComponentRef componentRefElem) {
        this.addAmendableWidget(componentRefElem);
        return componentRefElem;
    }

    public java.util.List<Hcontainer> getHcontainers() {
        java.util.List<Hcontainer> result = new ArrayList<Hcontainer>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Hcontainer".equalsIgnoreCase(widget.getType())) {
                result.add((Hcontainer) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Hcontainer> getHcontainerList() {
        return getHcontainers();
    }

    //DSL Style set value
    public Hcontainer addHcontainer(Hcontainer hcontainerElem) {
        this.addAmendableWidget(hcontainerElem);
        return hcontainerElem;
    }

    public java.util.List<Foreign> getForeigns() {
        java.util.List<Foreign> result = new ArrayList<Foreign>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Foreign".equalsIgnoreCase(widget.getType())) {
                result.add((Foreign) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Foreign> getForeignList() {
        return getForeigns();
    }

    //DSL Style set value
    public Foreign addForeign(Foreign foreignElem) {
        this.addAmendableWidget(foreignElem);
        return foreignElem;
    }

    public java.util.List<Block> getBlocks() {
        java.util.List<Block> result = new ArrayList<Block>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Block".equalsIgnoreCase(widget.getType())) {
                result.add((Block) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Block> getBlockList() {
        return getBlocks();
    }

    //DSL Style set value
    public Block addBlock(Block blockElem) {
        this.addAmendableWidget(blockElem);
        return blockElem;
    }

    public java.util.List<Container> getContainers() {
        java.util.List<Container> result = new ArrayList<Container>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType())) {
                result.add((Container) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Container> getContainerList() {
        return getContainers();
    }

    //DSL Style set value
    public Container addContainer(Container containerElem) {
        this.addAmendableWidget(containerElem);
        return containerElem;
    }

    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
    }

    //DSL Style get value
    public IDSimpleType idAttr() {
        return getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }

    //DSL Style set value
    public MaincontentComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }

    //DSL Style get value
    public NMTOKENSimpleType evolvingIdAttr() {
        return getEvolvingIdAttr();
    }

    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }

    //DSL Style set value
    public MaincontentComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(getElement().getAttribute("class"));
        }

        return classAttr;
    }

    //DSL Style get value
    public StringSimpleType classAttr() {
        return getClassAttr();
    }

    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }

    //DSL Style set value
    public MaincontentComplexType classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(getElement().getAttribute("style"));
        }

        return styleAttr;
    }

    //DSL Style get value
    public StringSimpleType styleAttr() {
        return getStyleAttr();
    }

    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }

    //DSL Style set value
    public MaincontentComplexType styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(getElement().getAttribute("title"));
        }

        return titleAttr;
    }

    //DSL Style get value
    public StringSimpleType titleAttr() {
        return getTitleAttr();
    }

    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }

    //DSL Style set value
    public MaincontentComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(getElement().getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType alternativeToAttr() {
        return getAlternativeToAttr();
    }

    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }

    //DSL Style set value
    public MaincontentComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }

    //DSL Style get value
    public String wildcardContentAttr() {
        return getWildcardContentAttr();
    }

    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }

    //DSL Style set value
    public MaincontentComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }

    //DSL Style set value
    public MaincontentComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(getElement().getAttribute("status"));
        }

        return statusAttr;
    }

    //DSL Style get value
    public StatusTypeSimpleType statusAttr() {
        return getStatusAttr();
    }

    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }

    //DSL Style set value
    public MaincontentComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(getElement().getAttribute("lang"));
        }

        return langAttr;
    }

    //DSL Style get value
    public LanguageSimpleType langAttr() {
        return getLangAttr();
    }

    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }

    //DSL Style set value
    public MaincontentComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    public java.util.List<Clause> getClauses() {
        java.util.List<Clause> result = new ArrayList<Clause>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Clause".equalsIgnoreCase(widget.getType())) {
                result.add((Clause) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Clause> getClauseList() {
        return getClauses();
    }

    //DSL Style set value
    public Clause addClause(Clause clauseElem) {
        this.addAmendableWidget(clauseElem);
        return clauseElem;
    }

    public java.util.List<Section> getSections() {
        java.util.List<Section> result = new ArrayList<Section>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Section".equalsIgnoreCase(widget.getType())) {
                result.add((Section) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Section> getSectionList() {
        return getSections();
    }

    //DSL Style set value
    public Section addSection(Section sectionElem) {
        this.addAmendableWidget(sectionElem);
        return sectionElem;
    }

    public java.util.List<Part> getParts() {
        java.util.List<Part> result = new ArrayList<Part>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Part".equalsIgnoreCase(widget.getType())) {
                result.add((Part) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Part> getPartList() {
        return getParts();
    }

    //DSL Style set value
    public Part addPart(Part partElem) {
        this.addAmendableWidget(partElem);
        return partElem;
    }

    public java.util.List<Paragraph> getParagraphs() {
        java.util.List<Paragraph> result = new ArrayList<Paragraph>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Paragraph".equalsIgnoreCase(widget.getType())) {
                result.add((Paragraph) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Paragraph> getParagraphList() {
        return getParagraphs();
    }

    //DSL Style set value
    public Paragraph addParagraph(Paragraph paragraphElem) {
        this.addAmendableWidget(paragraphElem);
        return paragraphElem;
    }

    public java.util.List<Chapter> getChapters() {
        java.util.List<Chapter> result = new ArrayList<Chapter>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Chapter".equalsIgnoreCase(widget.getType())) {
                result.add((Chapter) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Chapter> getChapterList() {
        return getChapters();
    }

    //DSL Style set value
    public Chapter addChapter(Chapter chapterElem) {
        this.addAmendableWidget(chapterElem);
        return chapterElem;
    }

    public java.util.List<Title> getTitle_s() {
        java.util.List<Title> result = new ArrayList<Title>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Title".equalsIgnoreCase(widget.getType())) {
                result.add((Title) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Title> getTitle_List() {
        return getTitle_s();
    }

    //DSL Style set value
    public Title addTitle_(Title title_Elem) {
        this.addAmendableWidget(title_Elem);
        return title_Elem;
    }

    public java.util.List<Article> getArticles() {
        java.util.List<Article> result = new ArrayList<Article>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Article".equalsIgnoreCase(widget.getType())) {
                result.add((Article) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Article> getArticleList() {
        return getArticles();
    }

    //DSL Style set value
    public Article addArticle(Article articleElem) {
        this.addAmendableWidget(articleElem);
        return articleElem;
    }

    public java.util.List<Book> getBooks() {
        java.util.List<Book> result = new ArrayList<Book>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Book".equalsIgnoreCase(widget.getType())) {
                result.add((Book) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Book> getBookList() {
        return getBooks();
    }

    //DSL Style set value
    public Book addBook(Book bookElem) {
        this.addAmendableWidget(bookElem);
        return bookElem;
    }

    public java.util.List<Tome> getTomes() {
        java.util.List<Tome> result = new ArrayList<Tome>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tome".equalsIgnoreCase(widget.getType())) {
                result.add((Tome) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Tome> getTomeList() {
        return getTomes();
    }

    //DSL Style set value
    public Tome addTome(Tome tomeElem) {
        this.addAmendableWidget(tomeElem);
        return tomeElem;
    }

    public java.util.List<Division> getDivisions() {
        java.util.List<Division> result = new ArrayList<Division>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Division".equalsIgnoreCase(widget.getType())) {
                result.add((Division) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Division> getDivisionList() {
        return getDivisions();
    }

    //DSL Style set value
    public Division addDivision(Division divisionElem) {
        this.addAmendableWidget(divisionElem);
        return divisionElem;
    }

    public java.util.List<List> getLists() {
        java.util.List<List> result = new ArrayList<List>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("List".equalsIgnoreCase(widget.getType())) {
                result.add((List) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<List> getListList() {
        return getLists();
    }

    //DSL Style set value
    public List addList(List listElem) {
        this.addAmendableWidget(listElem);
        return listElem;
    }

    public java.util.List<Point> getPoints() {
        java.util.List<Point> result = new ArrayList<Point>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Point".equalsIgnoreCase(widget.getType())) {
                result.add((Point) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Point> getPointList() {
        return getPoints();
    }

    //DSL Style set value
    public Point addPoint(Point pointElem) {
        this.addAmendableWidget(pointElem);
        return pointElem;
    }

    public java.util.List<Indent> getIndents() {
        java.util.List<Indent> result = new ArrayList<Indent>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Indent".equalsIgnoreCase(widget.getType())) {
                result.add((Indent) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Indent> getIndentList() {
        return getIndents();
    }

    //DSL Style set value
    public Indent addIndent(Indent indentElem) {
        this.addAmendableWidget(indentElem);
        return indentElem;
    }

    public java.util.List<Alinea> getAlineas() {
        java.util.List<Alinea> result = new ArrayList<Alinea>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Alinea".equalsIgnoreCase(widget.getType())) {
                result.add((Alinea) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Alinea> getAlineaList() {
        return getAlineas();
    }

    //DSL Style set value
    public Alinea addAlinea(Alinea alineaElem) {
        this.addAmendableWidget(alineaElem);
        return alineaElem;
    }

    public java.util.List<Subsection> getSubsections() {
        java.util.List<Subsection> result = new ArrayList<Subsection>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subsection".equalsIgnoreCase(widget.getType())) {
                result.add((Subsection) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Subsection> getSubsectionList() {
        return getSubsections();
    }

    //DSL Style set value
    public Subsection addSubsection(Subsection subsectionElem) {
        this.addAmendableWidget(subsectionElem);
        return subsectionElem;
    }

    public java.util.List<Subpart> getSubparts() {
        java.util.List<Subpart> result = new ArrayList<Subpart>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subpart".equalsIgnoreCase(widget.getType())) {
                result.add((Subpart) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Subpart> getSubpartList() {
        return getSubparts();
    }

    //DSL Style set value
    public Subpart addSubpart(Subpart subpartElem) {
        this.addAmendableWidget(subpartElem);
        return subpartElem;
    }

    public java.util.List<Subparagraph> getSubparagraphs() {
        java.util.List<Subparagraph> result = new ArrayList<Subparagraph>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subparagraph".equalsIgnoreCase(widget.getType())) {
                result.add((Subparagraph) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Subparagraph> getSubparagraphList() {
        return getSubparagraphs();
    }

    //DSL Style set value
    public Subparagraph addSubparagraph(Subparagraph subparagraphElem) {
        this.addAmendableWidget(subparagraphElem);
        return subparagraphElem;
    }

    public java.util.List<Subchapter> getSubchapters() {
        java.util.List<Subchapter> result = new ArrayList<Subchapter>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subchapter".equalsIgnoreCase(widget.getType())) {
                result.add((Subchapter) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Subchapter> getSubchapterList() {
        return getSubchapters();
    }

    //DSL Style set value
    public Subchapter addSubchapter(Subchapter subchapterElem) {
        this.addAmendableWidget(subchapterElem);
        return subchapterElem;
    }

    public java.util.List<Subtitle> getSubtitles() {
        java.util.List<Subtitle> result = new ArrayList<Subtitle>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subtitle".equalsIgnoreCase(widget.getType())) {
                result.add((Subtitle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Subtitle> getSubtitleList() {
        return getSubtitles();
    }

    //DSL Style set value
    public Subtitle addSubtitle(Subtitle subtitleElem) {
        this.addAmendableWidget(subtitleElem);
        return subtitleElem;
    }

    public java.util.List<Subclause> getSubclauses() {
        java.util.List<Subclause> result = new ArrayList<Subclause>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subclause".equalsIgnoreCase(widget.getType())) {
                result.add((Subclause) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Subclause> getSubclauseList() {
        return getSubclauses();
    }

    //DSL Style set value
    public Subclause addSubclause(Subclause subclauseElem) {
        this.addAmendableWidget(subclauseElem);
        return subclauseElem;
    }

    public java.util.List<Sublist> getSublists() {
        java.util.List<Sublist> result = new ArrayList<Sublist>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Sublist".equalsIgnoreCase(widget.getType())) {
                result.add((Sublist) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Sublist> getSublistList() {
        return getSublists();
    }

    //DSL Style set value
    public Sublist addSublist(Sublist sublistElem) {
        this.addAmendableWidget(sublistElem);
        return sublistElem;
    }

    public java.util.List<BlockList> getBlockLists() {
        java.util.List<BlockList> result = new ArrayList<BlockList>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("BlockList".equalsIgnoreCase(widget.getType())) {
                result.add((BlockList) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<BlockList> getBlockListList() {
        return getBlockLists();
    }

    //DSL Style set value
    public BlockList addBlockList(BlockList blockListElem) {
        this.addAmendableWidget(blockListElem);
        return blockListElem;
    }

    public java.util.List<Toc> getTocs() {
        java.util.List<Toc> result = new ArrayList<Toc>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Toc".equalsIgnoreCase(widget.getType())) {
                result.add((Toc) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Toc> getTocList() {
        return getTocs();
    }

    //DSL Style set value
    public Toc addToc(Toc tocElem) {
        this.addAmendableWidget(tocElem);
        return tocElem;
    }

    public java.util.List<Tblock> getTblocks() {
        java.util.List<Tblock> result = new ArrayList<Tblock>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tblock".equalsIgnoreCase(widget.getType())) {
                result.add((Tblock) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Tblock> getTblockList() {
        return getTblocks();
    }

    //DSL Style set value
    public Tblock addTblock(Tblock tblockElem) {
        this.addAmendableWidget(tblockElem);
        return tblockElem;
    }

    public java.util.List<Ul> getUls() {
        java.util.List<Ul> result = new ArrayList<Ul>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ul".equalsIgnoreCase(widget.getType())) {
                result.add((Ul) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Ul> getUlList() {
        return getUls();
    }

    //DSL Style set value
    public Ul addUl(Ul ulElem) {
        this.addAmendableWidget(ulElem);
        return ulElem;
    }

    public java.util.List<Ol> getOls() {
        java.util.List<Ol> result = new ArrayList<Ol>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ol".equalsIgnoreCase(widget.getType())) {
                result.add((Ol) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Ol> getOlList() {
        return getOls();
    }

    //DSL Style set value
    public Ol addOl(Ol olElem) {
        this.addAmendableWidget(olElem);
        return olElem;
    }

    public java.util.List<Table> getTables() {
        java.util.List<Table> result = new ArrayList<Table>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Table".equalsIgnoreCase(widget.getType())) {
                result.add((Table) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Table> getTableList() {
        return getTables();
    }

    //DSL Style set value
    public Table addTable(Table tableElem) {
        this.addAmendableWidget(tableElem);
        return tableElem;
    }

    public java.util.List<P> getPs() {
        java.util.List<P> result = new ArrayList<P>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("P".equalsIgnoreCase(widget.getType())) {
                result.add((P) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<P> getPList() {
        return getPs();
    }

    //DSL Style set value
    public P addP(P pElem) {
        this.addAmendableWidget(pElem);
        return pElem;
    }

    public java.util.List<AdministrationOfOath> getAdministrationOfOaths() {
        java.util.List<AdministrationOfOath> result = new ArrayList<AdministrationOfOath>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType())) {
                result.add((AdministrationOfOath) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<AdministrationOfOath> getAdministrationOfOathList() {
        return getAdministrationOfOaths();
    }

    //DSL Style set value
    public AdministrationOfOath addAdministrationOfOath(AdministrationOfOath administrationOfOathElem) {
        this.addAmendableWidget(administrationOfOathElem);
        return administrationOfOathElem;
    }

    public java.util.List<RollCall> getRollCalls() {
        java.util.List<RollCall> result = new ArrayList<RollCall>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
                result.add((RollCall) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<RollCall> getRollCallList() {
        return getRollCalls();
    }

    //DSL Style set value
    public RollCall addRollCall(RollCall rollCallElem) {
        this.addAmendableWidget(rollCallElem);
        return rollCallElem;
    }

    public java.util.List<Prayers> getPrayerses() {
        java.util.List<Prayers> result = new ArrayList<Prayers>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType())) {
                result.add((Prayers) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Prayers> getPrayersList() {
        return getPrayerses();
    }

    //DSL Style set value
    public Prayers addPrayers(Prayers prayersElem) {
        this.addAmendableWidget(prayersElem);
        return prayersElem;
    }

    public java.util.List<OralStatements> getOralStatementses() {
        java.util.List<OralStatements> result = new ArrayList<OralStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
                result.add((OralStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<OralStatements> getOralStatementsList() {
        return getOralStatementses();
    }

    //DSL Style set value
    public OralStatements addOralStatements(OralStatements oralStatementsElem) {
        this.addAmendableWidget(oralStatementsElem);
        return oralStatementsElem;
    }

    public java.util.List<WrittenStatements> getWrittenStatementses() {
        java.util.List<WrittenStatements> result = new ArrayList<WrittenStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType())) {
                result.add((WrittenStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<WrittenStatements> getWrittenStatementsList() {
        return getWrittenStatementses();
    }

    //DSL Style set value
    public WrittenStatements addWrittenStatements(WrittenStatements writtenStatementsElem) {
        this.addAmendableWidget(writtenStatementsElem);
        return writtenStatementsElem;
    }

    public java.util.List<PersonalStatements> getPersonalStatementses() {
        java.util.List<PersonalStatements> result = new ArrayList<PersonalStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
                result.add((PersonalStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<PersonalStatements> getPersonalStatementsList() {
        return getPersonalStatementses();
    }

    //DSL Style set value
    public PersonalStatements addPersonalStatements(PersonalStatements personalStatementsElem) {
        this.addAmendableWidget(personalStatementsElem);
        return personalStatementsElem;
    }

    public java.util.List<MinisterialStatements> getMinisterialStatementses() {
        java.util.List<MinisterialStatements> result = new ArrayList<MinisterialStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType())) {
                result.add((MinisterialStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<MinisterialStatements> getMinisterialStatementsList() {
        return getMinisterialStatementses();
    }

    //DSL Style set value
    public MinisterialStatements addMinisterialStatements(MinisterialStatements ministerialStatementsElem) {
        this.addAmendableWidget(ministerialStatementsElem);
        return ministerialStatementsElem;
    }

    public java.util.List<Resolutions> getResolutionses() {
        java.util.List<Resolutions> result = new ArrayList<Resolutions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
                result.add((Resolutions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Resolutions> getResolutionsList() {
        return getResolutionses();
    }

    //DSL Style set value
    public Resolutions addResolutions(Resolutions resolutionsElem) {
        this.addAmendableWidget(resolutionsElem);
        return resolutionsElem;
    }

    public java.util.List<NationalInterest> getNationalInterests() {
        java.util.List<NationalInterest> result = new ArrayList<NationalInterest>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType())) {
                result.add((NationalInterest) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<NationalInterest> getNationalInterestList() {
        return getNationalInterests();
    }

    //DSL Style set value
    public NationalInterest addNationalInterest(NationalInterest nationalInterestElem) {
        this.addAmendableWidget(nationalInterestElem);
        return nationalInterestElem;
    }

    public java.util.List<DeclarationOfVote> getDeclarationOfVotes() {
        java.util.List<DeclarationOfVote> result = new ArrayList<DeclarationOfVote>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
                result.add((DeclarationOfVote) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DeclarationOfVote> getDeclarationOfVoteList() {
        return getDeclarationOfVotes();
    }

    //DSL Style set value
    public DeclarationOfVote addDeclarationOfVote(DeclarationOfVote declarationOfVoteElem) {
        this.addAmendableWidget(declarationOfVoteElem);
        return declarationOfVoteElem;
    }

    public java.util.List<Communication> getCommunications() {
        java.util.List<Communication> result = new ArrayList<Communication>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType())) {
                result.add((Communication) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Communication> getCommunicationList() {
        return getCommunications();
    }

    //DSL Style set value
    public Communication addCommunication(Communication communicationElem) {
        this.addAmendableWidget(communicationElem);
        return communicationElem;
    }

    public java.util.List<Petitions> getPetitionses() {
        java.util.List<Petitions> result = new ArrayList<Petitions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
                result.add((Petitions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Petitions> getPetitionsList() {
        return getPetitionses();
    }

    //DSL Style set value
    public Petitions addPetitions(Petitions petitionsElem) {
        this.addAmendableWidget(petitionsElem);
        return petitionsElem;
    }

    public java.util.List<Papers> getPaperses() {
        java.util.List<Papers> result = new ArrayList<Papers>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType())) {
                result.add((Papers) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Papers> getPapersList() {
        return getPaperses();
    }

    //DSL Style set value
    public Papers addPapers(Papers papersElem) {
        this.addAmendableWidget(papersElem);
        return papersElem;
    }

    public java.util.List<NoticesOfMotion> getNoticesOfMotions() {
        java.util.List<NoticesOfMotion> result = new ArrayList<NoticesOfMotion>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
                result.add((NoticesOfMotion) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<NoticesOfMotion> getNoticesOfMotionList() {
        return getNoticesOfMotions();
    }

    //DSL Style set value
    public NoticesOfMotion addNoticesOfMotion(NoticesOfMotion noticesOfMotionElem) {
        this.addAmendableWidget(noticesOfMotionElem);
        return noticesOfMotionElem;
    }

    public java.util.List<Questions> getQuestionses() {
        java.util.List<Questions> result = new ArrayList<Questions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType())) {
                result.add((Questions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Questions> getQuestionsList() {
        return getQuestionses();
    }

    //DSL Style set value
    public Questions addQuestions(Questions questionsElem) {
        this.addAmendableWidget(questionsElem);
        return questionsElem;
    }

    public java.util.List<Address> getAddresses() {
        java.util.List<Address> result = new ArrayList<Address>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
                result.add((Address) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Address> getAddressList() {
        return getAddresses();
    }

    //DSL Style set value
    public Address addAddress(Address addressElem) {
        this.addAmendableWidget(addressElem);
        return addressElem;
    }

    public java.util.List<ProceduralMotions> getProceduralMotionses() {
        java.util.List<ProceduralMotions> result = new ArrayList<ProceduralMotions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType())) {
                result.add((ProceduralMotions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<ProceduralMotions> getProceduralMotionsList() {
        return getProceduralMotionses();
    }

    //DSL Style set value
    public ProceduralMotions addProceduralMotions(ProceduralMotions proceduralMotionsElem) {
        this.addAmendableWidget(proceduralMotionsElem);
        return proceduralMotionsElem;
    }

    public java.util.List<PointOfOrder> getPointOfOrders() {
        java.util.List<PointOfOrder> result = new ArrayList<PointOfOrder>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
                result.add((PointOfOrder) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<PointOfOrder> getPointOfOrderList() {
        return getPointOfOrders();
    }

    //DSL Style set value
    public PointOfOrder addPointOfOrder(PointOfOrder pointOfOrderElem) {
        this.addAmendableWidget(pointOfOrderElem);
        return pointOfOrderElem;
    }

    public java.util.List<Adjournment> getAdjournments() {
        java.util.List<Adjournment> result = new ArrayList<Adjournment>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType())) {
                result.add((Adjournment) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Adjournment> getAdjournmentList() {
        return getAdjournments();
    }

    //DSL Style set value
    public Adjournment addAdjournment(Adjournment adjournmentElem) {
        this.addAmendableWidget(adjournmentElem);
        return adjournmentElem;
    }

    public java.util.List<DebateSection> getDebateSections() {
        java.util.List<DebateSection> result = new ArrayList<DebateSection>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
                result.add((DebateSection) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DebateSection> getDebateSectionList() {
        return getDebateSections();
    }

    //DSL Style set value
    public DebateSection addDebateSection(DebateSection debateSectionElem) {
        this.addAmendableWidget(debateSectionElem);
        return debateSectionElem;
    }

    public java.util.List<Div> getDivs() {
        java.util.List<Div> result = new ArrayList<Div>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Div".equalsIgnoreCase(widget.getType())) {
                result.add((Div) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Div> getDivList() {
        return getDivs();
    }

    //DSL Style set value
    public Div addDiv(Div divElem) {
        this.addAmendableWidget(divElem);
        return divElem;
    }

    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(getElement().getAttribute("period"));
        }

        return periodAttr;
    }

    //DSL Style get value
    public AnyURISimpleType periodAttr() {
        return getPeriodAttr();
    }

    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }

    //DSL Style set value
    public MaincontentComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"paragraph", "tblock", "oralStatements", "alinea", "blockList", "declarationOfVote", "adjournment", "ol", "subchapter", "componentRef", "petitions", "administrationOfOath", "indent", "subclause", "questions", "papers", "table", "sublist", "proceduralMotions", "nationalInterest", "container", "foreign", "tome", "subparagraph", "toc", "subsection", "debateSection", "div", "block", "resolutions", "personalStatements", "chapter", "title", "division", "rollCall", "ul", "communication", "noticesOfMotion", "list", "section", "point", "subpart", "article", "address", "hcontainer", "p", "writtenStatements", "subtitle", "book", "pointOfOrder", "prayers", "ministerialStatements", "part", "clause"};
    }

    /**
     * Returns the namespace URI of this amendable widget.
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }
}

