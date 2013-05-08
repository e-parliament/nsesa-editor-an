package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ParliamentaryAnalysisTypeComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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
* The element quorumVerification is a metadata container containing information about an event of<br/> quorum verification happened within a debate.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class QuorumVerification extends ParliamentaryAnalysisTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,-1,        new StructureIndicator.DefaultElement(1,1,new Quorum())
,        new StructureIndicator.DefaultElement(1,1,new Count())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "quorumVerification");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget quorumVerification");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>QuorumVerification</code> object and set up its type
*/
public QuorumVerification() {
super(create());
setType("quorumVerification");
}

/**
* Constructor with required attributes
*/
public QuorumVerification(IDSimpleType idAttr) {
this();
setIdAttr(idAttr);
}


/**
* Create a <code>QuorumVerification</code> object with the given DOM element
*/
public QuorumVerification(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>outcomeAttr</code> property in DSL way
        * @param outcomeAttr new value
        * @return <code> QuorumVerification</code> instance
        */
        public QuorumVerification outcomeAttr(final AnyURISimpleType outcomeAttr) {
        setOutcomeAttr(outcomeAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> QuorumVerification</code> instance
        */
        public QuorumVerification wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>hrefAttr</code> property in DSL way
        * @param hrefAttr new value
        * @return <code> QuorumVerification</code> instance
        */
        public QuorumVerification hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> QuorumVerification</code> instance
        */
        public QuorumVerification refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> QuorumVerification</code> instance
        */
        public QuorumVerification idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> QuorumVerification</code> instance
        */
        public QuorumVerification evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
public QuorumVerification html(String s) {
    super.html(s);
    return this;
}
}

