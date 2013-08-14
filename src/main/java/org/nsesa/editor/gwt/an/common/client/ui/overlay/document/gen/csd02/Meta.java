/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Generated class
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Meta extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new Identification())
                    , new StructureIndicator.DefaultElement(0, 1, new Publication())
                    , new StructureIndicator.DefaultElement(0, -1, new Classification())
                    , new StructureIndicator.DefaultElement(0, -1, new Lifecycle())
                    , new StructureIndicator.DefaultElement(0, -1, new Workflow())
                    , new StructureIndicator.DefaultElement(0, -1, new Analysis())
                    , new StructureIndicator.DefaultElement(0, -1, new TemporalData())
                    , new StructureIndicator.DefaultElement(0, -1, new References())
                    , new StructureIndicator.DefaultElement(0, -1, new Notes())
                    , new StructureIndicator.DefaultElement(0, -1, new Proprietary())
                    , new StructureIndicator.DefaultElement(0, -1, new Presentation())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "meta");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget meta");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Meta</code> object and set up its type
     */
    public Meta() {
        super(create());
        setType("meta");
    }


    /**
     * Create a <code>Meta</code> object with the given DOM element
     */
    public Meta(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Add <code>Identification</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Identification getIdentification() {
        Identification result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Identification".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Identification) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>identificationElem</code> property in DSL way
     *
     * @param identificationElem new value
     * @return <code>Identification</code> instance
     */
    public Identification setIdentification(Identification identificationElem) {
        Identification result = getIdentification();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(identificationElem);

        return identificationElem;
    }

    /**
     * Add <code>Publication</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Publication getPublication() {
        Publication result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Publication".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Publication) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>publicationElem</code> property in DSL way
     *
     * @param publicationElem new value
     * @return <code>Publication</code> instance
     */
    public Publication setPublication(Publication publicationElem) {
        Publication result = getPublication();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(publicationElem);

        return publicationElem;
    }

    /**
     * Return <code>java.util.List<Classification></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Classification> getClassifications() {
        java.util.List<Classification> result = new ArrayList<Classification>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Classification".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Classification) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Classification></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Classification> getClassificationList() {
        return getClassifications();
    }

    /**
     * Add <code>java.util.List<Classification></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Classification addClassification(Classification classificationElem) {
        this.addOverlayWidget(classificationElem);
        return classificationElem;
    }

    /**
     * Return <code>java.util.List<Lifecycle></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Lifecycle> getLifecycles() {
        java.util.List<Lifecycle> result = new ArrayList<Lifecycle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Lifecycle".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Lifecycle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Lifecycle></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Lifecycle> getLifecycleList() {
        return getLifecycles();
    }

    /**
     * Add <code>java.util.List<Lifecycle></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Lifecycle addLifecycle(Lifecycle lifecycleElem) {
        this.addOverlayWidget(lifecycleElem);
        return lifecycleElem;
    }

    /**
     * Return <code>java.util.List<Workflow></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Workflow> getWorkflows() {
        java.util.List<Workflow> result = new ArrayList<Workflow>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Workflow".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Workflow) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Workflow></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Workflow> getWorkflowList() {
        return getWorkflows();
    }

    /**
     * Add <code>java.util.List<Workflow></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Workflow addWorkflow(Workflow workflowElem) {
        this.addOverlayWidget(workflowElem);
        return workflowElem;
    }

    /**
     * Return <code>java.util.List<Analysis></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Analysis> getAnalysises() {
        java.util.List<Analysis> result = new ArrayList<Analysis>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Analysis".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Analysis) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Analysis></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Analysis> getAnalysisList() {
        return getAnalysises();
    }

    /**
     * Add <code>java.util.List<Analysis></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Analysis addAnalysis(Analysis analysisElem) {
        this.addOverlayWidget(analysisElem);
        return analysisElem;
    }

    /**
     * Return <code>java.util.List<TemporalData></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TemporalData> getTemporalDatas() {
        java.util.List<TemporalData> result = new ArrayList<TemporalData>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TemporalData".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TemporalData) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TemporalData></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TemporalData> getTemporalDataList() {
        return getTemporalDatas();
    }

    /**
     * Add <code>java.util.List<TemporalData></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TemporalData addTemporalData(TemporalData temporalDataElem) {
        this.addOverlayWidget(temporalDataElem);
        return temporalDataElem;
    }

    /**
     * Return <code>java.util.List<References></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<References> getReferenceses() {
        java.util.List<References> result = new ArrayList<References>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("References".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((References) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<References></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<References> getReferencesList() {
        return getReferenceses();
    }

    /**
     * Add <code>java.util.List<References></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public References addReferences(References referencesElem) {
        this.addOverlayWidget(referencesElem);
        return referencesElem;
    }

    /**
     * Return <code>java.util.List<Notes></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Notes> getNoteses() {
        java.util.List<Notes> result = new ArrayList<Notes>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Notes".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Notes) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Notes></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Notes> getNotesList() {
        return getNoteses();
    }

    /**
     * Add <code>java.util.List<Notes></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Notes addNotes(Notes notesElem) {
        this.addOverlayWidget(notesElem);
        return notesElem;
    }

    /**
     * Return <code>java.util.List<Proprietary></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Proprietary> getProprietaries() {
        java.util.List<Proprietary> result = new ArrayList<Proprietary>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Proprietary".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Proprietary) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Proprietary></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Proprietary> getProprietaryList() {
        return getProprietaries();
    }

    /**
     * Add <code>java.util.List<Proprietary></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Proprietary addProprietary(Proprietary proprietaryElem) {
        this.addOverlayWidget(proprietaryElem);
        return proprietaryElem;
    }

    /**
     * Return <code>java.util.List<Presentation></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Presentation> getPresentations() {
        java.util.List<Presentation> result = new ArrayList<Presentation>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Presentation".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Presentation) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Presentation></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Presentation> getPresentationList() {
        return getPresentations();
    }

    /**
     * Add <code>java.util.List<Presentation></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Presentation addPresentation(Presentation presentationElem) {
        this.addOverlayWidget(presentationElem);
        return presentationElem;
    }

//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

    @Override
    public StructureIndicator getStructureIndicator() {
        return STRUCTURE_INDICATOR;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public Meta html(String s) {
        super.html(s);
        return this;
    }
}

