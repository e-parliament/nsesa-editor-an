package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
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
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private AnyURISimpleType refersToAttr;
    private StringSimpleType nameAttr;
    private StringSimpleType numberAttr;
    private DateSimpleType dateAttr;
    public StringSimpleType getShowAsAttr() {
        return showAsAttr;
    }
    public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
    }
    public StringSimpleType getShortFormAttr() {
        return shortFormAttr;
    }
    public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public StringSimpleType getNameAttr() {
        return nameAttr;
    }
    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
    public StringSimpleType getNumberAttr() {
        return numberAttr;
    }
    public void setNumberAttr(final StringSimpleType numberAttr) {
        this.numberAttr = numberAttr;
    }
    public DateSimpleType getDateAttr() {
        return dateAttr;
    }
    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
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
        attrs.put("showAsAttr", getShowAsAttr().getValue());
        attrs.put("shortFormAttr", getShortFormAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("nameAttr", getNameAttr().getValue());
        attrs.put("numberAttr", getNumberAttr().getValue());
        attrs.put("dateAttr", getDateAttr().getValue());

        return attrs;
    }

}

