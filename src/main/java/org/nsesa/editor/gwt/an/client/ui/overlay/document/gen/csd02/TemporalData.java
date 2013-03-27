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

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.TemporalGroup;
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
* 
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class TemporalData extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,-1,        new StructureIndicator.DefaultElement(1,1,new TemporalGroup())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "temporalData");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget temporalData");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>TemporalData</code> object and set up its type
*/
public TemporalData() {
super(create());
setType("temporalData");
}

/**
* Constructor with required attributes
*/
public TemporalData(AnyURISimpleType sourceAttr) {
this();
setSourceAttr(sourceAttr);
}


/**
* Create a <code>TemporalData</code> object with the given DOM element
*/
public TemporalData(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;

        /**
        * Return <code>sourceAttr</code> property
        * @return sourceAttr
        */
        public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
                sourceAttr = new AnyURISimpleType();
                sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
        }
        /**
        * Return <code>sourceAttr</code> property in DSL way
        * @return sourceAttr
        */
        public AnyURISimpleType sourceAttr() {
        return  getSourceAttr();
        }
        /**
        * Set <code>sourceAttr</code> property
        * @param sourceAttr the new value
        */
        public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source",sourceAttr.getValue());
        }
        /**
        * Set <code>sourceAttr</code> property in DSL way
        * @param sourceAttr the new value
        * @return <code>TemporalData</code> instance
        */
        public TemporalData sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
        }
            /**
            * Return <code>java.util.List<TemporalGroup></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<TemporalGroup> getTemporalGroups() {
                java.util.List<TemporalGroup> result = new ArrayList<TemporalGroup>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TemporalGroup".equalsIgnoreCase(widget.getType())) {
            result.add((TemporalGroup)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<TemporalGroup></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<TemporalGroup> getTemporalGroupList() {
            return  getTemporalGroups();
            }
            /**
            * Add <code>java.util.List<TemporalGroup></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public TemporalGroup addTemporalGroup(TemporalGroup temporalGroupElem) {
                this.addOverlayWidget(temporalGroupElem);
                return temporalGroupElem;
            }

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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
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
public TemporalData html(String s) {
    super.html(s);
    return this;
}
}

