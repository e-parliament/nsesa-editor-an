package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class Rref extends InlinereqComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "rref");
        span.setClassName("widget rref");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Rref() {
        super(create());
        setType("rref");
    }

    public Rref(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType fromAttr;
    private AnyURISimpleType upToAttr;

    public AnyURISimpleType getFromAttr() {
        if (fromAttr == null) {
            fromAttr = new AnyURISimpleType();
            fromAttr.setValue(getElement().getAttribute("from"));
        }

        return fromAttr;
    }

    //DSL Style get value
    public AnyURISimpleType fromAttr() {
        return getFromAttr();
    }

    public void setFromAttr(final AnyURISimpleType fromAttr) {
        this.fromAttr = fromAttr;
    }

    //DSL Style set value
    public Rref fromAttr(final AnyURISimpleType fromAttr) {
        setFromAttr(fromAttr);
        return this;
    }

    public AnyURISimpleType getUpToAttr() {
        if (upToAttr == null) {
            upToAttr = new AnyURISimpleType();
            upToAttr.setValue(getElement().getAttribute("upTo"));
        }

        return upToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType upToAttr() {
        return getUpToAttr();
    }

    public void setUpToAttr(final AnyURISimpleType upToAttr) {
        this.upToAttr = upToAttr;
    }

    //DSL Style set value
    public Rref upToAttr(final AnyURISimpleType upToAttr) {
        setUpToAttr(upToAttr);
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
        attrs.put("from", getFromAttr() != null ? getFromAttr().getValue() : null);
        attrs.put("upTo", getUpToAttr() != null ? getUpToAttr().getValue() : null);
        return attrs;
    }
}

