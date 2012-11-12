package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Step extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
public Step(Element element) {
    super(element);
}

// FIELDS ------------------
private DateSimpleType dateAttr;
private AnyURISimpleType asAttr;
private AnyURISimpleType actorAttr;
private AnyURISimpleType outcomeAttr;

public DateSimpleType getDateAttr() {
return dateAttr;
}

public void setDateAttr(final DateSimpleType dateAttr) {
this.dateAttr = dateAttr;
}
public AnyURISimpleType getAsAttr() {
return asAttr;
}

public void setAsAttr(final AnyURISimpleType asAttr) {
this.asAttr = asAttr;
}
public AnyURISimpleType getActorAttr() {
return actorAttr;
}

public void setActorAttr(final AnyURISimpleType actorAttr) {
this.actorAttr = actorAttr;
}
public AnyURISimpleType getOutcomeAttr() {
return outcomeAttr;
}

public void setOutcomeAttr(final AnyURISimpleType outcomeAttr) {
this.outcomeAttr = outcomeAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"*"};
    return  subtypes;
}
}

