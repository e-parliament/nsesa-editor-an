package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

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
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private String wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType srcAttr;
    private StringSimpleType altAttr;
    public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
            showAsAttr = new StringSimpleType();
            showAsAttr.setValue(amendableElement.getAttribute("showAs"));
        }

        return showAsAttr;
    }
    public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
    }
    public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
            shortFormAttr = new StringSimpleType();
            shortFormAttr.setValue(amendableElement.getAttribute("shortForm"));
        }

        return shortFormAttr;
    }
    public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
    }
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
        }

        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public AnyURISimpleType getSrcAttr() {
        if (srcAttr == null) {
            srcAttr = new AnyURISimpleType();
            srcAttr.setValue(amendableElement.getAttribute("src"));
        }

        return srcAttr;
    }
    public void setSrcAttr(final AnyURISimpleType srcAttr) {
        this.srcAttr = srcAttr;
    }
    public StringSimpleType getAltAttr() {
        if (altAttr == null) {
            altAttr = new StringSimpleType();
            altAttr.setValue(amendableElement.getAttribute("alt"));
        }

        return altAttr;
    }
    public void setAltAttr(final StringSimpleType altAttr) {
        this.altAttr = altAttr;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("showAsAttr", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortFormAttr", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        attrs.put("wildcardContentAttr", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("idAttr", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingIdAttr", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("srcAttr", getSrcAttr() != null ? getSrcAttr().getValue() : null);
        attrs.put("altAttr", getAltAttr() != null ? getAltAttr().getValue() : null);
        return attrs;
    }

}

