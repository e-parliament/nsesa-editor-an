package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRcountry;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRsubtype;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRnumber;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRname;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
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
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRcountry setFRBRcountry(FRBRcountry FRBRcountryElem) {
        FRBRcountry result = getFRBRcountry();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRcountryElem);

        return FRBRcountryElem;
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
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRsubtype setFRBRsubtype(FRBRsubtype FRBRsubtypeElem) {
        FRBRsubtype result = getFRBRsubtype();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRsubtypeElem);

        return FRBRsubtypeElem;
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
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRnumber setFRBRnumber(FRBRnumber FRBRnumberElem) {
        FRBRnumber result = getFRBRnumber();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRnumberElem);

        return FRBRnumberElem;
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
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRname setFRBRname(FRBRname FRBRnameElem) {
        FRBRname result = getFRBRname();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRnameElem);

        return FRBRnameElem;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"FRBRthis","FRBRalias","FRBRcountry","FRBRsubtype","componentInfo","FRBRuri","FRBRnumber","FRBRname","FRBRauthor","FRBRdate","preservation"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

