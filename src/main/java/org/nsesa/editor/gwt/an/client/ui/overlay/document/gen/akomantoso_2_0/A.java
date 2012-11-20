package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class A extends InlineComplexType  {

// CONSTRUCTORS ------------------
    public A() {
        super(DOM.createElement("a"));
    }

    public A(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType targetAttr;
    private AnyURISimpleType hrefAttr;
    public StringSimpleType getTargetAttr() {
        return targetAttr;
    }
    public void setTargetAttr(final StringSimpleType targetAttr) {
        this.targetAttr = targetAttr;
    }
    public AnyURISimpleType getHrefAttr() {
        return hrefAttr;
    }
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    }

}

