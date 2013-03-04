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
 * the element ref is an inline element containing a legal references (i.e. a reference to a document with legal status and for which an Akoma Ntoso URI exists)
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Ref extends InlinereqComplexType {
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
        span.setAttribute("type", "ref");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget ref");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Ref</code> object and set up its type
     */
    public Ref() {
        super(create());
        setType("ref");
    }

    /**
     * Constructor with required attributes
     */
    public Ref(AnyURISimpleType hrefAttr, IDSimpleType idAttr) {
        this();
        setHrefAttr(hrefAttr);
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>Ref</code> object with the given DOM element
     */
    public Ref(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType hrefAttr;

    /**
     * Return <code>hrefAttr</code> property
     *
     * @return hrefAttr
     */
    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(getElement().getAttribute("href"));
        }

        return hrefAttr;
    }

    /**
     * Return <code>hrefAttr</code> property in DSL way
     *
     * @return hrefAttr
     */
    public AnyURISimpleType hrefAttr() {
        return getHrefAttr();
    }

    /**
     * Set <code>hrefAttr</code> property
     *
     * @param hrefAttr the new value
     */
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
        getElement().setAttribute("href", hrefAttr.getValue());
    }

    /**
     * Set <code>hrefAttr</code> property in DSL way
     *
     * @param hrefAttr the new value
     * @return <code>Ref</code> instance
     */
    public Ref hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> Ref</code> instance
     */
    public Ref periodAttr(final AnyURISimpleType periodAttr) {
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
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public Ref html(String s) {
        super.html(s);
        return this;
    }
}

