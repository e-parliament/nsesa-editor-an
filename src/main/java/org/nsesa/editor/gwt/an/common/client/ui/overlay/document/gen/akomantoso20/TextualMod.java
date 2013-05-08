package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TextualModsSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Old;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.New;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
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
* The element textualMod is a metadata element specifying an (active or passive) textual<br/> modification for the document.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class TextualMod extends ModificationTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Old())
,        new StructureIndicator.DefaultElement(0,1,new New())
)
        ,

        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,-1,new Source())
,        new StructureIndicator.DefaultElement(1,-1,new Destination())
,        new StructureIndicator.DefaultElement(0,1,new Force())
,        new StructureIndicator.DefaultElement(0,1,new Efficacy())
,        new StructureIndicator.DefaultElement(0,1,new Application())
,        new StructureIndicator.DefaultElement(0,1,new Duration())
,        new StructureIndicator.DefaultElement(0,1,new Condition())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "textualMod");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget textualMod");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>TextualMod</code> object and set up its type
*/
public TextualMod() {
super(create());
setType("textualMod");
}

/**
* Constructor with required attributes
*/
public TextualMod(TextualModsSimpleType typeAttr,IDSimpleType idAttr) {
this();
setTypeAttr(typeAttr);
setIdAttr(idAttr);
}


/**
* Create a <code>TextualMod</code> object with the given DOM element
*/
public TextualMod(Element element) {
super(element);
}

// FIELDS ------------------
    private TextualModsSimpleType typeAttr;

        /**
        * Return <code>typeAttr</code> property
        * @return typeAttr
        */
        public TextualModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
                typeAttr = TextualModsSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
        }
        /**
        * Return <code>typeAttr</code> property in DSL way
        * @return typeAttr
        */
        public TextualModsSimpleType typeAttr() {
        return  getTypeAttr();
        }
        /**
        * Set <code>typeAttr</code> property
        * @param typeAttr the new value
        */
        public void setTypeAttr(final TextualModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
        getElement().setAttribute("type",typeAttr.value());
        }
        /**
        * Set <code>typeAttr</code> property in DSL way
        * @param typeAttr the new value
        * @return <code>TextualMod</code> instance
        */
        public TextualMod typeAttr(final TextualModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
        }
            /**
            * Add <code>Old</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Old getOld() {
                Old result = null;
                for (OverlayWidget widget : getChildOverlayWidgets()) {
                    if ("Old".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                        result = (Old)widget;
                        break;
                    }
                }
                return result;
            }
            /**
            * Set <code>oldElem</code> property in DSL way
            * @param oldElem new value
            * @return <code>Old</code> instance
            */
            public Old setOld(Old oldElem) {
                    Old result = getOld();
                // remove the child of the same type if exist
                if (result != null) {
                    this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(oldElem);

                return oldElem;
            }
            /**
            * Add <code>New</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public New getNew() {
                New result = null;
                for (OverlayWidget widget : getChildOverlayWidgets()) {
                    if ("New".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                        result = (New)widget;
                        break;
                    }
                }
                return result;
            }
            /**
            * Set <code>newElem</code> property in DSL way
            * @param newElem new value
            * @return <code>New</code> instance
            */
            public New setNew(New newElem) {
                    New result = getNew();
                // remove the child of the same type if exist
                if (result != null) {
                    this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(newElem);

                return newElem;
            }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> TextualMod</code> instance
        */
        public TextualMod statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> TextualMod</code> instance
        */
        public TextualMod wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> TextualMod</code> instance
        */
        public TextualMod refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> TextualMod</code> instance
        */
        public TextualMod idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> TextualMod</code> instance
        */
        public TextualMod evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>exclusionAttr</code> property in DSL way
        * @param exclusionAttr new value
        * @return <code> TextualMod</code> instance
        */
        public TextualMod exclusionAttr(final BooleanSimpleType exclusionAttr) {
        setExclusionAttr(exclusionAttr);
        return this;
        }
        /**
        * Set <code>incompleteAttr</code> property in DSL way
        * @param incompleteAttr new value
        * @return <code> TextualMod</code> instance
        */
        public TextualMod incompleteAttr(final BooleanSimpleType incompleteAttr) {
        setIncompleteAttr(incompleteAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> TextualMod</code> instance
        */
        public TextualMod periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }

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
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
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
public TextualMod html(String s) {
    super.html(s);
    return this;
}
}

