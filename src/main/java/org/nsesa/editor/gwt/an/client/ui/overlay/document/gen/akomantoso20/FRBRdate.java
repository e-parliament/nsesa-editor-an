package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
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

public class FRBRdate extends MetaoptComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "FRBRdate");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget FRBRdate");
        return span;
    }

// CONSTRUCTORS ------------------
    public FRBRdate() {
        super(create());
        setType("FRBRdate");
    }

    public FRBRdate(Element element) {
        super(element);
    }

// FIELDS ------------------
    private DateSimpleType dateAttr;
    private StringSimpleType nameAttr;

    public DateSimpleType getDateAttr() {
        if (dateAttr == null) {
            dateAttr = new DateSimpleType();
            dateAttr.setValue(getElement().getAttribute("date"));
        }

        return dateAttr;
     }
     //DSL Style get value
    public DateSimpleType dateAttr() {
        return  getDateAttr();
    }

    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
    }
     //DSL Style set value
    public FRBRdate dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
    }
    public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
            nameAttr = new StringSimpleType();
            nameAttr.setValue(getElement().getAttribute("name"));
        }

        return nameAttr;
     }
     //DSL Style get value
    public StringSimpleType nameAttr() {
        return  getNameAttr();
    }

    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
     //DSL Style set value
    public FRBRdate nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
    }
    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public FRBRdate idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    //DSL Style set value
    public FRBRdate evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    //DSL Style set value
    public FRBRdate wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
    */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
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
        attrs.put("date", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("name", getNameAttr() != null ? getNameAttr().getValue() : null);
        return attrs;
    }
}

