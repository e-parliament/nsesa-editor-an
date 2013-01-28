package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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

public class SrcTypeComplexType extends AmendableWidgetImpl  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "srcTypeComplexType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget srcTypeComplexType");
return span;
}

// CONSTRUCTORS ------------------

public SrcTypeComplexType(Element element) {
super(element);
}

// FIELDS ------------------
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private String wildcardContentAttr;
private StringSimpleType showAsAttr;
private StringSimpleType shortFormAttr;
private AnyURISimpleType srcAttr;
private StringSimpleType altAttr;

        public IDSimpleType getIdAttr() {
        if (idAttr == null) {
                idAttr = new IDSimpleType();
                idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
        }
        //DSL Style get value
        public IDSimpleType idAttr() {
        return  getIdAttr();
        }

        public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        }
        //DSL Style set value
        public SrcTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
                evolvingIdAttr = new NMTOKENSimpleType();
                evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
        }
        //DSL Style get value
        public NMTOKENSimpleType evolvingIdAttr() {
        return  getEvolvingIdAttr();
        }

        public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        }
        //DSL Style set value
        public SrcTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
        }
        //DSL Style get value
        public String wildcardContentAttr() {
        return  getWildcardContentAttr();
        }

        public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        }
        //DSL Style set value
        public SrcTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
                showAsAttr = new StringSimpleType();
                showAsAttr.setValue(getElement().getAttribute("showAs"));
        }

        return showAsAttr;
        }
        //DSL Style get value
        public StringSimpleType showAsAttr() {
        return  getShowAsAttr();
        }

        public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
        }
        //DSL Style set value
        public SrcTypeComplexType showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
        }
        public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
                shortFormAttr = new StringSimpleType();
                shortFormAttr.setValue(getElement().getAttribute("shortForm"));
        }

        return shortFormAttr;
        }
        //DSL Style get value
        public StringSimpleType shortFormAttr() {
        return  getShortFormAttr();
        }

        public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
        }
        //DSL Style set value
        public SrcTypeComplexType shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
        }
        public AnyURISimpleType getSrcAttr() {
        if (srcAttr == null) {
                srcAttr = new AnyURISimpleType();
                srcAttr.setValue(getElement().getAttribute("src"));
        }

        return srcAttr;
        }
        //DSL Style get value
        public AnyURISimpleType srcAttr() {
        return  getSrcAttr();
        }

        public void setSrcAttr(final AnyURISimpleType srcAttr) {
        this.srcAttr = srcAttr;
        }
        //DSL Style set value
        public SrcTypeComplexType srcAttr(final AnyURISimpleType srcAttr) {
        setSrcAttr(srcAttr);
        return this;
        }
        public StringSimpleType getAltAttr() {
        if (altAttr == null) {
                altAttr = new StringSimpleType();
                altAttr.setValue(getElement().getAttribute("alt"));
        }

        return altAttr;
        }
        //DSL Style get value
        public StringSimpleType altAttr() {
        return  getAltAttr();
        }

        public void setAltAttr(final StringSimpleType altAttr) {
        this.altAttr = altAttr;
        }
        //DSL Style set value
        public SrcTypeComplexType altAttr(final StringSimpleType altAttr) {
        setAltAttr(altAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("showAs", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortForm", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        attrs.put("src", getSrcAttr() != null ? getSrcAttr().getValue() : null);
        attrs.put("alt", getAltAttr() != null ? getAltAttr().getValue() : null);
return attrs;
}
}

