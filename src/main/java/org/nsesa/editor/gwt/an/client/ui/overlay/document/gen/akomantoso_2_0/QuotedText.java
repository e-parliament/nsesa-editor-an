package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class QuotedText extends InlineComplexType  {

// CONSTRUCTORS ------------------
public QuotedText(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType forURI;

public AnyURISimpleType getFor() {
return forURI;
}

public void setFor(final AnyURISimpleType forURI) {
this.forURI = forURI;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","coreoptAttrGroup","anyURISimpleType"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

