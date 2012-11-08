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
private AnyURISimpleType includedIn;
private Meta meta;
private FragmentBody fragmentBody;

public AnyURISimpleType getIncludedIn() {
return includedIn;
}

public void setIncludedIn(final AnyURISimpleType includedIn) {
this.includedIn = includedIn;
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
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"fragmentBody","anyURISimpleType","meta"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

