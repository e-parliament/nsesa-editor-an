package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DurationSimpleType;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class TimeInterval extends MetaoptComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "timeInterval");
        span.setClassName("widget timeInterval");
        return span;
    }

    // CONSTRUCTORS ------------------
    public TimeInterval() {
        super(create());
        setType("timeInterval");
    }

    public TimeInterval(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType startAttr;
    private AnyURISimpleType endAttr;
    private DurationSimpleType durationAttr;
    private AnyURISimpleType refersToAttr;

    public AnyURISimpleType getStartAttr() {
        if (startAttr == null) {
            startAttr = new AnyURISimpleType();
            startAttr.setValue(getElement().getAttribute("start"));
        }

        return startAttr;
    }

    //DSL Style get value
    public AnyURISimpleType startAttr() {
        return getStartAttr();
    }

    public void setStartAttr(final AnyURISimpleType startAttr) {
        this.startAttr = startAttr;
    }

    //DSL Style set value
    public TimeInterval startAttr(final AnyURISimpleType startAttr) {
        setStartAttr(startAttr);
        return this;
    }

    public AnyURISimpleType getEndAttr() {
        if (endAttr == null) {
            endAttr = new AnyURISimpleType();
            endAttr.setValue(getElement().getAttribute("end"));
        }

        return endAttr;
    }

    //DSL Style get value
    public AnyURISimpleType endAttr() {
        return getEndAttr();
    }

    public void setEndAttr(final AnyURISimpleType endAttr) {
        this.endAttr = endAttr;
    }

    //DSL Style set value
    public TimeInterval endAttr(final AnyURISimpleType endAttr) {
        setEndAttr(endAttr);
        return this;
    }

    public DurationSimpleType getDurationAttr() {
        if (durationAttr == null) {
            durationAttr = new DurationSimpleType();
            durationAttr.setValue(getElement().getAttribute("duration"));
        }

        return durationAttr;
    }

    //DSL Style get value
    public DurationSimpleType durationAttr() {
        return getDurationAttr();
    }

    public void setDurationAttr(final DurationSimpleType durationAttr) {
        this.durationAttr = durationAttr;
    }

    //DSL Style set value
    public TimeInterval durationAttr(final DurationSimpleType durationAttr) {
        setDurationAttr(durationAttr);
        return this;
    }

    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }

    //DSL Style set value
    public TimeInterval refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
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
        attrs.put("start", getStartAttr() != null ? getStartAttr().getValue() : null);
        attrs.put("end", getEndAttr() != null ? getEndAttr().getValue() : null);
        attrs.put("duration", getDurationAttr() != null ? getDurationAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        return attrs;
    }
}

