package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PlacementTypeSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class NoteRef extends MarkeroptComplexType  {

// CONSTRUCTORS ------------------
public NoteRef(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType hrefAttr;
private StringSimpleType markerAttr;
private PlacementTypeSimpleType placementAttr;
private AnyURISimpleType placementBaseAttr;

public AnyURISimpleType getHrefAttr() {
return hrefAttr;
}

public void setHrefAttr(final AnyURISimpleType hrefAttr) {
this.hrefAttr = hrefAttr;
}
public StringSimpleType getMarkerAttr() {
return markerAttr;
}

public void setMarkerAttr(final StringSimpleType markerAttr) {
this.markerAttr = markerAttr;
}
public PlacementTypeSimpleType getPlacementAttr() {
return placementAttr;
}

public void setPlacementAttr(final PlacementTypeSimpleType placementAttr) {
this.placementAttr = placementAttr;
}
public AnyURISimpleType getPlacementBaseAttr() {
return placementBaseAttr;
}

public void setPlacementBaseAttr(final AnyURISimpleType placementBaseAttr) {
this.placementBaseAttr = placementBaseAttr;
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

