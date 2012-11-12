package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Hcontainer;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Clause;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Section;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Part;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Paragraph;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Chapter;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Title;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Article;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Book;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Tome;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Division;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.List;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Point;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Indent;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Alinea;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Subsection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Subpart;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Subparagraph;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Subchapter;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Subtitle;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Subclause;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Sublist;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class BodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public BodyTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<ComponentRef> componentRefs = new ArrayList<ComponentRef>();
private java.util.List<Hcontainer> hcontainers = new ArrayList<Hcontainer>();
private LanguageSimpleType langAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AnyURISimpleType alternativeToAttr;
private StringSimpleType classAttr;
private StringSimpleType styleAttr;
private StringSimpleType titleAttr;
private StatusTypeSimpleType statusAttr;
private AmendableWidgetImpl wildcardContentAttr;
private AnyURISimpleType refersToAttr;
private java.util.List<Clause> clauses = new ArrayList<Clause>();
private java.util.List<Section> sections = new ArrayList<Section>();
private java.util.List<Part> parts = new ArrayList<Part>();
private java.util.List<Paragraph> paragraphs = new ArrayList<Paragraph>();
private java.util.List<Chapter> chapters = new ArrayList<Chapter>();
private java.util.List<Title> title_s = new ArrayList<Title>();
private java.util.List<Article> articles = new ArrayList<Article>();
private java.util.List<Book> books = new ArrayList<Book>();
private java.util.List<Tome> tomes = new ArrayList<Tome>();
private java.util.List<Division> divisions = new ArrayList<Division>();
private java.util.List<List> lists = new ArrayList<List>();
private java.util.List<Point> points = new ArrayList<Point>();
private java.util.List<Indent> indents = new ArrayList<Indent>();
private java.util.List<Alinea> alineas = new ArrayList<Alinea>();
private java.util.List<Subsection> subsections = new ArrayList<Subsection>();
private java.util.List<Subpart> subparts = new ArrayList<Subpart>();
private java.util.List<Subparagraph> subparagraphs = new ArrayList<Subparagraph>();
private java.util.List<Subchapter> subchapters = new ArrayList<Subchapter>();
private java.util.List<Subtitle> subtitles = new ArrayList<Subtitle>();
private java.util.List<Subclause> subclauses = new ArrayList<Subclause>();
private java.util.List<Sublist> sublists = new ArrayList<Sublist>();
private AnyURISimpleType periodAttr;

public java.util.List<ComponentRef> getComponentRef() {
return componentRefs;
}

public void setComponentRef(final java.util.List<ComponentRef> componentRefs) {
this.componentRefs = componentRefs;
}
public java.util.List<Hcontainer> getHcontainer() {
return hcontainers;
}

public void setHcontainer(final java.util.List<Hcontainer> hcontainers) {
this.hcontainers = hcontainers;
}
public LanguageSimpleType getLangAttr() {
return langAttr;
}

public void setLangAttr(final LanguageSimpleType langAttr) {
this.langAttr = langAttr;
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
public AnyURISimpleType getAlternativeToAttr() {
return alternativeToAttr;
}

public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
this.alternativeToAttr = alternativeToAttr;
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
public AnyURISimpleType getRefersToAttr() {
return refersToAttr;
}

public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
this.refersToAttr = refersToAttr;
}
public java.util.List<Clause> getClause() {
return clauses;
}

public void setClause(final java.util.List<Clause> clauses) {
this.clauses = clauses;
}
public java.util.List<Section> getSection() {
return sections;
}

public void setSection(final java.util.List<Section> sections) {
this.sections = sections;
}
public java.util.List<Part> getPart() {
return parts;
}

public void setPart(final java.util.List<Part> parts) {
this.parts = parts;
}
public java.util.List<Paragraph> getParagraph() {
return paragraphs;
}

public void setParagraph(final java.util.List<Paragraph> paragraphs) {
this.paragraphs = paragraphs;
}
public java.util.List<Chapter> getChapter() {
return chapters;
}

public void setChapter(final java.util.List<Chapter> chapters) {
this.chapters = chapters;
}
public java.util.List<Title> getTitle_() {
return title_s;
}

public void setTitle_(final java.util.List<Title> title_s) {
this.title_s = title_s;
}
public java.util.List<Article> getArticle() {
return articles;
}

public void setArticle(final java.util.List<Article> articles) {
this.articles = articles;
}
public java.util.List<Book> getBook() {
return books;
}

public void setBook(final java.util.List<Book> books) {
this.books = books;
}
public java.util.List<Tome> getTome() {
return tomes;
}

public void setTome(final java.util.List<Tome> tomes) {
this.tomes = tomes;
}
public java.util.List<Division> getDivision() {
return divisions;
}

public void setDivision(final java.util.List<Division> divisions) {
this.divisions = divisions;
}
public java.util.List<List> getList() {
return lists;
}

public void setList(final java.util.List<List> lists) {
this.lists = lists;
}
public java.util.List<Point> getPoint() {
return points;
}

public void setPoint(final java.util.List<Point> points) {
this.points = points;
}
public java.util.List<Indent> getIndent() {
return indents;
}

public void setIndent(final java.util.List<Indent> indents) {
this.indents = indents;
}
public java.util.List<Alinea> getAlinea() {
return alineas;
}

public void setAlinea(final java.util.List<Alinea> alineas) {
this.alineas = alineas;
}
public java.util.List<Subsection> getSubsection() {
return subsections;
}

public void setSubsection(final java.util.List<Subsection> subsections) {
this.subsections = subsections;
}
public java.util.List<Subpart> getSubpart() {
return subparts;
}

public void setSubpart(final java.util.List<Subpart> subparts) {
this.subparts = subparts;
}
public java.util.List<Subparagraph> getSubparagraph() {
return subparagraphs;
}

public void setSubparagraph(final java.util.List<Subparagraph> subparagraphs) {
this.subparagraphs = subparagraphs;
}
public java.util.List<Subchapter> getSubchapter() {
return subchapters;
}

public void setSubchapter(final java.util.List<Subchapter> subchapters) {
this.subchapters = subchapters;
}
public java.util.List<Subtitle> getSubtitle() {
return subtitles;
}

public void setSubtitle(final java.util.List<Subtitle> subtitles) {
this.subtitles = subtitles;
}
public java.util.List<Subclause> getSubclause() {
return subclauses;
}

public void setSubclause(final java.util.List<Subclause> subclauses) {
this.subclauses = subclauses;
}
public java.util.List<Sublist> getSublist() {
return sublists;
}

public void setSublist(final java.util.List<Sublist> sublists) {
this.sublists = sublists;
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
    String[] subtypes = new String[]{"subchapter","componentRef","tome","subparagraph","indent","paragraph","subsection","subclause","list","sublist","section","point","chapter","title","division","subpart","article","alinea","hcontainer","subtitle","book","part","clause"};
    return  subtypes;
}
}

