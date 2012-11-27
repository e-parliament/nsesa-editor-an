package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.YesNoTypeSimpleType;
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

