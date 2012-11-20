package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FRBRtranslation extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
    public FRBRtranslation() {
        super(DOM.createElement("FRBRtranslation"));
    }

    public FRBRtranslation(Element element) {
        super(element);
    }

// FIELDS ------------------
    private LanguageSimpleType fromLanguageAttr;
    private YesNoTypeSimpleType authoritativeAttr;
    private LanguageSimpleType pivotAttr;
    private AnyURISimpleType byAttr;
    private AnyURISimpleType hrefAttr;
    public LanguageSimpleType getFromLanguageAttr() {
        return fromLanguageAttr;
    }
    public void setFromLanguageAttr(final LanguageSimpleType fromLanguageAttr) {
        this.fromLanguageAttr = fromLanguageAttr;
    }
    public YesNoTypeSimpleType getAuthoritativeAttr() {
        return authoritativeAttr;
    }
    public void setAuthoritativeAttr(final YesNoTypeSimpleType authoritativeAttr) {
        this.authoritativeAttr = authoritativeAttr;
    }
    public LanguageSimpleType getPivotAttr() {
        return pivotAttr;
    }
    public void setPivotAttr(final LanguageSimpleType pivotAttr) {
        this.pivotAttr = pivotAttr;
    }
    public AnyURISimpleType getByAttr() {
        return byAttr;
    }
    public void setByAttr(final AnyURISimpleType byAttr) {
        this.byAttr = byAttr;
    }
    public AnyURISimpleType getHrefAttr() {
        return hrefAttr;
    }
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

}

