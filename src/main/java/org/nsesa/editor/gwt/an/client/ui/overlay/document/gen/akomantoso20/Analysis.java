package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ActiveModifications;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PassiveModifications;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Judicial;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Parliamentary;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.OtherAnalysis;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Analysis extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Analysis() {
        super(DOM.createElement("analysis"));
    }

    public Analysis(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;
    public ActiveModifications getActiveModifications() {
        ActiveModifications result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ActiveModifications".equalsIgnoreCase(widget.getType())) {
                result = (ActiveModifications)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public ActiveModifications setActiveModifications(ActiveModifications activeModificationsElem) {
        ActiveModifications result = getActiveModifications();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(activeModificationsElem);

        return activeModificationsElem;
    }
    public PassiveModifications getPassiveModifications() {
        PassiveModifications result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PassiveModifications".equalsIgnoreCase(widget.getType())) {
                result = (PassiveModifications)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public PassiveModifications setPassiveModifications(PassiveModifications passiveModificationsElem) {
        PassiveModifications result = getPassiveModifications();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(passiveModificationsElem);

        return passiveModificationsElem;
    }
    public Judicial getJudicial() {
        Judicial result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Judicial".equalsIgnoreCase(widget.getType())) {
                result = (Judicial)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Judicial setJudicial(Judicial judicialElem) {
        Judicial result = getJudicial();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(judicialElem);

        return judicialElem;
    }
    public Parliamentary getParliamentary() {
        Parliamentary result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Parliamentary".equalsIgnoreCase(widget.getType())) {
                result = (Parliamentary)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Parliamentary setParliamentary(Parliamentary parliamentaryElem) {
        Parliamentary result = getParliamentary();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(parliamentaryElem);

        return parliamentaryElem;
    }
    public java.util.List<OtherAnalysis> getOtherAnalysises() {
        java.util.List<OtherAnalysis> result = new ArrayList<OtherAnalysis>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OtherAnalysis".equalsIgnoreCase(widget.getType())) {
                result.add((OtherAnalysis)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<OtherAnalysis> getOtherAnalysisList() {
        return  getOtherAnalysises();
    }
    //DSL Style set value
    public OtherAnalysis addOtherAnalysis(OtherAnalysis otherAnalysisElem) {
        this.addAmendableWidget(otherAnalysisElem);
        return otherAnalysisElem;
    }

    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(amendableElement.getAttribute("source"));
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
    public Analysis sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"judicial","parliamentary","activeModifications","passiveModifications","otherAnalysis"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("sourceAttr", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }

}

