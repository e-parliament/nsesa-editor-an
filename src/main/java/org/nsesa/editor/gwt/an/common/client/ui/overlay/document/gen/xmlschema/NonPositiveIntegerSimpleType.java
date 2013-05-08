package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class NonPositiveIntegerSimpleType extends IntegerSimpleType  {


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "nonPositiveIntegerSimpleType");
span.setAttribute("ns", "http://www.w3.org/2001/XMLSchema");
span.setClassName("widget nonPositiveIntegerSimpleType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create an empty <code>NonPositiveIntegerSimpleType</code> object
*/
public NonPositiveIntegerSimpleType() {
super();
}
/**
* Create a <code>NonPositiveIntegerSimpleType</code> object with teh given input data
*/
public NonPositiveIntegerSimpleType(String value) {
super();
this.value = value;
}

// FIELDS ------------------
}

