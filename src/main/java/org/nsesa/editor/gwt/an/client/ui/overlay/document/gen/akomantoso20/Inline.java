package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class Inline extends InlineComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "inline");
        span.setClassName("widget inline");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Inline() {
        super(create());
        setType("inline");
    }

    public Inline(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private StringSimpleType nameAttr;

    public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
            nameAttr = new StringSimpleType();
            nameAttr.setValue(getElement().getAttribute("name"));
        }

        return nameAttr;
    }

    //DSL Style get value
    public StringSimpleType nameAttr() {
        return getNameAttr();
    }

    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }

    //DSL Style set value
    public Inline nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person", "neutralCitation", "docType", "remark", "docStatus", "location", "change", "entity", "authorialNote", "img", "party", "legislature", "event", "eol", "role", "opinion", "quantity", "extractStructure", "eop", "fillIn", "signature", "docStage", "mmod", "docCommittee", "vote", "ins", "mod", "noteRef", "docNumber", "rref", "marker", "session", "recordedTime", "lawyer", "docPurpose", "extractText", "span", "sub", "concept", "courtType", "docJurisdiction", "object", "sup", "docProponent", "date", "omissis", "rmod", "organization", "def", "docketNumber", "judge", "popup", "inline", "docTitle", "del", "docDate", "relatedDocument", "affectedDocument", "mref", "docIntroducer", "b", "placeholder", "a", "outcome", "i", "process", "ref", "u", "term", "shortTitle"};
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
        attrs.put("name", getNameAttr() != null ? getNameAttr().getValue() : null);
        return attrs;
    }
}

