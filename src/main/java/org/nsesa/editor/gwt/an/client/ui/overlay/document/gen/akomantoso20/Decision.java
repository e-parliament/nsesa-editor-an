package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Decision extends MaincontentComplexType  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "decision");
        span.setClassName("widget decision");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Decision() {
        super(create());
        setType("decision");
    }

    public Decision(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"paragraph","tblock","oralStatements","alinea","blockList","declarationOfVote","adjournment","ol","subchapter","componentRef","petitions","administrationOfOath","indent","subclause","questions","papers","table","sublist","proceduralMotions","nationalInterest","container","foreign","tome","subparagraph","toc","subsection","debateSection","div","block","resolutions","personalStatements","chapter","title","division","rollCall","ul","communication","noticesOfMotion","list","section","point","subpart","article","address","hcontainer","p","writtenStatements","subtitle","book","pointOfOrder","prayers","ministerialStatements","part","clause"};
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

