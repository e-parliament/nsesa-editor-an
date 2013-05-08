package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;

/**
* This attribute specifies the human language in which the document the element refers to is<br/> expressed. Values are taken from the RFC 4646.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class LanguageSimpleType extends StringSimpleType  {


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "languageSimpleType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget languageSimpleType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create an empty <code>LanguageSimpleType</code> object
*/
public LanguageSimpleType() {
super();
}
/**
* Create a <code>LanguageSimpleType</code> object with teh given input data
*/
public LanguageSimpleType(String value) {
super();
this.value = value;
}

// FIELDS ------------------
}

