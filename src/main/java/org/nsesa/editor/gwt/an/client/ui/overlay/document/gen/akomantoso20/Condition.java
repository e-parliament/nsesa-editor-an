package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
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
public class Condition extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
    public Condition() {
        super(DOM.createElement("condition"));
    }

    public Condition(Element element) {
        super(element);
    }

// FIELDS ------------------
    private BooleanSimpleType frozenAttr;
    public BooleanSimpleType getFrozenAttr() {
        if (frozenAttr == null) {
            frozenAttr = new BooleanSimpleType();
            frozenAttr.setValue(amendableElement.getAttribute("frozen"));
        }

        return frozenAttr;
    }
    public void setFrozenAttr(final BooleanSimpleType frozenAttr) {
        this.frozenAttr = frozenAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"*"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("frozenAttr", getFrozenAttr().getValue());

        return attrs;
    }

}

