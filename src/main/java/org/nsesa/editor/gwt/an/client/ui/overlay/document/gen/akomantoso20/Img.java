package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

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
        if (widthAttr == null) {
            widthAttr = new IntegerSimpleType();
            widthAttr.setValue(amendableElement.getAttribute("width"));
        }

        return widthAttr;
    }
    public void setWidthAttr(final IntegerSimpleType widthAttr) {
        this.widthAttr = widthAttr;
    }
    public IntegerSimpleType getHeightAttr() {
        if (heightAttr == null) {
            heightAttr = new IntegerSimpleType();
            heightAttr.setValue(amendableElement.getAttribute("height"));
        }

        return heightAttr;
    }
    public void setHeightAttr(final IntegerSimpleType heightAttr) {
        this.heightAttr = heightAttr;
    }
    public AnyURISimpleType getSrcAttr() {
        if (srcAttr == null) {
            srcAttr = new AnyURISimpleType();
            srcAttr.setValue(amendableElement.getAttribute("src"));
        }

        return srcAttr;
    }
    public void setSrcAttr(final AnyURISimpleType srcAttr) {
        this.srcAttr = srcAttr;
    }
    public StringSimpleType getAltAttr() {
        if (altAttr == null) {
            altAttr = new StringSimpleType();
            altAttr.setValue(amendableElement.getAttribute("alt"));
        }

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

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("widthAttr", getWidthAttr().getValue());
        attrs.put("heightAttr", getHeightAttr().getValue());
        attrs.put("srcAttr", getSrcAttr().getValue());
        attrs.put("altAttr", getAltAttr().getValue());

        return attrs;
    }

}

