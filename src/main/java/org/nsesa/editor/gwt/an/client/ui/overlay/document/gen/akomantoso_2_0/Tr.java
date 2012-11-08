package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Th;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Td;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Tr extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Tr(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private java.util.List<Th> ths = new ArrayList<Th>();
private java.util.List<Td> tds = new ArrayList<Td>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}
public java.util.List<Th> getTh() {
return ths;
}

public void setTh(final java.util.List<Th> ths) {
this.ths = ths;
}
public java.util.List<Td> getTd() {
return tds;
}

public void setTd(final java.util.List<Td> tds) {
this.tds = tds;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"td","coreoptAttrGroup","th"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

