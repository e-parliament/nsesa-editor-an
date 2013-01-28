package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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

public class Session extends InlineComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "session");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget session");
return span;
}

// CONSTRUCTORS ------------------
public Session() {
super(create());
setType("session");
}

public Session(Element element) {
super(element);
}

// FIELDS ------------------
private StringSimpleType valueAttr;

        public StringSimpleType getValueAttr() {
        if (valueAttr == null) {
                valueAttr = new StringSimpleType();
                valueAttr.setValue(getElement().getAttribute("value"));
        }

        return valueAttr;
        }
        //DSL Style get value
        public StringSimpleType valueAttr() {
        return  getValueAttr();
        }

        public void setValueAttr(final StringSimpleType valueAttr) {
        this.valueAttr = valueAttr;
        }
        //DSL Style set value
        public Session valueAttr(final StringSimpleType valueAttr) {
        setValueAttr(valueAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"a","affectedDocument","authorialNote","b","change","concept","courtType","date","def","del","docCommittee","docDate","docIntroducer","docJurisdiction","docketNumber","docNumber","docProponent","docPurpose","docStage","docStatus","docTitle","docType","entity","eol","eop","event","extractStructure","extractText","fillIn","i","img","inline","ins","judge","lawyer","legislature","location","marker","mmod","mod","mref","neutralCitation","noteRef","object","omissis","opinion","organization","outcome","party","person","placeholder","popup","process","quantity","recordedTime","ref","relatedDocument","remark","rmod","role","rref","session","shortTitle","signature","span","sub","sup","term","u","vote"};
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
        attrs.put("value", getValueAttr() != null ? getValueAttr().getValue() : null);
return attrs;
}
}

