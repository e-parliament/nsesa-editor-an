package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DocumentTypeGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Components;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AkomaNtosoTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public AkomaNtosoTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private DocumentTypeGroup documentType;
private Components components;

public DocumentTypeGroup getDocumentType() {
return documentType;
}

public void setDocumentType(final DocumentTypeGroup documentType) {
this.documentType = documentType;
}
public Components getComponents() {
return components;
}

public void setComponents(final Components components) {
this.components = components;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"components","documentTypeGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

