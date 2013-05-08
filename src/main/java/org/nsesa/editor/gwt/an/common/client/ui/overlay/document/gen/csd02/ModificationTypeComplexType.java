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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * The complex type modificationType lists all the properties associated to modification elements.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class ModificationTypeComplexType extends OverlayWidgetImpl {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, -1, new Source())
                    , new StructureIndicator.DefaultElement(1, -1, new Destination())
                    , new StructureIndicator.DefaultElement(0, 1, new Force())
                    , new StructureIndicator.DefaultElement(0, 1, new Efficacy())
                    , new StructureIndicator.DefaultElement(0, 1, new Application())
                    , new StructureIndicator.DefaultElement(0, 1, new Duration())
                    , new StructureIndicator.DefaultElement(0, 1, new Condition())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "modificationTypeComplexType");
        span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
        span.setClassName("widget modificationTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>ModificationTypeComplexType</code> object with the given DOM element
     */
    public ModificationTypeComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private BooleanSimpleType exclusionAttr;
    private BooleanSimpleType incompleteAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType refersToAttr;
    private StatusTypeSimpleType statusAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType periodAttr;

    /**
     * Return <code>exclusionAttr</code> property
     *
     * @return exclusionAttr
     */
    public BooleanSimpleType getExclusionAttr() {
        if (exclusionAttr == null) {
            exclusionAttr = new BooleanSimpleType();
            exclusionAttr.setValue(getElement().getAttribute("exclusion"));
        }

        return exclusionAttr;
    }

    /**
     * Return <code>exclusionAttr</code> property in DSL way
     *
     * @return exclusionAttr
     */
    public BooleanSimpleType exclusionAttr() {
        return getExclusionAttr();
    }

    /**
     * Set <code>exclusionAttr</code> property
     *
     * @param exclusionAttr the new value
     */
    public void setExclusionAttr(final BooleanSimpleType exclusionAttr) {
        this.exclusionAttr = exclusionAttr;
        getElement().setAttribute("exclusion", exclusionAttr.getValue());
    }

    /**
     * Set <code>exclusionAttr</code> property in DSL way
     *
     * @param exclusionAttr the new value
     * @return <code>ModificationTypeComplexType</code> instance
     */
    public ModificationTypeComplexType exclusionAttr(final BooleanSimpleType exclusionAttr) {
        setExclusionAttr(exclusionAttr);
        return this;
    }

    /**
     * Return <code>incompleteAttr</code> property
     *
     * @return incompleteAttr
     */
    public BooleanSimpleType getIncompleteAttr() {
        if (incompleteAttr == null) {
            incompleteAttr = new BooleanSimpleType();
            incompleteAttr.setValue(getElement().getAttribute("incomplete"));
        }

        return incompleteAttr;
    }

    /**
     * Return <code>incompleteAttr</code> property in DSL way
     *
     * @return incompleteAttr
     */
    public BooleanSimpleType incompleteAttr() {
        return getIncompleteAttr();
    }

    /**
     * Set <code>incompleteAttr</code> property
     *
     * @param incompleteAttr the new value
     */
    public void setIncompleteAttr(final BooleanSimpleType incompleteAttr) {
        this.incompleteAttr = incompleteAttr;
        getElement().setAttribute("incomplete", incompleteAttr.getValue());
    }

    /**
     * Set <code>incompleteAttr</code> property in DSL way
     *
     * @param incompleteAttr the new value
     * @return <code>ModificationTypeComplexType</code> instance
     */
    public ModificationTypeComplexType incompleteAttr(final BooleanSimpleType incompleteAttr) {
        setIncompleteAttr(incompleteAttr);
        return this;
    }

    /**
     * Return <code>idAttr</code> property
     *
     * @return idAttr
     */
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
    }

    /**
     * Return <code>idAttr</code> property in DSL way
     *
     * @return idAttr
     */
    public IDSimpleType idAttr() {
        return getIdAttr();
    }

    /**
     * Set <code>idAttr</code> property
     *
     * @param idAttr the new value
     */
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        getElement().setAttribute("id", idAttr.getValue());
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr the new value
     * @return <code>ModificationTypeComplexType</code> instance
     */
    public ModificationTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Return <code>evolvingIdAttr</code> property
     *
     * @return evolvingIdAttr
     */
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }

    /**
     * Return <code>evolvingIdAttr</code> property in DSL way
     *
     * @return evolvingIdAttr
     */
    public NMTOKENSimpleType evolvingIdAttr() {
        return getEvolvingIdAttr();
    }

    /**
     * Set <code>evolvingIdAttr</code> property
     *
     * @param evolvingIdAttr the new value
     */
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        getElement().setAttribute("evolvingId", evolvingIdAttr.getValue());
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr the new value
     * @return <code>ModificationTypeComplexType</code> instance
     */
    public ModificationTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Return <code>refersToAttr</code> property
     *
     * @return refersToAttr
     */
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    /**
     * Return <code>refersToAttr</code> property in DSL way
     *
     * @return refersToAttr
     */
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    /**
     * Set <code>refersToAttr</code> property
     *
     * @param refersToAttr the new value
     */
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo", refersToAttr.getValue());
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr the new value
     * @return <code>ModificationTypeComplexType</code> instance
     */
    public ModificationTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Return <code>statusAttr</code> property
     *
     * @return statusAttr
     */
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(getElement().getAttribute("status"));
        }

        return statusAttr;
    }

    /**
     * Return <code>statusAttr</code> property in DSL way
     *
     * @return statusAttr
     */
    public StatusTypeSimpleType statusAttr() {
        return getStatusAttr();
    }

    /**
     * Set <code>statusAttr</code> property
     *
     * @param statusAttr the new value
     */
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
        getElement().setAttribute("status", statusAttr.value());
    }

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr the new value
     * @return <code>ModificationTypeComplexType</code> instance
     */
    public ModificationTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Return <code>wildcardContentAttr</code> property
     *
     * @return wildcardContentAttr
     */
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }

    /**
     * Return <code>wildcardContentAttr</code> property in DSL way
     *
     * @return wildcardContentAttr
     */
    public String wildcardContentAttr() {
        return getWildcardContentAttr();
    }

    /**
     * Set <code>wildcardContentAttr</code> property
     *
     * @param wildcardContentAttr the new value
     */
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        getElement().setAttribute("wildcardContent", wildcardContentAttr);
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr the new value
     * @return <code>ModificationTypeComplexType</code> instance
     */
    public ModificationTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Return <code>java.util.List<Source></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Source> getSources() {
        java.util.List<Source> result = new ArrayList<Source>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Source".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Source) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Source></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Source> getSourceList() {
        return getSources();
    }

    /**
     * Add <code>java.util.List<Source></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Source addSource(Source sourceElem) {
        this.addOverlayWidget(sourceElem);
        return sourceElem;
    }

    /**
     * Return <code>java.util.List<Destination></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Destination> getDestinations() {
        java.util.List<Destination> result = new ArrayList<Destination>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Destination".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result.add((Destination) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Destination></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Destination> getDestinationList() {
        return getDestinations();
    }

    /**
     * Add <code>java.util.List<Destination></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Destination addDestination(Destination destinationElem) {
        this.addOverlayWidget(destinationElem);
        return destinationElem;
    }

    /**
     * Add <code>Force</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Force getForce() {
        Force result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Force".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Force) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>forceElem</code> property in DSL way
     *
     * @param forceElem new value
     * @return <code>Force</code> instance
     */
    public Force setForce(Force forceElem) {
        Force result = getForce();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(forceElem);

        return forceElem;
    }

    /**
     * Add <code>Efficacy</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Efficacy getEfficacy() {
        Efficacy result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Efficacy".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Efficacy) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>efficacyElem</code> property in DSL way
     *
     * @param efficacyElem new value
     * @return <code>Efficacy</code> instance
     */
    public Efficacy setEfficacy(Efficacy efficacyElem) {
        Efficacy result = getEfficacy();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(efficacyElem);

        return efficacyElem;
    }

    /**
     * Add <code>Application</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Application getApplication() {
        Application result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Application".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Application) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>applicationElem</code> property in DSL way
     *
     * @param applicationElem new value
     * @return <code>Application</code> instance
     */
    public Application setApplication(Application applicationElem) {
        Application result = getApplication();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(applicationElem);

        return applicationElem;
    }

    /**
     * Add <code>Duration</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Duration getDuration() {
        Duration result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Duration".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Duration) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>durationElem</code> property in DSL way
     *
     * @param durationElem new value
     * @return <code>Duration</code> instance
     */
    public Duration setDuration(Duration durationElem) {
        Duration result = getDuration();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(durationElem);

        return durationElem;
    }

    /**
     * Add <code>Condition</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Condition getCondition() {
        Condition result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Condition".equalsIgnoreCase(widget.getType()) && "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Condition) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>conditionElem</code> property in DSL way
     *
     * @param conditionElem new value
     * @return <code>Condition</code> instance
     */
    public Condition setCondition(Condition conditionElem) {
        Condition result = getCondition();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(conditionElem);

        return conditionElem;
    }

    /**
     * Return <code>periodAttr</code> property
     *
     * @return periodAttr
     */
    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(getElement().getAttribute("period"));
        }

        return periodAttr;
    }

    /**
     * Return <code>periodAttr</code> property in DSL way
     *
     * @return periodAttr
     */
    public AnyURISimpleType periodAttr() {
        return getPeriodAttr();
    }

    /**
     * Set <code>periodAttr</code> property
     *
     * @param periodAttr the new value
     */
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
        getElement().setAttribute("period", periodAttr.getValue());
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr the new value
     * @return <code>ModificationTypeComplexType</code> instance
     */
    public ModificationTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
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
        attrs.put("exclusion", getExclusionAttr() != null ? getExclusionAttr().getValue() : null);
        attrs.put("incomplete", getIncompleteAttr() != null ? getIncompleteAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
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
    public ModificationTypeComplexType html(String s) {
        super.html(s);
        return this;
    }
}

