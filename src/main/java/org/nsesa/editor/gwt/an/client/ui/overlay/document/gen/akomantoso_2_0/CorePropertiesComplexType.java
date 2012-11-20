package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRthis;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRuri;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRalias;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRdate;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRauthor;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentInfo;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Preservation;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class CorePropertiesComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public CorePropertiesComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    public FRBRthis getFRBRthis() {
        FRBRthis result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRthis".equalsIgnoreCase(widget.getType())) {
                result = (FRBRthis)widget;
                break;
            }
        }
        return result;
    }
    public java.util.List<FRBRuri> getFRBRuris() {
        java.util.List<FRBRuri> result = new ArrayList<FRBRuri>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRuri".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRuri)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<FRBRalias> getFRBRaliases() {
        java.util.List<FRBRalias> result = new ArrayList<FRBRalias>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRalias".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRalias)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<FRBRdate> getFRBRdates() {
        java.util.List<FRBRdate> result = new ArrayList<FRBRdate>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRdate".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRdate)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<FRBRauthor> getFRBRauthors() {
        java.util.List<FRBRauthor> result = new ArrayList<FRBRauthor>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRauthor".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRauthor)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public ComponentInfo getComponentInfo() {
        ComponentInfo result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ComponentInfo".equalsIgnoreCase(widget.getType())) {
                result = (ComponentInfo)widget;
                break;
            }
        }
        return result;
    }
    public Preservation getPreservation() {
        Preservation result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Preservation".equalsIgnoreCase(widget.getType())) {
                result = (Preservation)widget;
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
        return new String[]{"FRBRthis","FRBRalias","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());

        return attrs;
    }

}

