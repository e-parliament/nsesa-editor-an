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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.TextualMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.MeaningMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ScopeMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ForceMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.EfficacyMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.LegalSystemMod;
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
* The complex type Amendments is a list of all the amendment elements that can be used on a document analysis
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class AmendmentsComplexType extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,-1,        new StructureIndicator.DefaultElement(1,1,new TextualMod())
,        new StructureIndicator.DefaultElement(1,1,new MeaningMod())
,        new StructureIndicator.DefaultElement(1,1,new ScopeMod())
,        new StructureIndicator.DefaultElement(1,1,new ForceMod())
,        new StructureIndicator.DefaultElement(1,1,new EfficacyMod())
,        new StructureIndicator.DefaultElement(1,1,new LegalSystemMod())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "AmendmentsComplexType");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget AmendmentsComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>AmendmentsComplexType</code> object with the given DOM element
*/
public AmendmentsComplexType(Element element) {
super(element);
}

// FIELDS ------------------

            /**
            * Return <code>java.util.List<TextualMod></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<TextualMod> getTextualMods() {
                java.util.List<TextualMod> result = new ArrayList<TextualMod>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TextualMod".equalsIgnoreCase(widget.getType())) {
            result.add((TextualMod)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<TextualMod></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<TextualMod> getTextualModList() {
            return  getTextualMods();
            }
            /**
            * Add <code>java.util.List<TextualMod></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public TextualMod addTextualMod(TextualMod textualModElem) {
                this.addOverlayWidget(textualModElem);
                return textualModElem;
            }

            /**
            * Return <code>java.util.List<MeaningMod></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<MeaningMod> getMeaningMods() {
                java.util.List<MeaningMod> result = new ArrayList<MeaningMod>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("MeaningMod".equalsIgnoreCase(widget.getType())) {
            result.add((MeaningMod)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<MeaningMod></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<MeaningMod> getMeaningModList() {
            return  getMeaningMods();
            }
            /**
            * Add <code>java.util.List<MeaningMod></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public MeaningMod addMeaningMod(MeaningMod meaningModElem) {
                this.addOverlayWidget(meaningModElem);
                return meaningModElem;
            }

            /**
            * Return <code>java.util.List<ScopeMod></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<ScopeMod> getScopeMods() {
                java.util.List<ScopeMod> result = new ArrayList<ScopeMod>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ScopeMod".equalsIgnoreCase(widget.getType())) {
            result.add((ScopeMod)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<ScopeMod></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<ScopeMod> getScopeModList() {
            return  getScopeMods();
            }
            /**
            * Add <code>java.util.List<ScopeMod></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public ScopeMod addScopeMod(ScopeMod scopeModElem) {
                this.addOverlayWidget(scopeModElem);
                return scopeModElem;
            }

            /**
            * Return <code>java.util.List<ForceMod></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<ForceMod> getForceMods() {
                java.util.List<ForceMod> result = new ArrayList<ForceMod>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ForceMod".equalsIgnoreCase(widget.getType())) {
            result.add((ForceMod)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<ForceMod></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<ForceMod> getForceModList() {
            return  getForceMods();
            }
            /**
            * Add <code>java.util.List<ForceMod></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public ForceMod addForceMod(ForceMod forceModElem) {
                this.addOverlayWidget(forceModElem);
                return forceModElem;
            }

            /**
            * Return <code>java.util.List<EfficacyMod></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<EfficacyMod> getEfficacyMods() {
                java.util.List<EfficacyMod> result = new ArrayList<EfficacyMod>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("EfficacyMod".equalsIgnoreCase(widget.getType())) {
            result.add((EfficacyMod)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<EfficacyMod></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<EfficacyMod> getEfficacyModList() {
            return  getEfficacyMods();
            }
            /**
            * Add <code>java.util.List<EfficacyMod></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public EfficacyMod addEfficacyMod(EfficacyMod efficacyModElem) {
                this.addOverlayWidget(efficacyModElem);
                return efficacyModElem;
            }

            /**
            * Return <code>java.util.List<LegalSystemMod></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<LegalSystemMod> getLegalSystemMods() {
                java.util.List<LegalSystemMod> result = new ArrayList<LegalSystemMod>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("LegalSystemMod".equalsIgnoreCase(widget.getType())) {
            result.add((LegalSystemMod)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<LegalSystemMod></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<LegalSystemMod> getLegalSystemModList() {
            return  getLegalSystemMods();
            }
            /**
            * Add <code>java.util.List<LegalSystemMod></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public LegalSystemMod addLegalSystemMod(LegalSystemMod legalSystemModElem) {
                this.addOverlayWidget(legalSystemModElem);
                return legalSystemModElem;
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
public AmendmentsComplexType html(String s) {
    super.html(s);
    return this;
}
}

