package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class TLCReference extends ReferenceTypeComplexType  {

// CONSTRUCTORS ------------------
    public TLCReference() {
        super(DOM.createElement("TLCReference"));
    }

    public TLCReference(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType nameAttr;
    public StringSimpleType getNameAttr() {
        return nameAttr;
    }
    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

}

