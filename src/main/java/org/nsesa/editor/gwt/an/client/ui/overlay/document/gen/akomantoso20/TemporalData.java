package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class TemporalData extends AmendableWidgetImpl {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "temporalData");
        span.setClassName("widget temporalData");
        return span;
    }

    // CONSTRUCTORS ------------------
    public TemporalData() {
        super(create());
        setType("temporalData");
    }

    public TemporalData(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType sourceAttr;

    public java.util.List<TemporalGroup> getTemporalGroups() {
        java.util.List<TemporalGroup> result = new ArrayList<TemporalGroup>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TemporalGroup".equalsIgnoreCase(widget.getType())) {
                result.add((TemporalGroup) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TemporalGroup> getTemporalGroupList() {
        return getTemporalGroups();
    }

    //DSL Style set value
    public TemporalGroup addTemporalGroup(TemporalGroup temporalGroupElem) {
        this.addAmendableWidget(temporalGroupElem);
        return temporalGroupElem;
    }

    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
    }

    //DSL Style get value
    public AnyURISimpleType sourceAttr() {
        return getSourceAttr();
    }

    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }

    //DSL Style set value
    public TemporalData sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"temporalGroup"};
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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }
}

