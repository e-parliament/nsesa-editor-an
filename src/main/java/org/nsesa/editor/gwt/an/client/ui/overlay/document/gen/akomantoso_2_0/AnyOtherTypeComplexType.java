package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AnyOtherTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public AnyOtherTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<AmendableWidgetImpl> wildcardContents = new ArrayList<AmendableWidgetImpl>();
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AmendableWidgetImpl wildcardContentAttr;
private AnyURISimpleType hrefAttr;

public java.util.List<AmendableWidgetImpl> getWildcardContent() {
return wildcardContents;
}

public void setWildcardContent(final java.util.List<AmendableWidgetImpl> wildcardContents) {
this.wildcardContents = wildcardContents;
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
public AmendableWidgetImpl getWildcardContentAttr() {
return wildcardContentAttr;
}

public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
this.wildcardContentAttr = wildcardContentAttr;
}
public AnyURISimpleType getHrefAttr() {
return hrefAttr;
}

public void setHrefAttr(final AnyURISimpleType hrefAttr) {
this.hrefAttr = hrefAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"*"};
    return  subtypes;
}
}

