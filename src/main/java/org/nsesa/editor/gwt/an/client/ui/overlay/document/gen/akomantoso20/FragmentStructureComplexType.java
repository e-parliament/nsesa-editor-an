package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FragmentStructureComplexType extends AmendableWidgetImpl  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "fragmentStructureComplexType");
        span.setClassName("widget fragmentStructureComplexType");
        return span;
    }

    // CONSTRUCTORS ------------------

    public FragmentStructureComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType includedInAttr;

    public AnyURISimpleType getIncludedInAttr() {
        if (includedInAttr == null) {
            includedInAttr = new AnyURISimpleType();
            includedInAttr.setValue(amendableElement.getAttribute("includedIn"));
        }

        return includedInAttr;
    }
    //DSL Style get value
    public AnyURISimpleType includedInAttr() {
         return  getIncludedInAttr();
    }

    public void setIncludedInAttr(final AnyURISimpleType includedInAttr) {
        this.includedInAttr = includedInAttr;
    }
    //DSL Style set value
    public FragmentStructureComplexType includedInAttr(final AnyURISimpleType includedInAttr) {
        setIncludedInAttr(includedInAttr);
        return this;
    }
    public Meta getMeta() {
        Meta result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Meta".equalsIgnoreCase(widget.getType())) {
                result = (Meta)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Meta setMeta(Meta metaElem) {
        Meta result = getMeta();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(metaElem);

        return metaElem;
    }
    public FragmentBody getFragmentBody() {
        FragmentBody result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FragmentBody".equalsIgnoreCase(widget.getType())) {
                result = (FragmentBody)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public FragmentBody setFragmentBody(FragmentBody fragmentBodyElem) {
        FragmentBody result = getFragmentBody();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(fragmentBodyElem);

        return fragmentBodyElem;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"fragmentBody","meta"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("includedInAttr", getIncludedInAttr() != null ? getIncludedInAttr().getValue() : null);
        return attrs;
    }
}

