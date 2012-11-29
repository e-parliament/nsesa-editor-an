package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FRBRlanguage extends MetaoptComplexType  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "FRBRlanguage");
        span.setClassName("widget FRBRlanguage");
        return span;
    }

    // CONSTRUCTORS ------------------
    public FRBRlanguage() {
        super(create());
        setType("FRBRlanguage");
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
    //DSL Style get value
    public LanguageSimpleType languageAttr() {
         return  getLanguageAttr();
    }

    public void setLanguageAttr(final LanguageSimpleType languageAttr) {
        this.languageAttr = languageAttr;
    }
    //DSL Style set value
    public FRBRlanguage languageAttr(final LanguageSimpleType languageAttr) {
        setLanguageAttr(languageAttr);
        return this;
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

