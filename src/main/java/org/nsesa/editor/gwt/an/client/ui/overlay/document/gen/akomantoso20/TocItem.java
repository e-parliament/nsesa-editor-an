package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IntegerSimpleType;
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

public class TocItem extends InlineComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "tocItem");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget tocItem");
return span;
}

// CONSTRUCTORS ------------------
public TocItem() {
super(create());
setType("tocItem");
}

public TocItem(Element element) {
super(element);
}

// FIELDS ------------------
private IntegerSimpleType levelAttr;
private AnyURISimpleType hrefAttr;

        public IntegerSimpleType getLevelAttr() {
        if (levelAttr == null) {
                levelAttr = new IntegerSimpleType();
                levelAttr.setValue(getElement().getAttribute("level"));
        }

        return levelAttr;
        }
        //DSL Style get value
        public IntegerSimpleType levelAttr() {
        return  getLevelAttr();
        }

        public void setLevelAttr(final IntegerSimpleType levelAttr) {
        this.levelAttr = levelAttr;
        }
        //DSL Style set value
        public TocItem levelAttr(final IntegerSimpleType levelAttr) {
        setLevelAttr(levelAttr);
        return this;
        }
        public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
                hrefAttr = new AnyURISimpleType();
                hrefAttr.setValue(getElement().getAttribute("href"));
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
        public TocItem hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"a","affectedDocument","authorialNote","b","change","concept","courtType","date","def","del","docCommittee","docDate","docIntroducer","docJurisdiction","docketNumber","docNumber","docProponent","docPurpose","docStage","docStatus","docTitle","docType","entity","eol","eop","event","extractStructure","extractText","fillIn","i","img","inline","ins","judge","lawyer","legislature","location","marker","mmod","mod","mref","neutralCitation","noteRef","object","omissis","opinion","organization","outcome","party","person","placeholder","popup","process","quantity","recordedTime","ref","relatedDocument","remark","rmod","role","rref","session","shortTitle","signature","span","sub","sup","term","u","vote"};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("level", getLevelAttr() != null ? getLevelAttr().getValue() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
return attrs;
}
}

