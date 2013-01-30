package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlinereqComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Rref extends InlinereqComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Inline(), new Occurrence(0,-1));
            put(new Marker(), new Occurrence(0,-1));
            put(new Popup(), new Occurrence(0,-1));
            put(new Ref(), new Occurrence(0,-1));
            put(new Mref(), new Occurrence(0,-1));
            put(new Rref(), new Occurrence(0,-1));
            put(new Mod(), new Occurrence(0,-1));
            put(new Mmod(), new Occurrence(0,-1));
            put(new Rmod(), new Occurrence(0,-1));
            put(new Remark(), new Occurrence(0,-1));
            put(new RecordedTime(), new Occurrence(0,-1));
            put(new Vote(), new Occurrence(0,-1));
            put(new Outcome(), new Occurrence(0,-1));
            put(new Ins(), new Occurrence(0,-1));
            put(new Del(), new Occurrence(0,-1));
            put(new Omissis(), new Occurrence(0,-1));
            put(new ExtractText(), new Occurrence(0,-1));
            put(new ExtractStructure(), new Occurrence(0,-1));
            put(new Placeholder(), new Occurrence(0,-1));
            put(new FillIn(), new Occurrence(0,-1));
            put(new B(), new Occurrence(0,-1));
            put(new I(), new Occurrence(0,-1));
            put(new A(), new Occurrence(0,-1));
            put(new U(), new Occurrence(0,-1));
            put(new Sub(), new Occurrence(0,-1));
            put(new Sup(), new Occurrence(0,-1));
            put(new Span(), new Occurrence(0,-1));
            put(new DocType(), new Occurrence(0,-1));
            put(new DocTitle(), new Occurrence(0,-1));
            put(new DocNumber(), new Occurrence(0,-1));
            put(new DocProponent(), new Occurrence(0,-1));
            put(new DocDate(), new Occurrence(0,-1));
            put(new Legislature(), new Occurrence(0,-1));
            put(new Session(), new Occurrence(0,-1));
            put(new ShortTitle(), new Occurrence(0,-1));
            put(new DocPurpose(), new Occurrence(0,-1));
            put(new DocCommittee(), new Occurrence(0,-1));
            put(new DocIntroducer(), new Occurrence(0,-1));
            put(new DocStage(), new Occurrence(0,-1));
            put(new DocStatus(), new Occurrence(0,-1));
            put(new DocJurisdiction(), new Occurrence(0,-1));
            put(new DocketNumber(), new Occurrence(0,-1));
            put(new Date(), new Occurrence(0,-1));
            put(new Person(), new Occurrence(0,-1));
            put(new Organization(), new Occurrence(0,-1));
            put(new Concept(), new Occurrence(0,-1));
            put(new Object(), new Occurrence(0,-1));
            put(new Event(), new Occurrence(0,-1));
            put(new Location(), new Occurrence(0,-1));
            put(new Process(), new Occurrence(0,-1));
            put(new Role(), new Occurrence(0,-1));
            put(new Term(), new Occurrence(0,-1));
            put(new Quantity(), new Occurrence(0,-1));
            put(new Def(), new Occurrence(0,-1));
            put(new Entity(), new Occurrence(0,-1));
            put(new CourtType(), new Occurrence(0,-1));
            put(new NeutralCitation(), new Occurrence(0,-1));
            put(new Party(), new Occurrence(0,-1));
            put(new Judge(), new Occurrence(0,-1));
            put(new Lawyer(), new Occurrence(0,-1));
            put(new Signature(), new Occurrence(0,-1));
            put(new Opinion(), new Occurrence(0,-1));
            put(new AffectedDocument(), new Occurrence(0,-1));
            put(new RelatedDocument(), new Occurrence(0,-1));
            put(new Change(), new Occurrence(0,-1));
            put(new NoteRef(), new Occurrence(0,-1));
            put(new Eol(), new Occurrence(0,-1));
            put(new Eop(), new Occurrence(0,-1));
            put(new Img(), new Occurrence(0,-1));
            put(new AuthorialNote(), new Occurrence(0,-1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "rref");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
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
        return  getFromAttr();
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
        return  getUpToAttr();
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
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
    */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
        return ALLOWED_SUB_TYPES;
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

