package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlockElementsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BasicContainersGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class BasicoptComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public BasicoptComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private java.util.List<BlockElementsGroup> blockElementses = new ArrayList<BlockElementsGroup>();
private java.util.List<BasicContainersGroup> basicContainerses = new ArrayList<BasicContainersGroup>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}
public java.util.List<BlockElementsGroup> getBlockElements() {
return blockElementses;
}

public void setBlockElements(final java.util.List<BlockElementsGroup> blockElementses) {
this.blockElementses = blockElementses;
}
public java.util.List<BasicContainersGroup> getBasicContainers() {
return basicContainerses;
}

public void setBasicContainers(final java.util.List<BasicContainersGroup> basicContainerses) {
this.basicContainerses = basicContainerses;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"blockElementsGroup","basicContainersGroup","coreoptAttrGroup"};
    return  subtypes;
}
}

