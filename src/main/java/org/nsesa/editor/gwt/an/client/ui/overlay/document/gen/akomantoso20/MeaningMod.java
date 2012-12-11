package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class MeaningMod extends ModificationTypeComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "meaningMod");
        span.setClassName("widget meaningMod");
        return span;
    }

    // CONSTRUCTORS ------------------
    public MeaningMod() {
        super(create());
        setType("meaningMod");
    }

    public MeaningMod(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private MeaningModsSimpleType typeAttr;

    public MeaningModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = MeaningModsSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
    }

    //DSL Style get value
    public MeaningModsSimpleType typeAttr() {
        return getTypeAttr();
    }

    public void setTypeAttr(final MeaningModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }

    //DSL Style set value
    public MeaningMod typeAttr(final MeaningModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }

    public Domain getDomain() {
        Domain result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Domain".equalsIgnoreCase(widget.getType())) {
                result = (Domain) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Domain setDomain(Domain domainElem) {
        Domain result = getDomain();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(domainElem);

        return domainElem;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration", "application", "source", "condition", "domain", "efficacy", "force", "destination"};
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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }
}

