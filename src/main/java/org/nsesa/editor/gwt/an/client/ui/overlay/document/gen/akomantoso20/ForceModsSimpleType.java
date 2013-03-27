/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* The simple type ForceMods lists all the types of modifications in force as values for the type attribute of the forceMod element.* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum ForceModsSimpleType {

// FIELDS ------------------

ENTRYINTOFORCE("entryIntoForce"),
ENDOFENACTMENT("endOfEnactment"),
POSTPONEMENTOFENTRYINTOFORCE("postponementOfEntryIntoForce"),
PROROGATIONOFFORCE("prorogationOfForce"),
REENACTMENT("reEnactment"),
UNCOSTITUTIONALITY("uncostitutionality")
;
private final String value;

/**
* Create an instance of ForceModsSimpleType class with the given String
*/
ForceModsSimpleType(String v) {
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
* @return ForceModsSimpleType or <code>null</code>
*/
public static ForceModsSimpleType fromString(String text) {
if (text == null) return null;
for (ForceModsSimpleType en : ForceModsSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
