package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TimeTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateTimeSimpleType;
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

public class RecordedTime extends InlineComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "recordedTime");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget recordedTime");
return span;
}

// CONSTRUCTORS ------------------
public RecordedTime() {
super(create());
setType("recordedTime");
}

public RecordedTime(Element element) {
super(element);
}

// FIELDS ------------------
private TimeTypeSimpleType typeAttr;
private DateTimeSimpleType timeAttr;

        public TimeTypeSimpleType getTypeAttr() {
        if (typeAttr == null) {
                typeAttr = TimeTypeSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
        }
        //DSL Style get value
        public TimeTypeSimpleType typeAttr() {
        return  getTypeAttr();
        }

        public void setTypeAttr(final TimeTypeSimpleType typeAttr) {
        this.typeAttr = typeAttr;
        }
        //DSL Style set value
        public RecordedTime typeAttr(final TimeTypeSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
        }
        public DateTimeSimpleType getTimeAttr() {
        if (timeAttr == null) {
                timeAttr = new DateTimeSimpleType();
                timeAttr.setValue(getElement().getAttribute("time"));
        }

        return timeAttr;
        }
        //DSL Style get value
        public DateTimeSimpleType timeAttr() {
        return  getTimeAttr();
        }

        public void setTimeAttr(final DateTimeSimpleType timeAttr) {
        this.timeAttr = timeAttr;
        }
        //DSL Style set value
        public RecordedTime timeAttr(final DateTimeSimpleType timeAttr) {
        setTimeAttr(timeAttr);
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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        attrs.put("time", getTimeAttr() != null ? getTimeAttr().getValue() : null);
return attrs;
}
}

