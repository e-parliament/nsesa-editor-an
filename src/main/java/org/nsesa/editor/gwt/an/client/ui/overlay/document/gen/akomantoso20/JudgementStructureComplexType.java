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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class JudgementStructureComplexType extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Meta(), new Occurrence(1, 1));
            put(new CoverPage(), new Occurrence(0, 1));
            put(new Header(), new Occurrence(1, 1));
            put(new JudgementBody(), new Occurrence(1, 1));
            put(new Conclusions(), new Occurrence(0, 1));
            put(new Attachments(), new Occurrence(0, 1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "judgementStructureComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget judgementStructureComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public JudgementStructureComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private VersionTypeSimpleType containsAttr;

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
    public JudgementStructureComplexType containsAttr(final VersionTypeSimpleType containsAttr) {
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

    public Header getHeader() {
        Header result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Header".equalsIgnoreCase(widget.getType())) {
                result = (Header) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Header setHeader(Header headerElem) {
        Header result = getHeader();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(headerElem);

        return headerElem;
    }

    public JudgementBody getJudgementBody() {
        JudgementBody result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("JudgementBody".equalsIgnoreCase(widget.getType())) {
                result = (JudgementBody) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public JudgementBody setJudgementBody(JudgementBody judgementBodyElem) {
        JudgementBody result = getJudgementBody();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(judgementBodyElem);

        return judgementBodyElem;
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
        return attrs;
    }
}

