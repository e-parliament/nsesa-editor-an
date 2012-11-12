package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FragmentBody;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FragmentStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public FragmentStructureComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType includedInAttr;
private Meta meta;
private FragmentBody fragmentBody;

public AnyURISimpleType getIncludedInAttr() {
return includedInAttr;
}

public void setIncludedInAttr(final AnyURISimpleType includedInAttr) {
this.includedInAttr = includedInAttr;
}
public Meta getMeta() {
return meta;
}

public void setMeta(final Meta meta) {
this.meta = meta;
}
public FragmentBody getFragmentBody() {
return fragmentBody;
}

public void setFragmentBody(final FragmentBody fragmentBody) {
this.fragmentBody = fragmentBody;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"fragmentBody","meta"};
    return  subtypes;
}
}

