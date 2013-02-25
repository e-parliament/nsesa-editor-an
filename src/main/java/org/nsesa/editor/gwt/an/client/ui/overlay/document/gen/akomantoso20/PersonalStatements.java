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

public class PersonalStatements extends AlthierarchyComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new ComponentRef(), new Occurrence(1, 1));
            put(new Container(), new Occurrence(0, -1));
            put(new Speech(), new Occurrence(0, -1));
            put(new Question(), new Occurrence(0, -1));
            put(new Answer(), new Occurrence(0, -1));
            put(new Other(), new Occurrence(0, -1));
            put(new Scene(), new Occurrence(0, -1));
            put(new Narrative(), new Occurrence(0, -1));
            put(new Summary(), new Occurrence(0, -1));
            put(new Foreign(), new Occurrence(0, -1));
            put(new Block(), new Occurrence(0, -1));
            put(new AdministrationOfOath(), new Occurrence(0, -1));
            put(new RollCall(), new Occurrence(0, -1));
            put(new Prayers(), new Occurrence(0, -1));
            put(new OralStatements(), new Occurrence(0, -1));
            put(new WrittenStatements(), new Occurrence(0, -1));
            put(new PersonalStatements(), new Occurrence(0, -1));
            put(new MinisterialStatements(), new Occurrence(0, -1));
            put(new Resolutions(), new Occurrence(0, -1));
            put(new NationalInterest(), new Occurrence(0, -1));
            put(new DeclarationOfVote(), new Occurrence(0, -1));
            put(new Communication(), new Occurrence(0, -1));
            put(new Petitions(), new Occurrence(0, -1));
            put(new Papers(), new Occurrence(0, -1));
            put(new NoticesOfMotion(), new Occurrence(0, -1));
            put(new Questions(), new Occurrence(0, -1));
            put(new Address(), new Occurrence(0, -1));
            put(new ProceduralMotions(), new Occurrence(0, -1));
            put(new PointOfOrder(), new Occurrence(0, -1));
            put(new Adjournment(), new Occurrence(0, -1));
            put(new DebateSection(), new Occurrence(0, -1));
            put(new Div(), new Occurrence(0, -1));
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


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "personalStatements");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget personalStatements");
        return span;
    }

    // CONSTRUCTORS ------------------
    public PersonalStatements() {
        super(create());
        setType("personalStatements");
    }

    //Constructor with the required attributes
    public PersonalStatements(IDSimpleType idAttr) {
        this();
        setIdAttr(idAttr);
    }


    public PersonalStatements(Element element) {
        super(element);
    }

// FIELDS ------------------

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public PersonalStatements refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    //DSL Style set value
    public PersonalStatements periodAttr(final AnyURISimpleType periodAttr) {
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

    //DSL Style for html method
    @Override
    public PersonalStatements html(String s) {
        super.html(s);
        return this;
    }
}

