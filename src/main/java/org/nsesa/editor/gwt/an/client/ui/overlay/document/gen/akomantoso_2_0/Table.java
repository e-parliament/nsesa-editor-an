package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Caption;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Tr;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.StatusTypeSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
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
private IntegerSimpleType widthAttr;
private IntegerSimpleType borderAttr;
private IntegerSimpleType cellspacingAttr;
private IntegerSimpleType cellpaddingAttr;
private Caption caption;
private java.util.List<Tr> trs = new ArrayList<Tr>();
private AnyURISimpleType alternativeToAttr;
private AmendableWidgetImpl wildcardContentAttr;
private StringSimpleType classAttr;
private StringSimpleType styleAttr;
private StringSimpleType titleAttr;
private LanguageSimpleType langAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AnyURISimpleType refersToAttr;
private StatusTypeSimpleType statusAttr;
private AnyURISimpleType periodAttr;

public IntegerSimpleType getWidthAttr() {
return widthAttr;
}

public void setWidthAttr(final IntegerSimpleType widthAttr) {
this.widthAttr = widthAttr;
}
public IntegerSimpleType getBorderAttr() {
return borderAttr;
}

public void setBorderAttr(final IntegerSimpleType borderAttr) {
this.borderAttr = borderAttr;
}
public IntegerSimpleType getCellspacingAttr() {
return cellspacingAttr;
}

public void setCellspacingAttr(final IntegerSimpleType cellspacingAttr) {
this.cellspacingAttr = cellspacingAttr;
}
public IntegerSimpleType getCellpaddingAttr() {
return cellpaddingAttr;
}

public void setCellpaddingAttr(final IntegerSimpleType cellpaddingAttr) {
this.cellpaddingAttr = cellpaddingAttr;
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
public AnyURISimpleType getAlternativeToAttr() {
return alternativeToAttr;
}

public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
this.alternativeToAttr = alternativeToAttr;
}
public AmendableWidgetImpl getWildcardContentAttr() {
return wildcardContentAttr;
}

public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
this.wildcardContentAttr = wildcardContentAttr;
}
public StringSimpleType getClassAttr() {
return classAttr;
}

public void setClassAttr(final StringSimpleType classAttr) {
this.classAttr = classAttr;
}
public StringSimpleType getStyleAttr() {
return styleAttr;
}

public void setStyleAttr(final StringSimpleType styleAttr) {
this.styleAttr = styleAttr;
}
public StringSimpleType getTitleAttr() {
return titleAttr;
}

public void setTitleAttr(final StringSimpleType titleAttr) {
this.titleAttr = titleAttr;
}
public LanguageSimpleType getLangAttr() {
return langAttr;
}

public void setLangAttr(final LanguageSimpleType langAttr) {
this.langAttr = langAttr;
}
public IDSimpleType getIdAttr() {
return idAttr;
}

public void setIdAttr(final IDSimpleType idAttr) {
this.idAttr = idAttr;
}
public NMTOKENSimpleType getEvolvingIdAttr() {
return evolvingIdAttr;
}

public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
this.evolvingIdAttr = evolvingIdAttr;
}
public AnyURISimpleType getRefersToAttr() {
return refersToAttr;
}

public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
this.refersToAttr = refersToAttr;
}
public StatusTypeSimpleType getStatusAttr() {
return statusAttr;
}

public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
this.statusAttr = statusAttr;
}
public AnyURISimpleType getPeriodAttr() {
return periodAttr;
}

public void setPeriodAttr(final AnyURISimpleType periodAttr) {
this.periodAttr = periodAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"tr","caption"};
    return  subtypes;
}
}

