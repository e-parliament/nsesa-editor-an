package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorereqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ContainerElementsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ANcontainersGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlockElementsGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AlthierarchyComplexType extends BasehierarchyComplexType  {

// CONSTRUCTORS ------------------
public AlthierarchyComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CorereqAttrGroup corereq;
private java.util.List<ContainerElementsGroup> containerElementses = new ArrayList<ContainerElementsGroup>();
private java.util.List<ComponentRef> componentRefs = new ArrayList<ComponentRef>();
private java.util.List<ANcontainersGroup> ANcontainerses = new ArrayList<ANcontainersGroup>();
private java.util.List<BlockElementsGroup> blockElementses = new ArrayList<BlockElementsGroup>();

public CorereqAttrGroup getCorereq() {
return corereq;
}

public void setCorereq(final CorereqAttrGroup corereq) {
this.corereq = corereq;
}
public java.util.List<ContainerElementsGroup> getContainerElements() {
return containerElementses;
}

public void setContainerElements(final java.util.List<ContainerElementsGroup> containerElementses) {
this.containerElementses = containerElementses;
}
public java.util.List<ComponentRef> getComponentRef() {
return componentRefs;
}

public void setComponentRef(final java.util.List<ComponentRef> componentRefs) {
this.componentRefs = componentRefs;
}
public java.util.List<ANcontainersGroup> getANcontainers() {
return ANcontainerses;
}

public void setANcontainers(final java.util.List<ANcontainersGroup> ANcontainerses) {
this.ANcontainerses = ANcontainerses;
}
public java.util.List<BlockElementsGroup> getBlockElements() {
return blockElementses;
}

public void setBlockElements(final java.util.List<BlockElementsGroup> blockElementses) {
this.blockElementses = blockElementses;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"blockElementsGroup","componentRef","containerElementsGroup","num","ANcontainersGroup","subheading","corereqAttrGroup","heading"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

