package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ModTypeComplexType;
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

public class Rmod extends ModTypeComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "rmod");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget rmod");
return span;
}

// CONSTRUCTORS ------------------
public Rmod() {
super(create());
setType("rmod");
}

public Rmod(Element element) {
super(element);
}

// FIELDS ------------------
private AnyURISimpleType fromAttr;
private AnyURISimpleType upToAttr;

        public AnyURISimpleType getFromAttr() {
        if (fromAttr == null) {
                fromAttr = new AnyURISimpleType();
                fromAttr.setValue(getElement().getAttribute("from"));
        }

        return fromAttr;
        }
        //DSL Style get value
        public AnyURISimpleType fromAttr() {
        return  getFromAttr();
        }

        public void setFromAttr(final AnyURISimpleType fromAttr) {
        this.fromAttr = fromAttr;
        }
        //DSL Style set value
        public Rmod fromAttr(final AnyURISimpleType fromAttr) {
        setFromAttr(fromAttr);
        return this;
        }
        public AnyURISimpleType getUpToAttr() {
        if (upToAttr == null) {
                upToAttr = new AnyURISimpleType();
                upToAttr.setValue(getElement().getAttribute("upTo"));
        }

        return upToAttr;
        }
        //DSL Style get value
        public AnyURISimpleType upToAttr() {
        return  getUpToAttr();
        }

        public void setUpToAttr(final AnyURISimpleType upToAttr) {
        this.upToAttr = upToAttr;
        }
        //DSL Style set value
        public Rmod upToAttr(final AnyURISimpleType upToAttr) {
        setUpToAttr(upToAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"a","affectedDocument","authorialNote","b","change","concept","courtType","date","def","del","docCommittee","docDate","docIntroducer","docJurisdiction","docketNumber","docNumber","docProponent","docPurpose","docStage","docStatus","docTitle","docType","entity","eol","eop","event","extractStructure","extractText","fillIn","i","img","inline","ins","judge","lawyer","legislature","location","marker","mmod","mod","mref","neutralCitation","noteRef","object","omissis","opinion","organization","outcome","party","person","placeholder","popup","process","quantity","quotedStructure","quotedText","recordedTime","ref","relatedDocument","remark","rmod","role","rref","session","shortTitle","signature","span","sub","sup","term","u","vote"};
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
        attrs.put("from", getFromAttr() != null ? getFromAttr().getValue() : null);
        attrs.put("upTo", getUpToAttr() != null ? getUpToAttr().getValue() : null);
return attrs;
}
}

