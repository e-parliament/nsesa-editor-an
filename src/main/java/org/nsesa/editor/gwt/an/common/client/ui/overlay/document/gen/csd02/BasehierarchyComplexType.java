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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The complex type basehierarchy is not used by any element, but is derived by other types to contain<br/> the basic structure of hierarchical elements
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class BasehierarchyComplexType extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(0, 1, new Num())
                    , new StructureIndicator.DefaultElement(0, 1, new Heading())
                    , new StructureIndicator.DefaultElement(0, 1, new Subheading())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "basehierarchyComplexType");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget basehierarchyComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>BasehierarchyComplexType</code> object with the given DOM element
     */
    public BasehierarchyComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Add <code>Num</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Num getNum() {
        Num result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Num".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Num) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>numElem</code> property in DSL way
     *
     * @param numElem new value
     * @return <code>Num</code> instance
     */
    public Num setNum(Num numElem) {
        Num result = getNum();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(numElem);

        return numElem;
    }

    /**
     * Add <code>Heading</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Heading getHeading() {
        Heading result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Heading".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Heading) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>headingElem</code> property in DSL way
     *
     * @param headingElem new value
     * @return <code>Heading</code> instance
     */
    public Heading setHeading(Heading headingElem) {
        Heading result = getHeading();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(headingElem);

        return headingElem;
    }

    /**
     * Add <code>Subheading</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subheading getSubheading() {
        Subheading result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subheading".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Subheading) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>subheadingElem</code> property in DSL way
     *
     * @param subheadingElem new value
     * @return <code>Subheading</code> instance
     */
    public Subheading setSubheading(Subheading subheadingElem) {
        Subheading result = getSubheading();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(subheadingElem);

        return subheadingElem;
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
    public BasehierarchyComplexType html(String s) {
        super.html(s);
        return this;
    }
}

