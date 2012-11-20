package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ParliamentaryAnalysisTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public ParliamentaryAnalysisTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AmendableWidgetImpl wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType outcomeAttr;
    private AnyURISimpleType hrefAttr;
    private AnyURISimpleType refersToAttr;
    public java.util.List<Quorum> getQuorums() {
        java.util.List<Quorum> result = new ArrayList<Quorum>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Quorum".equalsIgnoreCase(widget.getType())) {
                result.add((Quorum)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Count> getCounts() {
        java.util.List<Count> result = new ArrayList<Count>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Count".equalsIgnoreCase(widget.getType())) {
                result.add((Count)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public AmendableWidgetImpl getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
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
    public AnyURISimpleType getOutcomeAttr() {
        return outcomeAttr;
    }
    public void setOutcomeAttr(final AnyURISimpleType outcomeAttr) {
        this.outcomeAttr = outcomeAttr;
    }
    public AnyURISimpleType getHrefAttr() {
        return hrefAttr;
    }
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"quorum","count"};
    }

}

