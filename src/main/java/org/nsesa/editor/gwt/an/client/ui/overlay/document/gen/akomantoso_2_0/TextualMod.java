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
private TextualModsSimpleType typez;
private Old old;
private New newEl;

public TextualModsSimpleType getTypez() {
return typez;
}

public void setTypez(final TextualModsSimpleType typez) {
this.typez = typez;
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
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"old","application","modifiersAttrGroup","coreAttrGroup","condition","TextualModsSimpleType","idreqAttrGroup","efficacy","destination","duration","new","source","enactmentAttrGroup","force","refersAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

