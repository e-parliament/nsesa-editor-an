package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Interstitial;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AmendmentList;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.OfficialGazette;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DocumentCollection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Act;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Bill;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DebateReport;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Debate;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Amendment;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Judgement;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Doc;
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
public class CollectionBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public CollectionBodyTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<ComponentRef> componentRefs = new ArrayList<ComponentRef>();
private java.util.List<Interstitial> interstitials = new ArrayList<Interstitial>();
private java.util.List<AmendmentList> amendmentLists = new ArrayList<AmendmentList>();
private java.util.List<OfficialGazette> officialGazettes = new ArrayList<OfficialGazette>();
private java.util.List<DocumentCollection> documentCollections = new ArrayList<DocumentCollection>();
private java.util.List<Act> acts = new ArrayList<Act>();
private java.util.List<Bill> bills = new ArrayList<Bill>();
private java.util.List<DebateReport> debateReports = new ArrayList<DebateReport>();
private java.util.List<Debate> debates = new ArrayList<Debate>();
private java.util.List<Amendment> amendments = new ArrayList<Amendment>();
private java.util.List<Judgement> judgements = new ArrayList<Judgement>();
private java.util.List<Doc> docs = new ArrayList<Doc>();
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

public java.util.List<ComponentRef> getComponentRef() {
return componentRefs;
}

public void setComponentRef(final java.util.List<ComponentRef> componentRefs) {
this.componentRefs = componentRefs;
}
public java.util.List<Interstitial> getInterstitial() {
return interstitials;
}

public void setInterstitial(final java.util.List<Interstitial> interstitials) {
this.interstitials = interstitials;
}
public java.util.List<AmendmentList> getAmendmentList() {
return amendmentLists;
}

public void setAmendmentList(final java.util.List<AmendmentList> amendmentLists) {
this.amendmentLists = amendmentLists;
}
public java.util.List<OfficialGazette> getOfficialGazette() {
return officialGazettes;
}

public void setOfficialGazette(final java.util.List<OfficialGazette> officialGazettes) {
this.officialGazettes = officialGazettes;
}
public java.util.List<DocumentCollection> getDocumentCollection() {
return documentCollections;
}

public void setDocumentCollection(final java.util.List<DocumentCollection> documentCollections) {
this.documentCollections = documentCollections;
}
public java.util.List<Act> getAct() {
return acts;
}

public void setAct(final java.util.List<Act> acts) {
this.acts = acts;
}
public java.util.List<Bill> getBill() {
return bills;
}

public void setBill(final java.util.List<Bill> bills) {
this.bills = bills;
}
public java.util.List<DebateReport> getDebateReport() {
return debateReports;
}

public void setDebateReport(final java.util.List<DebateReport> debateReports) {
this.debateReports = debateReports;
}
public java.util.List<Debate> getDebate() {
return debates;
}

public void setDebate(final java.util.List<Debate> debates) {
this.debates = debates;
}
public java.util.List<Amendment> getAmendment() {
return amendments;
}

public void setAmendment(final java.util.List<Amendment> amendments) {
this.amendments = amendments;
}
public java.util.List<Judgement> getJudgement() {
return judgements;
}

public void setJudgement(final java.util.List<Judgement> judgements) {
this.judgements = judgements;
}
public java.util.List<Doc> getDoc() {
return docs;
}

public void setDoc(final java.util.List<Doc> docs) {
this.docs = docs;
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
    String[] subtypes = new String[]{"amendment","componentRef","amendmentList","bill","officialGazette","doc","debate","judgement","debateReport","act","interstitial","documentCollection"};
    return  subtypes;
}
}

