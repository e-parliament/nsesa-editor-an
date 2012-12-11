package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class DebateBody extends DebateBodyTypeComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "debateBody");
        span.setClassName("widget debateBody");
        return span;
    }

    // CONSTRUCTORS ------------------
    public DebateBody() {
        super(create());
        setType("debateBody");
    }

    public DebateBody(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"petitions", "administrationOfOath", "communication", "debateSection", "noticesOfMotion", "questions", "resolutions", "papers", "personalStatements", "proceduralMotions", "oralStatements", "rollCall", "address", "nationalInterest", "writtenStatements", "declarationOfVote", "pointOfOrder", "adjournment", "prayers", "ministerialStatements"};
    }

    /**
     * Returns the namespace URI of this amendable widget.
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }
}

