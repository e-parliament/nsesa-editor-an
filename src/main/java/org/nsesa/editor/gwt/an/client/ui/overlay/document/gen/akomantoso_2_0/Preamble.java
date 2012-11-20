package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Preamble extends PreambleoptComplexType  {

// CONSTRUCTORS ------------------
    public Preamble() {
        super(DOM.createElement("preamble"));
    }

    public Preamble(Element element) {
        super(element);
    }

// FIELDS ------------------
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"toc","ul","citations","tblock","block","table","recitals","container","blockList","p","ol","foreign","formula"};
    }

}

