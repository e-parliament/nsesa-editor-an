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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
 * Generated class
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class QNameSimpleType extends AnySimpleTypeSimpleType {


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "QNameSimpleType");
        span.setAttribute("data-ns", "http://www.w3.org/2001/XMLSchema");
        span.setClassName("widget QNameSimpleType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create an empty <code>QNameSimpleType</code> object
     */
    public QNameSimpleType() {
        super();
    }

    /**
     * Create a <code>QNameSimpleType</code> object with teh given input data
     */
    public QNameSimpleType(String value) {
        super();
        this.value = value;
    }

// FIELDS ------------------
}

