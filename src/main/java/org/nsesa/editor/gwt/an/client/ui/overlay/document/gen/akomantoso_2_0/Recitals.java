package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Intro;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Recital;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Intro;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Recital;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Recitals extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Recitals(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private Intro intro;
private java.util.List<Recital> recitals = new ArrayList<Recital>();

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

public java.util.List<Recital> getRecital() {
return recitals;
}

public void setRecital(final java.util.List<Recital> recitals) {
this.recitals = recitals;
}

}

