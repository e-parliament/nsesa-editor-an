package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DateAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Date extends InlineComplexType  {

// CONSTRUCTORS ------------------
public Date(Element element) {
    super(element);
}

// FIELDS ------------------
private DateAttrGroup date;

public DateAttrGroup getDate() {
return date;
}

public void setDate(final DateAttrGroup date) {
this.date = date;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","coreoptAttrGroup","dateAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

