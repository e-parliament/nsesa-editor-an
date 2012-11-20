package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

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
        return languageAttr;
    }
    public void setLanguageAttr(final LanguageSimpleType languageAttr) {
        this.languageAttr = languageAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

}

