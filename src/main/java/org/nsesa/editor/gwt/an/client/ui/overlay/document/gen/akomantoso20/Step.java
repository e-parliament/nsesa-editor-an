package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
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

public class Step extends AnyOtherTypeComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(null, new Occurrence(0,-1));
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "step");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget step");
        return span;
    }

// CONSTRUCTORS ------------------
    public Step() {
        super(create());
        setType("step");
    }

    public Step(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType asAttr;
    private AnyURISimpleType outcomeAttr;
    private DateSimpleType dateAttr;
    private AnyURISimpleType actorAttr;

    public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
            asAttr = new AnyURISimpleType();
            asAttr.setValue(getElement().getAttribute("as"));
        }

        return asAttr;
     }
     //DSL Style get value
    public AnyURISimpleType asAttr() {
        return  getAsAttr();
    }

    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
    }
     //DSL Style set value
    public Step asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
    }
    public AnyURISimpleType getOutcomeAttr() {
        if (outcomeAttr == null) {
            outcomeAttr = new AnyURISimpleType();
            outcomeAttr.setValue(getElement().getAttribute("outcome"));
        }

        return outcomeAttr;
     }
     //DSL Style get value
    public AnyURISimpleType outcomeAttr() {
        return  getOutcomeAttr();
    }

    public void setOutcomeAttr(final AnyURISimpleType outcomeAttr) {
        this.outcomeAttr = outcomeAttr;
    }
     //DSL Style set value
    public Step outcomeAttr(final AnyURISimpleType outcomeAttr) {
        setOutcomeAttr(outcomeAttr);
        return this;
    }
    public DateSimpleType getDateAttr() {
        if (dateAttr == null) {
            dateAttr = new DateSimpleType();
            dateAttr.setValue(getElement().getAttribute("date"));
        }

        return dateAttr;
     }
     //DSL Style get value
    public DateSimpleType dateAttr() {
        return  getDateAttr();
    }

    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
    }
     //DSL Style set value
    public Step dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
    }
    public AnyURISimpleType getActorAttr() {
        if (actorAttr == null) {
            actorAttr = new AnyURISimpleType();
            actorAttr.setValue(getElement().getAttribute("actor"));
        }

        return actorAttr;
     }
     //DSL Style get value
    public AnyURISimpleType actorAttr() {
        return  getActorAttr();
    }

    public void setActorAttr(final AnyURISimpleType actorAttr) {
        this.actorAttr = actorAttr;
    }
     //DSL Style set value
    public Step actorAttr(final AnyURISimpleType actorAttr) {
        setActorAttr(actorAttr);
        return this;
    }
    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public Step wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    //DSL Style set value
    public Step hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }
    //DSL Style set value
    public Step idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    //DSL Style set value
    public Step evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

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
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("outcome", getOutcomeAttr() != null ? getOutcomeAttr().getValue() : null);
        attrs.put("date", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("actor", getActorAttr() != null ? getActorAttr().getValue() : null);
        return attrs;
    }
}

