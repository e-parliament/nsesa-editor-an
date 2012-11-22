package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum EfficacyModsSimpleType {

// FIELDS ------------------

    ENTRYINTOEFFICACY("entryIntoEfficacy"),
    ENDOFEFFICACY("endOfEfficacy"),
    INAPPLICATION("inapplication"),
    RETROACTIVITY("retroactivity"),
    EXTRAEFFICACY("extraefficacy"),
    POSTPONEMENTOFEFFICACY("postponementOfEfficacy"),
    PROROGATIONOFEFFICACY("prorogationOfEfficacy")
;
    private final String value;

    EfficacyModsSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EfficacyModsSimpleType fromString(String text) {
        if (text == null) return null;
        for (EfficacyModsSimpleType en : EfficacyModsSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
