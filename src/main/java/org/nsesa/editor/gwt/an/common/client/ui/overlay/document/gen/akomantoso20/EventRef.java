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

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.EventTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.YesNoTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
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
* The element eventInfo is a metadata element specifying facts about an event that had an effect on the document. For each event, a date, a type and a document that generated the event must be referenced.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class EventRef extends AnyOtherTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultWildcard(0,-1)
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "eventRef");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget eventRef");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>EventRef</code> object and set up its type
*/
public EventRef() {
super(create());
setType("eventRef");
}

/**
* Constructor with required attributes
*/
public EventRef(AnyURISimpleType sourceAttr,DateSimpleType dateAttr) {
this();
setSourceAttr(sourceAttr);
setDateAttr(dateAttr);
}


/**
* Create a <code>EventRef</code> object with the given DOM element
*/
public EventRef(Element element) {
super(element);
}

// FIELDS ------------------
    private EventTypeSimpleType typeAttr;
    private YesNoTypeSimpleType originatingExpressionAttr;
    private AnyURISimpleType sourceAttr;
    private DateSimpleType dateAttr;

        /**
        * Return <code>typeAttr</code> property
        * @return typeAttr
        */
        public EventTypeSimpleType getTypeAttr() {
        if (typeAttr == null) {
                typeAttr = EventTypeSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
        }
        /**
        * Return <code>typeAttr</code> property in DSL way
        * @return typeAttr
        */
        public EventTypeSimpleType typeAttr() {
        return  getTypeAttr();
        }
        /**
        * Set <code>typeAttr</code> property
        * @param typeAttr the new value
        */
        public void setTypeAttr(final EventTypeSimpleType typeAttr) {
        this.typeAttr = typeAttr;
        getElement().setAttribute("type",typeAttr.value());
        }
        /**
        * Set <code>typeAttr</code> property in DSL way
        * @param typeAttr the new value
        * @return <code>EventRef</code> instance
        */
        public EventRef typeAttr(final EventTypeSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
        }
        /**
        * Return <code>originatingExpressionAttr</code> property
        * @return originatingExpressionAttr
        */
        public YesNoTypeSimpleType getOriginatingExpressionAttr() {
        if (originatingExpressionAttr == null) {
                originatingExpressionAttr = YesNoTypeSimpleType.fromString(getElement().getAttribute("originatingExpression"));
        }

        return originatingExpressionAttr;
        }
        /**
        * Return <code>originatingExpressionAttr</code> property in DSL way
        * @return originatingExpressionAttr
        */
        public YesNoTypeSimpleType originatingExpressionAttr() {
        return  getOriginatingExpressionAttr();
        }
        /**
        * Set <code>originatingExpressionAttr</code> property
        * @param originatingExpressionAttr the new value
        */
        public void setOriginatingExpressionAttr(final YesNoTypeSimpleType originatingExpressionAttr) {
        this.originatingExpressionAttr = originatingExpressionAttr;
        getElement().setAttribute("originatingExpression",originatingExpressionAttr.value());
        }
        /**
        * Set <code>originatingExpressionAttr</code> property in DSL way
        * @param originatingExpressionAttr the new value
        * @return <code>EventRef</code> instance
        */
        public EventRef originatingExpressionAttr(final YesNoTypeSimpleType originatingExpressionAttr) {
        setOriginatingExpressionAttr(originatingExpressionAttr);
        return this;
        }
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
        * @return <code>EventRef</code> instance
        */
        public EventRef sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
        }
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
        * @return <code>EventRef</code> instance
        */
        public EventRef dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>hrefAttr</code> property in DSL way
        * @param hrefAttr new value
        * @return <code> EventRef</code> instance
        */
        public EventRef hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> EventRef</code> instance
        */
        public EventRef wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> EventRef</code> instance
        */
        public EventRef idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> EventRef</code> instance
        */
        public EventRef evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        attrs.put("originatingExpression", getOriginatingExpressionAttr() != null ? getOriginatingExpressionAttr().value() : null);
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        attrs.put("date", getDateAttr() != null ? getDateAttr().getValue() : null);
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
public EventRef html(String s) {
    super.html(s);
    return this;
}
}

