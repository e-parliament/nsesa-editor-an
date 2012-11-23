package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class LegalSystemMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
    public LegalSystemMod() {
        super(DOM.createElement("legalSystemMod"));
    }

    public LegalSystemMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private LegalSystemModsSimpleType typeAttr;
    public LegalSystemModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = LegalSystemModsSimpleType.fromString(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    public void setTypeAttr(final LegalSystemModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","source","condition","efficacy","force","destination"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }

}

