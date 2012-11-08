package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RemarkTypeSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Remark extends InlineComplexType  {

// CONSTRUCTORS ------------------
public Remark(Element element) {
    super(element);
}

// FIELDS ------------------
private RemarkTypeSimpleType typez;

public RemarkTypeSimpleType getTypez() {
return typez;
}

public void setTypez(final RemarkTypeSimpleType typez) {
this.typez = typez;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"remarkTypeSimpleType","inlineCMGroup","coreoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

