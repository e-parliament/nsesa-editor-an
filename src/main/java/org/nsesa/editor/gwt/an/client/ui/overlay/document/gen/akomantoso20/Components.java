package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Components extends AmendableWidgetImpl  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "components");
        span.setClassName("widget components");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Components() {
        super(create());
        setType("components");
    }

    public Components(Element element) {
        super(element);
    }

// FIELDS ------------------

    public java.util.List<Component> getComponents() {
        java.util.List<Component> result = new ArrayList<Component>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Component".equalsIgnoreCase(widget.getType())) {
                result.add((Component)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Component> getComponentList() {
        return  getComponents();
    }
    //DSL Style set value
    public Component addComponent(Component componentElem) {
        this.addAmendableWidget(componentElem);
        return componentElem;
    }

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"component"};
    }

    /**
    * Returns the namespace URI of this amendable widget.
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
}

