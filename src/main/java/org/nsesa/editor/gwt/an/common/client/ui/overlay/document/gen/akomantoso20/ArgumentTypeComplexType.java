/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.PosTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
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
* the complex type argumentType defines the empty content model and the list of attributes for metadata elements in the analysis section
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class ArgumentTypeComplexType extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "argumentTypeComplexType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget argumentTypeComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>ArgumentTypeComplexType</code> object with the given DOM element
*/
public ArgumentTypeComplexType(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType upToAttr;
    private PosTypeSimpleType posAttr;
    private AnyURISimpleType hrefAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private String wildcardContentAttr;

        /**
        * Return <code>upToAttr</code> property
        * @return upToAttr
        */
        public AnyURISimpleType getUpToAttr() {
        if (upToAttr == null) {
                upToAttr = new AnyURISimpleType();
                upToAttr.setValue(getElement().getAttribute("upTo"));
        }

        return upToAttr;
        }
        /**
        * Return <code>upToAttr</code> property in DSL way
        * @return upToAttr
        */
        public AnyURISimpleType upToAttr() {
        return  getUpToAttr();
        }
        /**
        * Set <code>upToAttr</code> property
        * @param upToAttr the new value
        */
        public void setUpToAttr(final AnyURISimpleType upToAttr) {
        this.upToAttr = upToAttr;
        getElement().setAttribute("upTo",upToAttr.getValue());
        }
        /**
        * Set <code>upToAttr</code> property in DSL way
        * @param upToAttr the new value
        * @return <code>ArgumentTypeComplexType</code> instance
        */
        public ArgumentTypeComplexType upToAttr(final AnyURISimpleType upToAttr) {
        setUpToAttr(upToAttr);
        return this;
        }
        /**
        * Return <code>posAttr</code> property
        * @return posAttr
        */
        public PosTypeSimpleType getPosAttr() {
        if (posAttr == null) {
                posAttr = PosTypeSimpleType.fromString(getElement().getAttribute("pos"));
        }

        return posAttr;
        }
        /**
        * Return <code>posAttr</code> property in DSL way
        * @return posAttr
        */
        public PosTypeSimpleType posAttr() {
        return  getPosAttr();
        }
        /**
        * Set <code>posAttr</code> property
        * @param posAttr the new value
        */
        public void setPosAttr(final PosTypeSimpleType posAttr) {
        this.posAttr = posAttr;
        getElement().setAttribute("pos",posAttr.value());
        }
        /**
        * Set <code>posAttr</code> property in DSL way
        * @param posAttr the new value
        * @return <code>ArgumentTypeComplexType</code> instance
        */
        public ArgumentTypeComplexType posAttr(final PosTypeSimpleType posAttr) {
        setPosAttr(posAttr);
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
        * @return <code>ArgumentTypeComplexType</code> instance
        */
        public ArgumentTypeComplexType hrefAttr(final AnyURISimpleType hrefAttr) {
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
        * @return <code>ArgumentTypeComplexType</code> instance
        */
        public ArgumentTypeComplexType idAttr(final IDSimpleType idAttr) {
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
        * @return <code>ArgumentTypeComplexType</code> instance
        */
        public ArgumentTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
        * @return <code>ArgumentTypeComplexType</code> instance
        */
        public ArgumentTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
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
        attrs.put("upTo", getUpToAttr() != null ? getUpToAttr().getValue() : null);
        attrs.put("pos", getPosAttr() != null ? getPosAttr().value() : null);
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
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
public ArgumentTypeComplexType html(String s) {
    super.html(s);
    return this;
}
}

