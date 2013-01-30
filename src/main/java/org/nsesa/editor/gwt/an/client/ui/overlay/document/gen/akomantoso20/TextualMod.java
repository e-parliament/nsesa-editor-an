package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TextualModsSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Old;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.New;
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

public class TextualMod extends ModificationTypeComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Old(), new Occurrence(0,1));
            put(new New(), new Occurrence(0,1));
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
        span.setAttribute("type", "textualMod");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget textualMod");
        return span;
    }

// CONSTRUCTORS ------------------
    public TextualMod() {
        super(create());
        setType("textualMod");
    }

    public TextualMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private TextualModsSimpleType typeAttr;

    public TextualModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = TextualModsSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
     }
     //DSL Style get value
    public TextualModsSimpleType typeAttr() {
        return  getTypeAttr();
    }

    public void setTypeAttr(final TextualModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
     //DSL Style set value
    public TextualMod typeAttr(final TextualModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }
    public Old getOld() {
        Old result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Old".equalsIgnoreCase(widget.getType())) {
                result = (Old)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public Old setOld(Old oldElem) {
        Old result = getOld();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(oldElem);

        return oldElem;
    }
    public New getNew() {
        New result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("New".equalsIgnoreCase(widget.getType())) {
                result = (New)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public New setNew(New newElem) {
        New result = getNew();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(newElem);

        return newElem;
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

