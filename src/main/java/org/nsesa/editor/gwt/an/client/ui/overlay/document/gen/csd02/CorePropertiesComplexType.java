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
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.FRBRthis;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.FRBRuri;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.FRBRalias;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.FRBRdate;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.FRBRauthor;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.ComponentInfo;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.Preservation;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* The complexType coreProperties lists the identifying properties available at any of the FRBR hierarchy levels.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class CorePropertiesComplexType extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new FRBRthis())
,        new StructureIndicator.DefaultElement(1,-1,new FRBRuri())
,        new StructureIndicator.DefaultElement(0,-1,new FRBRalias())
,        new StructureIndicator.DefaultElement(1,-1,new FRBRdate())
,        new StructureIndicator.DefaultElement(1,-1,new FRBRauthor())
,        new StructureIndicator.DefaultElement(0,1,new ComponentInfo())
,        new StructureIndicator.DefaultElement(0,1,new Preservation())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "corePropertiesComplexType");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget corePropertiesComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>CorePropertiesComplexType</code> object with the given DOM element
*/
public CorePropertiesComplexType(Element element) {
super(element);
}

// FIELDS ------------------

            /**
            * Add <code>FRBRthis</code> property in the list of properties
            * @return The property as unmodifiable list
            */
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
            /**
            * Set <code>FRBRthisElem</code> property in DSL way
            * @param FRBRthisElem new value
            * @return <code>FRBRthis</code> instance
            */
            public FRBRthis setFRBRthis(FRBRthis FRBRthisElem) {
                    FRBRthis result = getFRBRthis();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(FRBRthisElem);

                return FRBRthisElem;
            }
            /**
            * Return <code>java.util.List<FRBRuri></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<FRBRuri> getFRBRuris() {
                java.util.List<FRBRuri> result = new ArrayList<FRBRuri>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRuri".equalsIgnoreCase(widget.getType())) {
            result.add((FRBRuri)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<FRBRuri></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<FRBRuri> getFRBRuriList() {
            return  getFRBRuris();
            }
            /**
            * Add <code>java.util.List<FRBRuri></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public FRBRuri addFRBRuri(FRBRuri FRBRuriElem) {
                this.addOverlayWidget(FRBRuriElem);
                return FRBRuriElem;
            }

            /**
            * Return <code>java.util.List<FRBRalias></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<FRBRalias> getFRBRaliases() {
                java.util.List<FRBRalias> result = new ArrayList<FRBRalias>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRalias".equalsIgnoreCase(widget.getType())) {
            result.add((FRBRalias)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<FRBRalias></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<FRBRalias> getFRBRaliasList() {
            return  getFRBRaliases();
            }
            /**
            * Add <code>java.util.List<FRBRalias></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public FRBRalias addFRBRalias(FRBRalias FRBRaliasElem) {
                this.addOverlayWidget(FRBRaliasElem);
                return FRBRaliasElem;
            }

            /**
            * Return <code>java.util.List<FRBRdate></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<FRBRdate> getFRBRdates() {
                java.util.List<FRBRdate> result = new ArrayList<FRBRdate>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRdate".equalsIgnoreCase(widget.getType())) {
            result.add((FRBRdate)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<FRBRdate></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<FRBRdate> getFRBRdateList() {
            return  getFRBRdates();
            }
            /**
            * Add <code>java.util.List<FRBRdate></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public FRBRdate addFRBRdate(FRBRdate FRBRdateElem) {
                this.addOverlayWidget(FRBRdateElem);
                return FRBRdateElem;
            }

            /**
            * Return <code>java.util.List<FRBRauthor></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<FRBRauthor> getFRBRauthors() {
                java.util.List<FRBRauthor> result = new ArrayList<FRBRauthor>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRauthor".equalsIgnoreCase(widget.getType())) {
            result.add((FRBRauthor)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<FRBRauthor></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<FRBRauthor> getFRBRauthorList() {
            return  getFRBRauthors();
            }
            /**
            * Add <code>java.util.List<FRBRauthor></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public FRBRauthor addFRBRauthor(FRBRauthor FRBRauthorElem) {
                this.addOverlayWidget(FRBRauthorElem);
                return FRBRauthorElem;
            }

            /**
            * Add <code>ComponentInfo</code> property in the list of properties
            * @return The property as unmodifiable list
            */
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
            /**
            * Set <code>componentInfoElem</code> property in DSL way
            * @param componentInfoElem new value
            * @return <code>ComponentInfo</code> instance
            */
            public ComponentInfo setComponentInfo(ComponentInfo componentInfoElem) {
                    ComponentInfo result = getComponentInfo();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(componentInfoElem);

                return componentInfoElem;
            }
            /**
            * Add <code>Preservation</code> property in the list of properties
            * @return The property as unmodifiable list
            */
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
            /**
            * Set <code>preservationElem</code> property in DSL way
            * @param preservationElem new value
            * @return <code>Preservation</code> instance
            */
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
* Returns the namespace URI of this amendable widget.
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
public CorePropertiesComplexType html(String s) {
    super.html(s);
    return this;
}
}

