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

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Result;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Supports;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.IsAnalogTo;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Applies;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Extends;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Restricts;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Derogates;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Contrasts;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Overrules;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DissentsFrom;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PutsInQuestion;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Distinguishes;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class JudicialArgumentsComplexType extends AmendableWidgetImpl  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Result(), new Occurrence(1,1));
            put(new Supports(), new Occurrence(1,1));
            put(new IsAnalogTo(), new Occurrence(1,1));
            put(new Applies(), new Occurrence(1,1));
            put(new Extends(), new Occurrence(1,1));
            put(new Restricts(), new Occurrence(1,1));
            put(new Derogates(), new Occurrence(1,1));
            put(new Contrasts(), new Occurrence(1,1));
            put(new Overrules(), new Occurrence(1,1));
            put(new DissentsFrom(), new Occurrence(1,1));
            put(new PutsInQuestion(), new Occurrence(1,1));
            put(new Distinguishes(), new Occurrence(1,1));
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "judicialArgumentsComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget judicialArgumentsComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public JudicialArgumentsComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------

    public Result getResult() {
        Result result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Result".equalsIgnoreCase(widget.getType())) {
                result = (Result)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public Result setResult(Result resultElem) {
        Result result = getResult();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(resultElem);

        return resultElem;
    }
    public java.util.List<Supports> getSupportses() {
        java.util.List<Supports> result = new ArrayList<Supports>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Supports".equalsIgnoreCase(widget.getType())) {
                result.add((Supports)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Supports> getSupportsList() {
        return  getSupportses();
    }
     //DSL Style set value
    public Supports addSupports(Supports supportsElem) {
        this.addAmendableWidget(supportsElem);
        return supportsElem;
    }

    public java.util.List<IsAnalogTo> getIsAnalogTos() {
        java.util.List<IsAnalogTo> result = new ArrayList<IsAnalogTo>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("IsAnalogTo".equalsIgnoreCase(widget.getType())) {
                result.add((IsAnalogTo)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<IsAnalogTo> getIsAnalogToList() {
        return  getIsAnalogTos();
    }
     //DSL Style set value
    public IsAnalogTo addIsAnalogTo(IsAnalogTo isAnalogToElem) {
        this.addAmendableWidget(isAnalogToElem);
        return isAnalogToElem;
    }

    public java.util.List<Applies> getApplieses() {
        java.util.List<Applies> result = new ArrayList<Applies>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Applies".equalsIgnoreCase(widget.getType())) {
                result.add((Applies)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Applies> getAppliesList() {
        return  getApplieses();
    }
     //DSL Style set value
    public Applies addApplies(Applies appliesElem) {
        this.addAmendableWidget(appliesElem);
        return appliesElem;
    }

    public java.util.List<Extends> getExtend_s() {
        java.util.List<Extends> result = new ArrayList<Extends>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Extends".equalsIgnoreCase(widget.getType())) {
                result.add((Extends)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Extends> getExtend_List() {
        return  getExtend_s();
    }
     //DSL Style set value
    public Extends addExtend_(Extends extend_Elem) {
        this.addAmendableWidget(extend_Elem);
        return extend_Elem;
    }

    public java.util.List<Restricts> getRestrictses() {
        java.util.List<Restricts> result = new ArrayList<Restricts>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Restricts".equalsIgnoreCase(widget.getType())) {
                result.add((Restricts)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Restricts> getRestrictsList() {
        return  getRestrictses();
    }
     //DSL Style set value
    public Restricts addRestricts(Restricts restrictsElem) {
        this.addAmendableWidget(restrictsElem);
        return restrictsElem;
    }

    public java.util.List<Derogates> getDerogateses() {
        java.util.List<Derogates> result = new ArrayList<Derogates>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Derogates".equalsIgnoreCase(widget.getType())) {
                result.add((Derogates)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Derogates> getDerogatesList() {
        return  getDerogateses();
    }
     //DSL Style set value
    public Derogates addDerogates(Derogates derogatesElem) {
        this.addAmendableWidget(derogatesElem);
        return derogatesElem;
    }

    public java.util.List<Contrasts> getContrastses() {
        java.util.List<Contrasts> result = new ArrayList<Contrasts>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Contrasts".equalsIgnoreCase(widget.getType())) {
                result.add((Contrasts)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Contrasts> getContrastsList() {
        return  getContrastses();
    }
     //DSL Style set value
    public Contrasts addContrasts(Contrasts contrastsElem) {
        this.addAmendableWidget(contrastsElem);
        return contrastsElem;
    }

    public java.util.List<Overrules> getOverruleses() {
        java.util.List<Overrules> result = new ArrayList<Overrules>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Overrules".equalsIgnoreCase(widget.getType())) {
                result.add((Overrules)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Overrules> getOverrulesList() {
        return  getOverruleses();
    }
     //DSL Style set value
    public Overrules addOverrules(Overrules overrulesElem) {
        this.addAmendableWidget(overrulesElem);
        return overrulesElem;
    }

    public java.util.List<DissentsFrom> getDissentsFroms() {
        java.util.List<DissentsFrom> result = new ArrayList<DissentsFrom>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DissentsFrom".equalsIgnoreCase(widget.getType())) {
                result.add((DissentsFrom)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<DissentsFrom> getDissentsFromList() {
        return  getDissentsFroms();
    }
     //DSL Style set value
    public DissentsFrom addDissentsFrom(DissentsFrom dissentsFromElem) {
        this.addAmendableWidget(dissentsFromElem);
        return dissentsFromElem;
    }

    public java.util.List<PutsInQuestion> getPutsInQuestions() {
        java.util.List<PutsInQuestion> result = new ArrayList<PutsInQuestion>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PutsInQuestion".equalsIgnoreCase(widget.getType())) {
                result.add((PutsInQuestion)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<PutsInQuestion> getPutsInQuestionList() {
        return  getPutsInQuestions();
    }
     //DSL Style set value
    public PutsInQuestion addPutsInQuestion(PutsInQuestion putsInQuestionElem) {
        this.addAmendableWidget(putsInQuestionElem);
        return putsInQuestionElem;
    }

    public java.util.List<Distinguishes> getDistinguisheses() {
        java.util.List<Distinguishes> result = new ArrayList<Distinguishes>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Distinguishes".equalsIgnoreCase(widget.getType())) {
                result.add((Distinguishes)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Distinguishes> getDistinguishesList() {
        return  getDistinguisheses();
    }
     //DSL Style set value
    public Distinguishes addDistinguishes(Distinguishes distinguishesElem) {
        this.addAmendableWidget(distinguishesElem);
        return distinguishesElem;
    }

    //Override all attributes methods to be conformant with DSL approach

    /**
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
    */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
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

