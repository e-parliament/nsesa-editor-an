package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Source;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Destination;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Force;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Efficacy;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Application;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Duration;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Condition;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
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
    private BooleanSimpleType exclusionAttr;
    private BooleanSimpleType incompleteAttr;
    private AnyURISimpleType refersToAttr;
    private String wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StatusTypeSimpleType statusAttr;
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
    public java.util.List<Destination> getDestinations() {
        java.util.List<Destination> result = new ArrayList<Destination>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Destination".equalsIgnoreCase(widget.getType())) {
                result.add((Destination)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public BooleanSimpleType getExclusionAttr() {
        if (exclusionAttr == null) {
            exclusionAttr = new BooleanSimpleType();
            exclusionAttr.setValue(amendableElement.getAttribute("exclusion"));
        }

        return exclusionAttr;
    }
    public void setExclusionAttr(final BooleanSimpleType exclusionAttr) {
        this.exclusionAttr = exclusionAttr;
    }
    public BooleanSimpleType getIncompleteAttr() {
        if (incompleteAttr == null) {
            incompleteAttr = new BooleanSimpleType();
            incompleteAttr.setValue(amendableElement.getAttribute("incomplete"));
        }

        return incompleteAttr;
    }
    public void setIncompleteAttr(final BooleanSimpleType incompleteAttr) {
        this.incompleteAttr = incompleteAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
        }

        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(amendableElement.getAttribute("status"));
        }

        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(amendableElement.getAttribute("period"));
        }

        return periodAttr;
    }
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","source","condition","efficacy","force","destination"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("exclusionAttr", getExclusionAttr().getValue());
        attrs.put("incompleteAttr", getIncompleteAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().toString());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());
        attrs.put("statusAttr", getStatusAttr().value());
        attrs.put("periodAttr", getPeriodAttr().getValue());

        return attrs;
    }

}

