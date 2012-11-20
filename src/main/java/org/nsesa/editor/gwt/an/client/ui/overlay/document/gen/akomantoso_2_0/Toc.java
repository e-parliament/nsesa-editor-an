package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;

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
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tocItem"};
    }

}

