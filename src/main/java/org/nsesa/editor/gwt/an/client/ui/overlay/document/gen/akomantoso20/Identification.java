package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRWork;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRExpression;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRManifestation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRItem;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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

public class Identification extends AmendableWidgetImpl  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new FRBRWork(), new Occurrence(1,1));
            put(new FRBRExpression(), new Occurrence(1,1));
            put(new FRBRManifestation(), new Occurrence(1,1));
            put(new FRBRItem(), new Occurrence(0,1));
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "identification");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget identification");
        return span;
    }

// CONSTRUCTORS ------------------
    public Identification() {
        super(create());
        setType("identification");
    }

    public Identification(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;

    public FRBRWork getFRBRWork() {
        FRBRWork result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRWork".equalsIgnoreCase(widget.getType())) {
                result = (FRBRWork)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRWork setFRBRWork(FRBRWork FRBRWorkElem) {
        FRBRWork result = getFRBRWork();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRWorkElem);

        return FRBRWorkElem;
    }
    public FRBRExpression getFRBRExpression() {
        FRBRExpression result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRExpression".equalsIgnoreCase(widget.getType())) {
                result = (FRBRExpression)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRExpression setFRBRExpression(FRBRExpression FRBRExpressionElem) {
        FRBRExpression result = getFRBRExpression();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRExpressionElem);

        return FRBRExpressionElem;
    }
    public FRBRManifestation getFRBRManifestation() {
        FRBRManifestation result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRManifestation".equalsIgnoreCase(widget.getType())) {
                result = (FRBRManifestation)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRManifestation setFRBRManifestation(FRBRManifestation FRBRManifestationElem) {
        FRBRManifestation result = getFRBRManifestation();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRManifestationElem);

        return FRBRManifestationElem;
    }
    public FRBRItem getFRBRItem() {
        FRBRItem result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRItem".equalsIgnoreCase(widget.getType())) {
                result = (FRBRItem)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public FRBRItem setFRBRItem(FRBRItem FRBRItemElem) {
        FRBRItem result = getFRBRItem();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRItemElem);

        return FRBRItemElem;
    }
    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
     }
     //DSL Style get value
    public AnyURISimpleType sourceAttr() {
        return  getSourceAttr();
    }

    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
     //DSL Style set value
    public Identification sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }
}

