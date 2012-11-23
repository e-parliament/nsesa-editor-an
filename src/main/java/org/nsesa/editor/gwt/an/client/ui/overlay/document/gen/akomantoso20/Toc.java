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
public class Toc extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Toc() {
        super(DOM.createElement("toc"));
    }

    public Toc(Element element) {
        super(element);
    }

// FIELDS ------------------
    public java.util.List<TocItem> getTocItems() {
        java.util.List<TocItem> result = new ArrayList<TocItem>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TocItem".equalsIgnoreCase(widget.getType())) {
                result.add((TocItem)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tocItem"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

