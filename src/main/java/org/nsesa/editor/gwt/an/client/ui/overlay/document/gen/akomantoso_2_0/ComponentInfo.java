package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentData;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ComponentInfo extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ComponentInfo(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<ComponentData> componentDatas = new ArrayList<ComponentData>();

public java.util.List<ComponentData> getComponentData() {
return componentDatas;
}

public void setComponentData(final java.util.List<ComponentData> componentDatas) {
this.componentDatas = componentDatas;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"componentData"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

