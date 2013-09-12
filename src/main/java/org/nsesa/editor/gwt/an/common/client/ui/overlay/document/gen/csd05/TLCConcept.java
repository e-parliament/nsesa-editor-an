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
 * The element TLCConcept is a metadata reference to the Akoma Ntoso URI of an ontology instance of the class Concept
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class TLCConcept extends ReferenceTypeComplexType {

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
        span.setAttribute("type", "TLCConcept");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget TLCConcept");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>TLCConcept</code> object and set up its type
     */
    public TLCConcept() {
        super(create());
        setType("TLCConcept");
    }

    /**
     * Constructor with required attributes
     */
    public TLCConcept(AnyURISimpleType hrefAttr, IDSimpleType idAttr, StringSimpleType showAsAttr) {
        this();
        setHrefAttr(hrefAttr);
        setIdAttr(idAttr);
        setShowAsAttr(showAsAttr);
    }


    /**
     * Create a <code>TLCConcept</code> object with the given DOM element
     */
    public TLCConcept(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> TLCConcept</code> instance
     */
    public TLCConcept evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>hrefAttr</code> property in DSL way
     *
     * @param hrefAttr new value
     * @return <code> TLCConcept</code> instance
     */
    public TLCConcept hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> TLCConcept</code> instance
     */
    public TLCConcept idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>shortFormAttr</code> property in DSL way
     *
     * @param shortFormAttr new value
     * @return <code> TLCConcept</code> instance
     */
    public TLCConcept shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }

    /**
     * Set <code>showAsAttr</code> property in DSL way
     *
     * @param showAsAttr new value
     * @return <code> TLCConcept</code> instance
     */
    public TLCConcept showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> TLCConcept</code> instance
     */
    public TLCConcept wildcardContentAttr(final String wildcardContentAttr) {
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
    public TLCConcept html(String s) {
        super.html(s);
        return this;
    }
}

