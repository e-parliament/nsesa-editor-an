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

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;

import java.util.ArrayList;
import java.util.Arrays;

import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;

import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gwt.user.client.DOM;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Keyword extends MetaoptComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "keyword");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget keyword");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Keyword() {
        super(create());
        setType("keyword");
    }

    public Keyword(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType dictionaryAttr;
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private StringSimpleType valueAttr;

    public AnyURISimpleType getDictionaryAttr() {
        if (dictionaryAttr == null) {
            dictionaryAttr = new AnyURISimpleType();
            dictionaryAttr.setValue(getElement().getAttribute("dictionary"));
        }

        return dictionaryAttr;
    }

    //DSL Style get value
    public AnyURISimpleType dictionaryAttr() {
        return getDictionaryAttr();
    }

    public void setDictionaryAttr(final AnyURISimpleType dictionaryAttr) {
        this.dictionaryAttr = dictionaryAttr;
        getElement().setAttribute("dictionary", dictionaryAttr.getValue());
    }

    //DSL Style set value
    public Keyword dictionaryAttr(final AnyURISimpleType dictionaryAttr) {
        setDictionaryAttr(dictionaryAttr);
        return this;
    }

    public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
            showAsAttr = new StringSimpleType();
            showAsAttr.setValue(getElement().getAttribute("showAs"));
        }

        return showAsAttr;
    }

    //DSL Style get value
    public StringSimpleType showAsAttr() {
        return getShowAsAttr();
    }

    public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
        getElement().setAttribute("showAs", showAsAttr.getValue());
    }

    //DSL Style set value
    public Keyword showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
    }

    public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
            shortFormAttr = new StringSimpleType();
            shortFormAttr.setValue(getElement().getAttribute("shortForm"));
        }

        return shortFormAttr;
    }

    //DSL Style get value
    public StringSimpleType shortFormAttr() {
        return getShortFormAttr();
    }

    public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
        getElement().setAttribute("shortForm", shortFormAttr.getValue());
    }

    //DSL Style set value
    public Keyword shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }

    public StringSimpleType getValueAttr() {
        if (valueAttr == null) {
            valueAttr = new StringSimpleType();
            valueAttr.setValue(getElement().getAttribute("value"));
        }

        return valueAttr;
    }

    //DSL Style get value
    public StringSimpleType valueAttr() {
        return getValueAttr();
    }

    public void setValueAttr(final StringSimpleType valueAttr) {
        this.valueAttr = valueAttr;
        getElement().setAttribute("value", valueAttr.getValue());
    }

    //DSL Style set value
    public Keyword valueAttr(final StringSimpleType valueAttr) {
        setValueAttr(valueAttr);
        return this;
    }

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public Keyword idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    //DSL Style set value
    public Keyword evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    //DSL Style set value
    public Keyword wildcardContentAttr(final String wildcardContentAttr) {
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
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("dictionary", getDictionaryAttr() != null ? getDictionaryAttr().getValue() : null);
        attrs.put("showAs", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortForm", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        attrs.put("value", getValueAttr() != null ? getValueAttr().getValue() : null);
        return attrs;
    }
}

