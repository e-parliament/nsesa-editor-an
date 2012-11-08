package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MeaningModsSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Domain;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class MeaningMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
public MeaningMod(Element element) {
    super(element);
}

// FIELDS ------------------
private MeaningModsSimpleType typez;
private Domain domain;

public MeaningModsSimpleType getTypez() {
return typez;
}

public void setTypez(final MeaningModsSimpleType typez) {
this.typez = typez;
}
public Domain getDomain() {
return domain;
}

public void setDomain(final Domain domain) {
this.domain = domain;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"application","modifiersAttrGroup","coreAttrGroup","condition","MeaningModsSimpleType","idreqAttrGroup","efficacy","destination","duration","source","domain","enactmentAttrGroup","force","refersAttrGroup"};
    return  subtypes;
}
}

