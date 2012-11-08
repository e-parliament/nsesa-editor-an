package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EventRef;
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
private SourceAttrGroup source;
private java.util.List<EventRef> eventRefs = new ArrayList<EventRef>();

public SourceAttrGroup getSource() {
return source;
}

public void setSource(final SourceAttrGroup source) {
this.source = source;
}
public java.util.List<EventRef> getEventRef() {
return eventRefs;
}

public void setEventRef(final java.util.List<EventRef> eventRefs) {
this.eventRefs = eventRefs;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"sourceAttrGroup","eventRef"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

