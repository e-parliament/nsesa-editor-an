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
    //DSL Style get value
    public IntegerSimpleType widthAttr() {
         return  getWidthAttr();
    }

    public void setWidthAttr(final IntegerSimpleType widthAttr) {
        this.widthAttr = widthAttr;
    }
    //DSL Style set value
    public Img widthAttr(final IntegerSimpleType widthAttr) {
        setWidthAttr(widthAttr);
        return this;
    }
    public IntegerSimpleType getHeightAttr() {
        if (heightAttr == null) {
            heightAttr = new IntegerSimpleType();
            heightAttr.setValue(amendableElement.getAttribute("height"));
        }

        return heightAttr;
    }
    //DSL Style get value
    public IntegerSimpleType heightAttr() {
         return  getHeightAttr();
    }

    public void setHeightAttr(final IntegerSimpleType heightAttr) {
        this.heightAttr = heightAttr;
    }
    //DSL Style set value
    public Img heightAttr(final IntegerSimpleType heightAttr) {
        setHeightAttr(heightAttr);
        return this;
    }
    public AnyURISimpleType getSrcAttr() {
        if (srcAttr == null) {
            srcAttr = new AnyURISimpleType();
            srcAttr.setValue(amendableElement.getAttribute("src"));
        }

        return srcAttr;
    }
    //DSL Style get value
    public AnyURISimpleType srcAttr() {
         return  getSrcAttr();
    }

    public void setSrcAttr(final AnyURISimpleType srcAttr) {
        this.srcAttr = srcAttr;
    }
    //DSL Style set value
    public Img srcAttr(final AnyURISimpleType srcAttr) {
        setSrcAttr(srcAttr);
        return this;
    }
    public StringSimpleType getAltAttr() {
        if (altAttr == null) {
            altAttr = new StringSimpleType();
            altAttr.setValue(amendableElement.getAttribute("alt"));
        }

        return altAttr;
    }
    //DSL Style get value
    public StringSimpleType altAttr() {
         return  getAltAttr();
    }

    public void setAltAttr(final StringSimpleType altAttr) {
        this.altAttr = altAttr;
    }
    //DSL Style set value
    public Img altAttr(final StringSimpleType altAttr) {
        setAltAttr(altAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("widthAttr", getWidthAttr() != null ? getWidthAttr().getValue() : null);
        attrs.put("heightAttr", getHeightAttr() != null ? getHeightAttr().getValue() : null);
        attrs.put("srcAttr", getSrcAttr() != null ? getSrcAttr().getValue() : null);
        attrs.put("altAttr", getAltAttr() != null ? getAltAttr().getValue() : null);
        return attrs;
    }

}

