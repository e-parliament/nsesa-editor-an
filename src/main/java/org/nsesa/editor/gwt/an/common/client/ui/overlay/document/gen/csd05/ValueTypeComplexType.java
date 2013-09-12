/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The type valueType specifies a value attribute to FRBR elements.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class ValueTypeComplexType extends MetaoptComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "valueTypeComplexType");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget valueTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>ValueTypeComplexType</code> object with the given DOM element
     */
    public ValueTypeComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private StringSimpleType valueAttr;
    private AnyURISimpleType refersToAttr;

    /**
     * Return <code>showAsAttr</code> property
     *
     * @return showAsAttr
     */
    public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
            showAsAttr = new StringSimpleType();
            showAsAttr.setValue(getElement().getAttribute("showAs"));
        }

        return showAsAttr;
    }

    /**
     * Return <code>showAsAttr</code> property in DSL way
     *
     * @return showAsAttr
     */
    public StringSimpleType showAsAttr() {
        return getShowAsAttr();
    }

    /**
     * Set <code>showAsAttr</code> property
     *
     * @param showAsAttr the new value
     */
    public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
        getElement().setAttribute("showAs", showAsAttr.getValue());
    }

    /**
     * Set <code>showAsAttr</code> property in DSL way
     *
     * @param showAsAttr the new value
     * @return <code>ValueTypeComplexType</code> instance
     */
    public ValueTypeComplexType showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
    }

    /**
     * Return <code>shortFormAttr</code> property
     *
     * @return shortFormAttr
     */
    public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
            shortFormAttr = new StringSimpleType();
            shortFormAttr.setValue(getElement().getAttribute("shortForm"));
        }

        return shortFormAttr;
    }

    /**
     * Return <code>shortFormAttr</code> property in DSL way
     *
     * @return shortFormAttr
     */
    public StringSimpleType shortFormAttr() {
        return getShortFormAttr();
    }

    /**
     * Set <code>shortFormAttr</code> property
     *
     * @param shortFormAttr the new value
     */
    public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
        getElement().setAttribute("shortForm", shortFormAttr.getValue());
    }

    /**
     * Set <code>shortFormAttr</code> property in DSL way
     *
     * @param shortFormAttr the new value
     * @return <code>ValueTypeComplexType</code> instance
     */
    public ValueTypeComplexType shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }

    /**
     * Return <code>valueAttr</code> property
     *
     * @return valueAttr
     */
    public StringSimpleType getValueAttr() {
        if (valueAttr == null) {
            valueAttr = new StringSimpleType();
            valueAttr.setValue(getElement().getAttribute("value"));
        }

        return valueAttr;
    }

    /**
     * Return <code>valueAttr</code> property in DSL way
     *
     * @return valueAttr
     */
    public StringSimpleType valueAttr() {
        return getValueAttr();
    }

    /**
     * Set <code>valueAttr</code> property
     *
     * @param valueAttr the new value
     */
    public void setValueAttr(final StringSimpleType valueAttr) {
        this.valueAttr = valueAttr;
        getElement().setAttribute("value", valueAttr.getValue());
    }

    /**
     * Set <code>valueAttr</code> property in DSL way
     *
     * @param valueAttr the new value
     * @return <code>ValueTypeComplexType</code> instance
     */
    public ValueTypeComplexType valueAttr(final StringSimpleType valueAttr) {
        setValueAttr(valueAttr);
        return this;
    }

    /**
     * Return <code>refersToAttr</code> property
     *
     * @return refersToAttr
     */
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    /**
     * Return <code>refersToAttr</code> property in DSL way
     *
     * @return refersToAttr
     */
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    /**
     * Set <code>refersToAttr</code> property
     *
     * @param refersToAttr the new value
     */
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo", refersToAttr.getValue());
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr the new value
     * @return <code>ValueTypeComplexType</code> instance
     */
    public ValueTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> ValueTypeComplexType</code> instance
     */
    public ValueTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> ValueTypeComplexType</code> instance
     */
    public ValueTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> ValueTypeComplexType</code> instance
     */
    public ValueTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("showAs", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortForm", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        attrs.put("value", getValueAttr() != null ? getValueAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        return attrs;
    }

    @Override
    public StructureIndicator getStructureIndicator() {
        return STRUCTURE_INDICATOR;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public ValueTypeComplexType html(String s) {
        super.html(s);
        return this;
    }
}

