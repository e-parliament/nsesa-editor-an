package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Quorum;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Count;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ParliamentaryAnalysisTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public ParliamentaryAnalysisTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType refersToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType hrefAttr;
    private AnyURISimpleType outcomeAttr;
    private AmendableWidgetImpl wildcardContentAttr;
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
    public AnyURISimpleType getRefersToAttr() {
        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
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
    public AnyURISimpleType getHrefAttr() {
        return hrefAttr;
    }
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    public AnyURISimpleType getOutcomeAttr() {
        return outcomeAttr;
    }
    public void setOutcomeAttr(final AnyURISimpleType outcomeAttr) {
        this.outcomeAttr = outcomeAttr;
    }
    public AmendableWidgetImpl getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"quorum","count"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());
        attrs.put("hrefAttr", getHrefAttr().getValue());
        attrs.put("outcomeAttr", getOutcomeAttr().getValue());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().getContent());

        return attrs;
    }

}

