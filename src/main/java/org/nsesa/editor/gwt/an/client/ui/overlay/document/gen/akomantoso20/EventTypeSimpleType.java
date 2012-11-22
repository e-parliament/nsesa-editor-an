package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum EventTypeSimpleType {

// FIELDS ------------------

    GENERATION("generation"),
    AMENDMENT("amendment"),
    REPEAL("repeal")
;
    private final String value;

    EventTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (EventTypeSimpleType en : EventTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
