package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ShowAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SrcAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class SrcTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public SrcTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private IdoptAttrGroup idopt;
private CoreAttrGroup core;
private ShowAttrGroup show;
private SrcAttrGroup src;

public IdoptAttrGroup getIdopt() {
return idopt;
}

public void setIdopt(final IdoptAttrGroup idopt) {
this.idopt = idopt;
}
public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}
public ShowAttrGroup getShow() {
return show;
}

public void setShow(final ShowAttrGroup show) {
this.show = show;
}
public SrcAttrGroup getSrc() {
return src;
}

public void setSrc(final SrcAttrGroup src) {
this.src = src;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"coreAttrGroup","showAttrGroup","idoptAttrGroup","srcAttrGroup"};
    return  subtypes;
}
}

