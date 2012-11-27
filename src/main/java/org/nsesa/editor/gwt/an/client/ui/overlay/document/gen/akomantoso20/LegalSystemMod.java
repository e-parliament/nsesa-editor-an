package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.LegalSystemModsSimpleType;
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
public class LegalSystemMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
    public LegalSystemMod() {
        super(DOM.createElement("legalSystemMod"));
    }

    public LegalSystemMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private LegalSystemModsSimpleType typeAttr;
    public LegalSystemModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = LegalSystemModsSimpleType.fromString(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    //DSL Style get value
    public LegalSystemModsSimpleType typeAttr() {
         return  getTypeAttr();
    }

    public void setTypeAttr(final LegalSystemModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    //DSL Style set value
    public LegalSystemMod typeAttr(final LegalSystemModsSimpleType typeAttr) {
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

