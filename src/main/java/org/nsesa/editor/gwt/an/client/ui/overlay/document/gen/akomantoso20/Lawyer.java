package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlinereqreqComplexType;
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
        if (forAttr == null) {
            forAttr = new AnyURISimpleType();
            forAttr.setValue(amendableElement.getAttribute("for"));
        }

        return forAttr;
    }
    //DSL Style get value
    public AnyURISimpleType forAttr() {
         return  getForAttr();
    }

    public void setForAttr(final AnyURISimpleType forAttr) {
        this.forAttr = forAttr;
    }
    //DSL Style set value
    public Lawyer forAttr(final AnyURISimpleType forAttr) {
        setForAttr(forAttr);
        return this;
    }
    public AnyURISimpleType getEmpoweredByAttr() {
        if (empoweredByAttr == null) {
            empoweredByAttr = new AnyURISimpleType();
            empoweredByAttr.setValue(amendableElement.getAttribute("empoweredBy"));
        }

        return empoweredByAttr;
    }
    //DSL Style get value
    public AnyURISimpleType empoweredByAttr() {
         return  getEmpoweredByAttr();
    }

    public void setEmpoweredByAttr(final AnyURISimpleType empoweredByAttr) {
        this.empoweredByAttr = empoweredByAttr;
    }
    //DSL Style set value
    public Lawyer empoweredByAttr(final AnyURISimpleType empoweredByAttr) {
        setEmpoweredByAttr(empoweredByAttr);
        return this;
    }
    public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
            asAttr = new AnyURISimpleType();
            asAttr.setValue(amendableElement.getAttribute("as"));
        }

        return asAttr;
    }
    //DSL Style get value
    public AnyURISimpleType asAttr() {
         return  getAsAttr();
    }

    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
    }
    //DSL Style set value
    public Lawyer asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
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
        attrs.put("forAttr", getForAttr() != null ? getForAttr().getValue() : null);
        attrs.put("empoweredByAttr", getEmpoweredByAttr() != null ? getEmpoweredByAttr().getValue() : null);
        attrs.put("asAttr", getAsAttr() != null ? getAsAttr().getValue() : null);
        return attrs;
    }

}

