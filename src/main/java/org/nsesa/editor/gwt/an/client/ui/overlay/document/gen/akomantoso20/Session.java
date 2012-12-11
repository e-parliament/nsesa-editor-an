package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class Session extends InlineComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "session");
        span.setClassName("widget session");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Session() {
        super(create());
        setType("session");
    }

    public Session(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private StringSimpleType valueAttr;

    public StringSimpleType getValueAttr() {
        if (valueAttr == null) {
            valueAttr = new StringSimpleType();
            valueAttr.setValue(getElement().getAttribute("value"));
        }

        return valueAttr;
    }

    //DSL Style get value
    public StringSimpleType valueAttr() {
        return getValueAttr();
    }

    public void setValueAttr(final StringSimpleType valueAttr) {
        this.valueAttr = valueAttr;
    }

    //DSL Style set value
    public Session valueAttr(final StringSimpleType valueAttr) {
        setValueAttr(valueAttr);
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
        attrs.put("value", getValueAttr() != null ? getValueAttr().getValue() : null);
        return attrs;
    }
}

