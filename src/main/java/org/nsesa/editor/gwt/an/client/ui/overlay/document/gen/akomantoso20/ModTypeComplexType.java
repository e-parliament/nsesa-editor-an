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

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.QuotedText;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.QuotedStructure;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Inline;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Marker;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Popup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Ref;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Mref;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Rref;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Mod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Mmod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Rmod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Remark;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.RecordedTime;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Vote;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Outcome;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Ins;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Del;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Omissis;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ExtractText;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ExtractStructure;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Placeholder;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FillIn;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.B;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.I;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.A;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.U;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Sub;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Sup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Span;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocTitle;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocNumber;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocProponent;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocDate;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Legislature;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Session;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ShortTitle;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocPurpose;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocCommittee;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocIntroducer;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocStage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocStatus;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocJurisdiction;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocketNumber;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Date;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Person;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Organization;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Concept;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Object;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Event;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Location;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Process;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Role;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Term;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Quantity;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Def;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Entity;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CourtType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.NeutralCitation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Party;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Judge;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Lawyer;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Signature;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Opinion;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AffectedDocument;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.RelatedDocument;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Change;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.NoteRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Eol;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Eop;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Img;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AuthorialNote;
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

public class ModTypeComplexType extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new QuotedText(), new Occurrence(1, 1));
            put(new QuotedStructure(), new Occurrence(1, 1));
            put(new Inline(), new Occurrence(0, -1));
            put(new Marker(), new Occurrence(0, -1));
            put(new Popup(), new Occurrence(0, -1));
            put(new Ref(), new Occurrence(0, -1));
            put(new Mref(), new Occurrence(0, -1));
            put(new Rref(), new Occurrence(0, -1));
            put(new Mod(), new Occurrence(0, -1));
            put(new Mmod(), new Occurrence(0, -1));
            put(new Rmod(), new Occurrence(0, -1));
            put(new Remark(), new Occurrence(0, -1));
            put(new RecordedTime(), new Occurrence(0, -1));
            put(new Vote(), new Occurrence(0, -1));
            put(new Outcome(), new Occurrence(0, -1));
            put(new Ins(), new Occurrence(0, -1));
            put(new Del(), new Occurrence(0, -1));
            put(new Omissis(), new Occurrence(0, -1));
            put(new ExtractText(), new Occurrence(0, -1));
            put(new ExtractStructure(), new Occurrence(0, -1));
            put(new Placeholder(), new Occurrence(0, -1));
            put(new FillIn(), new Occurrence(0, -1));
            put(new B(), new Occurrence(0, -1));
            put(new I(), new Occurrence(0, -1));
            put(new A(), new Occurrence(0, -1));
            put(new U(), new Occurrence(0, -1));
            put(new Sub(), new Occurrence(0, -1));
            put(new Sup(), new Occurrence(0, -1));
            put(new Span(), new Occurrence(0, -1));
            put(new DocType(), new Occurrence(0, -1));
            put(new DocTitle(), new Occurrence(0, -1));
            put(new DocNumber(), new Occurrence(0, -1));
            put(new DocProponent(), new Occurrence(0, -1));
            put(new DocDate(), new Occurrence(0, -1));
            put(new Legislature(), new Occurrence(0, -1));
            put(new Session(), new Occurrence(0, -1));
            put(new ShortTitle(), new Occurrence(0, -1));
            put(new DocPurpose(), new Occurrence(0, -1));
            put(new DocCommittee(), new Occurrence(0, -1));
            put(new DocIntroducer(), new Occurrence(0, -1));
            put(new DocStage(), new Occurrence(0, -1));
            put(new DocStatus(), new Occurrence(0, -1));
            put(new DocJurisdiction(), new Occurrence(0, -1));
            put(new DocketNumber(), new Occurrence(0, -1));
            put(new Date(), new Occurrence(0, -1));
            put(new Person(), new Occurrence(0, -1));
            put(new Organization(), new Occurrence(0, -1));
            put(new Concept(), new Occurrence(0, -1));
            put(new Object(), new Occurrence(0, -1));
            put(new Event(), new Occurrence(0, -1));
            put(new Location(), new Occurrence(0, -1));
            put(new Process(), new Occurrence(0, -1));
            put(new Role(), new Occurrence(0, -1));
            put(new Term(), new Occurrence(0, -1));
            put(new Quantity(), new Occurrence(0, -1));
            put(new Def(), new Occurrence(0, -1));
            put(new Entity(), new Occurrence(0, -1));
            put(new CourtType(), new Occurrence(0, -1));
            put(new NeutralCitation(), new Occurrence(0, -1));
            put(new Party(), new Occurrence(0, -1));
            put(new Judge(), new Occurrence(0, -1));
            put(new Lawyer(), new Occurrence(0, -1));
            put(new Signature(), new Occurrence(0, -1));
            put(new Opinion(), new Occurrence(0, -1));
            put(new AffectedDocument(), new Occurrence(0, -1));
            put(new RelatedDocument(), new Occurrence(0, -1));
            put(new Change(), new Occurrence(0, -1));
            put(new NoteRef(), new Occurrence(0, -1));
            put(new Eol(), new Occurrence(0, -1));
            put(new Eop(), new Occurrence(0, -1));
            put(new Img(), new Occurrence(0, -1));
            put(new AuthorialNote(), new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "modTypeComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget modTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public ModTypeComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private String wildcardContentAttr;
    private LanguageSimpleType langAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType alternativeToAttr;
    private AnyURISimpleType refersToAttr;
    private StatusTypeSimpleType statusAttr;
    private AnyURISimpleType periodAttr;

    public java.util.List<QuotedText> getQuotedTexts() {
        java.util.List<QuotedText> result = new ArrayList<QuotedText>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("QuotedText".equalsIgnoreCase(widget.getType())) {
                result.add((QuotedText) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<QuotedText> getQuotedTextList() {
        return getQuotedTexts();
    }

    //DSL Style set value
    public QuotedText addQuotedText(QuotedText quotedTextElem) {
        this.addOverlayWidget(quotedTextElem);
        return quotedTextElem;
    }

    public java.util.List<QuotedStructure> getQuotedStructures() {
        java.util.List<QuotedStructure> result = new ArrayList<QuotedStructure>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("QuotedStructure".equalsIgnoreCase(widget.getType())) {
                result.add((QuotedStructure) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<QuotedStructure> getQuotedStructureList() {
        return getQuotedStructures();
    }

    //DSL Style set value
    public QuotedStructure addQuotedStructure(QuotedStructure quotedStructureElem) {
        this.addOverlayWidget(quotedStructureElem);
        return quotedStructureElem;
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
    public ModTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
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
        return getLangAttr();
    }

    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
        getElement().setAttribute("lang", langAttr.getValue());
    }

    //DSL Style set value
    public ModTypeComplexType langAttr(final LanguageSimpleType langAttr) {
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
        return getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        getElement().setAttribute("id", idAttr.getValue());
    }

    //DSL Style set value
    public ModTypeComplexType idAttr(final IDSimpleType idAttr) {
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
    public ModTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
        return getClassAttr();
    }

    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
        getElement().setAttribute("class", classAttr.getValue());
    }

    //DSL Style set value
    public ModTypeComplexType classAttr(final StringSimpleType classAttr) {
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
    public ModTypeComplexType styleAttr(final StringSimpleType styleAttr) {
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
    public ModTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
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
    public ModTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
    public ModTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
    public ModTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    public java.util.List<Inline> getInlines() {
        java.util.List<Inline> result = new ArrayList<Inline>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Inline".equalsIgnoreCase(widget.getType())) {
                result.add((Inline) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Inline> getInlineList() {
        return getInlines();
    }

    //DSL Style set value
    public Inline addInline(Inline inlineElem) {
        this.addOverlayWidget(inlineElem);
        return inlineElem;
    }

    public java.util.List<Marker> getMarkers() {
        java.util.List<Marker> result = new ArrayList<Marker>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Marker".equalsIgnoreCase(widget.getType())) {
                result.add((Marker) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Marker> getMarkerList() {
        return getMarkers();
    }

    //DSL Style set value
    public Marker addMarker(Marker markerElem) {
        this.addOverlayWidget(markerElem);
        return markerElem;
    }

    public java.util.List<Popup> getPopups() {
        java.util.List<Popup> result = new ArrayList<Popup>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Popup".equalsIgnoreCase(widget.getType())) {
                result.add((Popup) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Popup> getPopupList() {
        return getPopups();
    }

    //DSL Style set value
    public Popup addPopup(Popup popupElem) {
        this.addOverlayWidget(popupElem);
        return popupElem;
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
    public ModTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    public java.util.List<Ref> getRefs() {
        java.util.List<Ref> result = new ArrayList<Ref>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Ref".equalsIgnoreCase(widget.getType())) {
                result.add((Ref) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Ref> getRefList() {
        return getRefs();
    }

    //DSL Style set value
    public Ref addRef(Ref refElem) {
        this.addOverlayWidget(refElem);
        return refElem;
    }

    public java.util.List<Mref> getMrefs() {
        java.util.List<Mref> result = new ArrayList<Mref>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Mref".equalsIgnoreCase(widget.getType())) {
                result.add((Mref) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Mref> getMrefList() {
        return getMrefs();
    }

    //DSL Style set value
    public Mref addMref(Mref mrefElem) {
        this.addOverlayWidget(mrefElem);
        return mrefElem;
    }

    public java.util.List<Rref> getRrefs() {
        java.util.List<Rref> result = new ArrayList<Rref>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Rref".equalsIgnoreCase(widget.getType())) {
                result.add((Rref) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Rref> getRrefList() {
        return getRrefs();
    }

    //DSL Style set value
    public Rref addRref(Rref rrefElem) {
        this.addOverlayWidget(rrefElem);
        return rrefElem;
    }

    public java.util.List<Mod> getMods() {
        java.util.List<Mod> result = new ArrayList<Mod>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Mod".equalsIgnoreCase(widget.getType())) {
                result.add((Mod) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Mod> getModList() {
        return getMods();
    }

    //DSL Style set value
    public Mod addMod(Mod modElem) {
        this.addOverlayWidget(modElem);
        return modElem;
    }

    public java.util.List<Mmod> getMmods() {
        java.util.List<Mmod> result = new ArrayList<Mmod>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Mmod".equalsIgnoreCase(widget.getType())) {
                result.add((Mmod) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Mmod> getMmodList() {
        return getMmods();
    }

    //DSL Style set value
    public Mmod addMmod(Mmod mmodElem) {
        this.addOverlayWidget(mmodElem);
        return mmodElem;
    }

    public java.util.List<Rmod> getRmods() {
        java.util.List<Rmod> result = new ArrayList<Rmod>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Rmod".equalsIgnoreCase(widget.getType())) {
                result.add((Rmod) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Rmod> getRmodList() {
        return getRmods();
    }

    //DSL Style set value
    public Rmod addRmod(Rmod rmodElem) {
        this.addOverlayWidget(rmodElem);
        return rmodElem;
    }

    public java.util.List<Remark> getRemarks() {
        java.util.List<Remark> result = new ArrayList<Remark>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Remark".equalsIgnoreCase(widget.getType())) {
                result.add((Remark) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Remark> getRemarkList() {
        return getRemarks();
    }

    //DSL Style set value
    public Remark addRemark(Remark remarkElem) {
        this.addOverlayWidget(remarkElem);
        return remarkElem;
    }

    public java.util.List<RecordedTime> getRecordedTimes() {
        java.util.List<RecordedTime> result = new ArrayList<RecordedTime>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("RecordedTime".equalsIgnoreCase(widget.getType())) {
                result.add((RecordedTime) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<RecordedTime> getRecordedTimeList() {
        return getRecordedTimes();
    }

    //DSL Style set value
    public RecordedTime addRecordedTime(RecordedTime recordedTimeElem) {
        this.addOverlayWidget(recordedTimeElem);
        return recordedTimeElem;
    }

    public java.util.List<Vote> getVotes() {
        java.util.List<Vote> result = new ArrayList<Vote>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Vote".equalsIgnoreCase(widget.getType())) {
                result.add((Vote) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Vote> getVoteList() {
        return getVotes();
    }

    //DSL Style set value
    public Vote addVote(Vote voteElem) {
        this.addOverlayWidget(voteElem);
        return voteElem;
    }

    public java.util.List<Outcome> getOutcomes() {
        java.util.List<Outcome> result = new ArrayList<Outcome>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Outcome".equalsIgnoreCase(widget.getType())) {
                result.add((Outcome) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Outcome> getOutcomeList() {
        return getOutcomes();
    }

    //DSL Style set value
    public Outcome addOutcome(Outcome outcomeElem) {
        this.addOverlayWidget(outcomeElem);
        return outcomeElem;
    }

    public java.util.List<Ins> getInses() {
        java.util.List<Ins> result = new ArrayList<Ins>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Ins".equalsIgnoreCase(widget.getType())) {
                result.add((Ins) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Ins> getInsList() {
        return getInses();
    }

    //DSL Style set value
    public Ins addIns(Ins insElem) {
        this.addOverlayWidget(insElem);
        return insElem;
    }

    public java.util.List<Del> getDels() {
        java.util.List<Del> result = new ArrayList<Del>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Del".equalsIgnoreCase(widget.getType())) {
                result.add((Del) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Del> getDelList() {
        return getDels();
    }

    //DSL Style set value
    public Del addDel(Del delElem) {
        this.addOverlayWidget(delElem);
        return delElem;
    }

    public java.util.List<Omissis> getOmissises() {
        java.util.List<Omissis> result = new ArrayList<Omissis>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Omissis".equalsIgnoreCase(widget.getType())) {
                result.add((Omissis) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Omissis> getOmissisList() {
        return getOmissises();
    }

    //DSL Style set value
    public Omissis addOmissis(Omissis omissisElem) {
        this.addOverlayWidget(omissisElem);
        return omissisElem;
    }

    public java.util.List<ExtractText> getExtractTexts() {
        java.util.List<ExtractText> result = new ArrayList<ExtractText>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ExtractText".equalsIgnoreCase(widget.getType())) {
                result.add((ExtractText) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<ExtractText> getExtractTextList() {
        return getExtractTexts();
    }

    //DSL Style set value
    public ExtractText addExtractText(ExtractText extractTextElem) {
        this.addOverlayWidget(extractTextElem);
        return extractTextElem;
    }

    public java.util.List<ExtractStructure> getExtractStructures() {
        java.util.List<ExtractStructure> result = new ArrayList<ExtractStructure>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ExtractStructure".equalsIgnoreCase(widget.getType())) {
                result.add((ExtractStructure) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<ExtractStructure> getExtractStructureList() {
        return getExtractStructures();
    }

    //DSL Style set value
    public ExtractStructure addExtractStructure(ExtractStructure extractStructureElem) {
        this.addOverlayWidget(extractStructureElem);
        return extractStructureElem;
    }

    public java.util.List<Placeholder> getPlaceholders() {
        java.util.List<Placeholder> result = new ArrayList<Placeholder>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Placeholder".equalsIgnoreCase(widget.getType())) {
                result.add((Placeholder) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Placeholder> getPlaceholderList() {
        return getPlaceholders();
    }

    //DSL Style set value
    public Placeholder addPlaceholder(Placeholder placeholderElem) {
        this.addOverlayWidget(placeholderElem);
        return placeholderElem;
    }

    public java.util.List<FillIn> getFillIns() {
        java.util.List<FillIn> result = new ArrayList<FillIn>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FillIn".equalsIgnoreCase(widget.getType())) {
                result.add((FillIn) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<FillIn> getFillInList() {
        return getFillIns();
    }

    //DSL Style set value
    public FillIn addFillIn(FillIn fillInElem) {
        this.addOverlayWidget(fillInElem);
        return fillInElem;
    }

    public java.util.List<B> getBs() {
        java.util.List<B> result = new ArrayList<B>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("B".equalsIgnoreCase(widget.getType())) {
                result.add((B) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<B> getBList() {
        return getBs();
    }

    //DSL Style set value
    public B addB(B bElem) {
        this.addOverlayWidget(bElem);
        return bElem;
    }

    public java.util.List<I> getIs() {
        java.util.List<I> result = new ArrayList<I>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("I".equalsIgnoreCase(widget.getType())) {
                result.add((I) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<I> getIList() {
        return getIs();
    }

    //DSL Style set value
    public I addI(I iElem) {
        this.addOverlayWidget(iElem);
        return iElem;
    }

    public java.util.List<A> getAs() {
        java.util.List<A> result = new ArrayList<A>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("A".equalsIgnoreCase(widget.getType())) {
                result.add((A) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<A> getAList() {
        return getAs();
    }

    //DSL Style set value
    public A addA(A aElem) {
        this.addOverlayWidget(aElem);
        return aElem;
    }

    public java.util.List<U> getUs() {
        java.util.List<U> result = new ArrayList<U>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("U".equalsIgnoreCase(widget.getType())) {
                result.add((U) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<U> getUList() {
        return getUs();
    }

    //DSL Style set value
    public U addU(U uElem) {
        this.addOverlayWidget(uElem);
        return uElem;
    }

    public java.util.List<Sub> getSubs() {
        java.util.List<Sub> result = new ArrayList<Sub>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Sub".equalsIgnoreCase(widget.getType())) {
                result.add((Sub) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Sub> getSubList() {
        return getSubs();
    }

    //DSL Style set value
    public Sub addSub(Sub subElem) {
        this.addOverlayWidget(subElem);
        return subElem;
    }

    public java.util.List<Sup> getSups() {
        java.util.List<Sup> result = new ArrayList<Sup>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Sup".equalsIgnoreCase(widget.getType())) {
                result.add((Sup) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Sup> getSupList() {
        return getSups();
    }

    //DSL Style set value
    public Sup addSup(Sup supElem) {
        this.addOverlayWidget(supElem);
        return supElem;
    }

    public java.util.List<Span> getSpans() {
        java.util.List<Span> result = new ArrayList<Span>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Span".equalsIgnoreCase(widget.getType())) {
                result.add((Span) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Span> getSpanList() {
        return getSpans();
    }

    //DSL Style set value
    public Span addSpan(Span spanElem) {
        this.addOverlayWidget(spanElem);
        return spanElem;
    }

    public java.util.List<DocType> getDocTypes() {
        java.util.List<DocType> result = new ArrayList<DocType>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocType".equalsIgnoreCase(widget.getType())) {
                result.add((DocType) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocType> getDocTypeList() {
        return getDocTypes();
    }

    //DSL Style set value
    public DocType addDocType(DocType docTypeElem) {
        this.addOverlayWidget(docTypeElem);
        return docTypeElem;
    }

    public java.util.List<DocTitle> getDocTitles() {
        java.util.List<DocTitle> result = new ArrayList<DocTitle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocTitle".equalsIgnoreCase(widget.getType())) {
                result.add((DocTitle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocTitle> getDocTitleList() {
        return getDocTitles();
    }

    //DSL Style set value
    public DocTitle addDocTitle(DocTitle docTitleElem) {
        this.addOverlayWidget(docTitleElem);
        return docTitleElem;
    }

    public java.util.List<DocNumber> getDocNumbers() {
        java.util.List<DocNumber> result = new ArrayList<DocNumber>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocNumber".equalsIgnoreCase(widget.getType())) {
                result.add((DocNumber) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocNumber> getDocNumberList() {
        return getDocNumbers();
    }

    //DSL Style set value
    public DocNumber addDocNumber(DocNumber docNumberElem) {
        this.addOverlayWidget(docNumberElem);
        return docNumberElem;
    }

    public java.util.List<DocProponent> getDocProponents() {
        java.util.List<DocProponent> result = new ArrayList<DocProponent>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocProponent".equalsIgnoreCase(widget.getType())) {
                result.add((DocProponent) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocProponent> getDocProponentList() {
        return getDocProponents();
    }

    //DSL Style set value
    public DocProponent addDocProponent(DocProponent docProponentElem) {
        this.addOverlayWidget(docProponentElem);
        return docProponentElem;
    }

    public java.util.List<DocDate> getDocDates() {
        java.util.List<DocDate> result = new ArrayList<DocDate>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocDate".equalsIgnoreCase(widget.getType())) {
                result.add((DocDate) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocDate> getDocDateList() {
        return getDocDates();
    }

    //DSL Style set value
    public DocDate addDocDate(DocDate docDateElem) {
        this.addOverlayWidget(docDateElem);
        return docDateElem;
    }

    public java.util.List<Legislature> getLegislatures() {
        java.util.List<Legislature> result = new ArrayList<Legislature>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Legislature".equalsIgnoreCase(widget.getType())) {
                result.add((Legislature) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Legislature> getLegislatureList() {
        return getLegislatures();
    }

    //DSL Style set value
    public Legislature addLegislature(Legislature legislatureElem) {
        this.addOverlayWidget(legislatureElem);
        return legislatureElem;
    }

    public java.util.List<Session> getSessions() {
        java.util.List<Session> result = new ArrayList<Session>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Session".equalsIgnoreCase(widget.getType())) {
                result.add((Session) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Session> getSessionList() {
        return getSessions();
    }

    //DSL Style set value
    public Session addSession(Session sessionElem) {
        this.addOverlayWidget(sessionElem);
        return sessionElem;
    }

    public java.util.List<ShortTitle> getShortTitles() {
        java.util.List<ShortTitle> result = new ArrayList<ShortTitle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ShortTitle".equalsIgnoreCase(widget.getType())) {
                result.add((ShortTitle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<ShortTitle> getShortTitleList() {
        return getShortTitles();
    }

    //DSL Style set value
    public ShortTitle addShortTitle(ShortTitle shortTitleElem) {
        this.addOverlayWidget(shortTitleElem);
        return shortTitleElem;
    }

    public java.util.List<DocPurpose> getDocPurposes() {
        java.util.List<DocPurpose> result = new ArrayList<DocPurpose>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocPurpose".equalsIgnoreCase(widget.getType())) {
                result.add((DocPurpose) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocPurpose> getDocPurposeList() {
        return getDocPurposes();
    }

    //DSL Style set value
    public DocPurpose addDocPurpose(DocPurpose docPurposeElem) {
        this.addOverlayWidget(docPurposeElem);
        return docPurposeElem;
    }

    public java.util.List<DocCommittee> getDocCommittees() {
        java.util.List<DocCommittee> result = new ArrayList<DocCommittee>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocCommittee".equalsIgnoreCase(widget.getType())) {
                result.add((DocCommittee) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocCommittee> getDocCommitteeList() {
        return getDocCommittees();
    }

    //DSL Style set value
    public DocCommittee addDocCommittee(DocCommittee docCommitteeElem) {
        this.addOverlayWidget(docCommitteeElem);
        return docCommitteeElem;
    }

    public java.util.List<DocIntroducer> getDocIntroducers() {
        java.util.List<DocIntroducer> result = new ArrayList<DocIntroducer>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocIntroducer".equalsIgnoreCase(widget.getType())) {
                result.add((DocIntroducer) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocIntroducer> getDocIntroducerList() {
        return getDocIntroducers();
    }

    //DSL Style set value
    public DocIntroducer addDocIntroducer(DocIntroducer docIntroducerElem) {
        this.addOverlayWidget(docIntroducerElem);
        return docIntroducerElem;
    }

    public java.util.List<DocStage> getDocStages() {
        java.util.List<DocStage> result = new ArrayList<DocStage>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocStage".equalsIgnoreCase(widget.getType())) {
                result.add((DocStage) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocStage> getDocStageList() {
        return getDocStages();
    }

    //DSL Style set value
    public DocStage addDocStage(DocStage docStageElem) {
        this.addOverlayWidget(docStageElem);
        return docStageElem;
    }

    public java.util.List<DocStatus> getDocStatuses() {
        java.util.List<DocStatus> result = new ArrayList<DocStatus>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocStatus".equalsIgnoreCase(widget.getType())) {
                result.add((DocStatus) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocStatus> getDocStatusList() {
        return getDocStatuses();
    }

    //DSL Style set value
    public DocStatus addDocStatus(DocStatus docStatusElem) {
        this.addOverlayWidget(docStatusElem);
        return docStatusElem;
    }

    public java.util.List<DocJurisdiction> getDocJurisdictions() {
        java.util.List<DocJurisdiction> result = new ArrayList<DocJurisdiction>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocJurisdiction".equalsIgnoreCase(widget.getType())) {
                result.add((DocJurisdiction) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocJurisdiction> getDocJurisdictionList() {
        return getDocJurisdictions();
    }

    //DSL Style set value
    public DocJurisdiction addDocJurisdiction(DocJurisdiction docJurisdictionElem) {
        this.addOverlayWidget(docJurisdictionElem);
        return docJurisdictionElem;
    }

    public java.util.List<DocketNumber> getDocketNumbers() {
        java.util.List<DocketNumber> result = new ArrayList<DocketNumber>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocketNumber".equalsIgnoreCase(widget.getType())) {
                result.add((DocketNumber) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DocketNumber> getDocketNumberList() {
        return getDocketNumbers();
    }

    //DSL Style set value
    public DocketNumber addDocketNumber(DocketNumber docketNumberElem) {
        this.addOverlayWidget(docketNumberElem);
        return docketNumberElem;
    }

    public java.util.List<Date> getDates() {
        java.util.List<Date> result = new ArrayList<Date>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Date".equalsIgnoreCase(widget.getType())) {
                result.add((Date) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Date> getDateList() {
        return getDates();
    }

    //DSL Style set value
    public Date addDate(Date dateElem) {
        this.addOverlayWidget(dateElem);
        return dateElem;
    }

    public java.util.List<Person> getPersons() {
        java.util.List<Person> result = new ArrayList<Person>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Person".equalsIgnoreCase(widget.getType())) {
                result.add((Person) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Person> getPersonList() {
        return getPersons();
    }

    //DSL Style set value
    public Person addPerson(Person personElem) {
        this.addOverlayWidget(personElem);
        return personElem;
    }

    public java.util.List<Organization> getOrganizations() {
        java.util.List<Organization> result = new ArrayList<Organization>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Organization".equalsIgnoreCase(widget.getType())) {
                result.add((Organization) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Organization> getOrganizationList() {
        return getOrganizations();
    }

    //DSL Style set value
    public Organization addOrganization(Organization organizationElem) {
        this.addOverlayWidget(organizationElem);
        return organizationElem;
    }

    public java.util.List<Concept> getConcepts() {
        java.util.List<Concept> result = new ArrayList<Concept>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Concept".equalsIgnoreCase(widget.getType())) {
                result.add((Concept) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Concept> getConceptList() {
        return getConcepts();
    }

    //DSL Style set value
    public Concept addConcept(Concept conceptElem) {
        this.addOverlayWidget(conceptElem);
        return conceptElem;
    }

    public java.util.List<Object> getObjects() {
        java.util.List<Object> result = new ArrayList<Object>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Object".equalsIgnoreCase(widget.getType())) {
                result.add((Object) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Object> getObjectList() {
        return getObjects();
    }

    //DSL Style set value
    public Object addObject(Object objectElem) {
        this.addOverlayWidget(objectElem);
        return objectElem;
    }

    public java.util.List<Event> getEvents() {
        java.util.List<Event> result = new ArrayList<Event>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Event".equalsIgnoreCase(widget.getType())) {
                result.add((Event) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Event> getEventList() {
        return getEvents();
    }

    //DSL Style set value
    public Event addEvent(Event eventElem) {
        this.addOverlayWidget(eventElem);
        return eventElem;
    }

    public java.util.List<Location> getLocations() {
        java.util.List<Location> result = new ArrayList<Location>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Location".equalsIgnoreCase(widget.getType())) {
                result.add((Location) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Location> getLocationList() {
        return getLocations();
    }

    //DSL Style set value
    public Location addLocation(Location locationElem) {
        this.addOverlayWidget(locationElem);
        return locationElem;
    }

    public java.util.List<Process> getProcesses() {
        java.util.List<Process> result = new ArrayList<Process>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Process".equalsIgnoreCase(widget.getType())) {
                result.add((Process) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Process> getProcessList() {
        return getProcesses();
    }

    //DSL Style set value
    public Process addProcess(Process processElem) {
        this.addOverlayWidget(processElem);
        return processElem;
    }

    public java.util.List<Role> getRoles() {
        java.util.List<Role> result = new ArrayList<Role>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Role".equalsIgnoreCase(widget.getType())) {
                result.add((Role) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Role> getRoleList() {
        return getRoles();
    }

    //DSL Style set value
    public Role addRole(Role roleElem) {
        this.addOverlayWidget(roleElem);
        return roleElem;
    }

    public java.util.List<Term> getTerms() {
        java.util.List<Term> result = new ArrayList<Term>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Term".equalsIgnoreCase(widget.getType())) {
                result.add((Term) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Term> getTermList() {
        return getTerms();
    }

    //DSL Style set value
    public Term addTerm(Term termElem) {
        this.addOverlayWidget(termElem);
        return termElem;
    }

    public java.util.List<Quantity> getQuantities() {
        java.util.List<Quantity> result = new ArrayList<Quantity>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Quantity".equalsIgnoreCase(widget.getType())) {
                result.add((Quantity) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Quantity> getQuantityList() {
        return getQuantities();
    }

    //DSL Style set value
    public Quantity addQuantity(Quantity quantityElem) {
        this.addOverlayWidget(quantityElem);
        return quantityElem;
    }

    public java.util.List<Def> getDefs() {
        java.util.List<Def> result = new ArrayList<Def>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Def".equalsIgnoreCase(widget.getType())) {
                result.add((Def) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Def> getDefList() {
        return getDefs();
    }

    //DSL Style set value
    public Def addDef(Def defElem) {
        this.addOverlayWidget(defElem);
        return defElem;
    }

    public java.util.List<Entity> getEntities() {
        java.util.List<Entity> result = new ArrayList<Entity>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Entity".equalsIgnoreCase(widget.getType())) {
                result.add((Entity) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Entity> getEntityList() {
        return getEntities();
    }

    //DSL Style set value
    public Entity addEntity(Entity entityElem) {
        this.addOverlayWidget(entityElem);
        return entityElem;
    }

    public java.util.List<CourtType> getCourtTypes() {
        java.util.List<CourtType> result = new ArrayList<CourtType>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("CourtType".equalsIgnoreCase(widget.getType())) {
                result.add((CourtType) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<CourtType> getCourtTypeList() {
        return getCourtTypes();
    }

    //DSL Style set value
    public CourtType addCourtType(CourtType courtTypeElem) {
        this.addOverlayWidget(courtTypeElem);
        return courtTypeElem;
    }

    public java.util.List<NeutralCitation> getNeutralCitations() {
        java.util.List<NeutralCitation> result = new ArrayList<NeutralCitation>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NeutralCitation".equalsIgnoreCase(widget.getType())) {
                result.add((NeutralCitation) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<NeutralCitation> getNeutralCitationList() {
        return getNeutralCitations();
    }

    //DSL Style set value
    public NeutralCitation addNeutralCitation(NeutralCitation neutralCitationElem) {
        this.addOverlayWidget(neutralCitationElem);
        return neutralCitationElem;
    }

    public java.util.List<Party> getParties() {
        java.util.List<Party> result = new ArrayList<Party>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Party".equalsIgnoreCase(widget.getType())) {
                result.add((Party) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Party> getPartyList() {
        return getParties();
    }

    //DSL Style set value
    public Party addParty(Party partyElem) {
        this.addOverlayWidget(partyElem);
        return partyElem;
    }

    public java.util.List<Judge> getJudges() {
        java.util.List<Judge> result = new ArrayList<Judge>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Judge".equalsIgnoreCase(widget.getType())) {
                result.add((Judge) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Judge> getJudgeList() {
        return getJudges();
    }

    //DSL Style set value
    public Judge addJudge(Judge judgeElem) {
        this.addOverlayWidget(judgeElem);
        return judgeElem;
    }

    public java.util.List<Lawyer> getLawyers() {
        java.util.List<Lawyer> result = new ArrayList<Lawyer>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Lawyer".equalsIgnoreCase(widget.getType())) {
                result.add((Lawyer) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Lawyer> getLawyerList() {
        return getLawyers();
    }

    //DSL Style set value
    public Lawyer addLawyer(Lawyer lawyerElem) {
        this.addOverlayWidget(lawyerElem);
        return lawyerElem;
    }

    public java.util.List<Signature> getSignatures() {
        java.util.List<Signature> result = new ArrayList<Signature>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Signature".equalsIgnoreCase(widget.getType())) {
                result.add((Signature) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Signature> getSignatureList() {
        return getSignatures();
    }

    //DSL Style set value
    public Signature addSignature(Signature signatureElem) {
        this.addOverlayWidget(signatureElem);
        return signatureElem;
    }

    public java.util.List<Opinion> getOpinions() {
        java.util.List<Opinion> result = new ArrayList<Opinion>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Opinion".equalsIgnoreCase(widget.getType())) {
                result.add((Opinion) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Opinion> getOpinionList() {
        return getOpinions();
    }

    //DSL Style set value
    public Opinion addOpinion(Opinion opinionElem) {
        this.addOverlayWidget(opinionElem);
        return opinionElem;
    }

    public java.util.List<AffectedDocument> getAffectedDocuments() {
        java.util.List<AffectedDocument> result = new ArrayList<AffectedDocument>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AffectedDocument".equalsIgnoreCase(widget.getType())) {
                result.add((AffectedDocument) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<AffectedDocument> getAffectedDocumentList() {
        return getAffectedDocuments();
    }

    //DSL Style set value
    public AffectedDocument addAffectedDocument(AffectedDocument affectedDocumentElem) {
        this.addOverlayWidget(affectedDocumentElem);
        return affectedDocumentElem;
    }

    public java.util.List<RelatedDocument> getRelatedDocuments() {
        java.util.List<RelatedDocument> result = new ArrayList<RelatedDocument>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("RelatedDocument".equalsIgnoreCase(widget.getType())) {
                result.add((RelatedDocument) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<RelatedDocument> getRelatedDocumentList() {
        return getRelatedDocuments();
    }

    //DSL Style set value
    public RelatedDocument addRelatedDocument(RelatedDocument relatedDocumentElem) {
        this.addOverlayWidget(relatedDocumentElem);
        return relatedDocumentElem;
    }

    public java.util.List<Change> getChanges() {
        java.util.List<Change> result = new ArrayList<Change>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Change".equalsIgnoreCase(widget.getType())) {
                result.add((Change) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Change> getChangeList() {
        return getChanges();
    }

    //DSL Style set value
    public Change addChange(Change changeElem) {
        this.addOverlayWidget(changeElem);
        return changeElem;
    }

    public java.util.List<NoteRef> getNoteRefs() {
        java.util.List<NoteRef> result = new ArrayList<NoteRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NoteRef".equalsIgnoreCase(widget.getType())) {
                result.add((NoteRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<NoteRef> getNoteRefList() {
        return getNoteRefs();
    }

    //DSL Style set value
    public NoteRef addNoteRef(NoteRef noteRefElem) {
        this.addOverlayWidget(noteRefElem);
        return noteRefElem;
    }

    public java.util.List<Eol> getEols() {
        java.util.List<Eol> result = new ArrayList<Eol>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Eol".equalsIgnoreCase(widget.getType())) {
                result.add((Eol) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Eol> getEolList() {
        return getEols();
    }

    //DSL Style set value
    public Eol addEol(Eol eolElem) {
        this.addOverlayWidget(eolElem);
        return eolElem;
    }

    public java.util.List<Eop> getEops() {
        java.util.List<Eop> result = new ArrayList<Eop>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Eop".equalsIgnoreCase(widget.getType())) {
                result.add((Eop) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Eop> getEopList() {
        return getEops();
    }

    //DSL Style set value
    public Eop addEop(Eop eopElem) {
        this.addOverlayWidget(eopElem);
        return eopElem;
    }

    public java.util.List<Img> getImgs() {
        java.util.List<Img> result = new ArrayList<Img>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Img".equalsIgnoreCase(widget.getType())) {
                result.add((Img) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Img> getImgList() {
        return getImgs();
    }

    //DSL Style set value
    public Img addImg(Img imgElem) {
        this.addOverlayWidget(imgElem);
        return imgElem;
    }

    public java.util.List<AuthorialNote> getAuthorialNotes() {
        java.util.List<AuthorialNote> result = new ArrayList<AuthorialNote>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AuthorialNote".equalsIgnoreCase(widget.getType())) {
                result.add((AuthorialNote) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<AuthorialNote> getAuthorialNoteList() {
        return getAuthorialNotes();
    }

    //DSL Style set value
    public AuthorialNote addAuthorialNote(AuthorialNote authorialNoteElem) {
        this.addOverlayWidget(authorialNoteElem);
        return authorialNoteElem;
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
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }
}

