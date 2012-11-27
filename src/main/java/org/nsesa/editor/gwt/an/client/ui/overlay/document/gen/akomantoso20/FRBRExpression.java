package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRlanguage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRtranslation;
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
public class FRBRExpression extends CorePropertiesComplexType  {

// CONSTRUCTORS ------------------
    public FRBRExpression() {
        super(DOM.createElement("FRBRExpression"));
    }

    public FRBRExpression(Element element) {
        super(element);
    }

// FIELDS ------------------
    public java.util.List<FRBRlanguage> getFRBRlanguages() {
        java.util.List<FRBRlanguage> result = new ArrayList<FRBRlanguage>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRlanguage".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRlanguage)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<FRBRlanguage> getFRBRlanguageList() {
        return  getFRBRlanguages();
    }
    //DSL Style set value
    public FRBRlanguage addFRBRlanguage(FRBRlanguage FRBRlanguageElem) {
        this.addAmendableWidget(FRBRlanguageElem);
        return FRBRlanguageElem;
    }

    public java.util.List<FRBRtranslation> getFRBRtranslations() {
        java.util.List<FRBRtranslation> result = new ArrayList<FRBRtranslation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRtranslation".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRtranslation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<FRBRtranslation> getFRBRtranslationList() {
        return  getFRBRtranslations();
    }
    //DSL Style set value
    public FRBRtranslation addFRBRtranslation(FRBRtranslation FRBRtranslationElem) {
        this.addAmendableWidget(FRBRtranslationElem);
        return FRBRtranslationElem;
    }

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"FRBRthis","FRBRalias","FRBRlanguage","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation","FRBRtranslation"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

