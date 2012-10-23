package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorereqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Caption;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Tr;
import org.nsesa.editor.gwt.core.client.ui.overlay.xml.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorereqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Caption;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Tr;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Table extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Table(Element element) {
    super(element);
}

// FIELDS ------------------
private IntegerSimpleType width;
private IntegerSimpleType border;
private IntegerSimpleType cellspacing;
private IntegerSimpleType cellpadding;
private CorereqAttrGroup corereq;
private Caption caption;
private java.util.List<Tr> trs = new ArrayList<Tr>();

public IntegerSimpleType getWidth() {
return width;
}

public void setWidth(final IntegerSimpleType width) {
this.width = width;
}

public IntegerSimpleType getBorder() {
return border;
}

public void setBorder(final IntegerSimpleType border) {
this.border = border;
}

public IntegerSimpleType getCellspacing() {
return cellspacing;
}

public void setCellspacing(final IntegerSimpleType cellspacing) {
this.cellspacing = cellspacing;
}

public IntegerSimpleType getCellpadding() {
return cellpadding;
}

public void setCellpadding(final IntegerSimpleType cellpadding) {
this.cellpadding = cellpadding;
}

public CorereqAttrGroup getCorereq() {
return corereq;
}

public void setCorereq(final CorereqAttrGroup corereq) {
this.corereq = corereq;
}

public Caption getCaption() {
return caption;
}

public void setCaption(final Caption caption) {
this.caption = caption;
}

public java.util.List<Tr> getTr() {
return trs;
}

public void setTr(final java.util.List<Tr> trs) {
this.trs = trs;
}

}

