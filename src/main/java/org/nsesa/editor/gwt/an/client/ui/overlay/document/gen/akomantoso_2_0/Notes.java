package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Note;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Notes extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Notes() {
        super(DOM.createElement("notes"));
    }

    public Notes(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;
    public java.util.List<Note> getNotes() {
        java.util.List<Note> result = new ArrayList<Note>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Note".equalsIgnoreCase(widget.getType())) {
                result.add((Note)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public AnyURISimpleType getSourceAttr() {
        return sourceAttr;
    }
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        String[] subtypes = new String[]{"note"};
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

