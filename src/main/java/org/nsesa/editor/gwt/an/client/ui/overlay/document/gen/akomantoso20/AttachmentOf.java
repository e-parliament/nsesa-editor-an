package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ReferenceTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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
public class AttachmentOf extends ReferenceTypeComplexType  {

// CONSTRUCTORS ------------------
    public AttachmentOf() {
        super(DOM.createElement("attachmentOf"));
    }

    public AttachmentOf(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType typeAttr;
    public StringSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = new StringSimpleType();
            typeAttr.setValue(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    public void setTypeAttr(final StringSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr().getValue());

        return attrs;
    }

}

