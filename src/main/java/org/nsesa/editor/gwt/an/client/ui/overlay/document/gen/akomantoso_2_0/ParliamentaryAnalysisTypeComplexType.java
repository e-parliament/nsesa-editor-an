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
/**
* This file is generated.
*/
public class ParliamentaryAnalysisTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ParliamentaryAnalysisTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<Quorum> quorums = new ArrayList<Quorum>();
private java.util.List<Count> counts = new ArrayList<Count>();
private AnyURISimpleType hrefAttr;
private AmendableWidgetImpl wildcardContentAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AnyURISimpleType outcomeAttr;
private AnyURISimpleType refersToAttr;

public java.util.List<Quorum> getQuorum() {
return quorums;
}

public void setQuorum(final java.util.List<Quorum> quorums) {
this.quorums = quorums;
}
public java.util.List<Count> getCount() {
return counts;
}

public void setCount(final java.util.List<Count> counts) {
this.counts = counts;
}
public AnyURISimpleType getHrefAttr() {
return hrefAttr;
}

public void setHrefAttr(final AnyURISimpleType hrefAttr) {
this.hrefAttr = hrefAttr;
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
    String[] subtypes = new String[]{"quorum","count"};
    return  subtypes;
}
}

