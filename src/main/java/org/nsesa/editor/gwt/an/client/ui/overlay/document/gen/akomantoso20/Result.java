package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ResultTypeSimpleType;
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

public class Result extends AnyOtherTypeComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "result");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget result");
return span;
}

// CONSTRUCTORS ------------------
public Result() {
super(create());
setType("result");
}

public Result(Element element) {
super(element);
}

// FIELDS ------------------
private ResultTypeSimpleType typeAttr;

        public ResultTypeSimpleType getTypeAttr() {
        if (typeAttr == null) {
                typeAttr = ResultTypeSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
        }
        //DSL Style get value
        public ResultTypeSimpleType typeAttr() {
        return  getTypeAttr();
        }

        public void setTypeAttr(final ResultTypeSimpleType typeAttr) {
        this.typeAttr = typeAttr;
        }
        //DSL Style set value
        public Result typeAttr(final ResultTypeSimpleType typeAttr) {
        setTypeAttr(typeAttr);
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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
return attrs;
}
}

