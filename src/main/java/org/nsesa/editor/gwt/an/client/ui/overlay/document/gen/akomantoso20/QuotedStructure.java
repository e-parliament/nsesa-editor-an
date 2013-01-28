package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PopupStructureComplexType;
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

public class QuotedStructure extends PopupStructureComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "quotedStructure");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget quotedStructure");
return span;
}

// CONSTRUCTORS ------------------
public QuotedStructure() {
super(create());
setType("quotedStructure");
}

public QuotedStructure(Element element) {
super(element);
}

// FIELDS ------------------
private AnyURISimpleType forAttr;

        public AnyURISimpleType getForAttr() {
        if (forAttr == null) {
                forAttr = new AnyURISimpleType();
                forAttr.setValue(getElement().getAttribute("for"));
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
        public QuotedStructure forAttr(final AnyURISimpleType forAttr) {
        setForAttr(forAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"address","adjournment","administrationOfOath","alinea","answer","article","block","blockList","book","chapter","citation","clause","communication","componentRef","container","content","debateSection","declarationOfVote","div","division","foreign","hcontainer","heading","indent","intro","list","ministerialStatements","narrative","nationalInterest","noticesOfMotion","num","ol","oralStatements","other","p","papers","paragraph","part","personalStatements","petitions","point","pointOfOrder","prayers","proceduralMotions","question","questions","recital","resolutions","rollCall","scene","section","speech","subchapter","subclause","subheading","sublist","subparagraph","subpart","subsection","subtitle","summary","table","tblock","title","toc","tome","ul","wrap","writtenStatements"};
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
        attrs.put("for", getForAttr() != null ? getForAttr().getValue() : null);
return attrs;
}
}

