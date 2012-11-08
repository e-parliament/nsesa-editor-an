package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TocItem;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Toc extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Toc(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<TocItem> tocItems = new ArrayList<TocItem>();

public java.util.List<TocItem> getTocItem() {
return tocItems;
}

public void setTocItem(final java.util.List<TocItem> tocItems) {
this.tocItems = tocItems;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"tocItem"};
    return  subtypes;
}
}

