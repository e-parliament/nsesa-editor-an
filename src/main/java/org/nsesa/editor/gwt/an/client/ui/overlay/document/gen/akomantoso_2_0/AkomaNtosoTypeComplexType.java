package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Components;
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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class AkomaNtosoTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public AkomaNtosoTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    public Components getComponents() {
        Components result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Components".equalsIgnoreCase(widget.getType())) {
                result = (Components)widget;
                break;
            }
        }
        return result;
    }
    public AmendmentList getAmendmentList() {
        AmendmentList result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AmendmentList".equalsIgnoreCase(widget.getType())) {
                result = (AmendmentList)widget;
                break;
            }
        }
        return result;
    }
    public OfficialGazette getOfficialGazette() {
        OfficialGazette result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OfficialGazette".equalsIgnoreCase(widget.getType())) {
                result = (OfficialGazette)widget;
                break;
            }
        }
        return result;
    }
    public DocumentCollection getDocumentCollection() {
        DocumentCollection result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocumentCollection".equalsIgnoreCase(widget.getType())) {
                result = (DocumentCollection)widget;
                break;
            }
        }
        return result;
    }
    public Act getAct() {
        Act result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Act".equalsIgnoreCase(widget.getType())) {
                result = (Act)widget;
                break;
            }
        }
        return result;
    }
    public Bill getBill() {
        Bill result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Bill".equalsIgnoreCase(widget.getType())) {
                result = (Bill)widget;
                break;
            }
        }
        return result;
    }
    public DebateReport getDebateReport() {
        DebateReport result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateReport".equalsIgnoreCase(widget.getType())) {
                result = (DebateReport)widget;
                break;
            }
        }
        return result;
    }
    public Debate getDebate() {
        Debate result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Debate".equalsIgnoreCase(widget.getType())) {
                result = (Debate)widget;
                break;
            }
        }
        return result;
    }
    public Amendment getAmendment() {
        Amendment result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Amendment".equalsIgnoreCase(widget.getType())) {
                result = (Amendment)widget;
                break;
            }
        }
        return result;
    }
    public Judgement getJudgement() {
        Judgement result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Judgement".equalsIgnoreCase(widget.getType())) {
                result = (Judgement)widget;
                break;
            }
        }
        return result;
    }
    public Doc getDoc() {
        Doc result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Doc".equalsIgnoreCase(widget.getType())) {
                result = (Doc)widget;
                break;
            }
        }
        return result;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"amendment","amendmentList","bill","officialGazette","doc","debate","judgement","debateReport","components","act","documentCollection"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());

        return attrs;
    }

}

