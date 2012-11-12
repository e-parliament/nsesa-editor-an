package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CollectionStructureComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class DocumentCollection extends CollectionStructureComplexType  {

// CONSTRUCTORS ------------------
public DocumentCollection(Element element) {
    super(element);
}

// FIELDS ------------------
private StringSimpleType nameAttr;

public StringSimpleType getNameAttr() {
return nameAttr;
}

public void setNameAttr(final StringSimpleType nameAttr) {
this.nameAttr = nameAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"conclusions","preface","coverPage","collectionBody","attachments","meta"};
    return  subtypes;
}
}

