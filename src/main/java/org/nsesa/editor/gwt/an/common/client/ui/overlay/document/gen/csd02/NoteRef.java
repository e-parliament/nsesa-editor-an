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
 * the element noteRef is a reference to a editorial note placed in the notes metadata section
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class NoteRef extends MarkeroptComplexType {

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
        span.setAttribute("type", "noteRef");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget noteRef");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>NoteRef</code> object and set up its type
     */
    public NoteRef() {
        super(create());
        setType("noteRef");
    }

    /**
     * Constructor with required attributes
     */
    public NoteRef(AnyURISimpleType hrefAttr) {
        this();
        setHrefAttr(hrefAttr);
    }


    /**
     * Create a <code>NoteRef</code> object with the given DOM element
     */
    public NoteRef(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private StringSimpleType markerAttr;
    private PlacementTypeSimpleType placementAttr;
    private AnyURISimpleType placementBaseAttr;
    private AnyURISimpleType hrefAttr;

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
     * @return <code>NoteRef</code> instance
     */
    public NoteRef markerAttr(final StringSimpleType markerAttr) {
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
     * @return <code>NoteRef</code> instance
     */
    public NoteRef placementAttr(final PlacementTypeSimpleType placementAttr) {
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
     * @return <code>NoteRef</code> instance
     */
    public NoteRef placementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        setPlacementBaseAttr(placementBaseAttr);
        return this;
    }

    /**
     * Return <code>hrefAttr</code> property
     *
     * @return hrefAttr
     */
    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(getElement().getAttribute("href"));
        }

        return hrefAttr;
    }

    /**
     * Return <code>hrefAttr</code> property in DSL way
     *
     * @return hrefAttr
     */
    public AnyURISimpleType hrefAttr() {
        return getHrefAttr();
    }

    /**
     * Set <code>hrefAttr</code> property
     *
     * @param hrefAttr the new value
     */
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
        getElement().setAttribute("href", hrefAttr.getValue());
    }

    /**
     * Set <code>hrefAttr</code> property in DSL way
     *
     * @param hrefAttr the new value
     * @return <code>NoteRef</code> instance
     */
    public NoteRef hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>spaceAttr</code> property in DSL way
     *
     * @param spaceAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> NoteRef</code> instance
     */
    public NoteRef periodAttr(final AnyURISimpleType periodAttr) {
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
        attrs.put("marker", getMarkerAttr() != null ? getMarkerAttr().getValue() : null);
        attrs.put("placement", getPlacementAttr() != null ? getPlacementAttr().value() : null);
        attrs.put("placementBase", getPlacementBaseAttr() != null ? getPlacementBaseAttr().getValue() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
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
    public NoteRef html(String s) {
        super.html(s);
        return this;
    }
}

