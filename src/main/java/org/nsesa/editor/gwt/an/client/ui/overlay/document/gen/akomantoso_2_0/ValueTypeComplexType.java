package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ValueAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ValueTypeComplexType extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
public ValueTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private ValueAttrGroup value;

public ValueAttrGroup getValue() {
return value;
}

public void setValue(final ValueAttrGroup value) {
this.value = value;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreAttrGroup","valueAttrGroup","idoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

