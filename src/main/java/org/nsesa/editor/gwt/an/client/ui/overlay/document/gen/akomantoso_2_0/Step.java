package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DateSimpleType;

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
    private AnyURISimpleType asAttr;
    private AnyURISimpleType actorAttr;
    private AnyURISimpleType outcomeAttr;
    private DateSimpleType dateAttr;
    public AnyURISimpleType getAsAttr() {
        return asAttr;
    }
    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
    }
    public AnyURISimpleType getActorAttr() {
        return actorAttr;
    }
    public void setActorAttr(final AnyURISimpleType actorAttr) {
        this.actorAttr = actorAttr;
    }
    public AnyURISimpleType getOutcomeAttr() {
        return outcomeAttr;
    }
    public void setOutcomeAttr(final AnyURISimpleType outcomeAttr) {
        this.outcomeAttr = outcomeAttr;
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

