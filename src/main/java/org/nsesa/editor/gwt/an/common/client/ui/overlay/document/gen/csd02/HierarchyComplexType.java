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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * The complex type hierarchy is used by most or all the hierarchical elements of act-like documents.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class HierarchyComplexType extends BasehierarchyComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(0, 1, new Intro())
                    , new StructureIndicator.DefaultChoice(0, -1, new StructureIndicator.DefaultElement(1, 1, new ComponentRef())
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
                    , new StructureIndicator.DefaultElement(1, 1, new Subsection())
                    , new StructureIndicator.DefaultElement(1, 1, new Subpart())
                    , new StructureIndicator.DefaultElement(1, 1, new Subparagraph())
                    , new StructureIndicator.DefaultElement(1, 1, new Subchapter())
                    , new StructureIndicator.DefaultElement(1, 1, new Subtitle())
                    , new StructureIndicator.DefaultElement(1, 1, new Subclause())
                    , new StructureIndicator.DefaultElement(1, 1, new Sublist())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Hcontainer())
            )
            )
            )
                    , new StructureIndicator.DefaultElement(0, 1, new Wrap())
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Content())
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
        span.setAttribute("type", "hierarchyComplexType");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget hierarchyComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>HierarchyComplexType</code> object with the given DOM element
     */
    public HierarchyComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StatusTypeSimpleType statusAttr;
    private String wildcardContentAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType alternativeToAttr;
    private LanguageSimpleType langAttr;
    private NCNameSimpleType spaceAttr;
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType periodAttr;

    /**
     * Add <code>Content</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Content getContent_() {
        Content result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Content".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Content) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>content_Elem</code> property in DSL way
     *
     * @param content_Elem new value
     * @return <code>Content</code> instance
     */
    public Content setContent_(Content content_Elem) {
        Content result = getContent_();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(content_Elem);

        return content_Elem;
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType idAttr(final IDSimpleType idAttr) {
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType wildcardContentAttr(final String wildcardContentAttr) {
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType classAttr(final StringSimpleType classAttr) {
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType styleAttr(final StringSimpleType styleAttr) {
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Return <code>spaceAttr</code> property
     *
     * @return spaceAttr
     */
    public NCNameSimpleType getSpaceAttr() {
        if (spaceAttr == null) {
            spaceAttr = new NCNameSimpleType();
            spaceAttr.setValue(getElement().getAttribute("space"));
        }

        return spaceAttr;
    }

    /**
     * Return <code>spaceAttr</code> property in DSL way
     *
     * @return spaceAttr
     */
    public NCNameSimpleType spaceAttr() {
        return getSpaceAttr();
    }

    /**
     * Set <code>spaceAttr</code> property
     *
     * @param spaceAttr the new value
     */
    public void setSpaceAttr(final NCNameSimpleType spaceAttr) {
        this.spaceAttr = spaceAttr;
        getElement().setAttribute("space", spaceAttr.getValue());
    }

    /**
     * Set <code>spaceAttr</code> property in DSL way
     *
     * @param spaceAttr the new value
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Add <code>Intro</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Intro getIntro() {
        Intro result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Intro".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Intro) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>introElem</code> property in DSL way
     *
     * @param introElem new value
     * @return <code>Intro</code> instance
     */
    public Intro setIntro(Intro introElem) {
        Intro result = getIntro();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(introElem);

        return introElem;
    }

    /**
     * Add <code>Wrap</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Wrap getWrap() {
        Wrap result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Wrap".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Wrap) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>wrapElem</code> property in DSL way
     *
     * @param wrapElem new value
     * @return <code>Wrap</code> instance
     */
    public Wrap setWrap(Wrap wrapElem) {
        Wrap result = getWrap();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(wrapElem);

        return wrapElem;
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
     * @return <code>HierarchyComplexType</code> instance
     */
    public HierarchyComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Return <code>java.util.List<ComponentRef></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<Hcontainer></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Hcontainer> getHcontainers() {
        java.util.List<Hcontainer> result = new ArrayList<Hcontainer>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Hcontainer".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<Clause></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Clause> getClauses() {
        java.util.List<Clause> result = new ArrayList<Clause>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Clause".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Section".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Part".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Paragraph".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Chapter".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Title".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Article".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Book".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Tome".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Division".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("List".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Point".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Indent".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Alinea".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<Subsection></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subsection> getSubsections() {
        java.util.List<Subsection> result = new ArrayList<Subsection>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subsection".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Subpart".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Subparagraph".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Subchapter".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Subtitle".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
     * Return <code>java.util.List<Subclause></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Subclause> getSubclauses() {
        java.util.List<Subclause> result = new ArrayList<Subclause>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subclause".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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
            if ("Sublist".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
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

//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("space", getSpaceAttr() != null ? getSpaceAttr().getValue() : null);
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
    public HierarchyComplexType html(String s) {
        super.html(s);
        return this;
    }
}

