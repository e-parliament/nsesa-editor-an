package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PopupStructureComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PlacementTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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

public class AuthorialNote extends PopupStructureComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "authorialNote");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget authorialNote");
return span;
}

// CONSTRUCTORS ------------------
public AuthorialNote() {
super(create());
setType("authorialNote");
}

public AuthorialNote(Element element) {
super(element);
}

// FIELDS ------------------
private StringSimpleType markerAttr;
private PlacementTypeSimpleType placementAttr;
private AnyURISimpleType placementBaseAttr;

        public StringSimpleType getMarkerAttr() {
        if (markerAttr == null) {
                markerAttr = new StringSimpleType();
                markerAttr.setValue(getElement().getAttribute("marker"));
        }

        return markerAttr;
        }
        //DSL Style get value
        public StringSimpleType markerAttr() {
        return  getMarkerAttr();
        }

        public void setMarkerAttr(final StringSimpleType markerAttr) {
        this.markerAttr = markerAttr;
        }
        //DSL Style set value
        public AuthorialNote markerAttr(final StringSimpleType markerAttr) {
        setMarkerAttr(markerAttr);
        return this;
        }
        public PlacementTypeSimpleType getPlacementAttr() {
        if (placementAttr == null) {
                placementAttr = PlacementTypeSimpleType.fromString(getElement().getAttribute("placement"));
        }

        return placementAttr;
        }
        //DSL Style get value
        public PlacementTypeSimpleType placementAttr() {
        return  getPlacementAttr();
        }

        public void setPlacementAttr(final PlacementTypeSimpleType placementAttr) {
        this.placementAttr = placementAttr;
        }
        //DSL Style set value
        public AuthorialNote placementAttr(final PlacementTypeSimpleType placementAttr) {
        setPlacementAttr(placementAttr);
        return this;
        }
        public AnyURISimpleType getPlacementBaseAttr() {
        if (placementBaseAttr == null) {
                placementBaseAttr = new AnyURISimpleType();
                placementBaseAttr.setValue(getElement().getAttribute("placementBase"));
        }

        return placementBaseAttr;
        }
        //DSL Style get value
        public AnyURISimpleType placementBaseAttr() {
        return  getPlacementBaseAttr();
        }

        public void setPlacementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        this.placementBaseAttr = placementBaseAttr;
        }
        //DSL Style set value
        public AuthorialNote placementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        setPlacementBaseAttr(placementBaseAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"address","adjournment","administrationOfOath","alinea","answer","article","block","blockList","book","chapter","citation","clause","communication","componentRef","container","content","debateSection","declarationOfVote","div","division","foreign","hcontainer","heading","indent","intro","list","ministerialStatements","narrative","nationalInterest","noticesOfMotion","num","ol","oralStatements","other","p","papers","paragraph","part","personalStatements","petitions","point","pointOfOrder","prayers","proceduralMotions","question","questions","recital","resolutions","rollCall","scene","section","speech","subchapter","subclause","subheading","sublist","subparagraph","subpart","subsection","subtitle","summary","table","tblock","title","toc","tome","ul","wrap","writtenStatements"};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("marker", getMarkerAttr() != null ? getMarkerAttr().getValue() : null);
        attrs.put("placement", getPlacementAttr() != null ? getPlacementAttr().value() : null);
        attrs.put("placementBase", getPlacementBaseAttr() != null ? getPlacementBaseAttr().getValue() : null);
return attrs;
}
}

