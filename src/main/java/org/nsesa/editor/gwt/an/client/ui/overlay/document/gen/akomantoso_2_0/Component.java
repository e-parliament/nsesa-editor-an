package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Component extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Component() {
        super(DOM.createElement("component"));
    }

    public Component(Element element) {
        super(element);
    }

// FIELDS ------------------
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AmendableWidgetImpl wildcardContentAttr;
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
    public AmendableWidgetImpl getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
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
        return new String[]{"amendment","amendmentList","bill","officialGazette","doc","debate","judgement","debateReport","act","documentCollection"};
    }

}

