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
private LegalSystemModsSimpleType typeAttr;

public LegalSystemModsSimpleType getTypeAttr() {
return typeAttr;
}

public void setTypeAttr(final LegalSystemModsSimpleType typeAttr) {
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

