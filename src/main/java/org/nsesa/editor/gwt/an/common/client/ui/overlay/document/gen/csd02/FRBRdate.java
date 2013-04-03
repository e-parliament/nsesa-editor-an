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

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.MetaoptComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
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
* The element FRBRdate is the metadata property containing a relevant date of the document in the respective level of the FRBR hierarchy. Attribute name specifies which actual date is contained here.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class FRBRdate extends MetaoptComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "FRBRdate");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget FRBRdate");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>FRBRdate</code> object and set up its type
*/
public FRBRdate() {
super(create());
setType("FRBRdate");
}

/**
* Constructor with required attributes
*/
public FRBRdate(DateSimpleType dateAttr,StringSimpleType nameAttr) {
this();
setDateAttr(dateAttr);
setNameAttr(nameAttr);
}


/**
* Create a <code>FRBRdate</code> object with the given DOM element
*/
public FRBRdate(Element element) {
super(element);
}

// FIELDS ------------------
    private DateSimpleType dateAttr;
    private StringSimpleType nameAttr;

        /**
        * Return <code>dateAttr</code> property
        * @return dateAttr
        */
        public DateSimpleType getDateAttr() {
        if (dateAttr == null) {
                dateAttr = new DateSimpleType();
                dateAttr.setValue(getElement().getAttribute("date"));
        }

        return dateAttr;
        }
        /**
        * Return <code>dateAttr</code> property in DSL way
        * @return dateAttr
        */
        public DateSimpleType dateAttr() {
        return  getDateAttr();
        }
        /**
        * Set <code>dateAttr</code> property
        * @param dateAttr the new value
        */
        public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
        getElement().setAttribute("date",dateAttr.getValue());
        }
        /**
        * Set <code>dateAttr</code> property in DSL way
        * @param dateAttr the new value
        * @return <code>FRBRdate</code> instance
        */
        public FRBRdate dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
        }
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
        * @return <code>FRBRdate</code> instance
        */
        public FRBRdate nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> FRBRdate</code> instance
        */
        public FRBRdate wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> FRBRdate</code> instance
        */
        public FRBRdate idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> FRBRdate</code> instance
        */
        public FRBRdate evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
        attrs.put("date", getDateAttr() != null ? getDateAttr().getValue() : null);
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
public FRBRdate html(String s) {
    super.html(s);
    return this;
}
}

