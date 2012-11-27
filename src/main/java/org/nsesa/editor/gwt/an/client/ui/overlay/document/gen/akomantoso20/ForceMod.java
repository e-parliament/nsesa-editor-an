package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ForceModsSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ForceMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
    public ForceMod() {
        super(DOM.createElement("forceMod"));
    }

    public ForceMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private ForceModsSimpleType typeAttr;
    public ForceModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = ForceModsSimpleType.fromString(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    //DSL Style get value
    public ForceModsSimpleType typeAttr() {
         return  getTypeAttr();
    }

    public void setTypeAttr(final ForceModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    //DSL Style set value
    public ForceMod typeAttr(final ForceModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","source","condition","efficacy","force","destination"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }

}

