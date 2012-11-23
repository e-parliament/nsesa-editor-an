package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;

import java.util.LinkedHashMap;

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
        if (markerAttr == null) {
            markerAttr = new StringSimpleType();
            markerAttr.setValue(amendableElement.getAttribute("marker"));
        }

        return markerAttr;
    }
    public void setMarkerAttr(final StringSimpleType markerAttr) {
        this.markerAttr = markerAttr;
    }
    public PlacementTypeSimpleType getPlacementAttr() {
        if (placementAttr == null) {
            placementAttr = PlacementTypeSimpleType.fromString(amendableElement.getAttribute("placement"));
        }

        return placementAttr;
    }
    public void setPlacementAttr(final PlacementTypeSimpleType placementAttr) {
        this.placementAttr = placementAttr;
    }
    public AnyURISimpleType getPlacementBaseAttr() {
        if (placementBaseAttr == null) {
            placementBaseAttr = new AnyURISimpleType();
            placementBaseAttr.setValue(amendableElement.getAttribute("placementBase"));
        }

        return placementBaseAttr;
    }
    public void setPlacementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        this.placementBaseAttr = placementBaseAttr;
    }
    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(amendableElement.getAttribute("href"));
        }

        return hrefAttr;
    }
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("markerAttr", getMarkerAttr() != null ? getMarkerAttr().getValue() : null);
        attrs.put("placementAttr", getPlacementAttr() != null ? getPlacementAttr().value() : null);
        attrs.put("placementBaseAttr", getPlacementBaseAttr() != null ? getPlacementBaseAttr().getValue() : null);
        attrs.put("hrefAttr", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        return attrs;
    }

}

