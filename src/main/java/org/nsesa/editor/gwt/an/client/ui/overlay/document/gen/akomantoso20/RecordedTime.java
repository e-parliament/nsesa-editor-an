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

// CONSTRUCTORS ------------------
    public RecordedTime() {
        super(DOM.createElement("recordedTime"));
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
    public void setTypeAttr(final TimeTypeSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    public DateTimeSimpleType getTimeAttr() {
        if (timeAttr == null) {
            timeAttr = new DateTimeSimpleType();
            timeAttr.setValue(amendableElement.getAttribute("time"));
        }

        return timeAttr;
    }
    public void setTimeAttr(final DateTimeSimpleType timeAttr) {
        this.timeAttr = timeAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr().value());
        attrs.put("timeAttr", getTimeAttr().getValue());

        return attrs;
    }

}

