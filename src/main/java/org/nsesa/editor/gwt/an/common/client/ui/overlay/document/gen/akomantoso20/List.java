package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.HierarchyComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
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
* this element is a hierarchical container called "list" either explicitly or due to the local<br/> tradition
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class List extends HierarchyComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Intro())
,        new StructureIndicator.DefaultChoice(1,-1,        new StructureIndicator.DefaultElement(1,1,new ComponentRef())
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Clause())
,        new StructureIndicator.DefaultElement(1,1,new Section())
,        new StructureIndicator.DefaultElement(1,1,new Part())
,        new StructureIndicator.DefaultElement(1,1,new Paragraph())
,        new StructureIndicator.DefaultElement(1,1,new Chapter())
,        new StructureIndicator.DefaultElement(1,1,new Title())
,        new StructureIndicator.DefaultElement(1,1,new Article())
,        new StructureIndicator.DefaultElement(1,1,new Book())
,        new StructureIndicator.DefaultElement(1,1,new Tome())
,        new StructureIndicator.DefaultElement(1,1,new Division())
,        new StructureIndicator.DefaultElement(1,1,new List())
,        new StructureIndicator.DefaultElement(1,1,new Point())
,        new StructureIndicator.DefaultElement(1,1,new Indent())
,        new StructureIndicator.DefaultElement(1,1,new Alinea())
,        new StructureIndicator.DefaultElement(1,1,new Subsection())
,        new StructureIndicator.DefaultElement(1,1,new Subpart())
,        new StructureIndicator.DefaultElement(1,1,new Subparagraph())
,        new StructureIndicator.DefaultElement(1,1,new Subchapter())
,        new StructureIndicator.DefaultElement(1,1,new Subtitle())
,        new StructureIndicator.DefaultElement(1,1,new Subclause())
,        new StructureIndicator.DefaultElement(1,1,new Sublist())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Hcontainer())
)
)
)
,        new StructureIndicator.DefaultElement(0,1,new Wrap())
)
,        new StructureIndicator.DefaultElement(1,1,new Content())
)
        ,

        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Num())
,        new StructureIndicator.DefaultElement(0,1,new Heading())
,        new StructureIndicator.DefaultElement(0,1,new Subheading())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "list");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget list");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>List</code> object and set up its type
*/
public List() {
super(create());
setType("list");
}

/**
* Constructor with required attributes
*/
public List(IDSimpleType idAttr) {
this();
setIdAttr(idAttr);
}


/**
* Create a <code>List</code> object with the given DOM element
*/
public List(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> List</code> instance
        */
        public List alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> List</code> instance
        */
        public List classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> List</code> instance
        */
        public List styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> List</code> instance
        */
        public List titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> List</code> instance
        */
        public List refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> List</code> instance
        */
        public List wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> List</code> instance
        */
        public List langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> List</code> instance
        */
        public List idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> List</code> instance
        */
        public List evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> List</code> instance
        */
        public List statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> List</code> instance
        */
        public List periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
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
public List html(String s) {
    super.html(s);
    return this;
}
}

