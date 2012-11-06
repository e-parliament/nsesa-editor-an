package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkoptAttrGroup;
import java.lang.String;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkoptAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AnyOtherTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public AnyOtherTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreAttrGroup core;
private IdoptAttrGroup idopt;
private LinkoptAttrGroup linkopt;
private java.util.List<String> wildcardContents = new ArrayList<String>();

public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}

public IdoptAttrGroup getIdopt() {
return idopt;
}

public void setIdopt(final IdoptAttrGroup idopt) {
this.idopt = idopt;
}

public LinkoptAttrGroup getLinkopt() {
return linkopt;
}

public void setLinkopt(final LinkoptAttrGroup linkopt) {
this.linkopt = linkopt;
}

public java.util.List<String> getWildcardContent() {
return wildcardContents;
}

public void setWildcardContent(final java.util.List<String> wildcardContents) {
this.wildcardContents = wildcardContents;
}

}

