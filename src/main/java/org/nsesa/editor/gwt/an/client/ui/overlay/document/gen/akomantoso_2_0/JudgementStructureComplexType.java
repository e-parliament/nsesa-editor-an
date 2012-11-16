package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.VersionTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoverPage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Header;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.JudgementBody;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Conclusions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Attachments;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class JudgementStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public JudgementStructureComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private VersionTypeSimpleType containsAttr;
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
    public Header getHeader() {
        Header result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Header".equalsIgnoreCase(widget.getType())) {
                result = (Header)widget;
                break;
            }
        }
        return result;
    }
    public JudgementBody getJudgementBody() {
        JudgementBody result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("JudgementBody".equalsIgnoreCase(widget.getType())) {
                result = (JudgementBody)widget;
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
        String[] subtypes = new String[]{"conclusions","judgementBody","coverPage","attachments","header","meta"};
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

