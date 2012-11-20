package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class MeaningMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
    public MeaningMod() {
        super(DOM.createElement("meaningMod"));
    }

    public MeaningMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private MeaningModsSimpleType typeAttr;
    public MeaningModsSimpleType getTypeAttr() {
        return typeAttr;
    }
    public void setTypeAttr(final MeaningModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    public Domain getDomain() {
        Domain result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Domain".equalsIgnoreCase(widget.getType())) {
                result = (Domain)widget;
                break;
            }
        }
        return result;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","source","condition","domain","efficacy","force","destination"};
    }

}

