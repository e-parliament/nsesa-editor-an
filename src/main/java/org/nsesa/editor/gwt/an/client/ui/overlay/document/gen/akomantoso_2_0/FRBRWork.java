package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRcountry;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRsubtype;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRnumber;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FRBRname;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FRBRWork extends CorePropertiesComplexType  {

// CONSTRUCTORS ------------------
public FRBRWork(Element element) {
    super(element);
}

// FIELDS ------------------
private FRBRcountry FRBRcountry;
private FRBRsubtype FRBRsubtype;
private FRBRnumber FRBRnumber;
private FRBRname FRBRname;

public FRBRcountry getFRBRcountry() {
return FRBRcountry;
}

public void setFRBRcountry(final FRBRcountry FRBRcountry) {
this.FRBRcountry = FRBRcountry;
}
public FRBRsubtype getFRBRsubtype() {
return FRBRsubtype;
}

public void setFRBRsubtype(final FRBRsubtype FRBRsubtype) {
this.FRBRsubtype = FRBRsubtype;
}
public FRBRnumber getFRBRnumber() {
return FRBRnumber;
}

public void setFRBRnumber(final FRBRnumber FRBRnumber) {
this.FRBRnumber = FRBRnumber;
}
public FRBRname getFRBRname() {
return FRBRname;
}

public void setFRBRname(final FRBRname FRBRname) {
this.FRBRname = FRBRname;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"FRBRthis","FRBRalias","FRBRcountry","FRBRsubtype","componentInfo","FRBRuri","FRBRnumber","FRBRname","FRBRauthor","FRBRdate","preservation"};
    return  subtypes;
}
}

