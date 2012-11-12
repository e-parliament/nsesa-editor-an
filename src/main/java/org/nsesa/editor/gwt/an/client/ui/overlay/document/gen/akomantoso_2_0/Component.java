package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
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
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Component extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Component(Element element) {
    super(element);
}

// FIELDS ------------------
private AmendableWidgetImpl wildcardContentAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AmendmentList amendmentList;
private OfficialGazette officialGazette;
private DocumentCollection documentCollection;
private Act act;
private Bill bill;
private DebateReport debateReport;
private Debate debate;
private Amendment amendment;
private Judgement judgement;
private Doc doc;

public AmendableWidgetImpl getWildcardContentAttr() {
return wildcardContentAttr;
}

public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
this.wildcardContentAttr = wildcardContentAttr;
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
public AmendmentList getAmendmentList() {
return amendmentList;
}

public void setAmendmentList(final AmendmentList amendmentList) {
this.amendmentList = amendmentList;
}
public OfficialGazette getOfficialGazette() {
return officialGazette;
}

public void setOfficialGazette(final OfficialGazette officialGazette) {
this.officialGazette = officialGazette;
}
public DocumentCollection getDocumentCollection() {
return documentCollection;
}

public void setDocumentCollection(final DocumentCollection documentCollection) {
this.documentCollection = documentCollection;
}
public Act getAct() {
return act;
}

public void setAct(final Act act) {
this.act = act;
}
public Bill getBill() {
return bill;
}

public void setBill(final Bill bill) {
this.bill = bill;
}
public DebateReport getDebateReport() {
return debateReport;
}

public void setDebateReport(final DebateReport debateReport) {
this.debateReport = debateReport;
}
public Debate getDebate() {
return debate;
}

public void setDebate(final Debate debate) {
this.debate = debate;
}
public Amendment getAmendment() {
return amendment;
}

public void setAmendment(final Amendment amendment) {
this.amendment = amendment;
}
public Judgement getJudgement() {
return judgement;
}

public void setJudgement(final Judgement judgement) {
this.judgement = judgement;
}
public Doc getDoc() {
return doc;
}

public void setDoc(final Doc doc) {
this.doc = doc;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"amendment","amendmentList","bill","officialGazette","doc","debate","judgement","debateReport","act","documentCollection"};
    return  subtypes;
}
}

