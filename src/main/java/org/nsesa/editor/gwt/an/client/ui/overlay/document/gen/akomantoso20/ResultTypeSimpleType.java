package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum ResultTypeSimpleType {

// FIELDS ------------------

    DENY("deny"),
    DISMISS("dismiss"),
    UPHOLD("uphold"),
    REVERT("revert"),
    REPLACEORDER("replaceOrder"),
    REMIT("remit"),
    DECIDE("decide"),
    APPROVE("approve")
;
    private final String value;

    ResultTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (ResultTypeSimpleType en : ResultTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
