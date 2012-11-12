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
public class AttachmentOf extends ReferenceTypeComplexType  {

// CONSTRUCTORS ------------------
public AttachmentOf(Element element) {
    super(element);
}

// FIELDS ------------------
private StringSimpleType typeAttr;

public StringSimpleType getTypeAttr() {
return typeAttr;
}

public void setTypeAttr(final StringSimpleType typeAttr) {
this.typeAttr = typeAttr;
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

