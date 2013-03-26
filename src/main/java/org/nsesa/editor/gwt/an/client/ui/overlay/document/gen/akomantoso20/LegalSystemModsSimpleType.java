package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* The simple type LegalSystemMods lists all the types of modifications in the legal system as values for the type attribute of the LegalSystemMod element.* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
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

/**
* Create an instance of LegalSystemModsSimpleType class with the given String
*/
LegalSystemModsSimpleType(String v) {
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
* @return LegalSystemModsSimpleType or <code>null</code>
*/
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
