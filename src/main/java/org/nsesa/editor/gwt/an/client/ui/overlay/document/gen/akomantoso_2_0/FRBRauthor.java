package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FRBRauthor extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
    public FRBRauthor() {
        super(DOM.createElement("FRBRauthor"));
    }

    public FRBRauthor(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType asAttr;
    private AnyURISimpleType hrefAttr;
    public AnyURISimpleType getAsAttr() {
        return asAttr;
    }
    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
    }
    public AnyURISimpleType getHrefAttr() {
        return hrefAttr;
    }
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

}

