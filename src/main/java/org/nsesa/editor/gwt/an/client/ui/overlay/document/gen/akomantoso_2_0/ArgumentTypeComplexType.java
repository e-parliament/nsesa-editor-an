package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PosTypeSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ArgumentTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ArgumentTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType upToAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AnyURISimpleType hrefAttr;
private PosTypeSimpleType posAttr;
private AmendableWidgetImpl wildcardContentAttr;

public AnyURISimpleType getUpToAttr() {
return upToAttr;
}

public void setUpToAttr(final AnyURISimpleType upToAttr) {
this.upToAttr = upToAttr;
}
public IDSimpleType getIdAttr() {
return idAttr;
}

public void setIdAttr(final IDSimpleType idAttr) {
this.idAttr = idAttr;
}
public NMTOKENSimpleType getEvolvingIdAttr() {
return evolvingIdAttr;
}

public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
this.evolvingIdAttr = evolvingIdAttr;
}
public AnyURISimpleType getHrefAttr() {
return hrefAttr;
}

public void setHrefAttr(final AnyURISimpleType hrefAttr) {
this.hrefAttr = hrefAttr;
}
public PosTypeSimpleType getPosAttr() {
return posAttr;
}

public void setPosAttr(final PosTypeSimpleType posAttr) {
this.posAttr = posAttr;
}
public AmendableWidgetImpl getWildcardContentAttr() {
return wildcardContentAttr;
}

public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
this.wildcardContentAttr = wildcardContentAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{};
    return  subtypes;
}
}

