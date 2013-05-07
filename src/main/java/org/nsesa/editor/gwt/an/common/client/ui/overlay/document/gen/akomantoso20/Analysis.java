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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ActiveModifications;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.PassiveModifications;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Judicial;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Parliamentary;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.OtherAnalysis;
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
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Analysis extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new ActiveModifications())
,        new StructureIndicator.DefaultElement(0,1,new PassiveModifications())
,        new StructureIndicator.DefaultElement(0,1,new Judicial())
,        new StructureIndicator.DefaultElement(0,1,new Parliamentary())
,        new StructureIndicator.DefaultElement(0,-1,new OtherAnalysis())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "analysis");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget analysis");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Analysis</code> object and set up its type
*/
public Analysis() {
super(create());
setType("analysis");
}

/**
* Constructor with required attributes
*/
public Analysis(AnyURISimpleType sourceAttr) {
this();
setSourceAttr(sourceAttr);
}


/**
* Create a <code>Analysis</code> object with the given DOM element
*/
public Analysis(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;

        /**
        * Return <code>sourceAttr</code> property
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
        * @return sourceAttr
        */
        public AnyURISimpleType sourceAttr() {
        return  getSourceAttr();
        }
        /**
        * Set <code>sourceAttr</code> property
        * @param sourceAttr the new value
        */
        public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source",sourceAttr.getValue());
        }
        /**
        * Set <code>sourceAttr</code> property in DSL way
        * @param sourceAttr the new value
        * @return <code>Analysis</code> instance
        */
        public Analysis sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
        }
            /**
            * Add <code>ActiveModifications</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public ActiveModifications getActiveModifications() {
                ActiveModifications result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ActiveModifications".equalsIgnoreCase(widget.getType())) {
            result = (ActiveModifications)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>activeModificationsElem</code> property in DSL way
            * @param activeModificationsElem new value
            * @return <code>ActiveModifications</code> instance
            */
            public ActiveModifications setActiveModifications(ActiveModifications activeModificationsElem) {
                    ActiveModifications result = getActiveModifications();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(activeModificationsElem);

                return activeModificationsElem;
            }
            /**
            * Add <code>PassiveModifications</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public PassiveModifications getPassiveModifications() {
                PassiveModifications result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PassiveModifications".equalsIgnoreCase(widget.getType())) {
            result = (PassiveModifications)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>passiveModificationsElem</code> property in DSL way
            * @param passiveModificationsElem new value
            * @return <code>PassiveModifications</code> instance
            */
            public PassiveModifications setPassiveModifications(PassiveModifications passiveModificationsElem) {
                    PassiveModifications result = getPassiveModifications();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(passiveModificationsElem);

                return passiveModificationsElem;
            }
            /**
            * Add <code>Judicial</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Judicial getJudicial() {
                Judicial result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Judicial".equalsIgnoreCase(widget.getType())) {
            result = (Judicial)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>judicialElem</code> property in DSL way
            * @param judicialElem new value
            * @return <code>Judicial</code> instance
            */
            public Judicial setJudicial(Judicial judicialElem) {
                    Judicial result = getJudicial();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(judicialElem);

                return judicialElem;
            }
            /**
            * Add <code>Parliamentary</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Parliamentary getParliamentary() {
                Parliamentary result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Parliamentary".equalsIgnoreCase(widget.getType())) {
            result = (Parliamentary)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>parliamentaryElem</code> property in DSL way
            * @param parliamentaryElem new value
            * @return <code>Parliamentary</code> instance
            */
            public Parliamentary setParliamentary(Parliamentary parliamentaryElem) {
                    Parliamentary result = getParliamentary();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(parliamentaryElem);

                return parliamentaryElem;
            }
            /**
            * Return <code>java.util.List<OtherAnalysis></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<OtherAnalysis> getOtherAnalysises() {
                java.util.List<OtherAnalysis> result = new ArrayList<OtherAnalysis>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OtherAnalysis".equalsIgnoreCase(widget.getType())) {
            result.add((OtherAnalysis)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<OtherAnalysis></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<OtherAnalysis> getOtherAnalysisList() {
            return  getOtherAnalysises();
            }
            /**
            * Add <code>java.util.List<OtherAnalysis></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public OtherAnalysis addOtherAnalysis(OtherAnalysis otherAnalysisElem) {
                this.addOverlayWidget(otherAnalysisElem);
                return otherAnalysisElem;
            }

//Override all attributes methods to be conformant with DSL approach

/**
* Returns the namespace URI of this amendable widget.
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

@Override
public StructureIndicator getStructureIndicator() {
    return STRUCTURE_INDICATOR;
}

/**
* DSL Style for html method
*/
@Override
public Analysis html(String s) {
    super.html(s);
    return this;
}
}

