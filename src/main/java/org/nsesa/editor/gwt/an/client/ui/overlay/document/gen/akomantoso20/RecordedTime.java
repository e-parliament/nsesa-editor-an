package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateTimeSimpleType;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class RecordedTime extends InlineComplexType  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "recordedTime");
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
            typeAttr = TimeTypeSimpleType.fromString(amendableElement.getAttribute("type"));
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
            timeAttr.setValue(amendableElement.getAttribute("time"));
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
        return new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    }

    /**
    * Returns the namespace URI of this amendable widget.
    */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        attrs.put("time", getTimeAttr() != null ? getTimeAttr().getValue() : null);
        return attrs;
    }
}

