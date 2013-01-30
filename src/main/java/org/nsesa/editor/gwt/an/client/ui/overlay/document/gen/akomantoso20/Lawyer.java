package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlinereqreqComplexType;
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

public class Lawyer extends InlinereqreqComplexType  {
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
        span.setAttribute("type", "lawyer");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
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
        return  getForAttr();
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
        return  getEmpoweredByAttr();
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
        return  getAsAttr();
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
        return new String[]{"a","affectedDocument","authorialNote","b","change","concept","courtType","date","def","del","docCommittee","docDate","docIntroducer","docJurisdiction","docketNumber","docNumber","docProponent","docPurpose","docStage","docStatus","docTitle","docType","entity","eol","eop","event","extractStructure","extractText","fillIn","i","img","inline","ins","judge","lawyer","legislature","location","marker","mmod","mod","mref","neutralCitation","noteRef","object","omissis","opinion","organization","outcome","party","person","placeholder","popup","process","quantity","recordedTime","ref","relatedDocument","remark","rmod","role","rref","session","shortTitle","signature","span","sub","sup","term","u","vote"};
    }

    @Override
    public Map<AmendableWidget, Occurrence> getAllowedSubTypes() {
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
        attrs.put("for", getForAttr() != null ? getForAttr().getValue() : null);
        attrs.put("empoweredBy", getEmpoweredByAttr() != null ? getEmpoweredByAttr().getValue() : null);
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        return attrs;
    }
}

