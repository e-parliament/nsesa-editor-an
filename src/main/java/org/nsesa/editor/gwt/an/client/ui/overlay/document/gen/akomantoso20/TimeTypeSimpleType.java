package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum TimeTypeSimpleType {

// FIELDS ------------------

    STARTEVENT("startEvent"),
    ENDEVENT("endEvent")
;
    private final String value;

    TimeTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (TimeTypeSimpleType en : TimeTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
