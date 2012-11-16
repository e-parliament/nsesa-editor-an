package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PlacementTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
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
    private StringSimpleType markerAttr;
    private PlacementTypeSimpleType placementAttr;
    private AnyURISimpleType placementBaseAttr;
    private AnyURISimpleType hrefAttr;
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
        String[] subtypes = new String[]{};
        return  subtypes;
    }

    @Override
    public void addAmendableWidget(final AmendableWidget widget) {
        boolean canAdd = false;
        for (String type : getAllowedChildTypes()) {
            if (type.equalsIgnoreCase(widget.getType())) {
                canAdd = true;
            }
        }
        if (!canAdd) {
            throw new RuntimeException("Not supported child type:" + widget);
        }
        super.addAmendableWidget(widget);
    }

}

