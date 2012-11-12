package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Result;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Supports;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IsAnalogTo;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Applies;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Extends;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Restricts;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Derogates;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Contrasts;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Overrules;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DissentsFrom;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PutsInQuestion;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Distinguishes;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class JudicialArgumentsComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public JudicialArgumentsComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private Result result;
private java.util.List<Supports> supportses = new ArrayList<Supports>();
private java.util.List<IsAnalogTo> isAnalogTos = new ArrayList<IsAnalogTo>();
private java.util.List<Applies> applieses = new ArrayList<Applies>();
private java.util.List<Extends> extend_s = new ArrayList<Extends>();
private java.util.List<Restricts> restrictses = new ArrayList<Restricts>();
private java.util.List<Derogates> derogateses = new ArrayList<Derogates>();
private java.util.List<Contrasts> contrastses = new ArrayList<Contrasts>();
private java.util.List<Overrules> overruleses = new ArrayList<Overrules>();
private java.util.List<DissentsFrom> dissentsFroms = new ArrayList<DissentsFrom>();
private java.util.List<PutsInQuestion> putsInQuestions = new ArrayList<PutsInQuestion>();
private java.util.List<Distinguishes> distinguisheses = new ArrayList<Distinguishes>();

public Result getResult() {
return result;
}

public void setResult(final Result result) {
this.result = result;
}
public java.util.List<Supports> getSupports() {
return supportses;
}

public void setSupports(final java.util.List<Supports> supportses) {
this.supportses = supportses;
}
public java.util.List<IsAnalogTo> getIsAnalogTo() {
return isAnalogTos;
}

public void setIsAnalogTo(final java.util.List<IsAnalogTo> isAnalogTos) {
this.isAnalogTos = isAnalogTos;
}
public java.util.List<Applies> getApplies() {
return applieses;
}

public void setApplies(final java.util.List<Applies> applieses) {
this.applieses = applieses;
}
public java.util.List<Extends> getExtend_() {
return extend_s;
}

public void setExtend_(final java.util.List<Extends> extend_s) {
this.extend_s = extend_s;
}
public java.util.List<Restricts> getRestricts() {
return restrictses;
}

public void setRestricts(final java.util.List<Restricts> restrictses) {
this.restrictses = restrictses;
}
public java.util.List<Derogates> getDerogates() {
return derogateses;
}

public void setDerogates(final java.util.List<Derogates> derogateses) {
this.derogateses = derogateses;
}
public java.util.List<Contrasts> getContrasts() {
return contrastses;
}

public void setContrasts(final java.util.List<Contrasts> contrastses) {
this.contrastses = contrastses;
}
public java.util.List<Overrules> getOverrules() {
return overruleses;
}

public void setOverrules(final java.util.List<Overrules> overruleses) {
this.overruleses = overruleses;
}
public java.util.List<DissentsFrom> getDissentsFrom() {
return dissentsFroms;
}

public void setDissentsFrom(final java.util.List<DissentsFrom> dissentsFroms) {
this.dissentsFroms = dissentsFroms;
}
public java.util.List<PutsInQuestion> getPutsInQuestion() {
return putsInQuestions;
}

public void setPutsInQuestion(final java.util.List<PutsInQuestion> putsInQuestions) {
this.putsInQuestions = putsInQuestions;
}
public java.util.List<Distinguishes> getDistinguishes() {
return distinguisheses;
}

public void setDistinguishes(final java.util.List<Distinguishes> distinguisheses) {
this.distinguisheses = distinguisheses;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"overrules","result","dissentsFrom","derogates","extends","contrasts","restricts","applies","isAnalogTo","supports","distinguishes","putsInQuestion"};
    return  subtypes;
}
}

