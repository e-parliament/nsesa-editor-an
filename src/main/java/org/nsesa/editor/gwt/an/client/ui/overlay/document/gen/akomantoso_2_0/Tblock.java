package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ItemTypeComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Tblock extends ItemTypeComplexType  {

// CONSTRUCTORS ------------------
public Tblock(Element element) {
    super(element);
}

// FIELDS ------------------

/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"num","ul","toc","tblock","subheading","blockList","p","block","table","ol","foreign","heading"};
    return  subtypes;
}
}

