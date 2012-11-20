package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class QuotedStructure extends PopupStructureComplexType  {

// CONSTRUCTORS ------------------
    public QuotedStructure() {
        super(DOM.createElement("quotedStructure"));
    }

    public QuotedStructure(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType forAttr;
    public AnyURISimpleType getForAttr() {
        return forAttr;
    }
    public void setForAttr(final AnyURISimpleType forAttr) {
        this.forAttr = forAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"summary","paragraph","tblock","narrative","oralStatements","alinea","blockList","declarationOfVote","adjournment","ol","petitions","componentRef","subchapter","wrap","citation","administrationOfOath","indent","subclause","answer","questions","papers","table","sublist","proceduralMotions","content","speech","nationalInterest","container","scene","foreign","heading","tome","other","subparagraph","toc","subheading","subsection","debateSection","div","resolutions","block","personalStatements","recital","chapter","title","rollCall","division","question","ul","communication","noticesOfMotion","list","section","intro","point","num","article","subpart","address","writtenStatements","hcontainer","p","book","subtitle","pointOfOrder","prayers","ministerialStatements","part","clause"};
    }

}

