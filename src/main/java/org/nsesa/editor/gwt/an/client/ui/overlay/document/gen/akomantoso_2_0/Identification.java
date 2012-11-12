package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRWork;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRExpression;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRManifestation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRItem;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Identification extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Identification(Element element) {
    super(element);
}

// FIELDS ------------------
private FRBRWork FRBRWork;
private FRBRExpression FRBRExpression;
private FRBRManifestation FRBRManifestation;
private FRBRItem FRBRItem;
private AnyURISimpleType sourceAttr;

public FRBRWork getFRBRWork() {
return FRBRWork;
}

public void setFRBRWork(final FRBRWork FRBRWork) {
this.FRBRWork = FRBRWork;
}
public FRBRExpression getFRBRExpression() {
return FRBRExpression;
}

public void setFRBRExpression(final FRBRExpression FRBRExpression) {
this.FRBRExpression = FRBRExpression;
}
public FRBRManifestation getFRBRManifestation() {
return FRBRManifestation;
}

public void setFRBRManifestation(final FRBRManifestation FRBRManifestation) {
this.FRBRManifestation = FRBRManifestation;
}
public FRBRItem getFRBRItem() {
return FRBRItem;
}

public void setFRBRItem(final FRBRItem FRBRItem) {
this.FRBRItem = FRBRItem;
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
    String[] subtypes = new String[]{"FRBRManifestation","FRBRWork","FRBRItem","FRBRExpression"};
    return  subtypes;
}
}

