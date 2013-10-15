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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Generated class
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Workflow extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, -1, new Step())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "workflow");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget workflow");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Workflow</code> object and set up its type
     */
    public Workflow() {
        super(create());
        setType("workflow");
    }

    /**
     * Constructor with required attributes
     */
    public Workflow(AnyURISimpleType sourceAttr) {
        this();
        setSourceAttr(sourceAttr);
    }


    /**
     * Create a <code>Workflow</code> object with the given DOM element
     */
    public Workflow(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType sourceAttr;

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
     * @return <code>Workflow</code> instance
     */
    public Workflow sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }

    /**
     * Return <code>java.util.List<Step></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Step> getSteps() {
        java.util.List<Step> result = new ArrayList<Step>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Step".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Step) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Step></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Step> getStepList() {
        return getSteps();
    }

    /**
     * Add <code>java.util.List<Step></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Step addStep(Step stepElem) {
        this.addOverlayWidget(stepElem);
        return stepElem;
    }

//Override all attributes methods to be conformant with DSL approach

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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
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
    public Workflow html(String s) {
        super.html(s);
        return this;
    }
}

