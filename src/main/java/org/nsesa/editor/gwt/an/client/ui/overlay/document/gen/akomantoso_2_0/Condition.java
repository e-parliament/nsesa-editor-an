package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.BooleanSimpleType;

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

}

