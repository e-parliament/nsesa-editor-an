package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum PosTypeSimpleType {

// FIELDS ------------------

    START("start"),
    BEFORE("before"),
    INSIDE("inside"),
    AFTER("after"),
    END("end"),
    UNSPECIFIED("unspecified")
;
    private final String value;

    PosTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PosTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (PosTypeSimpleType en : PosTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
