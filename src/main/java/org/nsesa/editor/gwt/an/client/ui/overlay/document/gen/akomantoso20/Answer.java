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
 * the element answer is a container of a single official answer to a question
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Answer extends SpeechTypeComplexType {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new From(), new Occurrence(0, 1));
            put(new Foreign(), new Occurrence(0, -1));
            put(new Block(), new Occurrence(0, -1));
            put(new BlockList(), new Occurrence(0, -1));
            put(new Toc(), new Occurrence(0, -1));
            put(new Tblock(), new Occurrence(0, -1));
            put(new Ul(), new Occurrence(0, -1));
            put(new Ol(), new Occurrence(0, -1));
            put(new Table(), new Occurrence(0, -1));
            put(new P(), new Occurrence(0, -1));
            put(new Num(), new Occurrence(0, 1));
            put(new Heading(), new Occurrence(0, 1));
            put(new Subheading(), new Occurrence(0, 1));
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "answer");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget answer");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Answer</code> object and set up its type
     */
    public Answer() {
        super(create());
        setType("answer");
    }

    /**
     * Constructor with required attributes
     */
    public Answer(AnyURISimpleType byAttr) {
        this();
        setByAttr(byAttr);
    }


    /**
     * Create a <code>Answer</code> object with the given DOM element
     */
    public Answer(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>byAttr</code> property in DSL way
     *
     * @param byAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
    }

    /**
     * Set <code>asAttr</code> property in DSL way
     *
     * @param asAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
    }

    /**
     * Set <code>startTimeAttr</code> property in DSL way
     *
     * @param startTimeAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer startTimeAttr(final DateTimeSimpleType startTimeAttr) {
        setStartTimeAttr(startTimeAttr);
        return this;
    }

    /**
     * Set <code>endTimeAttr</code> property in DSL way
     *
     * @param endTimeAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer endTimeAttr(final DateTimeSimpleType endTimeAttr) {
        setEndTimeAttr(endTimeAttr);
        return this;
    }

    /**
     * Set <code>toAttr</code> property in DSL way
     *
     * @param toAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer toAttr(final AnyURISimpleType toAttr) {
        setToAttr(toAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> Answer</code> instance
     */
    public Answer periodAttr(final AnyURISimpleType periodAttr) {
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
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public Answer html(String s) {
        super.html(s);
        return this;
    }
}

