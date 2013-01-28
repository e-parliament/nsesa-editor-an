package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.HierarchyComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Subtitle extends HierarchyComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "subtitle");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget subtitle");
return span;
}

// CONSTRUCTORS ------------------
public Subtitle() {
super(create());
setType("subtitle");
}

public Subtitle(Element element) {
super(element);
}

// FIELDS ------------------

/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"alinea","article","book","chapter","clause","componentRef","content","division","hcontainer","heading","indent","intro","list","num","paragraph","part","point","section","subchapter","subclause","subheading","sublist","subparagraph","subpart","subsection","subtitle","title","tome","wrap"};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
return attrs;
}
}

