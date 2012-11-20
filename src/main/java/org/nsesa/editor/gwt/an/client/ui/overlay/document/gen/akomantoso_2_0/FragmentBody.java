package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FragmentBody extends FragmentBodyTypeComplexType  {

// CONSTRUCTORS ------------------
    public FragmentBody() {
        super(DOM.createElement("fragmentBody"));
    }

    public FragmentBody(Element element) {
        super(element);
    }

// FIELDS ------------------
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tome","subparagraph","paragraph","subsection","debateSection","div","resolutions","personalStatements","oralStatements","title","chapter","division","rollCall","alinea","declarationOfVote","adjournment","petitions","subchapter","administrationOfOath","indent","communication","noticesOfMotion","subclause","questions","papers","list","sublist","section","proceduralMotions","point","article","subpart","address","nationalInterest","container","writtenStatements","hcontainer","book","subtitle","pointOfOrder","prayers","ministerialStatements","part","clause"};
    }

}

