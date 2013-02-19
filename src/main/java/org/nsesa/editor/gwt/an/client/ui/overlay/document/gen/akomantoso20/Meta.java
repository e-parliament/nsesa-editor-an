/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Identification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Publication;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Classification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Lifecycle;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Workflow;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Analysis;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TemporalData;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.References;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Notes;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Proprietary;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Presentation;
import com.google.gwt.dom.client.Element;

import java.util.ArrayList;
import java.util.Arrays;

import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;

import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gwt.user.client.DOM;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Meta extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Identification(), new Occurrence(1, 1));
            put(new Publication(), new Occurrence(0, 1));
            put(new Classification(), new Occurrence(0, -1));
            put(new Lifecycle(), new Occurrence(0, -1));
            put(new Workflow(), new Occurrence(0, -1));
            put(new Analysis(), new Occurrence(0, -1));
            put(new TemporalData(), new Occurrence(0, -1));
            put(new References(), new Occurrence(0, -1));
            put(new Notes(), new Occurrence(0, -1));
            put(new Proprietary(), new Occurrence(0, -1));
            put(new Presentation(), new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "meta");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget meta");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Meta() {
        super(create());
        setType("meta");
    }

    public Meta(Element element) {
        super(element);
    }

// FIELDS ------------------

    public Identification getIdentification() {
        Identification result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Identification".equalsIgnoreCase(widget.getType())) {
                result = (Identification) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Identification setIdentification(Identification identificationElem) {
        Identification result = getIdentification();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(identificationElem);

        return identificationElem;
    }

    public Publication getPublication() {
        Publication result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Publication".equalsIgnoreCase(widget.getType())) {
                result = (Publication) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Publication setPublication(Publication publicationElem) {
        Publication result = getPublication();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(publicationElem);

        return publicationElem;
    }

    public java.util.List<Classification> getClassifications() {
        java.util.List<Classification> result = new ArrayList<Classification>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Classification".equalsIgnoreCase(widget.getType())) {
                result.add((Classification) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Classification> getClassificationList() {
        return getClassifications();
    }

    //DSL Style set value
    public Classification addClassification(Classification classificationElem) {
        this.addOverlayWidget(classificationElem);
        return classificationElem;
    }

    public java.util.List<Lifecycle> getLifecycles() {
        java.util.List<Lifecycle> result = new ArrayList<Lifecycle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Lifecycle".equalsIgnoreCase(widget.getType())) {
                result.add((Lifecycle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Lifecycle> getLifecycleList() {
        return getLifecycles();
    }

    //DSL Style set value
    public Lifecycle addLifecycle(Lifecycle lifecycleElem) {
        this.addOverlayWidget(lifecycleElem);
        return lifecycleElem;
    }

    public java.util.List<Workflow> getWorkflows() {
        java.util.List<Workflow> result = new ArrayList<Workflow>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Workflow".equalsIgnoreCase(widget.getType())) {
                result.add((Workflow) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Workflow> getWorkflowList() {
        return getWorkflows();
    }

    //DSL Style set value
    public Workflow addWorkflow(Workflow workflowElem) {
        this.addOverlayWidget(workflowElem);
        return workflowElem;
    }

    public java.util.List<Analysis> getAnalysises() {
        java.util.List<Analysis> result = new ArrayList<Analysis>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Analysis".equalsIgnoreCase(widget.getType())) {
                result.add((Analysis) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Analysis> getAnalysisList() {
        return getAnalysises();
    }

    //DSL Style set value
    public Analysis addAnalysis(Analysis analysisElem) {
        this.addOverlayWidget(analysisElem);
        return analysisElem;
    }

    public java.util.List<TemporalData> getTemporalDatas() {
        java.util.List<TemporalData> result = new ArrayList<TemporalData>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TemporalData".equalsIgnoreCase(widget.getType())) {
                result.add((TemporalData) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TemporalData> getTemporalDataList() {
        return getTemporalDatas();
    }

    //DSL Style set value
    public TemporalData addTemporalData(TemporalData temporalDataElem) {
        this.addOverlayWidget(temporalDataElem);
        return temporalDataElem;
    }

    public java.util.List<References> getReferenceses() {
        java.util.List<References> result = new ArrayList<References>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("References".equalsIgnoreCase(widget.getType())) {
                result.add((References) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<References> getReferencesList() {
        return getReferenceses();
    }

    //DSL Style set value
    public References addReferences(References referencesElem) {
        this.addOverlayWidget(referencesElem);
        return referencesElem;
    }

    public java.util.List<Notes> getNoteses() {
        java.util.List<Notes> result = new ArrayList<Notes>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Notes".equalsIgnoreCase(widget.getType())) {
                result.add((Notes) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Notes> getNotesList() {
        return getNoteses();
    }

    //DSL Style set value
    public Notes addNotes(Notes notesElem) {
        this.addOverlayWidget(notesElem);
        return notesElem;
    }

    public java.util.List<Proprietary> getProprietaries() {
        java.util.List<Proprietary> result = new ArrayList<Proprietary>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Proprietary".equalsIgnoreCase(widget.getType())) {
                result.add((Proprietary) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Proprietary> getProprietaryList() {
        return getProprietaries();
    }

    //DSL Style set value
    public Proprietary addProprietary(Proprietary proprietaryElem) {
        this.addOverlayWidget(proprietaryElem);
        return proprietaryElem;
    }

    public java.util.List<Presentation> getPresentations() {
        java.util.List<Presentation> result = new ArrayList<Presentation>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Presentation".equalsIgnoreCase(widget.getType())) {
                result.add((Presentation) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Presentation> getPresentationList() {
        return getPresentations();
    }

    //DSL Style set value
    public Presentation addPresentation(Presentation presentationElem) {
        this.addOverlayWidget(presentationElem);
        return presentationElem;
    }

//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
    }

    /**
     * Returns the namespace URI of this amendable widget.
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }
}

