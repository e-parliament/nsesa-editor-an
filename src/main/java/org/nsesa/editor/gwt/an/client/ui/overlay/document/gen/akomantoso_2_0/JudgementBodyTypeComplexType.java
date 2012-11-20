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
public class JudgementBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public JudgementBodyTypeComplexType(Element element) {
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
    public java.util.List<Introduction> getIntroductions() {
        java.util.List<Introduction> result = new ArrayList<Introduction>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Introduction".equalsIgnoreCase(widget.getType())) {
                result.add((Introduction)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Background> getBackgrounds() {
        java.util.List<Background> result = new ArrayList<Background>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Background".equalsIgnoreCase(widget.getType())) {
                result.add((Background)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Motivation> getMotivations() {
        java.util.List<Motivation> result = new ArrayList<Motivation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Motivation".equalsIgnoreCase(widget.getType())) {
                result.add((Motivation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Decision> getDecisions() {
        java.util.List<Decision> result = new ArrayList<Decision>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Decision".equalsIgnoreCase(widget.getType())) {
                result.add((Decision)widget);
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
        return new String[]{"background","motivation","decision","introduction"};
    }

}

