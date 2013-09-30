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
 * the type subFlowStructure specifies the overall content model of the elements that are subFlows
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class SubFlowStructureComplexType extends OverlayWidgetImpl {

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
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new BlockList())
                    , new StructureIndicator.DefaultElement(1, 1, new BlockContainer())
                    , new StructureIndicator.DefaultElement(1, 1, new Tblock())
                    , new StructureIndicator.DefaultElement(1, 1, new Toc())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Ul())
                    , new StructureIndicator.DefaultElement(1, 1, new Ol())
                    , new StructureIndicator.DefaultElement(1, 1, new Table())
                    , new StructureIndicator.DefaultElement(1, 1, new P())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Foreign())
                    , new StructureIndicator.DefaultElement(1, 1, new Block())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new AdministrationOfOath())
                    , new StructureIndicator.DefaultElement(1, 1, new RollCall())
                    , new StructureIndicator.DefaultElement(1, 1, new Prayers())
                    , new StructureIndicator.DefaultElement(1, 1, new OralStatements())
                    , new StructureIndicator.DefaultElement(1, 1, new WrittenStatements())
                    , new StructureIndicator.DefaultElement(1, 1, new PersonalStatements())
                    , new StructureIndicator.DefaultElement(1, 1, new MinisterialStatements())
                    , new StructureIndicator.DefaultElement(1, 1, new Resolutions())
                    , new StructureIndicator.DefaultElement(1, 1, new NationalInterest())
                    , new StructureIndicator.DefaultElement(1, 1, new DeclarationOfVote())
                    , new StructureIndicator.DefaultElement(1, 1, new Communication())
                    , new StructureIndicator.DefaultElement(1, 1, new Petitions())
                    , new StructureIndicator.DefaultElement(1, 1, new Papers())
                    , new StructureIndicator.DefaultElement(1, 1, new NoticesOfMotion())
                    , new StructureIndicator.DefaultElement(1, 1, new Questions())
                    , new StructureIndicator.DefaultElement(1, 1, new Address())
                    , new StructureIndicator.DefaultElement(1, 1, new ProceduralMotions())
                    , new StructureIndicator.DefaultElement(1, 1, new PointOfOrder())
                    , new StructureIndicator.DefaultElement(1, 1, new Adjournment())
                    , new StructureIndicator.DefaultElement(1, 1, new DebateSection())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new Div())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Container())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Tr())
                    , new StructureIndicator.DefaultElement(1, 1, new Th())
                    , new StructureIndicator.DefaultElement(1, 1, new Td())
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Clause())
                    , new StructureIndicator.DefaultElement(1, 1, new Section())
                    , new StructureIndicator.DefaultElement(1, 1, new Part())
                    , new StructureIndicator.DefaultElement(1, 1, new Paragraph())
                    , new StructureIndicator.DefaultElement(1, 1, new Chapter())
                    , new StructureIndicator.DefaultElement(1, 1, new Title())
                    , new StructureIndicator.DefaultElement(1, 1, new Article())
                    , new StructureIndicator.DefaultElement(1, 1, new Book())
                    , new StructureIndicator.DefaultElement(1, 1, new Tome())
                    , new StructureIndicator.DefaultElement(1, 1, new Division())
                    , new StructureIndicator.DefaultElement(1, 1, new List())
                    , new StructureIndicator.DefaultElement(1, 1, new Point())
                    , new StructureIndicator.DefaultElement(1, 1, new Indent())
                    , new StructureIndicator.DefaultElement(1, 1, new Alinea())
                    , new StructureIndicator.DefaultElement(1, 1, new Rule())
                    , new StructureIndicator.DefaultElement(1, 1, new Subrule())
                    , new StructureIndicator.DefaultElement(1, 1, new Proviso())
                    , new StructureIndicator.DefaultElement(1, 1, new Subsection())
                    , new StructureIndicator.DefaultElement(1, 1, new Subpart())
                    , new StructureIndicator.DefaultElement(1, 1, new Subparagraph())
                    , new StructureIndicator.DefaultElement(1, 1, new Subchapter())
                    , new StructureIndicator.DefaultElement(1, 1, new Subtitle())
                    , new StructureIndicator.DefaultElement(1, 1, new Subdivision())
                    , new StructureIndicator.DefaultElement(1, 1, new Subclause())
                    , new StructureIndicator.DefaultElement(1, 1, new Sublist())
                    , new StructureIndicator.DefaultElement(1, 1, new Transitional())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Hcontainer())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Content())
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new SpeechGroup())
                    , new StructureIndicator.DefaultElement(1, 1, new Speech())
                    , new StructureIndicator.DefaultElement(1, 1, new Question())
                    , new StructureIndicator.DefaultElement(1, 1, new Answer())
                    , new StructureIndicator.DefaultElement(1, 1, new Other())
                    , new StructureIndicator.DefaultElement(1, 1, new Scene())
                    , new StructureIndicator.DefaultElement(1, 1, new Narrative())
                    , new StructureIndicator.DefaultElement(1, 1, new Summary())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Formula())
                    , new StructureIndicator.DefaultElement(1, 1, new Recitals())
                    , new StructureIndicator.DefaultElement(1, 1, new Citations())
                    , new StructureIndicator.DefaultElement(1, 1, new LongTitle())
                    , new StructureIndicator.DefaultElement(1, 1, new Recital())
                    , new StructureIndicator.DefaultElement(1, 1, new Citation())
                    , new StructureIndicator.DefaultElement(1, 1, new ComponentRef())
                    , new StructureIndicator.DefaultElement(1, 1, new DocumentRef())
                    , new StructureIndicator.DefaultElement(1, 1, new Intro())
                    , new StructureIndicator.DefaultElement(1, 1, new Wrap())
                    , new StructureIndicator.DefaultElement(1, 1, new Heading())
                    , new StructureIndicator.DefaultElement(1, 1, new Subheading())
                    , new StructureIndicator.DefaultElement(1, 1, new Num())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "subFlowStructureComplexType");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget subFlowStructureComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>SubFlowStructureComplexType</code> object with the given DOM element
     */
    public SubFlowStructureComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType refersToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private String wildcardContentAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private StatusTypeSimpleType statusAttr;
    private AnyURISimpleType alternativeToAttr;
    private StringSimpleType langAttr;
    private StringSimpleType spaceAttr;
    private AnyURISimpleType periodAttr;

    /**
     * Return <code>java.util.List<Tr></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Tr> getTrs() {
        java.util.List<Tr> result = new ArrayList<Tr>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Tr".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Tr) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Tr></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Tr> getTrList() {
        return getTrs();
    }

    /**
     * Add <code>java.util.List<Tr></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Tr addTr(Tr trElem) {
        this.addOverlayWidget(trElem);
        return trElem;
    }

    /**
     * Return <code>java.util.List<Th></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Th> getThs() {
        java.util.List<Th> result = new ArrayList<Th>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Th".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Th) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Th></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Th> getThList() {
        return getThs();
    }

    /**
     * Add <code>java.util.List<Th></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Th addTh(Th thElem) {
        this.addOverlayWidget(thElem);
        return thElem;
    }

    /**
     * Return <code>java.util.List<Td></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Td> getTds() {
        java.util.List<Td> result = new ArrayList<Td>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Td".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Td) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Td></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Td> getTdList() {
        return getTds();
    }

    /**
     * Add <code>java.util.List<Td></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Td addTd(Td tdElem) {
        this.addOverlayWidget(tdElem);
        return tdElem;
    }

    /**
     * Return <code>java.util.List<Content></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Content> getContent_s() {
        java.util.List<Content> result = new ArrayList<Content>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Content".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Content) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Content></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Content> getContent_List() {
        return getContent_s();
    }

    /**
     * Add <code>java.util.List<Content></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Content addContent_(Content content_Elem) {
        this.addOverlayWidget(content_Elem);
        return content_Elem;
    }

    /**
     * Return <code>java.util.List<Formula></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Formula> getFormulas() {
        java.util.List<Formula> result = new ArrayList<Formula>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Formula".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Formula) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Formula></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Formula> getFormulaList() {
        return getFormulas();
    }

    /**
     * Add <code>java.util.List<Formula></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Formula addFormula(Formula formulaElem) {
        this.addOverlayWidget(formulaElem);
        return formulaElem;
    }

    /**
     * Return <code>java.util.List<Recitals></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Recitals> getRecitalses() {
        java.util.List<Recitals> result = new ArrayList<Recitals>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Recitals".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Recitals) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Recitals></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Recitals> getRecitalsList() {
        return getRecitalses();
    }

    /**
     * Add <code>java.util.List<Recitals></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Recitals addRecitals(Recitals recitalsElem) {
        this.addOverlayWidget(recitalsElem);
        return recitalsElem;
    }

    /**
     * Return <code>java.util.List<Citations></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Citations> getCitationses() {
        java.util.List<Citations> result = new ArrayList<Citations>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Citations".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Citations) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Citations></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Citations> getCitationsList() {
        return getCitationses();
    }

    /**
     * Add <code>java.util.List<Citations></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Citations addCitations(Citations citationsElem) {
        this.addOverlayWidget(citationsElem);
        return citationsElem;
    }

    /**
     * Return <code>java.util.List<LongTitle></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<LongTitle> getLongTitles() {
        java.util.List<LongTitle> result = new ArrayList<LongTitle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("LongTitle".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((LongTitle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<LongTitle></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<LongTitle> getLongTitleList() {
        return getLongTitles();
    }

    /**
     * Add <code>java.util.List<LongTitle></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public LongTitle addLongTitle(LongTitle longTitleElem) {
        this.addOverlayWidget(longTitleElem);
        return longTitleElem;
    }

    /**
     * Return <code>java.util.List<Recital></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Recital> getRecitals() {
        java.util.List<Recital> result = new ArrayList<Recital>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Recital".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Recital) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Recital></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Recital> getRecitalList() {
        return getRecitals();
    }

    /**
     * Add <code>java.util.List<Recital></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Recital addRecital(Recital recitalElem) {
        this.addOverlayWidget(recitalElem);
        return recitalElem;
    }

    /**
     * Return <code>java.util.List<Citation></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Citation> getCitations() {
        java.util.List<Citation> result = new ArrayList<Citation>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Citation".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Citation) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Citation></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Citation> getCitationList() {
        return getCitations();
    }

    /**
     * Add <code>java.util.List<Citation></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Citation addCitation(Citation citationElem) {
        this.addOverlayWidget(citationElem);
        return citationElem;
    }

    /**
     * Return <code>java.util.List<ComponentRef></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((ComponentRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<ComponentRef></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ComponentRef> getComponentRefList() {
        return getComponentRefs();
    }

    /**
     * Add <code>java.util.List<ComponentRef></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public ComponentRef addComponentRef(ComponentRef componentRefElem) {
        this.addOverlayWidget(componentRefElem);
        return componentRefElem;
    }

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
     * Return <code>java.util.List<Intro></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Intro> getIntros() {
        java.util.List<Intro> result = new ArrayList<Intro>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Intro".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Intro) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Intro></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Intro> getIntroList() {
        return getIntros();
    }

    /**
     * Add <code>java.util.List<Intro></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Intro addIntro(Intro introElem) {
        this.addOverlayWidget(introElem);
        return introElem;
    }

    /**
     * Return <code>java.util.List<Wrap></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Wrap> getWraps() {
        java.util.List<Wrap> result = new ArrayList<Wrap>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Wrap".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Wrap) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Wrap></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Wrap> getWrapList() {
        return getWraps();
    }

    /**
     * Add <code>java.util.List<Wrap></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Wrap addWrap(Wrap wrapElem) {
        this.addOverlayWidget(wrapElem);
        return wrapElem;
    }

    /**
     * Return <code>java.util.List<Heading></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Heading> getHeadings() {
        java.util.List<Heading> result = new ArrayList<Heading>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Heading".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Heading) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Heading></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Heading> getHeadingList() {
        return getHeadings();
    }

    /**
     * Add <code>java.util.List<Heading></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Heading addHeading(Heading headingElem) {
        this.addOverlayWidget(headingElem);
        return headingElem;
    }

    /**
     * Return <code>java.util.List<Subheading></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subheading> getSubheadings() {
        java.util.List<Subheading> result = new ArrayList<Subheading>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subheading".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Subheading) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Subheading></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subheading> getSubheadingList() {
        return getSubheadings();
    }

    /**
     * Add <code>java.util.List<Subheading></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subheading addSubheading(Subheading subheadingElem) {
        this.addOverlayWidget(subheadingElem);
        return subheadingElem;
    }

    /**
     * Return <code>java.util.List<Num></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Num> getNums() {
        java.util.List<Num> result = new ArrayList<Num>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Num".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Num) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Num></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Num> getNumList() {
        return getNums();
    }

    /**
     * Add <code>java.util.List<Num></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Num addNum(Num numElem) {
        this.addOverlayWidget(numElem);
        return numElem;
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType idAttr(final IDSimpleType idAttr) {
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType classAttr(final StringSimpleType classAttr) {
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType styleAttr(final StringSimpleType styleAttr) {
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType langAttr(final StringSimpleType langAttr) {
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType spaceAttr(final StringSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
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
     * @return <code>SubFlowStructureComplexType</code> instance
     */
    public SubFlowStructureComplexType periodAttr(final AnyURISimpleType periodAttr) {
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

    /**
     * Return <code>java.util.List<Foreign></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Foreign> getForeigns() {
        java.util.List<Foreign> result = new ArrayList<Foreign>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Foreign".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Foreign) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Foreign></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Foreign> getForeignList() {
        return getForeigns();
    }

    /**
     * Add <code>java.util.List<Foreign></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Foreign addForeign(Foreign foreignElem) {
        this.addOverlayWidget(foreignElem);
        return foreignElem;
    }

    /**
     * Return <code>java.util.List<Block></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Block> getBlocks() {
        java.util.List<Block> result = new ArrayList<Block>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Block".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Block) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Block></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Block> getBlockList() {
        return getBlocks();
    }

    /**
     * Add <code>java.util.List<Block></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Block addBlock(Block blockElem) {
        this.addOverlayWidget(blockElem);
        return blockElem;
    }

    /**
     * Return <code>java.util.List<Container></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Container> getContainers() {
        java.util.List<Container> result = new ArrayList<Container>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Container) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Container></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Container> getContainerList() {
        return getContainers();
    }

    /**
     * Add <code>java.util.List<Container></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Container addContainer(Container containerElem) {
        this.addOverlayWidget(containerElem);
        return containerElem;
    }

    /**
     * Return <code>java.util.List<Hcontainer></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Hcontainer> getHcontainers() {
        java.util.List<Hcontainer> result = new ArrayList<Hcontainer>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Hcontainer".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Hcontainer) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Hcontainer></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Hcontainer> getHcontainerList() {
        return getHcontainers();
    }

    /**
     * Add <code>java.util.List<Hcontainer></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Hcontainer addHcontainer(Hcontainer hcontainerElem) {
        this.addOverlayWidget(hcontainerElem);
        return hcontainerElem;
    }

    /**
     * Return <code>java.util.List<SpeechGroup></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<SpeechGroup> getSpeechGroups() {
        java.util.List<SpeechGroup> result = new ArrayList<SpeechGroup>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("SpeechGroup".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((SpeechGroup) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<SpeechGroup></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<SpeechGroup> getSpeechGroupList() {
        return getSpeechGroups();
    }

    /**
     * Add <code>java.util.List<SpeechGroup></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public SpeechGroup addSpeechGroup(SpeechGroup speechGroupElem) {
        this.addOverlayWidget(speechGroupElem);
        return speechGroupElem;
    }

    /**
     * Return <code>java.util.List<Speech></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Speech> getSpeechs() {
        java.util.List<Speech> result = new ArrayList<Speech>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Speech".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Speech) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Speech></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Speech> getSpeechList() {
        return getSpeechs();
    }

    /**
     * Add <code>java.util.List<Speech></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Speech addSpeech(Speech speechElem) {
        this.addOverlayWidget(speechElem);
        return speechElem;
    }

    /**
     * Return <code>java.util.List<Question></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Question> getQuestions() {
        java.util.List<Question> result = new ArrayList<Question>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Question".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Question) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Question></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Question> getQuestionList() {
        return getQuestions();
    }

    /**
     * Add <code>java.util.List<Question></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Question addQuestion(Question questionElem) {
        this.addOverlayWidget(questionElem);
        return questionElem;
    }

    /**
     * Return <code>java.util.List<Answer></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Answer> getAnswers() {
        java.util.List<Answer> result = new ArrayList<Answer>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Answer".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Answer) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Answer></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Answer> getAnswerList() {
        return getAnswers();
    }

    /**
     * Add <code>java.util.List<Answer></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Answer addAnswer(Answer answerElem) {
        this.addOverlayWidget(answerElem);
        return answerElem;
    }

    /**
     * Return <code>java.util.List<Other></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Other> getOthers() {
        java.util.List<Other> result = new ArrayList<Other>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Other".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Other) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Other></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Other> getOtherList() {
        return getOthers();
    }

    /**
     * Add <code>java.util.List<Other></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Other addOther(Other otherElem) {
        this.addOverlayWidget(otherElem);
        return otherElem;
    }

    /**
     * Return <code>java.util.List<Scene></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Scene> getScenes() {
        java.util.List<Scene> result = new ArrayList<Scene>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Scene".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Scene) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Scene></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Scene> getSceneList() {
        return getScenes();
    }

    /**
     * Add <code>java.util.List<Scene></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Scene addScene(Scene sceneElem) {
        this.addOverlayWidget(sceneElem);
        return sceneElem;
    }

    /**
     * Return <code>java.util.List<Narrative></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Narrative> getNarratives() {
        java.util.List<Narrative> result = new ArrayList<Narrative>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Narrative".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Narrative) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Narrative></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Narrative> getNarrativeList() {
        return getNarratives();
    }

    /**
     * Add <code>java.util.List<Narrative></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Narrative addNarrative(Narrative narrativeElem) {
        this.addOverlayWidget(narrativeElem);
        return narrativeElem;
    }

    /**
     * Return <code>java.util.List<Summary></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Summary> getSummaries() {
        java.util.List<Summary> result = new ArrayList<Summary>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Summary".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Summary) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Summary></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Summary> getSummaryList() {
        return getSummaries();
    }

    /**
     * Add <code>java.util.List<Summary></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Summary addSummary(Summary summaryElem) {
        this.addOverlayWidget(summaryElem);
        return summaryElem;
    }

    /**
     * Return <code>java.util.List<BlockList></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<BlockList> getBlockLists() {
        java.util.List<BlockList> result = new ArrayList<BlockList>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("BlockList".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((BlockList) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<BlockList></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<BlockList> getBlockListList() {
        return getBlockLists();
    }

    /**
     * Add <code>java.util.List<BlockList></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public BlockList addBlockList(BlockList blockListElem) {
        this.addOverlayWidget(blockListElem);
        return blockListElem;
    }

    /**
     * Return <code>java.util.List<BlockContainer></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<BlockContainer> getBlockContainers() {
        java.util.List<BlockContainer> result = new ArrayList<BlockContainer>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("BlockContainer".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((BlockContainer) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<BlockContainer></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<BlockContainer> getBlockContainerList() {
        return getBlockContainers();
    }

    /**
     * Add <code>java.util.List<BlockContainer></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public BlockContainer addBlockContainer(BlockContainer blockContainerElem) {
        this.addOverlayWidget(blockContainerElem);
        return blockContainerElem;
    }

    /**
     * Return <code>java.util.List<Tblock></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Tblock> getTblocks() {
        java.util.List<Tblock> result = new ArrayList<Tblock>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Tblock".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Tblock) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Tblock></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Tblock> getTblockList() {
        return getTblocks();
    }

    /**
     * Add <code>java.util.List<Tblock></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Tblock addTblock(Tblock tblockElem) {
        this.addOverlayWidget(tblockElem);
        return tblockElem;
    }

    /**
     * Return <code>java.util.List<Toc></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Toc> getTocs() {
        java.util.List<Toc> result = new ArrayList<Toc>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Toc".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Toc) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Toc></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Toc> getTocList() {
        return getTocs();
    }

    /**
     * Add <code>java.util.List<Toc></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Toc addToc(Toc tocElem) {
        this.addOverlayWidget(tocElem);
        return tocElem;
    }

    /**
     * Return <code>java.util.List<Ul></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Ul> getUls() {
        java.util.List<Ul> result = new ArrayList<Ul>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Ul".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Ul) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Ul></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Ul> getUlList() {
        return getUls();
    }

    /**
     * Add <code>java.util.List<Ul></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Ul addUl(Ul ulElem) {
        this.addOverlayWidget(ulElem);
        return ulElem;
    }

    /**
     * Return <code>java.util.List<Ol></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Ol> getOls() {
        java.util.List<Ol> result = new ArrayList<Ol>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Ol".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Ol) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Ol></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Ol> getOlList() {
        return getOls();
    }

    /**
     * Add <code>java.util.List<Ol></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Ol addOl(Ol olElem) {
        this.addOverlayWidget(olElem);
        return olElem;
    }

    /**
     * Return <code>java.util.List<Table></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Table> getTables() {
        java.util.List<Table> result = new ArrayList<Table>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Table".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Table) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Table></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Table> getTableList() {
        return getTables();
    }

    /**
     * Add <code>java.util.List<Table></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Table addTable(Table tableElem) {
        this.addOverlayWidget(tableElem);
        return tableElem;
    }

    /**
     * Return <code>java.util.List<P></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<P> getPs() {
        java.util.List<P> result = new ArrayList<P>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("P".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((P) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<P></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<P> getPList() {
        return getPs();
    }

    /**
     * Add <code>java.util.List<P></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public P addP(P pElem) {
        this.addOverlayWidget(pElem);
        return pElem;
    }

    /**
     * Return <code>java.util.List<AdministrationOfOath></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AdministrationOfOath> getAdministrationOfOaths() {
        java.util.List<AdministrationOfOath> result = new ArrayList<AdministrationOfOath>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((AdministrationOfOath) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<AdministrationOfOath></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AdministrationOfOath> getAdministrationOfOathList() {
        return getAdministrationOfOaths();
    }

    /**
     * Add <code>java.util.List<AdministrationOfOath></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public AdministrationOfOath addAdministrationOfOath(AdministrationOfOath administrationOfOathElem) {
        this.addOverlayWidget(administrationOfOathElem);
        return administrationOfOathElem;
    }

    /**
     * Return <code>java.util.List<RollCall></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<RollCall> getRollCalls() {
        java.util.List<RollCall> result = new ArrayList<RollCall>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((RollCall) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<RollCall></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<RollCall> getRollCallList() {
        return getRollCalls();
    }

    /**
     * Add <code>java.util.List<RollCall></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public RollCall addRollCall(RollCall rollCallElem) {
        this.addOverlayWidget(rollCallElem);
        return rollCallElem;
    }

    /**
     * Return <code>java.util.List<Prayers></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Prayers> getPrayerses() {
        java.util.List<Prayers> result = new ArrayList<Prayers>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Prayers) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Prayers></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Prayers> getPrayersList() {
        return getPrayerses();
    }

    /**
     * Add <code>java.util.List<Prayers></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Prayers addPrayers(Prayers prayersElem) {
        this.addOverlayWidget(prayersElem);
        return prayersElem;
    }

    /**
     * Return <code>java.util.List<OralStatements></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<OralStatements> getOralStatementses() {
        java.util.List<OralStatements> result = new ArrayList<OralStatements>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((OralStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<OralStatements></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<OralStatements> getOralStatementsList() {
        return getOralStatementses();
    }

    /**
     * Add <code>java.util.List<OralStatements></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public OralStatements addOralStatements(OralStatements oralStatementsElem) {
        this.addOverlayWidget(oralStatementsElem);
        return oralStatementsElem;
    }

    /**
     * Return <code>java.util.List<WrittenStatements></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<WrittenStatements> getWrittenStatementses() {
        java.util.List<WrittenStatements> result = new ArrayList<WrittenStatements>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((WrittenStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<WrittenStatements></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<WrittenStatements> getWrittenStatementsList() {
        return getWrittenStatementses();
    }

    /**
     * Add <code>java.util.List<WrittenStatements></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public WrittenStatements addWrittenStatements(WrittenStatements writtenStatementsElem) {
        this.addOverlayWidget(writtenStatementsElem);
        return writtenStatementsElem;
    }

    /**
     * Return <code>java.util.List<PersonalStatements></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<PersonalStatements> getPersonalStatementses() {
        java.util.List<PersonalStatements> result = new ArrayList<PersonalStatements>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((PersonalStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<PersonalStatements></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<PersonalStatements> getPersonalStatementsList() {
        return getPersonalStatementses();
    }

    /**
     * Add <code>java.util.List<PersonalStatements></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public PersonalStatements addPersonalStatements(PersonalStatements personalStatementsElem) {
        this.addOverlayWidget(personalStatementsElem);
        return personalStatementsElem;
    }

    /**
     * Return <code>java.util.List<MinisterialStatements></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<MinisterialStatements> getMinisterialStatementses() {
        java.util.List<MinisterialStatements> result = new ArrayList<MinisterialStatements>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((MinisterialStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<MinisterialStatements></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<MinisterialStatements> getMinisterialStatementsList() {
        return getMinisterialStatementses();
    }

    /**
     * Add <code>java.util.List<MinisterialStatements></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public MinisterialStatements addMinisterialStatements(MinisterialStatements ministerialStatementsElem) {
        this.addOverlayWidget(ministerialStatementsElem);
        return ministerialStatementsElem;
    }

    /**
     * Return <code>java.util.List<Resolutions></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Resolutions> getResolutionses() {
        java.util.List<Resolutions> result = new ArrayList<Resolutions>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Resolutions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Resolutions></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Resolutions> getResolutionsList() {
        return getResolutionses();
    }

    /**
     * Add <code>java.util.List<Resolutions></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Resolutions addResolutions(Resolutions resolutionsElem) {
        this.addOverlayWidget(resolutionsElem);
        return resolutionsElem;
    }

    /**
     * Return <code>java.util.List<NationalInterest></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<NationalInterest> getNationalInterests() {
        java.util.List<NationalInterest> result = new ArrayList<NationalInterest>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((NationalInterest) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<NationalInterest></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<NationalInterest> getNationalInterestList() {
        return getNationalInterests();
    }

    /**
     * Add <code>java.util.List<NationalInterest></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public NationalInterest addNationalInterest(NationalInterest nationalInterestElem) {
        this.addOverlayWidget(nationalInterestElem);
        return nationalInterestElem;
    }

    /**
     * Return <code>java.util.List<DeclarationOfVote></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DeclarationOfVote> getDeclarationOfVotes() {
        java.util.List<DeclarationOfVote> result = new ArrayList<DeclarationOfVote>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DeclarationOfVote) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DeclarationOfVote></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DeclarationOfVote> getDeclarationOfVoteList() {
        return getDeclarationOfVotes();
    }

    /**
     * Add <code>java.util.List<DeclarationOfVote></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DeclarationOfVote addDeclarationOfVote(DeclarationOfVote declarationOfVoteElem) {
        this.addOverlayWidget(declarationOfVoteElem);
        return declarationOfVoteElem;
    }

    /**
     * Return <code>java.util.List<Communication></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Communication> getCommunications() {
        java.util.List<Communication> result = new ArrayList<Communication>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Communication) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Communication></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Communication> getCommunicationList() {
        return getCommunications();
    }

    /**
     * Add <code>java.util.List<Communication></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Communication addCommunication(Communication communicationElem) {
        this.addOverlayWidget(communicationElem);
        return communicationElem;
    }

    /**
     * Return <code>java.util.List<Petitions></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Petitions> getPetitionses() {
        java.util.List<Petitions> result = new ArrayList<Petitions>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Petitions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Petitions></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Petitions> getPetitionsList() {
        return getPetitionses();
    }

    /**
     * Add <code>java.util.List<Petitions></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Petitions addPetitions(Petitions petitionsElem) {
        this.addOverlayWidget(petitionsElem);
        return petitionsElem;
    }

    /**
     * Return <code>java.util.List<Papers></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Papers> getPaperses() {
        java.util.List<Papers> result = new ArrayList<Papers>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Papers) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Papers></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Papers> getPapersList() {
        return getPaperses();
    }

    /**
     * Add <code>java.util.List<Papers></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Papers addPapers(Papers papersElem) {
        this.addOverlayWidget(papersElem);
        return papersElem;
    }

    /**
     * Return <code>java.util.List<NoticesOfMotion></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<NoticesOfMotion> getNoticesOfMotions() {
        java.util.List<NoticesOfMotion> result = new ArrayList<NoticesOfMotion>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((NoticesOfMotion) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<NoticesOfMotion></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<NoticesOfMotion> getNoticesOfMotionList() {
        return getNoticesOfMotions();
    }

    /**
     * Add <code>java.util.List<NoticesOfMotion></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public NoticesOfMotion addNoticesOfMotion(NoticesOfMotion noticesOfMotionElem) {
        this.addOverlayWidget(noticesOfMotionElem);
        return noticesOfMotionElem;
    }

    /**
     * Return <code>java.util.List<Questions></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Questions> getQuestionses() {
        java.util.List<Questions> result = new ArrayList<Questions>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Questions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Questions></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Questions> getQuestionsList() {
        return getQuestionses();
    }

    /**
     * Add <code>java.util.List<Questions></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Questions addQuestions(Questions questionsElem) {
        this.addOverlayWidget(questionsElem);
        return questionsElem;
    }

    /**
     * Return <code>java.util.List<Address></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Address> getAddresses() {
        java.util.List<Address> result = new ArrayList<Address>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Address) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Address></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Address> getAddressList() {
        return getAddresses();
    }

    /**
     * Add <code>java.util.List<Address></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Address addAddress(Address addressElem) {
        this.addOverlayWidget(addressElem);
        return addressElem;
    }

    /**
     * Return <code>java.util.List<ProceduralMotions></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ProceduralMotions> getProceduralMotionses() {
        java.util.List<ProceduralMotions> result = new ArrayList<ProceduralMotions>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((ProceduralMotions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<ProceduralMotions></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ProceduralMotions> getProceduralMotionsList() {
        return getProceduralMotionses();
    }

    /**
     * Add <code>java.util.List<ProceduralMotions></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public ProceduralMotions addProceduralMotions(ProceduralMotions proceduralMotionsElem) {
        this.addOverlayWidget(proceduralMotionsElem);
        return proceduralMotionsElem;
    }

    /**
     * Return <code>java.util.List<PointOfOrder></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<PointOfOrder> getPointOfOrders() {
        java.util.List<PointOfOrder> result = new ArrayList<PointOfOrder>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((PointOfOrder) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<PointOfOrder></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<PointOfOrder> getPointOfOrderList() {
        return getPointOfOrders();
    }

    /**
     * Add <code>java.util.List<PointOfOrder></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public PointOfOrder addPointOfOrder(PointOfOrder pointOfOrderElem) {
        this.addOverlayWidget(pointOfOrderElem);
        return pointOfOrderElem;
    }

    /**
     * Return <code>java.util.List<Adjournment></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Adjournment> getAdjournments() {
        java.util.List<Adjournment> result = new ArrayList<Adjournment>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Adjournment) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Adjournment></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Adjournment> getAdjournmentList() {
        return getAdjournments();
    }

    /**
     * Add <code>java.util.List<Adjournment></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Adjournment addAdjournment(Adjournment adjournmentElem) {
        this.addOverlayWidget(adjournmentElem);
        return adjournmentElem;
    }

    /**
     * Return <code>java.util.List<DebateSection></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DebateSection> getDebateSections() {
        java.util.List<DebateSection> result = new ArrayList<DebateSection>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DebateSection) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DebateSection></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DebateSection> getDebateSectionList() {
        return getDebateSections();
    }

    /**
     * Add <code>java.util.List<DebateSection></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DebateSection addDebateSection(DebateSection debateSectionElem) {
        this.addOverlayWidget(debateSectionElem);
        return debateSectionElem;
    }

    /**
     * Return <code>java.util.List<Div></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Div> getDivs() {
        java.util.List<Div> result = new ArrayList<Div>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Div".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Div) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Div></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Div> getDivList() {
        return getDivs();
    }

    /**
     * Add <code>java.util.List<Div></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Div addDiv(Div divElem) {
        this.addOverlayWidget(divElem);
        return divElem;
    }

    /**
     * Return <code>java.util.List<Clause></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Clause> getClauses() {
        java.util.List<Clause> result = new ArrayList<Clause>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Clause".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Clause) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Clause></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Clause> getClauseList() {
        return getClauses();
    }

    /**
     * Add <code>java.util.List<Clause></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Clause addClause(Clause clauseElem) {
        this.addOverlayWidget(clauseElem);
        return clauseElem;
    }

    /**
     * Return <code>java.util.List<Section></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Section> getSections() {
        java.util.List<Section> result = new ArrayList<Section>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Section".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Section) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Section></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Section> getSectionList() {
        return getSections();
    }

    /**
     * Add <code>java.util.List<Section></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Section addSection(Section sectionElem) {
        this.addOverlayWidget(sectionElem);
        return sectionElem;
    }

    /**
     * Return <code>java.util.List<Part></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Part> getParts() {
        java.util.List<Part> result = new ArrayList<Part>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Part".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Part) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Part></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Part> getPartList() {
        return getParts();
    }

    /**
     * Add <code>java.util.List<Part></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Part addPart(Part partElem) {
        this.addOverlayWidget(partElem);
        return partElem;
    }

    /**
     * Return <code>java.util.List<Paragraph></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Paragraph> getParagraphs() {
        java.util.List<Paragraph> result = new ArrayList<Paragraph>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Paragraph".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Paragraph) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Paragraph></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Paragraph> getParagraphList() {
        return getParagraphs();
    }

    /**
     * Add <code>java.util.List<Paragraph></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Paragraph addParagraph(Paragraph paragraphElem) {
        this.addOverlayWidget(paragraphElem);
        return paragraphElem;
    }

    /**
     * Return <code>java.util.List<Chapter></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Chapter> getChapters() {
        java.util.List<Chapter> result = new ArrayList<Chapter>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Chapter".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Chapter) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Chapter></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Chapter> getChapterList() {
        return getChapters();
    }

    /**
     * Add <code>java.util.List<Chapter></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Chapter addChapter(Chapter chapterElem) {
        this.addOverlayWidget(chapterElem);
        return chapterElem;
    }

    /**
     * Return <code>java.util.List<Title></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Title> getTitle_s() {
        java.util.List<Title> result = new ArrayList<Title>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Title".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Title) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Title></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Title> getTitle_List() {
        return getTitle_s();
    }

    /**
     * Add <code>java.util.List<Title></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Title addTitle_(Title title_Elem) {
        this.addOverlayWidget(title_Elem);
        return title_Elem;
    }

    /**
     * Return <code>java.util.List<Article></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Article> getArticles() {
        java.util.List<Article> result = new ArrayList<Article>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Article".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Article) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Article></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Article> getArticleList() {
        return getArticles();
    }

    /**
     * Add <code>java.util.List<Article></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Article addArticle(Article articleElem) {
        this.addOverlayWidget(articleElem);
        return articleElem;
    }

    /**
     * Return <code>java.util.List<Book></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Book> getBooks() {
        java.util.List<Book> result = new ArrayList<Book>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Book".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Book) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Book></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Book> getBookList() {
        return getBooks();
    }

    /**
     * Add <code>java.util.List<Book></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Book addBook(Book bookElem) {
        this.addOverlayWidget(bookElem);
        return bookElem;
    }

    /**
     * Return <code>java.util.List<Tome></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Tome> getTomes() {
        java.util.List<Tome> result = new ArrayList<Tome>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Tome".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Tome) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Tome></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Tome> getTomeList() {
        return getTomes();
    }

    /**
     * Add <code>java.util.List<Tome></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Tome addTome(Tome tomeElem) {
        this.addOverlayWidget(tomeElem);
        return tomeElem;
    }

    /**
     * Return <code>java.util.List<Division></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Division> getDivisions() {
        java.util.List<Division> result = new ArrayList<Division>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Division".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Division) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Division></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Division> getDivisionList() {
        return getDivisions();
    }

    /**
     * Add <code>java.util.List<Division></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Division addDivision(Division divisionElem) {
        this.addOverlayWidget(divisionElem);
        return divisionElem;
    }

    /**
     * Return <code>java.util.List<List></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<List> getLists() {
        java.util.List<List> result = new ArrayList<List>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("List".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((List) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<List></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<List> getListList() {
        return getLists();
    }

    /**
     * Add <code>java.util.List<List></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public List addList(List listElem) {
        this.addOverlayWidget(listElem);
        return listElem;
    }

    /**
     * Return <code>java.util.List<Point></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Point> getPoints() {
        java.util.List<Point> result = new ArrayList<Point>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Point".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Point) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Point></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Point> getPointList() {
        return getPoints();
    }

    /**
     * Add <code>java.util.List<Point></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Point addPoint(Point pointElem) {
        this.addOverlayWidget(pointElem);
        return pointElem;
    }

    /**
     * Return <code>java.util.List<Indent></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Indent> getIndents() {
        java.util.List<Indent> result = new ArrayList<Indent>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Indent".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Indent) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Indent></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Indent> getIndentList() {
        return getIndents();
    }

    /**
     * Add <code>java.util.List<Indent></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Indent addIndent(Indent indentElem) {
        this.addOverlayWidget(indentElem);
        return indentElem;
    }

    /**
     * Return <code>java.util.List<Alinea></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Alinea> getAlineas() {
        java.util.List<Alinea> result = new ArrayList<Alinea>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Alinea".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Alinea) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Alinea></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Alinea> getAlineaList() {
        return getAlineas();
    }

    /**
     * Add <code>java.util.List<Alinea></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Alinea addAlinea(Alinea alineaElem) {
        this.addOverlayWidget(alineaElem);
        return alineaElem;
    }

    /**
     * Return <code>java.util.List<Rule></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Rule> getRules() {
        java.util.List<Rule> result = new ArrayList<Rule>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Rule".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Rule) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Rule></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Rule> getRuleList() {
        return getRules();
    }

    /**
     * Add <code>java.util.List<Rule></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Rule addRule(Rule ruleElem) {
        this.addOverlayWidget(ruleElem);
        return ruleElem;
    }

    /**
     * Return <code>java.util.List<Subrule></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subrule> getSubrules() {
        java.util.List<Subrule> result = new ArrayList<Subrule>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subrule".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Subrule) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Subrule></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subrule> getSubruleList() {
        return getSubrules();
    }

    /**
     * Add <code>java.util.List<Subrule></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subrule addSubrule(Subrule subruleElem) {
        this.addOverlayWidget(subruleElem);
        return subruleElem;
    }

    /**
     * Return <code>java.util.List<Proviso></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Proviso> getProvisos() {
        java.util.List<Proviso> result = new ArrayList<Proviso>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Proviso".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Proviso) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Proviso></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Proviso> getProvisoList() {
        return getProvisos();
    }

    /**
     * Add <code>java.util.List<Proviso></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Proviso addProviso(Proviso provisoElem) {
        this.addOverlayWidget(provisoElem);
        return provisoElem;
    }

    /**
     * Return <code>java.util.List<Subsection></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subsection> getSubsections() {
        java.util.List<Subsection> result = new ArrayList<Subsection>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subsection".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Subsection) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Subsection></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subsection> getSubsectionList() {
        return getSubsections();
    }

    /**
     * Add <code>java.util.List<Subsection></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subsection addSubsection(Subsection subsectionElem) {
        this.addOverlayWidget(subsectionElem);
        return subsectionElem;
    }

    /**
     * Return <code>java.util.List<Subpart></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subpart> getSubparts() {
        java.util.List<Subpart> result = new ArrayList<Subpart>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subpart".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Subpart) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Subpart></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subpart> getSubpartList() {
        return getSubparts();
    }

    /**
     * Add <code>java.util.List<Subpart></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subpart addSubpart(Subpart subpartElem) {
        this.addOverlayWidget(subpartElem);
        return subpartElem;
    }

    /**
     * Return <code>java.util.List<Subparagraph></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subparagraph> getSubparagraphs() {
        java.util.List<Subparagraph> result = new ArrayList<Subparagraph>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subparagraph".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Subparagraph) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Subparagraph></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subparagraph> getSubparagraphList() {
        return getSubparagraphs();
    }

    /**
     * Add <code>java.util.List<Subparagraph></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subparagraph addSubparagraph(Subparagraph subparagraphElem) {
        this.addOverlayWidget(subparagraphElem);
        return subparagraphElem;
    }

    /**
     * Return <code>java.util.List<Subchapter></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subchapter> getSubchapters() {
        java.util.List<Subchapter> result = new ArrayList<Subchapter>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subchapter".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Subchapter) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Subchapter></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subchapter> getSubchapterList() {
        return getSubchapters();
    }

    /**
     * Add <code>java.util.List<Subchapter></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subchapter addSubchapter(Subchapter subchapterElem) {
        this.addOverlayWidget(subchapterElem);
        return subchapterElem;
    }

    /**
     * Return <code>java.util.List<Subtitle></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subtitle> getSubtitles() {
        java.util.List<Subtitle> result = new ArrayList<Subtitle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subtitle".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Subtitle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Subtitle></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subtitle> getSubtitleList() {
        return getSubtitles();
    }

    /**
     * Add <code>java.util.List<Subtitle></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subtitle addSubtitle(Subtitle subtitleElem) {
        this.addOverlayWidget(subtitleElem);
        return subtitleElem;
    }

    /**
     * Return <code>java.util.List<Subdivision></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subdivision> getSubdivisions() {
        java.util.List<Subdivision> result = new ArrayList<Subdivision>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subdivision".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Subdivision) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Subdivision></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subdivision> getSubdivisionList() {
        return getSubdivisions();
    }

    /**
     * Add <code>java.util.List<Subdivision></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subdivision addSubdivision(Subdivision subdivisionElem) {
        this.addOverlayWidget(subdivisionElem);
        return subdivisionElem;
    }

    /**
     * Return <code>java.util.List<Subclause></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subclause> getSubclauses() {
        java.util.List<Subclause> result = new ArrayList<Subclause>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subclause".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Subclause) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Subclause></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subclause> getSubclauseList() {
        return getSubclauses();
    }

    /**
     * Add <code>java.util.List<Subclause></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Subclause addSubclause(Subclause subclauseElem) {
        this.addOverlayWidget(subclauseElem);
        return subclauseElem;
    }

    /**
     * Return <code>java.util.List<Sublist></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Sublist> getSublists() {
        java.util.List<Sublist> result = new ArrayList<Sublist>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Sublist".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Sublist) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Sublist></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Sublist> getSublistList() {
        return getSublists();
    }

    /**
     * Add <code>java.util.List<Sublist></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Sublist addSublist(Sublist sublistElem) {
        this.addOverlayWidget(sublistElem);
        return sublistElem;
    }

    /**
     * Return <code>java.util.List<Transitional></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Transitional> getTransitionals() {
        java.util.List<Transitional> result = new ArrayList<Transitional>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Transitional".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Transitional) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Transitional></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Transitional> getTransitionalList() {
        return getTransitionals();
    }

    /**
     * Add <code>java.util.List<Transitional></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Transitional addTransitional(Transitional transitionalElem) {
        this.addOverlayWidget(transitionalElem);
        return transitionalElem;
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
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("space", getSpaceAttr() != null ? getSpaceAttr().getValue() : null);
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
    public SubFlowStructureComplexType html(String s) {
        super.html(s);
        return this;
    }
}

