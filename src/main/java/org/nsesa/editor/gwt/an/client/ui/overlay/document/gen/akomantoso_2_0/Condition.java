package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.BooleanSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Condition extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
public Condition(Element element) {
    super(element);
}

// FIELDS ------------------
private BooleanSimpleType frozen;

public BooleanSimpleType getFrozen() {
return frozen;
}

public void setFrozen(final BooleanSimpleType frozen) {
this.frozen = frozen;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreAttrGroup","*","linkoptAttrGroup","booleanSimpleType","idoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

