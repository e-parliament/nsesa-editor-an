package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AmendmentBlockGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AmendmentBlockGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AmendmentBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public AmendmentBodyTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private java.util.List<AmendmentBlockGroup> amendmentBlocks = new ArrayList<AmendmentBlockGroup>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}

public java.util.List<AmendmentBlockGroup> getAmendmentBlock() {
return amendmentBlocks;
}

public void setAmendmentBlock(final java.util.List<AmendmentBlockGroup> amendmentBlocks) {
this.amendmentBlocks = amendmentBlocks;
}

}

