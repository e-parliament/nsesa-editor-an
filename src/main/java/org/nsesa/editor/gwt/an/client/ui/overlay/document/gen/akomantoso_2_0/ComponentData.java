package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentData;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ComponentData extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ComponentData(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<ComponentData> componentDatas = new ArrayList<ComponentData>();
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AmendableWidgetImpl wildcardContentAttr;
private AnyURISimpleType hrefAttr;
private StringSimpleType nameAttr;
private StringSimpleType showAsAttr;
private StringSimpleType shortFormAttr;

public java.util.List<ComponentData> getComponentData() {
return componentDatas;
}

public void setComponentData(final java.util.List<ComponentData> componentDatas) {
this.componentDatas = componentDatas;
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
public StringSimpleType getNameAttr() {
return nameAttr;
}

public void setNameAttr(final StringSimpleType nameAttr) {
this.nameAttr = nameAttr;
}
public StringSimpleType getShowAsAttr() {
return showAsAttr;
}

public void setShowAsAttr(final StringSimpleType showAsAttr) {
this.showAsAttr = showAsAttr;
}
public StringSimpleType getShortFormAttr() {
return shortFormAttr;
}

public void setShortFormAttr(final StringSimpleType shortFormAttr) {
this.shortFormAttr = shortFormAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"componentData"};
    return  subtypes;
}
}

