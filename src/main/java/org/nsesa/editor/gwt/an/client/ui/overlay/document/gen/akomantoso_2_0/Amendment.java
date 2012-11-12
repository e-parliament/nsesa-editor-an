package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AmendmentStructureComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Amendment extends AmendmentStructureComplexType  {

// CONSTRUCTORS ------------------
public Amendment(Element element) {
    super(element);
}

// FIELDS ------------------

/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"conclusions","preface","coverPage","attachments","amendmentBody","meta"};
    return  subtypes;
}
}

