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
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Img extends MarkeroptComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "img");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget img");
        return span;
    }

// CONSTRUCTORS ------------------
    public Img() {
        super(create());
        setType("img");
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
            widthAttr.setValue(getElement().getAttribute("width"));
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
            heightAttr.setValue(getElement().getAttribute("height"));
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
            srcAttr.setValue(getElement().getAttribute("src"));
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
            altAttr.setValue(getElement().getAttribute("alt"));
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
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
    */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
        return ALLOWED_SUB_TYPES;
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
        attrs.put("width", getWidthAttr() != null ? getWidthAttr().getValue() : null);
        attrs.put("height", getHeightAttr() != null ? getHeightAttr().getValue() : null);
        attrs.put("src", getSrcAttr() != null ? getSrcAttr().getValue() : null);
        attrs.put("alt", getAltAttr() != null ? getAltAttr().getValue() : null);
        return attrs;
    }
}

