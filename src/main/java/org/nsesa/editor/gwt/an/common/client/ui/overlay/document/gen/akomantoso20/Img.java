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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The element img is an HTML element and is used in Akoma Ntoso as in HTML, for including an<br/> image. It is a marker.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Img extends MarkeroptComplexType {

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
        span.setAttribute("type", "img");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget img");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Img</code> object and set up its type
     */
    public Img() {
        super(create());
        setType("img");
    }

    /**
     * Constructor with required attributes
     */
    public Img(AnyURISimpleType srcAttr) {
        this();
        setSrcAttr(srcAttr);
    }


    /**
     * Create a <code>Img</code> object with the given DOM element
     */
    public Img(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private IntegerSimpleType widthAttr;
    private IntegerSimpleType heightAttr;
    private AnyURISimpleType srcAttr;
    private StringSimpleType altAttr;

    /**
     * Return <code>widthAttr</code> property
     *
     * @return widthAttr
     */
    public IntegerSimpleType getWidthAttr() {
        if (widthAttr == null) {
            widthAttr = new IntegerSimpleType();
            widthAttr.setValue(getElement().getAttribute("width"));
        }

        return widthAttr;
    }

    /**
     * Return <code>widthAttr</code> property in DSL way
     *
     * @return widthAttr
     */
    public IntegerSimpleType widthAttr() {
        return getWidthAttr();
    }

    /**
     * Set <code>widthAttr</code> property
     *
     * @param widthAttr the new value
     */
    public void setWidthAttr(final IntegerSimpleType widthAttr) {
        this.widthAttr = widthAttr;
        getElement().setAttribute("width", widthAttr.getValue());
    }

    /**
     * Set <code>widthAttr</code> property in DSL way
     *
     * @param widthAttr the new value
     * @return <code>Img</code> instance
     */
    public Img widthAttr(final IntegerSimpleType widthAttr) {
        setWidthAttr(widthAttr);
        return this;
    }

    /**
     * Return <code>heightAttr</code> property
     *
     * @return heightAttr
     */
    public IntegerSimpleType getHeightAttr() {
        if (heightAttr == null) {
            heightAttr = new IntegerSimpleType();
            heightAttr.setValue(getElement().getAttribute("height"));
        }

        return heightAttr;
    }

    /**
     * Return <code>heightAttr</code> property in DSL way
     *
     * @return heightAttr
     */
    public IntegerSimpleType heightAttr() {
        return getHeightAttr();
    }

    /**
     * Set <code>heightAttr</code> property
     *
     * @param heightAttr the new value
     */
    public void setHeightAttr(final IntegerSimpleType heightAttr) {
        this.heightAttr = heightAttr;
        getElement().setAttribute("height", heightAttr.getValue());
    }

    /**
     * Set <code>heightAttr</code> property in DSL way
     *
     * @param heightAttr the new value
     * @return <code>Img</code> instance
     */
    public Img heightAttr(final IntegerSimpleType heightAttr) {
        setHeightAttr(heightAttr);
        return this;
    }

    /**
     * Return <code>srcAttr</code> property
     *
     * @return srcAttr
     */
    public AnyURISimpleType getSrcAttr() {
        if (srcAttr == null) {
            srcAttr = new AnyURISimpleType();
            srcAttr.setValue(getElement().getAttribute("src"));
        }

        return srcAttr;
    }

    /**
     * Return <code>srcAttr</code> property in DSL way
     *
     * @return srcAttr
     */
    public AnyURISimpleType srcAttr() {
        return getSrcAttr();
    }

    /**
     * Set <code>srcAttr</code> property
     *
     * @param srcAttr the new value
     */
    public void setSrcAttr(final AnyURISimpleType srcAttr) {
        this.srcAttr = srcAttr;
        getElement().setAttribute("src", srcAttr.getValue());
    }

    /**
     * Set <code>srcAttr</code> property in DSL way
     *
     * @param srcAttr the new value
     * @return <code>Img</code> instance
     */
    public Img srcAttr(final AnyURISimpleType srcAttr) {
        setSrcAttr(srcAttr);
        return this;
    }

    /**
     * Return <code>altAttr</code> property
     *
     * @return altAttr
     */
    public StringSimpleType getAltAttr() {
        if (altAttr == null) {
            altAttr = new StringSimpleType();
            altAttr.setValue(getElement().getAttribute("alt"));
        }

        return altAttr;
    }

    /**
     * Return <code>altAttr</code> property in DSL way
     *
     * @return altAttr
     */
    public StringSimpleType altAttr() {
        return getAltAttr();
    }

    /**
     * Set <code>altAttr</code> property
     *
     * @param altAttr the new value
     */
    public void setAltAttr(final StringSimpleType altAttr) {
        this.altAttr = altAttr;
        getElement().setAttribute("alt", altAttr.getValue());
    }

    /**
     * Set <code>altAttr</code> property in DSL way
     *
     * @param altAttr the new value
     * @return <code>Img</code> instance
     */
    public Img altAttr(final StringSimpleType altAttr) {
        setAltAttr(altAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> Img</code> instance
     */
    public Img idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> Img</code> instance
     */
    public Img evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> Img</code> instance
     */
    public Img statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> Img</code> instance
     */
    public Img wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> Img</code> instance
     */
    public Img classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> Img</code> instance
     */
    public Img styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> Img</code> instance
     */
    public Img titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> Img</code> instance
     */
    public Img alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> Img</code> instance
     */
    public Img langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> Img</code> instance
     */
    public Img refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> Img</code> instance
     */
    public Img periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
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
        attrs.put("width", getWidthAttr() != null ? getWidthAttr().getValue() : null);
        attrs.put("height", getHeightAttr() != null ? getHeightAttr().getValue() : null);
        attrs.put("src", getSrcAttr() != null ? getSrcAttr().getValue() : null);
        attrs.put("alt", getAltAttr() != null ? getAltAttr().getValue() : null);
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
    public Img html(String s) {
        super.html(s);
        return this;
    }
}

