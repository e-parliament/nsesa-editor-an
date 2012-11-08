package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TextualMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MeaningMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ScopeMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ForceMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EfficacyMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LegalSystemMod;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AmendmentsComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public AmendmentsComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<TextualMod> textualMods = new ArrayList<TextualMod>();
private java.util.List<MeaningMod> meaningMods = new ArrayList<MeaningMod>();
private java.util.List<ScopeMod> scopeMods = new ArrayList<ScopeMod>();
private java.util.List<ForceMod> forceMods = new ArrayList<ForceMod>();
private java.util.List<EfficacyMod> efficacyMods = new ArrayList<EfficacyMod>();
private java.util.List<LegalSystemMod> legalSystemMods = new ArrayList<LegalSystemMod>();

public java.util.List<TextualMod> getTextualMod() {
return textualMods;
}

public void setTextualMod(final java.util.List<TextualMod> textualMods) {
this.textualMods = textualMods;
}
public java.util.List<MeaningMod> getMeaningMod() {
return meaningMods;
}

public void setMeaningMod(final java.util.List<MeaningMod> meaningMods) {
this.meaningMods = meaningMods;
}
public java.util.List<ScopeMod> getScopeMod() {
return scopeMods;
}

public void setScopeMod(final java.util.List<ScopeMod> scopeMods) {
this.scopeMods = scopeMods;
}
public java.util.List<ForceMod> getForceMod() {
return forceMods;
}

public void setForceMod(final java.util.List<ForceMod> forceMods) {
this.forceMods = forceMods;
}
public java.util.List<EfficacyMod> getEfficacyMod() {
return efficacyMods;
}

public void setEfficacyMod(final java.util.List<EfficacyMod> efficacyMods) {
this.efficacyMods = efficacyMods;
}
public java.util.List<LegalSystemMod> getLegalSystemMod() {
return legalSystemMods;
}

public void setLegalSystemMod(final java.util.List<LegalSystemMod> legalSystemMods) {
this.legalSystemMods = legalSystemMods;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"efficacyMod","scopeMod","forceMod","textualMod","meaningMod","legalSystemMod"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

