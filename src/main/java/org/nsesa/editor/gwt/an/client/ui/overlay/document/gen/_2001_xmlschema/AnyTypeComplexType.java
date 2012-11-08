package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AnyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public AnyTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<AmendableWidgetImpl> wildcardContents = new ArrayList<AmendableWidgetImpl>();

public java.util.List<AmendableWidgetImpl> getWildcardContent() {
return wildcardContents;
}

public void setWildcardContent(final java.util.List<AmendableWidgetImpl> wildcardContents) {
this.wildcardContents = wildcardContents;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"*"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

