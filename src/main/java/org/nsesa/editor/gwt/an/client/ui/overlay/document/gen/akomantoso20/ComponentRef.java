package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.SrcTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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

public class ComponentRef extends SrcTypeComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "componentRef");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget componentRef");
        return span;
    }

// CONSTRUCTORS ------------------
    public ComponentRef() {
        super(create());
        setType("componentRef");
    }

    public ComponentRef(Element element) {
        super(element);
    }

// FIELDS ------------------

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public ComponentRef wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    //DSL Style set value
    public ComponentRef idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    //DSL Style set value
    public ComponentRef evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    //DSL Style set value
    public ComponentRef showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
    }
    //DSL Style set value
    public ComponentRef shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }
    //DSL Style set value
    public ComponentRef srcAttr(final AnyURISimpleType srcAttr) {
        setSrcAttr(srcAttr);
        return this;
    }
    //DSL Style set value
    public ComponentRef altAttr(final StringSimpleType altAttr) {
        setAltAttr(altAttr);
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
        return attrs;
    }
}

