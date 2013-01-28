package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.EfficacyModsSimpleType;
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

public class EfficacyMod extends ModificationTypeComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "efficacyMod");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget efficacyMod");
return span;
}

// CONSTRUCTORS ------------------
public EfficacyMod() {
super(create());
setType("efficacyMod");
}

public EfficacyMod(Element element) {
super(element);
}

// FIELDS ------------------
private EfficacyModsSimpleType typeAttr;

        public EfficacyModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
                typeAttr = EfficacyModsSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
        }
        //DSL Style get value
        public EfficacyModsSimpleType typeAttr() {
        return  getTypeAttr();
        }

        public void setTypeAttr(final EfficacyModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
        }
        //DSL Style set value
        public EfficacyMod typeAttr(final EfficacyModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"application","condition","destination","duration","efficacy","force","source"};
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

