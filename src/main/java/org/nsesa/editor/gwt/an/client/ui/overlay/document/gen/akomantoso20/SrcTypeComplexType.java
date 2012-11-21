package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class SrcTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public SrcTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private String wildcardContentAttr;
    private AnyURISimpleType srcAttr;
    private StringSimpleType altAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    public String getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public AnyURISimpleType getSrcAttr() {
        return srcAttr;
    }
    public void setSrcAttr(final AnyURISimpleType srcAttr) {
        this.srcAttr = srcAttr;
    }
    public StringSimpleType getAltAttr() {
        return altAttr;
    }
    public void setAltAttr(final StringSimpleType altAttr) {
        this.altAttr = altAttr;
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
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().toString());
        attrs.put("srcAttr", getSrcAttr().getValue());
        attrs.put("altAttr", getAltAttr().getValue());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());
        attrs.put("showAsAttr", getShowAsAttr().getValue());
        attrs.put("shortFormAttr", getShortFormAttr().getValue());

        return attrs;
    }

}

