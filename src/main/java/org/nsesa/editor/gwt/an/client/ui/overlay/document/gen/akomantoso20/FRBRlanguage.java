package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.LanguageSimpleType;
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

public class FRBRlanguage extends MetaoptComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "FRBRlanguage");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget FRBRlanguage");
return span;
}

// CONSTRUCTORS ------------------
public FRBRlanguage() {
super(create());
setType("FRBRlanguage");
}

public FRBRlanguage(Element element) {
super(element);
}

// FIELDS ------------------
private LanguageSimpleType languageAttr;

        public LanguageSimpleType getLanguageAttr() {
        if (languageAttr == null) {
                languageAttr = new LanguageSimpleType();
                languageAttr.setValue(getElement().getAttribute("language"));
        }

        return languageAttr;
        }
        //DSL Style get value
        public LanguageSimpleType languageAttr() {
        return  getLanguageAttr();
        }

        public void setLanguageAttr(final LanguageSimpleType languageAttr) {
        this.languageAttr = languageAttr;
        }
        //DSL Style set value
        public FRBRlanguage languageAttr(final LanguageSimpleType languageAttr) {
        setLanguageAttr(languageAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{};
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
        attrs.put("language", getLanguageAttr() != null ? getLanguageAttr().getValue() : null);
return attrs;
}
}

