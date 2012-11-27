package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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
public class FillIn extends InlineComplexType  {

// CONSTRUCTORS ------------------
    public FillIn() {
        super(DOM.createElement("fillIn"));
    }

    public FillIn(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType widthAttr;
    public StringSimpleType getWidthAttr() {
        if (widthAttr == null) {
            widthAttr = new StringSimpleType();
            widthAttr.setValue(amendableElement.getAttribute("width"));
        }

        return widthAttr;
    }
    //DSL Style get value
    public StringSimpleType widthAttr() {
         return  getWidthAttr();
    }

    public void setWidthAttr(final StringSimpleType widthAttr) {
        this.widthAttr = widthAttr;
    }
    //DSL Style set value
    public FillIn widthAttr(final StringSimpleType widthAttr) {
        setWidthAttr(widthAttr);
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
        attrs.put("widthAttr", getWidthAttr() != null ? getWidthAttr().getValue() : null);
        return attrs;
    }

}

