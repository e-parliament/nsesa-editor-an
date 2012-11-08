package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.YesNoTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkAttrGroup;
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
private LanguageSimpleType fromLanguage;
private YesNoTypeSimpleType authoritative;
private LanguageSimpleType pivot;
private AnyURISimpleType by;
private LinkAttrGroup link;

public LanguageSimpleType getFromLanguage() {
return fromLanguage;
}

public void setFromLanguage(final LanguageSimpleType fromLanguage) {
this.fromLanguage = fromLanguage;
}
public YesNoTypeSimpleType getAuthoritative() {
return authoritative;
}

public void setAuthoritative(final YesNoTypeSimpleType authoritative) {
this.authoritative = authoritative;
}
public LanguageSimpleType getPivot() {
return pivot;
}

public void setPivot(final LanguageSimpleType pivot) {
this.pivot = pivot;
}
public AnyURISimpleType getBy() {
return by;
}

public void setBy(final AnyURISimpleType by) {
this.by = by;
}
public LinkAttrGroup getLink() {
return link;
}

public void setLink(final LinkAttrGroup link) {
this.link = link;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreAttrGroup","languageSimpleType","yesNoTypeSimpleType","linkAttrGroup","idoptAttrGroup","anyURISimpleType"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

