package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.SpeechTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateTimeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
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

public class Speech extends SpeechTypeComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new From(), new Occurrence(0,1));
            put(new Foreign(), new Occurrence(0,-1));
            put(new Block(), new Occurrence(0,-1));
            put(new BlockList(), new Occurrence(0,-1));
            put(new Toc(), new Occurrence(0,-1));
            put(new Tblock(), new Occurrence(0,-1));
            put(new Ul(), new Occurrence(0,-1));
            put(new Ol(), new Occurrence(0,-1));
            put(new Table(), new Occurrence(0,-1));
            put(new P(), new Occurrence(0,-1));
            put(new Num(), new Occurrence(0,1));
            put(new Heading(), new Occurrence(0,1));
            put(new Subheading(), new Occurrence(0,1));
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "speech");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget speech");
        return span;
    }

// CONSTRUCTORS ------------------
    public Speech() {
        super(create());
        setType("speech");
    }

    public Speech(Element element) {
        super(element);
    }

// FIELDS ------------------

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public Speech byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
    }
    //DSL Style set value
    public Speech asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
    }
    //DSL Style set value
    public Speech startTimeAttr(final DateTimeSimpleType startTimeAttr) {
        setStartTimeAttr(startTimeAttr);
        return this;
    }
    //DSL Style set value
    public Speech endTimeAttr(final DateTimeSimpleType endTimeAttr) {
        setEndTimeAttr(endTimeAttr);
        return this;
    }
    //DSL Style set value
    public Speech toAttr(final AnyURISimpleType toAttr) {
        setToAttr(toAttr);
        return this;
    }
    //DSL Style set value
    public Speech classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }
    //DSL Style set value
    public Speech styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }
    //DSL Style set value
    public Speech titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }
    //DSL Style set value
    public Speech wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    //DSL Style set value
    public Speech alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }
    //DSL Style set value
    public Speech refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    //DSL Style set value
    public Speech statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }
    //DSL Style set value
    public Speech langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }
    //DSL Style set value
    public Speech idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    //DSL Style set value
    public Speech evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    //DSL Style set value
    public Speech periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
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

