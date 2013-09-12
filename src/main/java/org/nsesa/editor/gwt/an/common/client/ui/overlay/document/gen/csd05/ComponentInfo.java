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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Generated class
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class ComponentInfo extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(0, -1, new StructureIndicator.DefaultElement(1, 1, new ComponentData())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "componentInfo");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget componentInfo");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>ComponentInfo</code> object and set up its type
     */
    public ComponentInfo() {
        super(create());
        setType("componentInfo");
    }


    /**
     * Create a <code>ComponentInfo</code> object with the given DOM element
     */
    public ComponentInfo(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Return <code>java.util.List<ComponentData></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ComponentData> getComponentDatas() {
        java.util.List<ComponentData> result = new ArrayList<ComponentData>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ComponentData".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((ComponentData) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<ComponentData></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ComponentData> getComponentDataList() {
        return getComponentDatas();
    }

    /**
     * Add <code>java.util.List<ComponentData></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public ComponentData addComponentData(ComponentData componentDataElem) {
        this.addOverlayWidget(componentDataElem);
        return componentDataElem;
    }

//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
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
    public ComponentInfo html(String s) {
        super.html(s);
        return this;
    }
}

