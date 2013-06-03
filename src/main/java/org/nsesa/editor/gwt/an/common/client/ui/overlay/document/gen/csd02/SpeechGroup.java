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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * the element speechGroup is a container of speech elements. This element is meant to pooint out, in a complex sequence of individual speech elements, the main contributor, i.e., the individual speech who was introducedand expected and that is causing the complex sequence that follows. Attributes by, as and to are those of the main speech.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class SpeechGroup extends AlthierarchyComplexType {

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
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new BlockList())
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
        span.setAttribute("type", "speechGroup");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget speechGroup");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>SpeechGroup</code> object and set up its type
     */
    public SpeechGroup() {
        super(create());
        setType("speechGroup");
    }

    /**
     * Constructor with required attributes
     */
    public SpeechGroup(AnyURISimpleType byAttr, IDSimpleType idAttr) {
        this();
        setByAttr(byAttr);
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>SpeechGroup</code> object with the given DOM element
     */
    public SpeechGroup(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType byAttr;
    private AnyURISimpleType asAttr;
    private DateTimeSimpleType startTimeAttr;
    private DateTimeSimpleType endTimeAttr;
    private AnyURISimpleType toAttr;

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
     * @return <code>SpeechGroup</code> instance
     */
    public SpeechGroup byAttr(final AnyURISimpleType byAttr) {
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
     * @return <code>SpeechGroup</code> instance
     */
    public SpeechGroup asAttr(final AnyURISimpleType asAttr) {
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
     * @return <code>SpeechGroup</code> instance
     */
    public SpeechGroup startTimeAttr(final DateTimeSimpleType startTimeAttr) {
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
     * @return <code>SpeechGroup</code> instance
     */
    public SpeechGroup endTimeAttr(final DateTimeSimpleType endTimeAttr) {
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
     * @return <code>SpeechGroup</code> instance
     */
    public SpeechGroup toAttr(final AnyURISimpleType toAttr) {
        setToAttr(toAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>spaceAttr</code> property in DSL way
     *
     * @param spaceAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> SpeechGroup</code> instance
     */
    public SpeechGroup periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

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
        attrs.put("by", getByAttr() != null ? getByAttr().getValue() : null);
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("startTime", getStartTimeAttr() != null ? getStartTimeAttr().getValue() : null);
        attrs.put("endTime", getEndTimeAttr() != null ? getEndTimeAttr().getValue() : null);
        attrs.put("to", getToAttr() != null ? getToAttr().getValue() : null);
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
    public SpeechGroup html(String s) {
        super.html(s);
        return this;
    }
}

