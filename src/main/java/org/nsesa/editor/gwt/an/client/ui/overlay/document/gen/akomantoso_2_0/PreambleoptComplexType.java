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
public class PreambleoptComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public PreambleoptComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType alternativeToAttr;
    private AmendableWidgetImpl wildcardContentAttr;
    private AnyURISimpleType refersToAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private StatusTypeSimpleType statusAttr;
    private LanguageSimpleType langAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType periodAttr;
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
    public java.util.List<Recitals> getRecitalses() {
        java.util.List<Recitals> result = new ArrayList<Recitals>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Recitals".equalsIgnoreCase(widget.getType())) {
                result.add((Recitals)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Citations> getCitationses() {
        java.util.List<Citations> result = new ArrayList<Citations>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Citations".equalsIgnoreCase(widget.getType())) {
                result.add((Citations)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Formula> getFormulas() {
        java.util.List<Formula> result = new ArrayList<Formula>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Formula".equalsIgnoreCase(widget.getType())) {
                result.add((Formula)widget);
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
    public AnyURISimpleType getAlternativeToAttr() {
        return alternativeToAttr;
    }
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
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
        return new String[]{"toc","ul","citations","tblock","block","table","recitals","container","blockList","p","ol","foreign","formula"};
    }

}

