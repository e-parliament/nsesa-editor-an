package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Img extends MarkeroptComplexType  {

// CONSTRUCTORS ------------------
    public Img() {
        super(DOM.createElement("img"));
    }

    public Img(Element element) {
        super(element);
    }

// FIELDS ------------------
    private IntegerSimpleType widthAttr;
    private IntegerSimpleType heightAttr;
    private AnyURISimpleType srcAttr;
    private StringSimpleType altAttr;
    public IntegerSimpleType getWidthAttr() {
        return widthAttr;
    }
    public void setWidthAttr(final IntegerSimpleType widthAttr) {
        this.widthAttr = widthAttr;
    }
    public IntegerSimpleType getHeightAttr() {
        return heightAttr;
    }
    public void setHeightAttr(final IntegerSimpleType heightAttr) {
        this.heightAttr = heightAttr;
    }
    public AnyURISimpleType getSrcAttr() {
        return srcAttr;
    }
    public void setSrcAttr(final AnyURISimpleType srcAttr) {
        this.srcAttr = srcAttr;
    }
    public StringSimpleType getAltAttr() {
        return altAttr;
    }
    public void setAltAttr(final StringSimpleType altAttr) {
        this.altAttr = altAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

}

