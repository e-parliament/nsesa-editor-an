package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DateTimeSimpleType;

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
        return typeAttr;
    }
    public void setTypeAttr(final TimeTypeSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    public DateTimeSimpleType getTimeAttr() {
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

}

