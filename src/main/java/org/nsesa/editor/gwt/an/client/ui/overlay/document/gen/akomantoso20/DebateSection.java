package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AlthierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
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

public class DebateSection extends AlthierarchyComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new ComponentRef(), new Occurrence(1,1));
            put(new Container(), new Occurrence(0,-1));
            put(new Speech(), new Occurrence(0,-1));
            put(new Question(), new Occurrence(0,-1));
            put(new Answer(), new Occurrence(0,-1));
            put(new Other(), new Occurrence(0,-1));
            put(new Scene(), new Occurrence(0,-1));
            put(new Narrative(), new Occurrence(0,-1));
            put(new Summary(), new Occurrence(0,-1));
            put(new Foreign(), new Occurrence(0,-1));
            put(new Block(), new Occurrence(0,-1));
            put(new AdministrationOfOath(), new Occurrence(0,-1));
            put(new RollCall(), new Occurrence(0,-1));
            put(new Prayers(), new Occurrence(0,-1));
            put(new OralStatements(), new Occurrence(0,-1));
            put(new WrittenStatements(), new Occurrence(0,-1));
            put(new PersonalStatements(), new Occurrence(0,-1));
            put(new MinisterialStatements(), new Occurrence(0,-1));
            put(new Resolutions(), new Occurrence(0,-1));
            put(new NationalInterest(), new Occurrence(0,-1));
            put(new DeclarationOfVote(), new Occurrence(0,-1));
            put(new Communication(), new Occurrence(0,-1));
            put(new Petitions(), new Occurrence(0,-1));
            put(new Papers(), new Occurrence(0,-1));
            put(new NoticesOfMotion(), new Occurrence(0,-1));
            put(new Questions(), new Occurrence(0,-1));
            put(new Address(), new Occurrence(0,-1));
            put(new ProceduralMotions(), new Occurrence(0,-1));
            put(new PointOfOrder(), new Occurrence(0,-1));
            put(new Adjournment(), new Occurrence(0,-1));
            put(new DebateSection(), new Occurrence(0,-1));
            put(new Div(), new Occurrence(0,-1));
            put(new BlockList(), new Occurrence(0,-1));
            put(new Toc(), new Occurrence(0,-1));
            put(new Tblock(), new Occurrence(0,-1));
            put(new Ul(), new Occurrence(0,-1));
            put(new Ol(), new Occurrence(0,-1));
            put(new Table(), new Occurrence(0,-1));
            put(new P(), new Occurrence(0,-1));
            put(new Num(), new Occurrence(0,1));
            put(new Heading(), new Occurrence(0,1));
            put(new Subheading(), new Occurrence(0,1));
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "debateSection");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget debateSection");
        return span;
    }

// CONSTRUCTORS ------------------
    public DebateSection() {
        super(create());
        setType("debateSection");
    }

    public DebateSection(Element element) {
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
        return  getNameAttr();
    }

    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
     //DSL Style set value
    public DebateSection nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
    }
    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public DebateSection refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }
    //DSL Style set value
    public DebateSection periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
    */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
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

