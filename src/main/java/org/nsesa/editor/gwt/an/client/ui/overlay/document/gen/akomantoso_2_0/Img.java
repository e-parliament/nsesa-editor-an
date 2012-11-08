package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SrcAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Img extends MarkeroptComplexType  {

// CONSTRUCTORS ------------------
public Img(Element element) {
    super(element);
}

// FIELDS ------------------
private IntegerSimpleType width;
private IntegerSimpleType height;
private SrcAttrGroup src;

public IntegerSimpleType getWidth() {
return width;
}

public void setWidth(final IntegerSimpleType width) {
this.width = width;
}
public IntegerSimpleType getHeight() {
return height;
}

public void setHeight(final IntegerSimpleType height) {
this.height = height;
}
public SrcAttrGroup getSrc() {
return src;
}

public void setSrc(final SrcAttrGroup src) {
this.src = src;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"integerSimpleType","coreoptAttrGroup","srcAttrGroup"};
    return  subtypes;
}
}

