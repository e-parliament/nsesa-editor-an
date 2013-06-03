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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * the type amendmentStructure specifies the overall content model of the document types that describe amendments
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class AmendmentStructureComplexType extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new Meta())
                    , new StructureIndicator.DefaultElement(0, 1, new CoverPage())
                    , new StructureIndicator.DefaultElement(0, 1, new Preface())
                    , new StructureIndicator.DefaultElement(1, 1, new AmendmentBody())
                    , new StructureIndicator.DefaultElement(0, 1, new Conclusions())
                    , new StructureIndicator.DefaultElement(0, 1, new Attachments())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "amendmentStructureComplexType");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget amendmentStructureComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>AmendmentStructureComplexType</code> object with the given DOM element
     */
    public AmendmentStructureComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private VersionTypeSimpleType containsAttr;

    /**
     * Return <code>containsAttr</code> property
     *
     * @return containsAttr
     */
    public VersionTypeSimpleType getContainsAttr() {
        if (containsAttr == null) {
            containsAttr = VersionTypeSimpleType.fromString(getElement().getAttribute("contains"));
        }

        return containsAttr;
    }

    /**
     * Return <code>containsAttr</code> property in DSL way
     *
     * @return containsAttr
     */
    public VersionTypeSimpleType containsAttr() {
        return getContainsAttr();
    }

    /**
     * Set <code>containsAttr</code> property
     *
     * @param containsAttr the new value
     */
    public void setContainsAttr(final VersionTypeSimpleType containsAttr) {
        this.containsAttr = containsAttr;
        getElement().setAttribute("contains", containsAttr.value());
    }

    /**
     * Set <code>containsAttr</code> property in DSL way
     *
     * @param containsAttr the new value
     * @return <code>AmendmentStructureComplexType</code> instance
     */
    public AmendmentStructureComplexType containsAttr(final VersionTypeSimpleType containsAttr) {
        setContainsAttr(containsAttr);
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
            if ("Meta".equalsIgnoreCase(widget.getType())) {
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
     * Add <code>CoverPage</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public CoverPage getCoverPage() {
        CoverPage result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("CoverPage".equalsIgnoreCase(widget.getType())) {
                result = (CoverPage) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>coverPageElem</code> property in DSL way
     *
     * @param coverPageElem new value
     * @return <code>CoverPage</code> instance
     */
    public CoverPage setCoverPage(CoverPage coverPageElem) {
        CoverPage result = getCoverPage();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(coverPageElem);

        return coverPageElem;
    }

    /**
     * Add <code>Preface</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Preface getPreface() {
        Preface result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Preface".equalsIgnoreCase(widget.getType())) {
                result = (Preface) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>prefaceElem</code> property in DSL way
     *
     * @param prefaceElem new value
     * @return <code>Preface</code> instance
     */
    public Preface setPreface(Preface prefaceElem) {
        Preface result = getPreface();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(prefaceElem);

        return prefaceElem;
    }

    /**
     * Add <code>AmendmentBody</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public AmendmentBody getAmendmentBody() {
        AmendmentBody result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AmendmentBody".equalsIgnoreCase(widget.getType())) {
                result = (AmendmentBody) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>amendmentBodyElem</code> property in DSL way
     *
     * @param amendmentBodyElem new value
     * @return <code>AmendmentBody</code> instance
     */
    public AmendmentBody setAmendmentBody(AmendmentBody amendmentBodyElem) {
        AmendmentBody result = getAmendmentBody();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(amendmentBodyElem);

        return amendmentBodyElem;
    }

    /**
     * Add <code>Conclusions</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Conclusions getConclusions() {
        Conclusions result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Conclusions".equalsIgnoreCase(widget.getType())) {
                result = (Conclusions) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>conclusionsElem</code> property in DSL way
     *
     * @param conclusionsElem new value
     * @return <code>Conclusions</code> instance
     */
    public Conclusions setConclusions(Conclusions conclusionsElem) {
        Conclusions result = getConclusions();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(conclusionsElem);

        return conclusionsElem;
    }

    /**
     * Add <code>Attachments</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Attachments getAttachments() {
        Attachments result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Attachments".equalsIgnoreCase(widget.getType())) {
                result = (Attachments) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>attachmentsElem</code> property in DSL way
     *
     * @param attachmentsElem new value
     * @return <code>Attachments</code> instance
     */
    public Attachments setAttachments(Attachments attachmentsElem) {
        Attachments result = getAttachments();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(attachmentsElem);

        return attachmentsElem;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("contains", getContainsAttr() != null ? getContainsAttr().value() : null);
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
    public AmendmentStructureComplexType html(String s) {
        super.html(s);
        return this;
    }
}

