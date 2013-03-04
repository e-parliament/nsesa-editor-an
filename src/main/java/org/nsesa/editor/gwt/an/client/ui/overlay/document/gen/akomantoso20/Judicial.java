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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The element judicial is a metadata container of the analysis of the judicial arguments of a judgement.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Judicial extends JudicialArgumentsComplexType {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Result(), new Occurrence(1, 1));
            put(new Supports(), new Occurrence(1, 1));
            put(new IsAnalogTo(), new Occurrence(1, 1));
            put(new Applies(), new Occurrence(1, 1));
            put(new Extends(), new Occurrence(1, 1));
            put(new Restricts(), new Occurrence(1, 1));
            put(new Derogates(), new Occurrence(1, 1));
            put(new Contrasts(), new Occurrence(1, 1));
            put(new Overrules(), new Occurrence(1, 1));
            put(new DissentsFrom(), new Occurrence(1, 1));
            put(new PutsInQuestion(), new Occurrence(1, 1));
            put(new Distinguishes(), new Occurrence(1, 1));
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "judicial");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
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
        return attrs;
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

