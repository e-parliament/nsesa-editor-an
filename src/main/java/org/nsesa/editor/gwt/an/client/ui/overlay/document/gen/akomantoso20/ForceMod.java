package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class ForceMod extends ModificationTypeComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "forceMod");
        span.setClassName("widget forceMod");
        return span;
    }

    // CONSTRUCTORS ------------------
    public ForceMod() {
        super(create());
        setType("forceMod");
    }

    public ForceMod(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private ForceModsSimpleType typeAttr;

    public ForceModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = ForceModsSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
    }

    //DSL Style get value
    public ForceModsSimpleType typeAttr() {
        return getTypeAttr();
    }

    public void setTypeAttr(final ForceModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }

    //DSL Style set value
    public ForceMod typeAttr(final ForceModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration", "application", "source", "condition", "efficacy", "force", "destination"};
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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }
}

