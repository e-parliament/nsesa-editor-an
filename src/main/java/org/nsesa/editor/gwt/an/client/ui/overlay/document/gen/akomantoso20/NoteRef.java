package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PlacementTypeSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class NoteRef extends MarkeroptComplexType  {

// CONSTRUCTORS ------------------
    public NoteRef() {
        super(DOM.createElement("noteRef"));
    }

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
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("hrefAttr", getHrefAttr().getValue());
        attrs.put("markerAttr", getMarkerAttr().getValue());
        attrs.put("placementAttr", getPlacementAttr().value());
        attrs.put("placementBaseAttr", getPlacementBaseAttr().getValue());

        return attrs;
    }

}

