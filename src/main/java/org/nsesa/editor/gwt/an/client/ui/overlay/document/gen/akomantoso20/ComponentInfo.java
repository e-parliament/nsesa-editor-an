package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ComponentData;
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
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class ComponentInfo extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(0,-1,        new StructureIndicator.DefaultElement(1,1,new ComponentData())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "componentInfo");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget componentInfo");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>ComponentInfo</code> object and set up its type
*/
public ComponentInfo() {
super(create());
setType("componentInfo");
}



/**
* Create a <code>ComponentInfo</code> object with the given DOM element
*/
public ComponentInfo(Element element) {
super(element);
}

// FIELDS ------------------

            /**
            * Return <code>java.util.List<ComponentData></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<ComponentData> getComponentDatas() {
                java.util.List<ComponentData> result = new ArrayList<ComponentData>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ComponentData".equalsIgnoreCase(widget.getType())) {
            result.add((ComponentData)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<ComponentData></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<ComponentData> getComponentDataList() {
            return  getComponentDatas();
            }
            /**
            * Add <code>java.util.List<ComponentData></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public ComponentData addComponentData(ComponentData componentDataElem) {
                this.addOverlayWidget(componentDataElem);
                return componentDataElem;
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
public ComponentInfo html(String s) {
    super.html(s);
    return this;
}
}

