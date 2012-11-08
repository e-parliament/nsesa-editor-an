package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.JudgementBlockGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class JudgementBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public JudgementBodyTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private java.util.List<JudgementBlockGroup> judgementBlocks = new ArrayList<JudgementBlockGroup>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}
public java.util.List<JudgementBlockGroup> getJudgementBlock() {
return judgementBlocks;
}

public void setJudgementBlock(final java.util.List<JudgementBlockGroup> judgementBlocks) {
this.judgementBlocks = judgementBlocks;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"judgementBlockGroup","coreoptAttrGroup"};
    return  subtypes;
}
}

