package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ShowAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ValueAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Keyword extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
public Keyword(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType dictionary;
private ShowAttrGroup show;
private ValueAttrGroup value;

public AnyURISimpleType getDictionary() {
return dictionary;
}

public void setDictionary(final AnyURISimpleType dictionary) {
this.dictionary = dictionary;
}
public ShowAttrGroup getShow() {
return show;
}

public void setShow(final ShowAttrGroup show) {
this.show = show;
}
public ValueAttrGroup getValue() {
return value;
}

public void setValue(final ValueAttrGroup value) {
this.value = value;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"coreAttrGroup","valueAttrGroup","showAttrGroup","idoptAttrGroup","anyURISimpleType"};
    return  subtypes;
}
}

