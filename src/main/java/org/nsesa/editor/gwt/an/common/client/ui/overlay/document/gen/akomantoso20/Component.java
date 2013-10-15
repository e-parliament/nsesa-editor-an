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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Component extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new AmendmentList())
                    , new StructureIndicator.DefaultElement(1, 1, new OfficialGazette())
                    , new StructureIndicator.DefaultElement(1, 1, new DocumentCollection())
                    , new StructureIndicator.DefaultElement(1, 1, new Act())
                    , new StructureIndicator.DefaultElement(1, 1, new Bill())
                    , new StructureIndicator.DefaultElement(1, 1, new DebateReport())
                    , new StructureIndicator.DefaultElement(1, 1, new Debate())
                    , new StructureIndicator.DefaultElement(1, 1, new Amendment())
                    , new StructureIndicator.DefaultElement(1, 1, new Judgement())
                    , new StructureIndicator.DefaultElement(1, 1, new Doc())
            )
            )
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "component");
        span.setAttribute("data-ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget component");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Component</code> object and set up its type
     */
    public Component() {
        super(create());
        setType("component");
    }

    /**
     * Constructor with required attributes
     */
    public Component(IDSimpleType idAttr) {
        this();
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>Component</code> object with the given DOM element
     */
    public Component(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private NMTOKENSimpleType evolvingIdAttr;
    private IDSimpleType idAttr;
    private String wildcardContentAttr;

    /**
     * Add <code>Act</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Act getAct() {
        Act result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Act".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Act) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>actElem</code> property in DSL way
     *
     * @param actElem new value
     * @return <code>Act</code> instance
     */
    public Act setAct(Act actElem) {
        Act result = getAct();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(actElem);

        return actElem;
    }

    /**
     * Add <code>Amendment</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Amendment getAmendment() {
        Amendment result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Amendment".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Amendment) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>amendmentElem</code> property in DSL way
     *
     * @param amendmentElem new value
     * @return <code>Amendment</code> instance
     */
    public Amendment setAmendment(Amendment amendmentElem) {
        Amendment result = getAmendment();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(amendmentElem);

        return amendmentElem;
    }

    /**
     * Add <code>AmendmentList</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public AmendmentList getAmendmentList() {
        AmendmentList result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AmendmentList".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (AmendmentList) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>amendmentListElem</code> property in DSL way
     *
     * @param amendmentListElem new value
     * @return <code>AmendmentList</code> instance
     */
    public AmendmentList setAmendmentList(AmendmentList amendmentListElem) {
        AmendmentList result = getAmendmentList();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(amendmentListElem);

        return amendmentListElem;
    }

    /**
     * Add <code>Bill</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Bill getBill() {
        Bill result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Bill".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Bill) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>billElem</code> property in DSL way
     *
     * @param billElem new value
     * @return <code>Bill</code> instance
     */
    public Bill setBill(Bill billElem) {
        Bill result = getBill();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(billElem);

        return billElem;
    }

    /**
     * Add <code>Debate</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Debate getDebate() {
        Debate result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Debate".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Debate) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>debateElem</code> property in DSL way
     *
     * @param debateElem new value
     * @return <code>Debate</code> instance
     */
    public Debate setDebate(Debate debateElem) {
        Debate result = getDebate();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(debateElem);

        return debateElem;
    }

    /**
     * Add <code>DebateReport</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DebateReport getDebateReport() {
        DebateReport result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DebateReport".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (DebateReport) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>debateReportElem</code> property in DSL way
     *
     * @param debateReportElem new value
     * @return <code>DebateReport</code> instance
     */
    public DebateReport setDebateReport(DebateReport debateReportElem) {
        DebateReport result = getDebateReport();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(debateReportElem);

        return debateReportElem;
    }

    /**
     * Add <code>Doc</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Doc getDoc() {
        Doc result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Doc".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Doc) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>docElem</code> property in DSL way
     *
     * @param docElem new value
     * @return <code>Doc</code> instance
     */
    public Doc setDoc(Doc docElem) {
        Doc result = getDoc();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(docElem);

        return docElem;
    }

    /**
     * Add <code>DocumentCollection</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocumentCollection getDocumentCollection() {
        DocumentCollection result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocumentCollection".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (DocumentCollection) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>documentCollectionElem</code> property in DSL way
     *
     * @param documentCollectionElem new value
     * @return <code>DocumentCollection</code> instance
     */
    public DocumentCollection setDocumentCollection(DocumentCollection documentCollectionElem) {
        DocumentCollection result = getDocumentCollection();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(documentCollectionElem);

        return documentCollectionElem;
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
     * @return <code>Component</code> instance
     */
    public Component evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
     * @return <code>Component</code> instance
     */
    public Component idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Add <code>Judgement</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Judgement getJudgement() {
        Judgement result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Judgement".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Judgement) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>judgementElem</code> property in DSL way
     *
     * @param judgementElem new value
     * @return <code>Judgement</code> instance
     */
    public Judgement setJudgement(Judgement judgementElem) {
        Judgement result = getJudgement();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(judgementElem);

        return judgementElem;
    }

    /**
     * Add <code>OfficialGazette</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public OfficialGazette getOfficialGazette() {
        OfficialGazette result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OfficialGazette".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (OfficialGazette) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>officialGazetteElem</code> property in DSL way
     *
     * @param officialGazetteElem new value
     * @return <code>OfficialGazette</code> instance
     */
    public OfficialGazette setOfficialGazette(OfficialGazette officialGazetteElem) {
        OfficialGazette result = getOfficialGazette();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(officialGazetteElem);

        return officialGazetteElem;
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
     * @return <code>Component</code> instance
     */
    public Component wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
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
    public Component html(String s) {
        super.html(s);
        return this;
    }
}

