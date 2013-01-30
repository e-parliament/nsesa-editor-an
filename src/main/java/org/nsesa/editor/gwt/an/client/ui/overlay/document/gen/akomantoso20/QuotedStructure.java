package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PopupStructureComplexType;
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

public class QuotedStructure extends PopupStructureComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Intro(), new Occurrence(1,1));
            put(new Wrap(), new Occurrence(1,1));
            put(new Heading(), new Occurrence(1,1));
            put(new Subheading(), new Occurrence(1,1));
            put(new Content(), new Occurrence(1,1));
            put(new Num(), new Occurrence(1,1));
            put(new Recital(), new Occurrence(1,1));
            put(new Citation(), new Occurrence(1,1));
            put(new ComponentRef(), new Occurrence(1,1));
            put(new Hcontainer(), new Occurrence(0,-1));
            put(new Foreign(), new Occurrence(0,-1));
            put(new Block(), new Occurrence(0,-1));
            put(new Container(), new Occurrence(0,-1));
            put(new Speech(), new Occurrence(0,-1));
            put(new Question(), new Occurrence(0,-1));
            put(new Answer(), new Occurrence(0,-1));
            put(new Other(), new Occurrence(0,-1));
            put(new Scene(), new Occurrence(0,-1));
            put(new Narrative(), new Occurrence(0,-1));
            put(new Summary(), new Occurrence(0,-1));
            put(new Clause(), new Occurrence(0,-1));
            put(new Section(), new Occurrence(0,-1));
            put(new Part(), new Occurrence(0,-1));
            put(new Paragraph(), new Occurrence(0,-1));
            put(new Chapter(), new Occurrence(0,-1));
            put(new Title(), new Occurrence(0,-1));
            put(new Article(), new Occurrence(0,-1));
            put(new Book(), new Occurrence(0,-1));
            put(new Tome(), new Occurrence(0,-1));
            put(new Division(), new Occurrence(0,-1));
            put(new List(), new Occurrence(0,-1));
            put(new Point(), new Occurrence(0,-1));
            put(new Indent(), new Occurrence(0,-1));
            put(new Alinea(), new Occurrence(0,-1));
            put(new Subsection(), new Occurrence(0,-1));
            put(new Subpart(), new Occurrence(0,-1));
            put(new Subparagraph(), new Occurrence(0,-1));
            put(new Subchapter(), new Occurrence(0,-1));
            put(new Subtitle(), new Occurrence(0,-1));
            put(new Subclause(), new Occurrence(0,-1));
            put(new Sublist(), new Occurrence(0,-1));
            put(new BlockList(), new Occurrence(0,-1));
            put(new Toc(), new Occurrence(0,-1));
            put(new Tblock(), new Occurrence(0,-1));
            put(new Ul(), new Occurrence(0,-1));
            put(new Ol(), new Occurrence(0,-1));
            put(new Table(), new Occurrence(0,-1));
            put(new P(), new Occurrence(0,-1));
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
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "quotedStructure");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
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
        return  getForAttr();
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
        return new String[]{"address","adjournment","administrationOfOath","alinea","answer","article","block","blockList","book","chapter","citation","clause","communication","componentRef","container","content","debateSection","declarationOfVote","div","division","foreign","hcontainer","heading","indent","intro","list","ministerialStatements","narrative","nationalInterest","noticesOfMotion","num","ol","oralStatements","other","p","papers","paragraph","part","personalStatements","petitions","point","pointOfOrder","prayers","proceduralMotions","question","questions","recital","resolutions","rollCall","scene","section","speech","subchapter","subclause","subheading","sublist","subparagraph","subpart","subsection","subtitle","summary","table","tblock","title","toc","tome","ul","wrap","writtenStatements"};
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
        return attrs;
    }
}

