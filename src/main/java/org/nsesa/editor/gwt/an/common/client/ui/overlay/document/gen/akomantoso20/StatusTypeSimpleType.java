/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This is the list of allowed values for the status attribute* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum StatusTypeSimpleType {

// FIELDS ------------------

OMISSIS("omissis"),
REPEALED("repealed"),
SUSPENDED("suspended"),
EDITORIAL("editorial"),
IGNORE("ignore"),
TRANSLATED("translated"),
EDITED("edited"),
VERBATIM("verbatim")
;
private final String value;

/**
* Create an instance of StatusTypeSimpleType class with the given String
*/
StatusTypeSimpleType(String v) {
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
* @return StatusTypeSimpleType or <code>null</code>
*/
public static StatusTypeSimpleType fromString(String text) {
if (text == null) return null;
for (StatusTypeSimpleType en : StatusTypeSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
