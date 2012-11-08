package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TimeInterval;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TimeInterval;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class TemporalGroup extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public TemporalGroup(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreAttrGroup core;
private IdreqAttrGroup idreq;
private java.util.List<TimeInterval> timeIntervals = new ArrayList<TimeInterval>();

public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}

public IdreqAttrGroup getIdreq() {
return idreq;
}

public void setIdreq(final IdreqAttrGroup idreq) {
this.idreq = idreq;
}

public java.util.List<TimeInterval> getTimeInterval() {
return timeIntervals;
}

public void setTimeInterval(final java.util.List<TimeInterval> timeIntervals) {
this.timeIntervals = timeIntervals;
}

}

