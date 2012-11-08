package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NameAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ShowAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentData;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ComponentData extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ComponentData(Element element) {
    super(element);
}

// FIELDS ------------------
private NameAttrGroup name;
private CoreAttrGroup core;
private IdreqAttrGroup idreq;
private ShowAttrGroup show;
private LinkAttrGroup link;
private java.util.List<ComponentData> componentDatas = new ArrayList<ComponentData>();

public NameAttrGroup getName() {
return name;
}

public void setName(final NameAttrGroup name) {
this.name = name;
}
public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}
public IdreqAttrGroup getIdreq() {
return idreq;
}

public void setIdreq(final IdreqAttrGroup idreq) {
this.idreq = idreq;
}
public ShowAttrGroup getShow() {
return show;
}

public void setShow(final ShowAttrGroup show) {
this.show = show;
}
public LinkAttrGroup getLink() {
return link;
}

public void setLink(final LinkAttrGroup link) {
this.link = link;
}
public java.util.List<ComponentData> getComponentData() {
return componentDatas;
}

public void setComponentData(final java.util.List<ComponentData> componentDatas) {
this.componentDatas = componentDatas;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreAttrGroup","componentData","nameAttrGroup","showAttrGroup","idreqAttrGroup","linkAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

