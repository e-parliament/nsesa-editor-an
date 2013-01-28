package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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

public class OtherAnalysis extends AnyOtherTypeComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "otherAnalysis");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget otherAnalysis");
return span;
}

// CONSTRUCTORS ------------------
public OtherAnalysis() {
super(create());
setType("otherAnalysis");
}

public OtherAnalysis(Element element) {
super(element);
}

// FIELDS ------------------
private AnyURISimpleType sourceAttr;

        public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
                sourceAttr = new AnyURISimpleType();
                sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
        }
        //DSL Style get value
        public AnyURISimpleType sourceAttr() {
        return  getSourceAttr();
        }

        public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        }
        //DSL Style set value
        public OtherAnalysis sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"*"};
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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
return attrs;
}
}

