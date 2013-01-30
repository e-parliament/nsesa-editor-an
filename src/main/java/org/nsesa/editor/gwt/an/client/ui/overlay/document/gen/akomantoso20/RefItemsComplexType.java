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
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class RefItemsComplexType extends AmendableWidgetImpl  {
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
        span.setAttribute("type", "refItemsComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget refItemsComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public RefItemsComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;

    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
     }
     //DSL Style get value
    public AnyURISimpleType sourceAttr() {
        return  getSourceAttr();
    }

    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
     //DSL Style set value
    public RefItemsComplexType sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
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

     //DSL Style get value
    public java.util.List<Original> getOriginalList() {
        return  getOriginals();
    }
     //DSL Style set value
    public Original addOriginal(Original originalElem) {
        this.addAmendableWidget(originalElem);
        return originalElem;
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

     //DSL Style get value
    public java.util.List<PassiveRef> getPassiveRefList() {
        return  getPassiveRefs();
    }
     //DSL Style set value
    public PassiveRef addPassiveRef(PassiveRef passiveRefElem) {
        this.addAmendableWidget(passiveRefElem);
        return passiveRefElem;
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

     //DSL Style get value
    public java.util.List<ActiveRef> getActiveRefList() {
        return  getActiveRefs();
    }
     //DSL Style set value
    public ActiveRef addActiveRef(ActiveRef activeRefElem) {
        this.addAmendableWidget(activeRefElem);
        return activeRefElem;
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

     //DSL Style get value
    public java.util.List<Jurisprudence> getJurisprudenceList() {
        return  getJurisprudences();
    }
     //DSL Style set value
    public Jurisprudence addJurisprudence(Jurisprudence jurisprudenceElem) {
        this.addAmendableWidget(jurisprudenceElem);
        return jurisprudenceElem;
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

     //DSL Style get value
    public java.util.List<HasAttachment> getHasAttachmentList() {
        return  getHasAttachments();
    }
     //DSL Style set value
    public HasAttachment addHasAttachment(HasAttachment hasAttachmentElem) {
        this.addAmendableWidget(hasAttachmentElem);
        return hasAttachmentElem;
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

     //DSL Style get value
    public java.util.List<AttachmentOf> getAttachmentOfList() {
        return  getAttachmentOfs();
    }
     //DSL Style set value
    public AttachmentOf addAttachmentOf(AttachmentOf attachmentOfElem) {
        this.addAmendableWidget(attachmentOfElem);
        return attachmentOfElem;
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

     //DSL Style get value
    public java.util.List<TLCPerson> getTLCPersonList() {
        return  getTLCPersons();
    }
     //DSL Style set value
    public TLCPerson addTLCPerson(TLCPerson TLCPersonElem) {
        this.addAmendableWidget(TLCPersonElem);
        return TLCPersonElem;
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

     //DSL Style get value
    public java.util.List<TLCOrganization> getTLCOrganizationList() {
        return  getTLCOrganizations();
    }
     //DSL Style set value
    public TLCOrganization addTLCOrganization(TLCOrganization TLCOrganizationElem) {
        this.addAmendableWidget(TLCOrganizationElem);
        return TLCOrganizationElem;
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

     //DSL Style get value
    public java.util.List<TLCConcept> getTLCConceptList() {
        return  getTLCConcepts();
    }
     //DSL Style set value
    public TLCConcept addTLCConcept(TLCConcept TLCConceptElem) {
        this.addAmendableWidget(TLCConceptElem);
        return TLCConceptElem;
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

     //DSL Style get value
    public java.util.List<TLCObject> getTLCObjectList() {
        return  getTLCObjects();
    }
     //DSL Style set value
    public TLCObject addTLCObject(TLCObject TLCObjectElem) {
        this.addAmendableWidget(TLCObjectElem);
        return TLCObjectElem;
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

     //DSL Style get value
    public java.util.List<TLCEvent> getTLCEventList() {
        return  getTLCEvents();
    }
     //DSL Style set value
    public TLCEvent addTLCEvent(TLCEvent TLCEventElem) {
        this.addAmendableWidget(TLCEventElem);
        return TLCEventElem;
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

     //DSL Style get value
    public java.util.List<TLCLocation> getTLCLocationList() {
        return  getTLCLocations();
    }
     //DSL Style set value
    public TLCLocation addTLCLocation(TLCLocation TLCLocationElem) {
        this.addAmendableWidget(TLCLocationElem);
        return TLCLocationElem;
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

     //DSL Style get value
    public java.util.List<TLCProcess> getTLCProcessList() {
        return  getTLCProcesses();
    }
     //DSL Style set value
    public TLCProcess addTLCProcess(TLCProcess TLCProcessElem) {
        this.addAmendableWidget(TLCProcessElem);
        return TLCProcessElem;
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

     //DSL Style get value
    public java.util.List<TLCRole> getTLCRoleList() {
        return  getTLCRoles();
    }
     //DSL Style set value
    public TLCRole addTLCRole(TLCRole TLCRoleElem) {
        this.addAmendableWidget(TLCRoleElem);
        return TLCRoleElem;
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

     //DSL Style get value
    public java.util.List<TLCTerm> getTLCTermList() {
        return  getTLCTerms();
    }
     //DSL Style set value
    public TLCTerm addTLCTerm(TLCTerm TLCTermElem) {
        this.addAmendableWidget(TLCTermElem);
        return TLCTermElem;
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

     //DSL Style get value
    public java.util.List<TLCReference> getTLCReferenceList() {
        return  getTLCReferences();
    }
     //DSL Style set value
    public TLCReference addTLCReference(TLCReference TLCReferenceElem) {
        this.addAmendableWidget(TLCReferenceElem);
        return TLCReferenceElem;
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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }
}

