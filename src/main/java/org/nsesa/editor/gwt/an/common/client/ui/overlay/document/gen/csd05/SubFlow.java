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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * Generated class
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class SubFlow extends SubFlowStructureComplexType {

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
        span.setAttribute("type", "subFlow");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget subFlow");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>SubFlow</code> object and set up its type
     */
    public SubFlow() {
        super(create());
        setType("subFlow");
    }

    /**
     * Constructor with required attributes
     */
    public SubFlow(IDSimpleType idAttr) {
        this();
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>SubFlow</code> object with the given DOM element
     */
    public SubFlow(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow langAttr(final StringSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>spaceAttr</code> property in DSL way
     *
     * @param spaceAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow spaceAttr(final StringSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> SubFlow</code> instance
     */
    public SubFlow wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

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
    public SubFlow html(String s) {
        super.html(s);
        return this;
    }
}

