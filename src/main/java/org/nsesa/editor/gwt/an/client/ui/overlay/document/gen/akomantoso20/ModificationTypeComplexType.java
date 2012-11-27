package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Source;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Destination;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Force;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Efficacy;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Application;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Duration;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Condition;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ModificationTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public ModificationTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StatusTypeSimpleType statusAttr;
    private BooleanSimpleType exclusionAttr;
    private BooleanSimpleType incompleteAttr;
    private String wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType periodAttr;
    public java.util.List<Source> getSources() {
        java.util.List<Source> result = new ArrayList<Source>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Source".equalsIgnoreCase(widget.getType())) {
                result.add((Source)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Source> getSourceList() {
        return  getSources();
    }
    //DSL Style set value
    public Source addSource(Source sourceElem) {
        this.addAmendableWidget(sourceElem);
        return sourceElem;
    }

    public java.util.List<Destination> getDestinations() {
        java.util.List<Destination> result = new ArrayList<Destination>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Destination".equalsIgnoreCase(widget.getType())) {
                result.add((Destination)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Destination> getDestinationList() {
        return  getDestinations();
    }
    //DSL Style set value
    public Destination addDestination(Destination destinationElem) {
        this.addAmendableWidget(destinationElem);
        return destinationElem;
    }

    public Force getForce() {
        Force result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Force".equalsIgnoreCase(widget.getType())) {
                result = (Force)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Force setForce(Force forceElem) {
        Force result = getForce();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(forceElem);

        return forceElem;
    }
    public Efficacy getEfficacy() {
        Efficacy result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Efficacy".equalsIgnoreCase(widget.getType())) {
                result = (Efficacy)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Efficacy setEfficacy(Efficacy efficacyElem) {
        Efficacy result = getEfficacy();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(efficacyElem);

        return efficacyElem;
    }
    public Application getApplication() {
        Application result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Application".equalsIgnoreCase(widget.getType())) {
                result = (Application)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Application setApplication(Application applicationElem) {
        Application result = getApplication();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(applicationElem);

        return applicationElem;
    }
    public Duration getDuration() {
        Duration result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Duration".equalsIgnoreCase(widget.getType())) {
                result = (Duration)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Duration setDuration(Duration durationElem) {
        Duration result = getDuration();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(durationElem);

        return durationElem;
    }
    public Condition getCondition() {
        Condition result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Condition".equalsIgnoreCase(widget.getType())) {
                result = (Condition)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Condition setCondition(Condition conditionElem) {
        Condition result = getCondition();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(conditionElem);

        return conditionElem;
    }
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(amendableElement.getAttribute("status"));
        }

        return statusAttr;
    }
    //DSL Style get value
    public StatusTypeSimpleType statusAttr() {
         return  getStatusAttr();
    }

    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    //DSL Style set value
    public ModificationTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }
    public BooleanSimpleType getExclusionAttr() {
        if (exclusionAttr == null) {
            exclusionAttr = new BooleanSimpleType();
            exclusionAttr.setValue(amendableElement.getAttribute("exclusion"));
        }

        return exclusionAttr;
    }
    //DSL Style get value
    public BooleanSimpleType exclusionAttr() {
         return  getExclusionAttr();
    }

    public void setExclusionAttr(final BooleanSimpleType exclusionAttr) {
        this.exclusionAttr = exclusionAttr;
    }
    //DSL Style set value
    public ModificationTypeComplexType exclusionAttr(final BooleanSimpleType exclusionAttr) {
        setExclusionAttr(exclusionAttr);
        return this;
    }
    public BooleanSimpleType getIncompleteAttr() {
        if (incompleteAttr == null) {
            incompleteAttr = new BooleanSimpleType();
            incompleteAttr.setValue(amendableElement.getAttribute("incomplete"));
        }

        return incompleteAttr;
    }
    //DSL Style get value
    public BooleanSimpleType incompleteAttr() {
         return  getIncompleteAttr();
    }

    public void setIncompleteAttr(final BooleanSimpleType incompleteAttr) {
        this.incompleteAttr = incompleteAttr;
    }
    //DSL Style set value
    public ModificationTypeComplexType incompleteAttr(final BooleanSimpleType incompleteAttr) {
        setIncompleteAttr(incompleteAttr);
        return this;
    }
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }
    //DSL Style get value
    public String wildcardContentAttr() {
         return  getWildcardContentAttr();
    }

    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    //DSL Style set value
    public ModificationTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
        }

        return idAttr;
    }
    //DSL Style get value
    public IDSimpleType idAttr() {
         return  getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    //DSL Style set value
    public ModificationTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }
    //DSL Style get value
    public NMTOKENSimpleType evolvingIdAttr() {
         return  getEvolvingIdAttr();
    }

    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    //DSL Style set value
    public ModificationTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
         return  getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    //DSL Style set value
    public ModificationTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(amendableElement.getAttribute("period"));
        }

        return periodAttr;
    }
    //DSL Style get value
    public AnyURISimpleType periodAttr() {
         return  getPeriodAttr();
    }

    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    //DSL Style set value
    public ModificationTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","source","condition","efficacy","force","destination"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("statusAttr", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("exclusionAttr", getExclusionAttr() != null ? getExclusionAttr().getValue() : null);
        attrs.put("incompleteAttr", getIncompleteAttr() != null ? getIncompleteAttr().getValue() : null);
        attrs.put("wildcardContentAttr", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("idAttr", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingIdAttr", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("refersToAttr", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("periodAttr", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }

}

