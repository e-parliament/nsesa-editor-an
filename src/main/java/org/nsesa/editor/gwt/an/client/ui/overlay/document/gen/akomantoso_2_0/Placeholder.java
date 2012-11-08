package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Placeholder extends InlineComplexType  {

// CONSTRUCTORS ------------------
public Placeholder(Element element) {
    super(element);
}

// FIELDS ------------------
private StringSimpleType originalText;

public StringSimpleType getOriginalText() {
return originalText;
}

public void setOriginalText(final StringSimpleType originalText) {
this.originalText = originalText;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","coreoptAttrGroup","stringSimpleType"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

