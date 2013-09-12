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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * the type collectionBodyType specifies a content model of a container of a list of other documents (e.g, acts, bills, amendments, etc.) possibly interspersed with interstitial elements with content that does not form an individual document
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class CollectionBodyTypeComplexType extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultChoice(1, -1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new AmendmentList())
                    , new StructureIndicator.DefaultElement(1, 1, new OfficialGazette())
                    , new StructureIndicator.DefaultElement(1, 1, new DocumentCollection())
                    , new StructureIndicator.DefaultElement(1, 1, new Act())
                    , new StructureIndicator.DefaultElement(1, 1, new Bill())
                    , new StructureIndicator.DefaultElement(1, 1, new DebateReport())
                    , new StructureIndicator.DefaultElement(1, 1, new Debate())
                    , new StructureIndicator.DefaultElement(1, 1, new Statement())
                    , new StructureIndicator.DefaultElement(1, 1, new Amendment())
                    , new StructureIndicator.DefaultElement(1, 1, new Judgment())
                    , new StructureIndicator.DefaultElement(1, 1, new Fragment())
                    , new StructureIndicator.DefaultElement(1, 1, new Doc())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new DocumentRef())
                    , new StructureIndicator.DefaultElement(0, 1, new Interstitial())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "collectionBodyTypeComplexType");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget collectionBodyTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>CollectionBodyTypeComplexType</code> object with the given DOM element
     */
    public CollectionBodyTypeComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private StatusTypeSimpleType statusAttr;
    private String wildcardContentAttr;
    private StringSimpleType langAttr;
    private StringSimpleType spaceAttr;
    private AnyURISimpleType alternativeToAttr;
    private AnyURISimpleType refersToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType periodAttr;

    /**
     * Return <code>java.util.List<DocumentRef></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocumentRef> getDocumentRefs() {
        java.util.List<DocumentRef> result = new ArrayList<DocumentRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocumentRef".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocumentRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocumentRef></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocumentRef> getDocumentRefList() {
        return getDocumentRefs();
    }

    /**
     * Add <code>java.util.List<DocumentRef></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocumentRef addDocumentRef(DocumentRef documentRefElem) {
        this.addOverlayWidget(documentRefElem);
        return documentRefElem;
    }

    /**
     * Return <code>java.util.List<Interstitial></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Interstitial> getInterstitials() {
        java.util.List<Interstitial> result = new ArrayList<Interstitial>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Interstitial".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Interstitial) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Interstitial></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Interstitial> getInterstitialList() {
        return getInterstitials();
    }

    /**
     * Add <code>java.util.List<Interstitial></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Interstitial addInterstitial(Interstitial interstitialElem) {
        this.addOverlayWidget(interstitialElem);
        return interstitialElem;
    }

    /**
     * Return <code>statusAttr</code> property
     *
     * @return statusAttr
     */
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(getElement().getAttribute("status"));
        }

        return statusAttr;
    }

    /**
     * Return <code>statusAttr</code> property in DSL way
     *
     * @return statusAttr
     */
    public StatusTypeSimpleType statusAttr() {
        return getStatusAttr();
    }

    /**
     * Set <code>statusAttr</code> property
     *
     * @param statusAttr the new value
     */
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
        getElement().setAttribute("status", statusAttr.value());
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Return <code>wildcardContentAttr</code> property
     *
     * @return wildcardContentAttr
     */
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }

    /**
     * Return <code>wildcardContentAttr</code> property in DSL way
     *
     * @return wildcardContentAttr
     */
    public String wildcardContentAttr() {
        return getWildcardContentAttr();
    }

    /**
     * Set <code>wildcardContentAttr</code> property
     *
     * @param wildcardContentAttr the new value
     */
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        getElement().setAttribute("wildcardContent", wildcardContentAttr);
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Return <code>langAttr</code> property
     *
     * @return langAttr
     */
    public StringSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new StringSimpleType();
            langAttr.setValue(getElement().getAttribute("lang"));
        }

        return langAttr;
    }

    /**
     * Return <code>langAttr</code> property in DSL way
     *
     * @return langAttr
     */
    public StringSimpleType langAttr() {
        return getLangAttr();
    }

    /**
     * Set <code>langAttr</code> property
     *
     * @param langAttr the new value
     */
    public void setLangAttr(final StringSimpleType langAttr) {
        this.langAttr = langAttr;
        getElement().setAttribute("lang", langAttr.getValue());
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType langAttr(final StringSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Return <code>spaceAttr</code> property
     *
     * @return spaceAttr
     */
    public StringSimpleType getSpaceAttr() {
        if (spaceAttr == null) {
            spaceAttr = new StringSimpleType();
            spaceAttr.setValue(getElement().getAttribute("space"));
        }

        return spaceAttr;
    }

    /**
     * Return <code>spaceAttr</code> property in DSL way
     *
     * @return spaceAttr
     */
    public StringSimpleType spaceAttr() {
        return getSpaceAttr();
    }

    /**
     * Set <code>spaceAttr</code> property
     *
     * @param spaceAttr the new value
     */
    public void setSpaceAttr(final StringSimpleType spaceAttr) {
        this.spaceAttr = spaceAttr;
        getElement().setAttribute("space", spaceAttr.getValue());
    }

    /**
     * Set <code>spaceAttr</code> property in DSL way
     *
     * @param spaceAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType spaceAttr(final StringSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
    }

    /**
     * Return <code>alternativeToAttr</code> property
     *
     * @return alternativeToAttr
     */
    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(getElement().getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }

    /**
     * Return <code>alternativeToAttr</code> property in DSL way
     *
     * @return alternativeToAttr
     */
    public AnyURISimpleType alternativeToAttr() {
        return getAlternativeToAttr();
    }

    /**
     * Set <code>alternativeToAttr</code> property
     *
     * @param alternativeToAttr the new value
     */
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
        getElement().setAttribute("alternativeTo", alternativeToAttr.getValue());
    }

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Return <code>refersToAttr</code> property
     *
     * @return refersToAttr
     */
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    /**
     * Return <code>refersToAttr</code> property in DSL way
     *
     * @return refersToAttr
     */
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    /**
     * Set <code>refersToAttr</code> property
     *
     * @param refersToAttr the new value
     */
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo", refersToAttr.getValue());
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Return <code>idAttr</code> property
     *
     * @return idAttr
     */
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
    }

    /**
     * Return <code>idAttr</code> property in DSL way
     *
     * @return idAttr
     */
    public IDSimpleType idAttr() {
        return getIdAttr();
    }

    /**
     * Set <code>idAttr</code> property
     *
     * @param idAttr the new value
     */
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        getElement().setAttribute("id", idAttr.getValue());
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Return <code>evolvingIdAttr</code> property
     *
     * @return evolvingIdAttr
     */
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }

    /**
     * Return <code>evolvingIdAttr</code> property in DSL way
     *
     * @return evolvingIdAttr
     */
    public NMTOKENSimpleType evolvingIdAttr() {
        return getEvolvingIdAttr();
    }

    /**
     * Set <code>evolvingIdAttr</code> property
     *
     * @param evolvingIdAttr the new value
     */
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        getElement().setAttribute("evolvingId", evolvingIdAttr.getValue());
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Return <code>classAttr</code> property
     *
     * @return classAttr
     */
    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(getElement().getAttribute("class"));
        }

        return classAttr;
    }

    /**
     * Return <code>classAttr</code> property in DSL way
     *
     * @return classAttr
     */
    public StringSimpleType classAttr() {
        return getClassAttr();
    }

    /**
     * Set <code>classAttr</code> property
     *
     * @param classAttr the new value
     */
    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
        getElement().setAttribute("class", classAttr.getValue());
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Return <code>styleAttr</code> property
     *
     * @return styleAttr
     */
    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(getElement().getAttribute("style"));
        }

        return styleAttr;
    }

    /**
     * Return <code>styleAttr</code> property in DSL way
     *
     * @return styleAttr
     */
    public StringSimpleType styleAttr() {
        return getStyleAttr();
    }

    /**
     * Set <code>styleAttr</code> property
     *
     * @param styleAttr the new value
     */
    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
        getElement().setAttribute("style", styleAttr.getValue());
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Return <code>titleAttr</code> property
     *
     * @return titleAttr
     */
    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(getElement().getAttribute("title"));
        }

        return titleAttr;
    }

    /**
     * Return <code>titleAttr</code> property in DSL way
     *
     * @return titleAttr
     */
    public StringSimpleType titleAttr() {
        return getTitleAttr();
    }

    /**
     * Set <code>titleAttr</code> property
     *
     * @param titleAttr the new value
     */
    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
        getElement().setAttribute("title", titleAttr.getValue());
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Return <code>periodAttr</code> property
     *
     * @return periodAttr
     */
    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(getElement().getAttribute("period"));
        }

        return periodAttr;
    }

    /**
     * Return <code>periodAttr</code> property in DSL way
     *
     * @return periodAttr
     */
    public AnyURISimpleType periodAttr() {
        return getPeriodAttr();
    }

    /**
     * Set <code>periodAttr</code> property
     *
     * @param periodAttr the new value
     */
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
        getElement().setAttribute("period", periodAttr.getValue());
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr the new value
     * @return <code>CollectionBodyTypeComplexType</code> instance
     */
    public CollectionBodyTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Return <code>java.util.List<AmendmentList></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AmendmentList> getAmendmentLists() {
        java.util.List<AmendmentList> result = new ArrayList<AmendmentList>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AmendmentList".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((AmendmentList) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<AmendmentList></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AmendmentList> getAmendmentListList() {
        return getAmendmentLists();
    }

    /**
     * Add <code>java.util.List<AmendmentList></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public AmendmentList addAmendmentList(AmendmentList amendmentListElem) {
        this.addOverlayWidget(amendmentListElem);
        return amendmentListElem;
    }

    /**
     * Return <code>java.util.List<OfficialGazette></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<OfficialGazette> getOfficialGazettes() {
        java.util.List<OfficialGazette> result = new ArrayList<OfficialGazette>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OfficialGazette".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((OfficialGazette) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<OfficialGazette></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<OfficialGazette> getOfficialGazetteList() {
        return getOfficialGazettes();
    }

    /**
     * Add <code>java.util.List<OfficialGazette></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public OfficialGazette addOfficialGazette(OfficialGazette officialGazetteElem) {
        this.addOverlayWidget(officialGazetteElem);
        return officialGazetteElem;
    }

    /**
     * Return <code>java.util.List<DocumentCollection></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocumentCollection> getDocumentCollections() {
        java.util.List<DocumentCollection> result = new ArrayList<DocumentCollection>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocumentCollection".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocumentCollection) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocumentCollection></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocumentCollection> getDocumentCollectionList() {
        return getDocumentCollections();
    }

    /**
     * Add <code>java.util.List<DocumentCollection></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocumentCollection addDocumentCollection(DocumentCollection documentCollectionElem) {
        this.addOverlayWidget(documentCollectionElem);
        return documentCollectionElem;
    }

    /**
     * Return <code>java.util.List<Act></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Act> getActs() {
        java.util.List<Act> result = new ArrayList<Act>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Act".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Act) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Act></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Act> getActList() {
        return getActs();
    }

    /**
     * Add <code>java.util.List<Act></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Act addAct(Act actElem) {
        this.addOverlayWidget(actElem);
        return actElem;
    }

    /**
     * Return <code>java.util.List<Bill></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Bill> getBills() {
        java.util.List<Bill> result = new ArrayList<Bill>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Bill".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Bill) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Bill></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Bill> getBillList() {
        return getBills();
    }

    /**
     * Add <code>java.util.List<Bill></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Bill addBill(Bill billElem) {
        this.addOverlayWidget(billElem);
        return billElem;
    }

    /**
     * Return <code>java.util.List<DebateReport></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DebateReport> getDebateReports() {
        java.util.List<DebateReport> result = new ArrayList<DebateReport>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DebateReport".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DebateReport) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DebateReport></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DebateReport> getDebateReportList() {
        return getDebateReports();
    }

    /**
     * Add <code>java.util.List<DebateReport></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DebateReport addDebateReport(DebateReport debateReportElem) {
        this.addOverlayWidget(debateReportElem);
        return debateReportElem;
    }

    /**
     * Return <code>java.util.List<Debate></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Debate> getDebates() {
        java.util.List<Debate> result = new ArrayList<Debate>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Debate".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Debate) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Debate></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Debate> getDebateList() {
        return getDebates();
    }

    /**
     * Add <code>java.util.List<Debate></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Debate addDebate(Debate debateElem) {
        this.addOverlayWidget(debateElem);
        return debateElem;
    }

    /**
     * Return <code>java.util.List<Statement></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Statement> getStatements() {
        java.util.List<Statement> result = new ArrayList<Statement>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Statement".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Statement) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Statement></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Statement> getStatementList() {
        return getStatements();
    }

    /**
     * Add <code>java.util.List<Statement></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Statement addStatement(Statement statementElem) {
        this.addOverlayWidget(statementElem);
        return statementElem;
    }

    /**
     * Return <code>java.util.List<Amendment></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Amendment> getAmendments() {
        java.util.List<Amendment> result = new ArrayList<Amendment>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Amendment".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Amendment) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Amendment></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Amendment> getAmendmentList() {
        return getAmendments();
    }

    /**
     * Add <code>java.util.List<Amendment></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Amendment addAmendment(Amendment amendmentElem) {
        this.addOverlayWidget(amendmentElem);
        return amendmentElem;
    }

    /**
     * Return <code>java.util.List<Judgment></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Judgment> getJudgments() {
        java.util.List<Judgment> result = new ArrayList<Judgment>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Judgment".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Judgment) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Judgment></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Judgment> getJudgmentList() {
        return getJudgments();
    }

    /**
     * Add <code>java.util.List<Judgment></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Judgment addJudgment(Judgment judgmentElem) {
        this.addOverlayWidget(judgmentElem);
        return judgmentElem;
    }

    /**
     * Return <code>java.util.List<Fragment></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Fragment> getFragments() {
        java.util.List<Fragment> result = new ArrayList<Fragment>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Fragment".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Fragment) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Fragment></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Fragment> getFragmentList() {
        return getFragments();
    }

    /**
     * Add <code>java.util.List<Fragment></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Fragment addFragment(Fragment fragmentElem) {
        this.addOverlayWidget(fragmentElem);
        return fragmentElem;
    }

    /**
     * Return <code>java.util.List<Doc></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Doc> getDocs() {
        java.util.List<Doc> result = new ArrayList<Doc>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Doc".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Doc) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Doc></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Doc> getDocList() {
        return getDocs();
    }

    /**
     * Add <code>java.util.List<Doc></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Doc addDoc(Doc docElem) {
        this.addOverlayWidget(docElem);
        return docElem;
    }

//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("space", getSpaceAttr() != null ? getSpaceAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
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
    public CollectionBodyTypeComplexType html(String s) {
        super.html(s);
        return this;
    }
}

