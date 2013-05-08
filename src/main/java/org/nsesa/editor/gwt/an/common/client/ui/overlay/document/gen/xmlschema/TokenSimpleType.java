package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class TokenSimpleType extends NormalizedStringSimpleType  {


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "tokenSimpleType");
span.setAttribute("ns", "http://www.w3.org/2001/XMLSchema");
span.setClassName("widget tokenSimpleType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create an empty <code>TokenSimpleType</code> object
*/
public TokenSimpleType() {
super();
}
/**
* Create a <code>TokenSimpleType</code> object with teh given input data
*/
public TokenSimpleType(String value) {
super();
this.value = value;
}

// FIELDS ------------------
}

