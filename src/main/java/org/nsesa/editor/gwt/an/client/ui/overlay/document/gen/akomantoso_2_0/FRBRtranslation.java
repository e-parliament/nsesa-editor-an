package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.YesNoTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FRBRtranslation extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
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
    String[] subtypes = new String[]{};
    return  subtypes;
}
}

