package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ForceMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
    public ForceMod() {
        super(DOM.createElement("forceMod"));
    }

    public ForceMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private ForceModsSimpleType typeAttr;
    public ForceModsSimpleType getTypeAttr() {
        return typeAttr;
    }
    public void setTypeAttr(final ForceModsSimpleType typeAttr) {
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

