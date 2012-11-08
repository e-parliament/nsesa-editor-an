package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ReferenceTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class HasAttachment extends ReferenceTypeComplexType  {

// CONSTRUCTORS ------------------
public HasAttachment(Element element) {
    super(element);
}

// FIELDS ------------------
private StringSimpleType typez;

public StringSimpleType getTypez() {
return typez;
}

public void setTypez(final StringSimpleType typez) {
this.typez = typez;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"coreAttrGroup","showAttrGroup","idreqAttrGroup","linkAttrGroup","stringSimpleType"};
    return  subtypes;
}
}

