package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum YesNoTypeSimpleType {

// FIELDS ------------------

    YES("yes"),
    NO("no")
;
    private final String value;

    YesNoTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesNoTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (YesNoTypeSimpleType en : YesNoTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
