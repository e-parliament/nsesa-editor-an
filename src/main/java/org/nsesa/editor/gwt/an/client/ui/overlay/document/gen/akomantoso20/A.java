package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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
        if (targetAttr == null) {
            targetAttr = new StringSimpleType();
            targetAttr.setValue(amendableElement.getAttribute("target"));
        }

        return targetAttr;
    }
    //DSL Style get value
    public StringSimpleType targetAttr() {
         return  getTargetAttr();
    }

    public void setTargetAttr(final StringSimpleType targetAttr) {
        this.targetAttr = targetAttr;
    }
    //DSL Style set value
    public A targetAttr(final StringSimpleType targetAttr) {
        setTargetAttr(targetAttr);
        return this;
    }
    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(amendableElement.getAttribute("href"));
        }

        return hrefAttr;
    }
    //DSL Style get value
    public AnyURISimpleType hrefAttr() {
         return  getHrefAttr();
    }

    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    //DSL Style set value
    public A hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("targetAttr", getTargetAttr() != null ? getTargetAttr().getValue() : null);
        attrs.put("hrefAttr", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        return attrs;
    }

}

