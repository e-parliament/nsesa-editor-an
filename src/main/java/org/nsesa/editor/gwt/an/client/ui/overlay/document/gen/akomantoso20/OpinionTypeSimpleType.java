package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum OpinionTypeSimpleType {

// FIELDS ------------------

    DISSENTING("dissenting"),
    AGREEING("agreeing"),
    NULL("null")
;
    private final String value;

    OpinionTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpinionTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (OpinionTypeSimpleType en : OpinionTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
