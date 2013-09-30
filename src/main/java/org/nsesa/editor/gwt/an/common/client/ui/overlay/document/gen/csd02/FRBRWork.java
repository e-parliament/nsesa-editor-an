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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The element FRBRWork is the metadata container of identifying properties related to the Work level<br/> according to the FRBR hierarchy
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class FRBRWork extends CorePropertiesComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new FRBRcountry())
                    , new StructureIndicator.DefaultElement(0, 1, new FRBRsubtype())
                    , new StructureIndicator.DefaultElement(0, 1, new FRBRnumber())
                    , new StructureIndicator.DefaultElement(0, 1, new FRBRname())
            )
            )
            )
            ,

            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new FRBRthis())
                    , new StructureIndicator.DefaultElement(1, -1, new FRBRuri())
                    , new StructureIndicator.DefaultElement(0, -1, new FRBRalias())
                    , new StructureIndicator.DefaultElement(1, -1, new FRBRdate())
                    , new StructureIndicator.DefaultElement(1, -1, new FRBRauthor())
                    , new StructureIndicator.DefaultElement(0, 1, new ComponentInfo())
                    , new StructureIndicator.DefaultElement(0, 1, new Preservation())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "FRBRWork");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget FRBRWork");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>FRBRWork</code> object and set up its type
     */
    public FRBRWork() {
        super(create());
        setType("FRBRWork");
    }


    /**
     * Create a <code>FRBRWork</code> object with the given DOM element
     */
    public FRBRWork(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Add <code>FRBRcountry</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRcountry getFRBRcountry() {
        FRBRcountry result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRcountry".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (FRBRcountry) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>FRBRcountryElem</code> property in DSL way
     *
     * @param FRBRcountryElem new value
     * @return <code>FRBRcountry</code> instance
     */
    public FRBRcountry setFRBRcountry(FRBRcountry FRBRcountryElem) {
        FRBRcountry result = getFRBRcountry();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRcountryElem);

        return FRBRcountryElem;
    }

    /**
     * Add <code>FRBRname</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRname getFRBRname() {
        FRBRname result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRname".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (FRBRname) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>FRBRnameElem</code> property in DSL way
     *
     * @param FRBRnameElem new value
     * @return <code>FRBRname</code> instance
     */
    public FRBRname setFRBRname(FRBRname FRBRnameElem) {
        FRBRname result = getFRBRname();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRnameElem);

        return FRBRnameElem;
    }

    /**
     * Add <code>FRBRnumber</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRnumber getFRBRnumber() {
        FRBRnumber result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRnumber".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (FRBRnumber) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>FRBRnumberElem</code> property in DSL way
     *
     * @param FRBRnumberElem new value
     * @return <code>FRBRnumber</code> instance
     */
    public FRBRnumber setFRBRnumber(FRBRnumber FRBRnumberElem) {
        FRBRnumber result = getFRBRnumber();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRnumberElem);

        return FRBRnumberElem;
    }

    /**
     * Add <code>FRBRsubtype</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRsubtype getFRBRsubtype() {
        FRBRsubtype result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRsubtype".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (FRBRsubtype) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>FRBRsubtypeElem</code> property in DSL way
     *
     * @param FRBRsubtypeElem new value
     * @return <code>FRBRsubtype</code> instance
     */
    public FRBRsubtype setFRBRsubtype(FRBRsubtype FRBRsubtypeElem) {
        FRBRsubtype result = getFRBRsubtype();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRsubtypeElem);

        return FRBRsubtypeElem;
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
    public FRBRWork html(String s) {
        super.html(s);
        return this;
    }
}

