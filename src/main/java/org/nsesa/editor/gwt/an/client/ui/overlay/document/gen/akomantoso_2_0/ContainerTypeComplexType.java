package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorereqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NameAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlockElementsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Container;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ContainerTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ContainerTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CorereqAttrGroup corereq;
private NameAttrGroup name;
private java.util.List<BlockElementsGroup> blockElementses = new ArrayList<BlockElementsGroup>();
private java.util.List<Container> containers = new ArrayList<Container>();

public CorereqAttrGroup getCorereq() {
return corereq;
}

public void setCorereq(final CorereqAttrGroup corereq) {
this.corereq = corereq;
}
public NameAttrGroup getName() {
return name;
}

public void setName(final NameAttrGroup name) {
this.name = name;
}
public java.util.List<BlockElementsGroup> getBlockElements() {
return blockElementses;
}

public void setBlockElements(final java.util.List<BlockElementsGroup> blockElementses) {
this.blockElementses = blockElementses;
}
public java.util.List<Container> getContainer() {
return containers;
}

public void setContainer(final java.util.List<Container> containers) {
this.containers = containers;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"blockElementsGroup","container","nameAttrGroup","corereqAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

