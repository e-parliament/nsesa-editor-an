package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;

import java.util.LinkedHashMap;

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
        if (typeAttr == null) {
            typeAttr = EventTypeSimpleType.fromString(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    public void setTypeAttr(final EventTypeSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    public YesNoTypeSimpleType getOriginatingExpressionAttr() {
        if (originatingExpressionAttr == null) {
            originatingExpressionAttr = YesNoTypeSimpleType.fromString(amendableElement.getAttribute("originatingExpression"));
        }

        return originatingExpressionAttr;
    }
    public void setOriginatingExpressionAttr(final YesNoTypeSimpleType originatingExpressionAttr) {
        this.originatingExpressionAttr = originatingExpressionAttr;
    }
    public DateSimpleType getDateAttr() {
        if (dateAttr == null) {
            dateAttr = new DateSimpleType();
            dateAttr.setValue(amendableElement.getAttribute("date"));
        }

        return dateAttr;
    }
    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
    }
    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(amendableElement.getAttribute("source"));
        }

        return sourceAttr;
    }
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"*"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr() != null ? getTypeAttr().value() : null);
        attrs.put("originatingExpressionAttr", getOriginatingExpressionAttr() != null ? getOriginatingExpressionAttr().value() : null);
        attrs.put("dateAttr", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("sourceAttr", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }

}

