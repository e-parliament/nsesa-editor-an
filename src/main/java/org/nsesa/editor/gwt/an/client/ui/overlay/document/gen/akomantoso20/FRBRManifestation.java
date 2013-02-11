package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRformat;
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

public class FRBRManifestation extends CorePropertiesComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new FRBRformat(), new Occurrence(0,-1));
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
        span.setAttribute("type", "FRBRManifestation");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget FRBRManifestation");
        return span;
    }

// CONSTRUCTORS ------------------
    public FRBRManifestation() {
        super(create());
        setType("FRBRManifestation");
    }

    public FRBRManifestation(Element element) {
        super(element);
    }

// FIELDS ------------------

    public FRBRformat getFRBRformat() {
        FRBRformat result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRformat".equalsIgnoreCase(widget.getType())) {
                result = (FRBRformat)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRformat setFRBRformat(FRBRformat FRBRformatElem) {
        FRBRformat result = getFRBRformat();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRformatElem);

        return FRBRformatElem;
    }
    //Override all attributes methods to be conformant with DSL approach

    /**
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
    */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
        return ALLOWED_SUB_TYPES;
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

