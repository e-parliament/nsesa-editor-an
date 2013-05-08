package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
* The element step is a metadata element specifying facts about a workflow step occurred to the<br/> document. For each event, a date, a type, an actor (and the corresponding role) that generated the<br/> action must be referenced. The outcome, too, can be specified.
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
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
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
    private DateSimpleType dateAttr;
    private AnyURISimpleType outcomeAttr;
    private AnyURISimpleType asAttr;
    private AnyURISimpleType actorAttr;

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
//Override all attributes methods to be conformant with DSL approach
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
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Step</code> instance
        */
        public Step wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
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
        attrs.put("date", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("outcome", getOutcomeAttr() != null ? getOutcomeAttr().getValue() : null);
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("actor", getActorAttr() != null ? getActorAttr().getValue() : null);
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

