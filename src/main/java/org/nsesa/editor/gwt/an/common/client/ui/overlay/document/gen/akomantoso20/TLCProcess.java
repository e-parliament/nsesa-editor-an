package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ReferenceTypeComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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
* The element TLCProcess is a metadata reference to the Akoma Ntoso URI of an ontology instance<br/> of the class Process
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class TLCProcess extends ReferenceTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "TLCProcess");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget TLCProcess");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>TLCProcess</code> object and set up its type
*/
public TLCProcess() {
super(create());
setType("TLCProcess");
}

/**
* Constructor with required attributes
*/
public TLCProcess(AnyURISimpleType hrefAttr,StringSimpleType showAsAttr,IDSimpleType idAttr) {
this();
setHrefAttr(hrefAttr);
setShowAsAttr(showAsAttr);
setIdAttr(idAttr);
}


/**
* Create a <code>TLCProcess</code> object with the given DOM element
*/
public TLCProcess(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>hrefAttr</code> property in DSL way
        * @param hrefAttr new value
        * @return <code> TLCProcess</code> instance
        */
        public TLCProcess hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> TLCProcess</code> instance
        */
        public TLCProcess wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>showAsAttr</code> property in DSL way
        * @param showAsAttr new value
        * @return <code> TLCProcess</code> instance
        */
        public TLCProcess showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
        }
        /**
        * Set <code>shortFormAttr</code> property in DSL way
        * @param shortFormAttr new value
        * @return <code> TLCProcess</code> instance
        */
        public TLCProcess shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> TLCProcess</code> instance
        */
        public TLCProcess idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> TLCProcess</code> instance
        */
        public TLCProcess evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
public TLCProcess html(String s) {
    super.html(s);
    return this;
}
}

