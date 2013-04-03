/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
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

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.CollectionStructureComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.VersionTypeSimpleType;
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
* Element documentCollection is used for describing the structure and content of a collection of other documents chosen and combined for any reason whatsoever
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class DocumentCollection extends CollectionStructureComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new Meta())
,        new StructureIndicator.DefaultElement(0,1,new CoverPage())
,        new StructureIndicator.DefaultElement(0,1,new Preface())
,        new StructureIndicator.DefaultElement(1,1,new CollectionBody())
,        new StructureIndicator.DefaultElement(0,1,new Conclusions())
,        new StructureIndicator.DefaultElement(0,1,new Attachments())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "documentCollection");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget documentCollection");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>DocumentCollection</code> object and set up its type
*/
public DocumentCollection() {
super(create());
setType("documentCollection");
}

/**
* Constructor with required attributes
*/
public DocumentCollection(StringSimpleType nameAttr) {
this();
setNameAttr(nameAttr);
}


/**
* Create a <code>DocumentCollection</code> object with the given DOM element
*/
public DocumentCollection(Element element) {
super(element);
}

// FIELDS ------------------
    private StringSimpleType nameAttr;

        /**
        * Return <code>nameAttr</code> property
        * @return nameAttr
        */
        public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
                nameAttr = new StringSimpleType();
                nameAttr.setValue(getElement().getAttribute("name"));
        }

        return nameAttr;
        }
        /**
        * Return <code>nameAttr</code> property in DSL way
        * @return nameAttr
        */
        public StringSimpleType nameAttr() {
        return  getNameAttr();
        }
        /**
        * Set <code>nameAttr</code> property
        * @param nameAttr the new value
        */
        public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
        getElement().setAttribute("name",nameAttr.getValue());
        }
        /**
        * Set <code>nameAttr</code> property in DSL way
        * @param nameAttr the new value
        * @return <code>DocumentCollection</code> instance
        */
        public DocumentCollection nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>containsAttr</code> property in DSL way
        * @param containsAttr new value
        * @return <code> DocumentCollection</code> instance
        */
        public DocumentCollection containsAttr(final VersionTypeSimpleType containsAttr) {
        setContainsAttr(containsAttr);
        return this;
        }

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
        attrs.put("name", getNameAttr() != null ? getNameAttr().getValue() : null);
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
public DocumentCollection html(String s) {
    super.html(s);
    return this;
}
}

