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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The element div is an HTML element, but is NOT used in Akoma Ntoso as in HTML. Instead of being used<br/> as a generic block, Akoma Ntoso uses div as a generic container (as in common practice)
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Div extends BlocksreqComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(0, -1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new BlockList())
                    , new StructureIndicator.DefaultElement(1, 1, new Tblock())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Ul())
                    , new StructureIndicator.DefaultElement(1, 1, new Ol())
                    , new StructureIndicator.DefaultElement(1, 1, new Table())
                    , new StructureIndicator.DefaultElement(1, 1, new P())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Foreign())
                    , new StructureIndicator.DefaultElement(1, 1, new Block())
            )
            )
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "div");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget div");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Div</code> object and set up its type
     */
    public Div() {
        super(create());
        setType("div");
    }

    /**
     * Constructor with required attributes
     */
    public Div(IDSimpleType idAttr) {
        this();
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>Div</code> object with the given DOM element
     */
    public Div(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> Div</code> instance
     */
    public Div refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> Div</code> instance
     */
    public Div idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> Div</code> instance
     */
    public Div evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> Div</code> instance
     */
    public Div classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> Div</code> instance
     */
    public Div styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> Div</code> instance
     */
    public Div titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> Div</code> instance
     */
    public Div langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>spaceAttr</code> property in DSL way
     *
     * @param spaceAttr new value
     * @return <code> Div</code> instance
     */
    public Div spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> Div</code> instance
     */
    public Div statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> Div</code> instance
     */
    public Div alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> Div</code> instance
     */
    public Div wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> Div</code> instance
     */
    public Div periodAttr(final AnyURISimpleType periodAttr) {
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
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
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
    public Div html(String s) {
        super.html(s);
        return this;
    }
}

