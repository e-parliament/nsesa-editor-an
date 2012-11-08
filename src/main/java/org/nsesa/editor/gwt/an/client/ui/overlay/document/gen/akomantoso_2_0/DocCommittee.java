package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.OptvalueAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class DocCommittee extends InlineComplexType  {

// CONSTRUCTORS ------------------
public DocCommittee(Element element) {
    super(element);
}

// FIELDS ------------------
private OptvalueAttrGroup optvalue;

public OptvalueAttrGroup getOptvalue() {
return optvalue;
}

public void setOptvalue(final OptvalueAttrGroup optvalue) {
this.optvalue = optvalue;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"inlineCMGroup","optvalueAttrGroup","coreoptAttrGroup"};
    return  subtypes;
}
}

