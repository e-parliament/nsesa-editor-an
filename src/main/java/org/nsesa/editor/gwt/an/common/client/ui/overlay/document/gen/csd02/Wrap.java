package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
* the element wrap is a concluding element in a hierarchy that contains paragraphs wrapping up the preceding lower hierarchical elements.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Wrap extends BlocksreqComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(0,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new BlockList())
,        new StructureIndicator.DefaultElement(1,1,new Tblock())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Ul())
,        new StructureIndicator.DefaultElement(1,1,new Ol())
,        new StructureIndicator.DefaultElement(1,1,new Table())
,        new StructureIndicator.DefaultElement(1,1,new P())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Foreign())
,        new StructureIndicator.DefaultElement(1,1,new Block())
)
)
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "wrap");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget wrap");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Wrap</code> object and set up its type
*/
public Wrap() {
super(create());
setType("wrap");
}

/**
* Constructor with required attributes
*/
public Wrap(IDSimpleType idAttr) {
this();
setIdAttr(idAttr);
}


/**
* Create a <code>Wrap</code> object with the given DOM element
*/
public Wrap(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>spaceAttr</code> property in DSL way
        * @param spaceAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> Wrap</code> instance
        */
        public Wrap periodAttr(final AnyURISimpleType periodAttr) {
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
public Wrap html(String s) {
    super.html(s);
    return this;
}
}

