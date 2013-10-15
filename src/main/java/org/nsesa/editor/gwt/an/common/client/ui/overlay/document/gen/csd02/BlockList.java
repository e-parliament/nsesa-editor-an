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
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class BlockList extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(0, 1, new ListIntroduction())
                    , new StructureIndicator.DefaultElement(1, -1, new Item())
                    , new StructureIndicator.DefaultElement(0, 1, new ListConclusion())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "blockList");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget blockList");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>BlockList</code> object and set up its type
     */
    public BlockList() {
        super(create());
        setType("blockList");
    }

    /**
     * Constructor with required attributes
     */
    public BlockList(IDSimpleType idAttr) {
        this();
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>BlockList</code> object with the given DOM element
     */
    public BlockList(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType alternativeToAttr;
    private StringSimpleType classAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private IDSimpleType idAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType periodAttr;
    private AnyURISimpleType refersToAttr;
    private NCNameSimpleType spaceAttr;
    private StatusTypeSimpleType statusAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private String wildcardContentAttr;

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
     * @return <code>BlockList</code> instance
     */
    public BlockList alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
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
     * @return <code>BlockList</code> instance
     */
    public BlockList classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
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
     * @return <code>BlockList</code> instance
     */
    public BlockList evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
     * @return <code>BlockList</code> instance
     */
    public BlockList idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Return <code>java.util.List<Item></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Item> getItems() {
        java.util.List<Item> result = new ArrayList<Item>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Item".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Item) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Item></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Item> getItemList() {
        return getItems();
    }

    /**
     * Add <code>java.util.List<Item></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Item addItem(Item itemElem) {
        this.addOverlayWidget(itemElem);
        return itemElem;
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
     * @return <code>BlockList</code> instance
     */
    public BlockList langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Add <code>ListConclusion</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public ListConclusion getListConclusion() {
        ListConclusion result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ListConclusion".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (ListConclusion) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>listConclusionElem</code> property in DSL way
     *
     * @param listConclusionElem new value
     * @return <code>ListConclusion</code> instance
     */
    public ListConclusion setListConclusion(ListConclusion listConclusionElem) {
        ListConclusion result = getListConclusion();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(listConclusionElem);

        return listConclusionElem;
    }

    /**
     * Add <code>ListIntroduction</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public ListIntroduction getListIntroduction() {
        ListIntroduction result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ListIntroduction".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (ListIntroduction) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>listIntroductionElem</code> property in DSL way
     *
     * @param listIntroductionElem new value
     * @return <code>ListIntroduction</code> instance
     */
    public ListIntroduction setListIntroduction(ListIntroduction listIntroductionElem) {
        ListIntroduction result = getListIntroduction();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(listIntroductionElem);

        return listIntroductionElem;
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
     * @return <code>BlockList</code> instance
     */
    public BlockList periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
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
     * @return <code>BlockList</code> instance
     */
    public BlockList refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
     * @return <code>BlockList</code> instance
     */
    public BlockList spaceAttr(final NCNameSimpleType spaceAttr) {
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
     * @return <code>BlockList</code> instance
     */
    public BlockList statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
     * @return <code>BlockList</code> instance
     */
    public BlockList styleAttr(final StringSimpleType styleAttr) {
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
     * @return <code>BlockList</code> instance
     */
    public BlockList titleAttr(final StringSimpleType titleAttr) {
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
     * @return <code>BlockList</code> instance
     */
    public BlockList wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
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
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("space", getSpaceAttr() != null ? getSpaceAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
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
    public BlockList html(String s) {
        super.html(s);
        return this;
    }
}

