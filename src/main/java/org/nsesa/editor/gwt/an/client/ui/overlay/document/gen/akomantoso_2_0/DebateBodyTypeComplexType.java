package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SpeechSectionGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class DebateBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public DebateBodyTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private java.util.List<SpeechSectionGroup> speechSections = new ArrayList<SpeechSectionGroup>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}
public java.util.List<SpeechSectionGroup> getSpeechSection() {
return speechSections;
}

public void setSpeechSection(final java.util.List<SpeechSectionGroup> speechSections) {
this.speechSections = speechSections;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreoptAttrGroup","speechSectionGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

