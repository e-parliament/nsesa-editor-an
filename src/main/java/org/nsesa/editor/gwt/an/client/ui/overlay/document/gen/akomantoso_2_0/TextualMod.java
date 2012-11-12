package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TextualModsSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Old;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.New;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class TextualMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
public TextualMod(Element element) {
    super(element);
}

// FIELDS ------------------
private TextualModsSimpleType typeAttr;
private Old old;
private New newEl;

public TextualModsSimpleType getTypeAttr() {
return typeAttr;
}

public void setTypeAttr(final TextualModsSimpleType typeAttr) {
this.typeAttr = typeAttr;
}
public Old getOld() {
return old;
}

public void setOld(final Old old) {
this.old = old;
}
public New getNew() {
return newEl;
}

public void setNew(final New newEl) {
this.newEl = newEl;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"duration","application","new","old","source","condition","efficacy","force","destination"};
    return  subtypes;
}
}

