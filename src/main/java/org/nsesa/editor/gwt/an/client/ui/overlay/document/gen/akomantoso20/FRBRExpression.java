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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class FRBRExpression extends CorePropertiesComplexType {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new FRBRlanguage(), new Occurrence(0, -1));
            put(new FRBRtranslation(), new Occurrence(0, -1));
            put(new FRBRthis(), new Occurrence(1, 1));
            put(new FRBRuri(), new Occurrence(1, -1));
            put(new FRBRalias(), new Occurrence(0, -1));
            put(new FRBRdate(), new Occurrence(1, -1));
            put(new FRBRauthor(), new Occurrence(1, -1));
            put(new ComponentInfo(), new Occurrence(0, 1));
            put(new Preservation(), new Occurrence(0, 1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "FRBRExpression");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget FRBRExpression");
        return span;
    }

    // CONSTRUCTORS ------------------
    public FRBRExpression() {
        super(create());
        setType("FRBRExpression");
    }

    public FRBRExpression(Element element) {
        super(element);
    }

// FIELDS ------------------

    public java.util.List<FRBRlanguage> getFRBRlanguages() {
        java.util.List<FRBRlanguage> result = new ArrayList<FRBRlanguage>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRlanguage".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRlanguage) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<FRBRlanguage> getFRBRlanguageList() {
        return getFRBRlanguages();
    }

    //DSL Style set value
    public FRBRlanguage addFRBRlanguage(FRBRlanguage FRBRlanguageElem) {
        this.addOverlayWidget(FRBRlanguageElem);
        return FRBRlanguageElem;
    }

    public java.util.List<FRBRtranslation> getFRBRtranslations() {
        java.util.List<FRBRtranslation> result = new ArrayList<FRBRtranslation>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRtranslation".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRtranslation) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<FRBRtranslation> getFRBRtranslationList() {
        return getFRBRtranslations();
    }

    //DSL Style set value
    public FRBRtranslation addFRBRtranslation(FRBRtranslation FRBRtranslationElem) {
        this.addOverlayWidget(FRBRtranslationElem);
        return FRBRtranslationElem;
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
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }
}

