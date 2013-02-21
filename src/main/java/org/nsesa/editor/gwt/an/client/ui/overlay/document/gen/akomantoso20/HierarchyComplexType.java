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
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class HierarchyComplexType extends BasehierarchyComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Intro(), new Occurrence(0, 1));
            put(new ComponentRef(), new Occurrence(1, 1));
            put(new Wrap(), new Occurrence(0, 1));
            put(new Content(), new Occurrence(1, 1));
            put(new Hcontainer(), new Occurrence(0, -1));
            put(new Clause(), new Occurrence(0, -1));
            put(new Section(), new Occurrence(0, -1));
            put(new Part(), new Occurrence(0, -1));
            put(new Paragraph(), new Occurrence(0, -1));
            put(new Chapter(), new Occurrence(0, -1));
            put(new Title(), new Occurrence(0, -1));
            put(new Article(), new Occurrence(0, -1));
            put(new Book(), new Occurrence(0, -1));
            put(new Tome(), new Occurrence(0, -1));
            put(new Division(), new Occurrence(0, -1));
            put(new List(), new Occurrence(0, -1));
            put(new Point(), new Occurrence(0, -1));
            put(new Indent(), new Occurrence(0, -1));
            put(new Alinea(), new Occurrence(0, -1));
            put(new Subsection(), new Occurrence(0, -1));
            put(new Subpart(), new Occurrence(0, -1));
            put(new Subparagraph(), new Occurrence(0, -1));
            put(new Subchapter(), new Occurrence(0, -1));
            put(new Subtitle(), new Occurrence(0, -1));
            put(new Subclause(), new Occurrence(0, -1));
            put(new Sublist(), new Occurrence(0, -1));
            put(new Num(), new Occurrence(0, 1));
            put(new Heading(), new Occurrence(0, 1));
            put(new Subheading(), new Occurrence(0, 1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "hierarchyComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget hierarchyComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public HierarchyComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType alternativeToAttr;
    private StatusTypeSimpleType statusAttr;
    private String wildcardContentAttr;
    private LanguageSimpleType langAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType periodAttr;

    public Intro getIntro() {
        Intro result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Intro".equalsIgnoreCase(widget.getType())) {
                result = (Intro) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Intro setIntro(Intro introElem) {
        Intro result = getIntro();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(introElem);

        return introElem;
    }

    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(componentRefElem);
        return componentRefElem;
    }

    public Wrap getWrap() {
        Wrap result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Wrap".equalsIgnoreCase(widget.getType())) {
                result = (Wrap) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Wrap setWrap(Wrap wrapElem) {
        Wrap result = getWrap();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(wrapElem);

        return wrapElem;
    }

    public Content getContent_() {
        Content result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Content".equalsIgnoreCase(widget.getType())) {
                result = (Content) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Content setContent_(Content content_Elem) {
        Content result = getContent_();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(content_Elem);

        return content_Elem;
    }

    public java.util.List<Hcontainer> getHcontainers() {
        java.util.List<Hcontainer> result = new ArrayList<Hcontainer>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(hcontainerElem);
        return hcontainerElem;
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
        getElement().setAttribute("refersTo", refersToAttr.getValue());
    }

    //DSL Style set value
    public HierarchyComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
        getElement().setAttribute("alternativeTo", alternativeToAttr.getValue());
    }

    //DSL Style set value
    public HierarchyComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
        getElement().setAttribute("status", statusAttr.value());
    }

    //DSL Style set value
    public HierarchyComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
        getElement().setAttribute("wildcardContent", wildcardContentAttr);
    }

    //DSL Style set value
    public HierarchyComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
        getElement().setAttribute("lang", langAttr.getValue());
    }

    //DSL Style set value
    public HierarchyComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
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
        getElement().setAttribute("id", idAttr.getValue());
    }

    //DSL Style set value
    public HierarchyComplexType idAttr(final IDSimpleType idAttr) {
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
        getElement().setAttribute("evolvingId", evolvingIdAttr.getValue());
    }

    //DSL Style set value
    public HierarchyComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
        getElement().setAttribute("class", classAttr.getValue());
    }

    //DSL Style set value
    public HierarchyComplexType classAttr(final StringSimpleType classAttr) {
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
        getElement().setAttribute("style", styleAttr.getValue());
    }

    //DSL Style set value
    public HierarchyComplexType styleAttr(final StringSimpleType styleAttr) {
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
        getElement().setAttribute("title", titleAttr.getValue());
    }

    //DSL Style set value
    public HierarchyComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    public java.util.List<Clause> getClauses() {
        java.util.List<Clause> result = new ArrayList<Clause>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(clauseElem);
        return clauseElem;
    }

    public java.util.List<Section> getSections() {
        java.util.List<Section> result = new ArrayList<Section>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(sectionElem);
        return sectionElem;
    }

    public java.util.List<Part> getParts() {
        java.util.List<Part> result = new ArrayList<Part>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(partElem);
        return partElem;
    }

    public java.util.List<Paragraph> getParagraphs() {
        java.util.List<Paragraph> result = new ArrayList<Paragraph>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(paragraphElem);
        return paragraphElem;
    }

    public java.util.List<Chapter> getChapters() {
        java.util.List<Chapter> result = new ArrayList<Chapter>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(chapterElem);
        return chapterElem;
    }

    public java.util.List<Title> getTitle_s() {
        java.util.List<Title> result = new ArrayList<Title>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(title_Elem);
        return title_Elem;
    }

    public java.util.List<Article> getArticles() {
        java.util.List<Article> result = new ArrayList<Article>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(articleElem);
        return articleElem;
    }

    public java.util.List<Book> getBooks() {
        java.util.List<Book> result = new ArrayList<Book>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(bookElem);
        return bookElem;
    }

    public java.util.List<Tome> getTomes() {
        java.util.List<Tome> result = new ArrayList<Tome>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(tomeElem);
        return tomeElem;
    }

    public java.util.List<Division> getDivisions() {
        java.util.List<Division> result = new ArrayList<Division>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(divisionElem);
        return divisionElem;
    }

    public java.util.List<List> getLists() {
        java.util.List<List> result = new ArrayList<List>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(listElem);
        return listElem;
    }

    public java.util.List<Point> getPoints() {
        java.util.List<Point> result = new ArrayList<Point>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(pointElem);
        return pointElem;
    }

    public java.util.List<Indent> getIndents() {
        java.util.List<Indent> result = new ArrayList<Indent>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(indentElem);
        return indentElem;
    }

    public java.util.List<Alinea> getAlineas() {
        java.util.List<Alinea> result = new ArrayList<Alinea>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(alineaElem);
        return alineaElem;
    }

    public java.util.List<Subsection> getSubsections() {
        java.util.List<Subsection> result = new ArrayList<Subsection>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(subsectionElem);
        return subsectionElem;
    }

    public java.util.List<Subpart> getSubparts() {
        java.util.List<Subpart> result = new ArrayList<Subpart>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(subpartElem);
        return subpartElem;
    }

    public java.util.List<Subparagraph> getSubparagraphs() {
        java.util.List<Subparagraph> result = new ArrayList<Subparagraph>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(subparagraphElem);
        return subparagraphElem;
    }

    public java.util.List<Subchapter> getSubchapters() {
        java.util.List<Subchapter> result = new ArrayList<Subchapter>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(subchapterElem);
        return subchapterElem;
    }

    public java.util.List<Subtitle> getSubtitles() {
        java.util.List<Subtitle> result = new ArrayList<Subtitle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(subtitleElem);
        return subtitleElem;
    }

    public java.util.List<Subclause> getSubclauses() {
        java.util.List<Subclause> result = new ArrayList<Subclause>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(subclauseElem);
        return subclauseElem;
    }

    public java.util.List<Sublist> getSublists() {
        java.util.List<Sublist> result = new ArrayList<Sublist>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
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
        this.addOverlayWidget(sublistElem);
        return sublistElem;
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
        getElement().setAttribute("period", periodAttr.getValue());
    }

    //DSL Style set value
    public HierarchyComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
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
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }
}

