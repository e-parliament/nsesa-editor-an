package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This is the list of possible positions of the text being analyzed by the element in the analysis section* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum PosTypeSimpleType {

// FIELDS ------------------

START("start"),
BEFORE("before"),
INSIDE("inside"),
AFTER("after"),
END("end"),
UNSPECIFIED("unspecified")
;
private final String value;

/**
* Create an instance of PosTypeSimpleType class with the given String
*/
PosTypeSimpleType(String v) {
value = v;
}

/**
* Return the value of the instance
* @return value as String
*/
public String value() {
return value;
}

/**
* Return an Enum based on the given input text or null if it does not fit
* @param text the String representation of the enum
* @return PosTypeSimpleType or <code>null</code>
*/
public static PosTypeSimpleType fromString(String text) {
if (text == null) return null;
for (PosTypeSimpleType en : PosTypeSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
