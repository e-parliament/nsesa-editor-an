package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum RemarkTypeSimpleType {

// FIELDS ------------------

    SCENEDESCRIPTION("sceneDescription"),
    PHENOMENON("phenomenon"),
    CAPTION("caption"),
    TRANSLATION("translation")
;
    private final String value;

    RemarkTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemarkTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (RemarkTypeSimpleType en : RemarkTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
