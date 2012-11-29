package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class AnyTypeComplexType extends AmendableWidgetImpl  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "anyTypeComplexType");
        span.setClassName("widget anyTypeComplexType");
        return span;
    }

    // CONSTRUCTORS ------------------

    public AnyTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------

    public java.util.List<AmendableWidgetImpl> getWildcardContents() {
        java.util.List<AmendableWidgetImpl> result = new ArrayList<AmendableWidgetImpl>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AmendableWidgetImpl".equalsIgnoreCase(widget.getType())) {
                result.add((AmendableWidgetImpl)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<AmendableWidgetImpl> getWildcardContentList() {
        return  getWildcardContents();
    }
    //DSL Style set value
    public String addWildcardContent(String wildcardContentElem) {
        throw new RuntimeException("Adding wildcard content is not supported yet");
    }

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"*"};
    }

    /**
    * Returns the namespace URI of this amendable widget.
    */
    @Override
    public String getNamespaceURI() {
        return "http://www.w3.org/2001/XMLSchema";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }
}

