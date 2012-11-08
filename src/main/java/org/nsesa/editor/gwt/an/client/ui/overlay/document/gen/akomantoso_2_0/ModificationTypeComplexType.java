package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EnactmentAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModifiersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Source;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Destination;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Force;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Efficacy;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Application;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Duration;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Condition;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EnactmentAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModifiersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Source;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Destination;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Force;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Efficacy;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Application;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Duration;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Condition;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ModificationTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ModificationTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private IdreqAttrGroup idreq;
private RefersAttrGroup refers;
private EnactmentAttrGroup enactment;
private ModifiersAttrGroup modifiers;
private CoreAttrGroup core;
private java.util.List<Source> sources = new ArrayList<Source>();
private java.util.List<Destination> destinations = new ArrayList<Destination>();
private Force force;
private Efficacy efficacy;
private Application application;
private Duration duration;
private Condition condition;

public IdreqAttrGroup getIdreq() {
return idreq;
}

public void setIdreq(final IdreqAttrGroup idreq) {
this.idreq = idreq;
}

public RefersAttrGroup getRefers() {
return refers;
}

public void setRefers(final RefersAttrGroup refers) {
this.refers = refers;
}

public EnactmentAttrGroup getEnactment() {
return enactment;
}

public void setEnactment(final EnactmentAttrGroup enactment) {
this.enactment = enactment;
}

public ModifiersAttrGroup getModifiers() {
return modifiers;
}

public void setModifiers(final ModifiersAttrGroup modifiers) {
this.modifiers = modifiers;
}

public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}

public java.util.List<Source> getSource() {
return sources;
}

public void setSource(final java.util.List<Source> sources) {
this.sources = sources;
}

public java.util.List<Destination> getDestination() {
return destinations;
}

public void setDestination(final java.util.List<Destination> destinations) {
this.destinations = destinations;
}

public Force getForce() {
return force;
}

public void setForce(final Force force) {
this.force = force;
}

public Efficacy getEfficacy() {
return efficacy;
}

public void setEfficacy(final Efficacy efficacy) {
this.efficacy = efficacy;
}

public Application getApplication() {
return application;
}

public void setApplication(final Application application) {
this.application = application;
}

public Duration getDuration() {
return duration;
}

public void setDuration(final Duration duration) {
this.duration = duration;
}

public Condition getCondition() {
return condition;
}

public void setCondition(final Condition condition) {
this.condition = condition;
}

}

