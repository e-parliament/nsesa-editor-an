package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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
public class Keyword extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
    public Keyword() {
        super(DOM.createElement("keyword"));
    }

    public Keyword(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType dictionaryAttr;
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private StringSimpleType valueAttr;
    public AnyURISimpleType getDictionaryAttr() {
        return dictionaryAttr;
    }
    public void setDictionaryAttr(final AnyURISimpleType dictionaryAttr) {
        this.dictionaryAttr = dictionaryAttr;
    }
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
    public StringSimpleType getValueAttr() {
        return valueAttr;
    }
    public void setValueAttr(final StringSimpleType valueAttr) {
        this.valueAttr = valueAttr;
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
        attrs.put("dictionaryAttr", getDictionaryAttr().getValue());
        attrs.put("showAsAttr", getShowAsAttr().getValue());
        attrs.put("shortFormAttr", getShortFormAttr().getValue());
        attrs.put("valueAttr", getValueAttr().getValue());

        return attrs;
    }

}

