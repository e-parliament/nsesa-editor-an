package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Classification extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Classification() {
        super(DOM.createElement("classification"));
    }

    public Classification(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;
    public java.util.List<Keyword> getKeywords() {
        java.util.List<Keyword> result = new ArrayList<Keyword>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Keyword".equalsIgnoreCase(widget.getType())) {
                result.add((Keyword)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
        return new String[]{"keyword"};
    }

}

