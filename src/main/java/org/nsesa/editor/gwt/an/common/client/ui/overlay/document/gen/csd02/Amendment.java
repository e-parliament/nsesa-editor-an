package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.AmendmentStructureComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.VersionTypeSimpleType;
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
* Element amendment is used for describing the structure and content of an amendment
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Amendment extends AmendmentStructureComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new Meta())
,        new StructureIndicator.DefaultElement(0,1,new CoverPage())
,        new StructureIndicator.DefaultElement(0,1,new Preface())
,        new StructureIndicator.DefaultElement(1,1,new AmendmentBody())
,        new StructureIndicator.DefaultElement(0,1,new Conclusions())
,        new StructureIndicator.DefaultElement(0,1,new Attachments())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "amendment");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget amendment");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Amendment</code> object and set up its type
*/
public Amendment() {
super(create());
setType("amendment");
}



/**
* Create a <code>Amendment</code> object with the given DOM element
*/
public Amendment(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>containsAttr</code> property in DSL way
        * @param containsAttr new value
        * @return <code> Amendment</code> instance
        */
        public Amendment containsAttr(final VersionTypeSimpleType containsAttr) {
        setContainsAttr(containsAttr);
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
public Amendment html(String s) {
    super.html(s);
    return this;
}
}

