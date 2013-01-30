package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class NormalizedStringSimpleType extends StringSimpleType  {


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "normalizedStringSimpleType");
        span.setAttribute("ns", "http://www.w3.org/2001/XMLSchema");
        span.setClassName("widget normalizedStringSimpleType");
        return span;
    }

// CONSTRUCTORS ------------------

    public NormalizedStringSimpleType() {
        super();
    }

// FIELDS ------------------
}

