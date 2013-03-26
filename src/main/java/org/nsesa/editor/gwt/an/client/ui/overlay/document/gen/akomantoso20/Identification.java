package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRWork;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRExpression;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRManifestation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRItem;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Identification extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new FRBRWork())
,        new StructureIndicator.DefaultElement(1,1,new FRBRExpression())
,        new StructureIndicator.DefaultElement(1,1,new FRBRManifestation())
,        new StructureIndicator.DefaultElement(0,1,new FRBRItem())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "identification");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget identification");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Identification</code> object and set up its type
*/
public Identification() {
super(create());
setType("identification");
}

/**
* Constructor with required attributes
*/
public Identification(AnyURISimpleType sourceAttr) {
this();
setSourceAttr(sourceAttr);
}


/**
* Create a <code>Identification</code> object with the given DOM element
*/
public Identification(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;

        /**
        * Return <code>sourceAttr</code> property
        * @return sourceAttr
        */
        public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
                sourceAttr = new AnyURISimpleType();
                sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
        }
        /**
        * Return <code>sourceAttr</code> property in DSL way
        * @return sourceAttr
        */
        public AnyURISimpleType sourceAttr() {
        return  getSourceAttr();
        }
        /**
        * Set <code>sourceAttr</code> property
        * @param sourceAttr the new value
        */
        public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source",sourceAttr.getValue());
        }
        /**
        * Set <code>sourceAttr</code> property in DSL way
        * @param sourceAttr the new value
        * @return <code>Identification</code> instance
        */
        public Identification sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
        }
            /**
            * Add <code>FRBRWork</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public FRBRWork getFRBRWork() {
                FRBRWork result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRWork".equalsIgnoreCase(widget.getType())) {
            result = (FRBRWork)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>FRBRWorkElem</code> property in DSL way
            * @param FRBRWorkElem new value
            * @return <code>FRBRWork</code> instance
            */
            public FRBRWork setFRBRWork(FRBRWork FRBRWorkElem) {
                    FRBRWork result = getFRBRWork();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(FRBRWorkElem);

                return FRBRWorkElem;
            }
            /**
            * Add <code>FRBRExpression</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public FRBRExpression getFRBRExpression() {
                FRBRExpression result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRExpression".equalsIgnoreCase(widget.getType())) {
            result = (FRBRExpression)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>FRBRExpressionElem</code> property in DSL way
            * @param FRBRExpressionElem new value
            * @return <code>FRBRExpression</code> instance
            */
            public FRBRExpression setFRBRExpression(FRBRExpression FRBRExpressionElem) {
                    FRBRExpression result = getFRBRExpression();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(FRBRExpressionElem);

                return FRBRExpressionElem;
            }
            /**
            * Add <code>FRBRManifestation</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public FRBRManifestation getFRBRManifestation() {
                FRBRManifestation result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRManifestation".equalsIgnoreCase(widget.getType())) {
            result = (FRBRManifestation)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>FRBRManifestationElem</code> property in DSL way
            * @param FRBRManifestationElem new value
            * @return <code>FRBRManifestation</code> instance
            */
            public FRBRManifestation setFRBRManifestation(FRBRManifestation FRBRManifestationElem) {
                    FRBRManifestation result = getFRBRManifestation();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(FRBRManifestationElem);

                return FRBRManifestationElem;
            }
            /**
            * Add <code>FRBRItem</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public FRBRItem getFRBRItem() {
                FRBRItem result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FRBRItem".equalsIgnoreCase(widget.getType())) {
            result = (FRBRItem)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>FRBRItemElem</code> property in DSL way
            * @param FRBRItemElem new value
            * @return <code>FRBRItem</code> instance
            */
            public FRBRItem setFRBRItem(FRBRItem FRBRItemElem) {
                    FRBRItem result = getFRBRItem();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(FRBRItemElem);

                return FRBRItemElem;
            }
//Override all attributes methods to be conformant with DSL approach

/**
* Returns the namespace URI of this amendable widget.
* @return The namesapce as String
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap<String, String> getAttributes() {
final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
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
public Identification html(String s) {
    super.html(s);
    return this;
}
}

