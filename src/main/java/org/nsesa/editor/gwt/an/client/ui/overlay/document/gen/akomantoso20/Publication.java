package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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

public class Publication extends MetaoptComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "publication");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget publication");
        return span;
    }

// CONSTRUCTORS ------------------
    public Publication() {
        super(create());
        setType("publication");
    }

    public Publication(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType numberAttr;
    private AnyURISimpleType refersToAttr;
    private StringSimpleType nameAttr;
    private DateSimpleType dateAttr;
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;

    public StringSimpleType getNumberAttr() {
        if (numberAttr == null) {
            numberAttr = new StringSimpleType();
            numberAttr.setValue(getElement().getAttribute("number"));
        }

        return numberAttr;
     }
     //DSL Style get value
    public StringSimpleType numberAttr() {
        return  getNumberAttr();
    }

    public void setNumberAttr(final StringSimpleType numberAttr) {
        this.numberAttr = numberAttr;
    }
     //DSL Style set value
    public Publication numberAttr(final StringSimpleType numberAttr) {
        setNumberAttr(numberAttr);
        return this;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
     }
     //DSL Style get value
    public AnyURISimpleType refersToAttr() {
        return  getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
     //DSL Style set value
    public Publication refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
            nameAttr = new StringSimpleType();
            nameAttr.setValue(getElement().getAttribute("name"));
        }

        return nameAttr;
     }
     //DSL Style get value
    public StringSimpleType nameAttr() {
        return  getNameAttr();
    }

    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
     //DSL Style set value
    public Publication nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
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
    public Publication dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
    }
    public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
            showAsAttr = new StringSimpleType();
            showAsAttr.setValue(getElement().getAttribute("showAs"));
        }

        return showAsAttr;
     }
     //DSL Style get value
    public StringSimpleType showAsAttr() {
        return  getShowAsAttr();
    }

    public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
    }
     //DSL Style set value
    public Publication showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
    }
    public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
            shortFormAttr = new StringSimpleType();
            shortFormAttr.setValue(getElement().getAttribute("shortForm"));
        }

        return shortFormAttr;
     }
     //DSL Style get value
    public StringSimpleType shortFormAttr() {
        return  getShortFormAttr();
    }

    public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
    }
     //DSL Style set value
    public Publication shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }
    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public Publication idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    //DSL Style set value
    public Publication evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    //DSL Style set value
    public Publication wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
        attrs.put("number", getNumberAttr() != null ? getNumberAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("name", getNameAttr() != null ? getNameAttr().getValue() : null);
        attrs.put("date", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("showAs", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortForm", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        return attrs;
    }
}

