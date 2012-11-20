package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Speech extends SpeechTypeComplexType  {

// CONSTRUCTORS ------------------
    public Speech() {
        super(DOM.createElement("speech"));
    }

    public Speech(Element element) {
        super(element);
    }

// FIELDS ------------------
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"toc","ul","tblock","subheading","block","from","table","num","blockList","p","ol","foreign","heading"};
    }

}

