package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
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
private AnyURISimpleType dictionaryAttr;
private StringSimpleType valueAttr;
private StringSimpleType showAsAttr;
private StringSimpleType shortFormAttr;

public AnyURISimpleType getDictionaryAttr() {
return dictionaryAttr;
}

public void setDictionaryAttr(final AnyURISimpleType dictionaryAttr) {
this.dictionaryAttr = dictionaryAttr;
}
public StringSimpleType getValueAttr() {
return valueAttr;
}

public void setValueAttr(final StringSimpleType valueAttr) {
this.valueAttr = valueAttr;
}
public StringSimpleType getShowAsAttr() {
return showAsAttr;
}

public void setShowAsAttr(final StringSimpleType showAsAttr) {
this.showAsAttr = showAsAttr;
}
public StringSimpleType getShortFormAttr() {
return shortFormAttr;
}

public void setShortFormAttr(final StringSimpleType shortFormAttr) {
this.shortFormAttr = shortFormAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{};
    return  subtypes;
}
}

