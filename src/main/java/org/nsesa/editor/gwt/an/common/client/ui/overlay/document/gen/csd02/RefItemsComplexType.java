/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * The complex type refItems is a list of types of references used in the references section.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class RefItemsComplexType extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultChoice(1, -1, new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new Original())
                    , new StructureIndicator.DefaultElement(1, 1, new PassiveRef())
                    , new StructureIndicator.DefaultElement(1, 1, new ActiveRef())
                    , new StructureIndicator.DefaultElement(1, 1, new Jurisprudence())
                    , new StructureIndicator.DefaultElement(1, 1, new HasAttachment())
                    , new StructureIndicator.DefaultElement(1, 1, new AttachmentOf())
            )
            )
                    , new StructureIndicator.DefaultGroup(1, 1, new StructureIndicator.DefaultChoice(1, 1, new StructureIndicator.DefaultElement(1, 1, new TLCPerson())
                    , new StructureIndicator.DefaultElement(1, 1, new TLCOrganization())
                    , new StructureIndicator.DefaultElement(1, 1, new TLCConcept())
                    , new StructureIndicator.DefaultElement(1, 1, new TLCObject())
                    , new StructureIndicator.DefaultElement(1, 1, new TLCEvent())
                    , new StructureIndicator.DefaultElement(1, 1, new TLCLocation())
                    , new StructureIndicator.DefaultElement(1, 1, new TLCProcess())
                    , new StructureIndicator.DefaultElement(1, 1, new TLCRole())
                    , new StructureIndicator.DefaultElement(1, 1, new TLCTerm())
                    , new StructureIndicator.DefaultElement(1, 1, new TLCReference())
            )
            )
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "refItemsComplexType");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget refItemsComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>RefItemsComplexType</code> object with the given DOM element
     */
    public RefItemsComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType sourceAttr;

    /**
     * Return <code>sourceAttr</code> property
     *
     * @return sourceAttr
     */
    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
    }

    /**
     * Return <code>sourceAttr</code> property in DSL way
     *
     * @return sourceAttr
     */
    public AnyURISimpleType sourceAttr() {
        return getSourceAttr();
    }

    /**
     * Set <code>sourceAttr</code> property
     *
     * @param sourceAttr the new value
     */
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source", sourceAttr.getValue());
    }

    /**
     * Set <code>sourceAttr</code> property in DSL way
     *
     * @param sourceAttr the new value
     * @return <code>RefItemsComplexType</code> instance
     */
    public RefItemsComplexType sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }

    /**
     * Return <code>java.util.List<Original></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Original> getOriginals() {
        java.util.List<Original> result = new ArrayList<Original>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Original".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Original) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Original></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Original> getOriginalList() {
        return getOriginals();
    }

    /**
     * Add <code>java.util.List<Original></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Original addOriginal(Original originalElem) {
        this.addOverlayWidget(originalElem);
        return originalElem;
    }

    /**
     * Return <code>java.util.List<PassiveRef></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<PassiveRef> getPassiveRefs() {
        java.util.List<PassiveRef> result = new ArrayList<PassiveRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PassiveRef".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((PassiveRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<PassiveRef></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<PassiveRef> getPassiveRefList() {
        return getPassiveRefs();
    }

    /**
     * Add <code>java.util.List<PassiveRef></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public PassiveRef addPassiveRef(PassiveRef passiveRefElem) {
        this.addOverlayWidget(passiveRefElem);
        return passiveRefElem;
    }

    /**
     * Return <code>java.util.List<ActiveRef></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ActiveRef> getActiveRefs() {
        java.util.List<ActiveRef> result = new ArrayList<ActiveRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ActiveRef".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((ActiveRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<ActiveRef></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<ActiveRef> getActiveRefList() {
        return getActiveRefs();
    }

    /**
     * Add <code>java.util.List<ActiveRef></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public ActiveRef addActiveRef(ActiveRef activeRefElem) {
        this.addOverlayWidget(activeRefElem);
        return activeRefElem;
    }

    /**
     * Return <code>java.util.List<Jurisprudence></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Jurisprudence> getJurisprudences() {
        java.util.List<Jurisprudence> result = new ArrayList<Jurisprudence>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Jurisprudence".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Jurisprudence) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Jurisprudence></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Jurisprudence> getJurisprudenceList() {
        return getJurisprudences();
    }

    /**
     * Add <code>java.util.List<Jurisprudence></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Jurisprudence addJurisprudence(Jurisprudence jurisprudenceElem) {
        this.addOverlayWidget(jurisprudenceElem);
        return jurisprudenceElem;
    }

    /**
     * Return <code>java.util.List<HasAttachment></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<HasAttachment> getHasAttachments() {
        java.util.List<HasAttachment> result = new ArrayList<HasAttachment>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("HasAttachment".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((HasAttachment) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<HasAttachment></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<HasAttachment> getHasAttachmentList() {
        return getHasAttachments();
    }

    /**
     * Add <code>java.util.List<HasAttachment></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public HasAttachment addHasAttachment(HasAttachment hasAttachmentElem) {
        this.addOverlayWidget(hasAttachmentElem);
        return hasAttachmentElem;
    }

    /**
     * Return <code>java.util.List<AttachmentOf></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AttachmentOf> getAttachmentOfs() {
        java.util.List<AttachmentOf> result = new ArrayList<AttachmentOf>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AttachmentOf".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((AttachmentOf) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<AttachmentOf></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<AttachmentOf> getAttachmentOfList() {
        return getAttachmentOfs();
    }

    /**
     * Add <code>java.util.List<AttachmentOf></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public AttachmentOf addAttachmentOf(AttachmentOf attachmentOfElem) {
        this.addOverlayWidget(attachmentOfElem);
        return attachmentOfElem;
    }

    /**
     * Return <code>java.util.List<TLCPerson></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCPerson> getTLCPersons() {
        java.util.List<TLCPerson> result = new ArrayList<TLCPerson>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCPerson".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCPerson) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCPerson></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCPerson> getTLCPersonList() {
        return getTLCPersons();
    }

    /**
     * Add <code>java.util.List<TLCPerson></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCPerson addTLCPerson(TLCPerson TLCPersonElem) {
        this.addOverlayWidget(TLCPersonElem);
        return TLCPersonElem;
    }

    /**
     * Return <code>java.util.List<TLCOrganization></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCOrganization> getTLCOrganizations() {
        java.util.List<TLCOrganization> result = new ArrayList<TLCOrganization>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCOrganization".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCOrganization) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCOrganization></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCOrganization> getTLCOrganizationList() {
        return getTLCOrganizations();
    }

    /**
     * Add <code>java.util.List<TLCOrganization></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCOrganization addTLCOrganization(TLCOrganization TLCOrganizationElem) {
        this.addOverlayWidget(TLCOrganizationElem);
        return TLCOrganizationElem;
    }

    /**
     * Return <code>java.util.List<TLCConcept></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCConcept> getTLCConcepts() {
        java.util.List<TLCConcept> result = new ArrayList<TLCConcept>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCConcept".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCConcept) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCConcept></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCConcept> getTLCConceptList() {
        return getTLCConcepts();
    }

    /**
     * Add <code>java.util.List<TLCConcept></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCConcept addTLCConcept(TLCConcept TLCConceptElem) {
        this.addOverlayWidget(TLCConceptElem);
        return TLCConceptElem;
    }

    /**
     * Return <code>java.util.List<TLCObject></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCObject> getTLCObjects() {
        java.util.List<TLCObject> result = new ArrayList<TLCObject>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCObject".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCObject) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCObject></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCObject> getTLCObjectList() {
        return getTLCObjects();
    }

    /**
     * Add <code>java.util.List<TLCObject></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCObject addTLCObject(TLCObject TLCObjectElem) {
        this.addOverlayWidget(TLCObjectElem);
        return TLCObjectElem;
    }

    /**
     * Return <code>java.util.List<TLCEvent></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCEvent> getTLCEvents() {
        java.util.List<TLCEvent> result = new ArrayList<TLCEvent>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCEvent".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCEvent) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCEvent></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCEvent> getTLCEventList() {
        return getTLCEvents();
    }

    /**
     * Add <code>java.util.List<TLCEvent></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCEvent addTLCEvent(TLCEvent TLCEventElem) {
        this.addOverlayWidget(TLCEventElem);
        return TLCEventElem;
    }

    /**
     * Return <code>java.util.List<TLCLocation></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCLocation> getTLCLocations() {
        java.util.List<TLCLocation> result = new ArrayList<TLCLocation>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCLocation".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCLocation) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCLocation></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCLocation> getTLCLocationList() {
        return getTLCLocations();
    }

    /**
     * Add <code>java.util.List<TLCLocation></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCLocation addTLCLocation(TLCLocation TLCLocationElem) {
        this.addOverlayWidget(TLCLocationElem);
        return TLCLocationElem;
    }

    /**
     * Return <code>java.util.List<TLCProcess></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCProcess> getTLCProcesses() {
        java.util.List<TLCProcess> result = new ArrayList<TLCProcess>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCProcess".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCProcess) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCProcess></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCProcess> getTLCProcessList() {
        return getTLCProcesses();
    }

    /**
     * Add <code>java.util.List<TLCProcess></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCProcess addTLCProcess(TLCProcess TLCProcessElem) {
        this.addOverlayWidget(TLCProcessElem);
        return TLCProcessElem;
    }

    /**
     * Return <code>java.util.List<TLCRole></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCRole> getTLCRoles() {
        java.util.List<TLCRole> result = new ArrayList<TLCRole>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCRole".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCRole) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCRole></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCRole> getTLCRoleList() {
        return getTLCRoles();
    }

    /**
     * Add <code>java.util.List<TLCRole></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCRole addTLCRole(TLCRole TLCRoleElem) {
        this.addOverlayWidget(TLCRoleElem);
        return TLCRoleElem;
    }

    /**
     * Return <code>java.util.List<TLCTerm></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCTerm> getTLCTerms() {
        java.util.List<TLCTerm> result = new ArrayList<TLCTerm>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCTerm".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCTerm) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCTerm></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCTerm> getTLCTermList() {
        return getTLCTerms();
    }

    /**
     * Add <code>java.util.List<TLCTerm></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCTerm addTLCTerm(TLCTerm TLCTermElem) {
        this.addOverlayWidget(TLCTermElem);
        return TLCTermElem;
    }

    /**
     * Return <code>java.util.List<TLCReference></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCReference> getTLCReferences() {
        java.util.List<TLCReference> result = new ArrayList<TLCReference>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("TLCReference".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((TLCReference) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<TLCReference></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<TLCReference> getTLCReferenceList() {
        return getTLCReferences();
    }

    /**
     * Add <code>java.util.List<TLCReference></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public TLCReference addTLCReference(TLCReference TLCReferenceElem) {
        this.addOverlayWidget(TLCReferenceElem);
        return TLCReferenceElem;
    }

//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }

    @Override
    public StructureIndicator getStructureIndicator() {
        return STRUCTURE_INDICATOR;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public RefItemsComplexType html(String s) {
        super.html(s);
        return this;
    }
}

