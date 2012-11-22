package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DurationSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class TimeInterval extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
    public TimeInterval() {
        super(DOM.createElement("timeInterval"));
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
            startAttr.setValue(amendableElement.getAttribute("start"));
        }

        return startAttr;
    }
    public void setStartAttr(final AnyURISimpleType startAttr) {
        this.startAttr = startAttr;
    }
    public AnyURISimpleType getEndAttr() {
        if (endAttr == null) {
            endAttr = new AnyURISimpleType();
            endAttr.setValue(amendableElement.getAttribute("end"));
        }

        return endAttr;
    }
    public void setEndAttr(final AnyURISimpleType endAttr) {
        this.endAttr = endAttr;
    }
    public DurationSimpleType getDurationAttr() {
        if (durationAttr == null) {
            durationAttr = new DurationSimpleType();
            durationAttr.setValue(amendableElement.getAttribute("duration"));
        }

        return durationAttr;
    }
    public void setDurationAttr(final DurationSimpleType durationAttr) {
        this.durationAttr = durationAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("startAttr", getStartAttr().getValue());
        attrs.put("endAttr", getEndAttr().getValue());
        attrs.put("durationAttr", getDurationAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());

        return attrs;
    }

}

