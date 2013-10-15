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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The element th is an HTML element and is used in Akoma Ntoso as in HTML, for a header cell of a table
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Th extends BlocksoptComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(0, -1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new BlockList())
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
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "th");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget th");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Th</code> object and set up its type
     */
    public Th() {
        super(create());
        setType("th");
    }


    /**
     * Create a <code>Th</code> object with the given DOM element
     */
    public Th(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private IntegerSimpleType colspanAttr;
    private IntegerSimpleType rowspanAttr;

    /**
     * Return <code>colspanAttr</code> property
     *
     * @return colspanAttr
     */
    public IntegerSimpleType getColspanAttr() {
        if (colspanAttr == null) {
            colspanAttr = new IntegerSimpleType();
            colspanAttr.setValue(getElement().getAttribute("colspan"));
        }

        return colspanAttr;
    }

    /**
     * Return <code>colspanAttr</code> property in DSL way
     *
     * @return colspanAttr
     */
    public IntegerSimpleType colspanAttr() {
        return getColspanAttr();
    }

    /**
     * Set <code>colspanAttr</code> property
     *
     * @param colspanAttr the new value
     */
    public void setColspanAttr(final IntegerSimpleType colspanAttr) {
        this.colspanAttr = colspanAttr;
        getElement().setAttribute("colspan", colspanAttr.getValue());
    }

    /**
     * Set <code>colspanAttr</code> property in DSL way
     *
     * @param colspanAttr the new value
     * @return <code>Th</code> instance
     */
    public Th colspanAttr(final IntegerSimpleType colspanAttr) {
        setColspanAttr(colspanAttr);
        return this;
    }

    /**
     * Return <code>rowspanAttr</code> property
     *
     * @return rowspanAttr
     */
    public IntegerSimpleType getRowspanAttr() {
        if (rowspanAttr == null) {
            rowspanAttr = new IntegerSimpleType();
            rowspanAttr.setValue(getElement().getAttribute("rowspan"));
        }

        return rowspanAttr;
    }

    /**
     * Return <code>rowspanAttr</code> property in DSL way
     *
     * @return rowspanAttr
     */
    public IntegerSimpleType rowspanAttr() {
        return getRowspanAttr();
    }

    /**
     * Set <code>rowspanAttr</code> property
     *
     * @param rowspanAttr the new value
     */
    public void setRowspanAttr(final IntegerSimpleType rowspanAttr) {
        this.rowspanAttr = rowspanAttr;
        getElement().setAttribute("rowspan", rowspanAttr.getValue());
    }

    /**
     * Set <code>rowspanAttr</code> property in DSL way
     *
     * @param rowspanAttr the new value
     * @return <code>Th</code> instance
     */
    public Th rowspanAttr(final IntegerSimpleType rowspanAttr) {
        setRowspanAttr(rowspanAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>alternativeToAttr</code> property in DSL way
     *
     * @param alternativeToAttr new value
     * @return <code> Th</code> instance
     */
    public Th alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    /**
     * Set <code>classAttr</code> property in DSL way
     *
     * @param classAttr new value
     * @return <code> Th</code> instance
     */
    public Th classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> Th</code> instance
     */
    public Th evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> Th</code> instance
     */
    public Th idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>langAttr</code> property in DSL way
     *
     * @param langAttr new value
     * @return <code> Th</code> instance
     */
    public Th langAttr(final StringSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> Th</code> instance
     */
    public Th periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> Th</code> instance
     */
    public Th refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>spaceAttr</code> property in DSL way
     *
     * @param spaceAttr new value
     * @return <code> Th</code> instance
     */
    public Th spaceAttr(final StringSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> Th</code> instance
     */
    public Th statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>styleAttr</code> property in DSL way
     *
     * @param styleAttr new value
     * @return <code> Th</code> instance
     */
    public Th styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    /**
     * Set <code>titleAttr</code> property in DSL way
     *
     * @param titleAttr new value
     * @return <code> Th</code> instance
     */
    public Th titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> Th</code> instance
     */
    public Th wildcardContentAttr(final String wildcardContentAttr) {
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
        attrs.put("colspan", getColspanAttr() != null ? getColspanAttr().getValue() : null);
        attrs.put("rowspan", getRowspanAttr() != null ? getRowspanAttr().getValue() : null);
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
    public Th html(String s) {
        super.html(s);
        return this;
    }
}

