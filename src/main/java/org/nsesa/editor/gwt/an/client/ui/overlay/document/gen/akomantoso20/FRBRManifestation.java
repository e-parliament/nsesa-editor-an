package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRformat;
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
public class FRBRManifestation extends CorePropertiesComplexType  {

// CONSTRUCTORS ------------------
    public FRBRManifestation() {
        super(DOM.createElement("FRBRManifestation"));
    }

    public FRBRManifestation(Element element) {
        super(element);
    }

// FIELDS ------------------
    public FRBRformat getFRBRformat() {
        FRBRformat result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRformat".equalsIgnoreCase(widget.getType())) {
                result = (FRBRformat)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRformat setFRBRformat(FRBRformat FRBRformatElem) {
        FRBRformat result = getFRBRformat();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRformatElem);

        return FRBRformatElem;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"FRBRthis","FRBRalias","FRBRformat","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

