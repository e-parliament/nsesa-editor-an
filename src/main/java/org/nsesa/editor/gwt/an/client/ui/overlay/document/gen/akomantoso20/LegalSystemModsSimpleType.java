package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum LegalSystemModsSimpleType {

// FIELDS ------------------

    STATICREFERENCE("staticReference"),
    IMPLEMENTATION("implementation"),
    RATIFICATION("ratification"),
    APPLICATION("application"),
    LEGISLATIVEDELEGATION("legislativeDelegation"),
    DEREGULATION("deregulation"),
    CONVERSION("conversion"),
    EXPIRATION("expiration"),
    REITERATION("reiteration"),
    REMAKING("remaking"),
    REPUBLICATION("republication"),
    COORDINATION("coordination")
;
    private final String value;

    LegalSystemModsSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegalSystemModsSimpleType fromString(String text) {
        if (text == null) return null;
        for (LegalSystemModsSimpleType en : LegalSystemModsSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
