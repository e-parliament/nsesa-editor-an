package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DocumentTypeGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Interstitial;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class CollectionBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public CollectionBodyTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private java.util.List<DocumentTypeGroup> documentTypes = new ArrayList<DocumentTypeGroup>();
private java.util.List<ComponentRef> componentRefs = new ArrayList<ComponentRef>();
private java.util.List<Interstitial> interstitials = new ArrayList<Interstitial>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}
public java.util.List<DocumentTypeGroup> getDocumentType() {
return documentTypes;
}

public void setDocumentType(final java.util.List<DocumentTypeGroup> documentTypes) {
this.documentTypes = documentTypes;
}
public java.util.List<ComponentRef> getComponentRef() {
return componentRefs;
}

public void setComponentRef(final java.util.List<ComponentRef> componentRefs) {
this.componentRefs = componentRefs;
}
public java.util.List<Interstitial> getInterstitial() {
return interstitials;
}

public void setInterstitial(final java.util.List<Interstitial> interstitials) {
this.interstitials = interstitials;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"componentRef","interstitial","coreoptAttrGroup","documentTypeGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

