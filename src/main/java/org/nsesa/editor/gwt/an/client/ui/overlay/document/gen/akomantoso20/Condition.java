package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Condition extends AnyOtherTypeComplexType  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "condition");
        span.setClassName("widget condition");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Condition() {
        super(create());
        setType("condition");
    }

    public Condition(Element element) {
        super(element);
    }

// FIELDS ------------------
    private BooleanSimpleType frozenAttr;

    public BooleanSimpleType getFrozenAttr() {
        if (frozenAttr == null) {
            frozenAttr = new BooleanSimpleType();
            frozenAttr.setValue(amendableElement.getAttribute("frozen"));
        }

        return frozenAttr;
    }
    //DSL Style get value
    public BooleanSimpleType frozenAttr() {
         return  getFrozenAttr();
    }

    public void setFrozenAttr(final BooleanSimpleType frozenAttr) {
        this.frozenAttr = frozenAttr;
    }
    //DSL Style set value
    public Condition frozenAttr(final BooleanSimpleType frozenAttr) {
        setFrozenAttr(frozenAttr);
        return this;
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
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("frozen", getFrozenAttr() != null ? getFrozenAttr().getValue() : null);
        return attrs;
    }
}

