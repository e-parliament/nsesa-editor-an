package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

/**
* This is the list of allowed values for the type attribute of the event and action elements* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum EventTypeSimpleType {

// FIELDS ------------------

GENERATION("generation"),
AMENDMENT("amendment"),
REPEAL("repeal")
;
private final String value;

/**
* Create an instance of EventTypeSimpleType class with the given String
*/
EventTypeSimpleType(String v) {
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
* @return EventTypeSimpleType or <code>null</code>
*/
public static EventTypeSimpleType fromString(String text) {
if (text == null) return null;
for (EventTypeSimpleType en : EventTypeSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
