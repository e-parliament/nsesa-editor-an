package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Identification extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Identification() {
        super(DOM.createElement("identification"));
    }

    public Identification(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;
    public FRBRWork getFRBRWork() {
        FRBRWork result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRWork".equalsIgnoreCase(widget.getType())) {
                result = (FRBRWork)widget;
                break;
            }
        }
        return result;
    }
    public FRBRExpression getFRBRExpression() {
        FRBRExpression result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRExpression".equalsIgnoreCase(widget.getType())) {
                result = (FRBRExpression)widget;
                break;
            }
        }
        return result;
    }
    public FRBRManifestation getFRBRManifestation() {
        FRBRManifestation result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRManifestation".equalsIgnoreCase(widget.getType())) {
                result = (FRBRManifestation)widget;
                break;
            }
        }
        return result;
    }
    public FRBRItem getFRBRItem() {
        FRBRItem result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRItem".equalsIgnoreCase(widget.getType())) {
                result = (FRBRItem)widget;
                break;
            }
        }
        return result;
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
        return new String[]{"FRBRManifestation","FRBRWork","FRBRItem","FRBRExpression"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("sourceAttr", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }

}

