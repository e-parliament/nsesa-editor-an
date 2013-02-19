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
 * This file is generated.
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
    APPROVE("approve");
    private final String value;

    ResultTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultTypeSimpleType fromString(String text) {
        if (text == null) return null;
        for (ResultTypeSimpleType en : ResultTypeSimpleType.values()) {
            if (text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
