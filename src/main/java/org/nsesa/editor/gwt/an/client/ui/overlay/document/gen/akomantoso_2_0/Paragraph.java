package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Paragraph extends HierarchyComplexType  {

// CONSTRUCTORS ------------------
    public Paragraph() {
        super(DOM.createElement("paragraph"));
    }

    public Paragraph(Element element) {
        super(element);
    }

// FIELDS ------------------
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tome","subparagraph","paragraph","subheading","subsection","title","chapter","division","alinea","componentRef","subchapter","wrap","indent","subclause","list","sublist","section","intro","content","point","num","article","subpart","hcontainer","book","subtitle","part","heading","clause"};
    }

}

