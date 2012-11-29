package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class InlinereqreqComplexType extends AmendableWidgetImpl  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "inlinereqreqComplexType");
        span.setClassName("widget inlinereqreqComplexType");
        return span;
    }

    // CONSTRUCTORS ------------------

    public InlinereqreqComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private LanguageSimpleType langAttr;
    private AnyURISimpleType alternativeToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType refersToAttr;
    private StatusTypeSimpleType statusAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType periodAttr;

    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(amendableElement.getAttribute("lang"));
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
    public InlinereqreqComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }
    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(amendableElement.getAttribute("alternativeTo"));
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
    public InlinereqreqComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
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
    public InlinereqreqComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
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
    public InlinereqreqComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(amendableElement.getAttribute("class"));
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
    public InlinereqreqComplexType classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }
    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(amendableElement.getAttribute("style"));
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
    public InlinereqreqComplexType styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }
    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(amendableElement.getAttribute("title"));
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
    public InlinereqreqComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
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
    public InlinereqreqComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(amendableElement.getAttribute("status"));
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
    public InlinereqreqComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
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
    public InlinereqreqComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    public java.util.List<Inline> getInlines() {
        java.util.List<Inline> result = new ArrayList<Inline>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Inline".equalsIgnoreCase(widget.getType())) {
                result.add((Inline)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Inline> getInlineList() {
        return  getInlines();
    }
    //DSL Style set value
    public Inline addInline(Inline inlineElem) {
        this.addAmendableWidget(inlineElem);
        return inlineElem;
    }

    public java.util.List<Marker> getMarkers() {
        java.util.List<Marker> result = new ArrayList<Marker>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Marker".equalsIgnoreCase(widget.getType())) {
                result.add((Marker)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Marker> getMarkerList() {
        return  getMarkers();
    }
    //DSL Style set value
    public Marker addMarker(Marker markerElem) {
        this.addAmendableWidget(markerElem);
        return markerElem;
    }

    public java.util.List<Popup> getPopups() {
        java.util.List<Popup> result = new ArrayList<Popup>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Popup".equalsIgnoreCase(widget.getType())) {
                result.add((Popup)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Popup> getPopupList() {
        return  getPopups();
    }
    //DSL Style set value
    public Popup addPopup(Popup popupElem) {
        this.addAmendableWidget(popupElem);
        return popupElem;
    }

    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(amendableElement.getAttribute("period"));
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
    public InlinereqreqComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }
    public java.util.List<Ref> getRefs() {
        java.util.List<Ref> result = new ArrayList<Ref>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ref".equalsIgnoreCase(widget.getType())) {
                result.add((Ref)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Ref> getRefList() {
        return  getRefs();
    }
    //DSL Style set value
    public Ref addRef(Ref refElem) {
        this.addAmendableWidget(refElem);
        return refElem;
    }

    public java.util.List<Mref> getMrefs() {
        java.util.List<Mref> result = new ArrayList<Mref>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Mref".equalsIgnoreCase(widget.getType())) {
                result.add((Mref)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Mref> getMrefList() {
        return  getMrefs();
    }
    //DSL Style set value
    public Mref addMref(Mref mrefElem) {
        this.addAmendableWidget(mrefElem);
        return mrefElem;
    }

    public java.util.List<Rref> getRrefs() {
        java.util.List<Rref> result = new ArrayList<Rref>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Rref".equalsIgnoreCase(widget.getType())) {
                result.add((Rref)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Rref> getRrefList() {
        return  getRrefs();
    }
    //DSL Style set value
    public Rref addRref(Rref rrefElem) {
        this.addAmendableWidget(rrefElem);
        return rrefElem;
    }

    public java.util.List<Mod> getMods() {
        java.util.List<Mod> result = new ArrayList<Mod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Mod".equalsIgnoreCase(widget.getType())) {
                result.add((Mod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Mod> getModList() {
        return  getMods();
    }
    //DSL Style set value
    public Mod addMod(Mod modElem) {
        this.addAmendableWidget(modElem);
        return modElem;
    }

    public java.util.List<Mmod> getMmods() {
        java.util.List<Mmod> result = new ArrayList<Mmod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Mmod".equalsIgnoreCase(widget.getType())) {
                result.add((Mmod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Mmod> getMmodList() {
        return  getMmods();
    }
    //DSL Style set value
    public Mmod addMmod(Mmod mmodElem) {
        this.addAmendableWidget(mmodElem);
        return mmodElem;
    }

    public java.util.List<Rmod> getRmods() {
        java.util.List<Rmod> result = new ArrayList<Rmod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Rmod".equalsIgnoreCase(widget.getType())) {
                result.add((Rmod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Rmod> getRmodList() {
        return  getRmods();
    }
    //DSL Style set value
    public Rmod addRmod(Rmod rmodElem) {
        this.addAmendableWidget(rmodElem);
        return rmodElem;
    }

    public java.util.List<Remark> getRemarks() {
        java.util.List<Remark> result = new ArrayList<Remark>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Remark".equalsIgnoreCase(widget.getType())) {
                result.add((Remark)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Remark> getRemarkList() {
        return  getRemarks();
    }
    //DSL Style set value
    public Remark addRemark(Remark remarkElem) {
        this.addAmendableWidget(remarkElem);
        return remarkElem;
    }

    public java.util.List<RecordedTime> getRecordedTimes() {
        java.util.List<RecordedTime> result = new ArrayList<RecordedTime>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RecordedTime".equalsIgnoreCase(widget.getType())) {
                result.add((RecordedTime)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<RecordedTime> getRecordedTimeList() {
        return  getRecordedTimes();
    }
    //DSL Style set value
    public RecordedTime addRecordedTime(RecordedTime recordedTimeElem) {
        this.addAmendableWidget(recordedTimeElem);
        return recordedTimeElem;
    }

    public java.util.List<Vote> getVotes() {
        java.util.List<Vote> result = new ArrayList<Vote>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Vote".equalsIgnoreCase(widget.getType())) {
                result.add((Vote)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Vote> getVoteList() {
        return  getVotes();
    }
    //DSL Style set value
    public Vote addVote(Vote voteElem) {
        this.addAmendableWidget(voteElem);
        return voteElem;
    }

    public java.util.List<Outcome> getOutcomes() {
        java.util.List<Outcome> result = new ArrayList<Outcome>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Outcome".equalsIgnoreCase(widget.getType())) {
                result.add((Outcome)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Outcome> getOutcomeList() {
        return  getOutcomes();
    }
    //DSL Style set value
    public Outcome addOutcome(Outcome outcomeElem) {
        this.addAmendableWidget(outcomeElem);
        return outcomeElem;
    }

    public java.util.List<Ins> getInses() {
        java.util.List<Ins> result = new ArrayList<Ins>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ins".equalsIgnoreCase(widget.getType())) {
                result.add((Ins)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Ins> getInsList() {
        return  getInses();
    }
    //DSL Style set value
    public Ins addIns(Ins insElem) {
        this.addAmendableWidget(insElem);
        return insElem;
    }

    public java.util.List<Del> getDels() {
        java.util.List<Del> result = new ArrayList<Del>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Del".equalsIgnoreCase(widget.getType())) {
                result.add((Del)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Del> getDelList() {
        return  getDels();
    }
    //DSL Style set value
    public Del addDel(Del delElem) {
        this.addAmendableWidget(delElem);
        return delElem;
    }

    public java.util.List<Omissis> getOmissises() {
        java.util.List<Omissis> result = new ArrayList<Omissis>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Omissis".equalsIgnoreCase(widget.getType())) {
                result.add((Omissis)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Omissis> getOmissisList() {
        return  getOmissises();
    }
    //DSL Style set value
    public Omissis addOmissis(Omissis omissisElem) {
        this.addAmendableWidget(omissisElem);
        return omissisElem;
    }

    public java.util.List<ExtractText> getExtractTexts() {
        java.util.List<ExtractText> result = new ArrayList<ExtractText>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ExtractText".equalsIgnoreCase(widget.getType())) {
                result.add((ExtractText)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<ExtractText> getExtractTextList() {
        return  getExtractTexts();
    }
    //DSL Style set value
    public ExtractText addExtractText(ExtractText extractTextElem) {
        this.addAmendableWidget(extractTextElem);
        return extractTextElem;
    }

    public java.util.List<ExtractStructure> getExtractStructures() {
        java.util.List<ExtractStructure> result = new ArrayList<ExtractStructure>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ExtractStructure".equalsIgnoreCase(widget.getType())) {
                result.add((ExtractStructure)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<ExtractStructure> getExtractStructureList() {
        return  getExtractStructures();
    }
    //DSL Style set value
    public ExtractStructure addExtractStructure(ExtractStructure extractStructureElem) {
        this.addAmendableWidget(extractStructureElem);
        return extractStructureElem;
    }

    public java.util.List<Placeholder> getPlaceholders() {
        java.util.List<Placeholder> result = new ArrayList<Placeholder>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Placeholder".equalsIgnoreCase(widget.getType())) {
                result.add((Placeholder)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Placeholder> getPlaceholderList() {
        return  getPlaceholders();
    }
    //DSL Style set value
    public Placeholder addPlaceholder(Placeholder placeholderElem) {
        this.addAmendableWidget(placeholderElem);
        return placeholderElem;
    }

    public java.util.List<FillIn> getFillIns() {
        java.util.List<FillIn> result = new ArrayList<FillIn>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FillIn".equalsIgnoreCase(widget.getType())) {
                result.add((FillIn)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<FillIn> getFillInList() {
        return  getFillIns();
    }
    //DSL Style set value
    public FillIn addFillIn(FillIn fillInElem) {
        this.addAmendableWidget(fillInElem);
        return fillInElem;
    }

    public java.util.List<B> getBs() {
        java.util.List<B> result = new ArrayList<B>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("B".equalsIgnoreCase(widget.getType())) {
                result.add((B)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<B> getBList() {
        return  getBs();
    }
    //DSL Style set value
    public B addB(B bElem) {
        this.addAmendableWidget(bElem);
        return bElem;
    }

    public java.util.List<I> getIs() {
        java.util.List<I> result = new ArrayList<I>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("I".equalsIgnoreCase(widget.getType())) {
                result.add((I)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<I> getIList() {
        return  getIs();
    }
    //DSL Style set value
    public I addI(I iElem) {
        this.addAmendableWidget(iElem);
        return iElem;
    }

    public java.util.List<A> getAs() {
        java.util.List<A> result = new ArrayList<A>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("A".equalsIgnoreCase(widget.getType())) {
                result.add((A)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<A> getAList() {
        return  getAs();
    }
    //DSL Style set value
    public A addA(A aElem) {
        this.addAmendableWidget(aElem);
        return aElem;
    }

    public java.util.List<U> getUs() {
        java.util.List<U> result = new ArrayList<U>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("U".equalsIgnoreCase(widget.getType())) {
                result.add((U)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<U> getUList() {
        return  getUs();
    }
    //DSL Style set value
    public U addU(U uElem) {
        this.addAmendableWidget(uElem);
        return uElem;
    }

    public java.util.List<Sub> getSubs() {
        java.util.List<Sub> result = new ArrayList<Sub>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Sub".equalsIgnoreCase(widget.getType())) {
                result.add((Sub)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Sub> getSubList() {
        return  getSubs();
    }
    //DSL Style set value
    public Sub addSub(Sub subElem) {
        this.addAmendableWidget(subElem);
        return subElem;
    }

    public java.util.List<Sup> getSups() {
        java.util.List<Sup> result = new ArrayList<Sup>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Sup".equalsIgnoreCase(widget.getType())) {
                result.add((Sup)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Sup> getSupList() {
        return  getSups();
    }
    //DSL Style set value
    public Sup addSup(Sup supElem) {
        this.addAmendableWidget(supElem);
        return supElem;
    }

    public java.util.List<Span> getSpans() {
        java.util.List<Span> result = new ArrayList<Span>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Span".equalsIgnoreCase(widget.getType())) {
                result.add((Span)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Span> getSpanList() {
        return  getSpans();
    }
    //DSL Style set value
    public Span addSpan(Span spanElem) {
        this.addAmendableWidget(spanElem);
        return spanElem;
    }

    public java.util.List<DocType> getDocTypes() {
        java.util.List<DocType> result = new ArrayList<DocType>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocType".equalsIgnoreCase(widget.getType())) {
                result.add((DocType)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocType> getDocTypeList() {
        return  getDocTypes();
    }
    //DSL Style set value
    public DocType addDocType(DocType docTypeElem) {
        this.addAmendableWidget(docTypeElem);
        return docTypeElem;
    }

    public java.util.List<DocTitle> getDocTitles() {
        java.util.List<DocTitle> result = new ArrayList<DocTitle>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocTitle".equalsIgnoreCase(widget.getType())) {
                result.add((DocTitle)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocTitle> getDocTitleList() {
        return  getDocTitles();
    }
    //DSL Style set value
    public DocTitle addDocTitle(DocTitle docTitleElem) {
        this.addAmendableWidget(docTitleElem);
        return docTitleElem;
    }

    public java.util.List<DocNumber> getDocNumbers() {
        java.util.List<DocNumber> result = new ArrayList<DocNumber>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocNumber".equalsIgnoreCase(widget.getType())) {
                result.add((DocNumber)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocNumber> getDocNumberList() {
        return  getDocNumbers();
    }
    //DSL Style set value
    public DocNumber addDocNumber(DocNumber docNumberElem) {
        this.addAmendableWidget(docNumberElem);
        return docNumberElem;
    }

    public java.util.List<DocProponent> getDocProponents() {
        java.util.List<DocProponent> result = new ArrayList<DocProponent>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocProponent".equalsIgnoreCase(widget.getType())) {
                result.add((DocProponent)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocProponent> getDocProponentList() {
        return  getDocProponents();
    }
    //DSL Style set value
    public DocProponent addDocProponent(DocProponent docProponentElem) {
        this.addAmendableWidget(docProponentElem);
        return docProponentElem;
    }

    public java.util.List<DocDate> getDocDates() {
        java.util.List<DocDate> result = new ArrayList<DocDate>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocDate".equalsIgnoreCase(widget.getType())) {
                result.add((DocDate)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocDate> getDocDateList() {
        return  getDocDates();
    }
    //DSL Style set value
    public DocDate addDocDate(DocDate docDateElem) {
        this.addAmendableWidget(docDateElem);
        return docDateElem;
    }

    public java.util.List<Legislature> getLegislatures() {
        java.util.List<Legislature> result = new ArrayList<Legislature>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Legislature".equalsIgnoreCase(widget.getType())) {
                result.add((Legislature)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Legislature> getLegislatureList() {
        return  getLegislatures();
    }
    //DSL Style set value
    public Legislature addLegislature(Legislature legislatureElem) {
        this.addAmendableWidget(legislatureElem);
        return legislatureElem;
    }

    public java.util.List<Session> getSessions() {
        java.util.List<Session> result = new ArrayList<Session>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Session".equalsIgnoreCase(widget.getType())) {
                result.add((Session)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Session> getSessionList() {
        return  getSessions();
    }
    //DSL Style set value
    public Session addSession(Session sessionElem) {
        this.addAmendableWidget(sessionElem);
        return sessionElem;
    }

    public java.util.List<ShortTitle> getShortTitles() {
        java.util.List<ShortTitle> result = new ArrayList<ShortTitle>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ShortTitle".equalsIgnoreCase(widget.getType())) {
                result.add((ShortTitle)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<ShortTitle> getShortTitleList() {
        return  getShortTitles();
    }
    //DSL Style set value
    public ShortTitle addShortTitle(ShortTitle shortTitleElem) {
        this.addAmendableWidget(shortTitleElem);
        return shortTitleElem;
    }

    public java.util.List<DocPurpose> getDocPurposes() {
        java.util.List<DocPurpose> result = new ArrayList<DocPurpose>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocPurpose".equalsIgnoreCase(widget.getType())) {
                result.add((DocPurpose)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocPurpose> getDocPurposeList() {
        return  getDocPurposes();
    }
    //DSL Style set value
    public DocPurpose addDocPurpose(DocPurpose docPurposeElem) {
        this.addAmendableWidget(docPurposeElem);
        return docPurposeElem;
    }

    public java.util.List<DocCommittee> getDocCommittees() {
        java.util.List<DocCommittee> result = new ArrayList<DocCommittee>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocCommittee".equalsIgnoreCase(widget.getType())) {
                result.add((DocCommittee)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocCommittee> getDocCommitteeList() {
        return  getDocCommittees();
    }
    //DSL Style set value
    public DocCommittee addDocCommittee(DocCommittee docCommitteeElem) {
        this.addAmendableWidget(docCommitteeElem);
        return docCommitteeElem;
    }

    public java.util.List<DocIntroducer> getDocIntroducers() {
        java.util.List<DocIntroducer> result = new ArrayList<DocIntroducer>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocIntroducer".equalsIgnoreCase(widget.getType())) {
                result.add((DocIntroducer)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocIntroducer> getDocIntroducerList() {
        return  getDocIntroducers();
    }
    //DSL Style set value
    public DocIntroducer addDocIntroducer(DocIntroducer docIntroducerElem) {
        this.addAmendableWidget(docIntroducerElem);
        return docIntroducerElem;
    }

    public java.util.List<DocStage> getDocStages() {
        java.util.List<DocStage> result = new ArrayList<DocStage>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocStage".equalsIgnoreCase(widget.getType())) {
                result.add((DocStage)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocStage> getDocStageList() {
        return  getDocStages();
    }
    //DSL Style set value
    public DocStage addDocStage(DocStage docStageElem) {
        this.addAmendableWidget(docStageElem);
        return docStageElem;
    }

    public java.util.List<DocStatus> getDocStatuses() {
        java.util.List<DocStatus> result = new ArrayList<DocStatus>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocStatus".equalsIgnoreCase(widget.getType())) {
                result.add((DocStatus)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocStatus> getDocStatusList() {
        return  getDocStatuses();
    }
    //DSL Style set value
    public DocStatus addDocStatus(DocStatus docStatusElem) {
        this.addAmendableWidget(docStatusElem);
        return docStatusElem;
    }

    public java.util.List<DocJurisdiction> getDocJurisdictions() {
        java.util.List<DocJurisdiction> result = new ArrayList<DocJurisdiction>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocJurisdiction".equalsIgnoreCase(widget.getType())) {
                result.add((DocJurisdiction)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocJurisdiction> getDocJurisdictionList() {
        return  getDocJurisdictions();
    }
    //DSL Style set value
    public DocJurisdiction addDocJurisdiction(DocJurisdiction docJurisdictionElem) {
        this.addAmendableWidget(docJurisdictionElem);
        return docJurisdictionElem;
    }

    public java.util.List<DocketNumber> getDocketNumbers() {
        java.util.List<DocketNumber> result = new ArrayList<DocketNumber>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocketNumber".equalsIgnoreCase(widget.getType())) {
                result.add((DocketNumber)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DocketNumber> getDocketNumberList() {
        return  getDocketNumbers();
    }
    //DSL Style set value
    public DocketNumber addDocketNumber(DocketNumber docketNumberElem) {
        this.addAmendableWidget(docketNumberElem);
        return docketNumberElem;
    }

    public java.util.List<Date> getDates() {
        java.util.List<Date> result = new ArrayList<Date>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Date".equalsIgnoreCase(widget.getType())) {
                result.add((Date)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Date> getDateList() {
        return  getDates();
    }
    //DSL Style set value
    public Date addDate(Date dateElem) {
        this.addAmendableWidget(dateElem);
        return dateElem;
    }

    public java.util.List<Person> getPersons() {
        java.util.List<Person> result = new ArrayList<Person>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Person".equalsIgnoreCase(widget.getType())) {
                result.add((Person)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Person> getPersonList() {
        return  getPersons();
    }
    //DSL Style set value
    public Person addPerson(Person personElem) {
        this.addAmendableWidget(personElem);
        return personElem;
    }

    public java.util.List<Organization> getOrganizations() {
        java.util.List<Organization> result = new ArrayList<Organization>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Organization".equalsIgnoreCase(widget.getType())) {
                result.add((Organization)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Organization> getOrganizationList() {
        return  getOrganizations();
    }
    //DSL Style set value
    public Organization addOrganization(Organization organizationElem) {
        this.addAmendableWidget(organizationElem);
        return organizationElem;
    }

    public java.util.List<Concept> getConcepts() {
        java.util.List<Concept> result = new ArrayList<Concept>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Concept".equalsIgnoreCase(widget.getType())) {
                result.add((Concept)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Concept> getConceptList() {
        return  getConcepts();
    }
    //DSL Style set value
    public Concept addConcept(Concept conceptElem) {
        this.addAmendableWidget(conceptElem);
        return conceptElem;
    }

    public java.util.List<Object> getObjects() {
        java.util.List<Object> result = new ArrayList<Object>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Object".equalsIgnoreCase(widget.getType())) {
                result.add((Object)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Object> getObjectList() {
        return  getObjects();
    }
    //DSL Style set value
    public Object addObject(Object objectElem) {
        this.addAmendableWidget(objectElem);
        return objectElem;
    }

    public java.util.List<Event> getEvents() {
        java.util.List<Event> result = new ArrayList<Event>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Event".equalsIgnoreCase(widget.getType())) {
                result.add((Event)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Event> getEventList() {
        return  getEvents();
    }
    //DSL Style set value
    public Event addEvent(Event eventElem) {
        this.addAmendableWidget(eventElem);
        return eventElem;
    }

    public java.util.List<Location> getLocations() {
        java.util.List<Location> result = new ArrayList<Location>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Location".equalsIgnoreCase(widget.getType())) {
                result.add((Location)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Location> getLocationList() {
        return  getLocations();
    }
    //DSL Style set value
    public Location addLocation(Location locationElem) {
        this.addAmendableWidget(locationElem);
        return locationElem;
    }

    public java.util.List<Process> getProcesses() {
        java.util.List<Process> result = new ArrayList<Process>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Process".equalsIgnoreCase(widget.getType())) {
                result.add((Process)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Process> getProcessList() {
        return  getProcesses();
    }
    //DSL Style set value
    public Process addProcess(Process processElem) {
        this.addAmendableWidget(processElem);
        return processElem;
    }

    public java.util.List<Role> getRoles() {
        java.util.List<Role> result = new ArrayList<Role>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Role".equalsIgnoreCase(widget.getType())) {
                result.add((Role)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Role> getRoleList() {
        return  getRoles();
    }
    //DSL Style set value
    public Role addRole(Role roleElem) {
        this.addAmendableWidget(roleElem);
        return roleElem;
    }

    public java.util.List<Term> getTerms() {
        java.util.List<Term> result = new ArrayList<Term>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Term".equalsIgnoreCase(widget.getType())) {
                result.add((Term)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Term> getTermList() {
        return  getTerms();
    }
    //DSL Style set value
    public Term addTerm(Term termElem) {
        this.addAmendableWidget(termElem);
        return termElem;
    }

    public java.util.List<Quantity> getQuantities() {
        java.util.List<Quantity> result = new ArrayList<Quantity>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Quantity".equalsIgnoreCase(widget.getType())) {
                result.add((Quantity)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Quantity> getQuantityList() {
        return  getQuantities();
    }
    //DSL Style set value
    public Quantity addQuantity(Quantity quantityElem) {
        this.addAmendableWidget(quantityElem);
        return quantityElem;
    }

    public java.util.List<Def> getDefs() {
        java.util.List<Def> result = new ArrayList<Def>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Def".equalsIgnoreCase(widget.getType())) {
                result.add((Def)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Def> getDefList() {
        return  getDefs();
    }
    //DSL Style set value
    public Def addDef(Def defElem) {
        this.addAmendableWidget(defElem);
        return defElem;
    }

    public java.util.List<Entity> getEntities() {
        java.util.List<Entity> result = new ArrayList<Entity>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Entity".equalsIgnoreCase(widget.getType())) {
                result.add((Entity)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Entity> getEntityList() {
        return  getEntities();
    }
    //DSL Style set value
    public Entity addEntity(Entity entityElem) {
        this.addAmendableWidget(entityElem);
        return entityElem;
    }

    public java.util.List<CourtType> getCourtTypes() {
        java.util.List<CourtType> result = new ArrayList<CourtType>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("CourtType".equalsIgnoreCase(widget.getType())) {
                result.add((CourtType)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<CourtType> getCourtTypeList() {
        return  getCourtTypes();
    }
    //DSL Style set value
    public CourtType addCourtType(CourtType courtTypeElem) {
        this.addAmendableWidget(courtTypeElem);
        return courtTypeElem;
    }

    public java.util.List<NeutralCitation> getNeutralCitations() {
        java.util.List<NeutralCitation> result = new ArrayList<NeutralCitation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NeutralCitation".equalsIgnoreCase(widget.getType())) {
                result.add((NeutralCitation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<NeutralCitation> getNeutralCitationList() {
        return  getNeutralCitations();
    }
    //DSL Style set value
    public NeutralCitation addNeutralCitation(NeutralCitation neutralCitationElem) {
        this.addAmendableWidget(neutralCitationElem);
        return neutralCitationElem;
    }

    public java.util.List<Party> getParties() {
        java.util.List<Party> result = new ArrayList<Party>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Party".equalsIgnoreCase(widget.getType())) {
                result.add((Party)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Party> getPartyList() {
        return  getParties();
    }
    //DSL Style set value
    public Party addParty(Party partyElem) {
        this.addAmendableWidget(partyElem);
        return partyElem;
    }

    public java.util.List<Judge> getJudges() {
        java.util.List<Judge> result = new ArrayList<Judge>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Judge".equalsIgnoreCase(widget.getType())) {
                result.add((Judge)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Judge> getJudgeList() {
        return  getJudges();
    }
    //DSL Style set value
    public Judge addJudge(Judge judgeElem) {
        this.addAmendableWidget(judgeElem);
        return judgeElem;
    }

    public java.util.List<Lawyer> getLawyers() {
        java.util.List<Lawyer> result = new ArrayList<Lawyer>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Lawyer".equalsIgnoreCase(widget.getType())) {
                result.add((Lawyer)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Lawyer> getLawyerList() {
        return  getLawyers();
    }
    //DSL Style set value
    public Lawyer addLawyer(Lawyer lawyerElem) {
        this.addAmendableWidget(lawyerElem);
        return lawyerElem;
    }

    public java.util.List<Signature> getSignatures() {
        java.util.List<Signature> result = new ArrayList<Signature>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Signature".equalsIgnoreCase(widget.getType())) {
                result.add((Signature)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Signature> getSignatureList() {
        return  getSignatures();
    }
    //DSL Style set value
    public Signature addSignature(Signature signatureElem) {
        this.addAmendableWidget(signatureElem);
        return signatureElem;
    }

    public java.util.List<Opinion> getOpinions() {
        java.util.List<Opinion> result = new ArrayList<Opinion>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Opinion".equalsIgnoreCase(widget.getType())) {
                result.add((Opinion)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Opinion> getOpinionList() {
        return  getOpinions();
    }
    //DSL Style set value
    public Opinion addOpinion(Opinion opinionElem) {
        this.addAmendableWidget(opinionElem);
        return opinionElem;
    }

    public java.util.List<AffectedDocument> getAffectedDocuments() {
        java.util.List<AffectedDocument> result = new ArrayList<AffectedDocument>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AffectedDocument".equalsIgnoreCase(widget.getType())) {
                result.add((AffectedDocument)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<AffectedDocument> getAffectedDocumentList() {
        return  getAffectedDocuments();
    }
    //DSL Style set value
    public AffectedDocument addAffectedDocument(AffectedDocument affectedDocumentElem) {
        this.addAmendableWidget(affectedDocumentElem);
        return affectedDocumentElem;
    }

    public java.util.List<RelatedDocument> getRelatedDocuments() {
        java.util.List<RelatedDocument> result = new ArrayList<RelatedDocument>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RelatedDocument".equalsIgnoreCase(widget.getType())) {
                result.add((RelatedDocument)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<RelatedDocument> getRelatedDocumentList() {
        return  getRelatedDocuments();
    }
    //DSL Style set value
    public RelatedDocument addRelatedDocument(RelatedDocument relatedDocumentElem) {
        this.addAmendableWidget(relatedDocumentElem);
        return relatedDocumentElem;
    }

    public java.util.List<Change> getChanges() {
        java.util.List<Change> result = new ArrayList<Change>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Change".equalsIgnoreCase(widget.getType())) {
                result.add((Change)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Change> getChangeList() {
        return  getChanges();
    }
    //DSL Style set value
    public Change addChange(Change changeElem) {
        this.addAmendableWidget(changeElem);
        return changeElem;
    }

    public java.util.List<NoteRef> getNoteRefs() {
        java.util.List<NoteRef> result = new ArrayList<NoteRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NoteRef".equalsIgnoreCase(widget.getType())) {
                result.add((NoteRef)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<NoteRef> getNoteRefList() {
        return  getNoteRefs();
    }
    //DSL Style set value
    public NoteRef addNoteRef(NoteRef noteRefElem) {
        this.addAmendableWidget(noteRefElem);
        return noteRefElem;
    }

    public java.util.List<Eol> getEols() {
        java.util.List<Eol> result = new ArrayList<Eol>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Eol".equalsIgnoreCase(widget.getType())) {
                result.add((Eol)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Eol> getEolList() {
        return  getEols();
    }
    //DSL Style set value
    public Eol addEol(Eol eolElem) {
        this.addAmendableWidget(eolElem);
        return eolElem;
    }

    public java.util.List<Eop> getEops() {
        java.util.List<Eop> result = new ArrayList<Eop>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Eop".equalsIgnoreCase(widget.getType())) {
                result.add((Eop)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Eop> getEopList() {
        return  getEops();
    }
    //DSL Style set value
    public Eop addEop(Eop eopElem) {
        this.addAmendableWidget(eopElem);
        return eopElem;
    }

    public java.util.List<Img> getImgs() {
        java.util.List<Img> result = new ArrayList<Img>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Img".equalsIgnoreCase(widget.getType())) {
                result.add((Img)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Img> getImgList() {
        return  getImgs();
    }
    //DSL Style set value
    public Img addImg(Img imgElem) {
        this.addAmendableWidget(imgElem);
        return imgElem;
    }

    public java.util.List<AuthorialNote> getAuthorialNotes() {
        java.util.List<AuthorialNote> result = new ArrayList<AuthorialNote>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AuthorialNote".equalsIgnoreCase(widget.getType())) {
                result.add((AuthorialNote)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<AuthorialNote> getAuthorialNoteList() {
        return  getAuthorialNotes();
    }
    //DSL Style set value
    public AuthorialNote addAuthorialNote(AuthorialNote authorialNoteElem) {
        this.addAmendableWidget(authorialNoteElem);
        return authorialNoteElem;
    }

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
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
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }
}

