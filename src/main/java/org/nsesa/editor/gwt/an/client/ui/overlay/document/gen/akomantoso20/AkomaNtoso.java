package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AkomaNtosoTypeComplexType;
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

public class AkomaNtoso extends AkomaNtosoTypeComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Components(), new Occurrence(0,1));
            put(new AmendmentList(), new Occurrence(0,-1));
            put(new OfficialGazette(), new Occurrence(0,-1));
            put(new DocumentCollection(), new Occurrence(0,-1));
            put(new Act(), new Occurrence(0,-1));
            put(new Bill(), new Occurrence(0,-1));
            put(new DebateReport(), new Occurrence(0,-1));
            put(new Debate(), new Occurrence(0,-1));
            put(new Amendment(), new Occurrence(0,-1));
            put(new Judgement(), new Occurrence(0,-1));
            put(new Doc(), new Occurrence(0,-1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "akomaNtoso");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget akomaNtoso");
        return span;
    }

// CONSTRUCTORS ------------------
    public AkomaNtoso() {
        super(create());
        setType("akomaNtoso");
    }

    public AkomaNtoso(Element element) {
        super(element);
    }

// FIELDS ------------------

    //Override all attributes methods to be conformant with DSL approach

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
        return attrs;
    }
}

