package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class References extends RefItemsComplexType  {

// CONSTRUCTORS ------------------
    public References() {
        super(DOM.createElement("references"));
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
        return new String[]{"TLCEvent","TLCPerson","TLCProcess","hasAttachment","TLCReference","TLCLocation","attachmentOf","TLCConcept","TLCObject","jurisprudence","TLCTerm","passiveRef","original","TLCRole","activeRef","TLCOrganization"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

