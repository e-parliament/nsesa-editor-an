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

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DurationSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;

import java.util.ArrayList;
import java.util.Arrays;

import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;

import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gwt.user.client.DOM;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class TimeInterval extends MetaoptComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "timeInterval");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget timeInterval");
        return span;
    }

    // CONSTRUCTORS ------------------
    public TimeInterval() {
        super(create());
        setType("timeInterval");
    }

    public TimeInterval(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType startAttr;
    private AnyURISimpleType endAttr;
    private DurationSimpleType durationAttr;
    private AnyURISimpleType refersToAttr;

    public AnyURISimpleType getStartAttr() {
        if (startAttr == null) {
            startAttr = new AnyURISimpleType();
            startAttr.setValue(getElement().getAttribute("start"));
        }

        return startAttr;
    }

    //DSL Style get value
    public AnyURISimpleType startAttr() {
        return getStartAttr();
    }

    public void setStartAttr(final AnyURISimpleType startAttr) {
        this.startAttr = startAttr;
        getElement().setAttribute("start", startAttr.getValue());
    }

    //DSL Style set value
    public TimeInterval startAttr(final AnyURISimpleType startAttr) {
        setStartAttr(startAttr);
        return this;
    }

    public AnyURISimpleType getEndAttr() {
        if (endAttr == null) {
            endAttr = new AnyURISimpleType();
            endAttr.setValue(getElement().getAttribute("end"));
        }

        return endAttr;
    }

    //DSL Style get value
    public AnyURISimpleType endAttr() {
        return getEndAttr();
    }

    public void setEndAttr(final AnyURISimpleType endAttr) {
        this.endAttr = endAttr;
        getElement().setAttribute("end", endAttr.getValue());
    }

    //DSL Style set value
    public TimeInterval endAttr(final AnyURISimpleType endAttr) {
        setEndAttr(endAttr);
        return this;
    }

    public DurationSimpleType getDurationAttr() {
        if (durationAttr == null) {
            durationAttr = new DurationSimpleType();
            durationAttr.setValue(getElement().getAttribute("duration"));
        }

        return durationAttr;
    }

    //DSL Style get value
    public DurationSimpleType durationAttr() {
        return getDurationAttr();
    }

    public void setDurationAttr(final DurationSimpleType durationAttr) {
        this.durationAttr = durationAttr;
        getElement().setAttribute("duration", durationAttr.getValue());
    }

    //DSL Style set value
    public TimeInterval durationAttr(final DurationSimpleType durationAttr) {
        setDurationAttr(durationAttr);
        return this;
    }

    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo", refersToAttr.getValue());
    }

    //DSL Style set value
    public TimeInterval refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public TimeInterval idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    //DSL Style set value
    public TimeInterval evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    //DSL Style set value
    public TimeInterval wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
        attrs.put("start", getStartAttr() != null ? getStartAttr().getValue() : null);
        attrs.put("end", getEndAttr() != null ? getEndAttr().getValue() : null);
        attrs.put("duration", getDurationAttr() != null ? getDurationAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        return attrs;
    }
}

