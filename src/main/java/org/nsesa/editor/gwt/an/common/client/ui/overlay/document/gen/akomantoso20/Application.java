package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
* The element efficacy is a metadata element specifying the period of the efficacy<br/> modification.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Application extends PeriodTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "application");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget application");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Application</code> object and set up its type
*/
public Application() {
super(create());
setType("application");
}



/**
* Create a <code>Application</code> object with the given DOM element
*/
public Application(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Application</code> instance
        */
        public Application wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> Application</code> instance
        */
        public Application periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Application</code> instance
        */
        public Application idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Application</code> instance
        */
        public Application evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
public Application html(String s) {
    super.html(s);
    return this;
}
}

