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
 * the element akomaNtoso is the root element of all document types in Akoma Ntoso. It follows the pattern Universal Root (http://www.xmlpatterns.com/UniversalRootMain.shtml)
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class AkomaNtoso extends AkomaNtosoTypeComplexType {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Components(), new Occurrence(0, 1));
            put(new AmendmentList(), new Occurrence(0, -1));
            put(new OfficialGazette(), new Occurrence(0, -1));
            put(new DocumentCollection(), new Occurrence(0, -1));
            put(new Act(), new Occurrence(0, -1));
            put(new Bill(), new Occurrence(0, -1));
            put(new DebateReport(), new Occurrence(0, -1));
            put(new Debate(), new Occurrence(0, -1));
            put(new Amendment(), new Occurrence(0, -1));
            put(new Judgement(), new Occurrence(0, -1));
            put(new Doc(), new Occurrence(0, -1));
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "akomaNtoso");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget akomaNtoso");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>AkomaNtoso</code> object and set up its type
     */
    public AkomaNtoso() {
        super(create());
        setType("akomaNtoso");
    }


    /**
     * Create a <code>AkomaNtoso</code> object with the given DOM element
     */
    public AkomaNtoso(Element element) {
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
    public AkomaNtoso html(String s) {
        super.html(s);
        return this;
    }
}

