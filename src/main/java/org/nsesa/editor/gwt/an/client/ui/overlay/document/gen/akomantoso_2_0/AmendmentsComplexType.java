package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TextualMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MeaningMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ScopeMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ForceMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EfficacyMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LegalSystemMod;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class AmendmentsComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public AmendmentsComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    public java.util.List<TextualMod> getTextualMods() {
        java.util.List<TextualMod> result = new ArrayList<TextualMod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TextualMod".equalsIgnoreCase(widget.getType())) {
                result.add((TextualMod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<MeaningMod> getMeaningMods() {
        java.util.List<MeaningMod> result = new ArrayList<MeaningMod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("MeaningMod".equalsIgnoreCase(widget.getType())) {
                result.add((MeaningMod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<ScopeMod> getScopeMods() {
        java.util.List<ScopeMod> result = new ArrayList<ScopeMod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ScopeMod".equalsIgnoreCase(widget.getType())) {
                result.add((ScopeMod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<ForceMod> getForceMods() {
        java.util.List<ForceMod> result = new ArrayList<ForceMod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ForceMod".equalsIgnoreCase(widget.getType())) {
                result.add((ForceMod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<EfficacyMod> getEfficacyMods() {
        java.util.List<EfficacyMod> result = new ArrayList<EfficacyMod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("EfficacyMod".equalsIgnoreCase(widget.getType())) {
                result.add((EfficacyMod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<LegalSystemMod> getLegalSystemMods() {
        java.util.List<LegalSystemMod> result = new ArrayList<LegalSystemMod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("LegalSystemMod".equalsIgnoreCase(widget.getType())) {
                result.add((LegalSystemMod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        String[] subtypes = new String[]{"efficacyMod","scopeMod","forceMod","textualMod","meaningMod","legalSystemMod"};
        return  subtypes;
    }

    @Override
    public void addAmendableWidget(final AmendableWidget widget) {
        boolean canAdd = false;
        for (String type : getAllowedChildTypes()) {
            if (type.equalsIgnoreCase(widget.getType())) {
                canAdd = true;
            }
        }
        if (!canAdd) {
            throw new RuntimeException("Not supported child type:" + widget);
        }
        super.addAmendableWidget(widget);
    }

}

