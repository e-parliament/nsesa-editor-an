package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IntegerSimpleType;

import java.util.LinkedHashMap;

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
        if (rowspanAttr == null) {
            rowspanAttr = new IntegerSimpleType();
            rowspanAttr.setValue(amendableElement.getAttribute("rowspan"));
        }

        return rowspanAttr;
    }
    public void setRowspanAttr(final IntegerSimpleType rowspanAttr) {
        this.rowspanAttr = rowspanAttr;
    }
    public IntegerSimpleType getColspanAttr() {
        if (colspanAttr == null) {
            colspanAttr = new IntegerSimpleType();
            colspanAttr.setValue(amendableElement.getAttribute("colspan"));
        }

        return colspanAttr;
    }
    public void setColspanAttr(final IntegerSimpleType colspanAttr) {
        this.colspanAttr = colspanAttr;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"ul","toc","tblock","blockList","p","block","table","ol","foreign"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("rowspanAttr", getRowspanAttr() != null ? getRowspanAttr().getValue() : null);
        attrs.put("colspanAttr", getColspanAttr() != null ? getColspanAttr().getValue() : null);
        return attrs;
    }

}

