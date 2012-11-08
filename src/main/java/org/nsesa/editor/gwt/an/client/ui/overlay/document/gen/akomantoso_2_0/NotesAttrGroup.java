package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PlacementTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
/**
* This file is generated.
*/
public class NotesAttrGroup   {

// CONSTRUCTORS ------------------

// FIELDS ------------------
private StringSimpleType marker;
private PlacementTypeSimpleType placement;
private AnyURISimpleType placementBase;

public StringSimpleType getMarker() {
return marker;
}

public void setMarker(final StringSimpleType marker) {
this.marker = marker;
}
public PlacementTypeSimpleType getPlacement() {
return placement;
}

public void setPlacement(final PlacementTypeSimpleType placement) {
this.placement = placement;
}
public AnyURISimpleType getPlacementBase() {
return placementBase;
}

public void setPlacementBase(final AnyURISimpleType placementBase) {
this.placementBase = placementBase;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

