package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum PlacementTypeSimpleType {

// FIELDS ------------------

    SIDE("side"),
    LEFT("left"),
    RIGHT("right"),
    BOTTOM("bottom"),
    INLINE("inline")
;
    private final String value;

    PlacementTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (PlacementTypeSimpleType en : PlacementTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
