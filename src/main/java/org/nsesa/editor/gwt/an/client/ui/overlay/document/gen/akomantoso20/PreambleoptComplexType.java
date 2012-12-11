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
public class PreambleoptComplexType extends AmendableWidgetImpl {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "preambleoptComplexType");
        span.setClassName("widget preambleoptComplexType");
        return span;
    }

    // CONSTRUCTORS ------------------

    public PreambleoptComplexType(Element element) {
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

    public java.util.List<Recitals> getRecitalses() {
        java.util.List<Recitals> result = new ArrayList<Recitals>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Recitals".equalsIgnoreCase(widget.getType())) {
                result.add((Recitals) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Recitals> getRecitalsList() {
        return getRecitalses();
    }

    //DSL Style set value
    public Recitals addRecitals(Recitals recitalsElem) {
        this.addAmendableWidget(recitalsElem);
        return recitalsElem;
    }

    public java.util.List<Citations> getCitationses() {
        java.util.List<Citations> result = new ArrayList<Citations>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Citations".equalsIgnoreCase(widget.getType())) {
                result.add((Citations) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Citations> getCitationsList() {
        return getCitationses();
    }

    //DSL Style set value
    public Citations addCitations(Citations citationsElem) {
        this.addAmendableWidget(citationsElem);
        return citationsElem;
    }

    public java.util.List<Formula> getFormulas() {
        java.util.List<Formula> result = new ArrayList<Formula>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Formula".equalsIgnoreCase(widget.getType())) {
                result.add((Formula) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Formula> getFormulaList() {
        return getFormulas();
    }

    //DSL Style set value
    public Formula addFormula(Formula formulaElem) {
        this.addAmendableWidget(formulaElem);
        return formulaElem;
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
    public PreambleoptComplexType idAttr(final IDSimpleType idAttr) {
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
    public PreambleoptComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
    public PreambleoptComplexType classAttr(final StringSimpleType classAttr) {
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
    public PreambleoptComplexType styleAttr(final StringSimpleType styleAttr) {
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
    public PreambleoptComplexType titleAttr(final StringSimpleType titleAttr) {
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
    public PreambleoptComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
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
    public PreambleoptComplexType wildcardContentAttr(final String wildcardContentAttr) {
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
    public PreambleoptComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
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
    public PreambleoptComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
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
    public PreambleoptComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
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
    public PreambleoptComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"toc", "ul", "citations", "tblock", "block", "table", "recitals", "container", "blockList", "p", "ol", "foreign", "formula"};
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

