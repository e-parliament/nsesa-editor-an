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
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Meta extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Meta() {
        super(DOM.createElement("meta"));
    }

    public Meta(Element element) {
        super(element);
    }

// FIELDS ------------------
    public Identification getIdentification() {
        Identification result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Identification".equalsIgnoreCase(widget.getType())) {
                result = (Identification)widget;
                break;
            }
        }
        return result;
    }
    public Publication getPublication() {
        Publication result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Publication".equalsIgnoreCase(widget.getType())) {
                result = (Publication)widget;
                break;
            }
        }
        return result;
    }
    public java.util.List<Classification> getClassifications() {
        java.util.List<Classification> result = new ArrayList<Classification>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Classification".equalsIgnoreCase(widget.getType())) {
                result.add((Classification)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Lifecycle> getLifecycles() {
        java.util.List<Lifecycle> result = new ArrayList<Lifecycle>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Lifecycle".equalsIgnoreCase(widget.getType())) {
                result.add((Lifecycle)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Workflow> getWorkflows() {
        java.util.List<Workflow> result = new ArrayList<Workflow>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Workflow".equalsIgnoreCase(widget.getType())) {
                result.add((Workflow)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Analysis> getAnalysises() {
        java.util.List<Analysis> result = new ArrayList<Analysis>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Analysis".equalsIgnoreCase(widget.getType())) {
                result.add((Analysis)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TemporalData> getTemporalDatas() {
        java.util.List<TemporalData> result = new ArrayList<TemporalData>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TemporalData".equalsIgnoreCase(widget.getType())) {
                result.add((TemporalData)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<References> getReferenceses() {
        java.util.List<References> result = new ArrayList<References>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("References".equalsIgnoreCase(widget.getType())) {
                result.add((References)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Notes> getNoteses() {
        java.util.List<Notes> result = new ArrayList<Notes>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Notes".equalsIgnoreCase(widget.getType())) {
                result.add((Notes)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Proprietary> getProprietaries() {
        java.util.List<Proprietary> result = new ArrayList<Proprietary>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Proprietary".equalsIgnoreCase(widget.getType())) {
                result.add((Proprietary)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Presentation> getPresentations() {
        java.util.List<Presentation> result = new ArrayList<Presentation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Presentation".equalsIgnoreCase(widget.getType())) {
                result.add((Presentation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        String[] subtypes = new String[]{"references","presentation","temporalData","lifecycle","identification","proprietary","classification","notes","analysis","workflow","publication"};
        return  subtypes;
    }

    @Override
    public void addAmendableWidget(final AmendableWidget widget) {
        boolean canAdd = false;
        for (String type : getAllowedChildTypes()) {
            if (type.equalsIgnoreCase(widget.getType())) {
                canAdd = true;
            }
        }
        if (!canAdd) {
            throw new RuntimeException("Not supported child type:" + widget);
        }
        super.addAmendableWidget(widget);
    }

}

