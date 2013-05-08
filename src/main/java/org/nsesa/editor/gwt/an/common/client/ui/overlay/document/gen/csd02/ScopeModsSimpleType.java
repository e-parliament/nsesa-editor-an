package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

/**
* The simple type ScopeMods lists all the types of modifications in scope as values for the type attribute of the scopeMod element.* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum ScopeModsSimpleType {

// FIELDS ------------------

EXCEPTIONOFSCOPE("exceptionOfScope"),
EXTENSIONOFSCOPE("extensionOfScope")
;
private final String value;

/**
* Create an instance of ScopeModsSimpleType class with the given String
*/
ScopeModsSimpleType(String v) {
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
* @return ScopeModsSimpleType or <code>null</code>
*/
public static ScopeModsSimpleType fromString(String text) {
if (text == null) return null;
for (ScopeModsSimpleType en : ScopeModsSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
