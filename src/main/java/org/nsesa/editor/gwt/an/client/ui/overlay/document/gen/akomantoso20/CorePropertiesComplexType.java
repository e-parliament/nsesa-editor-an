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
import java.util.ArrayList;

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

public class CorePropertiesComplexType extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new FRBRthis(), new Occurrence(1,1));
            put(new FRBRuri(), new Occurrence(1,-1));
            put(new FRBRalias(), new Occurrence(0,-1));
            put(new FRBRdate(), new Occurrence(1,-1));
            put(new FRBRauthor(), new Occurrence(1,-1));
            put(new ComponentInfo(), new Occurrence(0,1));
            put(new Preservation(), new Occurrence(0,1));
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "corePropertiesComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget corePropertiesComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public CorePropertiesComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------

    public FRBRthis getFRBRthis() {
        FRBRthis result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRthis".equalsIgnoreCase(widget.getType())) {
                result = (FRBRthis)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRthis setFRBRthis(FRBRthis FRBRthisElem) {
        FRBRthis result = getFRBRthis();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(FRBRthisElem);

        return FRBRthisElem;
    }
    public java.util.List<FRBRuri> getFRBRuris() {
        java.util.List<FRBRuri> result = new ArrayList<FRBRuri>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRuri".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRuri)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<FRBRuri> getFRBRuriList() {
        return  getFRBRuris();
    }
     //DSL Style set value
    public FRBRuri addFRBRuri(FRBRuri FRBRuriElem) {
        this.addOverlayWidget(FRBRuriElem);
        return FRBRuriElem;
    }

    public java.util.List<FRBRalias> getFRBRaliases() {
        java.util.List<FRBRalias> result = new ArrayList<FRBRalias>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRalias".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRalias)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<FRBRalias> getFRBRaliasList() {
        return  getFRBRaliases();
    }
     //DSL Style set value
    public FRBRalias addFRBRalias(FRBRalias FRBRaliasElem) {
        this.addOverlayWidget(FRBRaliasElem);
        return FRBRaliasElem;
    }

    public java.util.List<FRBRdate> getFRBRdates() {
        java.util.List<FRBRdate> result = new ArrayList<FRBRdate>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRdate".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRdate)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<FRBRdate> getFRBRdateList() {
        return  getFRBRdates();
    }
     //DSL Style set value
    public FRBRdate addFRBRdate(FRBRdate FRBRdateElem) {
        this.addOverlayWidget(FRBRdateElem);
        return FRBRdateElem;
    }

    public java.util.List<FRBRauthor> getFRBRauthors() {
        java.util.List<FRBRauthor> result = new ArrayList<FRBRauthor>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRauthor".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRauthor)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<FRBRauthor> getFRBRauthorList() {
        return  getFRBRauthors();
    }
     //DSL Style set value
    public FRBRauthor addFRBRauthor(FRBRauthor FRBRauthorElem) {
        this.addOverlayWidget(FRBRauthorElem);
        return FRBRauthorElem;
    }

    public ComponentInfo getComponentInfo() {
        ComponentInfo result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ComponentInfo".equalsIgnoreCase(widget.getType())) {
                result = (ComponentInfo)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public ComponentInfo setComponentInfo(ComponentInfo componentInfoElem) {
        ComponentInfo result = getComponentInfo();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(componentInfoElem);

        return componentInfoElem;
    }
    public Preservation getPreservation() {
        Preservation result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Preservation".equalsIgnoreCase(widget.getType())) {
                result = (Preservation)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public Preservation setPreservation(Preservation preservationElem) {
        Preservation result = getPreservation();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(preservationElem);

        return preservationElem;
    }
    //Override all attributes methods to be conformant with DSL approach

    /**
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
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

