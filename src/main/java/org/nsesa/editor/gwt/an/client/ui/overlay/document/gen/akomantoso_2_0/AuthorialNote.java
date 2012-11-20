package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class AuthorialNote extends PopupStructureComplexType  {

// CONSTRUCTORS ------------------
    public AuthorialNote() {
        super(DOM.createElement("authorialNote"));
    }

    public AuthorialNote(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType markerAttr;
    private PlacementTypeSimpleType placementAttr;
    private AnyURISimpleType placementBaseAttr;
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
        return new String[]{"summary","paragraph","tblock","narrative","oralStatements","alinea","blockList","declarationOfVote","adjournment","ol","petitions","componentRef","subchapter","wrap","citation","administrationOfOath","indent","subclause","answer","questions","papers","table","sublist","proceduralMotions","content","speech","nationalInterest","container","scene","foreign","heading","tome","other","subparagraph","toc","subheading","subsection","debateSection","div","resolutions","block","personalStatements","recital","chapter","title","rollCall","division","question","ul","communication","noticesOfMotion","list","section","intro","point","num","article","subpart","address","writtenStatements","hcontainer","p","book","subtitle","pointOfOrder","prayers","ministerialStatements","part","clause"};
    }

}

