package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class HasAttachment extends ReferenceTypeComplexType  {

// CONSTRUCTORS ------------------
    public HasAttachment() {
        super(DOM.createElement("hasAttachment"));
    }

    public HasAttachment(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType typeAttr;
    public StringSimpleType getTypeAttr() {
        return typeAttr;
    }
    public void setTypeAttr(final StringSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

}

