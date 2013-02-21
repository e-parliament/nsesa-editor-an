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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Eol extends EolTypeComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "eol");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget eol");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Eol() {
        super(create());
        setType("eol");
    }

    public Eol(Element element) {
        super(element);
    }

// FIELDS ------------------

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public Eol breakatAttr(final IntegerSimpleType breakatAttr) {
        setBreakatAttr(breakatAttr);
        return this;
    }

    //DSL Style set value
    public Eol refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    //DSL Style set value
    public Eol idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    //DSL Style set value
    public Eol evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    //DSL Style set value
    public Eol langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    //DSL Style set value
    public Eol alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    //DSL Style set value
    public Eol classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    //DSL Style set value
    public Eol styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    //DSL Style set value
    public Eol titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    //DSL Style set value
    public Eol statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    //DSL Style set value
    public Eol wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    //DSL Style set value
    public Eol periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
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
        return attrs;
    }
}

