package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LanguageSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FRBRlanguage extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
public FRBRlanguage(Element element) {
    super(element);
}

// FIELDS ------------------
private LanguageSimpleType language;

public LanguageSimpleType getLanguage() {
return language;
}

public void setLanguage(final LanguageSimpleType language) {
this.language = language;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreAttrGroup","languageSimpleType","idoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

