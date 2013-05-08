package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* The simple type EfficacyMods lists all the types of modifications in efficacy as values for the type attribute of the efficacyMod element.* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum EfficacyModsSimpleType {

// FIELDS ------------------

ENTRYINTOEFFICACY("entryIntoEfficacy"),
ENDOFEFFICACY("endOfEfficacy"),
INAPPLICATION("inapplication"),
RETROACTIVITY("retroactivity"),
EXTRAEFFICACY("extraefficacy"),
POSTPONEMENTOFEFFICACY("postponementOfEfficacy"),
PROROGATIONOFEFFICACY("prorogationOfEfficacy")
;
private final String value;

/**
* Create an instance of EfficacyModsSimpleType class with the given String
*/
EfficacyModsSimpleType(String v) {
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
* @return EfficacyModsSimpleType or <code>null</code>
*/
public static EfficacyModsSimpleType fromString(String text) {
if (text == null) return null;
for (EfficacyModsSimpleType en : EfficacyModsSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
