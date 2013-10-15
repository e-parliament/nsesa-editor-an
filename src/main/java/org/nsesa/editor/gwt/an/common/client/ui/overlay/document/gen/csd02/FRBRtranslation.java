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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The element FRBRtranslation is the metadata property specifying the source of which this expression<br/> is a translation of.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class FRBRtranslation extends MetaoptComplexType {

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
        span.setAttribute("data-type", "FRBRtranslation");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget FRBRtranslation");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>FRBRtranslation</code> object and set up its type
     */
    public FRBRtranslation() {
        super(create());
        setType("FRBRtranslation");
    }

    /**
     * Constructor with required attributes
     */
    public FRBRtranslation(AnyURISimpleType byAttr, LanguageSimpleType fromLanguageAttr, AnyURISimpleType hrefAttr) {
        this();
        setByAttr(byAttr);
        setFromLanguageAttr(fromLanguageAttr);
        setHrefAttr(hrefAttr);
    }


    /**
     * Create a <code>FRBRtranslation</code> object with the given DOM element
     */
    public FRBRtranslation(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private BooleanSimpleType authoritativeAttr;
    private AnyURISimpleType byAttr;
    private LanguageSimpleType fromLanguageAttr;
    private AnyURISimpleType hrefAttr;
    private LanguageSimpleType pivotAttr;

    /**
     * Return <code>authoritativeAttr</code> property
     *
     * @return authoritativeAttr
     */
    public BooleanSimpleType getAuthoritativeAttr() {
        if (authoritativeAttr == null) {
            authoritativeAttr = new BooleanSimpleType();
            authoritativeAttr.setValue(getElement().getAttribute("authoritative"));
        }

        return authoritativeAttr;
    }

    /**
     * Return <code>authoritativeAttr</code> property in DSL way
     *
     * @return authoritativeAttr
     */
    public BooleanSimpleType authoritativeAttr() {
        return getAuthoritativeAttr();
    }

    /**
     * Set <code>authoritativeAttr</code> property
     *
     * @param authoritativeAttr the new value
     */
    public void setAuthoritativeAttr(final BooleanSimpleType authoritativeAttr) {
        this.authoritativeAttr = authoritativeAttr;
        getElement().setAttribute("authoritative", authoritativeAttr.getValue());
    }

    /**
     * Set <code>authoritativeAttr</code> property in DSL way
     *
     * @param authoritativeAttr the new value
     * @return <code>FRBRtranslation</code> instance
     */
    public FRBRtranslation authoritativeAttr(final BooleanSimpleType authoritativeAttr) {
        setAuthoritativeAttr(authoritativeAttr);
        return this;
    }

    /**
     * Return <code>byAttr</code> property
     *
     * @return byAttr
     */
    public AnyURISimpleType getByAttr() {
        if (byAttr == null) {
            byAttr = new AnyURISimpleType();
            byAttr.setValue(getElement().getAttribute("by"));
        }

        return byAttr;
    }

    /**
     * Return <code>byAttr</code> property in DSL way
     *
     * @return byAttr
     */
    public AnyURISimpleType byAttr() {
        return getByAttr();
    }

    /**
     * Set <code>byAttr</code> property
     *
     * @param byAttr the new value
     */
    public void setByAttr(final AnyURISimpleType byAttr) {
        this.byAttr = byAttr;
        getElement().setAttribute("by", byAttr.getValue());
    }

    /**
     * Set <code>byAttr</code> property in DSL way
     *
     * @param byAttr the new value
     * @return <code>FRBRtranslation</code> instance
     */
    public FRBRtranslation byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
    }

    /**
     * Return <code>fromLanguageAttr</code> property
     *
     * @return fromLanguageAttr
     */
    public LanguageSimpleType getFromLanguageAttr() {
        if (fromLanguageAttr == null) {
            fromLanguageAttr = new LanguageSimpleType();
            fromLanguageAttr.setValue(getElement().getAttribute("fromLanguage"));
        }

        return fromLanguageAttr;
    }

    /**
     * Return <code>fromLanguageAttr</code> property in DSL way
     *
     * @return fromLanguageAttr
     */
    public LanguageSimpleType fromLanguageAttr() {
        return getFromLanguageAttr();
    }

    /**
     * Set <code>fromLanguageAttr</code> property
     *
     * @param fromLanguageAttr the new value
     */
    public void setFromLanguageAttr(final LanguageSimpleType fromLanguageAttr) {
        this.fromLanguageAttr = fromLanguageAttr;
        getElement().setAttribute("fromLanguage", fromLanguageAttr.getValue());
    }

    /**
     * Set <code>fromLanguageAttr</code> property in DSL way
     *
     * @param fromLanguageAttr the new value
     * @return <code>FRBRtranslation</code> instance
     */
    public FRBRtranslation fromLanguageAttr(final LanguageSimpleType fromLanguageAttr) {
        setFromLanguageAttr(fromLanguageAttr);
        return this;
    }

    /**
     * Return <code>hrefAttr</code> property
     *
     * @return hrefAttr
     */
    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(getElement().getAttribute("href"));
        }

        return hrefAttr;
    }

    /**
     * Return <code>hrefAttr</code> property in DSL way
     *
     * @return hrefAttr
     */
    public AnyURISimpleType hrefAttr() {
        return getHrefAttr();
    }

    /**
     * Set <code>hrefAttr</code> property
     *
     * @param hrefAttr the new value
     */
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
        getElement().setAttribute("href", hrefAttr.getValue());
    }

    /**
     * Set <code>hrefAttr</code> property in DSL way
     *
     * @param hrefAttr the new value
     * @return <code>FRBRtranslation</code> instance
     */
    public FRBRtranslation hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }

    /**
     * Return <code>pivotAttr</code> property
     *
     * @return pivotAttr
     */
    public LanguageSimpleType getPivotAttr() {
        if (pivotAttr == null) {
            pivotAttr = new LanguageSimpleType();
            pivotAttr.setValue(getElement().getAttribute("pivot"));
        }

        return pivotAttr;
    }

    /**
     * Return <code>pivotAttr</code> property in DSL way
     *
     * @return pivotAttr
     */
    public LanguageSimpleType pivotAttr() {
        return getPivotAttr();
    }

    /**
     * Set <code>pivotAttr</code> property
     *
     * @param pivotAttr the new value
     */
    public void setPivotAttr(final LanguageSimpleType pivotAttr) {
        this.pivotAttr = pivotAttr;
        getElement().setAttribute("pivot", pivotAttr.getValue());
    }

    /**
     * Set <code>pivotAttr</code> property in DSL way
     *
     * @param pivotAttr the new value
     * @return <code>FRBRtranslation</code> instance
     */
    public FRBRtranslation pivotAttr(final LanguageSimpleType pivotAttr) {
        setPivotAttr(pivotAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> FRBRtranslation</code> instance
     */
    public FRBRtranslation evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> FRBRtranslation</code> instance
     */
    public FRBRtranslation idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> FRBRtranslation</code> instance
     */
    public FRBRtranslation wildcardContentAttr(final String wildcardContentAttr) {
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
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("authoritative", getAuthoritativeAttr() != null ? getAuthoritativeAttr().getValue() : null);
        attrs.put("by", getByAttr() != null ? getByAttr().getValue() : null);
        attrs.put("fromLanguage", getFromLanguageAttr() != null ? getFromLanguageAttr().getValue() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        attrs.put("pivot", getPivotAttr() != null ? getPivotAttr().getValue() : null);
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
    public FRBRtranslation html(String s) {
        super.html(s);
        return this;
    }
}

