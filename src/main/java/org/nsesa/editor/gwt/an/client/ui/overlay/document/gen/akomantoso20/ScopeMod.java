package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ScopeModsSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Domain;
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

public class ScopeMod extends ModificationTypeComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Domain(), new Occurrence(0,1));
            put(new Source(), new Occurrence(1,-1));
            put(new Destination(), new Occurrence(1,-1));
            put(new Force(), new Occurrence(0,1));
            put(new Efficacy(), new Occurrence(0,1));
            put(new Application(), new Occurrence(0,1));
            put(new Duration(), new Occurrence(0,1));
            put(new Condition(), new Occurrence(0,1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "scopeMod");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget scopeMod");
        return span;
    }

// CONSTRUCTORS ------------------
    public ScopeMod() {
        super(create());
        setType("scopeMod");
    }

    public ScopeMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private ScopeModsSimpleType typeAttr;

    public ScopeModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = ScopeModsSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
     }
     //DSL Style get value
    public ScopeModsSimpleType typeAttr() {
        return  getTypeAttr();
    }

    public void setTypeAttr(final ScopeModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
     //DSL Style set value
    public ScopeMod typeAttr(final ScopeModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }
    public Domain getDomain() {
        Domain result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Domain".equalsIgnoreCase(widget.getType())) {
                result = (Domain)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public Domain setDomain(Domain domainElem) {
        Domain result = getDomain();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(domainElem);

        return domainElem;
    }
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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }
}

