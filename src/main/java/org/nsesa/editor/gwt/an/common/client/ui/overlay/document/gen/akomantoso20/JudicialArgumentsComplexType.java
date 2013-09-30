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

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * The complex type judicialArguments is a list of all the judicial analysis elements that can be<br/> used on the analysis of a judgement
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class JudicialArgumentsComplexType extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new Result())
                    , new StructureIndicator.DefaultChoice(1, -1, new StructureIndicator.DefaultElement(1, 1, new Supports())
                    , new StructureIndicator.DefaultElement(1, 1, new IsAnalogTo())
                    , new StructureIndicator.DefaultElement(1, 1, new Applies())
                    , new StructureIndicator.DefaultElement(1, 1, new Extends())
                    , new StructureIndicator.DefaultElement(1, 1, new Restricts())
                    , new StructureIndicator.DefaultElement(1, 1, new Derogates())
                    , new StructureIndicator.DefaultElement(1, 1, new Contrasts())
                    , new StructureIndicator.DefaultElement(1, 1, new Overrules())
                    , new StructureIndicator.DefaultElement(1, 1, new DissentsFrom())
                    , new StructureIndicator.DefaultElement(1, 1, new PutsInQuestion())
                    , new StructureIndicator.DefaultElement(1, 1, new Distinguishes())
            )
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "judicialArgumentsComplexType");
        span.setAttribute("data-ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget judicialArgumentsComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>JudicialArgumentsComplexType</code> object with the given DOM element
     */
    public JudicialArgumentsComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Add <code>Result</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Result getResult() {
        Result result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Result".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Result) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>resultElem</code> property in DSL way
     *
     * @param resultElem new value
     * @return <code>Result</code> instance
     */
    public Result setResult(Result resultElem) {
        Result result = getResult();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(resultElem);

        return resultElem;
    }

    /**
     * Return <code>java.util.List<Supports></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Supports> getSupportses() {
        java.util.List<Supports> result = new ArrayList<Supports>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Supports".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Supports) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Supports></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Supports> getSupportsList() {
        return getSupportses();
    }

    /**
     * Add <code>java.util.List<Supports></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Supports addSupports(Supports supportsElem) {
        this.addOverlayWidget(supportsElem);
        return supportsElem;
    }

    /**
     * Return <code>java.util.List<IsAnalogTo></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<IsAnalogTo> getIsAnalogTos() {
        java.util.List<IsAnalogTo> result = new ArrayList<IsAnalogTo>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("IsAnalogTo".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((IsAnalogTo) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<IsAnalogTo></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<IsAnalogTo> getIsAnalogToList() {
        return getIsAnalogTos();
    }

    /**
     * Add <code>java.util.List<IsAnalogTo></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public IsAnalogTo addIsAnalogTo(IsAnalogTo isAnalogToElem) {
        this.addOverlayWidget(isAnalogToElem);
        return isAnalogToElem;
    }

    /**
     * Return <code>java.util.List<Applies></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Applies> getApplieses() {
        java.util.List<Applies> result = new ArrayList<Applies>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Applies".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Applies) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Applies></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Applies> getAppliesList() {
        return getApplieses();
    }

    /**
     * Add <code>java.util.List<Applies></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Applies addApplies(Applies appliesElem) {
        this.addOverlayWidget(appliesElem);
        return appliesElem;
    }

    /**
     * Return <code>java.util.List<Extends></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Extends> getExtend_s() {
        java.util.List<Extends> result = new ArrayList<Extends>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Extends".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Extends) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Extends></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Extends> getExtend_List() {
        return getExtend_s();
    }

    /**
     * Add <code>java.util.List<Extends></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Extends addExtend_(Extends extend_Elem) {
        this.addOverlayWidget(extend_Elem);
        return extend_Elem;
    }

    /**
     * Return <code>java.util.List<Restricts></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Restricts> getRestrictses() {
        java.util.List<Restricts> result = new ArrayList<Restricts>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Restricts".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Restricts) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Restricts></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Restricts> getRestrictsList() {
        return getRestrictses();
    }

    /**
     * Add <code>java.util.List<Restricts></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Restricts addRestricts(Restricts restrictsElem) {
        this.addOverlayWidget(restrictsElem);
        return restrictsElem;
    }

    /**
     * Return <code>java.util.List<Derogates></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Derogates> getDerogateses() {
        java.util.List<Derogates> result = new ArrayList<Derogates>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Derogates".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Derogates) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Derogates></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Derogates> getDerogatesList() {
        return getDerogateses();
    }

    /**
     * Add <code>java.util.List<Derogates></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Derogates addDerogates(Derogates derogatesElem) {
        this.addOverlayWidget(derogatesElem);
        return derogatesElem;
    }

    /**
     * Return <code>java.util.List<Contrasts></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Contrasts> getContrastses() {
        java.util.List<Contrasts> result = new ArrayList<Contrasts>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Contrasts".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Contrasts) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Contrasts></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Contrasts> getContrastsList() {
        return getContrastses();
    }

    /**
     * Add <code>java.util.List<Contrasts></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Contrasts addContrasts(Contrasts contrastsElem) {
        this.addOverlayWidget(contrastsElem);
        return contrastsElem;
    }

    /**
     * Return <code>java.util.List<Overrules></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Overrules> getOverruleses() {
        java.util.List<Overrules> result = new ArrayList<Overrules>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Overrules".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Overrules) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Overrules></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Overrules> getOverrulesList() {
        return getOverruleses();
    }

    /**
     * Add <code>java.util.List<Overrules></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Overrules addOverrules(Overrules overrulesElem) {
        this.addOverlayWidget(overrulesElem);
        return overrulesElem;
    }

    /**
     * Return <code>java.util.List<DissentsFrom></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DissentsFrom> getDissentsFroms() {
        java.util.List<DissentsFrom> result = new ArrayList<DissentsFrom>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DissentsFrom".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DissentsFrom) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DissentsFrom></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DissentsFrom> getDissentsFromList() {
        return getDissentsFroms();
    }

    /**
     * Add <code>java.util.List<DissentsFrom></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DissentsFrom addDissentsFrom(DissentsFrom dissentsFromElem) {
        this.addOverlayWidget(dissentsFromElem);
        return dissentsFromElem;
    }

    /**
     * Return <code>java.util.List<PutsInQuestion></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<PutsInQuestion> getPutsInQuestions() {
        java.util.List<PutsInQuestion> result = new ArrayList<PutsInQuestion>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PutsInQuestion".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((PutsInQuestion) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<PutsInQuestion></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<PutsInQuestion> getPutsInQuestionList() {
        return getPutsInQuestions();
    }

    /**
     * Add <code>java.util.List<PutsInQuestion></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public PutsInQuestion addPutsInQuestion(PutsInQuestion putsInQuestionElem) {
        this.addOverlayWidget(putsInQuestionElem);
        return putsInQuestionElem;
    }

    /**
     * Return <code>java.util.List<Distinguishes></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Distinguishes> getDistinguisheses() {
        java.util.List<Distinguishes> result = new ArrayList<Distinguishes>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Distinguishes".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Distinguishes) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Distinguishes></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Distinguishes> getDistinguishesList() {
        return getDistinguisheses();
    }

    /**
     * Add <code>java.util.List<Distinguishes></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Distinguishes addDistinguishes(Distinguishes distinguishesElem) {
        this.addOverlayWidget(distinguishesElem);
        return distinguishesElem;
    }

//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns the namespace URI of this amendable widget.
     *
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
    public JudicialArgumentsComplexType html(String s) {
        super.html(s);
        return this;
    }
}

