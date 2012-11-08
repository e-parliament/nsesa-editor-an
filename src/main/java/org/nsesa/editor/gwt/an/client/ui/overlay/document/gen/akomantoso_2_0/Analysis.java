package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ActiveModifications;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PassiveModifications;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Judicial;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Parliamentary;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.OtherAnalysis;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Analysis extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Analysis(Element element) {
    super(element);
}

// FIELDS ------------------
private SourceAttrGroup source;
private ActiveModifications activeModifications;
private PassiveModifications passiveModifications;
private Judicial judicial;
private Parliamentary parliamentary;
private java.util.List<OtherAnalysis> otherAnalysises = new ArrayList<OtherAnalysis>();

public SourceAttrGroup getSource() {
return source;
}

public void setSource(final SourceAttrGroup source) {
this.source = source;
}
public ActiveModifications getActiveModifications() {
return activeModifications;
}

public void setActiveModifications(final ActiveModifications activeModifications) {
this.activeModifications = activeModifications;
}
public PassiveModifications getPassiveModifications() {
return passiveModifications;
}

public void setPassiveModifications(final PassiveModifications passiveModifications) {
this.passiveModifications = passiveModifications;
}
public Judicial getJudicial() {
return judicial;
}

public void setJudicial(final Judicial judicial) {
this.judicial = judicial;
}
public Parliamentary getParliamentary() {
return parliamentary;
}

public void setParliamentary(final Parliamentary parliamentary) {
this.parliamentary = parliamentary;
}
public java.util.List<OtherAnalysis> getOtherAnalysis() {
return otherAnalysises;
}

public void setOtherAnalysis(final java.util.List<OtherAnalysis> otherAnalysises) {
this.otherAnalysises = otherAnalysises;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"judicial","parliamentary","activeModifications","passiveModifications","sourceAttrGroup","otherAnalysis"};
    return  subtypes;
}
}

