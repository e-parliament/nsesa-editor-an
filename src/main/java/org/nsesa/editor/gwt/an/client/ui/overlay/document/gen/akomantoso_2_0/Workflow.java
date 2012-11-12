package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Step;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Workflow extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Workflow(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<Step> steps = new ArrayList<Step>();
private AnyURISimpleType sourceAttr;

public java.util.List<Step> getStep() {
return steps;
}

public void setStep(final java.util.List<Step> steps) {
this.steps = steps;
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
    String[] subtypes = new String[]{"step"};
    return  subtypes;
}
}

