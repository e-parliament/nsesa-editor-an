package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IntegerSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class EolTypeComplexType extends MarkeroptComplexType  {

// CONSTRUCTORS ------------------

    public EolTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private IntegerSimpleType breakatAttr;
    public IntegerSimpleType getBreakatAttr() {
        if (breakatAttr == null) {
            breakatAttr = new IntegerSimpleType();
            breakatAttr.setValue(amendableElement.getAttribute("breakat"));
        }

        return breakatAttr;
    }
    //DSL Style get value
    public IntegerSimpleType breakatAttr() {
         return  getBreakatAttr();
    }

    public void setBreakatAttr(final IntegerSimpleType breakatAttr) {
        this.breakatAttr = breakatAttr;
    }
    //DSL Style set value
    public EolTypeComplexType breakatAttr(final IntegerSimpleType breakatAttr) {
        setBreakatAttr(breakatAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("breakatAttr", getBreakatAttr() != null ? getBreakatAttr().getValue() : null);
        return attrs;
    }

}

