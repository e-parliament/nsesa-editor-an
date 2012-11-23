package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class TextualMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
    public TextualMod() {
        super(DOM.createElement("textualMod"));
    }

    public TextualMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private TextualModsSimpleType typeAttr;
    public TextualModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = TextualModsSimpleType.fromString(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    public void setTypeAttr(final TextualModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
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
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","new","old","source","condition","efficacy","force","destination"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }

}

