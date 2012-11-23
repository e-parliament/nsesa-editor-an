package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;

import java.util.LinkedHashMap;

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
    private StringSimpleType valueAttr;
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    public AnyURISimpleType getDictionaryAttr() {
        if (dictionaryAttr == null) {
            dictionaryAttr = new AnyURISimpleType();
            dictionaryAttr.setValue(amendableElement.getAttribute("dictionary"));
        }

        return dictionaryAttr;
    }
    public void setDictionaryAttr(final AnyURISimpleType dictionaryAttr) {
        this.dictionaryAttr = dictionaryAttr;
    }
    public StringSimpleType getValueAttr() {
        if (valueAttr == null) {
            valueAttr = new StringSimpleType();
            valueAttr.setValue(amendableElement.getAttribute("value"));
        }

        return valueAttr;
    }
    public void setValueAttr(final StringSimpleType valueAttr) {
        this.valueAttr = valueAttr;
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
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("dictionaryAttr", getDictionaryAttr() != null ? getDictionaryAttr().getValue() : null);
        attrs.put("valueAttr", getValueAttr() != null ? getValueAttr().getValue() : null);
        attrs.put("showAsAttr", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortFormAttr", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        return attrs;
    }

}

