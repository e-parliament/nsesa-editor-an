package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ComponentData;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class ComponentInfo extends AmendableWidgetImpl  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "componentInfo");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget componentInfo");
return span;
}

// CONSTRUCTORS ------------------
public ComponentInfo() {
super(create());
setType("componentInfo");
}

public ComponentInfo(Element element) {
super(element);
}

// FIELDS ------------------

            public java.util.List<ComponentData> getComponentDatas() {
                java.util.List<ComponentData> result = new ArrayList<ComponentData>();
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ComponentData".equalsIgnoreCase(widget.getType())) {
            result.add((ComponentData)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }
            //DSL Style get value
            public java.util.List<ComponentData> getComponentDataList() {
            return  getComponentDatas();
            }
            //DSL Style set value
            public ComponentData addComponentData(ComponentData componentDataElem) {
                this.addAmendableWidget(componentDataElem);
                return componentDataElem;
            }

/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"componentData"};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
return attrs;
}
}

