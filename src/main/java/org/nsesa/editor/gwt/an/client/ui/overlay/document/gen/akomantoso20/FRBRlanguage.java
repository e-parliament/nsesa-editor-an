package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FRBRlanguage extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
    public FRBRlanguage() {
        super(DOM.createElement("FRBRlanguage"));
    }

    public FRBRlanguage(Element element) {
        super(element);
    }

// FIELDS ------------------
    private LanguageSimpleType languageAttr;
    public LanguageSimpleType getLanguageAttr() {
        if (languageAttr == null) {
            languageAttr = new LanguageSimpleType();
            languageAttr.setValue(amendableElement.getAttribute("language"));
        }

        return languageAttr;
    }
    public void setLanguageAttr(final LanguageSimpleType languageAttr) {
        this.languageAttr = languageAttr;
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
        attrs.put("languageAttr", getLanguageAttr() != null ? getLanguageAttr().getValue() : null);
        return attrs;
    }

}

