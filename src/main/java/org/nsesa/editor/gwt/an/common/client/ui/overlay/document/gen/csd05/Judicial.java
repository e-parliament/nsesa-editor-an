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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The element judicial is a metadata container of the analysis of the judicial arguments of a judgment.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Judicial extends JudicialArgumentsComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new Result())
                    , new StructureIndicator.DefaultChoice(1, -1, new StructureIndicator.DefaultElement(1, 1, new Supports())
                    , new StructureIndicator.DefaultElement(1, 1, new IsAnalogTo())
                    , new StructureIndicator.DefaultElement(1, 1, new Applies())
                    , new StructureIndicator.DefaultElement(1, 1, new Extends())
                    , new StructureIndicator.DefaultElement(1, 1, new Restricts())
                    , new StructureIndicator.DefaultElement(1, 1, new Derogates())
                    , new StructureIndicator.DefaultElement(1, 1, new Contrasts())
                    , new StructureIndicator.DefaultElement(1, 1, new Overrules())
                    , new StructureIndicator.DefaultElement(1, 1, new DissentsFrom())
                    , new StructureIndicator.DefaultElement(1, 1, new PutsInQuestion())
                    , new StructureIndicator.DefaultElement(1, 1, new Distinguishes())
            )
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "judicial");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget judicial");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Judicial</code> object and set up its type
     */
    public Judicial() {
        super(create());
        setType("judicial");
    }


    /**
     * Create a <code>Judicial</code> object with the given DOM element
     */
    public Judicial(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

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
    public Judicial html(String s) {
        super.html(s);
        return this;
    }
}

