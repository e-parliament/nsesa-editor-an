package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum MeaningModsSimpleType {

// FIELDS ------------------

    VARIATION("variation"),
    TERMMODIFICATION("termModification"),
    AUTHENTICINTERPRETATION("authenticInterpretation")
;
    private final String value;

    MeaningModsSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeaningModsSimpleType fromString(String text) {
        if (text == null) return null;
        for (MeaningModsSimpleType en : MeaningModsSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
