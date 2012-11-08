package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlinereqreqComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RoleAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Lawyer extends InlinereqreqComplexType  {

// CONSTRUCTORS ------------------
public Lawyer(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType forURI;
private AnyURISimpleType empoweredBy;
private RoleAttrGroup role;

public AnyURISimpleType getFor() {
return forURI;
}

public void setFor(final AnyURISimpleType forURI) {
this.forURI = forURI;
}
public AnyURISimpleType getEmpoweredBy() {
return empoweredBy;
}

public void setEmpoweredBy(final AnyURISimpleType empoweredBy) {
this.empoweredBy = empoweredBy;
}
public RoleAttrGroup getRole() {
return role;
}

public void setRole(final RoleAttrGroup role) {
this.role = role;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","roleAttrGroup","anyURISimpleType","corereqreqAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

