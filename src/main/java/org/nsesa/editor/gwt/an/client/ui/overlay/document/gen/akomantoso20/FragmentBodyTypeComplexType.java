package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class FragmentBodyTypeComplexType extends AmendableWidgetImpl {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "fragmentBodyTypeComplexType");
        span.setClassName("widget fragmentBodyTypeComplexType");
        return span;
    }

    // CONSTRUCTORS ------------------

    public FragmentBodyTypeComplexType(Element element) {
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

    public Hcontainer getHcontainer() {
        Hcontainer result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Hcontainer".equalsIgnoreCase(widget.getType())) {
                result = (Hcontainer) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Hcontainer setHcontainer(Hcontainer hcontainerElem) {
        Hcontainer result = getHcontainer();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(hcontainerElem);

        return hcontainerElem;
    }

    public Container getContainer() {
        Container result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType())) {
                result = (Container) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Container setContainer(Container containerElem) {
        Container result = getContainer();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
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
    public FragmentBodyTypeComplexType idAttr(final IDSimpleType idAttr) {
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
    public FragmentBodyTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
    public FragmentBodyTypeComplexType classAttr(final StringSimpleType classAttr) {
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
    public FragmentBodyTypeComplexType styleAttr(final StringSimpleType styleAttr) {
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
    public FragmentBodyTypeComplexType titleAttr(final StringSimpleType titleAttr) {
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
    public FragmentBodyTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
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
    public FragmentBodyTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
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
    public FragmentBodyTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
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
    public FragmentBodyTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
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
    public FragmentBodyTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    public Clause getClause() {
        Clause result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Clause".equalsIgnoreCase(widget.getType())) {
                result = (Clause) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Clause setClause(Clause clauseElem) {
        Clause result = getClause();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(clauseElem);

        return clauseElem;
    }

    public Section getSection() {
        Section result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Section".equalsIgnoreCase(widget.getType())) {
                result = (Section) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Section setSection(Section sectionElem) {
        Section result = getSection();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(sectionElem);

        return sectionElem;
    }

    public Part getPart() {
        Part result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Part".equalsIgnoreCase(widget.getType())) {
                result = (Part) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Part setPart(Part partElem) {
        Part result = getPart();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(partElem);

        return partElem;
    }

    public Paragraph getParagraph() {
        Paragraph result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Paragraph".equalsIgnoreCase(widget.getType())) {
                result = (Paragraph) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Paragraph setParagraph(Paragraph paragraphElem) {
        Paragraph result = getParagraph();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(paragraphElem);

        return paragraphElem;
    }

    public Chapter getChapter() {
        Chapter result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Chapter".equalsIgnoreCase(widget.getType())) {
                result = (Chapter) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Chapter setChapter(Chapter chapterElem) {
        Chapter result = getChapter();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(chapterElem);

        return chapterElem;
    }

    public Title getTitle_() {
        Title result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Title".equalsIgnoreCase(widget.getType())) {
                result = (Title) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Title setTitle_(Title title_Elem) {
        Title result = getTitle_();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(title_Elem);

        return title_Elem;
    }

    public Article getArticle() {
        Article result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Article".equalsIgnoreCase(widget.getType())) {
                result = (Article) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Article setArticle(Article articleElem) {
        Article result = getArticle();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(articleElem);

        return articleElem;
    }

    public Book getBook() {
        Book result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Book".equalsIgnoreCase(widget.getType())) {
                result = (Book) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Book setBook(Book bookElem) {
        Book result = getBook();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(bookElem);

        return bookElem;
    }

    public Tome getTome() {
        Tome result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tome".equalsIgnoreCase(widget.getType())) {
                result = (Tome) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Tome setTome(Tome tomeElem) {
        Tome result = getTome();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(tomeElem);

        return tomeElem;
    }

    public Division getDivision() {
        Division result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Division".equalsIgnoreCase(widget.getType())) {
                result = (Division) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Division setDivision(Division divisionElem) {
        Division result = getDivision();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(divisionElem);

        return divisionElem;
    }

    public List getList() {
        List result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("List".equalsIgnoreCase(widget.getType())) {
                result = (List) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public List setList(List listElem) {
        List result = getList();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(listElem);

        return listElem;
    }

    public Point getPoint() {
        Point result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Point".equalsIgnoreCase(widget.getType())) {
                result = (Point) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Point setPoint(Point pointElem) {
        Point result = getPoint();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(pointElem);

        return pointElem;
    }

    public Indent getIndent() {
        Indent result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Indent".equalsIgnoreCase(widget.getType())) {
                result = (Indent) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Indent setIndent(Indent indentElem) {
        Indent result = getIndent();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(indentElem);

        return indentElem;
    }

    public Alinea getAlinea() {
        Alinea result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Alinea".equalsIgnoreCase(widget.getType())) {
                result = (Alinea) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Alinea setAlinea(Alinea alineaElem) {
        Alinea result = getAlinea();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(alineaElem);

        return alineaElem;
    }

    public Subsection getSubsection() {
        Subsection result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subsection".equalsIgnoreCase(widget.getType())) {
                result = (Subsection) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Subsection setSubsection(Subsection subsectionElem) {
        Subsection result = getSubsection();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(subsectionElem);

        return subsectionElem;
    }

    public Subpart getSubpart() {
        Subpart result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subpart".equalsIgnoreCase(widget.getType())) {
                result = (Subpart) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Subpart setSubpart(Subpart subpartElem) {
        Subpart result = getSubpart();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(subpartElem);

        return subpartElem;
    }

    public Subparagraph getSubparagraph() {
        Subparagraph result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subparagraph".equalsIgnoreCase(widget.getType())) {
                result = (Subparagraph) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Subparagraph setSubparagraph(Subparagraph subparagraphElem) {
        Subparagraph result = getSubparagraph();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(subparagraphElem);

        return subparagraphElem;
    }

    public Subchapter getSubchapter() {
        Subchapter result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subchapter".equalsIgnoreCase(widget.getType())) {
                result = (Subchapter) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Subchapter setSubchapter(Subchapter subchapterElem) {
        Subchapter result = getSubchapter();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(subchapterElem);

        return subchapterElem;
    }

    public Subtitle getSubtitle() {
        Subtitle result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subtitle".equalsIgnoreCase(widget.getType())) {
                result = (Subtitle) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Subtitle setSubtitle(Subtitle subtitleElem) {
        Subtitle result = getSubtitle();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(subtitleElem);

        return subtitleElem;
    }

    public Subclause getSubclause() {
        Subclause result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subclause".equalsIgnoreCase(widget.getType())) {
                result = (Subclause) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Subclause setSubclause(Subclause subclauseElem) {
        Subclause result = getSubclause();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(subclauseElem);

        return subclauseElem;
    }

    public Sublist getSublist() {
        Sublist result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Sublist".equalsIgnoreCase(widget.getType())) {
                result = (Sublist) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Sublist setSublist(Sublist sublistElem) {
        Sublist result = getSublist();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(sublistElem);

        return sublistElem;
    }

    public AdministrationOfOath getAdministrationOfOath() {
        AdministrationOfOath result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType())) {
                result = (AdministrationOfOath) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public AdministrationOfOath setAdministrationOfOath(AdministrationOfOath administrationOfOathElem) {
        AdministrationOfOath result = getAdministrationOfOath();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(administrationOfOathElem);

        return administrationOfOathElem;
    }

    public RollCall getRollCall() {
        RollCall result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
                result = (RollCall) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public RollCall setRollCall(RollCall rollCallElem) {
        RollCall result = getRollCall();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(rollCallElem);

        return rollCallElem;
    }

    public Prayers getPrayers() {
        Prayers result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType())) {
                result = (Prayers) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Prayers setPrayers(Prayers prayersElem) {
        Prayers result = getPrayers();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(prayersElem);

        return prayersElem;
    }

    public OralStatements getOralStatements() {
        OralStatements result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
                result = (OralStatements) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public OralStatements setOralStatements(OralStatements oralStatementsElem) {
        OralStatements result = getOralStatements();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(oralStatementsElem);

        return oralStatementsElem;
    }

    public WrittenStatements getWrittenStatements() {
        WrittenStatements result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType())) {
                result = (WrittenStatements) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public WrittenStatements setWrittenStatements(WrittenStatements writtenStatementsElem) {
        WrittenStatements result = getWrittenStatements();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(writtenStatementsElem);

        return writtenStatementsElem;
    }

    public PersonalStatements getPersonalStatements() {
        PersonalStatements result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
                result = (PersonalStatements) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public PersonalStatements setPersonalStatements(PersonalStatements personalStatementsElem) {
        PersonalStatements result = getPersonalStatements();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(personalStatementsElem);

        return personalStatementsElem;
    }

    public MinisterialStatements getMinisterialStatements() {
        MinisterialStatements result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType())) {
                result = (MinisterialStatements) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public MinisterialStatements setMinisterialStatements(MinisterialStatements ministerialStatementsElem) {
        MinisterialStatements result = getMinisterialStatements();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(ministerialStatementsElem);

        return ministerialStatementsElem;
    }

    public Resolutions getResolutions() {
        Resolutions result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
                result = (Resolutions) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Resolutions setResolutions(Resolutions resolutionsElem) {
        Resolutions result = getResolutions();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(resolutionsElem);

        return resolutionsElem;
    }

    public NationalInterest getNationalInterest() {
        NationalInterest result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType())) {
                result = (NationalInterest) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public NationalInterest setNationalInterest(NationalInterest nationalInterestElem) {
        NationalInterest result = getNationalInterest();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(nationalInterestElem);

        return nationalInterestElem;
    }

    public DeclarationOfVote getDeclarationOfVote() {
        DeclarationOfVote result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
                result = (DeclarationOfVote) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public DeclarationOfVote setDeclarationOfVote(DeclarationOfVote declarationOfVoteElem) {
        DeclarationOfVote result = getDeclarationOfVote();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(declarationOfVoteElem);

        return declarationOfVoteElem;
    }

    public Communication getCommunication() {
        Communication result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType())) {
                result = (Communication) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Communication setCommunication(Communication communicationElem) {
        Communication result = getCommunication();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(communicationElem);

        return communicationElem;
    }

    public Petitions getPetitions() {
        Petitions result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
                result = (Petitions) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Petitions setPetitions(Petitions petitionsElem) {
        Petitions result = getPetitions();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(petitionsElem);

        return petitionsElem;
    }

    public Papers getPapers() {
        Papers result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType())) {
                result = (Papers) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Papers setPapers(Papers papersElem) {
        Papers result = getPapers();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(papersElem);

        return papersElem;
    }

    public NoticesOfMotion getNoticesOfMotion() {
        NoticesOfMotion result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
                result = (NoticesOfMotion) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public NoticesOfMotion setNoticesOfMotion(NoticesOfMotion noticesOfMotionElem) {
        NoticesOfMotion result = getNoticesOfMotion();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(noticesOfMotionElem);

        return noticesOfMotionElem;
    }

    public Questions getQuestions() {
        Questions result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType())) {
                result = (Questions) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Questions setQuestions(Questions questionsElem) {
        Questions result = getQuestions();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(questionsElem);

        return questionsElem;
    }

    public Address getAddress() {
        Address result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
                result = (Address) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Address setAddress(Address addressElem) {
        Address result = getAddress();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(addressElem);

        return addressElem;
    }

    public ProceduralMotions getProceduralMotions() {
        ProceduralMotions result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType())) {
                result = (ProceduralMotions) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public ProceduralMotions setProceduralMotions(ProceduralMotions proceduralMotionsElem) {
        ProceduralMotions result = getProceduralMotions();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(proceduralMotionsElem);

        return proceduralMotionsElem;
    }

    public PointOfOrder getPointOfOrder() {
        PointOfOrder result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
                result = (PointOfOrder) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public PointOfOrder setPointOfOrder(PointOfOrder pointOfOrderElem) {
        PointOfOrder result = getPointOfOrder();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(pointOfOrderElem);

        return pointOfOrderElem;
    }

    public Adjournment getAdjournment() {
        Adjournment result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType())) {
                result = (Adjournment) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Adjournment setAdjournment(Adjournment adjournmentElem) {
        Adjournment result = getAdjournment();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(adjournmentElem);

        return adjournmentElem;
    }

    public DebateSection getDebateSection() {
        DebateSection result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
                result = (DebateSection) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public DebateSection setDebateSection(DebateSection debateSectionElem) {
        DebateSection result = getDebateSection();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(debateSectionElem);

        return debateSectionElem;
    }

    public Div getDiv() {
        Div result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Div".equalsIgnoreCase(widget.getType())) {
                result = (Div) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Div setDiv(Div divElem) {
        Div result = getDiv();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
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
    public FragmentBodyTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tome", "subparagraph", "paragraph", "subsection", "debateSection", "div", "resolutions", "personalStatements", "oralStatements", "title", "chapter", "division", "rollCall", "alinea", "declarationOfVote", "adjournment", "petitions", "subchapter", "administrationOfOath", "indent", "communication", "noticesOfMotion", "subclause", "questions", "papers", "list", "sublist", "section", "proceduralMotions", "point", "article", "subpart", "address", "nationalInterest", "container", "writtenStatements", "hcontainer", "book", "subtitle", "pointOfOrder", "prayers", "ministerialStatements", "part", "clause"};
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

