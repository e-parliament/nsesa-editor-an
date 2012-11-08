package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.JudicialArgumentsComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Judicial extends JudicialArgumentsComplexType  {

// CONSTRUCTORS ------------------
public Judicial(Element element) {
    super(element);
}

// FIELDS ------------------

/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"overrules","result","dissentsFrom","derogates","extends","contrasts","restricts","applies","isAnalogTo","supports","distinguishes","putsInQuestion"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

