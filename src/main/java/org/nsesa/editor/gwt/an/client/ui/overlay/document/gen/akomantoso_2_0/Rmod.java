package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Rmod extends ModTypeComplexType  {

// CONSTRUCTORS ------------------
public Rmod(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType from;
private AnyURISimpleType upTo;

public AnyURISimpleType getFrom() {
return from;
}

public void setFrom(final AnyURISimpleType from) {
this.from = from;
}
public AnyURISimpleType getUpTo() {
return upTo;
}

public void setUpTo(final AnyURISimpleType upTo) {
this.upTo = upTo;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"inlineCMGroup","quotedText","quotedStructure","corereqAttrGroup","anyURISimpleType"};
    return  subtypes;
}
}

