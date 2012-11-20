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
public class AmendmentBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public AmendmentBodyTypeComplexType(Element element) {
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
    public java.util.List<AmendmentHeading> getAmendmentHeadings() {
        java.util.List<AmendmentHeading> result = new ArrayList<AmendmentHeading>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AmendmentHeading".equalsIgnoreCase(widget.getType())) {
                result.add((AmendmentHeading)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<AmendmentContent> getAmendmentContents() {
        java.util.List<AmendmentContent> result = new ArrayList<AmendmentContent>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AmendmentContent".equalsIgnoreCase(widget.getType())) {
                result.add((AmendmentContent)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<AmendmentReference> getAmendmentReferences() {
        java.util.List<AmendmentReference> result = new ArrayList<AmendmentReference>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AmendmentReference".equalsIgnoreCase(widget.getType())) {
                result.add((AmendmentReference)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<AmendmentJustification> getAmendmentJustifications() {
        java.util.List<AmendmentJustification> result = new ArrayList<AmendmentJustification>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AmendmentJustification".equalsIgnoreCase(widget.getType())) {
                result.add((AmendmentJustification)widget);
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
        return new String[]{"amendmentJustification","amendmentReference","amendmentHeading","amendmentContent"};
    }

}

