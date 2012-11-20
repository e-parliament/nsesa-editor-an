package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

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
        return typeAttr;
    }
    public void setTypeAttr(final LegalSystemModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","source","condition","efficacy","force","destination"};
    }

}

