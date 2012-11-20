package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Lawyer extends InlinereqreqComplexType  {

// CONSTRUCTORS ------------------
    public Lawyer() {
        super(DOM.createElement("lawyer"));
    }

    public Lawyer(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType forAttr;
    private AnyURISimpleType empoweredByAttr;
    private AnyURISimpleType asAttr;
    public AnyURISimpleType getForAttr() {
        return forAttr;
    }
    public void setForAttr(final AnyURISimpleType forAttr) {
        this.forAttr = forAttr;
    }
    public AnyURISimpleType getEmpoweredByAttr() {
        return empoweredByAttr;
    }
    public void setEmpoweredByAttr(final AnyURISimpleType empoweredByAttr) {
        this.empoweredByAttr = empoweredByAttr;
    }
    public AnyURISimpleType getAsAttr() {
        return asAttr;
    }
    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    }

}

