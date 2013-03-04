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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Generated class
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Identification extends OverlayWidgetImpl {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new FRBRWork(), new Occurrence(1, 1));
            put(new FRBRExpression(), new Occurrence(1, 1));
            put(new FRBRManifestation(), new Occurrence(1, 1));
            put(new FRBRItem(), new Occurrence(0, 1));
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "identification");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget identification");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Identification</code> object and set up its type
     */
    public Identification() {
        super(create());
        setType("identification");
    }

    /**
     * Constructor with required attributes
     */
    public Identification(AnyURISimpleType sourceAttr) {
        this();
        setSourceAttr(sourceAttr);
    }


    /**
     * Create a <code>Identification</code> object with the given DOM element
     */
    public Identification(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType sourceAttr;

    /**
     * Add <code>FRBRWork</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRWork getFRBRWork() {
        FRBRWork result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRWork".equalsIgnoreCase(widget.getType())) {
                result = (FRBRWork) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>FRBRWorkElem</code> property in DSL way
     *
     * @param FRBRWorkElem new value
     * @return <code>FRBRWork</code> instance
     */
    public FRBRWork setFRBRWork(FRBRWork FRBRWorkElem) {
        FRBRWork result = getFRBRWork();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRWorkElem);

        return FRBRWorkElem;
    }

    /**
     * Add <code>FRBRExpression</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRExpression getFRBRExpression() {
        FRBRExpression result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRExpression".equalsIgnoreCase(widget.getType())) {
                result = (FRBRExpression) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>FRBRExpressionElem</code> property in DSL way
     *
     * @param FRBRExpressionElem new value
     * @return <code>FRBRExpression</code> instance
     */
    public FRBRExpression setFRBRExpression(FRBRExpression FRBRExpressionElem) {
        FRBRExpression result = getFRBRExpression();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRExpressionElem);

        return FRBRExpressionElem;
    }

    /**
     * Add <code>FRBRManifestation</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRManifestation getFRBRManifestation() {
        FRBRManifestation result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRManifestation".equalsIgnoreCase(widget.getType())) {
                result = (FRBRManifestation) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>FRBRManifestationElem</code> property in DSL way
     *
     * @param FRBRManifestationElem new value
     * @return <code>FRBRManifestation</code> instance
     */
    public FRBRManifestation setFRBRManifestation(FRBRManifestation FRBRManifestationElem) {
        FRBRManifestation result = getFRBRManifestation();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRManifestationElem);

        return FRBRManifestationElem;
    }

    /**
     * Add <code>FRBRItem</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRItem getFRBRItem() {
        FRBRItem result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRItem".equalsIgnoreCase(widget.getType())) {
                result = (FRBRItem) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>FRBRItemElem</code> property in DSL way
     *
     * @param FRBRItemElem new value
     * @return <code>FRBRItem</code> instance
     */
    public FRBRItem setFRBRItem(FRBRItem FRBRItemElem) {
        FRBRItem result = getFRBRItem();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRItemElem);

        return FRBRItemElem;
    }

    /**
     * Return <code>sourceAttr</code> property
     *
     * @return sourceAttr
     */
    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
    }

    /**
     * Return <code>sourceAttr</code> property in DSL way
     *
     * @return sourceAttr
     */
    public AnyURISimpleType sourceAttr() {
        return getSourceAttr();
    }

    /**
     * Set <code>sourceAttr</code> property
     *
     * @param sourceAttr the new value
     */
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source", sourceAttr.getValue());
    }

    /**
     * Set <code>sourceAttr</code> property in DSL way
     *
     * @param sourceAttr the new value
     * @return <code>Identification</code> instance
     */
    public Identification sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public Identification html(String s) {
        super.html(s);
        return this;
    }
}

