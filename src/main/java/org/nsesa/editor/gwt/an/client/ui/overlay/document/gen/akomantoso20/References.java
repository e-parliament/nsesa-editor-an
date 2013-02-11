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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class References extends RefItemsComplexType {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Original(), new Occurrence(0, -1));
            put(new PassiveRef(), new Occurrence(0, -1));
            put(new ActiveRef(), new Occurrence(0, -1));
            put(new Jurisprudence(), new Occurrence(0, -1));
            put(new HasAttachment(), new Occurrence(0, -1));
            put(new AttachmentOf(), new Occurrence(0, -1));
            put(new TLCPerson(), new Occurrence(0, -1));
            put(new TLCOrganization(), new Occurrence(0, -1));
            put(new TLCConcept(), new Occurrence(0, -1));
            put(new TLCObject(), new Occurrence(0, -1));
            put(new TLCEvent(), new Occurrence(0, -1));
            put(new TLCLocation(), new Occurrence(0, -1));
            put(new TLCProcess(), new Occurrence(0, -1));
            put(new TLCRole(), new Occurrence(0, -1));
            put(new TLCTerm(), new Occurrence(0, -1));
            put(new TLCReference(), new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "references");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget references");
        return span;
    }

    // CONSTRUCTORS ------------------
    public References() {
        super(create());
        setType("references");
    }

    public References(Element element) {
        super(element);
    }

// FIELDS ------------------

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public References sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }

    /**
     * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
     */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
        return ALLOWED_SUB_TYPES;
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
        return attrs;
    }
}

