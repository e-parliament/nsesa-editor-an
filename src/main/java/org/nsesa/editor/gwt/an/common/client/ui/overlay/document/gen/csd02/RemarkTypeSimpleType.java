package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This is the list of allowed values for the type attribute of the remark element* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum RemarkTypeSimpleType {

// FIELDS ------------------

SCENEDESCRIPTION("sceneDescription"),
PHENOMENON("phenomenon"),
CAPTION("caption"),
TRANSLATION("translation")
;
private final String value;

/**
* Create an instance of RemarkTypeSimpleType class with the given String
*/
RemarkTypeSimpleType(String v) {
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
* @return RemarkTypeSimpleType or <code>null</code>
*/
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
