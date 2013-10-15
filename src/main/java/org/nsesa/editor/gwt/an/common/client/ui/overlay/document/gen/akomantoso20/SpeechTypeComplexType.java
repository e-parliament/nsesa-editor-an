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
 * the complex type speechType defines the content model and attributes shared by all speech<br/> elements. Here the id attribute is optional
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class SpeechTypeComplexType extends BasehierarchyComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(0, 1, new From())
                    , new StructureIndicator.DefaultSequence(1, -1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new BlockList())
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
        span.setAttribute("data-type", "speechTypeComplexType");
        span.setAttribute("data-ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget speechTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>SpeechTypeComplexType</code> object with the given DOM element
     */
    public SpeechTypeComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType byAttr;
    private AnyURISimpleType asAttr;
    private DateTimeSimpleType startTimeAttr;
    private DateTimeSimpleType endTimeAttr;
    private AnyURISimpleType toAttr;
    private LanguageSimpleType langAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private StatusTypeSimpleType statusAttr;
    private AnyURISimpleType alternativeToAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType refersToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType periodAttr;

    /**
     * Return <code>byAttr</code> property
     *
     * @return byAttr
     */
    public AnyURISimpleType getByAttr() {
        if (byAttr == null) {
            byAttr = new AnyURISimpleType();
            byAttr.setValue(getElement().getAttribute("by"));
        }

        return byAttr;
    }

    /**
     * Return <code>byAttr</code> property in DSL way
     *
     * @return byAttr
     */
    public AnyURISimpleType byAttr() {
        return getByAttr();
    }

    /**
     * Set <code>byAttr</code> property
     *
     * @param byAttr the new value
     */
    public void setByAttr(final AnyURISimpleType byAttr) {
        this.byAttr = byAttr;
        getElement().setAttribute("by", byAttr.getValue());
    }

    /**
     * Set <code>byAttr</code> property in DSL way
     *
     * @param byAttr the new value
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
    }

    /**
     * Return <code>asAttr</code> property
     *
     * @return asAttr
     */
    public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
            asAttr = new AnyURISimpleType();
            asAttr.setValue(getElement().getAttribute("as"));
        }

        return asAttr;
    }

    /**
     * Return <code>asAttr</code> property in DSL way
     *
     * @return asAttr
     */
    public AnyURISimpleType asAttr() {
        return getAsAttr();
    }

    /**
     * Set <code>asAttr</code> property
     *
     * @param asAttr the new value
     */
    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
        getElement().setAttribute("as", asAttr.getValue());
    }

    /**
     * Set <code>asAttr</code> property in DSL way
     *
     * @param asAttr the new value
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
    }

    /**
     * Return <code>startTimeAttr</code> property
     *
     * @return startTimeAttr
     */
    public DateTimeSimpleType getStartTimeAttr() {
        if (startTimeAttr == null) {
            startTimeAttr = new DateTimeSimpleType();
            startTimeAttr.setValue(getElement().getAttribute("startTime"));
        }

        return startTimeAttr;
    }

    /**
     * Return <code>startTimeAttr</code> property in DSL way
     *
     * @return startTimeAttr
     */
    public DateTimeSimpleType startTimeAttr() {
        return getStartTimeAttr();
    }

    /**
     * Set <code>startTimeAttr</code> property
     *
     * @param startTimeAttr the new value
     */
    public void setStartTimeAttr(final DateTimeSimpleType startTimeAttr) {
        this.startTimeAttr = startTimeAttr;
        getElement().setAttribute("startTime", startTimeAttr.getValue());
    }

    /**
     * Set <code>startTimeAttr</code> property in DSL way
     *
     * @param startTimeAttr the new value
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType startTimeAttr(final DateTimeSimpleType startTimeAttr) {
        setStartTimeAttr(startTimeAttr);
        return this;
    }

    /**
     * Return <code>endTimeAttr</code> property
     *
     * @return endTimeAttr
     */
    public DateTimeSimpleType getEndTimeAttr() {
        if (endTimeAttr == null) {
            endTimeAttr = new DateTimeSimpleType();
            endTimeAttr.setValue(getElement().getAttribute("endTime"));
        }

        return endTimeAttr;
    }

    /**
     * Return <code>endTimeAttr</code> property in DSL way
     *
     * @return endTimeAttr
     */
    public DateTimeSimpleType endTimeAttr() {
        return getEndTimeAttr();
    }

    /**
     * Set <code>endTimeAttr</code> property
     *
     * @param endTimeAttr the new value
     */
    public void setEndTimeAttr(final DateTimeSimpleType endTimeAttr) {
        this.endTimeAttr = endTimeAttr;
        getElement().setAttribute("endTime", endTimeAttr.getValue());
    }

    /**
     * Set <code>endTimeAttr</code> property in DSL way
     *
     * @param endTimeAttr the new value
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType endTimeAttr(final DateTimeSimpleType endTimeAttr) {
        setEndTimeAttr(endTimeAttr);
        return this;
    }

    /**
     * Return <code>toAttr</code> property
     *
     * @return toAttr
     */
    public AnyURISimpleType getToAttr() {
        if (toAttr == null) {
            toAttr = new AnyURISimpleType();
            toAttr.setValue(getElement().getAttribute("to"));
        }

        return toAttr;
    }

    /**
     * Return <code>toAttr</code> property in DSL way
     *
     * @return toAttr
     */
    public AnyURISimpleType toAttr() {
        return getToAttr();
    }

    /**
     * Set <code>toAttr</code> property
     *
     * @param toAttr the new value
     */
    public void setToAttr(final AnyURISimpleType toAttr) {
        this.toAttr = toAttr;
        getElement().setAttribute("to", toAttr.getValue());
    }

    /**
     * Set <code>toAttr</code> property in DSL way
     *
     * @param toAttr the new value
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType toAttr(final AnyURISimpleType toAttr) {
        setToAttr(toAttr);
        return this;
    }

    /**
     * Add <code>From</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public From getFrom() {
        From result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("From".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (From) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>fromElem</code> property in DSL way
     *
     * @param fromElem new value
     * @return <code>From</code> instance
     */
    public From setFrom(From fromElem) {
        From result = getFrom();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(fromElem);

        return fromElem;
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType classAttr(final StringSimpleType classAttr) {
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType styleAttr(final StringSimpleType styleAttr) {
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType titleAttr(final StringSimpleType titleAttr) {
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType idAttr(final IDSimpleType idAttr) {
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
     * @return <code>SpeechTypeComplexType</code> instance
     */
    public SpeechTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
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
        attrs.put("by", getByAttr() != null ? getByAttr().getValue() : null);
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("startTime", getStartTimeAttr() != null ? getStartTimeAttr().getValue() : null);
        attrs.put("endTime", getEndTimeAttr() != null ? getEndTimeAttr().getValue() : null);
        attrs.put("to", getToAttr() != null ? getToAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
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
    public SpeechTypeComplexType html(String s) {
        super.html(s);
        return this;
    }
}

