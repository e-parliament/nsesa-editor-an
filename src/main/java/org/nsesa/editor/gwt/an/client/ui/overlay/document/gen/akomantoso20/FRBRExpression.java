package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRlanguage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRtranslation;
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

public class FRBRExpression extends CorePropertiesComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new FRBRlanguage(), new Occurrence(0,-1));
            put(new FRBRtranslation(), new Occurrence(0,-1));
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
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRlanguage".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRlanguage)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<FRBRlanguage> getFRBRlanguageList() {
        return  getFRBRlanguages();
    }
     //DSL Style set value
    public FRBRlanguage addFRBRlanguage(FRBRlanguage FRBRlanguageElem) {
        this.addAmendableWidget(FRBRlanguageElem);
        return FRBRlanguageElem;
    }

    public java.util.List<FRBRtranslation> getFRBRtranslations() {
        java.util.List<FRBRtranslation> result = new ArrayList<FRBRtranslation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRtranslation".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRtranslation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<FRBRtranslation> getFRBRtranslationList() {
        return  getFRBRtranslations();
    }
     //DSL Style set value
    public FRBRtranslation addFRBRtranslation(FRBRtranslation FRBRtranslationElem) {
        this.addAmendableWidget(FRBRtranslationElem);
        return FRBRtranslationElem;
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

