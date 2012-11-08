package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentRef;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Attachments extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Attachments(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private java.util.List<ComponentRef> componentRefs = new ArrayList<ComponentRef>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}
public java.util.List<ComponentRef> getComponentRef() {
return componentRefs;
}

public void setComponentRef(final java.util.List<ComponentRef> componentRefs) {
this.componentRefs = componentRefs;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"componentRef","coreoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

