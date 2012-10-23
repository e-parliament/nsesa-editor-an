package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DurationSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersreqAttrGroup;
import org.nsesa.editor.gwt.core.client.ui.overlay.xml.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DurationSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersreqAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class TimeInterval extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
public TimeInterval(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType start;
private AnyURISimpleType end;
private DurationSimpleType duration;
private RefersreqAttrGroup refersreq;

public AnyURISimpleType getStart() {
return start;
}

public void setStart(final AnyURISimpleType start) {
this.start = start;
}

public AnyURISimpleType getEnd() {
return end;
}

public void setEnd(final AnyURISimpleType end) {
this.end = end;
}

public DurationSimpleType getDuration() {
return duration;
}

public void setDuration(final DurationSimpleType duration) {
this.duration = duration;
}

public RefersreqAttrGroup getRefersreq() {
return refersreq;
}

public void setRefersreq(final RefersreqAttrGroup refersreq) {
this.refersreq = refersreq;
}

}

