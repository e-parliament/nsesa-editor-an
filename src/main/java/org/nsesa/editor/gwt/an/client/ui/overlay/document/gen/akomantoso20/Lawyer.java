package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class Lawyer extends InlinereqreqComplexType {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "lawyer");
        span.setClassName("widget lawyer");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Lawyer() {
        super(create());
        setType("lawyer");
    }

    public Lawyer(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType forAttr;
    private AnyURISimpleType empoweredByAttr;
    private AnyURISimpleType asAttr;

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
    public Lawyer forAttr(final AnyURISimpleType forAttr) {
        setForAttr(forAttr);
        return this;
    }

    public AnyURISimpleType getEmpoweredByAttr() {
        if (empoweredByAttr == null) {
            empoweredByAttr = new AnyURISimpleType();
            empoweredByAttr.setValue(getElement().getAttribute("empoweredBy"));
        }

        return empoweredByAttr;
    }

    //DSL Style get value
    public AnyURISimpleType empoweredByAttr() {
        return getEmpoweredByAttr();
    }

    public void setEmpoweredByAttr(final AnyURISimpleType empoweredByAttr) {
        this.empoweredByAttr = empoweredByAttr;
    }

    //DSL Style set value
    public Lawyer empoweredByAttr(final AnyURISimpleType empoweredByAttr) {
        setEmpoweredByAttr(empoweredByAttr);
        return this;
    }

    public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
            asAttr = new AnyURISimpleType();
            asAttr.setValue(getElement().getAttribute("as"));
        }

        return asAttr;
    }

    //DSL Style get value
    public AnyURISimpleType asAttr() {
        return getAsAttr();
    }

    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
    }

    //DSL Style set value
    public Lawyer asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
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
        attrs.put("for", getForAttr() != null ? getForAttr().getValue() : null);
        attrs.put("empoweredBy", getEmpoweredByAttr() != null ? getEmpoweredByAttr().getValue() : null);
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        return attrs;
    }
}

