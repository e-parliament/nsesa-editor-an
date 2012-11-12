package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FRBRauthor extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
public FRBRauthor(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType asAttr;
private AnyURISimpleType hrefAttr;

public AnyURISimpleType getAsAttr() {
return asAttr;
}

public void setAsAttr(final AnyURISimpleType asAttr) {
this.asAttr = asAttr;
}
public AnyURISimpleType getHrefAttr() {
return hrefAttr;
}

public void setHrefAttr(final AnyURISimpleType hrefAttr) {
this.hrefAttr = hrefAttr;
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

