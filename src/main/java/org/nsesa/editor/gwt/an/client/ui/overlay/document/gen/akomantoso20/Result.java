package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ResultTypeSimpleType;
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
public class Result extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
    public Result() {
        super(DOM.createElement("result"));
    }

    public Result(Element element) {
        super(element);
    }

// FIELDS ------------------
    private ResultTypeSimpleType typeAttr;
    public ResultTypeSimpleType getTypeAttr() {
        return typeAttr;
    }
    public void setTypeAttr(final ResultTypeSimpleType typeAttr) {
        this.typeAttr = typeAttr;
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
        attrs.put("typeAttr", getTypeAttr().value());

        return attrs;
    }

}

