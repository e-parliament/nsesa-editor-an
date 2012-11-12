package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EventTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.YesNoTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class EventRef extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
public EventRef(Element element) {
    super(element);
}

// FIELDS ------------------
private EventTypeSimpleType typeAttr;
private YesNoTypeSimpleType originatingExpressionAttr;
private DateSimpleType dateAttr;
private AnyURISimpleType sourceAttr;

public EventTypeSimpleType getTypeAttr() {
return typeAttr;
}

public void setTypeAttr(final EventTypeSimpleType typeAttr) {
this.typeAttr = typeAttr;
}
public YesNoTypeSimpleType getOriginatingExpressionAttr() {
return originatingExpressionAttr;
}

public void setOriginatingExpressionAttr(final YesNoTypeSimpleType originatingExpressionAttr) {
this.originatingExpressionAttr = originatingExpressionAttr;
}
public DateSimpleType getDateAttr() {
return dateAttr;
}

public void setDateAttr(final DateSimpleType dateAttr) {
this.dateAttr = dateAttr;
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
    String[] subtypes = new String[]{"*"};
    return  subtypes;
}
}

