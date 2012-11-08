package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SourceAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.TemporalGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class TemporalData extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public TemporalData(Element element) {
    super(element);
}

// FIELDS ------------------
private SourceAttrGroup source;
private java.util.List<TemporalGroup> temporalGroups = new ArrayList<TemporalGroup>();

public SourceAttrGroup getSource() {
return source;
}

public void setSource(final SourceAttrGroup source) {
this.source = source;
}
public java.util.List<TemporalGroup> getTemporalGroup() {
return temporalGroups;
}

public void setTemporalGroup(final java.util.List<TemporalGroup> temporalGroups) {
this.temporalGroups = temporalGroups;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"temporalGroup","sourceAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

