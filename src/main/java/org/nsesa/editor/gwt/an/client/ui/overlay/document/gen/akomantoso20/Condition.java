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
 * The element condition is a metadata element specifying an open set (non managed by Akoma Ntoso) of conditions on the modification
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Condition extends AnyOtherTypeComplexType {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(null, new Occurrence(0, -1));
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "condition");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget condition");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Condition</code> object and set up its type
     */
    public Condition() {
        super(create());
        setType("condition");
    }


    /**
     * Create a <code>Condition</code> object with the given DOM element
     */
    public Condition(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private BooleanSimpleType frozenAttr;

    /**
     * Return <code>frozenAttr</code> property
     *
     * @return frozenAttr
     */
    public BooleanSimpleType getFrozenAttr() {
        if (frozenAttr == null) {
            frozenAttr = new BooleanSimpleType();
            frozenAttr.setValue(getElement().getAttribute("frozen"));
        }

        return frozenAttr;
    }

    /**
     * Return <code>frozenAttr</code> property in DSL way
     *
     * @return frozenAttr
     */
    public BooleanSimpleType frozenAttr() {
        return getFrozenAttr();
    }

    /**
     * Set <code>frozenAttr</code> property
     *
     * @param frozenAttr the new value
     */
    public void setFrozenAttr(final BooleanSimpleType frozenAttr) {
        this.frozenAttr = frozenAttr;
        getElement().setAttribute("frozen", frozenAttr.getValue());
    }

    /**
     * Set <code>frozenAttr</code> property in DSL way
     *
     * @param frozenAttr the new value
     * @return <code>Condition</code> instance
     */
    public Condition frozenAttr(final BooleanSimpleType frozenAttr) {
        setFrozenAttr(frozenAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> Condition</code> instance
     */
    public Condition idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> Condition</code> instance
     */
    public Condition evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>hrefAttr</code> property in DSL way
     *
     * @param hrefAttr new value
     * @return <code> Condition</code> instance
     */
    public Condition hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> Condition</code> instance
     */
    public Condition wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
     *
     * @return The namesapce as String
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

    /**
     * DSL Style for html method
     */
    @Override
    public Condition html(String s) {
        super.html(s);
        return this;
    }
}

