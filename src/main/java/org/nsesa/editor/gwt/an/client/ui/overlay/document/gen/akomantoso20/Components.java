package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Component;
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
public class Components extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Components() {
        super(DOM.createElement("components"));
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

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

