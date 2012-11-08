package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.WorkPropertiesGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FRBRWork extends CorePropertiesComplexType  {

// CONSTRUCTORS ------------------
public FRBRWork(Element element) {
    super(element);
}

// FIELDS ------------------
private WorkPropertiesGroup workProperties;

public WorkPropertiesGroup getWorkProperties() {
return workProperties;
}

public void setWorkProperties(final WorkPropertiesGroup workProperties) {
this.workProperties = workProperties;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"FRBRthis","FRBRalias","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation","workPropertiesGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

