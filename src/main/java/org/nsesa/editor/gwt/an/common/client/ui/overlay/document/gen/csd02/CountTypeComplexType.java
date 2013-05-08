package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* The complex type countType lists all the properties associated to elements of parliamentary count.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class CountTypeComplexType extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultWildcard(0,-1)
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "countTypeComplexType");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget countTypeComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>CountTypeComplexType</code> object with the given DOM element
*/
public CountTypeComplexType(Element element) {
super(element);
}

// FIELDS ------------------
    private StringSimpleType valueAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType hrefAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;

        /**
        * Return <code>valueAttr</code> property
        * @return valueAttr
        */
        public StringSimpleType getValueAttr() {
        if (valueAttr == null) {
                valueAttr = new StringSimpleType();
                valueAttr.setValue(getElement().getAttribute("value"));
        }

        return valueAttr;
        }
        /**
        * Return <code>valueAttr</code> property in DSL way
        * @return valueAttr
        */
        public StringSimpleType valueAttr() {
        return  getValueAttr();
        }
        /**
        * Set <code>valueAttr</code> property
        * @param valueAttr the new value
        */
        public void setValueAttr(final StringSimpleType valueAttr) {
        this.valueAttr = valueAttr;
        getElement().setAttribute("value",valueAttr.getValue());
        }
        /**
        * Set <code>valueAttr</code> property in DSL way
        * @param valueAttr the new value
        * @return <code>CountTypeComplexType</code> instance
        */
        public CountTypeComplexType valueAttr(final StringSimpleType valueAttr) {
        setValueAttr(valueAttr);
        return this;
        }
        /**
        * Return <code>wildcardContentAttr</code> property
        * @return wildcardContentAttr
        */
        public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
        }
        /**
        * Return <code>wildcardContentAttr</code> property in DSL way
        * @return wildcardContentAttr
        */
        public String wildcardContentAttr() {
        return  getWildcardContentAttr();
        }
        /**
        * Set <code>wildcardContentAttr</code> property
        * @param wildcardContentAttr the new value
        */
        public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        getElement().setAttribute("wildcardContent",wildcardContentAttr);
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr the new value
        * @return <code>CountTypeComplexType</code> instance
        */
        public CountTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Return <code>refersToAttr</code> property
        * @return refersToAttr
        */
        public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
                refersToAttr = new AnyURISimpleType();
                refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
        }
        /**
        * Return <code>refersToAttr</code> property in DSL way
        * @return refersToAttr
        */
        public AnyURISimpleType refersToAttr() {
        return  getRefersToAttr();
        }
        /**
        * Set <code>refersToAttr</code> property
        * @param refersToAttr the new value
        */
        public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo",refersToAttr.getValue());
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr the new value
        * @return <code>CountTypeComplexType</code> instance
        */
        public CountTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Return <code>hrefAttr</code> property
        * @return hrefAttr
        */
        public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
                hrefAttr = new AnyURISimpleType();
                hrefAttr.setValue(getElement().getAttribute("href"));
        }

        return hrefAttr;
        }
        /**
        * Return <code>hrefAttr</code> property in DSL way
        * @return hrefAttr
        */
        public AnyURISimpleType hrefAttr() {
        return  getHrefAttr();
        }
        /**
        * Set <code>hrefAttr</code> property
        * @param hrefAttr the new value
        */
        public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
        getElement().setAttribute("href",hrefAttr.getValue());
        }
        /**
        * Set <code>hrefAttr</code> property in DSL way
        * @param hrefAttr the new value
        * @return <code>CountTypeComplexType</code> instance
        */
        public CountTypeComplexType hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
        }
        /**
        * Return <code>idAttr</code> property
        * @return idAttr
        */
        public IDSimpleType getIdAttr() {
        if (idAttr == null) {
                idAttr = new IDSimpleType();
                idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
        }
        /**
        * Return <code>idAttr</code> property in DSL way
        * @return idAttr
        */
        public IDSimpleType idAttr() {
        return  getIdAttr();
        }
        /**
        * Set <code>idAttr</code> property
        * @param idAttr the new value
        */
        public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        getElement().setAttribute("id",idAttr.getValue());
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr the new value
        * @return <code>CountTypeComplexType</code> instance
        */
        public CountTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Return <code>evolvingIdAttr</code> property
        * @return evolvingIdAttr
        */
        public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
                evolvingIdAttr = new NMTOKENSimpleType();
                evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
        }
        /**
        * Return <code>evolvingIdAttr</code> property in DSL way
        * @return evolvingIdAttr
        */
        public NMTOKENSimpleType evolvingIdAttr() {
        return  getEvolvingIdAttr();
        }
        /**
        * Set <code>evolvingIdAttr</code> property
        * @param evolvingIdAttr the new value
        */
        public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        getElement().setAttribute("evolvingId",evolvingIdAttr.getValue());
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr the new value
        * @return <code>CountTypeComplexType</code> instance
        */
        public CountTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
            /**
            * Return <code>java.util.List<OverlayWidgetImpl></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<OverlayWidgetImpl> getWildcardContents() {
                java.util.List<OverlayWidgetImpl> result = new ArrayList<OverlayWidgetImpl>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OverlayWidgetImpl".equalsIgnoreCase(widget.getType())) {
            result.add((OverlayWidgetImpl)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<OverlayWidgetImpl></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<OverlayWidgetImpl> getWildcardContentList() {
            return  getWildcardContents();
            }
            /**
            * Add <code>java.util.List<OverlayWidgetImpl></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public String addWildcardContent(String wildcardContentElem) {
                throw new RuntimeException("Adding wildcard content is not supported yet");
            }

//Override all attributes methods to be conformant with DSL approach

/**
* Returns the namespace URI of this amendable widget.
* @return The namesapce as String
*/
@Override
public String getNamespaceURI() {
return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
}

@Override
public LinkedHashMap<String, String> getAttributes() {
final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("value", getValueAttr() != null ? getValueAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
return attrs;
}

@Override
public StructureIndicator getStructureIndicator() {
    return STRUCTURE_INDICATOR;
}

/**
* DSL Style for html method
*/
@Override
public CountTypeComplexType html(String s) {
    super.html(s);
    return this;
}
}

