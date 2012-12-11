package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class QuotedStructure extends PopupStructureComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "quotedStructure");
        span.setClassName("widget quotedStructure");
        return span;
    }

    // CONSTRUCTORS ------------------
    public QuotedStructure() {
        super(create());
        setType("quotedStructure");
    }

    public QuotedStructure(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType forAttr;

    public AnyURISimpleType getForAttr() {
        if (forAttr == null) {
            forAttr = new AnyURISimpleType();
            forAttr.setValue(getElement().getAttribute("for"));
        }

        return forAttr;
    }

    //DSL Style get value
    public AnyURISimpleType forAttr() {
        return getForAttr();
    }

    public void setForAttr(final AnyURISimpleType forAttr) {
        this.forAttr = forAttr;
    }

    //DSL Style set value
    public QuotedStructure forAttr(final AnyURISimpleType forAttr) {
        setForAttr(forAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"summary", "paragraph", "tblock", "narrative", "oralStatements", "alinea", "blockList", "declarationOfVote", "adjournment", "ol", "petitions", "componentRef", "subchapter", "wrap", "citation", "administrationOfOath", "indent", "subclause", "answer", "questions", "papers", "table", "sublist", "proceduralMotions", "content", "speech", "nationalInterest", "container", "scene", "foreign", "heading", "tome", "other", "subparagraph", "toc", "subheading", "subsection", "debateSection", "div", "resolutions", "block", "personalStatements", "recital", "chapter", "title", "rollCall", "division", "question", "ul", "communication", "noticesOfMotion", "list", "section", "intro", "point", "num", "article", "subpart", "address", "writtenStatements", "hcontainer", "p", "book", "subtitle", "pointOfOrder", "prayers", "ministerialStatements", "part", "clause"};
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
        attrs.put("for", getForAttr() != null ? getForAttr().getValue() : null);
        return attrs;
    }
}

