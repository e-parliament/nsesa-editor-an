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

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class CollectionBodyTypeComplexType extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new ComponentRef(), new Occurrence(1, 1));
            put(new Interstitial(), new Occurrence(0, 1));
            put(new AmendmentList(), new Occurrence(0, -1));
            put(new OfficialGazette(), new Occurrence(0, -1));
            put(new DocumentCollection(), new Occurrence(0, -1));
            put(new Act(), new Occurrence(0, -1));
            put(new Bill(), new Occurrence(0, -1));
            put(new DebateReport(), new Occurrence(0, -1));
            put(new Debate(), new Occurrence(0, -1));
            put(new Amendment(), new Occurrence(0, -1));
            put(new Judgement(), new Occurrence(0, -1));
            put(new Doc(), new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "collectionBodyTypeComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget collectionBodyTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public CollectionBodyTypeComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StatusTypeSimpleType statusAttr;
    private AnyURISimpleType refersToAttr;
    private LanguageSimpleType langAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType alternativeToAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType periodAttr;

    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType())) {
                result.add((ComponentRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<ComponentRef> getComponentRefList() {
        return getComponentRefs();
    }

    //DSL Style set value
    public ComponentRef addComponentRef(ComponentRef componentRefElem) {
        this.addOverlayWidget(componentRefElem);
        return componentRefElem;
    }

    public java.util.List<Interstitial> getInterstitials() {
        java.util.List<Interstitial> result = new ArrayList<Interstitial>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Interstitial".equalsIgnoreCase(widget.getType())) {
                result.add((Interstitial) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Interstitial> getInterstitialList() {
        return getInterstitials();
    }

    //DSL Style set value
    public Interstitial addInterstitial(Interstitial interstitialElem) {
        this.addOverlayWidget(interstitialElem);
        return interstitialElem;
    }

    public java.util.List<AmendmentList> getAmendmentLists() {
        java.util.List<AmendmentList> result = new ArrayList<AmendmentList>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AmendmentList".equalsIgnoreCase(widget.getType())) {
                result.add((AmendmentList) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<AmendmentList> getAmendmentListList() {
        return getAmendmentLists();
    }

    //DSL Style set value
    public AmendmentList addAmendmentList(AmendmentList amendmentListElem) {
        this.addOverlayWidget(amendmentListElem);
        return amendmentListElem;
    }

    public java.util.List<OfficialGazette> getOfficialGazettes() {
        java.util.List<OfficialGazette> result = new ArrayList<OfficialGazette>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OfficialGazette".equalsIgnoreCase(widget.getType())) {
                result.add((OfficialGazette) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<OfficialGazette> getOfficialGazetteList() {
        return getOfficialGazettes();
    }

    //DSL Style set value
    public OfficialGazette addOfficialGazette(OfficialGazette officialGazetteElem) {
        this.addOverlayWidget(officialGazetteElem);
        return officialGazetteElem;
    }

    public java.util.List<DocumentCollection> getDocumentCollections() {
        java.util.List<DocumentCollection> result = new ArrayList<DocumentCollection>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocumentCollection".equalsIgnoreCase(widget.getType())) {
                result.add((DocumentCollection) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocumentCollection> getDocumentCollectionList() {
        return getDocumentCollections();
    }

    //DSL Style set value
    public DocumentCollection addDocumentCollection(DocumentCollection documentCollectionElem) {
        this.addOverlayWidget(documentCollectionElem);
        return documentCollectionElem;
    }

    public java.util.List<Act> getActs() {
        java.util.List<Act> result = new ArrayList<Act>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Act".equalsIgnoreCase(widget.getType())) {
                result.add((Act) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Act> getActList() {
        return getActs();
    }

    //DSL Style set value
    public Act addAct(Act actElem) {
        this.addOverlayWidget(actElem);
        return actElem;
    }

    public java.util.List<Bill> getBills() {
        java.util.List<Bill> result = new ArrayList<Bill>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Bill".equalsIgnoreCase(widget.getType())) {
                result.add((Bill) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Bill> getBillList() {
        return getBills();
    }

    //DSL Style set value
    public Bill addBill(Bill billElem) {
        this.addOverlayWidget(billElem);
        return billElem;
    }

    public java.util.List<DebateReport> getDebateReports() {
        java.util.List<DebateReport> result = new ArrayList<DebateReport>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DebateReport".equalsIgnoreCase(widget.getType())) {
                result.add((DebateReport) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DebateReport> getDebateReportList() {
        return getDebateReports();
    }

    //DSL Style set value
    public DebateReport addDebateReport(DebateReport debateReportElem) {
        this.addOverlayWidget(debateReportElem);
        return debateReportElem;
    }

    public java.util.List<Debate> getDebates() {
        java.util.List<Debate> result = new ArrayList<Debate>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Debate".equalsIgnoreCase(widget.getType())) {
                result.add((Debate) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Debate> getDebateList() {
        return getDebates();
    }

    //DSL Style set value
    public Debate addDebate(Debate debateElem) {
        this.addOverlayWidget(debateElem);
        return debateElem;
    }

    public java.util.List<Amendment> getAmendments() {
        java.util.List<Amendment> result = new ArrayList<Amendment>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Amendment".equalsIgnoreCase(widget.getType())) {
                result.add((Amendment) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Amendment> getAmendmentList() {
        return getAmendments();
    }

    //DSL Style set value
    public Amendment addAmendment(Amendment amendmentElem) {
        this.addOverlayWidget(amendmentElem);
        return amendmentElem;
    }

    public java.util.List<Judgement> getJudgements() {
        java.util.List<Judgement> result = new ArrayList<Judgement>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Judgement".equalsIgnoreCase(widget.getType())) {
                result.add((Judgement) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Judgement> getJudgementList() {
        return getJudgements();
    }

    //DSL Style set value
    public Judgement addJudgement(Judgement judgementElem) {
        this.addOverlayWidget(judgementElem);
        return judgementElem;
    }

    public java.util.List<Doc> getDocs() {
        java.util.List<Doc> result = new ArrayList<Doc>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Doc".equalsIgnoreCase(widget.getType())) {
                result.add((Doc) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Doc> getDocList() {
        return getDocs();
    }

    //DSL Style set value
    public Doc addDoc(Doc docElem) {
        this.addOverlayWidget(docElem);
        return docElem;
    }

    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
    }

    //DSL Style get value
    public IDSimpleType idAttr() {
        return getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        getElement().setAttribute("id", idAttr.getValue());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }

    //DSL Style get value
    public NMTOKENSimpleType evolvingIdAttr() {
        return getEvolvingIdAttr();
    }

    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        getElement().setAttribute("evolvingId", evolvingIdAttr.getValue());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(getElement().getAttribute("status"));
        }

        return statusAttr;
    }

    //DSL Style get value
    public StatusTypeSimpleType statusAttr() {
        return getStatusAttr();
    }

    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
        getElement().setAttribute("status", statusAttr.value());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo", refersToAttr.getValue());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(getElement().getAttribute("lang"));
        }

        return langAttr;
    }

    //DSL Style get value
    public LanguageSimpleType langAttr() {
        return getLangAttr();
    }

    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
        getElement().setAttribute("lang", langAttr.getValue());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }

    //DSL Style get value
    public String wildcardContentAttr() {
        return getWildcardContentAttr();
    }

    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        getElement().setAttribute("wildcardContent", wildcardContentAttr);
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(getElement().getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType alternativeToAttr() {
        return getAlternativeToAttr();
    }

    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
        getElement().setAttribute("alternativeTo", alternativeToAttr.getValue());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(getElement().getAttribute("class"));
        }

        return classAttr;
    }

    //DSL Style get value
    public StringSimpleType classAttr() {
        return getClassAttr();
    }

    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
        getElement().setAttribute("class", classAttr.getValue());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(getElement().getAttribute("style"));
        }

        return styleAttr;
    }

    //DSL Style get value
    public StringSimpleType styleAttr() {
        return getStyleAttr();
    }

    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
        getElement().setAttribute("style", styleAttr.getValue());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(getElement().getAttribute("title"));
        }

        return titleAttr;
    }

    //DSL Style get value
    public StringSimpleType titleAttr() {
        return getTitleAttr();
    }

    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
        getElement().setAttribute("title", titleAttr.getValue());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(getElement().getAttribute("period"));
        }

        return periodAttr;
    }

    //DSL Style get value
    public AnyURISimpleType periodAttr() {
        return getPeriodAttr();
    }

    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
        getElement().setAttribute("period", periodAttr.getValue());
    }

    //DSL Style set value
    public CollectionBodyTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
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
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }

    //DSL Style for html method
    @Override
    public CollectionBodyTypeComplexType html(String s) {
        super.html(s);
        return this;
    }
}

