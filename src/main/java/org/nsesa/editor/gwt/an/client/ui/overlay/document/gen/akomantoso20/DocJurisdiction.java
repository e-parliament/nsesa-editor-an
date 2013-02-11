package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
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

public class DocJurisdiction extends InlineComplexType  {
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
        span.setAttribute("type", "docJurisdiction");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget docJurisdiction");
        return span;
    }

// CONSTRUCTORS ------------------
    public DocJurisdiction() {
        super(create());
        setType("docJurisdiction");
    }

    public DocJurisdiction(Element element) {
        super(element);
    }

// FIELDS ------------------

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public DocJurisdiction refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }
    //DSL Style set value
    public DocJurisdiction periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
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
        return attrs;
    }
}

