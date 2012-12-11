package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class List extends HierarchyComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "list");
        span.setClassName("widget list");
        return span;
    }

    // CONSTRUCTORS ------------------
    public List() {
        super(create());
        setType("list");
    }

    public List(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tome", "subparagraph", "paragraph", "subheading", "subsection", "title", "chapter", "division", "alinea", "componentRef", "subchapter", "wrap", "indent", "subclause", "list", "sublist", "section", "intro", "content", "point", "num", "article", "subpart", "hcontainer", "book", "subtitle", "part", "heading", "clause"};
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

