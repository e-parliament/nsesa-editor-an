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

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ReferenceTypeComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
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
* The element hasAttachment is a metadata reference to the Akoma Ntoso URI of an attachment of this document
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class HasAttachment extends ReferenceTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "hasAttachment");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget hasAttachment");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>HasAttachment</code> object and set up its type
*/
public HasAttachment() {
super(create());
setType("hasAttachment");
}

/**
* Constructor with required attributes
*/
public HasAttachment(StringSimpleType showAsAttr,IDSimpleType idAttr,AnyURISimpleType hrefAttr) {
this();
setShowAsAttr(showAsAttr);
setIdAttr(idAttr);
setHrefAttr(hrefAttr);
}


/**
* Create a <code>HasAttachment</code> object with the given DOM element
*/
public HasAttachment(Element element) {
super(element);
}

// FIELDS ------------------
    private StringSimpleType typeAttr;

        /**
        * Return <code>typeAttr</code> property
        * @return typeAttr
        */
        public StringSimpleType getTypeAttr() {
        if (typeAttr == null) {
                typeAttr = new StringSimpleType();
                typeAttr.setValue(getElement().getAttribute("type"));
        }

        return typeAttr;
        }
        /**
        * Return <code>typeAttr</code> property in DSL way
        * @return typeAttr
        */
        public StringSimpleType typeAttr() {
        return  getTypeAttr();
        }
        /**
        * Set <code>typeAttr</code> property
        * @param typeAttr the new value
        */
        public void setTypeAttr(final StringSimpleType typeAttr) {
        this.typeAttr = typeAttr;
        getElement().setAttribute("type",typeAttr.getValue());
        }
        /**
        * Set <code>typeAttr</code> property in DSL way
        * @param typeAttr the new value
        * @return <code>HasAttachment</code> instance
        */
        public HasAttachment typeAttr(final StringSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>showAsAttr</code> property in DSL way
        * @param showAsAttr new value
        * @return <code> HasAttachment</code> instance
        */
        public HasAttachment showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
        }
        /**
        * Set <code>shortFormAttr</code> property in DSL way
        * @param shortFormAttr new value
        * @return <code> HasAttachment</code> instance
        */
        public HasAttachment shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> HasAttachment</code> instance
        */
        public HasAttachment idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> HasAttachment</code> instance
        */
        public HasAttachment evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> HasAttachment</code> instance
        */
        public HasAttachment wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>hrefAttr</code> property in DSL way
        * @param hrefAttr new value
        * @return <code> HasAttachment</code> instance
        */
        public HasAttachment hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().getValue() : null);
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
public HasAttachment html(String s) {
    super.html(s);
    return this;
}
}

