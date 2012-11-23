package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

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
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"efficacyMod","scopeMod","forceMod","textualMod","meaningMod","legalSystemMod"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

