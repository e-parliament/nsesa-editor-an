package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.HierElementsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ContainerElementsGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FragmentBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public FragmentBodyTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private HierElementsGroup hierElements;
private ContainerElementsGroup containerElements;

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}
public HierElementsGroup getHierElements() {
return hierElements;
}

public void setHierElements(final HierElementsGroup hierElements) {
this.hierElements = hierElements;
}
public ContainerElementsGroup getContainerElements() {
return containerElements;
}

public void setContainerElements(final ContainerElementsGroup containerElements) {
this.containerElements = containerElements;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"containerElementsGroup","hierElementsGroup","coreoptAttrGroup"};
    return  subtypes;
}
}

