package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

/**
* This is the list of allowed values for the type attribute of the recordedTime element* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum TimeTypeSimpleType {

// FIELDS ------------------

STARTEVENT("startEvent"),
ENDEVENT("endEvent")
;
private final String value;

/**
* Create an instance of TimeTypeSimpleType class with the given String
*/
TimeTypeSimpleType(String v) {
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
* @return TimeTypeSimpleType or <code>null</code>
*/
public static TimeTypeSimpleType fromString(String text) {
if (text == null) return null;
for (TimeTypeSimpleType en : TimeTypeSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
