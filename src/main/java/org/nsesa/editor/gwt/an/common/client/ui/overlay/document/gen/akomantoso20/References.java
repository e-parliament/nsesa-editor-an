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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.RefItemsComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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
* The element references is a metadata container of all the references to entities external to the document mentioned in the document. They include references to legal documents of any form,a s well as references to people, organizations, events, roles, concepts, and anything else is managed by the Akoma Ntoso ontology.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class References extends RefItemsComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Original())
,        new StructureIndicator.DefaultElement(1,1,new PassiveRef())
,        new StructureIndicator.DefaultElement(1,1,new ActiveRef())
,        new StructureIndicator.DefaultElement(1,1,new Jurisprudence())
,        new StructureIndicator.DefaultElement(1,1,new HasAttachment())
,        new StructureIndicator.DefaultElement(1,1,new AttachmentOf())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new TLCPerson())
,        new StructureIndicator.DefaultElement(1,1,new TLCOrganization())
,        new StructureIndicator.DefaultElement(1,1,new TLCConcept())
,        new StructureIndicator.DefaultElement(1,1,new TLCObject())
,        new StructureIndicator.DefaultElement(1,1,new TLCEvent())
,        new StructureIndicator.DefaultElement(1,1,new TLCLocation())
,        new StructureIndicator.DefaultElement(1,1,new TLCProcess())
,        new StructureIndicator.DefaultElement(1,1,new TLCRole())
,        new StructureIndicator.DefaultElement(1,1,new TLCTerm())
,        new StructureIndicator.DefaultElement(1,1,new TLCReference())
)
)
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "references");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget references");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>References</code> object and set up its type
*/
public References() {
super(create());
setType("references");
}

/**
* Constructor with required attributes
*/
public References(AnyURISimpleType sourceAttr) {
this();
setSourceAttr(sourceAttr);
}


/**
* Create a <code>References</code> object with the given DOM element
*/
public References(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>sourceAttr</code> property in DSL way
        * @param sourceAttr new value
        * @return <code> References</code> instance
        */
        public References sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
        }

/**
* Returns the namespace URI of this amendable widget.
* @return The namesapce as String
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
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
public References html(String s) {
    super.html(s);
    return this;
}
}

