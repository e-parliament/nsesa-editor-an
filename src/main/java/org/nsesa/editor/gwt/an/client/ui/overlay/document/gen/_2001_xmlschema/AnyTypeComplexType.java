package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class AnyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public AnyTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    public java.util.List<AmendableWidgetImpl> getWildcardContents() {
        java.util.List<AmendableWidgetImpl> result = new ArrayList<AmendableWidgetImpl>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AmendableWidgetImpl".equalsIgnoreCase(widget.getType())) {
                result.add((AmendableWidgetImpl)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        String[] subtypes = new String[]{"*"};
        return  subtypes;
    }

    @Override
    public void addAmendableWidget(final AmendableWidget widget) {
        boolean canAdd = false;
        for (String type : getAllowedChildTypes()) {
            if (type.equalsIgnoreCase(widget.getType())) {
                canAdd = true;
            }
        }
        if (!canAdd) {
            throw new RuntimeException("Not supported child type:" + widget);
        }
        super.addAmendableWidget(widget);
    }

}

