package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

/**
* The simple type TextualMods lists all the types of textual modifications as values for the type attribute of the textualMod element.* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum TextualModsSimpleType {

// FIELDS ------------------

REPEAL("repeal"),
SUBSTITUTION("substitution"),
INSERTION("insertion"),
REPLACEMENT("replacement"),
RENUMBERING("renumbering")
;
private final String value;

/**
* Create an instance of TextualModsSimpleType class with the given String
*/
TextualModsSimpleType(String v) {
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
* @return TextualModsSimpleType or <code>null</code>
*/
public static TextualModsSimpleType fromString(String text) {
if (text == null) return null;
for (TextualModsSimpleType en : TextualModsSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
