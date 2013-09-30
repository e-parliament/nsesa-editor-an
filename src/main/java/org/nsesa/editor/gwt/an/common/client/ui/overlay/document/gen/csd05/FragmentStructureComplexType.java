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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * the type fragmentStructure specifies the overall content model of the document type that is a fragment of another document
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class FragmentStructureComplexType extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new Meta())
                    , new StructureIndicator.DefaultElement(1, 1, new FragmentBody())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "fragmentStructureComplexType");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget fragmentStructureComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>FragmentStructureComplexType</code> object with the given DOM element
     */
    public FragmentStructureComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType includedInAttr;

    /**
     * Return <code>includedInAttr</code> property
     *
     * @return includedInAttr
     */
    public AnyURISimpleType getIncludedInAttr() {
        if (includedInAttr == null) {
            includedInAttr = new AnyURISimpleType();
            includedInAttr.setValue(getElement().getAttribute("includedIn"));
        }

        return includedInAttr;
    }

    /**
     * Return <code>includedInAttr</code> property in DSL way
     *
     * @return includedInAttr
     */
    public AnyURISimpleType includedInAttr() {
        return getIncludedInAttr();
    }

    /**
     * Set <code>includedInAttr</code> property
     *
     * @param includedInAttr the new value
     */
    public void setIncludedInAttr(final AnyURISimpleType includedInAttr) {
        this.includedInAttr = includedInAttr;
        getElement().setAttribute("includedIn", includedInAttr.getValue());
    }

    /**
     * Set <code>includedInAttr</code> property in DSL way
     *
     * @param includedInAttr the new value
     * @return <code>FragmentStructureComplexType</code> instance
     */
    public FragmentStructureComplexType includedInAttr(final AnyURISimpleType includedInAttr) {
        setIncludedInAttr(includedInAttr);
        return this;
    }

    /**
     * Add <code>Meta</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Meta getMeta() {
        Meta result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Meta".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Meta) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>metaElem</code> property in DSL way
     *
     * @param metaElem new value
     * @return <code>Meta</code> instance
     */
    public Meta setMeta(Meta metaElem) {
        Meta result = getMeta();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(metaElem);

        return metaElem;
    }

    /**
     * Add <code>FragmentBody</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public FragmentBody getFragmentBody() {
        FragmentBody result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FragmentBody".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (FragmentBody) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>fragmentBodyElem</code> property in DSL way
     *
     * @param fragmentBodyElem new value
     * @return <code>FragmentBody</code> instance
     */
    public FragmentBody setFragmentBody(FragmentBody fragmentBodyElem) {
        FragmentBody result = getFragmentBody();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(fragmentBodyElem);

        return fragmentBodyElem;
    }
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
        attrs.put("includedIn", getIncludedInAttr() != null ? getIncludedInAttr().getValue() : null);
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
    public FragmentStructureComplexType html(String s) {
        super.html(s);
        return this;
    }
}

