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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Element documentCollection is used for describing the structure and content of a collection of other documents chosen and combined for any reason whatsoever
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class DocumentCollection extends CollectionStructureComplexType {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Meta(), new Occurrence(1, 1));
            put(new CoverPage(), new Occurrence(0, 1));
            put(new Preface(), new Occurrence(0, 1));
            put(new CollectionBody(), new Occurrence(1, 1));
            put(new Conclusions(), new Occurrence(0, 1));
            put(new Attachments(), new Occurrence(0, 1));
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "documentCollection");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget documentCollection");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>DocumentCollection</code> object and set up its type
     */
    public DocumentCollection() {
        super(create());
        setType("documentCollection");
    }

    /**
     * Constructor with required attributes
     */
    public DocumentCollection(StringSimpleType nameAttr) {
        this();
        setNameAttr(nameAttr);
    }


    /**
     * Create a <code>DocumentCollection</code> object with the given DOM element
     */
    public DocumentCollection(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private StringSimpleType nameAttr;

    /**
     * Return <code>nameAttr</code> property
     *
     * @return nameAttr
     */
    public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
            nameAttr = new StringSimpleType();
            nameAttr.setValue(getElement().getAttribute("name"));
        }

        return nameAttr;
    }

    /**
     * Return <code>nameAttr</code> property in DSL way
     *
     * @return nameAttr
     */
    public StringSimpleType nameAttr() {
        return getNameAttr();
    }

    /**
     * Set <code>nameAttr</code> property
     *
     * @param nameAttr the new value
     */
    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
        getElement().setAttribute("name", nameAttr.getValue());
    }

    /**
     * Set <code>nameAttr</code> property in DSL way
     *
     * @param nameAttr the new value
     * @return <code>DocumentCollection</code> instance
     */
    public DocumentCollection nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>containsAttr</code> property in DSL way
     *
     * @param containsAttr new value
     * @return <code> DocumentCollection</code> instance
     */
    public DocumentCollection containsAttr(final VersionTypeSimpleType containsAttr) {
        setContainsAttr(containsAttr);
        return this;
    }

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
        attrs.put("name", getNameAttr() != null ? getNameAttr().getValue() : null);
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public DocumentCollection html(String s) {
        super.html(s);
        return this;
    }
}

