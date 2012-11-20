package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ArgumentTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public ArgumentTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType upToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private PosTypeSimpleType posAttr;
    private AnyURISimpleType hrefAttr;
    private AmendableWidgetImpl wildcardContentAttr;
    public AnyURISimpleType getUpToAttr() {
        return upToAttr;
    }
    public void setUpToAttr(final AnyURISimpleType upToAttr) {
        this.upToAttr = upToAttr;
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
    public PosTypeSimpleType getPosAttr() {
        return posAttr;
    }
    public void setPosAttr(final PosTypeSimpleType posAttr) {
        this.posAttr = posAttr;
    }
    public AnyURISimpleType getHrefAttr() {
        return hrefAttr;
    }
    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    public AmendableWidgetImpl getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

}

