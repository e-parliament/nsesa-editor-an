package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRcountry;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRsubtype;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRnumber;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRname;
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

public class FRBRWork extends CorePropertiesComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new FRBRcountry(), new Occurrence(0,-1));
            put(new FRBRsubtype(), new Occurrence(0,-1));
            put(new FRBRnumber(), new Occurrence(0,-1));
            put(new FRBRname(), new Occurrence(0,-1));
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
        span.setAttribute("type", "FRBRWork");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget FRBRWork");
        return span;
    }

// CONSTRUCTORS ------------------
    public FRBRWork() {
        super(create());
        setType("FRBRWork");
    }

    public FRBRWork(Element element) {
        super(element);
    }

// FIELDS ------------------

    public FRBRcountry getFRBRcountry() {
        FRBRcountry result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRcountry".equalsIgnoreCase(widget.getType())) {
                result = (FRBRcountry)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRcountry setFRBRcountry(FRBRcountry FRBRcountryElem) {
        FRBRcountry result = getFRBRcountry();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRcountryElem);

        return FRBRcountryElem;
    }
    public FRBRsubtype getFRBRsubtype() {
        FRBRsubtype result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRsubtype".equalsIgnoreCase(widget.getType())) {
                result = (FRBRsubtype)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRsubtype setFRBRsubtype(FRBRsubtype FRBRsubtypeElem) {
        FRBRsubtype result = getFRBRsubtype();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRsubtypeElem);

        return FRBRsubtypeElem;
    }
    public FRBRnumber getFRBRnumber() {
        FRBRnumber result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRnumber".equalsIgnoreCase(widget.getType())) {
                result = (FRBRnumber)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRnumber setFRBRnumber(FRBRnumber FRBRnumberElem) {
        FRBRnumber result = getFRBRnumber();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRnumberElem);

        return FRBRnumberElem;
    }
    public FRBRname getFRBRname() {
        FRBRname result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRname".equalsIgnoreCase(widget.getType())) {
                result = (FRBRname)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRname setFRBRname(FRBRname FRBRnameElem) {
        FRBRname result = getFRBRname();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRnameElem);

        return FRBRnameElem;
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

