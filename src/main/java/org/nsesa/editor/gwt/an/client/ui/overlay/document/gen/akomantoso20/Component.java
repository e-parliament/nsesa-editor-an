package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.LinkedHashMap;

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
    private String wildcardContentAttr;
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
        }

        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final String wildcardContentAttr) {
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
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"amendment","amendmentList","bill","officialGazette","doc","debate","judgement","debateReport","act","documentCollection"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("idAttr", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingIdAttr", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("wildcardContentAttr", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        return attrs;
    }

}

