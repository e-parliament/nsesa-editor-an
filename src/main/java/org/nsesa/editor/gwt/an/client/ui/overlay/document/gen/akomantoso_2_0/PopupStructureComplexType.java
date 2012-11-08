package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorereqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.HierElementsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlockElementsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Intro;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Wrap;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Heading;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Subheading;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Content;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Num;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ContainerElementsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ANcontainersGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Recital;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Citation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentRef;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class PopupStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public PopupStructureComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CorereqAttrGroup corereq;
private java.util.List<HierElementsGroup> hierElementses = new ArrayList<HierElementsGroup>();
private java.util.List<BlockElementsGroup> blockElementses = new ArrayList<BlockElementsGroup>();
private java.util.List<Intro> intros = new ArrayList<Intro>();
private java.util.List<Wrap> wraps = new ArrayList<Wrap>();
private java.util.List<Heading> headings = new ArrayList<Heading>();
private java.util.List<Subheading> subheadings = new ArrayList<Subheading>();
private java.util.List<Content> contentzs = new ArrayList<Content>();
private java.util.List<Num> nums = new ArrayList<Num>();
private java.util.List<ContainerElementsGroup> containerElementses = new ArrayList<ContainerElementsGroup>();
private java.util.List<ANcontainersGroup> ANcontainerses = new ArrayList<ANcontainersGroup>();
private java.util.List<Recital> recitals = new ArrayList<Recital>();
private java.util.List<Citation> citations = new ArrayList<Citation>();
private java.util.List<ComponentRef> componentRefs = new ArrayList<ComponentRef>();

public CorereqAttrGroup getCorereq() {
return corereq;
}

public void setCorereq(final CorereqAttrGroup corereq) {
this.corereq = corereq;
}
public java.util.List<HierElementsGroup> getHierElements() {
return hierElementses;
}

public void setHierElements(final java.util.List<HierElementsGroup> hierElementses) {
this.hierElementses = hierElementses;
}
public java.util.List<BlockElementsGroup> getBlockElements() {
return blockElementses;
}

public void setBlockElements(final java.util.List<BlockElementsGroup> blockElementses) {
this.blockElementses = blockElementses;
}
public java.util.List<Intro> getIntro() {
return intros;
}

public void setIntro(final java.util.List<Intro> intros) {
this.intros = intros;
}
public java.util.List<Wrap> getWrap() {
return wraps;
}

public void setWrap(final java.util.List<Wrap> wraps) {
this.wraps = wraps;
}
public java.util.List<Heading> getHeading() {
return headings;
}

public void setHeading(final java.util.List<Heading> headings) {
this.headings = headings;
}
public java.util.List<Subheading> getSubheading() {
return subheadings;
}

public void setSubheading(final java.util.List<Subheading> subheadings) {
this.subheadings = subheadings;
}
public java.util.List<Content> getContentz() {
return contentzs;
}

public void setContentz(final java.util.List<Content> contentzs) {
this.contentzs = contentzs;
}
public java.util.List<Num> getNum() {
return nums;
}

public void setNum(final java.util.List<Num> nums) {
this.nums = nums;
}
public java.util.List<ContainerElementsGroup> getContainerElements() {
return containerElementses;
}

public void setContainerElements(final java.util.List<ContainerElementsGroup> containerElementses) {
this.containerElementses = containerElementses;
}
public java.util.List<ANcontainersGroup> getANcontainers() {
return ANcontainerses;
}

public void setANcontainers(final java.util.List<ANcontainersGroup> ANcontainerses) {
this.ANcontainerses = ANcontainerses;
}
public java.util.List<Recital> getRecital() {
return recitals;
}

public void setRecital(final java.util.List<Recital> recitals) {
this.recitals = recitals;
}
public java.util.List<Citation> getCitation() {
return citations;
}

public void setCitation(final java.util.List<Citation> citations) {
this.citations = citations;
}
public java.util.List<ComponentRef> getComponentRef() {
return componentRefs;
}

public void setComponentRef(final java.util.List<ComponentRef> componentRefs) {
this.componentRefs = componentRefs;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"componentRef","wrap","containerElementsGroup","citation","ANcontainersGroup","subheading","hierElementsGroup","intro","blockElementsGroup","content","recital","num","corereqAttrGroup","heading"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

