package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Introduction;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Background;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Motivation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Decision;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

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
    private StatusTypeSimpleType statusAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType refersToAttr;
    private AmendableWidgetImpl wildcardContentAttr;
    private LanguageSimpleType langAttr;
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
    public StatusTypeSimpleType getStatusAttr() {
        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
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
    public AnyURISimpleType getRefersToAttr() {
        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public AmendableWidgetImpl getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public LanguageSimpleType getLangAttr() {
        return langAttr;
    }
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
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

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("alternativeToAttr", getAlternativeToAttr().getValue());
        attrs.put("statusAttr", getStatusAttr().value());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());
        attrs.put("classAttr", getClassAttr().getValue());
        attrs.put("styleAttr", getStyleAttr().getValue());
        attrs.put("titleAttr", getTitleAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().getContent());
        attrs.put("langAttr", getLangAttr().getValue());
        attrs.put("periodAttr", getPeriodAttr().getValue());

        return attrs;
    }

}

