package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRformat;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FRBRManifestation extends CorePropertiesComplexType  {

// CONSTRUCTORS ------------------
public FRBRManifestation(Element element) {
    super(element);
}

// FIELDS ------------------
private FRBRformat FRBRformat;

public FRBRformat getFRBRformat() {
return FRBRformat;
}

public void setFRBRformat(final FRBRformat FRBRformat) {
this.FRBRformat = FRBRformat;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"FRBRthis","FRBRalias","FRBRformat","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation"};
    return  subtypes;
}
}

