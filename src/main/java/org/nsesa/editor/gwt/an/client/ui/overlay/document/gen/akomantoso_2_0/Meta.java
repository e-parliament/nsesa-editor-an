package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Identification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Publication;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Classification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Lifecycle;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Workflow;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Analysis;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TemporalData;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.References;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Notes;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Proprietary;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Presentation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Identification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Publication;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Classification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Lifecycle;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Workflow;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Analysis;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TemporalData;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.References;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Notes;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Proprietary;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Presentation;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Meta extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Meta(Element element) {
    super(element);
}

// FIELDS ------------------
private Identification identification;
private Publication publication;
private java.util.List<Classification> classifications = new ArrayList<Classification>();
private java.util.List<Lifecycle> lifecycles = new ArrayList<Lifecycle>();
private java.util.List<Workflow> workflows = new ArrayList<Workflow>();
private java.util.List<Analysis> analysises = new ArrayList<Analysis>();
private java.util.List<TemporalData> temporalDatas = new ArrayList<TemporalData>();
private java.util.List<References> referenceses = new ArrayList<References>();
private java.util.List<Notes> noteses = new ArrayList<Notes>();
private java.util.List<Proprietary> proprietaries = new ArrayList<Proprietary>();
private java.util.List<Presentation> presentations = new ArrayList<Presentation>();

public Identification getIdentification() {
return identification;
}

public void setIdentification(final Identification identification) {
this.identification = identification;
}

public Publication getPublication() {
return publication;
}

public void setPublication(final Publication publication) {
this.publication = publication;
}

public java.util.List<Classification> getClassification() {
return classifications;
}

public void setClassification(final java.util.List<Classification> classifications) {
this.classifications = classifications;
}

public java.util.List<Lifecycle> getLifecycle() {
return lifecycles;
}

public void setLifecycle(final java.util.List<Lifecycle> lifecycles) {
this.lifecycles = lifecycles;
}

public java.util.List<Workflow> getWorkflow() {
return workflows;
}

public void setWorkflow(final java.util.List<Workflow> workflows) {
this.workflows = workflows;
}

public java.util.List<Analysis> getAnalysis() {
return analysises;
}

public void setAnalysis(final java.util.List<Analysis> analysises) {
this.analysises = analysises;
}

public java.util.List<TemporalData> getTemporalData() {
return temporalDatas;
}

public void setTemporalData(final java.util.List<TemporalData> temporalDatas) {
this.temporalDatas = temporalDatas;
}

public java.util.List<References> getReferences() {
return referenceses;
}

public void setReferences(final java.util.List<References> referenceses) {
this.referenceses = referenceses;
}

public java.util.List<Notes> getNotes() {
return noteses;
}

public void setNotes(final java.util.List<Notes> noteses) {
this.noteses = noteses;
}

public java.util.List<Proprietary> getProprietary() {
return proprietaries;
}

public void setProprietary(final java.util.List<Proprietary> proprietaries) {
this.proprietaries = proprietaries;
}

public java.util.List<Presentation> getPresentation() {
return presentations;
}

public void setPresentation(final java.util.List<Presentation> presentations) {
this.presentations = presentations;
}

}

