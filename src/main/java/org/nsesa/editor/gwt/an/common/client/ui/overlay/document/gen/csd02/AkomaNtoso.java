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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.AkomaNtosoTypeComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* NAME akomaNtoso the element akomaNtoso is the root element of all document types in Akoma Ntoso. It follows the pattern Universal Root (http://www.xmlpatterns.com/UniversalRootMain.shtml)
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class AkomaNtoso extends AkomaNtosoTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new AmendmentList())
,        new StructureIndicator.DefaultElement(1,1,new OfficialGazette())
,        new StructureIndicator.DefaultElement(1,1,new DocumentCollection())
,        new StructureIndicator.DefaultElement(1,1,new Act())
,        new StructureIndicator.DefaultElement(1,1,new Bill())
,        new StructureIndicator.DefaultElement(1,1,new DebateReport())
,        new StructureIndicator.DefaultElement(1,1,new Debate())
,        new StructureIndicator.DefaultElement(1,1,new Amendment())
,        new StructureIndicator.DefaultElement(1,1,new Judgement())
,        new StructureIndicator.DefaultElement(1,1,new Fragment())
,        new StructureIndicator.DefaultElement(1,1,new Doc())
)
)
)
,        new StructureIndicator.DefaultElement(0,1,new Components())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "akomaNtoso");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget akomaNtoso");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>AkomaNtoso</code> object and set up its type
*/
public AkomaNtoso() {
super(create());
setType("akomaNtoso");
}



/**
* Create a <code>AkomaNtoso</code> object with the given DOM element
*/
public AkomaNtoso(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

/**
* Returns the namespace URI of this amendable widget.
* @return The namesapce as String
*/
@Override
public String getNamespaceURI() {
return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
}

@Override
public LinkedHashMap<String, String> getAttributes() {
final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
attrs.putAll(super.getAttributes());
return attrs;
}

@Override
public StructureIndicator getStructureIndicator() {
    return STRUCTURE_INDICATOR;
}

/**
* DSL Style for html method
*/
@Override
public AkomaNtoso html(String s) {
    super.html(s);
    return this;
}
}

