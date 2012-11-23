package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class BasehierarchyComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public BasehierarchyComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    public Num getNum() {
        Num result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Num".equalsIgnoreCase(widget.getType())) {
                result = (Num)widget;
                break;
            }
        }
        return result;
    }
    public Heading getHeading() {
        Heading result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Heading".equalsIgnoreCase(widget.getType())) {
                result = (Heading)widget;
                break;
            }
        }
        return result;
    }
    public Subheading getSubheading() {
        Subheading result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subheading".equalsIgnoreCase(widget.getType())) {
                result = (Subheading)widget;
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
        return new String[]{"num","subheading","heading"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

