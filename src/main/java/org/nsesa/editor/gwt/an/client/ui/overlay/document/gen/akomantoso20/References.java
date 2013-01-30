package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.RefItemsComplexType;
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

public class References extends RefItemsComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Original(), new Occurrence(0,-1));
            put(new PassiveRef(), new Occurrence(0,-1));
            put(new ActiveRef(), new Occurrence(0,-1));
            put(new Jurisprudence(), new Occurrence(0,-1));
            put(new HasAttachment(), new Occurrence(0,-1));
            put(new AttachmentOf(), new Occurrence(0,-1));
            put(new TLCPerson(), new Occurrence(0,-1));
            put(new TLCOrganization(), new Occurrence(0,-1));
            put(new TLCConcept(), new Occurrence(0,-1));
            put(new TLCObject(), new Occurrence(0,-1));
            put(new TLCEvent(), new Occurrence(0,-1));
            put(new TLCLocation(), new Occurrence(0,-1));
            put(new TLCProcess(), new Occurrence(0,-1));
            put(new TLCRole(), new Occurrence(0,-1));
            put(new TLCTerm(), new Occurrence(0,-1));
            put(new TLCReference(), new Occurrence(0,-1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "references");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget references");
        return span;
    }

// CONSTRUCTORS ------------------
    public References() {
        super(create());
        setType("references");
    }

    public References(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"activeRef","attachmentOf","hasAttachment","jurisprudence","original","passiveRef","TLCConcept","TLCEvent","TLCLocation","TLCObject","TLCOrganization","TLCPerson","TLCProcess","TLCReference","TLCRole","TLCTerm"};
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

