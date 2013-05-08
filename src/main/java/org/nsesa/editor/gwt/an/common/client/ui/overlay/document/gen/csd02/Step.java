package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.TimeSimpleType;
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
* The element step is a metadata element specifying facts about a workflow step occurred to the document. For each event, a date, a type, an actor (and the corresponding role) that generated the action must be referenced. The outcome, too, can be specified.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Step extends AnyOtherTypeComplexType  {

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
span.setAttribute("type", "step");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget step");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Step</code> object and set up its type
*/
public Step() {
super(create());
setType("step");
}

/**
* Constructor with required attributes
*/
public Step(DateSimpleType dateAttr) {
this();
setDateAttr(dateAttr);
}


/**
* Create a <code>Step</code> object with the given DOM element
*/
public Step(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType actorAttr;
    private AnyURISimpleType outcomeAttr;
    private AnyURISimpleType asAttr;
    private DateSimpleType dateAttr;
    private TimeSimpleType timeAttr;

        /**
        * Return <code>refersToAttr</code> property
        * @return refersToAttr
        */
        public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
                refersToAttr = new AnyURISimpleType();
                refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
        }
        /**
        * Return <code>refersToAttr</code> property in DSL way
        * @return refersToAttr
        */
        public AnyURISimpleType refersToAttr() {
        return  getRefersToAttr();
        }
        /**
        * Set <code>refersToAttr</code> property
        * @param refersToAttr the new value
        */
        public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo",refersToAttr.getValue());
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr the new value
        * @return <code>Step</code> instance
        */
        public Step refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Return <code>actorAttr</code> property
        * @return actorAttr
        */
        public AnyURISimpleType getActorAttr() {
        if (actorAttr == null) {
                actorAttr = new AnyURISimpleType();
                actorAttr.setValue(getElement().getAttribute("actor"));
        }

        return actorAttr;
        }
        /**
        * Return <code>actorAttr</code> property in DSL way
        * @return actorAttr
        */
        public AnyURISimpleType actorAttr() {
        return  getActorAttr();
        }
        /**
        * Set <code>actorAttr</code> property
        * @param actorAttr the new value
        */
        public void setActorAttr(final AnyURISimpleType actorAttr) {
        this.actorAttr = actorAttr;
        getElement().setAttribute("actor",actorAttr.getValue());
        }
        /**
        * Set <code>actorAttr</code> property in DSL way
        * @param actorAttr the new value
        * @return <code>Step</code> instance
        */
        public Step actorAttr(final AnyURISimpleType actorAttr) {
        setActorAttr(actorAttr);
        return this;
        }
        /**
        * Return <code>outcomeAttr</code> property
        * @return outcomeAttr
        */
        public AnyURISimpleType getOutcomeAttr() {
        if (outcomeAttr == null) {
                outcomeAttr = new AnyURISimpleType();
                outcomeAttr.setValue(getElement().getAttribute("outcome"));
        }

        return outcomeAttr;
        }
        /**
        * Return <code>outcomeAttr</code> property in DSL way
        * @return outcomeAttr
        */
        public AnyURISimpleType outcomeAttr() {
        return  getOutcomeAttr();
        }
        /**
        * Set <code>outcomeAttr</code> property
        * @param outcomeAttr the new value
        */
        public void setOutcomeAttr(final AnyURISimpleType outcomeAttr) {
        this.outcomeAttr = outcomeAttr;
        getElement().setAttribute("outcome",outcomeAttr.getValue());
        }
        /**
        * Set <code>outcomeAttr</code> property in DSL way
        * @param outcomeAttr the new value
        * @return <code>Step</code> instance
        */
        public Step outcomeAttr(final AnyURISimpleType outcomeAttr) {
        setOutcomeAttr(outcomeAttr);
        return this;
        }
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
        * @return <code>Step</code> instance
        */
        public Step asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
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
        * @return <code>Step</code> instance
        */
        public Step dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
        }
        /**
        * Return <code>timeAttr</code> property
        * @return timeAttr
        */
        public TimeSimpleType getTimeAttr() {
        if (timeAttr == null) {
                timeAttr = new TimeSimpleType();
                timeAttr.setValue(getElement().getAttribute("time"));
        }

        return timeAttr;
        }
        /**
        * Return <code>timeAttr</code> property in DSL way
        * @return timeAttr
        */
        public TimeSimpleType timeAttr() {
        return  getTimeAttr();
        }
        /**
        * Set <code>timeAttr</code> property
        * @param timeAttr the new value
        */
        public void setTimeAttr(final TimeSimpleType timeAttr) {
        this.timeAttr = timeAttr;
        getElement().setAttribute("time",timeAttr.getValue());
        }
        /**
        * Set <code>timeAttr</code> property in DSL way
        * @param timeAttr the new value
        * @return <code>Step</code> instance
        */
        public Step timeAttr(final TimeSimpleType timeAttr) {
        setTimeAttr(timeAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Step</code> instance
        */
        public Step idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Step</code> instance
        */
        public Step evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Step</code> instance
        */
        public Step wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>hrefAttr</code> property in DSL way
        * @param hrefAttr new value
        * @return <code> Step</code> instance
        */
        public Step hrefAttr(final AnyURISimpleType hrefAttr) {
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
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("actor", getActorAttr() != null ? getActorAttr().getValue() : null);
        attrs.put("outcome", getOutcomeAttr() != null ? getOutcomeAttr().getValue() : null);
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("date", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("time", getTimeAttr() != null ? getTimeAttr().getValue() : null);
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
public Step html(String s) {
    super.html(s);
    return this;
}
}

