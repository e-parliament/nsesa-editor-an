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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The element textualMod is a metadata element specifying an (active or passive) textual modification for the document.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class TextualMod extends ModificationTypeComplexType {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Old(), new Occurrence(0, 1));
            put(new New(), new Occurrence(0, 1));
            put(new Source(), new Occurrence(1, -1));
            put(new Destination(), new Occurrence(1, -1));
            put(new Force(), new Occurrence(0, 1));
            put(new Efficacy(), new Occurrence(0, 1));
            put(new Application(), new Occurrence(0, 1));
            put(new Duration(), new Occurrence(0, 1));
            put(new Condition(), new Occurrence(0, 1));
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "textualMod");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget textualMod");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>TextualMod</code> object and set up its type
     */
    public TextualMod() {
        super(create());
        setType("textualMod");
    }

    /**
     * Constructor with required attributes
     */
    public TextualMod(TextualModsSimpleType typeAttr, IDSimpleType idAttr) {
        this();
        setTypeAttr(typeAttr);
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>TextualMod</code> object with the given DOM element
     */
    public TextualMod(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private TextualModsSimpleType typeAttr;

    /**
     * Return <code>typeAttr</code> property
     *
     * @return typeAttr
     */
    public TextualModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = TextualModsSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
    }

    /**
     * Return <code>typeAttr</code> property in DSL way
     *
     * @return typeAttr
     */
    public TextualModsSimpleType typeAttr() {
        return getTypeAttr();
    }

    /**
     * Set <code>typeAttr</code> property
     *
     * @param typeAttr the new value
     */
    public void setTypeAttr(final TextualModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
        getElement().setAttribute("type", typeAttr.value());
    }

    /**
     * Set <code>typeAttr</code> property in DSL way
     *
     * @param typeAttr the new value
     * @return <code>TextualMod</code> instance
     */
    public TextualMod typeAttr(final TextualModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }

    /**
     * Add <code>Old</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Old getOld() {
        Old result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Old".equalsIgnoreCase(widget.getType())) {
                result = (Old) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>oldElem</code> property in DSL way
     *
     * @param oldElem new value
     * @return <code>Old</code> instance
     */
    public Old setOld(Old oldElem) {
        Old result = getOld();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(oldElem);

        return oldElem;
    }

    /**
     * Add <code>New</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public New getNew() {
        New result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("New".equalsIgnoreCase(widget.getType())) {
                result = (New) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>newElem</code> property in DSL way
     *
     * @param newElem new value
     * @return <code>New</code> instance
     */
    public New setNew(New newElem) {
        New result = getNew();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(newElem);

        return newElem;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> TextualMod</code> instance
     */
    public TextualMod refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> TextualMod</code> instance
     */
    public TextualMod wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> TextualMod</code> instance
     */
    public TextualMod idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> TextualMod</code> instance
     */
    public TextualMod evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>exclusionAttr</code> property in DSL way
     *
     * @param exclusionAttr new value
     * @return <code> TextualMod</code> instance
     */
    public TextualMod exclusionAttr(final BooleanSimpleType exclusionAttr) {
        setExclusionAttr(exclusionAttr);
        return this;
    }

    /**
     * Set <code>incompleteAttr</code> property in DSL way
     *
     * @param incompleteAttr new value
     * @return <code> TextualMod</code> instance
     */
    public TextualMod incompleteAttr(final BooleanSimpleType incompleteAttr) {
        setIncompleteAttr(incompleteAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> TextualMod</code> instance
     */
    public TextualMod statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> TextualMod</code> instance
     */
    public TextualMod periodAttr(final AnyURISimpleType periodAttr) {
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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public TextualMod html(String s) {
        super.html(s);
        return this;
    }
}

