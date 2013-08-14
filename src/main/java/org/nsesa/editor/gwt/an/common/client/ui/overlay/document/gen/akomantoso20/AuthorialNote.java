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
 * the element authorialNote is a popup element containing an authorial (non-editorial) note in<br/> the main flow of the text.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class AuthorialNote extends PopupStructureComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultChoice(1, -1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Clause())
                    , new StructureIndicator.DefaultElement(1, 1, new Section())
                    , new StructureIndicator.DefaultElement(1, 1, new Part())
                    , new StructureIndicator.DefaultElement(1, 1, new Paragraph())
                    , new StructureIndicator.DefaultElement(1, 1, new Chapter())
                    , new StructureIndicator.DefaultElement(1, 1, new Title())
                    , new StructureIndicator.DefaultElement(1, 1, new Article())
                    , new StructureIndicator.DefaultElement(1, 1, new Book())
                    , new StructureIndicator.DefaultElement(1, 1, new Tome())
                    , new StructureIndicator.DefaultElement(1, 1, new Division())
                    , new StructureIndicator.DefaultElement(1, 1, new List())
                    , new StructureIndicator.DefaultElement(1, 1, new Point())
                    , new StructureIndicator.DefaultElement(1, 1, new Indent())
                    , new StructureIndicator.DefaultElement(1, 1, new Alinea())
                    , new StructureIndicator.DefaultElement(1, 1, new Subsection())
                    , new StructureIndicator.DefaultElement(1, 1, new Subpart())
                    , new StructureIndicator.DefaultElement(1, 1, new Subparagraph())
                    , new StructureIndicator.DefaultElement(1, 1, new Subchapter())
                    , new StructureIndicator.DefaultElement(1, 1, new Subtitle())
                    , new StructureIndicator.DefaultElement(1, 1, new Subclause())
                    , new StructureIndicator.DefaultElement(1, 1, new Sublist())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Hcontainer())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new BlockList())
                    , new StructureIndicator.DefaultElement(1, 1, new Toc())
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
                    , new StructureIndicator.DefaultElement(1, 1, new Intro())
                    , new StructureIndicator.DefaultElement(1, 1, new Wrap())
                    , new StructureIndicator.DefaultElement(1, 1, new Heading())
                    , new StructureIndicator.DefaultElement(1, 1, new Subheading())
                    , new StructureIndicator.DefaultElement(1, 1, new Content())
                    , new StructureIndicator.DefaultElement(1, 1, new Num())
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new AdministrationOfOath())
                    , new StructureIndicator.DefaultElement(1, 1, new RollCall())
                    , new StructureIndicator.DefaultElement(1, 1, new Prayers())
                    , new StructureIndicator.DefaultElement(1, 1, new OralStatements())
                    , new StructureIndicator.DefaultElement(1, 1, new WrittenStatements())
                    , new StructureIndicator.DefaultElement(1, 1, new PersonalStatements())
                    , new StructureIndicator.DefaultElement(1, 1, new MinisterialStatements())
                    , new StructureIndicator.DefaultElement(1, 1, new Resolutions())
                    , new StructureIndicator.DefaultElement(1, 1, new NationalInterest())
                    , new StructureIndicator.DefaultElement(1, 1, new DeclarationOfVote())
                    , new StructureIndicator.DefaultElement(1, 1, new Communication())
                    , new StructureIndicator.DefaultElement(1, 1, new Petitions())
                    , new StructureIndicator.DefaultElement(1, 1, new Papers())
                    , new StructureIndicator.DefaultElement(1, 1, new NoticesOfMotion())
                    , new StructureIndicator.DefaultElement(1, 1, new Questions())
                    , new StructureIndicator.DefaultElement(1, 1, new Address())
                    , new StructureIndicator.DefaultElement(1, 1, new ProceduralMotions())
                    , new StructureIndicator.DefaultElement(1, 1, new PointOfOrder())
                    , new StructureIndicator.DefaultElement(1, 1, new Adjournment())
                    , new StructureIndicator.DefaultElement(1, 1, new DebateSection())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new Div())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Container())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Speech())
                    , new StructureIndicator.DefaultElement(1, 1, new Question())
                    , new StructureIndicator.DefaultElement(1, 1, new Answer())
                    , new StructureIndicator.DefaultElement(1, 1, new Other())
                    , new StructureIndicator.DefaultElement(1, 1, new Scene())
                    , new StructureIndicator.DefaultElement(1, 1, new Narrative())
                    , new StructureIndicator.DefaultElement(1, 1, new Summary())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Recital())
                    , new StructureIndicator.DefaultElement(1, 1, new Citation())
                    , new StructureIndicator.DefaultElement(1, 1, new ComponentRef())
            )

    );


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

    @Override
    public StructureIndicator getStructureIndicator() {
        return STRUCTURE_INDICATOR;
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

