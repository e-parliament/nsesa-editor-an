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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class OpenStructureComplexType extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Meta(), new Occurrence(1, 1));
            put(new CoverPage(), new Occurrence(0, 1));
            put(new Preface(), new Occurrence(0, 1));
            put(new Preamble(), new Occurrence(0, 1));
            put(new MainBody(), new Occurrence(1, 1));
            put(new Conclusions(), new Occurrence(0, 1));
            put(new Attachments(), new Occurrence(0, 1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "openStructureComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget openStructureComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public OpenStructureComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private VersionTypeSimpleType containsAttr;
    private StringSimpleType nameAttr;

    public VersionTypeSimpleType getContainsAttr() {
        if (containsAttr == null) {
            containsAttr = VersionTypeSimpleType.fromString(getElement().getAttribute("contains"));
        }

        return containsAttr;
    }

    //DSL Style get value
    public VersionTypeSimpleType containsAttr() {
        return getContainsAttr();
    }

    public void setContainsAttr(final VersionTypeSimpleType containsAttr) {
        this.containsAttr = containsAttr;
        getElement().setAttribute("contains", containsAttr.value());
    }

    //DSL Style set value
    public OpenStructureComplexType containsAttr(final VersionTypeSimpleType containsAttr) {
        setContainsAttr(containsAttr);
        return this;
    }

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
    //DSL Style get value already exists

    //DSL Style set value
    public Meta setMeta(Meta metaElem) {
        Meta result = getMeta();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(metaElem);

        return metaElem;
    }

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
    //DSL Style get value already exists

    //DSL Style set value
    public CoverPage setCoverPage(CoverPage coverPageElem) {
        CoverPage result = getCoverPage();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(coverPageElem);

        return coverPageElem;
    }

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
    //DSL Style get value already exists

    //DSL Style set value
    public Preface setPreface(Preface prefaceElem) {
        Preface result = getPreface();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(prefaceElem);

        return prefaceElem;
    }

    public Preamble getPreamble() {
        Preamble result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Preamble".equalsIgnoreCase(widget.getType())) {
                result = (Preamble) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Preamble setPreamble(Preamble preambleElem) {
        Preamble result = getPreamble();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(preambleElem);

        return preambleElem;
    }

    public MainBody getMainBody() {
        MainBody result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("MainBody".equalsIgnoreCase(widget.getType())) {
                result = (MainBody) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public MainBody setMainBody(MainBody mainBodyElem) {
        MainBody result = getMainBody();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(mainBodyElem);

        return mainBodyElem;
    }

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
    //DSL Style get value already exists

    //DSL Style set value
    public Conclusions setConclusions(Conclusions conclusionsElem) {
        Conclusions result = getConclusions();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(conclusionsElem);

        return conclusionsElem;
    }

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
    //DSL Style get value already exists

    //DSL Style set value
    public Attachments setAttachments(Attachments attachmentsElem) {
        Attachments result = getAttachments();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(attachmentsElem);

        return attachmentsElem;
    }

    public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
            nameAttr = new StringSimpleType();
            nameAttr.setValue(getElement().getAttribute("name"));
        }

        return nameAttr;
    }

    //DSL Style get value
    public StringSimpleType nameAttr() {
        return getNameAttr();
    }

    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
        getElement().setAttribute("name", nameAttr.getValue());
    }

    //DSL Style set value
    public OpenStructureComplexType nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
    }
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
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("contains", getContainsAttr() != null ? getContainsAttr().value() : null);
        attrs.put("name", getNameAttr() != null ? getNameAttr().getValue() : null);
        return attrs;
    }
}

