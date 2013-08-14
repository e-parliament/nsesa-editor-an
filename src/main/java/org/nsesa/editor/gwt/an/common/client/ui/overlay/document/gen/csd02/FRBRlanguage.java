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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The element FRBRlanguage is the metadata property containing a RFC4646 (three-letter code) of the<br/> main human language used in the content of this expression
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class FRBRlanguage extends MetaoptComplexType {

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
        span.setAttribute("type", "FRBRlanguage");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget FRBRlanguage");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>FRBRlanguage</code> object and set up its type
     */
    public FRBRlanguage() {
        super(create());
        setType("FRBRlanguage");
    }

    /**
     * Constructor with required attributes
     */
    public FRBRlanguage(LanguageSimpleType languageAttr) {
        this();
        setLanguageAttr(languageAttr);
    }


    /**
     * Create a <code>FRBRlanguage</code> object with the given DOM element
     */
    public FRBRlanguage(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private LanguageSimpleType languageAttr;

    /**
     * Return <code>languageAttr</code> property
     *
     * @return languageAttr
     */
    public LanguageSimpleType getLanguageAttr() {
        if (languageAttr == null) {
            languageAttr = new LanguageSimpleType();
            languageAttr.setValue(getElement().getAttribute("language"));
        }

        return languageAttr;
    }

    /**
     * Return <code>languageAttr</code> property in DSL way
     *
     * @return languageAttr
     */
    public LanguageSimpleType languageAttr() {
        return getLanguageAttr();
    }

    /**
     * Set <code>languageAttr</code> property
     *
     * @param languageAttr the new value
     */
    public void setLanguageAttr(final LanguageSimpleType languageAttr) {
        this.languageAttr = languageAttr;
        getElement().setAttribute("language", languageAttr.getValue());
    }

    /**
     * Set <code>languageAttr</code> property in DSL way
     *
     * @param languageAttr the new value
     * @return <code>FRBRlanguage</code> instance
     */
    public FRBRlanguage languageAttr(final LanguageSimpleType languageAttr) {
        setLanguageAttr(languageAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> FRBRlanguage</code> instance
     */
    public FRBRlanguage wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> FRBRlanguage</code> instance
     */
    public FRBRlanguage idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> FRBRlanguage</code> instance
     */
    public FRBRlanguage evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
        attrs.put("language", getLanguageAttr() != null ? getLanguageAttr().getValue() : null);
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
    public FRBRlanguage html(String s) {
        super.html(s);
        return this;
    }
}

