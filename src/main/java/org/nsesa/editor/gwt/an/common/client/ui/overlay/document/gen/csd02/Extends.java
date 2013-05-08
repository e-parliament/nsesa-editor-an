package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.JudicialArgumentTypeComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
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
* The element extends is a metadata element specifying a reference to a source extended by the argument being described.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Extends extends JudicialArgumentTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,-1,new Source())
,        new StructureIndicator.DefaultElement(1,-1,new Destination())
,        new StructureIndicator.DefaultElement(0,1,new Condition())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "extends");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget extends");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Extends</code> object and set up its type
*/
public Extends() {
super(create());
setType("extends");
}

/**
* Constructor with required attributes
*/
public Extends(IDSimpleType idAttr) {
this();
setIdAttr(idAttr);
}


/**
* Create a <code>Extends</code> object with the given DOM element
*/
public Extends(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Extends</code> instance
        */
        public Extends idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Extends</code> instance
        */
        public Extends evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Extends</code> instance
        */
        public Extends wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> Extends</code> instance
        */
        public Extends statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> Extends</code> instance
        */
        public Extends refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>exclusionAttr</code> property in DSL way
        * @param exclusionAttr new value
        * @return <code> Extends</code> instance
        */
        public Extends exclusionAttr(final BooleanSimpleType exclusionAttr) {
        setExclusionAttr(exclusionAttr);
        return this;
        }
        /**
        * Set <code>incompleteAttr</code> property in DSL way
        * @param incompleteAttr new value
        * @return <code> Extends</code> instance
        */
        public Extends incompleteAttr(final BooleanSimpleType incompleteAttr) {
        setIncompleteAttr(incompleteAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> Extends</code> instance
        */
        public Extends periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
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
public Extends html(String s) {
    super.html(s);
    return this;
}
}

