package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This is the list of allowed values for the contains attribute* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum VersionTypeSimpleType {

// FIELDS ------------------

ORIGINALVERSION("originalVersion"),
SINGLEVERSION("singleVersion"),
MULTIPLEVERSIONS("multipleVersions")
;
private final String value;

/**
* Create an instance of VersionTypeSimpleType class with the given String
*/
VersionTypeSimpleType(String v) {
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
* @return VersionTypeSimpleType or <code>null</code>
*/
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
