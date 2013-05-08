package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
* the element eol (end of line) is a marker for where in the original text the line breaks. If the line breaks within a word, place the element BEFORE the word and place the number of characters before the break in the attribute breakat
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Eol extends EolTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "eol");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget eol");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Eol</code> object and set up its type
*/
public Eol() {
super(create());
setType("eol");
}



/**
* Create a <code>Eol</code> object with the given DOM element
*/
public Eol(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>breakatAttr</code> property in DSL way
        * @param breakatAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol breakatAttr(final IntegerSimpleType breakatAttr) {
        setBreakatAttr(breakatAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>spaceAttr</code> property in DSL way
        * @param spaceAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> Eol</code> instance
        */
        public Eol periodAttr(final AnyURISimpleType periodAttr) {
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
public Eol html(String s) {
    super.html(s);
    return this;
}
}

