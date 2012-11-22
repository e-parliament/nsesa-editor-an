package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.EfficacyModsSimpleType;
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
public class EfficacyMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
    public EfficacyMod() {
        super(DOM.createElement("efficacyMod"));
    }

    public EfficacyMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private EfficacyModsSimpleType typeAttr;
    public EfficacyModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = EfficacyModsSimpleType.fromString(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    public void setTypeAttr(final EfficacyModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","source","condition","efficacy","force","destination"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr().value());

        return attrs;
    }

}

