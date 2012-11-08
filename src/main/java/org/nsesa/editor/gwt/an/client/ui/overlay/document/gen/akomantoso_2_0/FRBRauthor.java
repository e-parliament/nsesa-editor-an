package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkAttrGroup;
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
private AnyURISimpleType as;
private LinkAttrGroup link;

public AnyURISimpleType getAs() {
return as;
}

public void setAs(final AnyURISimpleType as) {
this.as = as;
}
public LinkAttrGroup getLink() {
return link;
}

public void setLink(final LinkAttrGroup link) {
this.link = link;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"coreAttrGroup","linkAttrGroup","idoptAttrGroup","anyURISimpleType"};
    return  subtypes;
}
}

