package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

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
        return sourceAttr;
    }
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"FRBRManifestation","FRBRWork","FRBRItem","FRBRExpression"};
    }

}

