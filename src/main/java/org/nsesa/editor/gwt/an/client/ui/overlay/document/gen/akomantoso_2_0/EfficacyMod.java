package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EfficacyModsSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class EfficacyMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
public EfficacyMod(Element element) {
    super(element);
}

// FIELDS ------------------
private EfficacyModsSimpleType typez;

public EfficacyModsSimpleType getTypez() {
return typez;
}

public void setTypez(final EfficacyModsSimpleType typez) {
this.typez = typez;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"application","modifiersAttrGroup","coreAttrGroup","condition","EfficacyModsSimpleType","idreqAttrGroup","efficacy","destination","duration","source","enactmentAttrGroup","force","refersAttrGroup"};
    return  subtypes;
}
}

