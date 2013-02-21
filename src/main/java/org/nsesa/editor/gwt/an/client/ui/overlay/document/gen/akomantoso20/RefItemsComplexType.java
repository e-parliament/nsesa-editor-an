/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class RefItemsComplexType extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Original(), new Occurrence(0, -1));
            put(new PassiveRef(), new Occurrence(0, -1));
            put(new ActiveRef(), new Occurrence(0, -1));
            put(new Jurisprudence(), new Occurrence(0, -1));
            put(new HasAttachment(), new Occurrence(0, -1));
            put(new AttachmentOf(), new Occurrence(0, -1));
            put(new TLCPerson(), new Occurrence(0, -1));
            put(new TLCOrganization(), new Occurrence(0, -1));
            put(new TLCConcept(), new Occurrence(0, -1));
            put(new TLCObject(), new Occurrence(0, -1));
            put(new TLCEvent(), new Occurrence(0, -1));
            put(new TLCLocation(), new Occurrence(0, -1));
            put(new TLCProcess(), new Occurrence(0, -1));
            put(new TLCRole(), new Occurrence(0, -1));
            put(new TLCTerm(), new Occurrence(0, -1));
            put(new TLCReference(), new Occurrence(0, -1));
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
        return getSourceAttr();
    }

    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source", sourceAttr.getValue());
    }

    //DSL Style set value
    public RefItemsComplexType sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }

    public java.util.List<Original> getOriginals() {
        java.util.List<Original> result = new ArrayList<Original>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Original".equalsIgnoreCase(widget.getType())) {
                result.add((Original) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Original> getOriginalList() {
        return getOriginals();
    }

    //DSL Style set value
    public Original addOriginal(Original originalElem) {
        this.addOverlayWidget(originalElem);
        return originalElem;
    }

    public java.util.List<PassiveRef> getPassiveRefs() {
        java.util.List<PassiveRef> result = new ArrayList<PassiveRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PassiveRef".equalsIgnoreCase(widget.getType())) {
                result.add((PassiveRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<PassiveRef> getPassiveRefList() {
        return getPassiveRefs();
    }

    //DSL Style set value
    public PassiveRef addPassiveRef(PassiveRef passiveRefElem) {
        this.addOverlayWidget(passiveRefElem);
        return passiveRefElem;
    }

    public java.util.List<ActiveRef> getActiveRefs() {
        java.util.List<ActiveRef> result = new ArrayList<ActiveRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ActiveRef".equalsIgnoreCase(widget.getType())) {
                result.add((ActiveRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<ActiveRef> getActiveRefList() {
        return getActiveRefs();
    }

    //DSL Style set value
    public ActiveRef addActiveRef(ActiveRef activeRefElem) {
        this.addOverlayWidget(activeRefElem);
        return activeRefElem;
    }

    public java.util.List<Jurisprudence> getJurisprudences() {
        java.util.List<Jurisprudence> result = new ArrayList<Jurisprudence>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Jurisprudence".equalsIgnoreCase(widget.getType())) {
                result.add((Jurisprudence) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Jurisprudence> getJurisprudenceList() {
        return getJurisprudences();
    }

    //DSL Style set value
    public Jurisprudence addJurisprudence(Jurisprudence jurisprudenceElem) {
        this.addOverlayWidget(jurisprudenceElem);
        return jurisprudenceElem;
    }

    public java.util.List<HasAttachment> getHasAttachments() {
        java.util.List<HasAttachment> result = new ArrayList<HasAttachment>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("HasAttachment".equalsIgnoreCase(widget.getType())) {
                result.add((HasAttachment) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<HasAttachment> getHasAttachmentList() {
        return getHasAttachments();
    }

    //DSL Style set value
    public HasAttachment addHasAttachment(HasAttachment hasAttachmentElem) {
        this.addOverlayWidget(hasAttachmentElem);
        return hasAttachmentElem;
    }

    public java.util.List<AttachmentOf> getAttachmentOfs() {
        java.util.List<AttachmentOf> result = new ArrayList<AttachmentOf>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AttachmentOf".equalsIgnoreCase(widget.getType())) {
                result.add((AttachmentOf) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<AttachmentOf> getAttachmentOfList() {
        return getAttachmentOfs();
    }

    //DSL Style set value
    public AttachmentOf addAttachmentOf(AttachmentOf attachmentOfElem) {
        this.addOverlayWidget(attachmentOfElem);
        return attachmentOfElem;
    }

    public java.util.List<TLCPerson> getTLCPersons() {
        java.util.List<TLCPerson> result = new ArrayList<TLCPerson>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCPerson".equalsIgnoreCase(widget.getType())) {
                result.add((TLCPerson) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCPerson> getTLCPersonList() {
        return getTLCPersons();
    }

    //DSL Style set value
    public TLCPerson addTLCPerson(TLCPerson TLCPersonElem) {
        this.addOverlayWidget(TLCPersonElem);
        return TLCPersonElem;
    }

    public java.util.List<TLCOrganization> getTLCOrganizations() {
        java.util.List<TLCOrganization> result = new ArrayList<TLCOrganization>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCOrganization".equalsIgnoreCase(widget.getType())) {
                result.add((TLCOrganization) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCOrganization> getTLCOrganizationList() {
        return getTLCOrganizations();
    }

    //DSL Style set value
    public TLCOrganization addTLCOrganization(TLCOrganization TLCOrganizationElem) {
        this.addOverlayWidget(TLCOrganizationElem);
        return TLCOrganizationElem;
    }

    public java.util.List<TLCConcept> getTLCConcepts() {
        java.util.List<TLCConcept> result = new ArrayList<TLCConcept>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCConcept".equalsIgnoreCase(widget.getType())) {
                result.add((TLCConcept) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCConcept> getTLCConceptList() {
        return getTLCConcepts();
    }

    //DSL Style set value
    public TLCConcept addTLCConcept(TLCConcept TLCConceptElem) {
        this.addOverlayWidget(TLCConceptElem);
        return TLCConceptElem;
    }

    public java.util.List<TLCObject> getTLCObjects() {
        java.util.List<TLCObject> result = new ArrayList<TLCObject>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCObject".equalsIgnoreCase(widget.getType())) {
                result.add((TLCObject) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCObject> getTLCObjectList() {
        return getTLCObjects();
    }

    //DSL Style set value
    public TLCObject addTLCObject(TLCObject TLCObjectElem) {
        this.addOverlayWidget(TLCObjectElem);
        return TLCObjectElem;
    }

    public java.util.List<TLCEvent> getTLCEvents() {
        java.util.List<TLCEvent> result = new ArrayList<TLCEvent>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCEvent".equalsIgnoreCase(widget.getType())) {
                result.add((TLCEvent) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCEvent> getTLCEventList() {
        return getTLCEvents();
    }

    //DSL Style set value
    public TLCEvent addTLCEvent(TLCEvent TLCEventElem) {
        this.addOverlayWidget(TLCEventElem);
        return TLCEventElem;
    }

    public java.util.List<TLCLocation> getTLCLocations() {
        java.util.List<TLCLocation> result = new ArrayList<TLCLocation>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCLocation".equalsIgnoreCase(widget.getType())) {
                result.add((TLCLocation) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCLocation> getTLCLocationList() {
        return getTLCLocations();
    }

    //DSL Style set value
    public TLCLocation addTLCLocation(TLCLocation TLCLocationElem) {
        this.addOverlayWidget(TLCLocationElem);
        return TLCLocationElem;
    }

    public java.util.List<TLCProcess> getTLCProcesses() {
        java.util.List<TLCProcess> result = new ArrayList<TLCProcess>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCProcess".equalsIgnoreCase(widget.getType())) {
                result.add((TLCProcess) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCProcess> getTLCProcessList() {
        return getTLCProcesses();
    }

    //DSL Style set value
    public TLCProcess addTLCProcess(TLCProcess TLCProcessElem) {
        this.addOverlayWidget(TLCProcessElem);
        return TLCProcessElem;
    }

    public java.util.List<TLCRole> getTLCRoles() {
        java.util.List<TLCRole> result = new ArrayList<TLCRole>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCRole".equalsIgnoreCase(widget.getType())) {
                result.add((TLCRole) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCRole> getTLCRoleList() {
        return getTLCRoles();
    }

    //DSL Style set value
    public TLCRole addTLCRole(TLCRole TLCRoleElem) {
        this.addOverlayWidget(TLCRoleElem);
        return TLCRoleElem;
    }

    public java.util.List<TLCTerm> getTLCTerms() {
        java.util.List<TLCTerm> result = new ArrayList<TLCTerm>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCTerm".equalsIgnoreCase(widget.getType())) {
                result.add((TLCTerm) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCTerm> getTLCTermList() {
        return getTLCTerms();
    }

    //DSL Style set value
    public TLCTerm addTLCTerm(TLCTerm TLCTermElem) {
        this.addOverlayWidget(TLCTermElem);
        return TLCTermElem;
    }

    public java.util.List<TLCReference> getTLCReferences() {
        java.util.List<TLCReference> result = new ArrayList<TLCReference>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCReference".equalsIgnoreCase(widget.getType())) {
                result.add((TLCReference) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<TLCReference> getTLCReferenceList() {
        return getTLCReferences();
    }

    //DSL Style set value
    public TLCReference addTLCReference(TLCReference TLCReferenceElem) {
        this.addOverlayWidget(TLCReferenceElem);
        return TLCReferenceElem;
    }

//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }
}

