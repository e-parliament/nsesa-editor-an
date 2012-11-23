package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Analysis extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Analysis() {
        super(DOM.createElement("analysis"));
    }

    public Analysis(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;
    public ActiveModifications getActiveModifications() {
        ActiveModifications result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ActiveModifications".equalsIgnoreCase(widget.getType())) {
                result = (ActiveModifications)widget;
                break;
            }
        }
        return result;
    }
    public PassiveModifications getPassiveModifications() {
        PassiveModifications result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PassiveModifications".equalsIgnoreCase(widget.getType())) {
                result = (PassiveModifications)widget;
                break;
            }
        }
        return result;
    }
    public Judicial getJudicial() {
        Judicial result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Judicial".equalsIgnoreCase(widget.getType())) {
                result = (Judicial)widget;
                break;
            }
        }
        return result;
    }
    public Parliamentary getParliamentary() {
        Parliamentary result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Parliamentary".equalsIgnoreCase(widget.getType())) {
                result = (Parliamentary)widget;
                break;
            }
        }
        return result;
    }
    public java.util.List<OtherAnalysis> getOtherAnalysises() {
        java.util.List<OtherAnalysis> result = new ArrayList<OtherAnalysis>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OtherAnalysis".equalsIgnoreCase(widget.getType())) {
                result.add((OtherAnalysis)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(amendableElement.getAttribute("source"));
        }

        return sourceAttr;
    }
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"judicial","parliamentary","activeModifications","passiveModifications","otherAnalysis"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("sourceAttr", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }

}

