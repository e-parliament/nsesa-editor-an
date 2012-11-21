package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.BlocksoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IntegerSimpleType;
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

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("rowspanAttr", getRowspanAttr().getValue());
        attrs.put("colspanAttr", getColspanAttr().getValue());

        return attrs;
    }

}

