package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class WrittenStatements extends AlthierarchyComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "writtenStatements");
        span.setClassName("widget writtenStatements");
        return span;
    }

    // CONSTRUCTORS ------------------
    public WrittenStatements() {
        super(create());
        setType("writtenStatements");
    }

    public WrittenStatements(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"summary", "toc", "other", "tblock", "subheading", "narrative", "debateSection", "div", "block", "resolutions", "personalStatements", "oralStatements", "rollCall", "blockList", "declarationOfVote", "adjournment", "ol", "question", "componentRef", "petitions", "administrationOfOath", "ul", "communication", "noticesOfMotion", "answer", "questions", "papers", "table", "proceduralMotions", "num", "speech", "address", "nationalInterest", "container", "p", "writtenStatements", "pointOfOrder", "scene", "prayers", "ministerialStatements", "foreign", "heading"};
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

