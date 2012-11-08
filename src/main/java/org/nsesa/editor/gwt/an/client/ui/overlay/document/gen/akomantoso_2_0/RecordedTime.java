package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TimeTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TimeAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class RecordedTime extends InlineComplexType  {

// CONSTRUCTORS ------------------
public RecordedTime(Element element) {
    super(element);
}

// FIELDS ------------------
private TimeTypeSimpleType typez;
private TimeAttrGroup time;

public TimeTypeSimpleType getTypez() {
return typez;
}

public void setTypez(final TimeTypeSimpleType typez) {
this.typez = typez;
}
public TimeAttrGroup getTime() {
return time;
}

public void setTime(final TimeAttrGroup time) {
this.time = time;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"inlineCMGroup","timeAttrGroup","coreoptAttrGroup","timeTypeSimpleType"};
    return  subtypes;
}
}

