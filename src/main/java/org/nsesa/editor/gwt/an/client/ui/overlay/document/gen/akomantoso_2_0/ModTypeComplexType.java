package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorereqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineCMGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.QuotedText;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.QuotedStructure;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ModTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ModTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CorereqAttrGroup corereq;
private java.util.List<InlineCMGroup> inlineCMs = new ArrayList<InlineCMGroup>();
private java.util.List<QuotedText> quotedTexts = new ArrayList<QuotedText>();
private java.util.List<QuotedStructure> quotedStructures = new ArrayList<QuotedStructure>();

public CorereqAttrGroup getCorereq() {
return corereq;
}

public void setCorereq(final CorereqAttrGroup corereq) {
this.corereq = corereq;
}
public java.util.List<InlineCMGroup> getInlineCM() {
return inlineCMs;
}

public void setInlineCM(final java.util.List<InlineCMGroup> inlineCMs) {
this.inlineCMs = inlineCMs;
}
public java.util.List<QuotedText> getQuotedText() {
return quotedTexts;
}

public void setQuotedText(final java.util.List<QuotedText> quotedTexts) {
this.quotedTexts = quotedTexts;
}
public java.util.List<QuotedStructure> getQuotedStructure() {
return quotedStructures;
}

public void setQuotedStructure(final java.util.List<QuotedStructure> quotedStructures) {
this.quotedStructures = quotedStructures;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","quotedText","quotedStructure","corereqAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

