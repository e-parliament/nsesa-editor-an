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
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
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
* The element FRBRauthor is the metadata property containing a relevant author of the document in the respective level of the FRBR hierarchy. Attribute as specifies the role of the author.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class FRBRauthor extends MetaoptComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "FRBRauthor");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget FRBRauthor");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>FRBRauthor</code> object and set up its type
*/
public FRBRauthor() {
super(create());
setType("FRBRauthor");
}

/**
* Constructor with required attributes
*/
public FRBRauthor(AnyURISimpleType hrefAttr) {
this();
setHrefAttr(hrefAttr);
}


/**
* Create a <code>FRBRauthor</code> object with the given DOM element
*/
public FRBRauthor(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType asAttr;
    private AnyURISimpleType hrefAttr;

        /**
        * Return <code>asAttr</code> property
        * @return asAttr
        */
        public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
                asAttr = new AnyURISimpleType();
                asAttr.setValue(getElement().getAttribute("as"));
        }

        return asAttr;
        }
        /**
        * Return <code>asAttr</code> property in DSL way
        * @return asAttr
        */
        public AnyURISimpleType asAttr() {
        return  getAsAttr();
        }
        /**
        * Set <code>asAttr</code> property
        * @param asAttr the new value
        */
        public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
        getElement().setAttribute("as",asAttr.getValue());
        }
        /**
        * Set <code>asAttr</code> property in DSL way
        * @param asAttr the new value
        * @return <code>FRBRauthor</code> instance
        */
        public FRBRauthor asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
        }
        /**
        * Return <code>hrefAttr</code> property
        * @return hrefAttr
        */
        public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
                hrefAttr = new AnyURISimpleType();
                hrefAttr.setValue(getElement().getAttribute("href"));
        }

        return hrefAttr;
        }
        /**
        * Return <code>hrefAttr</code> property in DSL way
        * @return hrefAttr
        */
        public AnyURISimpleType hrefAttr() {
        return  getHrefAttr();
        }
        /**
        * Set <code>hrefAttr</code> property
        * @param hrefAttr the new value
        */
        public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
        getElement().setAttribute("href",hrefAttr.getValue());
        }
        /**
        * Set <code>hrefAttr</code> property in DSL way
        * @param hrefAttr the new value
        * @return <code>FRBRauthor</code> instance
        */
        public FRBRauthor hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> FRBRauthor</code> instance
        */
        public FRBRauthor idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> FRBRauthor</code> instance
        */
        public FRBRauthor evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> FRBRauthor</code> instance
        */
        public FRBRauthor wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
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
public FRBRauthor html(String s) {
    super.html(s);
    return this;
}
}

