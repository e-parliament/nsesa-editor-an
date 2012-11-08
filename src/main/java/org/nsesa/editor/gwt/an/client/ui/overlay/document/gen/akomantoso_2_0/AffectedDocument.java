package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AffectedDocument extends InlineComplexType  {

// CONSTRUCTORS ------------------
public AffectedDocument(Element element) {
    super(element);
}

// FIELDS ------------------
private LinkAttrGroup link;

public LinkAttrGroup getLink() {
return link;
}

public void setLink(final LinkAttrGroup link) {
this.link = link;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","linkAttrGroup","coreoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

