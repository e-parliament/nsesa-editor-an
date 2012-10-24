package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.QuorumVerification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Voting;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Recount;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.QuorumVerification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Voting;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Recount;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ParliamentaryAnalysisComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ParliamentaryAnalysisComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<QuorumVerification> quorumVerifications = new ArrayList<QuorumVerification>();
private java.util.List<Voting> votings = new ArrayList<Voting>();
private java.util.List<Recount> recounts = new ArrayList<Recount>();

public java.util.List<QuorumVerification> getQuorumVerification() {
return quorumVerifications;
}

public void setQuorumVerification(final java.util.List<QuorumVerification> quorumVerifications) {
this.quorumVerifications = quorumVerifications;
}

public java.util.List<Voting> getVoting() {
return votings;
}

public void setVoting(final java.util.List<Voting> votings) {
this.votings = votings;
}

public java.util.List<Recount> getRecount() {
return recounts;
}

public void setRecount(final java.util.List<Recount> recounts) {
this.recounts = recounts;
}

}

