package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FRBRManifestation extends CorePropertiesComplexType  {

// CONSTRUCTORS ------------------
    public FRBRManifestation() {
        super(DOM.createElement("FRBRManifestation"));
    }

    public FRBRManifestation(Element element) {
        super(element);
    }

// FIELDS ------------------
    public FRBRformat getFRBRformat() {
        FRBRformat result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRformat".equalsIgnoreCase(widget.getType())) {
                result = (FRBRformat)widget;
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
        return new String[]{"FRBRthis","FRBRalias","FRBRformat","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation"};
    }

}

