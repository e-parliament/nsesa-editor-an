package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DateSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Publication extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
public Publication(Element element) {
    super(element);
}

// FIELDS ------------------
private StringSimpleType showAsAttr;
private StringSimpleType shortFormAttr;
private StringSimpleType numberAttr;
private StringSimpleType nameAttr;
private AnyURISimpleType refersToAttr;
private DateSimpleType dateAttr;

public StringSimpleType getShowAsAttr() {
return showAsAttr;
}

public void setShowAsAttr(final StringSimpleType showAsAttr) {
this.showAsAttr = showAsAttr;
}
public StringSimpleType getShortFormAttr() {
return shortFormAttr;
}

public void setShortFormAttr(final StringSimpleType shortFormAttr) {
this.shortFormAttr = shortFormAttr;
}
public StringSimpleType getNumberAttr() {
return numberAttr;
}

public void setNumberAttr(final StringSimpleType numberAttr) {
this.numberAttr = numberAttr;
}
public StringSimpleType getNameAttr() {
return nameAttr;
}

public void setNameAttr(final StringSimpleType nameAttr) {
this.nameAttr = nameAttr;
}
public AnyURISimpleType getRefersToAttr() {
return refersToAttr;
}

public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
this.refersToAttr = refersToAttr;
}
public DateSimpleType getDateAttr() {
return dateAttr;
}

public void setDateAttr(final DateSimpleType dateAttr) {
this.dateAttr = dateAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{};
    return  subtypes;
}
}

