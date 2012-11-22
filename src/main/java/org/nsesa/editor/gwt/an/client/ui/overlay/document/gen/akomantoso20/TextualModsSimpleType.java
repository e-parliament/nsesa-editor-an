package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum TextualModsSimpleType {

// FIELDS ------------------

    REPEAL("repeal"),
    SUBSTITUTION("substitution"),
    INSERTION("insertion"),
    REPLACEMENT("replacement"),
    RENUMBERING("renumbering")
;
    private final String value;

    TextualModsSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextualModsSimpleType fromString(String text) {
        if (text == null) return null;
        for (TextualModsSimpleType en : TextualModsSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
