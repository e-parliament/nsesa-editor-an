package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ParliamentaryAnalysisComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public ParliamentaryAnalysisComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    public java.util.List<QuorumVerification> getQuorumVerifications() {
        java.util.List<QuorumVerification> result = new ArrayList<QuorumVerification>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("QuorumVerification".equalsIgnoreCase(widget.getType())) {
                result.add((QuorumVerification)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Voting> getVotings() {
        java.util.List<Voting> result = new ArrayList<Voting>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Voting".equalsIgnoreCase(widget.getType())) {
                result.add((Voting)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Recount> getRecounts() {
        java.util.List<Recount> result = new ArrayList<Recount>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Recount".equalsIgnoreCase(widget.getType())) {
                result.add((Recount)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"recount","quorumVerification","voting"};
    }

}

