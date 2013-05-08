package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This is the list of allowed values for the type attribute of the result element* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum ResultTypeSimpleType {

// FIELDS ------------------

DENY("deny"),
DISMISS("dismiss"),
UPHOLD("uphold"),
REVERT("revert"),
REPLACEORDER("replaceOrder"),
REMIT("remit"),
DECIDE("decide"),
APPROVE("approve")
;
private final String value;

/**
* Create an instance of ResultTypeSimpleType class with the given String
*/
ResultTypeSimpleType(String v) {
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
* @return ResultTypeSimpleType or <code>null</code>
*/
public static ResultTypeSimpleType fromString(String text) {
if (text == null) return null;
for (ResultTypeSimpleType en : ResultTypeSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
