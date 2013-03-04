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
 * the element authorialNote is a popup element containing an authorial (non-editorial) note in the main flow of the text.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class AuthorialNote extends PopupStructureComplexType {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Intro(), new Occurrence(1, 1));
            put(new Wrap(), new Occurrence(1, 1));
            put(new Heading(), new Occurrence(1, 1));
            put(new Subheading(), new Occurrence(1, 1));
            put(new Content(), new Occurrence(1, 1));
            put(new Num(), new Occurrence(1, 1));
            put(new Recital(), new Occurrence(1, 1));
            put(new Citation(), new Occurrence(1, 1));
            put(new ComponentRef(), new Occurrence(1, 1));
            put(new Hcontainer(), new Occurrence(0, -1));
            put(new Foreign(), new Occurrence(0, -1));
            put(new Block(), new Occurrence(0, -1));
            put(new Container(), new Occurrence(0, -1));
            put(new Speech(), new Occurrence(0, -1));
            put(new Question(), new Occurrence(0, -1));
            put(new Answer(), new Occurrence(0, -1));
            put(new Other(), new Occurrence(0, -1));
            put(new Scene(), new Occurrence(0, -1));
            put(new Narrative(), new Occurrence(0, -1));
            put(new Summary(), new Occurrence(0, -1));
            put(new Clause(), new Occurrence(0, -1));
            put(new Section(), new Occurrence(0, -1));
            put(new Part(), new Occurrence(0, -1));
            put(new Paragraph(), new Occurrence(0, -1));
            put(new Chapter(), new Occurrence(0, -1));
            put(new Title(), new Occurrence(0, -1));
            put(new Article(), new Occurrence(0, -1));
            put(new Book(), new Occurrence(0, -1));
            put(new Tome(), new Occurrence(0, -1));
            put(new Division(), new Occurrence(0, -1));
            put(new List(), new Occurrence(0, -1));
            put(new Point(), new Occurrence(0, -1));
            put(new Indent(), new Occurrence(0, -1));
            put(new Alinea(), new Occurrence(0, -1));
            put(new Subsection(), new Occurrence(0, -1));
            put(new Subpart(), new Occurrence(0, -1));
            put(new Subparagraph(), new Occurrence(0, -1));
            put(new Subchapter(), new Occurrence(0, -1));
            put(new Subtitle(), new Occurrence(0, -1));
            put(new Subclause(), new Occurrence(0, -1));
            put(new Sublist(), new Occurrence(0, -1));
            put(new BlockList(), new Occurrence(0, -1));
            put(new Toc(), new Occurrence(0, -1));
            put(new Tblock(), new Occurrence(0, -1));
            put(new Ul(), new Occurrence(0, -1));
            put(new Ol(), new Occurrence(0, -1));
            put(new Table(), new Occurrence(0, -1));
            put(new P(), new Occurrence(0, -1));
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
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "authorialNote");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget authorialNote");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>AuthorialNote</code> object and set up its type
     */
    public AuthorialNote() {
        super(create());
        setType("authorialNote");
    }

    /**
     * Constructor with required attributes
     */
    public AuthorialNote(IDSimpleType idAttr) {
        this();
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>AuthorialNote</code> object with the given DOM element
     */
    public AuthorialNote(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private StringSimpleType markerAttr;
    private PlacementTypeSimpleType placementAttr;
    private AnyURISimpleType placementBaseAttr;

    /**
     * Return <code>markerAttr</code> property
     *
     * @return markerAttr
     */
    public StringSimpleType getMarkerAttr() {
        if (markerAttr == null) {
            markerAttr = new StringSimpleType();
            markerAttr.setValue(getElement().getAttribute("marker"));
        }

        return markerAttr;
    }

    /**
     * Return <code>markerAttr</code> property in DSL way
     *
     * @return markerAttr
     */
    public StringSimpleType markerAttr() {
        return getMarkerAttr();
    }

    /**
     * Set <code>markerAttr</code> property
     *
     * @param markerAttr the new value
     */
    public void setMarkerAttr(final StringSimpleType markerAttr) {
        this.markerAttr = markerAttr;
        getElement().setAttribute("marker", markerAttr.getValue());
    }

    /**
     * Set <code>markerAttr</code> property in DSL way
     *
     * @param markerAttr the new value
     * @return <code>AuthorialNote</code> instance
     */
    public AuthorialNote markerAttr(final StringSimpleType markerAttr) {
        setMarkerAttr(markerAttr);
        return this;
    }

    /**
     * Return <code>placementAttr</code> property
     *
     * @return placementAttr
     */
    public PlacementTypeSimpleType getPlacementAttr() {
        if (placementAttr == null) {
            placementAttr = PlacementTypeSimpleType.fromString(getElement().getAttribute("placement"));
        }

        return placementAttr;
    }

    /**
     * Return <code>placementAttr</code> property in DSL way
     *
     * @return placementAttr
     */
    public PlacementTypeSimpleType placementAttr() {
        return getPlacementAttr();
    }

    /**
     * Set <code>placementAttr</code> property
     *
     * @param placementAttr the new value
     */
    public void setPlacementAttr(final PlacementTypeSimpleType placementAttr) {
        this.placementAttr = placementAttr;
        getElement().setAttribute("placement", placementAttr.value());
    }

    /**
     * Set <code>placementAttr</code> property in DSL way
     *
     * @param placementAttr the new value
     * @return <code>AuthorialNote</code> instance
     */
    public AuthorialNote placementAttr(final PlacementTypeSimpleType placementAttr) {
        setPlacementAttr(placementAttr);
        return this;
    }

    /**
     * Return <code>placementBaseAttr</code> property
     *
     * @return placementBaseAttr
     */
    public AnyURISimpleType getPlacementBaseAttr() {
        if (placementBaseAttr == null) {
            placementBaseAttr = new AnyURISimpleType();
            placementBaseAttr.setValue(getElement().getAttribute("placementBase"));
        }

        return placementBaseAttr;
    }

    /**
     * Return <code>placementBaseAttr</code> property in DSL way
     *
     * @return placementBaseAttr
     */
    public AnyURISimpleType placementBaseAttr() {
        return getPlacementBaseAttr();
    }

    /**
     * Set <code>placementBaseAttr</code> property
     *
     * @param placementBaseAttr the new value
     */
    public void setPlacementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        this.placementBaseAttr = placementBaseAttr;
        getElement().setAttribute("placementBase", placementBaseAttr.getValue());
    }

    /**
     * Set <code>placementBaseAttr</code> property in DSL way
     *
     * @param placementBaseAttr the new value
     * @return <code>AuthorialNote</code> instance
     */
    public AuthorialNote placementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        setPlacementBaseAttr(placementBaseAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> AuthorialNote</code> instance
     */
    public AuthorialNote periodAttr(final AnyURISimpleType periodAttr) {
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
        attrs.put("marker", getMarkerAttr() != null ? getMarkerAttr().getValue() : null);
        attrs.put("placement", getPlacementAttr() != null ? getPlacementAttr().value() : null);
        attrs.put("placementBase", getPlacementBaseAttr() != null ? getPlacementBaseAttr().getValue() : null);
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public AuthorialNote html(String s) {
        super.html(s);
        return this;
    }
}

