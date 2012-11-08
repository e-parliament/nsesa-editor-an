package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PopupStructureComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class QuotedStructure extends PopupStructureComplexType  {

// CONSTRUCTORS ------------------
public QuotedStructure(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType forURI;

public AnyURISimpleType getFor() {
return forURI;
}

public void setFor(final AnyURISimpleType forURI) {
this.forURI = forURI;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"componentRef","citation","wrap","containerElementsGroup","ANcontainersGroup","subheading","hierElementsGroup","anyURISimpleType","intro","blockElementsGroup","content","recital","num","corereqAttrGroup","heading"};
    return  subtypes;
}
}

