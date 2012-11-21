package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.VersionTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CoverPage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Preface;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Preamble;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MainBody;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Conclusions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Attachments;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class OpenStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public OpenStructureComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private VersionTypeSimpleType containsAttr;
    private StringSimpleType nameAttr;
    public VersionTypeSimpleType getContainsAttr() {
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
    public Preamble getPreamble() {
        Preamble result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Preamble".equalsIgnoreCase(widget.getType())) {
                result = (Preamble)widget;
                break;
            }
        }
        return result;
    }
    public MainBody getMainBody() {
        MainBody result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("MainBody".equalsIgnoreCase(widget.getType())) {
                result = (MainBody)widget;
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
    public StringSimpleType getNameAttr() {
        return nameAttr;
    }
    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"conclusions","preface","mainBody","preamble","coverPage","attachments","meta"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("containsAttr", getContainsAttr().value());
        attrs.put("nameAttr", getNameAttr().getValue());

        return attrs;
    }

}

