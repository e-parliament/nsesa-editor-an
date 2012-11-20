package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AlthierarchyComplexType;
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
public class Address extends AlthierarchyComplexType  {

// CONSTRUCTORS ------------------
    public Address() {
        super(DOM.createElement("address"));
    }

    public Address(Element element) {
        super(element);
    }

// FIELDS ------------------
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"summary","toc","other","tblock","subheading","narrative","debateSection","div","block","resolutions","personalStatements","oralStatements","rollCall","blockList","declarationOfVote","adjournment","ol","question","componentRef","petitions","administrationOfOath","ul","communication","noticesOfMotion","answer","questions","papers","table","proceduralMotions","num","speech","address","nationalInterest","container","p","writtenStatements","pointOfOrder","scene","prayers","ministerialStatements","foreign","heading"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());

        return attrs;
    }

}

