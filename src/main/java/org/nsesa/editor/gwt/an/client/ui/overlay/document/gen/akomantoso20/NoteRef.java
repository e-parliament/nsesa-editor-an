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

public class NoteRef extends MarkeroptComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "noteRef");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget noteRef");
        return span;
    }

    // CONSTRUCTORS ------------------
    public NoteRef() {
        super(create());
        setType("noteRef");
    }

    public NoteRef(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private StringSimpleType markerAttr;
    private PlacementTypeSimpleType placementAttr;
    private AnyURISimpleType placementBaseAttr;
    private AnyURISimpleType hrefAttr;

    public StringSimpleType getMarkerAttr() {
        if (markerAttr == null) {
            markerAttr = new StringSimpleType();
            markerAttr.setValue(getElement().getAttribute("marker"));
        }

        return markerAttr;
    }

    //DSL Style get value
    public StringSimpleType markerAttr() {
        return getMarkerAttr();
    }

    public void setMarkerAttr(final StringSimpleType markerAttr) {
        this.markerAttr = markerAttr;
        getElement().setAttribute("marker", markerAttr.getValue());
    }

    //DSL Style set value
    public NoteRef markerAttr(final StringSimpleType markerAttr) {
        setMarkerAttr(markerAttr);
        return this;
    }

    public PlacementTypeSimpleType getPlacementAttr() {
        if (placementAttr == null) {
            placementAttr = PlacementTypeSimpleType.fromString(getElement().getAttribute("placement"));
        }

        return placementAttr;
    }

    //DSL Style get value
    public PlacementTypeSimpleType placementAttr() {
        return getPlacementAttr();
    }

    public void setPlacementAttr(final PlacementTypeSimpleType placementAttr) {
        this.placementAttr = placementAttr;
        getElement().setAttribute("placement", placementAttr.value());
    }

    //DSL Style set value
    public NoteRef placementAttr(final PlacementTypeSimpleType placementAttr) {
        setPlacementAttr(placementAttr);
        return this;
    }

    public AnyURISimpleType getPlacementBaseAttr() {
        if (placementBaseAttr == null) {
            placementBaseAttr = new AnyURISimpleType();
            placementBaseAttr.setValue(getElement().getAttribute("placementBase"));
        }

        return placementBaseAttr;
    }

    //DSL Style get value
    public AnyURISimpleType placementBaseAttr() {
        return getPlacementBaseAttr();
    }

    public void setPlacementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        this.placementBaseAttr = placementBaseAttr;
        getElement().setAttribute("placementBase", placementBaseAttr.getValue());
    }

    //DSL Style set value
    public NoteRef placementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        setPlacementBaseAttr(placementBaseAttr);
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
    public NoteRef hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public NoteRef idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    //DSL Style set value
    public NoteRef periodAttr(final AnyURISimpleType periodAttr) {
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
        attrs.put("marker", getMarkerAttr() != null ? getMarkerAttr().getValue() : null);
        attrs.put("placement", getPlacementAttr() != null ? getPlacementAttr().value() : null);
        attrs.put("placementBase", getPlacementBaseAttr() != null ? getPlacementBaseAttr().getValue() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        return attrs;
    }

    //DSL Style for html method
    @Override
    public NoteRef html(String s) {
        super.html(s);
        return this;
    }
}

