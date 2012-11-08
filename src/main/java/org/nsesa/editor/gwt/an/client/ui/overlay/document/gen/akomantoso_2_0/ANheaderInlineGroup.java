package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CourtType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NeutralCitation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Party;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Judge;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Lawyer;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Signature;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Opinion;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
/**
* This file is generated.
*/
public class ANheaderInlineGroup   {

// CONSTRUCTORS ------------------

// FIELDS ------------------
private CourtType courtType;
private NeutralCitation neutralCitation;
private Party party;
private Judge judge;
private Lawyer lawyer;
private Signature signature;
private Opinion opinion;

public CourtType getCourtType() {
return courtType;
}

public void setCourtType(final CourtType courtType) {
this.courtType = courtType;
}
public NeutralCitation getNeutralCitation() {
return neutralCitation;
}

public void setNeutralCitation(final NeutralCitation neutralCitation) {
this.neutralCitation = neutralCitation;
}
public Party getParty() {
return party;
}

public void setParty(final Party party) {
this.party = party;
}
public Judge getJudge() {
return judge;
}

public void setJudge(final Judge judge) {
this.judge = judge;
}
public Lawyer getLawyer() {
return lawyer;
}

public void setLawyer(final Lawyer lawyer) {
this.lawyer = lawyer;
}
public Signature getSignature() {
return signature;
}

public void setSignature(final Signature signature) {
this.signature = signature;
}
public Opinion getOpinion() {
return opinion;
}

public void setOpinion(final Opinion opinion) {
this.opinion = opinion;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

