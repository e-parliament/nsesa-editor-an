package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class QuotedText extends InlineComplexType  {

// CONSTRUCTORS ------------------
    public QuotedText() {
        super(DOM.createElement("quotedText"));
    }

    public QuotedText(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType forAttr;
    public AnyURISimpleType getForAttr() {
        return forAttr;
    }
    public void setForAttr(final AnyURISimpleType forAttr) {
        this.forAttr = forAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    }

}

