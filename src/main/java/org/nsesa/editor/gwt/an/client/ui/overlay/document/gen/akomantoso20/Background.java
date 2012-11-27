package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MaincontentComplexType;
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
public class Background extends MaincontentComplexType  {

// CONSTRUCTORS ------------------
    public Background() {
        super(DOM.createElement("background"));
    }

    public Background(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"paragraph","tblock","oralStatements","alinea","blockList","declarationOfVote","adjournment","ol","subchapter","componentRef","petitions","administrationOfOath","indent","subclause","questions","papers","table","sublist","proceduralMotions","nationalInterest","container","foreign","tome","subparagraph","toc","subsection","debateSection","div","block","resolutions","personalStatements","chapter","title","division","rollCall","ul","communication","noticesOfMotion","list","section","point","subpart","article","address","hcontainer","p","writtenStatements","subtitle","book","pointOfOrder","prayers","ministerialStatements","part","clause"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

