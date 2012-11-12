package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Keyword;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Classification extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Classification(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<Keyword> keywords = new ArrayList<Keyword>();
private AnyURISimpleType sourceAttr;

public java.util.List<Keyword> getKeyword() {
return keywords;
}

public void setKeyword(final java.util.List<Keyword> keywords) {
this.keywords = keywords;
}
public AnyURISimpleType getSourceAttr() {
return sourceAttr;
}

public void setSourceAttr(final AnyURISimpleType sourceAttr) {
this.sourceAttr = sourceAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"keyword"};
    return  subtypes;
}
}

