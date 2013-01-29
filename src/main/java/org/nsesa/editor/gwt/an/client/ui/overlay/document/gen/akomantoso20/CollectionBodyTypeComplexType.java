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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class CollectionBodyTypeComplexType extends AmendableWidgetImpl  {

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
private AnyURISimpleType refersToAttr;
private AnyURISimpleType alternativeToAttr;
private StatusTypeSimpleType statusAttr;
private String wildcardContentAttr;
private LanguageSimpleType langAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private StringSimpleType classAttr;
private StringSimpleType styleAttr;
private StringSimpleType titleAttr;
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
            //DSL Style get value
            public java.util.List<ComponentRef> getComponentRefList() {
            return  getComponentRefs();
            }
            //DSL Style set value
            public ComponentRef addComponentRef(ComponentRef componentRefElem) {
                this.addAmendableWidget(componentRefElem);
                return componentRefElem;
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
            //DSL Style get value
            public java.util.List<Interstitial> getInterstitialList() {
            return  getInterstitials();
            }
            //DSL Style set value
            public Interstitial addInterstitial(Interstitial interstitialElem) {
                this.addAmendableWidget(interstitialElem);
                return interstitialElem;
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
            //DSL Style get value
            public java.util.List<AmendmentList> getAmendmentListList() {
            return  getAmendmentLists();
            }
            //DSL Style set value
            public AmendmentList addAmendmentList(AmendmentList amendmentListElem) {
                this.addAmendableWidget(amendmentListElem);
                return amendmentListElem;
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
            //DSL Style get value
            public java.util.List<OfficialGazette> getOfficialGazetteList() {
            return  getOfficialGazettes();
            }
            //DSL Style set value
            public OfficialGazette addOfficialGazette(OfficialGazette officialGazetteElem) {
                this.addAmendableWidget(officialGazetteElem);
                return officialGazetteElem;
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
            //DSL Style get value
            public java.util.List<DocumentCollection> getDocumentCollectionList() {
            return  getDocumentCollections();
            }
            //DSL Style set value
            public DocumentCollection addDocumentCollection(DocumentCollection documentCollectionElem) {
                this.addAmendableWidget(documentCollectionElem);
                return documentCollectionElem;
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
            //DSL Style get value
            public java.util.List<Act> getActList() {
            return  getActs();
            }
            //DSL Style set value
            public Act addAct(Act actElem) {
                this.addAmendableWidget(actElem);
                return actElem;
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
            //DSL Style get value
            public java.util.List<Bill> getBillList() {
            return  getBills();
            }
            //DSL Style set value
            public Bill addBill(Bill billElem) {
                this.addAmendableWidget(billElem);
                return billElem;
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
            //DSL Style get value
            public java.util.List<DebateReport> getDebateReportList() {
            return  getDebateReports();
            }
            //DSL Style set value
            public DebateReport addDebateReport(DebateReport debateReportElem) {
                this.addAmendableWidget(debateReportElem);
                return debateReportElem;
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
            //DSL Style get value
            public java.util.List<Debate> getDebateList() {
            return  getDebates();
            }
            //DSL Style set value
            public Debate addDebate(Debate debateElem) {
                this.addAmendableWidget(debateElem);
                return debateElem;
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
            //DSL Style get value
            public java.util.List<Amendment> getAmendmentList() {
            return  getAmendments();
            }
            //DSL Style set value
            public Amendment addAmendment(Amendment amendmentElem) {
                this.addAmendableWidget(amendmentElem);
                return amendmentElem;
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
            //DSL Style get value
            public java.util.List<Judgement> getJudgementList() {
            return  getJudgements();
            }
            //DSL Style set value
            public Judgement addJudgement(Judgement judgementElem) {
                this.addAmendableWidget(judgementElem);
                return judgementElem;
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
            //DSL Style get value
            public java.util.List<Doc> getDocList() {
            return  getDocs();
            }
            //DSL Style set value
            public Doc addDoc(Doc docElem) {
                this.addAmendableWidget(docElem);
                return docElem;
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
        return  getRefersToAttr();
        }

        public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        }
        //DSL Style set value
        public CollectionBodyTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
        return  getAlternativeToAttr();
        }

        public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
        }
        //DSL Style set value
        public CollectionBodyTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
        return  getStatusAttr();
        }

        public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
        }
        //DSL Style set value
        public CollectionBodyTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
        return  getWildcardContentAttr();
        }

        public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        }
        //DSL Style set value
        public CollectionBodyTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
        return  getLangAttr();
        }

        public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
        }
        //DSL Style set value
        public CollectionBodyTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
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
        return  getIdAttr();
        }

        public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
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
        return  getEvolvingIdAttr();
        }

        public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        }
        //DSL Style set value
        public CollectionBodyTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
        return  getClassAttr();
        }

        public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
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
        return  getStyleAttr();
        }

        public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
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
        return  getTitleAttr();
        }

        public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
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
        return  getPeriodAttr();
        }

        public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
        }
        //DSL Style set value
        public CollectionBodyTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"act","amendment","amendmentList","bill","componentRef","debate","debateReport","doc","documentCollection","interstitial","judgement","officialGazette"};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
return attrs;
}
}

