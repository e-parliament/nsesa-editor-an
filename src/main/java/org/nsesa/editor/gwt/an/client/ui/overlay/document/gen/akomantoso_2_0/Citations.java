package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Intro;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Citation;
import org.nsesa.editor.gwt.core.client.ui.overlay.xml.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Intro;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Citation;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Citations extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Citations(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private Intro intro;
private java.util.List<Citation> citations = new ArrayList<Citation>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}

public Intro getIntro() {
return intro;
}

public void setIntro(final Intro intro) {
this.intro = intro;
}

public java.util.List<Citation> getCitation() {
return citations;
}

public void setCitation(final java.util.List<Citation> citations) {
this.citations = citations;
}

}

