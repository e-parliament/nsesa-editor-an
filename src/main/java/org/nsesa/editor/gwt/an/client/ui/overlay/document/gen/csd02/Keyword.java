/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
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
* The element keyword is a metadata element specifying a keyword associated to the FRBR expression of the document. Attribute dictionary (required) specifies the thesaurus out of which the keyword has been taken. Attribute href points to the fragment of text this keyword is associated to. Keywords without href attribute refer to the content as a whole.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Keyword extends MetaoptComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "keyword");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget keyword");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Keyword</code> object and set up its type
*/
public Keyword() {
super(create());
setType("keyword");
}

/**
* Constructor with required attributes
*/
public Keyword(AnyURISimpleType dictionaryAttr,StringSimpleType showAsAttr,StringSimpleType valueAttr) {
this();
setDictionaryAttr(dictionaryAttr);
setShowAsAttr(showAsAttr);
setValueAttr(valueAttr);
}


/**
* Create a <code>Keyword</code> object with the given DOM element
*/
public Keyword(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType dictionaryAttr;
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private StringSimpleType valueAttr;
    private AnyURISimpleType hrefAttr;

        /**
        * Return <code>dictionaryAttr</code> property
        * @return dictionaryAttr
        */
        public AnyURISimpleType getDictionaryAttr() {
        if (dictionaryAttr == null) {
                dictionaryAttr = new AnyURISimpleType();
                dictionaryAttr.setValue(getElement().getAttribute("dictionary"));
        }

        return dictionaryAttr;
        }
        /**
        * Return <code>dictionaryAttr</code> property in DSL way
        * @return dictionaryAttr
        */
        public AnyURISimpleType dictionaryAttr() {
        return  getDictionaryAttr();
        }
        /**
        * Set <code>dictionaryAttr</code> property
        * @param dictionaryAttr the new value
        */
        public void setDictionaryAttr(final AnyURISimpleType dictionaryAttr) {
        this.dictionaryAttr = dictionaryAttr;
        getElement().setAttribute("dictionary",dictionaryAttr.getValue());
        }
        /**
        * Set <code>dictionaryAttr</code> property in DSL way
        * @param dictionaryAttr the new value
        * @return <code>Keyword</code> instance
        */
        public Keyword dictionaryAttr(final AnyURISimpleType dictionaryAttr) {
        setDictionaryAttr(dictionaryAttr);
        return this;
        }
        /**
        * Return <code>showAsAttr</code> property
        * @return showAsAttr
        */
        public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
                showAsAttr = new StringSimpleType();
                showAsAttr.setValue(getElement().getAttribute("showAs"));
        }

        return showAsAttr;
        }
        /**
        * Return <code>showAsAttr</code> property in DSL way
        * @return showAsAttr
        */
        public StringSimpleType showAsAttr() {
        return  getShowAsAttr();
        }
        /**
        * Set <code>showAsAttr</code> property
        * @param showAsAttr the new value
        */
        public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
        getElement().setAttribute("showAs",showAsAttr.getValue());
        }
        /**
        * Set <code>showAsAttr</code> property in DSL way
        * @param showAsAttr the new value
        * @return <code>Keyword</code> instance
        */
        public Keyword showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
        }
        /**
        * Return <code>shortFormAttr</code> property
        * @return shortFormAttr
        */
        public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
                shortFormAttr = new StringSimpleType();
                shortFormAttr.setValue(getElement().getAttribute("shortForm"));
        }

        return shortFormAttr;
        }
        /**
        * Return <code>shortFormAttr</code> property in DSL way
        * @return shortFormAttr
        */
        public StringSimpleType shortFormAttr() {
        return  getShortFormAttr();
        }
        /**
        * Set <code>shortFormAttr</code> property
        * @param shortFormAttr the new value
        */
        public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
        getElement().setAttribute("shortForm",shortFormAttr.getValue());
        }
        /**
        * Set <code>shortFormAttr</code> property in DSL way
        * @param shortFormAttr the new value
        * @return <code>Keyword</code> instance
        */
        public Keyword shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
        }
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
        * @return <code>Keyword</code> instance
        */
        public Keyword valueAttr(final StringSimpleType valueAttr) {
        setValueAttr(valueAttr);
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
        * @return <code>Keyword</code> instance
        */
        public Keyword hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Keyword</code> instance
        */
        public Keyword idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Keyword</code> instance
        */
        public Keyword evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Keyword</code> instance
        */
        public Keyword wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }

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
        attrs.put("dictionary", getDictionaryAttr() != null ? getDictionaryAttr().getValue() : null);
        attrs.put("showAs", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortForm", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        attrs.put("value", getValueAttr() != null ? getValueAttr().getValue() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
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
public Keyword html(String s) {
    super.html(s);
    return this;
}
}

