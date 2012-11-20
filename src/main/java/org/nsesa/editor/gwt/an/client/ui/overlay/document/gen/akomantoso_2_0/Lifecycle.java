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
public class Lifecycle extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Lifecycle() {
        super(DOM.createElement("lifecycle"));
    }

    public Lifecycle(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;
    public java.util.List<EventRef> getEventRefs() {
        java.util.List<EventRef> result = new ArrayList<EventRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("EventRef".equalsIgnoreCase(widget.getType())) {
                result.add((EventRef)widget);
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
        return new String[]{"eventRef"};
    }

}

