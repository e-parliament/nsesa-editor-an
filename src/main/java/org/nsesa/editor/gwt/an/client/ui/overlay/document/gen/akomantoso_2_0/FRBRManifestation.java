package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ManifPropertiesGroup;
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
private ManifPropertiesGroup manifProperties;

public ManifPropertiesGroup getManifProperties() {
return manifProperties;
}

public void setManifProperties(final ManifPropertiesGroup manifProperties) {
this.manifProperties = manifProperties;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"FRBRthis","FRBRalias","componentInfo","FRBRuri","FRBRauthor","FRBRdate","manifPropertiesGroup","preservation"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

