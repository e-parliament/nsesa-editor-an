package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRformat;
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

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());

        return attrs;
    }

}

