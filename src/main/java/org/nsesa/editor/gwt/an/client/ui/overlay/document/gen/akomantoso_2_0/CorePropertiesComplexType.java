package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRthis;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRuri;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRalias;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRdate;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRauthor;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentInfo;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Preservation;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class CorePropertiesComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public CorePropertiesComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private FRBRthis FRBRthis;
private java.util.List<FRBRuri> FRBRuris = new ArrayList<FRBRuri>();
private java.util.List<FRBRalias> FRBRaliases = new ArrayList<FRBRalias>();
private java.util.List<FRBRdate> FRBRdates = new ArrayList<FRBRdate>();
private java.util.List<FRBRauthor> FRBRauthors = new ArrayList<FRBRauthor>();
private ComponentInfo componentInfo;
private Preservation preservation;

public FRBRthis getFRBRthis() {
return FRBRthis;
}

public void setFRBRthis(final FRBRthis FRBRthis) {
this.FRBRthis = FRBRthis;
}
public java.util.List<FRBRuri> getFRBRuri() {
return FRBRuris;
}

public void setFRBRuri(final java.util.List<FRBRuri> FRBRuris) {
this.FRBRuris = FRBRuris;
}
public java.util.List<FRBRalias> getFRBRalias() {
return FRBRaliases;
}

public void setFRBRalias(final java.util.List<FRBRalias> FRBRaliases) {
this.FRBRaliases = FRBRaliases;
}
public java.util.List<FRBRdate> getFRBRdate() {
return FRBRdates;
}

public void setFRBRdate(final java.util.List<FRBRdate> FRBRdates) {
this.FRBRdates = FRBRdates;
}
public java.util.List<FRBRauthor> getFRBRauthor() {
return FRBRauthors;
}

public void setFRBRauthor(final java.util.List<FRBRauthor> FRBRauthors) {
this.FRBRauthors = FRBRauthors;
}
public ComponentInfo getComponentInfo() {
return componentInfo;
}

public void setComponentInfo(final ComponentInfo componentInfo) {
this.componentInfo = componentInfo;
}
public Preservation getPreservation() {
return preservation;
}

public void setPreservation(final Preservation preservation) {
this.preservation = preservation;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"FRBRthis","FRBRalias","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

