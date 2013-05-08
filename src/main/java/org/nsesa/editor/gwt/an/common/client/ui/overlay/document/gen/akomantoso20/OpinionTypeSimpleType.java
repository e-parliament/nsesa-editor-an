package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This is the list of allowed values for the type attribute of the opinion element* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum OpinionTypeSimpleType {

// FIELDS ------------------

DISSENTING("dissenting"),
AGREEING("agreeing"),
NULL("null")
;
private final String value;

/**
* Create an instance of OpinionTypeSimpleType class with the given String
*/
OpinionTypeSimpleType(String v) {
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
* @return OpinionTypeSimpleType or <code>null</code>
*/
public static OpinionTypeSimpleType fromString(String text) {
if (text == null) return null;
for (OpinionTypeSimpleType en : OpinionTypeSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
