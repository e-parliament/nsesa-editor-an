package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AlthierarchyComplexType;
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

public class AdministrationOfOath extends AlthierarchyComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "administrationOfOath");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget administrationOfOath");
return span;
}

// CONSTRUCTORS ------------------
public AdministrationOfOath() {
super(create());
setType("administrationOfOath");
}

public AdministrationOfOath(Element element) {
super(element);
}

// FIELDS ------------------

/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"address","adjournment","administrationOfOath","answer","block","blockList","communication","componentRef","container","debateSection","declarationOfVote","div","foreign","heading","ministerialStatements","narrative","nationalInterest","noticesOfMotion","num","ol","oralStatements","other","p","papers","personalStatements","petitions","pointOfOrder","prayers","proceduralMotions","question","questions","resolutions","rollCall","scene","speech","subheading","summary","table","tblock","toc","ul","writtenStatements"};
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

