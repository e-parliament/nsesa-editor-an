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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class PrefaceoptComplexType extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Foreign(), new Occurrence(0, -1));
            put(new Block(), new Occurrence(0, -1));
            put(new LongTitle(), new Occurrence(0, -1));
            put(new Formula(), new Occurrence(0, -1));
            put(new Container(), new Occurrence(0, -1));
            put(new BlockList(), new Occurrence(0, -1));
            put(new Toc(), new Occurrence(0, -1));
            put(new Tblock(), new Occurrence(0, -1));
            put(new Ul(), new Occurrence(0, -1));
            put(new Ol(), new Occurrence(0, -1));
            put(new Table(), new Occurrence(0, -1));
            put(new P(), new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "prefaceoptComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget prefaceoptComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public PrefaceoptComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType refersToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType alternativeToAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private StatusTypeSimpleType statusAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType periodAttr;

    public java.util.List<Foreign> getForeigns() {
        java.util.List<Foreign> result = new ArrayList<Foreign>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Foreign".equalsIgnoreCase(widget.getType())) {
                result.add((Foreign) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Foreign> getForeignList() {
        return getForeigns();
    }

    //DSL Style set value
    public Foreign addForeign(Foreign foreignElem) {
        this.addOverlayWidget(foreignElem);
        return foreignElem;
    }

    public java.util.List<Block> getBlocks() {
        java.util.List<Block> result = new ArrayList<Block>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Block".equalsIgnoreCase(widget.getType())) {
                result.add((Block) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Block> getBlockList() {
        return getBlocks();
    }

    //DSL Style set value
    public Block addBlock(Block blockElem) {
        this.addOverlayWidget(blockElem);
        return blockElem;
    }

    public java.util.List<LongTitle> getLongTitles() {
        java.util.List<LongTitle> result = new ArrayList<LongTitle>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("LongTitle".equalsIgnoreCase(widget.getType())) {
                result.add((LongTitle) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<LongTitle> getLongTitleList() {
        return getLongTitles();
    }

    //DSL Style set value
    public LongTitle addLongTitle(LongTitle longTitleElem) {
        this.addOverlayWidget(longTitleElem);
        return longTitleElem;
    }

    public java.util.List<Formula> getFormulas() {
        java.util.List<Formula> result = new ArrayList<Formula>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Formula".equalsIgnoreCase(widget.getType())) {
                result.add((Formula) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Formula> getFormulaList() {
        return getFormulas();
    }

    //DSL Style set value
    public Formula addFormula(Formula formulaElem) {
        this.addOverlayWidget(formulaElem);
        return formulaElem;
    }

    public java.util.List<Container> getContainers() {
        java.util.List<Container> result = new ArrayList<Container>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType())) {
                result.add((Container) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Container> getContainerList() {
        return getContainers();
    }

    //DSL Style set value
    public Container addContainer(Container containerElem) {
        this.addOverlayWidget(containerElem);
        return containerElem;
    }

    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo", refersToAttr.getValue());
    }

    //DSL Style set value
    public PrefaceoptComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
    }

    //DSL Style get value
    public IDSimpleType idAttr() {
        return getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        getElement().setAttribute("id", idAttr.getValue());
    }

    //DSL Style set value
    public PrefaceoptComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }

    //DSL Style get value
    public NMTOKENSimpleType evolvingIdAttr() {
        return getEvolvingIdAttr();
    }

    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        getElement().setAttribute("evolvingId", evolvingIdAttr.getValue());
    }

    //DSL Style set value
    public PrefaceoptComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(getElement().getAttribute("lang"));
        }

        return langAttr;
    }

    //DSL Style get value
    public LanguageSimpleType langAttr() {
        return getLangAttr();
    }

    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
        getElement().setAttribute("lang", langAttr.getValue());
    }

    //DSL Style set value
    public PrefaceoptComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(getElement().getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType alternativeToAttr() {
        return getAlternativeToAttr();
    }

    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
        getElement().setAttribute("alternativeTo", alternativeToAttr.getValue());
    }

    //DSL Style set value
    public PrefaceoptComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(getElement().getAttribute("class"));
        }

        return classAttr;
    }

    //DSL Style get value
    public StringSimpleType classAttr() {
        return getClassAttr();
    }

    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
        getElement().setAttribute("class", classAttr.getValue());
    }

    //DSL Style set value
    public PrefaceoptComplexType classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(getElement().getAttribute("style"));
        }

        return styleAttr;
    }

    //DSL Style get value
    public StringSimpleType styleAttr() {
        return getStyleAttr();
    }

    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
        getElement().setAttribute("style", styleAttr.getValue());
    }

    //DSL Style set value
    public PrefaceoptComplexType styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(getElement().getAttribute("title"));
        }

        return titleAttr;
    }

    //DSL Style get value
    public StringSimpleType titleAttr() {
        return getTitleAttr();
    }

    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
        getElement().setAttribute("title", titleAttr.getValue());
    }

    //DSL Style set value
    public PrefaceoptComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(getElement().getAttribute("status"));
        }

        return statusAttr;
    }

    //DSL Style get value
    public StatusTypeSimpleType statusAttr() {
        return getStatusAttr();
    }

    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
        getElement().setAttribute("status", statusAttr.value());
    }

    //DSL Style set value
    public PrefaceoptComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }

    //DSL Style get value
    public String wildcardContentAttr() {
        return getWildcardContentAttr();
    }

    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        getElement().setAttribute("wildcardContent", wildcardContentAttr);
    }

    //DSL Style set value
    public PrefaceoptComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    public java.util.List<BlockList> getBlockLists() {
        java.util.List<BlockList> result = new ArrayList<BlockList>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("BlockList".equalsIgnoreCase(widget.getType())) {
                result.add((BlockList) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<BlockList> getBlockListList() {
        return getBlockLists();
    }

    //DSL Style set value
    public BlockList addBlockList(BlockList blockListElem) {
        this.addOverlayWidget(blockListElem);
        return blockListElem;
    }

    public java.util.List<Toc> getTocs() {
        java.util.List<Toc> result = new ArrayList<Toc>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Toc".equalsIgnoreCase(widget.getType())) {
                result.add((Toc) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Toc> getTocList() {
        return getTocs();
    }

    //DSL Style set value
    public Toc addToc(Toc tocElem) {
        this.addOverlayWidget(tocElem);
        return tocElem;
    }

    public java.util.List<Tblock> getTblocks() {
        java.util.List<Tblock> result = new ArrayList<Tblock>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Tblock".equalsIgnoreCase(widget.getType())) {
                result.add((Tblock) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Tblock> getTblockList() {
        return getTblocks();
    }

    //DSL Style set value
    public Tblock addTblock(Tblock tblockElem) {
        this.addOverlayWidget(tblockElem);
        return tblockElem;
    }

    public java.util.List<Ul> getUls() {
        java.util.List<Ul> result = new ArrayList<Ul>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Ul".equalsIgnoreCase(widget.getType())) {
                result.add((Ul) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Ul> getUlList() {
        return getUls();
    }

    //DSL Style set value
    public Ul addUl(Ul ulElem) {
        this.addOverlayWidget(ulElem);
        return ulElem;
    }

    public java.util.List<Ol> getOls() {
        java.util.List<Ol> result = new ArrayList<Ol>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Ol".equalsIgnoreCase(widget.getType())) {
                result.add((Ol) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Ol> getOlList() {
        return getOls();
    }

    //DSL Style set value
    public Ol addOl(Ol olElem) {
        this.addOverlayWidget(olElem);
        return olElem;
    }

    public java.util.List<Table> getTables() {
        java.util.List<Table> result = new ArrayList<Table>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Table".equalsIgnoreCase(widget.getType())) {
                result.add((Table) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Table> getTableList() {
        return getTables();
    }

    //DSL Style set value
    public Table addTable(Table tableElem) {
        this.addOverlayWidget(tableElem);
        return tableElem;
    }

    public java.util.List<P> getPs() {
        java.util.List<P> result = new ArrayList<P>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("P".equalsIgnoreCase(widget.getType())) {
                result.add((P) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<P> getPList() {
        return getPs();
    }

    //DSL Style set value
    public P addP(P pElem) {
        this.addOverlayWidget(pElem);
        return pElem;
    }

    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(getElement().getAttribute("period"));
        }

        return periodAttr;
    }

    //DSL Style get value
    public AnyURISimpleType periodAttr() {
        return getPeriodAttr();
    }

    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
        getElement().setAttribute("period", periodAttr.getValue());
    }

    //DSL Style set value
    public PrefaceoptComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
    }

    /**
     * Returns the namespace URI of this amendable widget.
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }
}

