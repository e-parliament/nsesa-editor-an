package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ComponentRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Interstitial;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AmendmentList;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.OfficialGazette;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocumentCollection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Act;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Bill;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DebateReport;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Debate;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Amendment;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Judgement;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Doc;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class CollectionBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public CollectionBodyTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType alternativeToAttr;
    private StatusTypeSimpleType statusAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType refersToAttr;
    private String wildcardContentAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType periodAttr;
    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType())) {
                result.add((ComponentRef)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Interstitial> getInterstitials() {
        java.util.List<Interstitial> result = new ArrayList<Interstitial>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Interstitial".equalsIgnoreCase(widget.getType())) {
                result.add((Interstitial)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<AmendmentList> getAmendmentLists() {
        java.util.List<AmendmentList> result = new ArrayList<AmendmentList>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AmendmentList".equalsIgnoreCase(widget.getType())) {
                result.add((AmendmentList)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<OfficialGazette> getOfficialGazettes() {
        java.util.List<OfficialGazette> result = new ArrayList<OfficialGazette>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OfficialGazette".equalsIgnoreCase(widget.getType())) {
                result.add((OfficialGazette)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocumentCollection> getDocumentCollections() {
        java.util.List<DocumentCollection> result = new ArrayList<DocumentCollection>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocumentCollection".equalsIgnoreCase(widget.getType())) {
                result.add((DocumentCollection)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Act> getActs() {
        java.util.List<Act> result = new ArrayList<Act>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Act".equalsIgnoreCase(widget.getType())) {
                result.add((Act)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Bill> getBills() {
        java.util.List<Bill> result = new ArrayList<Bill>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Bill".equalsIgnoreCase(widget.getType())) {
                result.add((Bill)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DebateReport> getDebateReports() {
        java.util.List<DebateReport> result = new ArrayList<DebateReport>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateReport".equalsIgnoreCase(widget.getType())) {
                result.add((DebateReport)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Debate> getDebates() {
        java.util.List<Debate> result = new ArrayList<Debate>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Debate".equalsIgnoreCase(widget.getType())) {
                result.add((Debate)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Amendment> getAmendments() {
        java.util.List<Amendment> result = new ArrayList<Amendment>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Amendment".equalsIgnoreCase(widget.getType())) {
                result.add((Amendment)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Judgement> getJudgements() {
        java.util.List<Judgement> result = new ArrayList<Judgement>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Judgement".equalsIgnoreCase(widget.getType())) {
                result.add((Judgement)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Doc> getDocs() {
        java.util.List<Doc> result = new ArrayList<Doc>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Doc".equalsIgnoreCase(widget.getType())) {
                result.add((Doc)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(amendableElement.getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(amendableElement.getAttribute("status"));
        }

        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
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
    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(amendableElement.getAttribute("class"));
        }

        return classAttr;
    }
    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(amendableElement.getAttribute("style"));
        }

        return styleAttr;
    }
    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(amendableElement.getAttribute("title"));
        }

        return titleAttr;
    }
    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
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
    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(amendableElement.getAttribute("lang"));
        }

        return langAttr;
    }
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(amendableElement.getAttribute("period"));
        }

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
        return new String[]{"amendment","componentRef","amendmentList","bill","officialGazette","doc","debate","judgement","debateReport","act","interstitial","documentCollection"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("alternativeToAttr", getAlternativeToAttr().getValue());
        attrs.put("statusAttr", getStatusAttr().value());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());
        attrs.put("classAttr", getClassAttr().getValue());
        attrs.put("styleAttr", getStyleAttr().getValue());
        attrs.put("titleAttr", getTitleAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().toString());
        attrs.put("langAttr", getLangAttr().getValue());
        attrs.put("periodAttr", getPeriodAttr().getValue());

        return attrs;
    }

}

