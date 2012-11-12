package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Note;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Notes extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Notes(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<Note> notes = new ArrayList<Note>();
private AnyURISimpleType sourceAttr;

public java.util.List<Note> getNote() {
return notes;
}

public void setNote(final java.util.List<Note> notes) {
this.notes = notes;
}
public AnyURISimpleType getSourceAttr() {
return sourceAttr;
}

public void setSourceAttr(final AnyURISimpleType sourceAttr) {
this.sourceAttr = sourceAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"note"};
    return  subtypes;
}
}

