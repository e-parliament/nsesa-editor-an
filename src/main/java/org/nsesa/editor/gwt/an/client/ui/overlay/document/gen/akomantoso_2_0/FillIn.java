package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FillIn extends InlineComplexType  {

// CONSTRUCTORS ------------------
public FillIn(Element element) {
    super(element);
}

// FIELDS ------------------
private StringSimpleType width;

public StringSimpleType getWidth() {
return width;
}

public void setWidth(final StringSimpleType width) {
this.width = width;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"inlineCMGroup","coreoptAttrGroup","stringSimpleType"};
    return  subtypes;
}
}

