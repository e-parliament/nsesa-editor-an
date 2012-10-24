package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Keyword;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Keyword;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Classification extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Classification(Element element) {
    super(element);
}

// FIELDS ------------------
private SourceAttrGroup source;
private java.util.List<Keyword> keywords = new ArrayList<Keyword>();

public SourceAttrGroup getSource() {
return source;
}

public void setSource(final SourceAttrGroup source) {
this.source = source;
}

public java.util.List<Keyword> getKeyword() {
return keywords;
}

public void setKeyword(final java.util.List<Keyword> keywords) {
this.keywords = keywords;
}

}

