package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
* The element FRBRuri is the metadata property containing the URI of the whole document in the respective level of the FRBR hierarchy
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class FRBRuri extends ValueTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "FRBRuri");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget FRBRuri");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>FRBRuri</code> object and set up its type
*/
public FRBRuri() {
super(create());
setType("FRBRuri");
}

/**
* Constructor with required attributes
*/
public FRBRuri(StringSimpleType valueAttr) {
this();
setValueAttr(valueAttr);
}


/**
* Create a <code>FRBRuri</code> object with the given DOM element
*/
public FRBRuri(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>valueAttr</code> property in DSL way
        * @param valueAttr new value
        * @return <code> FRBRuri</code> instance
        */
        public FRBRuri valueAttr(final StringSimpleType valueAttr) {
        setValueAttr(valueAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> FRBRuri</code> instance
        */
        public FRBRuri wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> FRBRuri</code> instance
        */
        public FRBRuri idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> FRBRuri</code> instance
        */
        public FRBRuri evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
public FRBRuri html(String s) {
    super.html(s);
    return this;
}
}

