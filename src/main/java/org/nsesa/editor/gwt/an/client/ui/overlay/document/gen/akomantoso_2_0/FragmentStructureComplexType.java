package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FragmentBody;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FragmentStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public FragmentStructureComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType includedInAttr;
    public AnyURISimpleType getIncludedInAttr() {
        return includedInAttr;
    }
    public void setIncludedInAttr(final AnyURISimpleType includedInAttr) {
        this.includedInAttr = includedInAttr;
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
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"fragmentBody","meta"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("includedInAttr", getIncludedInAttr().getValue());

        return attrs;
    }

}

