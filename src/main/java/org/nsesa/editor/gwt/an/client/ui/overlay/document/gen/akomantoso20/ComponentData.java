package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ComponentData;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ComponentData extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public ComponentData() {
        super(DOM.createElement("componentData"));
    }

    public ComponentData(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType hrefAttr;
    private StringSimpleType nameAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    public java.util.List<ComponentData> getComponentDatas() {
        java.util.List<ComponentData> result = new ArrayList<ComponentData>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ComponentData".equalsIgnoreCase(widget.getType())) {
                result.add((ComponentData)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public StringSimpleType getShowAsAttr() {
        return showAsAttr;
    }
    public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
    }
    public StringSimpleType getShortFormAttr() {
        return shortFormAttr;
    }
    public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
    }
    public String getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public AnyURISimpleType getHrefAttr() {
        return hrefAttr;
    }
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    public StringSimpleType getNameAttr() {
        return nameAttr;
    }
    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
    public IDSimpleType getIdAttr() {
        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"componentData"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("showAsAttr", getShowAsAttr().getValue());
        attrs.put("shortFormAttr", getShortFormAttr().getValue());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().toString());
        attrs.put("hrefAttr", getHrefAttr().getValue());
        attrs.put("nameAttr", getNameAttr().getValue());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());

        return attrs;
    }

}

