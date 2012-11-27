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
    //DSL Style get value
    public BooleanSimpleType frozenAttr() {
         return  getFrozenAttr();
    }

    public void setFrozenAttr(final BooleanSimpleType frozenAttr) {
        this.frozenAttr = frozenAttr;
    }
    //DSL Style set value
    public Condition frozenAttr(final BooleanSimpleType frozenAttr) {
        setFrozenAttr(frozenAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"*"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("frozenAttr", getFrozenAttr() != null ? getFrozenAttr().getValue() : null);
        return attrs;
    }

}

