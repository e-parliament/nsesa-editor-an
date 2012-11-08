package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NameAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DateAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FRBRdate extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
public FRBRdate(Element element) {
    super(element);
}

// FIELDS ------------------
private NameAttrGroup name;
private DateAttrGroup date;

public NameAttrGroup getName() {
return name;
}

public void setName(final NameAttrGroup name) {
this.name = name;
}
public DateAttrGroup getDate() {
return date;
}

public void setDate(final DateAttrGroup date) {
this.date = date;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"coreAttrGroup","nameAttrGroup","idoptAttrGroup","dateAttrGroup"};
    return  subtypes;
}
}

