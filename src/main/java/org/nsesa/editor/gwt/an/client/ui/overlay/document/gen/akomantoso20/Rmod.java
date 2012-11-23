package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Rmod extends ModTypeComplexType  {

// CONSTRUCTORS ------------------
    public Rmod() {
        super(DOM.createElement("rmod"));
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
            fromAttr.setValue(amendableElement.getAttribute("from"));
        }

        return fromAttr;
    }
    public void setFromAttr(final AnyURISimpleType fromAttr) {
        this.fromAttr = fromAttr;
    }
    public AnyURISimpleType getUpToAttr() {
        if (upToAttr == null) {
            upToAttr = new AnyURISimpleType();
            upToAttr.setValue(amendableElement.getAttribute("upTo"));
        }

        return upToAttr;
    }
    public void setUpToAttr(final AnyURISimpleType upToAttr) {
        this.upToAttr = upToAttr;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person","neutralCitation","docType","location","remark","docStatus","change","entity","authorialNote","img","party","legislature","event","quotedStructure","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","quotedText","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("fromAttr", getFromAttr() != null ? getFromAttr().getValue() : null);
        attrs.put("upToAttr", getUpToAttr() != null ? getUpToAttr().getValue() : null);
        return attrs;
    }

}

