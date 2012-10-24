package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class TocItem extends InlineComplexType  {

// CONSTRUCTORS ------------------
public TocItem(Element element) {
    super(element);
}

// FIELDS ------------------
private IntegerSimpleType level;
private LinkAttrGroup link;

public IntegerSimpleType getLevel() {
return level;
}

public void setLevel(final IntegerSimpleType level) {
this.level = level;
}

public LinkAttrGroup getLink() {
return link;
}

public void setLink(final LinkAttrGroup link) {
this.link = link;
}

}

