package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LegalSystemModsSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class LegalSystemMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
public LegalSystemMod(Element element) {
    super(element);
}

// FIELDS ------------------
private LegalSystemModsSimpleType typez;

public LegalSystemModsSimpleType getTypez() {
return typez;
}

public void setTypez(final LegalSystemModsSimpleType typez) {
this.typez = typez;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"application","modifiersAttrGroup","coreAttrGroup","condition","LegalSystemModsSimpleType","idreqAttrGroup","efficacy","destination","duration","source","enactmentAttrGroup","force","refersAttrGroup"};
    return  subtypes;
}
}

