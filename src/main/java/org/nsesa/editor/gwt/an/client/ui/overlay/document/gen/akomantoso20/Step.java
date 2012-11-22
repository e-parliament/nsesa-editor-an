package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AnyOtherTypeComplexType;
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
public class Step extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
    public Step() {
        super(DOM.createElement("step"));
    }

    public Step(Element element) {
        super(element);
    }

// FIELDS ------------------
    private DateSimpleType dateAttr;
    private AnyURISimpleType actorAttr;
    private AnyURISimpleType asAttr;
    private AnyURISimpleType outcomeAttr;
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
    public AnyURISimpleType getActorAttr() {
        if (actorAttr == null) {
            actorAttr = new AnyURISimpleType();
            actorAttr.setValue(amendableElement.getAttribute("actor"));
        }

        return actorAttr;
    }
    public void setActorAttr(final AnyURISimpleType actorAttr) {
        this.actorAttr = actorAttr;
    }
    public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
            asAttr = new AnyURISimpleType();
            asAttr.setValue(amendableElement.getAttribute("as"));
        }

        return asAttr;
    }
    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
    }
    public AnyURISimpleType getOutcomeAttr() {
        if (outcomeAttr == null) {
            outcomeAttr = new AnyURISimpleType();
            outcomeAttr.setValue(amendableElement.getAttribute("outcome"));
        }

        return outcomeAttr;
    }
    public void setOutcomeAttr(final AnyURISimpleType outcomeAttr) {
        this.outcomeAttr = outcomeAttr;
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
        attrs.put("dateAttr", getDateAttr().getValue());
        attrs.put("actorAttr", getActorAttr().getValue());
        attrs.put("asAttr", getAsAttr().getValue());
        attrs.put("outcomeAttr", getOutcomeAttr().getValue());

        return attrs;
    }

}

