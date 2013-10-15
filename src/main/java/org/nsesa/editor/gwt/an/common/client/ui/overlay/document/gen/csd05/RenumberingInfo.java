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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * Generated class
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class RenumberingInfo extends MetareqComplexType {

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
        span.setAttribute("data-type", "renumberingInfo");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget renumberingInfo");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>RenumberingInfo</code> object and set up its type
     */
    public RenumberingInfo() {
        super(create());
        setType("renumberingInfo");
    }

    /**
     * Constructor with required attributes
     */
    public RenumberingInfo(IDSimpleType idAttr) {
        this();
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>RenumberingInfo</code> object with the given DOM element
     */
    public RenumberingInfo(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType endAttr;
    private AnyURISimpleType evolvedIdAttr;
    private AnyURISimpleType originalIdAttr;
    private AnyURISimpleType startAttr;

    /**
     * Return <code>endAttr</code> property
     *
     * @return endAttr
     */
    public AnyURISimpleType getEndAttr() {
        if (endAttr == null) {
            endAttr = new AnyURISimpleType();
            endAttr.setValue(getElement().getAttribute("end"));
        }

        return endAttr;
    }

    /**
     * Return <code>endAttr</code> property in DSL way
     *
     * @return endAttr
     */
    public AnyURISimpleType endAttr() {
        return getEndAttr();
    }

    /**
     * Set <code>endAttr</code> property
     *
     * @param endAttr the new value
     */
    public void setEndAttr(final AnyURISimpleType endAttr) {
        this.endAttr = endAttr;
        getElement().setAttribute("end", endAttr.getValue());
    }

    /**
     * Set <code>endAttr</code> property in DSL way
     *
     * @param endAttr the new value
     * @return <code>RenumberingInfo</code> instance
     */
    public RenumberingInfo endAttr(final AnyURISimpleType endAttr) {
        setEndAttr(endAttr);
        return this;
    }

    /**
     * Return <code>evolvedIdAttr</code> property
     *
     * @return evolvedIdAttr
     */
    public AnyURISimpleType getEvolvedIdAttr() {
        if (evolvedIdAttr == null) {
            evolvedIdAttr = new AnyURISimpleType();
            evolvedIdAttr.setValue(getElement().getAttribute("evolvedId"));
        }

        return evolvedIdAttr;
    }

    /**
     * Return <code>evolvedIdAttr</code> property in DSL way
     *
     * @return evolvedIdAttr
     */
    public AnyURISimpleType evolvedIdAttr() {
        return getEvolvedIdAttr();
    }

    /**
     * Set <code>evolvedIdAttr</code> property
     *
     * @param evolvedIdAttr the new value
     */
    public void setEvolvedIdAttr(final AnyURISimpleType evolvedIdAttr) {
        this.evolvedIdAttr = evolvedIdAttr;
        getElement().setAttribute("evolvedId", evolvedIdAttr.getValue());
    }

    /**
     * Set <code>evolvedIdAttr</code> property in DSL way
     *
     * @param evolvedIdAttr the new value
     * @return <code>RenumberingInfo</code> instance
     */
    public RenumberingInfo evolvedIdAttr(final AnyURISimpleType evolvedIdAttr) {
        setEvolvedIdAttr(evolvedIdAttr);
        return this;
    }

    /**
     * Return <code>originalIdAttr</code> property
     *
     * @return originalIdAttr
     */
    public AnyURISimpleType getOriginalIdAttr() {
        if (originalIdAttr == null) {
            originalIdAttr = new AnyURISimpleType();
            originalIdAttr.setValue(getElement().getAttribute("originalId"));
        }

        return originalIdAttr;
    }

    /**
     * Return <code>originalIdAttr</code> property in DSL way
     *
     * @return originalIdAttr
     */
    public AnyURISimpleType originalIdAttr() {
        return getOriginalIdAttr();
    }

    /**
     * Set <code>originalIdAttr</code> property
     *
     * @param originalIdAttr the new value
     */
    public void setOriginalIdAttr(final AnyURISimpleType originalIdAttr) {
        this.originalIdAttr = originalIdAttr;
        getElement().setAttribute("originalId", originalIdAttr.getValue());
    }

    /**
     * Set <code>originalIdAttr</code> property in DSL way
     *
     * @param originalIdAttr the new value
     * @return <code>RenumberingInfo</code> instance
     */
    public RenumberingInfo originalIdAttr(final AnyURISimpleType originalIdAttr) {
        setOriginalIdAttr(originalIdAttr);
        return this;
    }

    /**
     * Return <code>startAttr</code> property
     *
     * @return startAttr
     */
    public AnyURISimpleType getStartAttr() {
        if (startAttr == null) {
            startAttr = new AnyURISimpleType();
            startAttr.setValue(getElement().getAttribute("start"));
        }

        return startAttr;
    }

    /**
     * Return <code>startAttr</code> property in DSL way
     *
     * @return startAttr
     */
    public AnyURISimpleType startAttr() {
        return getStartAttr();
    }

    /**
     * Set <code>startAttr</code> property
     *
     * @param startAttr the new value
     */
    public void setStartAttr(final AnyURISimpleType startAttr) {
        this.startAttr = startAttr;
        getElement().setAttribute("start", startAttr.getValue());
    }

    /**
     * Set <code>startAttr</code> property in DSL way
     *
     * @param startAttr the new value
     * @return <code>RenumberingInfo</code> instance
     */
    public RenumberingInfo startAttr(final AnyURISimpleType startAttr) {
        setStartAttr(startAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> RenumberingInfo</code> instance
     */
    public RenumberingInfo evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> RenumberingInfo</code> instance
     */
    public RenumberingInfo idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> RenumberingInfo</code> instance
     */
    public RenumberingInfo wildcardContentAttr(final String wildcardContentAttr) {
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
        attrs.put("end", getEndAttr() != null ? getEndAttr().getValue() : null);
        attrs.put("evolvedId", getEvolvedIdAttr() != null ? getEvolvedIdAttr().getValue() : null);
        attrs.put("originalId", getOriginalIdAttr() != null ? getOriginalIdAttr().getValue() : null);
        attrs.put("start", getStartAttr() != null ? getStartAttr().getValue() : null);
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
    public RenumberingInfo html(String s) {
        super.html(s);
        return this;
    }
}

