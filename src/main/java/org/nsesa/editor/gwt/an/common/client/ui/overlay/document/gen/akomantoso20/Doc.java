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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * Element doc is used for describing the structure and content of any other document that is not<br/> included in the list of document explicitly managed by Akoma Ntoso
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Doc extends OpenStructureComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new Meta())
                    , new StructureIndicator.DefaultElement(0, 1, new CoverPage())
                    , new StructureIndicator.DefaultElement(0, 1, new Preface())
                    , new StructureIndicator.DefaultElement(0, 1, new Preamble())
                    , new StructureIndicator.DefaultElement(1, 1, new MainBody())
                    , new StructureIndicator.DefaultElement(0, 1, new Conclusions())
                    , new StructureIndicator.DefaultElement(0, 1, new Attachments())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "doc");
        span.setAttribute("data-ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget doc");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Doc</code> object and set up its type
     */
    public Doc() {
        super(create());
        setType("doc");
    }

    /**
     * Constructor with required attributes
     */
    public Doc(StringSimpleType nameAttr) {
        this();
        setNameAttr(nameAttr);
    }


    /**
     * Create a <code>Doc</code> object with the given DOM element
     */
    public Doc(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>containsAttr</code> property in DSL way
     *
     * @param containsAttr new value
     * @return <code> Doc</code> instance
     */
    public Doc containsAttr(final VersionTypeSimpleType containsAttr) {
        setContainsAttr(containsAttr);
        return this;
    }

    /**
     * Set <code>nameAttr</code> property in DSL way
     *
     * @param nameAttr new value
     * @return <code> Doc</code> instance
     */
    public Doc nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
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
    public Doc html(String s) {
        super.html(s);
        return this;
    }
}

