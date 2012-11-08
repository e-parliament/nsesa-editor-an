package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineCMGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class InlineComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public InlineComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private java.util.List<InlineCMGroup> inlineCMs = new ArrayList<InlineCMGroup>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}
public java.util.List<InlineCMGroup> getInlineCM() {
return inlineCMs;
}

public void setInlineCM(final java.util.List<InlineCMGroup> inlineCMs) {
this.inlineCMs = inlineCMs;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","coreoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

