package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.BooleanSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Condition extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
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
    String[] subtypes = new String[]{"*"};
    return  subtypes;
}
}

