package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class EolTypeComplexType extends MarkeroptComplexType  {

// CONSTRUCTORS ------------------
public EolTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private IntegerSimpleType breakat;

public IntegerSimpleType getBreakat() {
return breakat;
}

public void setBreakat(final IntegerSimpleType breakat) {
this.breakat = breakat;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"integerSimpleType","coreoptAttrGroup"};
    return  subtypes;
}
}

