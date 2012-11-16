package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRcountry;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRsubtype;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRnumber;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRname;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FRBRWork extends CorePropertiesComplexType  {

// CONSTRUCTORS ------------------
    public FRBRWork() {
        super(DOM.createElement("FRBRWork"));
    }

    public FRBRWork(Element element) {
        super(element);
    }

// FIELDS ------------------
    public FRBRcountry getFRBRcountry() {
        FRBRcountry result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRcountry".equalsIgnoreCase(widget.getType())) {
                result = (FRBRcountry)widget;
                break;
            }
        }
        return result;
    }
    public FRBRsubtype getFRBRsubtype() {
        FRBRsubtype result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRsubtype".equalsIgnoreCase(widget.getType())) {
                result = (FRBRsubtype)widget;
                break;
            }
        }
        return result;
    }
    public FRBRnumber getFRBRnumber() {
        FRBRnumber result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRnumber".equalsIgnoreCase(widget.getType())) {
                result = (FRBRnumber)widget;
                break;
            }
        }
        return result;
    }
    public FRBRname getFRBRname() {
        FRBRname result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRname".equalsIgnoreCase(widget.getType())) {
                result = (FRBRname)widget;
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
        String[] subtypes = new String[]{"FRBRthis","FRBRalias","FRBRcountry","FRBRsubtype","componentInfo","FRBRuri","FRBRnumber","FRBRname","FRBRauthor","FRBRdate","preservation"};
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

