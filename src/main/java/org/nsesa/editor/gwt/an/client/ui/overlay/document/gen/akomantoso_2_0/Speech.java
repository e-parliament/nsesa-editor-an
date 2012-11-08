package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SpeechTypeComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Speech extends SpeechTypeComplexType  {

// CONSTRUCTORS ------------------
public Speech(Element element) {
    super(element);
}

// FIELDS ------------------

/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"blockElementsGroup","num","subheading","speechAttsAttrGroup","from","coreoptAttrGroup","heading"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

