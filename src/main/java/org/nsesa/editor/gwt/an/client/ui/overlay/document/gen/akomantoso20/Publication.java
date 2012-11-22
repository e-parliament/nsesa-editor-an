package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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
public class Publication extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
    public Publication() {
        super(DOM.createElement("publication"));
    }

    public Publication(Element element) {
        super(element);
    }

// FIELDS ------------------
    private DateSimpleType dateAttr;
    private StringSimpleType nameAttr;
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private AnyURISimpleType refersToAttr;
    private StringSimpleType numberAttr;
    public DateSimpleType getDateAttr() {
        if (dateAttr == null) {
            dateAttr = new DateSimpleType();
            dateAttr.setValue(amendableElement.getAttribute("date"));
        }

        return dateAttr;
    }
    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
    }
    public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
            nameAttr = new StringSimpleType();
            nameAttr.setValue(amendableElement.getAttribute("name"));
        }

        return nameAttr;
    }
    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
    public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
            showAsAttr = new StringSimpleType();
            showAsAttr.setValue(amendableElement.getAttribute("showAs"));
        }

        return showAsAttr;
    }
    public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
    }
    public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
            shortFormAttr = new StringSimpleType();
            shortFormAttr.setValue(amendableElement.getAttribute("shortForm"));
        }

        return shortFormAttr;
    }
    public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public StringSimpleType getNumberAttr() {
        if (numberAttr == null) {
            numberAttr = new StringSimpleType();
            numberAttr.setValue(amendableElement.getAttribute("number"));
        }

        return numberAttr;
    }
    public void setNumberAttr(final StringSimpleType numberAttr) {
        this.numberAttr = numberAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("dateAttr", getDateAttr().getValue());
        attrs.put("nameAttr", getNameAttr().getValue());
        attrs.put("showAsAttr", getShowAsAttr().getValue());
        attrs.put("shortFormAttr", getShortFormAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("numberAttr", getNumberAttr().getValue());

        return attrs;
    }

}

