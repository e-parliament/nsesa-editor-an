package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.EventTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.YesNoTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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
public class EventRef extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
    public EventRef() {
        super(DOM.createElement("eventRef"));
    }

    public EventRef(Element element) {
        super(element);
    }

// FIELDS ------------------
    private EventTypeSimpleType typeAttr;
    private YesNoTypeSimpleType originatingExpressionAttr;
    private DateSimpleType dateAttr;
    private AnyURISimpleType sourceAttr;
    public EventTypeSimpleType getTypeAttr() {
        return typeAttr;
    }
    public void setTypeAttr(final EventTypeSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    public YesNoTypeSimpleType getOriginatingExpressionAttr() {
        return originatingExpressionAttr;
    }
    public void setOriginatingExpressionAttr(final YesNoTypeSimpleType originatingExpressionAttr) {
        this.originatingExpressionAttr = originatingExpressionAttr;
    }
    public DateSimpleType getDateAttr() {
        return dateAttr;
    }
    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
    }
    public AnyURISimpleType getSourceAttr() {
        return sourceAttr;
    }
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"*"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr().value());
        attrs.put("originatingExpressionAttr", getOriginatingExpressionAttr().value());
        attrs.put("dateAttr", getDateAttr().getValue());
        attrs.put("sourceAttr", getSourceAttr().getValue());

        return attrs;
    }

}

