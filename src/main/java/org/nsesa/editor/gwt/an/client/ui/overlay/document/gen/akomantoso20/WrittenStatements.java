package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AlthierarchyComplexType;
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

public class WrittenStatements extends AlthierarchyComplexType  {
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
        span.setAttribute("type", "writtenStatements");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget writtenStatements");
        return span;
    }

// CONSTRUCTORS ------------------
    public WrittenStatements() {
        super(create());
        setType("writtenStatements");
    }

    public WrittenStatements(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"address","adjournment","administrationOfOath","answer","block","blockList","communication","componentRef","container","debateSection","declarationOfVote","div","foreign","heading","ministerialStatements","narrative","nationalInterest","noticesOfMotion","num","ol","oralStatements","other","p","papers","personalStatements","petitions","pointOfOrder","prayers","proceduralMotions","question","questions","resolutions","rollCall","scene","speech","subheading","summary","table","tblock","toc","ul","writtenStatements"};
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
        return attrs;
    }
}

