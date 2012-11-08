package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Step;
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
private SourceAttrGroup source;
private java.util.List<Step> steps = new ArrayList<Step>();

public SourceAttrGroup getSource() {
return source;
}

public void setSource(final SourceAttrGroup source) {
this.source = source;
}
public java.util.List<Step> getStep() {
return steps;
}

public void setStep(final java.util.List<Step> steps) {
this.steps = steps;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"sourceAttrGroup","step"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

