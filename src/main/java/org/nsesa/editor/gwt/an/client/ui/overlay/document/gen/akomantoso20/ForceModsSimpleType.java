package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum ForceModsSimpleType {

// FIELDS ------------------

    ENTRYINTOFORCE("entryIntoForce"),
    ENDOFENACTMENT("endOfEnactment"),
    POSTPONEMENTOFENTRYINTOFORCE("postponementOfEntryIntoForce"),
    PROROGATIONOFFORCE("prorogationOfForce"),
    REENACTMENT("reEnactment"),
    UNCOSTITUTIONALITY("uncostitutionality")
;
    private final String value;

    ForceModsSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForceModsSimpleType fromString(String text) {
        if (text == null) return null;
        for (ForceModsSimpleType en : ForceModsSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
