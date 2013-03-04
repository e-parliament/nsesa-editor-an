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

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * the element vote is an inline that wraps either the name of the voter (when organized by choice) or the vote (when organized by name) in a voting report.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Vote extends InlineComplexType {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
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


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "vote");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget vote");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Vote</code> object and set up its type
     */
    public Vote() {
        super(create());
        setType("vote");
    }

    /**
     * Constructor with required attributes
     */
    public Vote(AnyURISimpleType byAttr) {
        this();
        setByAttr(byAttr);
    }


    /**
     * Create a <code>Vote</code> object with the given DOM element
     */
    public Vote(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType byAttr;
    private AnyURISimpleType asAttr;
    private AnyURISimpleType choiceAttr;

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
     * @return <code>Vote</code> instance
     */
    public Vote byAttr(final AnyURISimpleType byAttr) {
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
     * @return <code>Vote</code> instance
     */
    public Vote asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
    }

    /**
     * Return <code>choiceAttr</code> property
     *
     * @return choiceAttr
     */
    public AnyURISimpleType getChoiceAttr() {
        if (choiceAttr == null) {
            choiceAttr = new AnyURISimpleType();
            choiceAttr.setValue(getElement().getAttribute("choice"));
        }

        return choiceAttr;
    }

    /**
     * Return <code>choiceAttr</code> property in DSL way
     *
     * @return choiceAttr
     */
    public AnyURISimpleType choiceAttr() {
        return getChoiceAttr();
    }

    /**
     * Set <code>choiceAttr</code> property
     *
     * @param choiceAttr the new value
     */
    public void setChoiceAttr(final AnyURISimpleType choiceAttr) {
        this.choiceAttr = choiceAttr;
        getElement().setAttribute("choice", choiceAttr.getValue());
    }

    /**
     * Set <code>choiceAttr</code> property in DSL way
     *
     * @param choiceAttr the new value
     * @return <code>Vote</code> instance
     */
    public Vote choiceAttr(final AnyURISimpleType choiceAttr) {
        setChoiceAttr(choiceAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> Vote</code> instance
     */
    public Vote periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
    }

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
        attrs.put("choice", getChoiceAttr() != null ? getChoiceAttr().getValue() : null);
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public Vote html(String s) {
        super.html(s);
        return this;
    }
}

