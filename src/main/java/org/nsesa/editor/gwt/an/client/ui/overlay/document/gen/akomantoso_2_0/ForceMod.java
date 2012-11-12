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
private ForceModsSimpleType typeAttr;

public ForceModsSimpleType getTypeAttr() {
return typeAttr;
}

public void setTypeAttr(final ForceModsSimpleType typeAttr) {
this.typeAttr = typeAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"duration","application","source","condition","efficacy","force","destination"};
    return  subtypes;
}
}

