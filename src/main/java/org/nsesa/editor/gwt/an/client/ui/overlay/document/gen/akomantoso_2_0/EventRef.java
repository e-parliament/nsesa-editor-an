package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DateSimpleType;

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
    private AnyURISimpleType sourceAttr;
    private DateSimpleType dateAttr;
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
    public AnyURISimpleType getSourceAttr() {
        return sourceAttr;
    }
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
    public DateSimpleType getDateAttr() {
        return dateAttr;
    }
    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"*"};
    }

}

