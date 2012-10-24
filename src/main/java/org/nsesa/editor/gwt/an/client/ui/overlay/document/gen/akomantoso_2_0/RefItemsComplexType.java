package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DocRefsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TLCsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DocRefsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TLCsGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class RefItemsComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public RefItemsComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private SourceAttrGroup source;
private java.util.List<DocRefsGroup> docRefses = new ArrayList<DocRefsGroup>();
private java.util.List<TLCsGroup> TLCses = new ArrayList<TLCsGroup>();

public SourceAttrGroup getSource() {
return source;
}

public void setSource(final SourceAttrGroup source) {
this.source = source;
}

public java.util.List<DocRefsGroup> getDocRefs() {
return docRefses;
}

public void setDocRefs(final java.util.List<DocRefsGroup> docRefses) {
this.docRefses = docRefses;
}

public java.util.List<TLCsGroup> getTLCs() {
return TLCses;
}

public void setTLCs(final java.util.List<TLCsGroup> TLCses) {
this.TLCses = TLCses;
}

}

