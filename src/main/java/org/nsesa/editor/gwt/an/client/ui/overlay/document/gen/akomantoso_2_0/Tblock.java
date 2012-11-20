package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Tblock extends ItemTypeComplexType  {

// CONSTRUCTORS ------------------
    public Tblock() {
        super(DOM.createElement("tblock"));
    }

    public Tblock(Element element) {
        super(element);
    }

// FIELDS ------------------
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"num","ul","toc","tblock","subheading","blockList","p","block","table","ol","foreign","heading"};
    }

}

