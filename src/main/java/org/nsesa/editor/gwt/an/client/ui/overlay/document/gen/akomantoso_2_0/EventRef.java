package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EventTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.YesNoTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DateAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EventTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.YesNoTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DateAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class EventRef extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
public EventRef(Element element) {
    super(element);
}

// FIELDS ------------------
private EventTypeSimpleType typez;
private YesNoTypeSimpleType originatingExpression;
private DateAttrGroup date;
private SourceAttrGroup source;

public EventTypeSimpleType getTypez() {
return typez;
}

public void setTypez(final EventTypeSimpleType typez) {
this.typez = typez;
}

public YesNoTypeSimpleType getOriginatingExpression() {
return originatingExpression;
}

public void setOriginatingExpression(final YesNoTypeSimpleType originatingExpression) {
this.originatingExpression = originatingExpression;
}

public DateAttrGroup getDate() {
return date;
}

public void setDate(final DateAttrGroup date) {
this.date = date;
}

public SourceAttrGroup getSource() {
return source;
}

public void setSource(final SourceAttrGroup source) {
this.source = source;
}

}

