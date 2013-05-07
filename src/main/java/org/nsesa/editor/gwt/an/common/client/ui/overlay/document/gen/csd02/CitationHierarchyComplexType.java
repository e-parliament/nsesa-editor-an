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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Intro;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Wrap;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NCNameSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ComponentRef;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Citation;
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

public class CitationHierarchyComplexType extends BasehierarchyComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Intro())
,        new StructureIndicator.DefaultChoice(1,-1,        new StructureIndicator.DefaultElement(1,1,new ComponentRef())
,        new StructureIndicator.DefaultElement(1,1,new Citation())
)
,        new StructureIndicator.DefaultElement(0,1,new Wrap())
)
        ,

        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Num())
,        new StructureIndicator.DefaultElement(0,1,new Heading())
,        new StructureIndicator.DefaultElement(0,1,new Subheading())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "citationHierarchyComplexType");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget citationHierarchyComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>CitationHierarchyComplexType</code> object with the given DOM element
*/
public CitationHierarchyComplexType(Element element) {
super(element);
}

// FIELDS ------------------
    private StatusTypeSimpleType statusAttr;
    private AnyURISimpleType refersToAttr;
    private String wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType alternativeToAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private LanguageSimpleType langAttr;
    private NCNameSimpleType spaceAttr;
    private AnyURISimpleType periodAttr;

            /**
            * Add <code>Intro</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Intro getIntro() {
                Intro result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Intro".equalsIgnoreCase(widget.getType())) {
            result = (Intro)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>introElem</code> property in DSL way
            * @param introElem new value
            * @return <code>Intro</code> instance
            */
            public Intro setIntro(Intro introElem) {
                    Intro result = getIntro();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(introElem);

                return introElem;
            }
            /**
            * Add <code>Wrap</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Wrap getWrap() {
                Wrap result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Wrap".equalsIgnoreCase(widget.getType())) {
            result = (Wrap)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>wrapElem</code> property in DSL way
            * @param wrapElem new value
            * @return <code>Wrap</code> instance
            */
            public Wrap setWrap(Wrap wrapElem) {
                    Wrap result = getWrap();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(wrapElem);

                return wrapElem;
            }
        /**
        * Return <code>statusAttr</code> property
        * @return statusAttr
        */
        public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
                statusAttr = StatusTypeSimpleType.fromString(getElement().getAttribute("status"));
        }

        return statusAttr;
        }
        /**
        * Return <code>statusAttr</code> property in DSL way
        * @return statusAttr
        */
        public StatusTypeSimpleType statusAttr() {
        return  getStatusAttr();
        }
        /**
        * Set <code>statusAttr</code> property
        * @param statusAttr the new value
        */
        public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
        getElement().setAttribute("status",statusAttr.value());
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr the new value
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType idAttr(final IDSimpleType idAttr) {
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
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Return <code>alternativeToAttr</code> property
        * @return alternativeToAttr
        */
        public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
                alternativeToAttr = new AnyURISimpleType();
                alternativeToAttr.setValue(getElement().getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
        }
        /**
        * Return <code>alternativeToAttr</code> property in DSL way
        * @return alternativeToAttr
        */
        public AnyURISimpleType alternativeToAttr() {
        return  getAlternativeToAttr();
        }
        /**
        * Set <code>alternativeToAttr</code> property
        * @param alternativeToAttr the new value
        */
        public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
        getElement().setAttribute("alternativeTo",alternativeToAttr.getValue());
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr the new value
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Return <code>classAttr</code> property
        * @return classAttr
        */
        public StringSimpleType getClassAttr() {
        if (classAttr == null) {
                classAttr = new StringSimpleType();
                classAttr.setValue(getElement().getAttribute("class"));
        }

        return classAttr;
        }
        /**
        * Return <code>classAttr</code> property in DSL way
        * @return classAttr
        */
        public StringSimpleType classAttr() {
        return  getClassAttr();
        }
        /**
        * Set <code>classAttr</code> property
        * @param classAttr the new value
        */
        public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
        getElement().setAttribute("class",classAttr.getValue());
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr the new value
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Return <code>styleAttr</code> property
        * @return styleAttr
        */
        public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
                styleAttr = new StringSimpleType();
                styleAttr.setValue(getElement().getAttribute("style"));
        }

        return styleAttr;
        }
        /**
        * Return <code>styleAttr</code> property in DSL way
        * @return styleAttr
        */
        public StringSimpleType styleAttr() {
        return  getStyleAttr();
        }
        /**
        * Set <code>styleAttr</code> property
        * @param styleAttr the new value
        */
        public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
        getElement().setAttribute("style",styleAttr.getValue());
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr the new value
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Return <code>titleAttr</code> property
        * @return titleAttr
        */
        public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
                titleAttr = new StringSimpleType();
                titleAttr.setValue(getElement().getAttribute("title"));
        }

        return titleAttr;
        }
        /**
        * Return <code>titleAttr</code> property in DSL way
        * @return titleAttr
        */
        public StringSimpleType titleAttr() {
        return  getTitleAttr();
        }
        /**
        * Set <code>titleAttr</code> property
        * @param titleAttr the new value
        */
        public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
        getElement().setAttribute("title",titleAttr.getValue());
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr the new value
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Return <code>langAttr</code> property
        * @return langAttr
        */
        public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
                langAttr = new LanguageSimpleType();
                langAttr.setValue(getElement().getAttribute("lang"));
        }

        return langAttr;
        }
        /**
        * Return <code>langAttr</code> property in DSL way
        * @return langAttr
        */
        public LanguageSimpleType langAttr() {
        return  getLangAttr();
        }
        /**
        * Set <code>langAttr</code> property
        * @param langAttr the new value
        */
        public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
        getElement().setAttribute("lang",langAttr.getValue());
        }
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr the new value
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Return <code>spaceAttr</code> property
        * @return spaceAttr
        */
        public NCNameSimpleType getSpaceAttr() {
        if (spaceAttr == null) {
                spaceAttr = new NCNameSimpleType();
                spaceAttr.setValue(getElement().getAttribute("space"));
        }

        return spaceAttr;
        }
        /**
        * Return <code>spaceAttr</code> property in DSL way
        * @return spaceAttr
        */
        public NCNameSimpleType spaceAttr() {
        return  getSpaceAttr();
        }
        /**
        * Set <code>spaceAttr</code> property
        * @param spaceAttr the new value
        */
        public void setSpaceAttr(final NCNameSimpleType spaceAttr) {
        this.spaceAttr = spaceAttr;
        getElement().setAttribute("space",spaceAttr.getValue());
        }
        /**
        * Set <code>spaceAttr</code> property in DSL way
        * @param spaceAttr the new value
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
        }
            /**
            * Return <code>java.util.List<ComponentRef></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<ComponentRef> getComponentRefs() {
                java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType())) {
            result.add((ComponentRef)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<ComponentRef></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<ComponentRef> getComponentRefList() {
            return  getComponentRefs();
            }
            /**
            * Add <code>java.util.List<ComponentRef></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public ComponentRef addComponentRef(ComponentRef componentRefElem) {
                this.addOverlayWidget(componentRefElem);
                return componentRefElem;
            }

            /**
            * Return <code>java.util.List<Citation></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Citation> getCitations() {
                java.util.List<Citation> result = new ArrayList<Citation>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Citation".equalsIgnoreCase(widget.getType())) {
            result.add((Citation)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Citation></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Citation> getCitationList() {
            return  getCitations();
            }
            /**
            * Add <code>java.util.List<Citation></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Citation addCitation(Citation citationElem) {
                this.addOverlayWidget(citationElem);
                return citationElem;
            }

        /**
        * Return <code>periodAttr</code> property
        * @return periodAttr
        */
        public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
                periodAttr = new AnyURISimpleType();
                periodAttr.setValue(getElement().getAttribute("period"));
        }

        return periodAttr;
        }
        /**
        * Return <code>periodAttr</code> property in DSL way
        * @return periodAttr
        */
        public AnyURISimpleType periodAttr() {
        return  getPeriodAttr();
        }
        /**
        * Set <code>periodAttr</code> property
        * @param periodAttr the new value
        */
        public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
        getElement().setAttribute("period",periodAttr.getValue());
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr the new value
        * @return <code>CitationHierarchyComplexType</code> instance
        */
        public CitationHierarchyComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
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
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("space", getSpaceAttr() != null ? getSpaceAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
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
public CitationHierarchyComplexType html(String s) {
    super.html(s);
    return this;
}
}

