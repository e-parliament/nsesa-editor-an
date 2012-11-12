package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Source;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Destination;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Force;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Efficacy;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Application;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Duration;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Condition;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.StatusTypeSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ModificationTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ModificationTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<Source> sources = new ArrayList<Source>();
private java.util.List<Destination> destinations = new ArrayList<Destination>();
private Force force;
private Efficacy efficacy;
private Application application;
private Duration duration;
private Condition condition;
private AnyURISimpleType refersToAttr;
private AmendableWidgetImpl wildcardContentAttr;
private BooleanSimpleType exclusionAttr;
private BooleanSimpleType incompleteAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private StatusTypeSimpleType statusAttr;
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
public Force getForce() {
return force;
}

public void setForce(final Force force) {
this.force = force;
}
public Efficacy getEfficacy() {
return efficacy;
}

public void setEfficacy(final Efficacy efficacy) {
this.efficacy = efficacy;
}
public Application getApplication() {
return application;
}

public void setApplication(final Application application) {
this.application = application;
}
public Duration getDuration() {
return duration;
}

public void setDuration(final Duration duration) {
this.duration = duration;
}
public Condition getCondition() {
return condition;
}

public void setCondition(final Condition condition) {
this.condition = condition;
}
public AnyURISimpleType getRefersToAttr() {
return refersToAttr;
}

public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
this.refersToAttr = refersToAttr;
}
public AmendableWidgetImpl getWildcardContentAttr() {
return wildcardContentAttr;
}

public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
this.wildcardContentAttr = wildcardContentAttr;
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
public StatusTypeSimpleType getStatusAttr() {
return statusAttr;
}

public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
this.statusAttr = statusAttr;
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
    String[] subtypes = new String[]{"duration","application","source","condition","efficacy","force","destination"};
    return  subtypes;
}
}

