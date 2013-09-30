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
 * the element docStatus is an inline element within preface to identify the string used by the<br/> document detailing the status of the document
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class DocStatus extends InlineComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultChoice(0, -1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Ref())
                    , new StructureIndicator.DefaultElement(1, 1, new Mref())
                    , new StructureIndicator.DefaultElement(1, 1, new Rref())
                    , new StructureIndicator.DefaultElement(1, 1, new Mod())
                    , new StructureIndicator.DefaultElement(1, 1, new Mmod())
                    , new StructureIndicator.DefaultElement(1, 1, new Rmod())
                    , new StructureIndicator.DefaultElement(1, 1, new Remark())
                    , new StructureIndicator.DefaultElement(1, 1, new RecordedTime())
                    , new StructureIndicator.DefaultElement(1, 1, new Vote())
                    , new StructureIndicator.DefaultElement(1, 1, new Outcome())
                    , new StructureIndicator.DefaultElement(1, 1, new Ins())
                    , new StructureIndicator.DefaultElement(1, 1, new Del())
                    , new StructureIndicator.DefaultElement(1, 1, new Omissis())
                    , new StructureIndicator.DefaultElement(1, 1, new ExtractText())
                    , new StructureIndicator.DefaultElement(1, 1, new ExtractStructure())
                    , new StructureIndicator.DefaultElement(1, 1, new Placeholder())
                    , new StructureIndicator.DefaultElement(1, 1, new FillIn())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new B())
                    , new StructureIndicator.DefaultElement(1, 1, new I())
                    , new StructureIndicator.DefaultElement(1, 1, new A())
                    , new StructureIndicator.DefaultElement(1, 1, new U())
                    , new StructureIndicator.DefaultElement(1, 1, new Sub())
                    , new StructureIndicator.DefaultElement(1, 1, new Sup())
                    , new StructureIndicator.DefaultElement(1, 1, new Abbr())
                    , new StructureIndicator.DefaultElement(1, 1, new Span())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new DocType())
                    , new StructureIndicator.DefaultElement(1, 1, new DocTitle())
                    , new StructureIndicator.DefaultElement(1, 1, new DocNumber())
                    , new StructureIndicator.DefaultElement(1, 1, new DocProponent())
                    , new StructureIndicator.DefaultElement(1, 1, new DocDate())
                    , new StructureIndicator.DefaultElement(1, 1, new Legislature())
                    , new StructureIndicator.DefaultElement(1, 1, new Session())
                    , new StructureIndicator.DefaultElement(1, 1, new ShortTitle())
                    , new StructureIndicator.DefaultElement(1, 1, new DocPurpose())
                    , new StructureIndicator.DefaultElement(1, 1, new DocCommittee())
                    , new StructureIndicator.DefaultElement(1, 1, new DocIntroducer())
                    , new StructureIndicator.DefaultElement(1, 1, new DocStage())
                    , new StructureIndicator.DefaultElement(1, 1, new DocStatus())
                    , new StructureIndicator.DefaultElement(1, 1, new DocJurisdiction())
                    , new StructureIndicator.DefaultElement(1, 1, new DocketNumber())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Date())
                    , new StructureIndicator.DefaultElement(1, 1, new Time())
                    , new StructureIndicator.DefaultElement(1, 1, new Person())
                    , new StructureIndicator.DefaultElement(1, 1, new Organization())
                    , new StructureIndicator.DefaultElement(1, 1, new Concept())
                    , new StructureIndicator.DefaultElement(1, 1, new Object())
                    , new StructureIndicator.DefaultElement(1, 1, new Event())
                    , new StructureIndicator.DefaultElement(1, 1, new Location())
                    , new StructureIndicator.DefaultElement(1, 1, new Process())
                    , new StructureIndicator.DefaultElement(1, 1, new Role())
                    , new StructureIndicator.DefaultElement(1, 1, new Term())
                    , new StructureIndicator.DefaultElement(1, 1, new Quantity())
                    , new StructureIndicator.DefaultElement(1, 1, new Def())
                    , new StructureIndicator.DefaultElement(1, 1, new Entity())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new CourtType())
                    , new StructureIndicator.DefaultElement(1, 1, new NeutralCitation())
                    , new StructureIndicator.DefaultElement(1, 1, new Party())
                    , new StructureIndicator.DefaultElement(1, 1, new Judge())
                    , new StructureIndicator.DefaultElement(1, 1, new Lawyer())
                    , new StructureIndicator.DefaultElement(1, 1, new Signature())
                    , new StructureIndicator.DefaultElement(1, 1, new Opinion())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new AffectedDocument())
                    , new StructureIndicator.DefaultElement(1, 1, new RelatedDocument())
                    , new StructureIndicator.DefaultElement(1, 1, new Change())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Inline())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new NoteRef())
                    , new StructureIndicator.DefaultElement(1, 1, new Eol())
                    , new StructureIndicator.DefaultElement(1, 1, new Eop())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Img())
                    , new StructureIndicator.DefaultElement(1, 1, new Br())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Marker())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new AuthorialNote())
            )
            )
                    , new StructureIndicator.DefaultElement(1, 1, new Popup())
            )
            )
            )
            )
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "docStatus");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget docStatus");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>DocStatus</code> object and set up its type
     */
    public DocStatus() {
        super(create());
        setType("docStatus");
    }


    /**
     * Create a <code>DocStatus</code> object with the given DOM element
     */
    public DocStatus(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>spaceAttr</code> property in DSL way
     *
     * @param spaceAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> DocStatus</code> instance
     */
    public DocStatus wildcardContentAttr(final String wildcardContentAttr) {
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
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
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
    public DocStatus html(String s) {
        super.html(s);
        return this;
    }
}

