package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModifiersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EnactmentAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Source;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Destination;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Condition;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class JudicialArgumentTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public JudicialArgumentTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private RefersAttrGroup refers;
private ModifiersAttrGroup modifiers;
private IdreqAttrGroup idreq;
private EnactmentAttrGroup enactment;
private CoreAttrGroup core;
private java.util.List<Source> sources = new ArrayList<Source>();
private java.util.List<Destination> destinations = new ArrayList<Destination>();
private Condition condition;

public RefersAttrGroup getRefers() {
return refers;
}

public void setRefers(final RefersAttrGroup refers) {
this.refers = refers;
}
public ModifiersAttrGroup getModifiers() {
return modifiers;
}

public void setModifiers(final ModifiersAttrGroup modifiers) {
this.modifiers = modifiers;
}
public IdreqAttrGroup getIdreq() {
return idreq;
}

public void setIdreq(final IdreqAttrGroup idreq) {
this.idreq = idreq;
}
public EnactmentAttrGroup getEnactment() {
return enactment;
}

public void setEnactment(final EnactmentAttrGroup enactment) {
this.enactment = enactment;
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
public Condition getCondition() {
return condition;
}

public void setCondition(final Condition condition) {
this.condition = condition;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"coreAttrGroup","modifiersAttrGroup","source","condition","enactmentAttrGroup","idreqAttrGroup","destination","refersAttrGroup"};
    return  subtypes;
}
}

