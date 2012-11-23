package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ScopeMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
    public ScopeMod() {
        super(DOM.createElement("scopeMod"));
    }

    public ScopeMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private ScopeModsSimpleType typeAttr;
    public ScopeModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = ScopeModsSimpleType.fromString(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    public void setTypeAttr(final ScopeModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    public Domain getDomain() {
        Domain result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Domain".equalsIgnoreCase(widget.getType())) {
                result = (Domain)widget;
                break;
            }
        }
        return result;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","source","condition","domain","efficacy","force","destination"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }

}

