package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
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

}

