package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TemporalGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class TemporalData extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public TemporalData(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<TemporalGroup> temporalGroups = new ArrayList<TemporalGroup>();
private AnyURISimpleType sourceAttr;

public java.util.List<TemporalGroup> getTemporalGroup() {
return temporalGroups;
}

public void setTemporalGroup(final java.util.List<TemporalGroup> temporalGroups) {
this.temporalGroups = temporalGroups;
}
public AnyURISimpleType getSourceAttr() {
return sourceAttr;
}

public void setSourceAttr(final AnyURISimpleType sourceAttr) {
this.sourceAttr = sourceAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"temporalGroup"};
    return  subtypes;
}
}

