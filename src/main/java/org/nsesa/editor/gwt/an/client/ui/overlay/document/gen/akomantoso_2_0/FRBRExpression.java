package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

import java.util.ArrayList;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FRBRExpression extends CorePropertiesComplexType  {

// CONSTRUCTORS ------------------
    public FRBRExpression() {
        super(DOM.createElement("FRBRExpression"));
    }

    public FRBRExpression(Element element) {
        super(element);
    }

// FIELDS ------------------
    public java.util.List<FRBRlanguage> getFRBRlanguages() {
        java.util.List<FRBRlanguage> result = new ArrayList<FRBRlanguage>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRlanguage".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRlanguage)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<FRBRtranslation> getFRBRtranslations() {
        java.util.List<FRBRtranslation> result = new ArrayList<FRBRtranslation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRtranslation".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRtranslation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"FRBRthis","FRBRalias","FRBRlanguage","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation","FRBRtranslation"};
    }

}

