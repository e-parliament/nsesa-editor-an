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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class EventRef extends AnyOtherTypeComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(null, new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "eventRef");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget eventRef");
        return span;
    }

    // CONSTRUCTORS ------------------
    public EventRef() {
        super(create());
        setType("eventRef");
    }

    public EventRef(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private EventTypeSimpleType typeAttr;
    private YesNoTypeSimpleType originatingExpressionAttr;
    private DateSimpleType dateAttr;
    private AnyURISimpleType sourceAttr;

    public EventTypeSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = EventTypeSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
    }

    //DSL Style get value
    public EventTypeSimpleType typeAttr() {
        return getTypeAttr();
    }

    public void setTypeAttr(final EventTypeSimpleType typeAttr) {
        this.typeAttr = typeAttr;
        getElement().setAttribute("type", typeAttr.value());
    }

    //DSL Style set value
    public EventRef typeAttr(final EventTypeSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }

    public YesNoTypeSimpleType getOriginatingExpressionAttr() {
        if (originatingExpressionAttr == null) {
            originatingExpressionAttr = YesNoTypeSimpleType.fromString(getElement().getAttribute("originatingExpression"));
        }

        return originatingExpressionAttr;
    }

    //DSL Style get value
    public YesNoTypeSimpleType originatingExpressionAttr() {
        return getOriginatingExpressionAttr();
    }

    public void setOriginatingExpressionAttr(final YesNoTypeSimpleType originatingExpressionAttr) {
        this.originatingExpressionAttr = originatingExpressionAttr;
        getElement().setAttribute("originatingExpression", originatingExpressionAttr.value());
    }

    //DSL Style set value
    public EventRef originatingExpressionAttr(final YesNoTypeSimpleType originatingExpressionAttr) {
        setOriginatingExpressionAttr(originatingExpressionAttr);
        return this;
    }

    public DateSimpleType getDateAttr() {
        if (dateAttr == null) {
            dateAttr = new DateSimpleType();
            dateAttr.setValue(getElement().getAttribute("date"));
        }

        return dateAttr;
    }

    //DSL Style get value
    public DateSimpleType dateAttr() {
        return getDateAttr();
    }

    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
        getElement().setAttribute("date", dateAttr.getValue());
    }

    //DSL Style set value
    public EventRef dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
    }

    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
    }

    //DSL Style get value
    public AnyURISimpleType sourceAttr() {
        return getSourceAttr();
    }

    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source", sourceAttr.getValue());
    }

    //DSL Style set value
    public EventRef sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public EventRef hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }

    //DSL Style set value
    public EventRef wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    //DSL Style set value
    public EventRef idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    //DSL Style set value
    public EventRef evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        attrs.put("originatingExpression", getOriginatingExpressionAttr() != null ? getOriginatingExpressionAttr().value() : null);
        attrs.put("date", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }
}

