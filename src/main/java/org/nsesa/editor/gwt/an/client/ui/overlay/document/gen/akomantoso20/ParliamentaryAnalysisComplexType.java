package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.QuorumVerification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Voting;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Recount;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

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

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());

        return attrs;
    }

}

