package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TimeInterval;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class TemporalGroup extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public TemporalGroup(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<TimeInterval> timeIntervals = new ArrayList<TimeInterval>();
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AmendableWidgetImpl wildcardContentAttr;

public java.util.List<TimeInterval> getTimeInterval() {
return timeIntervals;
}

public void setTimeInterval(final java.util.List<TimeInterval> timeIntervals) {
this.timeIntervals = timeIntervals;
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
    String[] subtypes = new String[]{"timeInterval"};
    return  subtypes;
}
}

