package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum VersionTypeSimpleType {

// FIELDS ------------------

    ORIGINALVERSION("originalVersion"),
    SINGLEVERSION("singleVersion"),
    MULTIPLEVERSIONS("multipleVersions")
;
    private final String value;

    VersionTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VersionTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (VersionTypeSimpleType en : VersionTypeSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
