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

public class Th extends BlocksoptComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "th");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget th");
return span;
}

// CONSTRUCTORS ------------------
public Th() {
super(create());
setType("th");
}

public Th(Element element) {
super(element);
}

// FIELDS ------------------
private IntegerSimpleType rowspanAttr;
private IntegerSimpleType colspanAttr;

        public IntegerSimpleType getRowspanAttr() {
        if (rowspanAttr == null) {
                rowspanAttr = new IntegerSimpleType();
                rowspanAttr.setValue(getElement().getAttribute("rowspan"));
        }

        return rowspanAttr;
        }
        //DSL Style get value
        public IntegerSimpleType rowspanAttr() {
        return  getRowspanAttr();
        }

        public void setRowspanAttr(final IntegerSimpleType rowspanAttr) {
        this.rowspanAttr = rowspanAttr;
        }
        //DSL Style set value
        public Th rowspanAttr(final IntegerSimpleType rowspanAttr) {
        setRowspanAttr(rowspanAttr);
        return this;
        }
        public IntegerSimpleType getColspanAttr() {
        if (colspanAttr == null) {
                colspanAttr = new IntegerSimpleType();
                colspanAttr.setValue(getElement().getAttribute("colspan"));
        }

        return colspanAttr;
        }
        //DSL Style get value
        public IntegerSimpleType colspanAttr() {
        return  getColspanAttr();
        }

        public void setColspanAttr(final IntegerSimpleType colspanAttr) {
        this.colspanAttr = colspanAttr;
        }
        //DSL Style set value
        public Th colspanAttr(final IntegerSimpleType colspanAttr) {
        setColspanAttr(colspanAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"block","blockList","foreign","ol","p","table","tblock","toc","ul"};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("rowspan", getRowspanAttr() != null ? getRowspanAttr().getValue() : null);
        attrs.put("colspan", getColspanAttr() != null ? getColspanAttr().getValue() : null);
return attrs;
}
}

