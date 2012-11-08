package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorereqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ListIntroduction;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Item;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ListConclusion;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class BlockList extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public BlockList(Element element) {
    super(element);
}

// FIELDS ------------------
private CorereqAttrGroup corereq;
private ListIntroduction listIntroduction;
private java.util.List<Item> items = new ArrayList<Item>();
private ListConclusion listConclusion;

public CorereqAttrGroup getCorereq() {
return corereq;
}

public void setCorereq(final CorereqAttrGroup corereq) {
this.corereq = corereq;
}
public ListIntroduction getListIntroduction() {
return listIntroduction;
}

public void setListIntroduction(final ListIntroduction listIntroduction) {
this.listIntroduction = listIntroduction;
}
public java.util.List<Item> getItem() {
return items;
}

public void setItem(final java.util.List<Item> items) {
this.items = items;
}
public ListConclusion getListConclusion() {
return listConclusion;
}

public void setListConclusion(final ListConclusion listConclusion) {
this.listConclusion = listConclusion;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"item","corereqAttrGroup","listConclusion","listIntroduction"};
    return  subtypes;
}
}

