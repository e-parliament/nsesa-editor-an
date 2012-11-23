package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;

import java.util.LinkedHashMap;

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
        if (fromLanguageAttr == null) {
            fromLanguageAttr = new LanguageSimpleType();
            fromLanguageAttr.setValue(amendableElement.getAttribute("fromLanguage"));
        }

        return fromLanguageAttr;
    }
    public void setFromLanguageAttr(final LanguageSimpleType fromLanguageAttr) {
        this.fromLanguageAttr = fromLanguageAttr;
    }
    public YesNoTypeSimpleType getAuthoritativeAttr() {
        if (authoritativeAttr == null) {
            authoritativeAttr = YesNoTypeSimpleType.fromString(amendableElement.getAttribute("authoritative"));
        }

        return authoritativeAttr;
    }
    public void setAuthoritativeAttr(final YesNoTypeSimpleType authoritativeAttr) {
        this.authoritativeAttr = authoritativeAttr;
    }
    public LanguageSimpleType getPivotAttr() {
        if (pivotAttr == null) {
            pivotAttr = new LanguageSimpleType();
            pivotAttr.setValue(amendableElement.getAttribute("pivot"));
        }

        return pivotAttr;
    }
    public void setPivotAttr(final LanguageSimpleType pivotAttr) {
        this.pivotAttr = pivotAttr;
    }
    public AnyURISimpleType getByAttr() {
        if (byAttr == null) {
            byAttr = new AnyURISimpleType();
            byAttr.setValue(amendableElement.getAttribute("by"));
        }

        return byAttr;
    }
    public void setByAttr(final AnyURISimpleType byAttr) {
        this.byAttr = byAttr;
    }
    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(amendableElement.getAttribute("href"));
        }

        return hrefAttr;
    }
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
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
        attrs.put("fromLanguageAttr", getFromLanguageAttr() != null ? getFromLanguageAttr().getValue() : null);
        attrs.put("authoritativeAttr", getAuthoritativeAttr() != null ? getAuthoritativeAttr().value() : null);
        attrs.put("pivotAttr", getPivotAttr() != null ? getPivotAttr().getValue() : null);
        attrs.put("byAttr", getByAttr() != null ? getByAttr().getValue() : null);
        attrs.put("hrefAttr", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        return attrs;
    }

}

