package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class AmendmentBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public AmendmentBodyTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private String wildcardContentAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType alternativeToAttr;
    private LanguageSimpleType langAttr;
    private StatusTypeSimpleType statusAttr;
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
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
        }

        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(amendableElement.getAttribute("class"));
        }

        return classAttr;
    }
    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(amendableElement.getAttribute("style"));
        }

        return styleAttr;
    }
    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(amendableElement.getAttribute("title"));
        }

        return titleAttr;
    }
    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(amendableElement.getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(amendableElement.getAttribute("lang"));
        }

        return langAttr;
    }
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(amendableElement.getAttribute("status"));
        }

        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(amendableElement.getAttribute("period"));
        }

        return periodAttr;
    }
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"amendmentJustification","amendmentReference","amendmentHeading","amendmentContent"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("idAttr", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingIdAttr", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("wildcardContentAttr", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("classAttr", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("styleAttr", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("titleAttr", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("refersToAttr", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("alternativeToAttr", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("langAttr", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("statusAttr", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("periodAttr", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }

}

