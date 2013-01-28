package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlinereqreqComplexType;
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

public class Quantity extends InlinereqreqComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "quantity");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget quantity");
return span;
}

// CONSTRUCTORS ------------------
public Quantity() {
super(create());
setType("quantity");
}

public Quantity(Element element) {
super(element);
}

// FIELDS ------------------
private StringSimpleType normalizedAttr;

        public StringSimpleType getNormalizedAttr() {
        if (normalizedAttr == null) {
                normalizedAttr = new StringSimpleType();
                normalizedAttr.setValue(getElement().getAttribute("normalized"));
        }

        return normalizedAttr;
        }
        //DSL Style get value
        public StringSimpleType normalizedAttr() {
        return  getNormalizedAttr();
        }

        public void setNormalizedAttr(final StringSimpleType normalizedAttr) {
        this.normalizedAttr = normalizedAttr;
        }
        //DSL Style set value
        public Quantity normalizedAttr(final StringSimpleType normalizedAttr) {
        setNormalizedAttr(normalizedAttr);
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
        attrs.put("normalized", getNormalizedAttr() != null ? getNormalizedAttr().getValue() : null);
return attrs;
}
}

