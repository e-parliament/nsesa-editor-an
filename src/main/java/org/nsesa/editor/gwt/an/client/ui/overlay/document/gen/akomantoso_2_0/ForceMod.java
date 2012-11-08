package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ForceModsSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ForceMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
public ForceMod(Element element) {
    super(element);
}

// FIELDS ------------------
private ForceModsSimpleType typez;

public ForceModsSimpleType getTypez() {
return typez;
}

public void setTypez(final ForceModsSimpleType typez) {
this.typez = typez;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"application","modifiersAttrGroup","coreAttrGroup","condition","idreqAttrGroup","efficacy","destination","duration","source","enactmentAttrGroup","ForceModsSimpleType","force","refersAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

