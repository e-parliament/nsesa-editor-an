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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * the complex type modType specifies the content that is allowed within mod, mmod and rmod elements,<br/> i.e. it adds quotedText and quotedStructure to the normal list of inline elements
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class ModTypeComplexType extends OverlayWidgetImpl {

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
                    , new StructureIndicator.DefaultElement(1, 1, new QuotedText())
                    , new StructureIndicator.DefaultElement(1, 1, new QuotedStructure())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "modTypeComplexType");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget modTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>ModTypeComplexType</code> object with the given DOM element
     */
    public ModTypeComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType refersToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private LanguageSimpleType langAttr;
    private NCNameSimpleType spaceAttr;
    private StatusTypeSimpleType statusAttr;
    private AnyURISimpleType alternativeToAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType periodAttr;

    /**
     * Return <code>java.util.List<QuotedText></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<QuotedText> getQuotedTexts() {
        java.util.List<QuotedText> result = new ArrayList<QuotedText>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("QuotedText".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((QuotedText) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<QuotedText></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<QuotedText> getQuotedTextList() {
        return getQuotedTexts();
    }

    /**
     * Add <code>java.util.List<QuotedText></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public QuotedText addQuotedText(QuotedText quotedTextElem) {
        this.addOverlayWidget(quotedTextElem);
        return quotedTextElem;
    }

    /**
     * Return <code>java.util.List<QuotedStructure></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<QuotedStructure> getQuotedStructures() {
        java.util.List<QuotedStructure> result = new ArrayList<QuotedStructure>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("QuotedStructure".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((QuotedStructure) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<QuotedStructure></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<QuotedStructure> getQuotedStructureList() {
        return getQuotedStructures();
    }

    /**
     * Add <code>java.util.List<QuotedStructure></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public QuotedStructure addQuotedStructure(QuotedStructure quotedStructureElem) {
        this.addOverlayWidget(quotedStructureElem);
        return quotedStructureElem;
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType idAttr(final IDSimpleType idAttr) {
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType classAttr(final StringSimpleType classAttr) {
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType styleAttr(final StringSimpleType styleAttr) {
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType langAttr(final LanguageSimpleType langAttr) {
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
     * @return <code>ModTypeComplexType</code> instance
     */
    public ModTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Return <code>java.util.List<Inline></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Inline> getInlines() {
        java.util.List<Inline> result = new ArrayList<Inline>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Inline".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Inline) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Inline></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Inline> getInlineList() {
        return getInlines();
    }

    /**
     * Add <code>java.util.List<Inline></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Inline addInline(Inline inlineElem) {
        this.addOverlayWidget(inlineElem);
        return inlineElem;
    }

    /**
     * Return <code>java.util.List<Marker></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Marker> getMarkers() {
        java.util.List<Marker> result = new ArrayList<Marker>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Marker".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Marker) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Marker></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Marker> getMarkerList() {
        return getMarkers();
    }

    /**
     * Add <code>java.util.List<Marker></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Marker addMarker(Marker markerElem) {
        this.addOverlayWidget(markerElem);
        return markerElem;
    }

    /**
     * Return <code>java.util.List<Popup></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Popup> getPopups() {
        java.util.List<Popup> result = new ArrayList<Popup>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Popup".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Popup) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Popup></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Popup> getPopupList() {
        return getPopups();
    }

    /**
     * Add <code>java.util.List<Popup></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Popup addPopup(Popup popupElem) {
        this.addOverlayWidget(popupElem);
        return popupElem;
    }

    /**
     * Return <code>java.util.List<Ref></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Ref> getRefs() {
        java.util.List<Ref> result = new ArrayList<Ref>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Ref".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Ref) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Ref></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Ref> getRefList() {
        return getRefs();
    }

    /**
     * Add <code>java.util.List<Ref></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Ref addRef(Ref refElem) {
        this.addOverlayWidget(refElem);
        return refElem;
    }

    /**
     * Return <code>java.util.List<Mref></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Mref> getMrefs() {
        java.util.List<Mref> result = new ArrayList<Mref>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Mref".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Mref) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Mref></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Mref> getMrefList() {
        return getMrefs();
    }

    /**
     * Add <code>java.util.List<Mref></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Mref addMref(Mref mrefElem) {
        this.addOverlayWidget(mrefElem);
        return mrefElem;
    }

    /**
     * Return <code>java.util.List<Rref></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Rref> getRrefs() {
        java.util.List<Rref> result = new ArrayList<Rref>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Rref".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Rref) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Rref></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Rref> getRrefList() {
        return getRrefs();
    }

    /**
     * Add <code>java.util.List<Rref></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Rref addRref(Rref rrefElem) {
        this.addOverlayWidget(rrefElem);
        return rrefElem;
    }

    /**
     * Return <code>java.util.List<Mod></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Mod> getMods() {
        java.util.List<Mod> result = new ArrayList<Mod>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Mod".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Mod) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Mod></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Mod> getModList() {
        return getMods();
    }

    /**
     * Add <code>java.util.List<Mod></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Mod addMod(Mod modElem) {
        this.addOverlayWidget(modElem);
        return modElem;
    }

    /**
     * Return <code>java.util.List<Mmod></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Mmod> getMmods() {
        java.util.List<Mmod> result = new ArrayList<Mmod>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Mmod".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Mmod) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Mmod></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Mmod> getMmodList() {
        return getMmods();
    }

    /**
     * Add <code>java.util.List<Mmod></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Mmod addMmod(Mmod mmodElem) {
        this.addOverlayWidget(mmodElem);
        return mmodElem;
    }

    /**
     * Return <code>java.util.List<Rmod></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Rmod> getRmods() {
        java.util.List<Rmod> result = new ArrayList<Rmod>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Rmod".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Rmod) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Rmod></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Rmod> getRmodList() {
        return getRmods();
    }

    /**
     * Add <code>java.util.List<Rmod></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Rmod addRmod(Rmod rmodElem) {
        this.addOverlayWidget(rmodElem);
        return rmodElem;
    }

    /**
     * Return <code>java.util.List<Remark></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Remark> getRemarks() {
        java.util.List<Remark> result = new ArrayList<Remark>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Remark".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Remark) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Remark></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Remark> getRemarkList() {
        return getRemarks();
    }

    /**
     * Add <code>java.util.List<Remark></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Remark addRemark(Remark remarkElem) {
        this.addOverlayWidget(remarkElem);
        return remarkElem;
    }

    /**
     * Return <code>java.util.List<RecordedTime></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<RecordedTime> getRecordedTimes() {
        java.util.List<RecordedTime> result = new ArrayList<RecordedTime>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("RecordedTime".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((RecordedTime) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<RecordedTime></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<RecordedTime> getRecordedTimeList() {
        return getRecordedTimes();
    }

    /**
     * Add <code>java.util.List<RecordedTime></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public RecordedTime addRecordedTime(RecordedTime recordedTimeElem) {
        this.addOverlayWidget(recordedTimeElem);
        return recordedTimeElem;
    }

    /**
     * Return <code>java.util.List<Vote></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Vote> getVotes() {
        java.util.List<Vote> result = new ArrayList<Vote>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Vote".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Vote) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Vote></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Vote> getVoteList() {
        return getVotes();
    }

    /**
     * Add <code>java.util.List<Vote></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Vote addVote(Vote voteElem) {
        this.addOverlayWidget(voteElem);
        return voteElem;
    }

    /**
     * Return <code>java.util.List<Outcome></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Outcome> getOutcomes() {
        java.util.List<Outcome> result = new ArrayList<Outcome>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Outcome".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Outcome) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Outcome></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Outcome> getOutcomeList() {
        return getOutcomes();
    }

    /**
     * Add <code>java.util.List<Outcome></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Outcome addOutcome(Outcome outcomeElem) {
        this.addOverlayWidget(outcomeElem);
        return outcomeElem;
    }

    /**
     * Return <code>java.util.List<Ins></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Ins> getInses() {
        java.util.List<Ins> result = new ArrayList<Ins>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Ins".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Ins) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Ins></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Ins> getInsList() {
        return getInses();
    }

    /**
     * Add <code>java.util.List<Ins></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Ins addIns(Ins insElem) {
        this.addOverlayWidget(insElem);
        return insElem;
    }

    /**
     * Return <code>java.util.List<Del></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Del> getDels() {
        java.util.List<Del> result = new ArrayList<Del>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Del".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Del) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Del></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Del> getDelList() {
        return getDels();
    }

    /**
     * Add <code>java.util.List<Del></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Del addDel(Del delElem) {
        this.addOverlayWidget(delElem);
        return delElem;
    }

    /**
     * Return <code>java.util.List<Omissis></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Omissis> getOmissises() {
        java.util.List<Omissis> result = new ArrayList<Omissis>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Omissis".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Omissis) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Omissis></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Omissis> getOmissisList() {
        return getOmissises();
    }

    /**
     * Add <code>java.util.List<Omissis></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Omissis addOmissis(Omissis omissisElem) {
        this.addOverlayWidget(omissisElem);
        return omissisElem;
    }

    /**
     * Return <code>java.util.List<ExtractText></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ExtractText> getExtractTexts() {
        java.util.List<ExtractText> result = new ArrayList<ExtractText>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ExtractText".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((ExtractText) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<ExtractText></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ExtractText> getExtractTextList() {
        return getExtractTexts();
    }

    /**
     * Add <code>java.util.List<ExtractText></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public ExtractText addExtractText(ExtractText extractTextElem) {
        this.addOverlayWidget(extractTextElem);
        return extractTextElem;
    }

    /**
     * Return <code>java.util.List<ExtractStructure></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ExtractStructure> getExtractStructures() {
        java.util.List<ExtractStructure> result = new ArrayList<ExtractStructure>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ExtractStructure".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((ExtractStructure) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<ExtractStructure></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ExtractStructure> getExtractStructureList() {
        return getExtractStructures();
    }

    /**
     * Add <code>java.util.List<ExtractStructure></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public ExtractStructure addExtractStructure(ExtractStructure extractStructureElem) {
        this.addOverlayWidget(extractStructureElem);
        return extractStructureElem;
    }

    /**
     * Return <code>java.util.List<Placeholder></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Placeholder> getPlaceholders() {
        java.util.List<Placeholder> result = new ArrayList<Placeholder>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Placeholder".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Placeholder) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Placeholder></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Placeholder> getPlaceholderList() {
        return getPlaceholders();
    }

    /**
     * Add <code>java.util.List<Placeholder></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Placeholder addPlaceholder(Placeholder placeholderElem) {
        this.addOverlayWidget(placeholderElem);
        return placeholderElem;
    }

    /**
     * Return <code>java.util.List<FillIn></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<FillIn> getFillIns() {
        java.util.List<FillIn> result = new ArrayList<FillIn>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FillIn".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((FillIn) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<FillIn></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<FillIn> getFillInList() {
        return getFillIns();
    }

    /**
     * Add <code>java.util.List<FillIn></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FillIn addFillIn(FillIn fillInElem) {
        this.addOverlayWidget(fillInElem);
        return fillInElem;
    }

    /**
     * Return <code>java.util.List<B></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<B> getBs() {
        java.util.List<B> result = new ArrayList<B>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("B".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((B) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<B></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<B> getBList() {
        return getBs();
    }

    /**
     * Add <code>java.util.List<B></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public B addB(B bElem) {
        this.addOverlayWidget(bElem);
        return bElem;
    }

    /**
     * Return <code>java.util.List<I></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<I> getIs() {
        java.util.List<I> result = new ArrayList<I>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("I".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((I) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<I></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<I> getIList() {
        return getIs();
    }

    /**
     * Add <code>java.util.List<I></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public I addI(I iElem) {
        this.addOverlayWidget(iElem);
        return iElem;
    }

    /**
     * Return <code>java.util.List<A></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<A> getAs() {
        java.util.List<A> result = new ArrayList<A>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("A".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((A) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<A></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<A> getAList() {
        return getAs();
    }

    /**
     * Add <code>java.util.List<A></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public A addA(A aElem) {
        this.addOverlayWidget(aElem);
        return aElem;
    }

    /**
     * Return <code>java.util.List<U></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<U> getUs() {
        java.util.List<U> result = new ArrayList<U>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("U".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((U) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<U></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<U> getUList() {
        return getUs();
    }

    /**
     * Add <code>java.util.List<U></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public U addU(U uElem) {
        this.addOverlayWidget(uElem);
        return uElem;
    }

    /**
     * Return <code>java.util.List<Sub></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Sub> getSubs() {
        java.util.List<Sub> result = new ArrayList<Sub>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Sub".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Sub) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Sub></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Sub> getSubList() {
        return getSubs();
    }

    /**
     * Add <code>java.util.List<Sub></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Sub addSub(Sub subElem) {
        this.addOverlayWidget(subElem);
        return subElem;
    }

    /**
     * Return <code>java.util.List<Sup></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Sup> getSups() {
        java.util.List<Sup> result = new ArrayList<Sup>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Sup".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Sup) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Sup></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Sup> getSupList() {
        return getSups();
    }

    /**
     * Add <code>java.util.List<Sup></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Sup addSup(Sup supElem) {
        this.addOverlayWidget(supElem);
        return supElem;
    }

    /**
     * Return <code>java.util.List<Abbr></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Abbr> getAbbrs() {
        java.util.List<Abbr> result = new ArrayList<Abbr>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Abbr".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Abbr) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Abbr></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Abbr> getAbbrList() {
        return getAbbrs();
    }

    /**
     * Add <code>java.util.List<Abbr></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Abbr addAbbr(Abbr abbrElem) {
        this.addOverlayWidget(abbrElem);
        return abbrElem;
    }

    /**
     * Return <code>java.util.List<Span></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Span> getSpans() {
        java.util.List<Span> result = new ArrayList<Span>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Span".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Span) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Span></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Span> getSpanList() {
        return getSpans();
    }

    /**
     * Add <code>java.util.List<Span></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Span addSpan(Span spanElem) {
        this.addOverlayWidget(spanElem);
        return spanElem;
    }

    /**
     * Return <code>java.util.List<DocType></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocType> getDocTypes() {
        java.util.List<DocType> result = new ArrayList<DocType>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocType".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocType) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocType></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocType> getDocTypeList() {
        return getDocTypes();
    }

    /**
     * Add <code>java.util.List<DocType></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocType addDocType(DocType docTypeElem) {
        this.addOverlayWidget(docTypeElem);
        return docTypeElem;
    }

    /**
     * Return <code>java.util.List<DocTitle></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocTitle> getDocTitles() {
        java.util.List<DocTitle> result = new ArrayList<DocTitle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocTitle".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocTitle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocTitle></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocTitle> getDocTitleList() {
        return getDocTitles();
    }

    /**
     * Add <code>java.util.List<DocTitle></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocTitle addDocTitle(DocTitle docTitleElem) {
        this.addOverlayWidget(docTitleElem);
        return docTitleElem;
    }

    /**
     * Return <code>java.util.List<DocNumber></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocNumber> getDocNumbers() {
        java.util.List<DocNumber> result = new ArrayList<DocNumber>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocNumber".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocNumber) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocNumber></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocNumber> getDocNumberList() {
        return getDocNumbers();
    }

    /**
     * Add <code>java.util.List<DocNumber></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocNumber addDocNumber(DocNumber docNumberElem) {
        this.addOverlayWidget(docNumberElem);
        return docNumberElem;
    }

    /**
     * Return <code>java.util.List<DocProponent></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocProponent> getDocProponents() {
        java.util.List<DocProponent> result = new ArrayList<DocProponent>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocProponent".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocProponent) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocProponent></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocProponent> getDocProponentList() {
        return getDocProponents();
    }

    /**
     * Add <code>java.util.List<DocProponent></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocProponent addDocProponent(DocProponent docProponentElem) {
        this.addOverlayWidget(docProponentElem);
        return docProponentElem;
    }

    /**
     * Return <code>java.util.List<DocDate></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocDate> getDocDates() {
        java.util.List<DocDate> result = new ArrayList<DocDate>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocDate".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocDate) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocDate></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocDate> getDocDateList() {
        return getDocDates();
    }

    /**
     * Add <code>java.util.List<DocDate></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocDate addDocDate(DocDate docDateElem) {
        this.addOverlayWidget(docDateElem);
        return docDateElem;
    }

    /**
     * Return <code>java.util.List<Legislature></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Legislature> getLegislatures() {
        java.util.List<Legislature> result = new ArrayList<Legislature>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Legislature".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Legislature) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Legislature></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Legislature> getLegislatureList() {
        return getLegislatures();
    }

    /**
     * Add <code>java.util.List<Legislature></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Legislature addLegislature(Legislature legislatureElem) {
        this.addOverlayWidget(legislatureElem);
        return legislatureElem;
    }

    /**
     * Return <code>java.util.List<Session></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Session> getSessions() {
        java.util.List<Session> result = new ArrayList<Session>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Session".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Session) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Session></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Session> getSessionList() {
        return getSessions();
    }

    /**
     * Add <code>java.util.List<Session></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Session addSession(Session sessionElem) {
        this.addOverlayWidget(sessionElem);
        return sessionElem;
    }

    /**
     * Return <code>java.util.List<ShortTitle></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ShortTitle> getShortTitles() {
        java.util.List<ShortTitle> result = new ArrayList<ShortTitle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ShortTitle".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((ShortTitle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<ShortTitle></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ShortTitle> getShortTitleList() {
        return getShortTitles();
    }

    /**
     * Add <code>java.util.List<ShortTitle></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public ShortTitle addShortTitle(ShortTitle shortTitleElem) {
        this.addOverlayWidget(shortTitleElem);
        return shortTitleElem;
    }

    /**
     * Return <code>java.util.List<DocPurpose></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocPurpose> getDocPurposes() {
        java.util.List<DocPurpose> result = new ArrayList<DocPurpose>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocPurpose".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocPurpose) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocPurpose></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocPurpose> getDocPurposeList() {
        return getDocPurposes();
    }

    /**
     * Add <code>java.util.List<DocPurpose></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocPurpose addDocPurpose(DocPurpose docPurposeElem) {
        this.addOverlayWidget(docPurposeElem);
        return docPurposeElem;
    }

    /**
     * Return <code>java.util.List<DocCommittee></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocCommittee> getDocCommittees() {
        java.util.List<DocCommittee> result = new ArrayList<DocCommittee>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocCommittee".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocCommittee) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocCommittee></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocCommittee> getDocCommitteeList() {
        return getDocCommittees();
    }

    /**
     * Add <code>java.util.List<DocCommittee></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocCommittee addDocCommittee(DocCommittee docCommitteeElem) {
        this.addOverlayWidget(docCommitteeElem);
        return docCommitteeElem;
    }

    /**
     * Return <code>java.util.List<DocIntroducer></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocIntroducer> getDocIntroducers() {
        java.util.List<DocIntroducer> result = new ArrayList<DocIntroducer>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocIntroducer".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocIntroducer) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocIntroducer></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocIntroducer> getDocIntroducerList() {
        return getDocIntroducers();
    }

    /**
     * Add <code>java.util.List<DocIntroducer></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocIntroducer addDocIntroducer(DocIntroducer docIntroducerElem) {
        this.addOverlayWidget(docIntroducerElem);
        return docIntroducerElem;
    }

    /**
     * Return <code>java.util.List<DocStage></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocStage> getDocStages() {
        java.util.List<DocStage> result = new ArrayList<DocStage>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocStage".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocStage) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocStage></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocStage> getDocStageList() {
        return getDocStages();
    }

    /**
     * Add <code>java.util.List<DocStage></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocStage addDocStage(DocStage docStageElem) {
        this.addOverlayWidget(docStageElem);
        return docStageElem;
    }

    /**
     * Return <code>java.util.List<DocStatus></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocStatus> getDocStatuses() {
        java.util.List<DocStatus> result = new ArrayList<DocStatus>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocStatus".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocStatus) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocStatus></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocStatus> getDocStatusList() {
        return getDocStatuses();
    }

    /**
     * Add <code>java.util.List<DocStatus></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocStatus addDocStatus(DocStatus docStatusElem) {
        this.addOverlayWidget(docStatusElem);
        return docStatusElem;
    }

    /**
     * Return <code>java.util.List<DocJurisdiction></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocJurisdiction> getDocJurisdictions() {
        java.util.List<DocJurisdiction> result = new ArrayList<DocJurisdiction>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocJurisdiction".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocJurisdiction) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocJurisdiction></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocJurisdiction> getDocJurisdictionList() {
        return getDocJurisdictions();
    }

    /**
     * Add <code>java.util.List<DocJurisdiction></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocJurisdiction addDocJurisdiction(DocJurisdiction docJurisdictionElem) {
        this.addOverlayWidget(docJurisdictionElem);
        return docJurisdictionElem;
    }

    /**
     * Return <code>java.util.List<DocketNumber></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocketNumber> getDocketNumbers() {
        java.util.List<DocketNumber> result = new ArrayList<DocketNumber>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DocketNumber".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((DocketNumber) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<DocketNumber></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<DocketNumber> getDocketNumberList() {
        return getDocketNumbers();
    }

    /**
     * Add <code>java.util.List<DocketNumber></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public DocketNumber addDocketNumber(DocketNumber docketNumberElem) {
        this.addOverlayWidget(docketNumberElem);
        return docketNumberElem;
    }

    /**
     * Return <code>java.util.List<Date></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Date> getDates() {
        java.util.List<Date> result = new ArrayList<Date>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Date".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Date) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Date></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Date> getDateList() {
        return getDates();
    }

    /**
     * Add <code>java.util.List<Date></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Date addDate(Date dateElem) {
        this.addOverlayWidget(dateElem);
        return dateElem;
    }

    /**
     * Return <code>java.util.List<Time></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Time> getTimes() {
        java.util.List<Time> result = new ArrayList<Time>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Time".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Time) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Time></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Time> getTimeList() {
        return getTimes();
    }

    /**
     * Add <code>java.util.List<Time></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Time addTime(Time timeElem) {
        this.addOverlayWidget(timeElem);
        return timeElem;
    }

    /**
     * Return <code>java.util.List<Person></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Person> getPersons() {
        java.util.List<Person> result = new ArrayList<Person>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Person".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Person) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Person></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Person> getPersonList() {
        return getPersons();
    }

    /**
     * Add <code>java.util.List<Person></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Person addPerson(Person personElem) {
        this.addOverlayWidget(personElem);
        return personElem;
    }

    /**
     * Return <code>java.util.List<Organization></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Organization> getOrganizations() {
        java.util.List<Organization> result = new ArrayList<Organization>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Organization".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Organization) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Organization></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Organization> getOrganizationList() {
        return getOrganizations();
    }

    /**
     * Add <code>java.util.List<Organization></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Organization addOrganization(Organization organizationElem) {
        this.addOverlayWidget(organizationElem);
        return organizationElem;
    }

    /**
     * Return <code>java.util.List<Concept></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Concept> getConcepts() {
        java.util.List<Concept> result = new ArrayList<Concept>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Concept".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Concept) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Concept></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Concept> getConceptList() {
        return getConcepts();
    }

    /**
     * Add <code>java.util.List<Concept></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Concept addConcept(Concept conceptElem) {
        this.addOverlayWidget(conceptElem);
        return conceptElem;
    }

    /**
     * Return <code>java.util.List<Object></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Object> getObjects() {
        java.util.List<Object> result = new ArrayList<Object>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Object".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Object) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Object></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Object> getObjectList() {
        return getObjects();
    }

    /**
     * Add <code>java.util.List<Object></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Object addObject(Object objectElem) {
        this.addOverlayWidget(objectElem);
        return objectElem;
    }

    /**
     * Return <code>java.util.List<Event></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Event> getEvents() {
        java.util.List<Event> result = new ArrayList<Event>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Event".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Event) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Event></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Event> getEventList() {
        return getEvents();
    }

    /**
     * Add <code>java.util.List<Event></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Event addEvent(Event eventElem) {
        this.addOverlayWidget(eventElem);
        return eventElem;
    }

    /**
     * Return <code>java.util.List<Location></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Location> getLocations() {
        java.util.List<Location> result = new ArrayList<Location>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Location".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Location) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Location></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Location> getLocationList() {
        return getLocations();
    }

    /**
     * Add <code>java.util.List<Location></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Location addLocation(Location locationElem) {
        this.addOverlayWidget(locationElem);
        return locationElem;
    }

    /**
     * Return <code>java.util.List<Process></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Process> getProcesses() {
        java.util.List<Process> result = new ArrayList<Process>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Process".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Process) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Process></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Process> getProcessList() {
        return getProcesses();
    }

    /**
     * Add <code>java.util.List<Process></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Process addProcess(Process processElem) {
        this.addOverlayWidget(processElem);
        return processElem;
    }

    /**
     * Return <code>java.util.List<Role></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Role> getRoles() {
        java.util.List<Role> result = new ArrayList<Role>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Role".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Role) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Role></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Role> getRoleList() {
        return getRoles();
    }

    /**
     * Add <code>java.util.List<Role></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Role addRole(Role roleElem) {
        this.addOverlayWidget(roleElem);
        return roleElem;
    }

    /**
     * Return <code>java.util.List<Term></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Term> getTerms() {
        java.util.List<Term> result = new ArrayList<Term>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Term".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Term) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Term></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Term> getTermList() {
        return getTerms();
    }

    /**
     * Add <code>java.util.List<Term></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Term addTerm(Term termElem) {
        this.addOverlayWidget(termElem);
        return termElem;
    }

    /**
     * Return <code>java.util.List<Quantity></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Quantity> getQuantities() {
        java.util.List<Quantity> result = new ArrayList<Quantity>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Quantity".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Quantity) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Quantity></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Quantity> getQuantityList() {
        return getQuantities();
    }

    /**
     * Add <code>java.util.List<Quantity></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Quantity addQuantity(Quantity quantityElem) {
        this.addOverlayWidget(quantityElem);
        return quantityElem;
    }

    /**
     * Return <code>java.util.List<Def></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Def> getDefs() {
        java.util.List<Def> result = new ArrayList<Def>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Def".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Def) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Def></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Def> getDefList() {
        return getDefs();
    }

    /**
     * Add <code>java.util.List<Def></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Def addDef(Def defElem) {
        this.addOverlayWidget(defElem);
        return defElem;
    }

    /**
     * Return <code>java.util.List<Entity></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Entity> getEntities() {
        java.util.List<Entity> result = new ArrayList<Entity>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Entity".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Entity) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Entity></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Entity> getEntityList() {
        return getEntities();
    }

    /**
     * Add <code>java.util.List<Entity></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Entity addEntity(Entity entityElem) {
        this.addOverlayWidget(entityElem);
        return entityElem;
    }

    /**
     * Return <code>java.util.List<CourtType></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<CourtType> getCourtTypes() {
        java.util.List<CourtType> result = new ArrayList<CourtType>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("CourtType".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((CourtType) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<CourtType></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<CourtType> getCourtTypeList() {
        return getCourtTypes();
    }

    /**
     * Add <code>java.util.List<CourtType></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public CourtType addCourtType(CourtType courtTypeElem) {
        this.addOverlayWidget(courtTypeElem);
        return courtTypeElem;
    }

    /**
     * Return <code>java.util.List<NeutralCitation></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<NeutralCitation> getNeutralCitations() {
        java.util.List<NeutralCitation> result = new ArrayList<NeutralCitation>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NeutralCitation".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((NeutralCitation) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<NeutralCitation></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<NeutralCitation> getNeutralCitationList() {
        return getNeutralCitations();
    }

    /**
     * Add <code>java.util.List<NeutralCitation></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public NeutralCitation addNeutralCitation(NeutralCitation neutralCitationElem) {
        this.addOverlayWidget(neutralCitationElem);
        return neutralCitationElem;
    }

    /**
     * Return <code>java.util.List<Party></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Party> getParties() {
        java.util.List<Party> result = new ArrayList<Party>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Party".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Party) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Party></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Party> getPartyList() {
        return getParties();
    }

    /**
     * Add <code>java.util.List<Party></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Party addParty(Party partyElem) {
        this.addOverlayWidget(partyElem);
        return partyElem;
    }

    /**
     * Return <code>java.util.List<Judge></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Judge> getJudges() {
        java.util.List<Judge> result = new ArrayList<Judge>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Judge".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Judge) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Judge></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Judge> getJudgeList() {
        return getJudges();
    }

    /**
     * Add <code>java.util.List<Judge></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Judge addJudge(Judge judgeElem) {
        this.addOverlayWidget(judgeElem);
        return judgeElem;
    }

    /**
     * Return <code>java.util.List<Lawyer></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Lawyer> getLawyers() {
        java.util.List<Lawyer> result = new ArrayList<Lawyer>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Lawyer".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Lawyer) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Lawyer></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Lawyer> getLawyerList() {
        return getLawyers();
    }

    /**
     * Add <code>java.util.List<Lawyer></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Lawyer addLawyer(Lawyer lawyerElem) {
        this.addOverlayWidget(lawyerElem);
        return lawyerElem;
    }

    /**
     * Return <code>java.util.List<Signature></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Signature> getSignatures() {
        java.util.List<Signature> result = new ArrayList<Signature>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Signature".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Signature) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Signature></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Signature> getSignatureList() {
        return getSignatures();
    }

    /**
     * Add <code>java.util.List<Signature></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Signature addSignature(Signature signatureElem) {
        this.addOverlayWidget(signatureElem);
        return signatureElem;
    }

    /**
     * Return <code>java.util.List<Opinion></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Opinion> getOpinions() {
        java.util.List<Opinion> result = new ArrayList<Opinion>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Opinion".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Opinion) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Opinion></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Opinion> getOpinionList() {
        return getOpinions();
    }

    /**
     * Add <code>java.util.List<Opinion></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Opinion addOpinion(Opinion opinionElem) {
        this.addOverlayWidget(opinionElem);
        return opinionElem;
    }

    /**
     * Return <code>java.util.List<AffectedDocument></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AffectedDocument> getAffectedDocuments() {
        java.util.List<AffectedDocument> result = new ArrayList<AffectedDocument>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AffectedDocument".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((AffectedDocument) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<AffectedDocument></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AffectedDocument> getAffectedDocumentList() {
        return getAffectedDocuments();
    }

    /**
     * Add <code>java.util.List<AffectedDocument></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public AffectedDocument addAffectedDocument(AffectedDocument affectedDocumentElem) {
        this.addOverlayWidget(affectedDocumentElem);
        return affectedDocumentElem;
    }

    /**
     * Return <code>java.util.List<RelatedDocument></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<RelatedDocument> getRelatedDocuments() {
        java.util.List<RelatedDocument> result = new ArrayList<RelatedDocument>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("RelatedDocument".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((RelatedDocument) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<RelatedDocument></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<RelatedDocument> getRelatedDocumentList() {
        return getRelatedDocuments();
    }

    /**
     * Add <code>java.util.List<RelatedDocument></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public RelatedDocument addRelatedDocument(RelatedDocument relatedDocumentElem) {
        this.addOverlayWidget(relatedDocumentElem);
        return relatedDocumentElem;
    }

    /**
     * Return <code>java.util.List<Change></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Change> getChanges() {
        java.util.List<Change> result = new ArrayList<Change>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Change".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Change) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Change></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Change> getChangeList() {
        return getChanges();
    }

    /**
     * Add <code>java.util.List<Change></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Change addChange(Change changeElem) {
        this.addOverlayWidget(changeElem);
        return changeElem;
    }

    /**
     * Return <code>java.util.List<NoteRef></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<NoteRef> getNoteRefs() {
        java.util.List<NoteRef> result = new ArrayList<NoteRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NoteRef".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((NoteRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<NoteRef></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<NoteRef> getNoteRefList() {
        return getNoteRefs();
    }

    /**
     * Add <code>java.util.List<NoteRef></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public NoteRef addNoteRef(NoteRef noteRefElem) {
        this.addOverlayWidget(noteRefElem);
        return noteRefElem;
    }

    /**
     * Return <code>java.util.List<Eol></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Eol> getEols() {
        java.util.List<Eol> result = new ArrayList<Eol>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Eol".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Eol) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Eol></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Eol> getEolList() {
        return getEols();
    }

    /**
     * Add <code>java.util.List<Eol></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Eol addEol(Eol eolElem) {
        this.addOverlayWidget(eolElem);
        return eolElem;
    }

    /**
     * Return <code>java.util.List<Eop></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Eop> getEops() {
        java.util.List<Eop> result = new ArrayList<Eop>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Eop".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Eop) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Eop></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Eop> getEopList() {
        return getEops();
    }

    /**
     * Add <code>java.util.List<Eop></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Eop addEop(Eop eopElem) {
        this.addOverlayWidget(eopElem);
        return eopElem;
    }

    /**
     * Return <code>java.util.List<Img></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Img> getImgs() {
        java.util.List<Img> result = new ArrayList<Img>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Img".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Img) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Img></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Img> getImgList() {
        return getImgs();
    }

    /**
     * Add <code>java.util.List<Img></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Img addImg(Img imgElem) {
        this.addOverlayWidget(imgElem);
        return imgElem;
    }

    /**
     * Return <code>java.util.List<Br></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Br> getBrs() {
        java.util.List<Br> result = new ArrayList<Br>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Br".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Br) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Br></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Br> getBrList() {
        return getBrs();
    }

    /**
     * Add <code>java.util.List<Br></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Br addBr(Br brElem) {
        this.addOverlayWidget(brElem);
        return brElem;
    }

    /**
     * Return <code>java.util.List<AuthorialNote></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AuthorialNote> getAuthorialNotes() {
        java.util.List<AuthorialNote> result = new ArrayList<AuthorialNote>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AuthorialNote".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((AuthorialNote) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<AuthorialNote></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AuthorialNote> getAuthorialNoteList() {
        return getAuthorialNotes();
    }

    /**
     * Add <code>java.util.List<AuthorialNote></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public AuthorialNote addAuthorialNote(AuthorialNote authorialNoteElem) {
        this.addOverlayWidget(authorialNoteElem);
        return authorialNoteElem;
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
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("space", getSpaceAttr() != null ? getSpaceAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
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
    public ModTypeComplexType html(String s) {
        super.html(s);
        return this;
    }
}

