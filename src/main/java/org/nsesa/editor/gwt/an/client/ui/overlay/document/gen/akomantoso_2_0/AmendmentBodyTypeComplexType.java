package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AmendmentHeading;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AmendmentContent;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AmendmentReference;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AmendmentJustification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.StatusTypeSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AmendmentBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public AmendmentBodyTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<AmendmentHeading> amendmentHeadings = new ArrayList<AmendmentHeading>();
private java.util.List<AmendmentContent> amendmentContents = new ArrayList<AmendmentContent>();
private java.util.List<AmendmentReference> amendmentReferences = new ArrayList<AmendmentReference>();
private java.util.List<AmendmentJustification> amendmentJustifications = new ArrayList<AmendmentJustification>();
private LanguageSimpleType langAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AnyURISimpleType alternativeToAttr;
private StringSimpleType classAttr;
private StringSimpleType styleAttr;
private StringSimpleType titleAttr;
private StatusTypeSimpleType statusAttr;
private AmendableWidgetImpl wildcardContentAttr;
private AnyURISimpleType refersToAttr;
private AnyURISimpleType periodAttr;

public java.util.List<AmendmentHeading> getAmendmentHeading() {
return amendmentHeadings;
}

public void setAmendmentHeading(final java.util.List<AmendmentHeading> amendmentHeadings) {
this.amendmentHeadings = amendmentHeadings;
}
public java.util.List<AmendmentContent> getAmendmentContent() {
return amendmentContents;
}

public void setAmendmentContent(final java.util.List<AmendmentContent> amendmentContents) {
this.amendmentContents = amendmentContents;
}
public java.util.List<AmendmentReference> getAmendmentReference() {
return amendmentReferences;
}

public void setAmendmentReference(final java.util.List<AmendmentReference> amendmentReferences) {
this.amendmentReferences = amendmentReferences;
}
public java.util.List<AmendmentJustification> getAmendmentJustification() {
return amendmentJustifications;
}

public void setAmendmentJustification(final java.util.List<AmendmentJustification> amendmentJustifications) {
this.amendmentJustifications = amendmentJustifications;
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
public AnyURISimpleType getAlternativeToAttr() {
return alternativeToAttr;
}

public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
this.alternativeToAttr = alternativeToAttr;
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
public StatusTypeSimpleType getStatusAttr() {
return statusAttr;
}

public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
this.statusAttr = statusAttr;
}
public AmendableWidgetImpl getWildcardContentAttr() {
return wildcardContentAttr;
}

public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
this.wildcardContentAttr = wildcardContentAttr;
}
public AnyURISimpleType getRefersToAttr() {
return refersToAttr;
}

public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
this.refersToAttr = refersToAttr;
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
    String[] subtypes = new String[]{"amendmentJustification","amendmentReference","amendmentHeading","amendmentContent"};
    return  subtypes;
}
}

