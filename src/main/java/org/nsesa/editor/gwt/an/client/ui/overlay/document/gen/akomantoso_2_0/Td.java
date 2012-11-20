package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IntegerSimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Td extends BlocksoptComplexType  {

// CONSTRUCTORS ------------------
    public Td() {
        super(DOM.createElement("td"));
    }

    public Td(Element element) {
        super(element);
    }

// FIELDS ------------------
    private IntegerSimpleType rowspanAttr;
    private IntegerSimpleType colspanAttr;
    public IntegerSimpleType getRowspanAttr() {
        return rowspanAttr;
    }
    public void setRowspanAttr(final IntegerSimpleType rowspanAttr) {
        this.rowspanAttr = rowspanAttr;
    }
    public IntegerSimpleType getColspanAttr() {
        return colspanAttr;
    }
    public void setColspanAttr(final IntegerSimpleType colspanAttr) {
        this.colspanAttr = colspanAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"ul","toc","tblock","blockList","p","block","table","ol","foreign"};
    }

}

