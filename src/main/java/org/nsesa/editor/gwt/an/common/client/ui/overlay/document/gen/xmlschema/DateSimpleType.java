package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class DateSimpleType extends AnySimpleTypeSimpleType  {


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "dateSimpleType");
span.setAttribute("ns", "http://www.w3.org/2001/XMLSchema");
span.setClassName("widget dateSimpleType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create an empty <code>DateSimpleType</code> object
*/
public DateSimpleType() {
super();
}
/**
* Create a <code>DateSimpleType</code> object with teh given input data
*/
public DateSimpleType(String value) {
super();
this.value = value;
}

// FIELDS ------------------
}

