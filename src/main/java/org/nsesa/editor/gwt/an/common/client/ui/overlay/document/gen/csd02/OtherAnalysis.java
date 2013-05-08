package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
* The element otherAnalysis is a metadata container of any additional metadata analysis element that does not belong to the specific categories provided before. Anything can be placed in this element..
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class OtherAnalysis extends AnyOtherTypeComplexType  {

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
span.setAttribute("type", "otherAnalysis");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget otherAnalysis");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>OtherAnalysis</code> object and set up its type
*/
public OtherAnalysis() {
super(create());
setType("otherAnalysis");
}

/**
* Constructor with required attributes
*/
public OtherAnalysis(AnyURISimpleType sourceAttr) {
this();
setSourceAttr(sourceAttr);
}


/**
* Create a <code>OtherAnalysis</code> object with the given DOM element
*/
public OtherAnalysis(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;

        /**
        * Return <code>sourceAttr</code> property
        * @return sourceAttr
        */
        public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
                sourceAttr = new AnyURISimpleType();
                sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
        }
        /**
        * Return <code>sourceAttr</code> property in DSL way
        * @return sourceAttr
        */
        public AnyURISimpleType sourceAttr() {
        return  getSourceAttr();
        }
        /**
        * Set <code>sourceAttr</code> property
        * @param sourceAttr the new value
        */
        public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source",sourceAttr.getValue());
        }
        /**
        * Set <code>sourceAttr</code> property in DSL way
        * @param sourceAttr the new value
        * @return <code>OtherAnalysis</code> instance
        */
        public OtherAnalysis sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>hrefAttr</code> property in DSL way
        * @param hrefAttr new value
        * @return <code> OtherAnalysis</code> instance
        */
        public OtherAnalysis hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> OtherAnalysis</code> instance
        */
        public OtherAnalysis wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> OtherAnalysis</code> instance
        */
        public OtherAnalysis idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> OtherAnalysis</code> instance
        */
        public OtherAnalysis evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
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
public OtherAnalysis html(String s) {
    super.html(s);
    return this;
}
}

