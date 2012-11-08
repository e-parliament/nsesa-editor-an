package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Num;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Heading;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Subheading;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class BasehierarchyComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public BasehierarchyComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private Num num;
private Heading heading;
private Subheading subheading;

public Num getNum() {
return num;
}

public void setNum(final Num num) {
this.num = num;
}
public Heading getHeading() {
return heading;
}

public void setHeading(final Heading heading) {
this.heading = heading;
}
public Subheading getSubheading() {
return subheading;
}

public void setSubheading(final Subheading subheading) {
this.subheading = subheading;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"num","subheading","heading"};
    return  subtypes;
}
}

