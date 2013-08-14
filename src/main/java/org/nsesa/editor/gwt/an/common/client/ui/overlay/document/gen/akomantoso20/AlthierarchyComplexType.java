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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * The complex type althierarchy is used by most or all the hierarchical elements of documents<br/> that are not act-like.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class AlthierarchyComplexType extends BasehierarchyComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultChoice(0, -1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new AdministrationOfOath())
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
                    , new StructureIndicator.DefaultElement(1, 1, new ComponentRef())
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Speech())
                    , new StructureIndicator.DefaultElement(1, 1, new Question())
                    , new StructureIndicator.DefaultElement(1, 1, new Answer())
                    , new StructureIndicator.DefaultElement(1, 1, new Other())
                    , new StructureIndicator.DefaultElement(1, 1, new Scene())
                    , new StructureIndicator.DefaultElement(1, 1, new Narrative())
                    , new StructureIndicator.DefaultElement(1, 1, new Summary())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new BlockList())
                    , new StructureIndicator.DefaultElement(1, 1, new Toc())
                    , new StructureIndicator.DefaultElement(1, 1, new Tblock())
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
            )
            ,

            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(0, 1, new Num())
                    , new StructureIndicator.DefaultElement(0, 1, new Heading())
                    , new StructureIndicator.DefaultElement(0, 1, new Subheading())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "althierarchyComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget althierarchyComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>AlthierarchyComplexType</code> object with the given DOM element
     */
    public AlthierarchyComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType alternativeToAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private String wildcardContentAttr;
    private LanguageSimpleType langAttr;
    private StatusTypeSimpleType statusAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType periodAttr;

    /**
     * Return <code>java.util.List<ComponentRef></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType classAttr(final StringSimpleType classAttr) {
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType styleAttr(final StringSimpleType styleAttr) {
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Return <code>langAttr</code> property
     *
     * @return langAttr
     */
    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(getElement().getAttribute("lang"));
        }

        return langAttr;
    }

    /**
     * Return <code>langAttr</code> property in DSL way
     *
     * @return langAttr
     */
    public LanguageSimpleType langAttr() {
        return getLangAttr();
    }

    /**
     * Set <code>langAttr</code> property
     *
     * @param langAttr the new value
     */
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
        getElement().setAttribute("lang", langAttr.getValue());
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr the new value
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType idAttr(final IDSimpleType idAttr) {
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
     * @return <code>AlthierarchyComplexType</code> instance
     */
    public AlthierarchyComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Return <code>java.util.List<Container></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Container> getContainers() {
        java.util.List<Container> result = new ArrayList<Container>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<Speech></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Speech> getSpeechs() {
        java.util.List<Speech> result = new ArrayList<Speech>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Speech".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Question".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Answer".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Other".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Scene".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Narrative".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Summary".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<Foreign></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Foreign> getForeigns() {
        java.util.List<Foreign> result = new ArrayList<Foreign>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Foreign".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Block".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<AdministrationOfOath></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AdministrationOfOath> getAdministrationOfOaths() {
        java.util.List<AdministrationOfOath> result = new ArrayList<AdministrationOfOath>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("RollCall".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Prayers".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("OralStatements".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("WrittenStatements".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("PersonalStatements".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Resolutions".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("NationalInterest".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Communication".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Petitions".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Papers".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Questions".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Address".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("PointOfOrder".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Adjournment".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("DebateSection".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Div".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<BlockList></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<BlockList> getBlockLists() {
        java.util.List<BlockList> result = new ArrayList<BlockList>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("BlockList".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<Toc></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Toc> getTocs() {
        java.util.List<Toc> result = new ArrayList<Toc>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Toc".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<Tblock></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Tblock> getTblocks() {
        java.util.List<Tblock> result = new ArrayList<Tblock>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Tblock".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<Ul></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Ul> getUls() {
        java.util.List<Ul> result = new ArrayList<Ul>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Ul".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Ol".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Table".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("P".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
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
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
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
    public AlthierarchyComplexType html(String s) {
        super.html(s);
        return this;
    }
}

