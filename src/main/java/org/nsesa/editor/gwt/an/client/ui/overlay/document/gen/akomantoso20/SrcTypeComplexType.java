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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * the complex type srcType defines the empty content model and the list of attributes for manifestation-level references to external resources
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class SrcTypeComplexType extends OverlayWidgetImpl {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "srcTypeComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget srcTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>SrcTypeComplexType</code> object with the given DOM element
     */
    public SrcTypeComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType srcAttr;
    private StringSimpleType altAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private String wildcardContentAttr;

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
     * @return <code>SrcTypeComplexType</code> instance
     */
    public SrcTypeComplexType srcAttr(final AnyURISimpleType srcAttr) {
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
     * @return <code>SrcTypeComplexType</code> instance
     */
    public SrcTypeComplexType altAttr(final StringSimpleType altAttr) {
        setAltAttr(altAttr);
        return this;
    }

    /**
     * Return <code>idAttr</code> property
     *
     * @return idAttr
     */
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
    }

    /**
     * Return <code>idAttr</code> property in DSL way
     *
     * @return idAttr
     */
    public IDSimpleType idAttr() {
        return getIdAttr();
    }

    /**
     * Set <code>idAttr</code> property
     *
     * @param idAttr the new value
     */
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        getElement().setAttribute("id", idAttr.getValue());
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr the new value
     * @return <code>SrcTypeComplexType</code> instance
     */
    public SrcTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Return <code>evolvingIdAttr</code> property
     *
     * @return evolvingIdAttr
     */
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }

    /**
     * Return <code>evolvingIdAttr</code> property in DSL way
     *
     * @return evolvingIdAttr
     */
    public NMTOKENSimpleType evolvingIdAttr() {
        return getEvolvingIdAttr();
    }

    /**
     * Set <code>evolvingIdAttr</code> property
     *
     * @param evolvingIdAttr the new value
     */
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        getElement().setAttribute("evolvingId", evolvingIdAttr.getValue());
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr the new value
     * @return <code>SrcTypeComplexType</code> instance
     */
    public SrcTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

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
     * @return <code>SrcTypeComplexType</code> instance
     */
    public SrcTypeComplexType showAsAttr(final StringSimpleType showAsAttr) {
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
     * @return <code>SrcTypeComplexType</code> instance
     */
    public SrcTypeComplexType shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }

    /**
     * Return <code>wildcardContentAttr</code> property
     *
     * @return wildcardContentAttr
     */
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }

    /**
     * Return <code>wildcardContentAttr</code> property in DSL way
     *
     * @return wildcardContentAttr
     */
    public String wildcardContentAttr() {
        return getWildcardContentAttr();
    }

    /**
     * Set <code>wildcardContentAttr</code> property
     *
     * @param wildcardContentAttr the new value
     */
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        getElement().setAttribute("wildcardContent", wildcardContentAttr);
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr the new value
     * @return <code>SrcTypeComplexType</code> instance
     */
    public SrcTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

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
        attrs.put("src", getSrcAttr() != null ? getSrcAttr().getValue() : null);
        attrs.put("alt", getAltAttr() != null ? getAltAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("showAs", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortForm", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public SrcTypeComplexType html(String s) {
        super.html(s);
        return this;
    }
}

