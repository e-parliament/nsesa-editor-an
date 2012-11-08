package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NotesAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class NoteRef extends MarkeroptComplexType  {

// CONSTRUCTORS ------------------
public NoteRef(Element element) {
    super(element);
}

// FIELDS ------------------
private LinkAttrGroup link;
private NotesAttrGroup notes;

public LinkAttrGroup getLink() {
return link;
}

public void setLink(final LinkAttrGroup link) {
this.link = link;
}
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
    String[] subtypes = new String[]{"notesAttrGroup","linkAttrGroup","coreoptAttrGroup"};
    return  subtypes;
}
}

