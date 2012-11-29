package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FRBRtranslation extends MetaoptComplexType  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "FRBRtranslation");
        span.setClassName("widget FRBRtranslation");
        return span;
    }

    // CONSTRUCTORS ------------------
    public FRBRtranslation() {
        super(create());
        setType("FRBRtranslation");
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
    //DSL Style get value
    public LanguageSimpleType fromLanguageAttr() {
         return  getFromLanguageAttr();
    }

    public void setFromLanguageAttr(final LanguageSimpleType fromLanguageAttr) {
        this.fromLanguageAttr = fromLanguageAttr;
    }
    //DSL Style set value
    public FRBRtranslation fromLanguageAttr(final LanguageSimpleType fromLanguageAttr) {
        setFromLanguageAttr(fromLanguageAttr);
        return this;
    }
    public YesNoTypeSimpleType getAuthoritativeAttr() {
        if (authoritativeAttr == null) {
            authoritativeAttr = YesNoTypeSimpleType.fromString(amendableElement.getAttribute("authoritative"));
        }

        return authoritativeAttr;
    }
    //DSL Style get value
    public YesNoTypeSimpleType authoritativeAttr() {
         return  getAuthoritativeAttr();
    }

    public void setAuthoritativeAttr(final YesNoTypeSimpleType authoritativeAttr) {
        this.authoritativeAttr = authoritativeAttr;
    }
    //DSL Style set value
    public FRBRtranslation authoritativeAttr(final YesNoTypeSimpleType authoritativeAttr) {
        setAuthoritativeAttr(authoritativeAttr);
        return this;
    }
    public LanguageSimpleType getPivotAttr() {
        if (pivotAttr == null) {
            pivotAttr = new LanguageSimpleType();
            pivotAttr.setValue(amendableElement.getAttribute("pivot"));
        }

        return pivotAttr;
    }
    //DSL Style get value
    public LanguageSimpleType pivotAttr() {
         return  getPivotAttr();
    }

    public void setPivotAttr(final LanguageSimpleType pivotAttr) {
        this.pivotAttr = pivotAttr;
    }
    //DSL Style set value
    public FRBRtranslation pivotAttr(final LanguageSimpleType pivotAttr) {
        setPivotAttr(pivotAttr);
        return this;
    }
    public AnyURISimpleType getByAttr() {
        if (byAttr == null) {
            byAttr = new AnyURISimpleType();
            byAttr.setValue(amendableElement.getAttribute("by"));
        }

        return byAttr;
    }
    //DSL Style get value
    public AnyURISimpleType byAttr() {
         return  getByAttr();
    }

    public void setByAttr(final AnyURISimpleType byAttr) {
        this.byAttr = byAttr;
    }
    //DSL Style set value
    public FRBRtranslation byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
    }
    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(amendableElement.getAttribute("href"));
        }

        return hrefAttr;
    }
    //DSL Style get value
    public AnyURISimpleType hrefAttr() {
         return  getHrefAttr();
    }

    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    //DSL Style set value
    public FRBRtranslation hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
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
        attrs.put("fromLanguage", getFromLanguageAttr() != null ? getFromLanguageAttr().getValue() : null);
        attrs.put("authoritative", getAuthoritativeAttr() != null ? getAuthoritativeAttr().value() : null);
        attrs.put("pivot", getPivotAttr() != null ? getPivotAttr().getValue() : null);
        attrs.put("by", getByAttr() != null ? getByAttr().getValue() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        return attrs;
    }
}

