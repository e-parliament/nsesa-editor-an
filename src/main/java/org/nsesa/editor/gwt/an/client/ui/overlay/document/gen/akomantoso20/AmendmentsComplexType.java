package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TextualMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MeaningMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ScopeMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ForceMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.EfficacyMod;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.LegalSystemMod;
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

public class AmendmentsComplexType extends AmendableWidgetImpl  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new TextualMod(), new Occurrence(1,1));
            put(new MeaningMod(), new Occurrence(1,1));
            put(new ScopeMod(), new Occurrence(1,1));
            put(new ForceMod(), new Occurrence(1,1));
            put(new EfficacyMod(), new Occurrence(1,1));
            put(new LegalSystemMod(), new Occurrence(1,1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "AmendmentsComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget AmendmentsComplexType");
        return span;
    }

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

     //DSL Style get value
    public java.util.List<TextualMod> getTextualModList() {
        return  getTextualMods();
    }
     //DSL Style set value
    public TextualMod addTextualMod(TextualMod textualModElem) {
        this.addAmendableWidget(textualModElem);
        return textualModElem;
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

     //DSL Style get value
    public java.util.List<MeaningMod> getMeaningModList() {
        return  getMeaningMods();
    }
     //DSL Style set value
    public MeaningMod addMeaningMod(MeaningMod meaningModElem) {
        this.addAmendableWidget(meaningModElem);
        return meaningModElem;
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

     //DSL Style get value
    public java.util.List<ScopeMod> getScopeModList() {
        return  getScopeMods();
    }
     //DSL Style set value
    public ScopeMod addScopeMod(ScopeMod scopeModElem) {
        this.addAmendableWidget(scopeModElem);
        return scopeModElem;
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

     //DSL Style get value
    public java.util.List<ForceMod> getForceModList() {
        return  getForceMods();
    }
     //DSL Style set value
    public ForceMod addForceMod(ForceMod forceModElem) {
        this.addAmendableWidget(forceModElem);
        return forceModElem;
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

     //DSL Style get value
    public java.util.List<EfficacyMod> getEfficacyModList() {
        return  getEfficacyMods();
    }
     //DSL Style set value
    public EfficacyMod addEfficacyMod(EfficacyMod efficacyModElem) {
        this.addAmendableWidget(efficacyModElem);
        return efficacyModElem;
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

     //DSL Style get value
    public java.util.List<LegalSystemMod> getLegalSystemModList() {
        return  getLegalSystemMods();
    }
     //DSL Style set value
    public LegalSystemMod addLegalSystemMod(LegalSystemMod legalSystemModElem) {
        this.addAmendableWidget(legalSystemModElem);
        return legalSystemModElem;
    }

    //Override all attributes methods to be conformant with DSL approach

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
        return attrs;
    }
}

