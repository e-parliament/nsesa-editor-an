package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PopupStructureComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NotesAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AuthorialNote extends PopupStructureComplexType  {

// CONSTRUCTORS ------------------
public AuthorialNote(Element element) {
    super(element);
}

// FIELDS ------------------
private NotesAttrGroup notes;

public NotesAttrGroup getNotes() {
return notes;
}

public void setNotes(final NotesAttrGroup notes) {
this.notes = notes;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"componentRef","notesAttrGroup","citation","wrap","containerElementsGroup","ANcontainersGroup","subheading","hierElementsGroup","intro","blockElementsGroup","content","recital","num","corereqAttrGroup","heading"};
    return  subtypes;
}
}

