package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ScopeModsSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Domain;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ScopeMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
public ScopeMod(Element element) {
    super(element);
}

// FIELDS ------------------
private ScopeModsSimpleType typeAttr;
private Domain domain;

public ScopeModsSimpleType getTypeAttr() {
return typeAttr;
}

public void setTypeAttr(final ScopeModsSimpleType typeAttr) {
this.typeAttr = typeAttr;
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
    String[] subtypes = new String[]{"duration","application","source","condition","domain","efficacy","force","destination"};
    return  subtypes;
}
}

