package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Original;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PassiveRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ActiveRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Jurisprudence;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.HasAttachment;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AttachmentOf;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCPerson;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCOrganization;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCConcept;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCObject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCEvent;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCLocation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCProcess;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCRole;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCTerm;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TLCReference;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class RefItemsComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public RefItemsComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;
    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(amendableElement.getAttribute("source"));
        }

        return sourceAttr;
    }
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
    public java.util.List<Original> getOriginals() {
        java.util.List<Original> result = new ArrayList<Original>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Original".equalsIgnoreCase(widget.getType())) {
                result.add((Original)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<PassiveRef> getPassiveRefs() {
        java.util.List<PassiveRef> result = new ArrayList<PassiveRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PassiveRef".equalsIgnoreCase(widget.getType())) {
                result.add((PassiveRef)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<ActiveRef> getActiveRefs() {
        java.util.List<ActiveRef> result = new ArrayList<ActiveRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ActiveRef".equalsIgnoreCase(widget.getType())) {
                result.add((ActiveRef)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Jurisprudence> getJurisprudences() {
        java.util.List<Jurisprudence> result = new ArrayList<Jurisprudence>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Jurisprudence".equalsIgnoreCase(widget.getType())) {
                result.add((Jurisprudence)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<HasAttachment> getHasAttachments() {
        java.util.List<HasAttachment> result = new ArrayList<HasAttachment>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("HasAttachment".equalsIgnoreCase(widget.getType())) {
                result.add((HasAttachment)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<AttachmentOf> getAttachmentOfs() {
        java.util.List<AttachmentOf> result = new ArrayList<AttachmentOf>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AttachmentOf".equalsIgnoreCase(widget.getType())) {
                result.add((AttachmentOf)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCPerson> getTLCPersons() {
        java.util.List<TLCPerson> result = new ArrayList<TLCPerson>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCPerson".equalsIgnoreCase(widget.getType())) {
                result.add((TLCPerson)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCOrganization> getTLCOrganizations() {
        java.util.List<TLCOrganization> result = new ArrayList<TLCOrganization>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCOrganization".equalsIgnoreCase(widget.getType())) {
                result.add((TLCOrganization)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCConcept> getTLCConcepts() {
        java.util.List<TLCConcept> result = new ArrayList<TLCConcept>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCConcept".equalsIgnoreCase(widget.getType())) {
                result.add((TLCConcept)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCObject> getTLCObjects() {
        java.util.List<TLCObject> result = new ArrayList<TLCObject>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCObject".equalsIgnoreCase(widget.getType())) {
                result.add((TLCObject)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCEvent> getTLCEvents() {
        java.util.List<TLCEvent> result = new ArrayList<TLCEvent>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCEvent".equalsIgnoreCase(widget.getType())) {
                result.add((TLCEvent)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCLocation> getTLCLocations() {
        java.util.List<TLCLocation> result = new ArrayList<TLCLocation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCLocation".equalsIgnoreCase(widget.getType())) {
                result.add((TLCLocation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCProcess> getTLCProcesses() {
        java.util.List<TLCProcess> result = new ArrayList<TLCProcess>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCProcess".equalsIgnoreCase(widget.getType())) {
                result.add((TLCProcess)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCRole> getTLCRoles() {
        java.util.List<TLCRole> result = new ArrayList<TLCRole>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCRole".equalsIgnoreCase(widget.getType())) {
                result.add((TLCRole)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCTerm> getTLCTerms() {
        java.util.List<TLCTerm> result = new ArrayList<TLCTerm>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCTerm".equalsIgnoreCase(widget.getType())) {
                result.add((TLCTerm)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<TLCReference> getTLCReferences() {
        java.util.List<TLCReference> result = new ArrayList<TLCReference>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TLCReference".equalsIgnoreCase(widget.getType())) {
                result.add((TLCReference)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"TLCEvent","TLCPerson","TLCProcess","hasAttachment","TLCReference","TLCLocation","attachmentOf","TLCConcept","TLCObject","jurisprudence","TLCTerm","passiveRef","original","TLCRole","activeRef","TLCOrganization"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("sourceAttr", getSourceAttr().getValue());

        return attrs;
    }

}

