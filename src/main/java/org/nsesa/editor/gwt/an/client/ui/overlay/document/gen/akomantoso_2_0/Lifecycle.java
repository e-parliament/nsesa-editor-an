package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EventRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Lifecycle extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Lifecycle(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<EventRef> eventRefs = new ArrayList<EventRef>();
private AnyURISimpleType sourceAttr;

public java.util.List<EventRef> getEventRef() {
return eventRefs;
}

public void setEventRef(final java.util.List<EventRef> eventRefs) {
this.eventRefs = eventRefs;
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
    String[] subtypes = new String[]{"eventRef"};
    return  subtypes;
}
}

