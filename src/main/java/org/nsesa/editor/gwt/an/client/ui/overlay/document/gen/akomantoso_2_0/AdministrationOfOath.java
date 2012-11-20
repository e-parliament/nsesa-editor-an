package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class AdministrationOfOath extends AlthierarchyComplexType  {

// CONSTRUCTORS ------------------
    public AdministrationOfOath() {
        super(DOM.createElement("administrationOfOath"));
    }

    public AdministrationOfOath(Element element) {
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

}

