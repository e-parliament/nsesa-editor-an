package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.UnsignedIntSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class UnsignedShortSimpleType extends UnsignedIntSimpleType  {


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "unsignedShortSimpleType");
span.setAttribute("ns", "http://www.w3.org/2001/XMLSchema");
span.setClassName("widget unsignedShortSimpleType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create an empty <code>UnsignedShortSimpleType</code> object
*/
public UnsignedShortSimpleType() {
super();
}
/**
* Create a <code>UnsignedShortSimpleType</code> object with teh given input data
*/
public UnsignedShortSimpleType(String value) {
super();
this.value = value;
}

// FIELDS ------------------
}

