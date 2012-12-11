package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class FRBRWork extends CorePropertiesComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "FRBRWork");
        span.setClassName("widget FRBRWork");
        return span;
    }

    // CONSTRUCTORS ------------------
    public FRBRWork() {
        super(create());
        setType("FRBRWork");
    }

    public FRBRWork(Element element) {
        super(element);
    }

// FIELDS ------------------

    public FRBRcountry getFRBRcountry() {
        FRBRcountry result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRcountry".equalsIgnoreCase(widget.getType())) {
                result = (FRBRcountry) widget;
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
                result = (FRBRsubtype) widget;
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
                result = (FRBRnumber) widget;
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
                result = (FRBRname) widget;
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
        return new String[]{"FRBRthis", "FRBRalias", "FRBRcountry", "FRBRsubtype", "componentInfo", "FRBRuri", "FRBRnumber", "FRBRname", "FRBRauthor", "FRBRdate", "preservation"};
    }

    /**
     * Returns the namespace URI of this amendable widget.
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }
}

