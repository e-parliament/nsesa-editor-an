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
public class Table extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Table() {
        super(DOM.createElement("table"));
    }

    public Table(Element element) {
        super(element);
    }

// FIELDS ------------------
    private IntegerSimpleType widthAttr;
    private IntegerSimpleType borderAttr;
    private IntegerSimpleType cellspacingAttr;
    private IntegerSimpleType cellpaddingAttr;
    private AnyURISimpleType alternativeToAttr;
    private StatusTypeSimpleType statusAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType refersToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private String wildcardContentAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType periodAttr;
    public IntegerSimpleType getWidthAttr() {
        if (widthAttr == null) {
            widthAttr = new IntegerSimpleType();
            widthAttr.setValue(amendableElement.getAttribute("width"));
        }

        return widthAttr;
    }
    public void setWidthAttr(final IntegerSimpleType widthAttr) {
        this.widthAttr = widthAttr;
    }
    public IntegerSimpleType getBorderAttr() {
        if (borderAttr == null) {
            borderAttr = new IntegerSimpleType();
            borderAttr.setValue(amendableElement.getAttribute("border"));
        }

        return borderAttr;
    }
    public void setBorderAttr(final IntegerSimpleType borderAttr) {
        this.borderAttr = borderAttr;
    }
    public IntegerSimpleType getCellspacingAttr() {
        if (cellspacingAttr == null) {
            cellspacingAttr = new IntegerSimpleType();
            cellspacingAttr.setValue(amendableElement.getAttribute("cellspacing"));
        }

        return cellspacingAttr;
    }
    public void setCellspacingAttr(final IntegerSimpleType cellspacingAttr) {
        this.cellspacingAttr = cellspacingAttr;
    }
    public IntegerSimpleType getCellpaddingAttr() {
        if (cellpaddingAttr == null) {
            cellpaddingAttr = new IntegerSimpleType();
            cellpaddingAttr.setValue(amendableElement.getAttribute("cellpadding"));
        }

        return cellpaddingAttr;
    }
    public void setCellpaddingAttr(final IntegerSimpleType cellpaddingAttr) {
        this.cellpaddingAttr = cellpaddingAttr;
    }
    public Caption getCaption() {
        Caption result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Caption".equalsIgnoreCase(widget.getType())) {
                result = (Caption)widget;
                break;
            }
        }
        return result;
    }
    public java.util.List<Tr> getTrs() {
        java.util.List<Tr> result = new ArrayList<Tr>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tr".equalsIgnoreCase(widget.getType())) {
                result.add((Tr)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(amendableElement.getAttribute("status"));
        }

        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
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
        return new String[]{"tr","caption"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("widthAttr", getWidthAttr() != null ? getWidthAttr().getValue() : null);
        attrs.put("borderAttr", getBorderAttr() != null ? getBorderAttr().getValue() : null);
        attrs.put("cellspacingAttr", getCellspacingAttr() != null ? getCellspacingAttr().getValue() : null);
        attrs.put("cellpaddingAttr", getCellpaddingAttr() != null ? getCellpaddingAttr().getValue() : null);
        attrs.put("alternativeToAttr", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("statusAttr", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("classAttr", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("styleAttr", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("titleAttr", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("refersToAttr", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("idAttr", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingIdAttr", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("wildcardContentAttr", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("langAttr", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("periodAttr", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }

}

