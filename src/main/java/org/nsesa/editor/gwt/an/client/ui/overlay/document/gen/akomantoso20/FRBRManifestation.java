package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRformat;
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
* The element FRBRManifestation is the metadata container of identifying properties related to the Manifestation level according to the FRBR hierarchy
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class FRBRManifestation extends CorePropertiesComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new FRBRformat())
)
)
)
        ,

        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new FRBRthis())
,        new StructureIndicator.DefaultElement(1,-1,new FRBRuri())
,        new StructureIndicator.DefaultElement(0,-1,new FRBRalias())
,        new StructureIndicator.DefaultElement(1,-1,new FRBRdate())
,        new StructureIndicator.DefaultElement(1,-1,new FRBRauthor())
,        new StructureIndicator.DefaultElement(0,1,new ComponentInfo())
,        new StructureIndicator.DefaultElement(0,1,new Preservation())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "FRBRManifestation");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget FRBRManifestation");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>FRBRManifestation</code> object and set up its type
*/
public FRBRManifestation() {
super(create());
setType("FRBRManifestation");
}



/**
* Create a <code>FRBRManifestation</code> object with the given DOM element
*/
public FRBRManifestation(Element element) {
super(element);
}

// FIELDS ------------------

            /**
            * Add <code>FRBRformat</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public FRBRformat getFRBRformat() {
                FRBRformat result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRformat".equalsIgnoreCase(widget.getType())) {
            result = (FRBRformat)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>FRBRformatElem</code> property in DSL way
            * @param FRBRformatElem new value
            * @return <code>FRBRformat</code> instance
            */
            public FRBRformat setFRBRformat(FRBRformat FRBRformatElem) {
                    FRBRformat result = getFRBRformat();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(FRBRformatElem);

                return FRBRformatElem;
            }
//Override all attributes methods to be conformant with DSL approach

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
public FRBRManifestation html(String s) {
    super.html(s);
    return this;
}
}

