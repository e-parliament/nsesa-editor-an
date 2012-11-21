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

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("fromLanguageAttr", getFromLanguageAttr().getValue());
        attrs.put("authoritativeAttr", getAuthoritativeAttr().value());
        attrs.put("pivotAttr", getPivotAttr().getValue());
        attrs.put("byAttr", getByAttr().getValue());
        attrs.put("hrefAttr", getHrefAttr().getValue());

        return attrs;
    }

}

