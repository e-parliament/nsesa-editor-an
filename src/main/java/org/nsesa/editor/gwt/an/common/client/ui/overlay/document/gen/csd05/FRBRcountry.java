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
 * The element FRBRcountry is the metadata property containing a ISO 3166-1 Alpha-2 code for the country or jurisdiction to be used in the work-level URI of this document
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class FRBRcountry extends ValueTypeComplexType {

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
        span.setAttribute("type", "FRBRcountry");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget FRBRcountry");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>FRBRcountry</code> object and set up its type
     */
    public FRBRcountry() {
        super(create());
        setType("FRBRcountry");
    }

    /**
     * Constructor with required attributes
     */
    public FRBRcountry(StringSimpleType valueAttr) {
        this();
        setValueAttr(valueAttr);
    }


    /**
     * Create a <code>FRBRcountry</code> object with the given DOM element
     */
    public FRBRcountry(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> FRBRcountry</code> instance
     */
    public FRBRcountry refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>shortFormAttr</code> property in DSL way
     *
     * @param shortFormAttr new value
     * @return <code> FRBRcountry</code> instance
     */
    public FRBRcountry shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }

    /**
     * Set <code>showAsAttr</code> property in DSL way
     *
     * @param showAsAttr new value
     * @return <code> FRBRcountry</code> instance
     */
    public FRBRcountry showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
    }

    /**
     * Set <code>valueAttr</code> property in DSL way
     *
     * @param valueAttr new value
     * @return <code> FRBRcountry</code> instance
     */
    public FRBRcountry valueAttr(final StringSimpleType valueAttr) {
        setValueAttr(valueAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> FRBRcountry</code> instance
     */
    public FRBRcountry evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> FRBRcountry</code> instance
     */
    public FRBRcountry idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> FRBRcountry</code> instance
     */
    public FRBRcountry wildcardContentAttr(final String wildcardContentAttr) {
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
    public FRBRcountry html(String s) {
        super.html(s);
        return this;
    }
}

