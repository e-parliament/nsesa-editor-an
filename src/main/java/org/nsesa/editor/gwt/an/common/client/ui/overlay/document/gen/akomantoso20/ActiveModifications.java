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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The element activeModifications is a metadata container of the active modifications generated<br/> by the document.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class ActiveModifications extends AmendmentsComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultChoice(1, -1, new StructureIndicator.DefaultElement(1, 1, new TextualMod())
                    , new StructureIndicator.DefaultElement(1, 1, new MeaningMod())
                    , new StructureIndicator.DefaultElement(1, 1, new ScopeMod())
                    , new StructureIndicator.DefaultElement(1, 1, new ForceMod())
                    , new StructureIndicator.DefaultElement(1, 1, new EfficacyMod())
                    , new StructureIndicator.DefaultElement(1, 1, new LegalSystemMod())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "activeModifications");
        span.setAttribute("data-ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget activeModifications");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>ActiveModifications</code> object and set up its type
     */
    public ActiveModifications() {
        super(create());
        setType("activeModifications");
    }


    /**
     * Create a <code>ActiveModifications</code> object with the given DOM element
     */
    public ActiveModifications(Element element) {
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
    public ActiveModifications html(String s) {
        super.html(s);
        return this;
    }
}

