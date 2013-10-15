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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * The element FRBRExpression is the metadata container of identifying properties related to the Expression level according to the FRBR hierarchy
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class FRBRExpression extends CorePropertiesComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(0, 1, new FRBRauthoritative())
                    , new StructureIndicator.DefaultElement(1, -1, new FRBRlanguage())
                    , new StructureIndicator.DefaultElement(0, -1, new FRBRtranslation())
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
        span.setAttribute("data-type", "FRBRExpression");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget FRBRExpression");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>FRBRExpression</code> object and set up its type
     */
    public FRBRExpression() {
        super(create());
        setType("FRBRExpression");
    }


    /**
     * Create a <code>FRBRExpression</code> object with the given DOM element
     */
    public FRBRExpression(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Add <code>FRBRauthoritative</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRauthoritative getFRBRauthoritative() {
        FRBRauthoritative result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRauthoritative".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (FRBRauthoritative) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>FRBRauthoritativeElem</code> property in DSL way
     *
     * @param FRBRauthoritativeElem new value
     * @return <code>FRBRauthoritative</code> instance
     */
    public FRBRauthoritative setFRBRauthoritative(FRBRauthoritative FRBRauthoritativeElem) {
        FRBRauthoritative result = getFRBRauthoritative();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRauthoritativeElem);

        return FRBRauthoritativeElem;
    }

    /**
     * Return <code>java.util.List<FRBRlanguage></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<FRBRlanguage> getFRBRlanguages() {
        java.util.List<FRBRlanguage> result = new ArrayList<FRBRlanguage>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRlanguage".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((FRBRlanguage) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<FRBRlanguage></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<FRBRlanguage> getFRBRlanguageList() {
        return getFRBRlanguages();
    }

    /**
     * Add <code>java.util.List<FRBRlanguage></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRlanguage addFRBRlanguage(FRBRlanguage FRBRlanguageElem) {
        this.addOverlayWidget(FRBRlanguageElem);
        return FRBRlanguageElem;
    }

    /**
     * Return <code>java.util.List<FRBRtranslation></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<FRBRtranslation> getFRBRtranslations() {
        java.util.List<FRBRtranslation> result = new ArrayList<FRBRtranslation>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRtranslation".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((FRBRtranslation) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<FRBRtranslation></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<FRBRtranslation> getFRBRtranslationList() {
        return getFRBRtranslations();
    }

    /**
     * Add <code>java.util.List<FRBRtranslation></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FRBRtranslation addFRBRtranslation(FRBRtranslation FRBRtranslationElem) {
        this.addOverlayWidget(FRBRtranslationElem);
        return FRBRtranslationElem;
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
    public FRBRExpression html(String s) {
        super.html(s);
        return this;
    }
}

