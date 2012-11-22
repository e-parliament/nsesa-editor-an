package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.VersionTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CoverPage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Preface;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DebateBody;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Conclusions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Attachments;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class DebateStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public DebateStructureComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private VersionTypeSimpleType containsAttr;
    public VersionTypeSimpleType getContainsAttr() {
        if (containsAttr == null) {
            containsAttr = VersionTypeSimpleType.fromString(amendableElement.getAttribute("contains"));
        }

        return containsAttr;
    }
    public void setContainsAttr(final VersionTypeSimpleType containsAttr) {
        this.containsAttr = containsAttr;
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
    public CoverPage getCoverPage() {
        CoverPage result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("CoverPage".equalsIgnoreCase(widget.getType())) {
                result = (CoverPage)widget;
                break;
            }
        }
        return result;
    }
    public Preface getPreface() {
        Preface result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Preface".equalsIgnoreCase(widget.getType())) {
                result = (Preface)widget;
                break;
            }
        }
        return result;
    }
    public DebateBody getDebateBody() {
        DebateBody result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateBody".equalsIgnoreCase(widget.getType())) {
                result = (DebateBody)widget;
                break;
            }
        }
        return result;
    }
    public Conclusions getConclusions() {
        Conclusions result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Conclusions".equalsIgnoreCase(widget.getType())) {
                result = (Conclusions)widget;
                break;
            }
        }
        return result;
    }
    public Attachments getAttachments() {
        Attachments result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Attachments".equalsIgnoreCase(widget.getType())) {
                result = (Attachments)widget;
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
        return new String[]{"conclusions","preface","coverPage","debateBody","attachments","meta"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("containsAttr", getContainsAttr().value());

        return attrs;
    }

}

