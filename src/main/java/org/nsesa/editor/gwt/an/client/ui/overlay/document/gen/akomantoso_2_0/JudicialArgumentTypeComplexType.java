package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Source;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Destination;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Condition;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class JudicialArgumentTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public JudicialArgumentTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<Source> sources = new ArrayList<Source>();
private java.util.List<Destination> destinations = new ArrayList<Destination>();
private Condition condition;
private BooleanSimpleType exclusionAttr;
private BooleanSimpleType incompleteAttr;
private AnyURISimpleType refersToAttr;
private StatusTypeSimpleType statusAttr;
private AmendableWidgetImpl wildcardContentAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AnyURISimpleType periodAttr;

public java.util.List<Source> getSource() {
return sources;
}

public void setSource(final java.util.List<Source> sources) {
this.sources = sources;
}
public java.util.List<Destination> getDestination() {
return destinations;
}

public void setDestination(final java.util.List<Destination> destinations) {
this.destinations = destinations;
}
public Condition getCondition() {
return condition;
}

public void setCondition(final Condition condition) {
this.condition = condition;
}
public BooleanSimpleType getExclusionAttr() {
return exclusionAttr;
}

public void setExclusionAttr(final BooleanSimpleType exclusionAttr) {
this.exclusionAttr = exclusionAttr;
}
public BooleanSimpleType getIncompleteAttr() {
return incompleteAttr;
}

public void setIncompleteAttr(final BooleanSimpleType incompleteAttr) {
this.incompleteAttr = incompleteAttr;
}
public AnyURISimpleType getRefersToAttr() {
return refersToAttr;
}

public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
this.refersToAttr = refersToAttr;
}
public StatusTypeSimpleType getStatusAttr() {
return statusAttr;
}

public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
this.statusAttr = statusAttr;
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
public AnyURISimpleType getPeriodAttr() {
return periodAttr;
}

public void setPeriodAttr(final AnyURISimpleType periodAttr) {
this.periodAttr = periodAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"source","condition","destination"};
    return  subtypes;
}
}

