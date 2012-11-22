package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum StatusTypeSimpleType {

// FIELDS ------------------

    OMISSIS("omissis"),
    REPEALED("repealed"),
    SUSPENDED("suspended"),
    EDITORIAL("editorial"),
    IGNORE("ignore"),
    TRANSLATED("translated"),
    EDITED("edited"),
    VERBATIM("verbatim")
;
    private final String value;

    StatusTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (StatusTypeSimpleType en : StatusTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
