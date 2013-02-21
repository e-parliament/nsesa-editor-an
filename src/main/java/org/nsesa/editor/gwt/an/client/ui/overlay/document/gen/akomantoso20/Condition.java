/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Condition extends AnyOtherTypeComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(null, new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "condition");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget condition");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Condition() {
        super(create());
        setType("condition");
    }

    public Condition(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private BooleanSimpleType frozenAttr;

    public BooleanSimpleType getFrozenAttr() {
        if (frozenAttr == null) {
            frozenAttr = new BooleanSimpleType();
            frozenAttr.setValue(getElement().getAttribute("frozen"));
        }

        return frozenAttr;
    }

    //DSL Style get value
    public BooleanSimpleType frozenAttr() {
        return getFrozenAttr();
    }

    public void setFrozenAttr(final BooleanSimpleType frozenAttr) {
        this.frozenAttr = frozenAttr;
        getElement().setAttribute("frozen", frozenAttr.getValue());
    }

    //DSL Style set value
    public Condition frozenAttr(final BooleanSimpleType frozenAttr) {
        setFrozenAttr(frozenAttr);
        return this;
    }

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public Condition hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }

    //DSL Style set value
    public Condition wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    //DSL Style set value
    public Condition idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    //DSL Style set value
    public Condition evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
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
        attrs.put("frozen", getFrozenAttr() != null ? getFrozenAttr().getValue() : null);
        return attrs;
    }
}

