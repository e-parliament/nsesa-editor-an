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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class FRBRtranslation extends MetaoptComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "FRBRtranslation");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget FRBRtranslation");
        return span;
    }

    // CONSTRUCTORS ------------------
    public FRBRtranslation() {
        super(create());
        setType("FRBRtranslation");
    }

    public FRBRtranslation(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private LanguageSimpleType fromLanguageAttr;
    private YesNoTypeSimpleType authoritativeAttr;
    private LanguageSimpleType pivotAttr;
    private AnyURISimpleType byAttr;
    private AnyURISimpleType hrefAttr;

    public LanguageSimpleType getFromLanguageAttr() {
        if (fromLanguageAttr == null) {
            fromLanguageAttr = new LanguageSimpleType();
            fromLanguageAttr.setValue(getElement().getAttribute("fromLanguage"));
        }

        return fromLanguageAttr;
    }

    //DSL Style get value
    public LanguageSimpleType fromLanguageAttr() {
        return getFromLanguageAttr();
    }

    public void setFromLanguageAttr(final LanguageSimpleType fromLanguageAttr) {
        this.fromLanguageAttr = fromLanguageAttr;
        getElement().setAttribute("fromLanguage", fromLanguageAttr.getValue());
    }

    //DSL Style set value
    public FRBRtranslation fromLanguageAttr(final LanguageSimpleType fromLanguageAttr) {
        setFromLanguageAttr(fromLanguageAttr);
        return this;
    }

    public YesNoTypeSimpleType getAuthoritativeAttr() {
        if (authoritativeAttr == null) {
            authoritativeAttr = YesNoTypeSimpleType.fromString(getElement().getAttribute("authoritative"));
        }

        return authoritativeAttr;
    }

    //DSL Style get value
    public YesNoTypeSimpleType authoritativeAttr() {
        return getAuthoritativeAttr();
    }

    public void setAuthoritativeAttr(final YesNoTypeSimpleType authoritativeAttr) {
        this.authoritativeAttr = authoritativeAttr;
        getElement().setAttribute("authoritative", authoritativeAttr.value());
    }

    //DSL Style set value
    public FRBRtranslation authoritativeAttr(final YesNoTypeSimpleType authoritativeAttr) {
        setAuthoritativeAttr(authoritativeAttr);
        return this;
    }

    public LanguageSimpleType getPivotAttr() {
        if (pivotAttr == null) {
            pivotAttr = new LanguageSimpleType();
            pivotAttr.setValue(getElement().getAttribute("pivot"));
        }

        return pivotAttr;
    }

    //DSL Style get value
    public LanguageSimpleType pivotAttr() {
        return getPivotAttr();
    }

    public void setPivotAttr(final LanguageSimpleType pivotAttr) {
        this.pivotAttr = pivotAttr;
        getElement().setAttribute("pivot", pivotAttr.getValue());
    }

    //DSL Style set value
    public FRBRtranslation pivotAttr(final LanguageSimpleType pivotAttr) {
        setPivotAttr(pivotAttr);
        return this;
    }

    public AnyURISimpleType getByAttr() {
        if (byAttr == null) {
            byAttr = new AnyURISimpleType();
            byAttr.setValue(getElement().getAttribute("by"));
        }

        return byAttr;
    }

    //DSL Style get value
    public AnyURISimpleType byAttr() {
        return getByAttr();
    }

    public void setByAttr(final AnyURISimpleType byAttr) {
        this.byAttr = byAttr;
        getElement().setAttribute("by", byAttr.getValue());
    }

    //DSL Style set value
    public FRBRtranslation byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
    }

    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(getElement().getAttribute("href"));
        }

        return hrefAttr;
    }

    //DSL Style get value
    public AnyURISimpleType hrefAttr() {
        return getHrefAttr();
    }

    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
        getElement().setAttribute("href", hrefAttr.getValue());
    }

    //DSL Style set value
    public FRBRtranslation hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public FRBRtranslation wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    //DSL Style set value
    public FRBRtranslation idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    //DSL Style set value
    public FRBRtranslation evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
        attrs.put("fromLanguage", getFromLanguageAttr() != null ? getFromLanguageAttr().getValue() : null);
        attrs.put("authoritative", getAuthoritativeAttr() != null ? getAuthoritativeAttr().value() : null);
        attrs.put("pivot", getPivotAttr() != null ? getPivotAttr().getValue() : null);
        attrs.put("by", getByAttr() != null ? getByAttr().getValue() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        return attrs;
    }
}

