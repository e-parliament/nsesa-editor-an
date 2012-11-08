package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRlanguage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRtranslation;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
/**
* This file is generated.
*/
public class ExprPropertiesGroup   {

// CONSTRUCTORS ------------------

// FIELDS ------------------
private java.util.List<FRBRlanguage> FRBRlanguages = new ArrayList<FRBRlanguage>();
private java.util.List<FRBRtranslation> FRBRtranslations = new ArrayList<FRBRtranslation>();

public java.util.List<FRBRlanguage> getFRBRlanguage() {
return FRBRlanguages;
}

public void setFRBRlanguage(final java.util.List<FRBRlanguage> FRBRlanguages) {
this.FRBRlanguages = FRBRlanguages;
}
public java.util.List<FRBRtranslation> getFRBRtranslation() {
return FRBRtranslations;
}

public void setFRBRtranslation(final java.util.List<FRBRtranslation> FRBRtranslations) {
this.FRBRtranslations = FRBRtranslations;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

