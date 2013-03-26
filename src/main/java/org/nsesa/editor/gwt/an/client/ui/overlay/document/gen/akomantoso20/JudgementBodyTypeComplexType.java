package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Introduction;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Background;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Motivation;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Decision;
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
* the type judgementBodyType specifies a content model of the main hierarchy of a judgement document
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class JudgementBodyTypeComplexType extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Introduction())
,        new StructureIndicator.DefaultElement(1,1,new Background())
,        new StructureIndicator.DefaultElement(1,1,new Motivation())
,        new StructureIndicator.DefaultElement(1,1,new Decision())
)
)
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "judgementBodyTypeComplexType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget judgementBodyTypeComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>JudgementBodyTypeComplexType</code> object with the given DOM element
*/
public JudgementBodyTypeComplexType(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType alternativeToAttr;
    private LanguageSimpleType langAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private StatusTypeSimpleType statusAttr;
    private String wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType periodAttr;

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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType classAttr(final StringSimpleType classAttr) {
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType styleAttr(final StringSimpleType styleAttr) {
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType idAttr(final IDSimpleType idAttr) {
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
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
        * @return <code>JudgementBodyTypeComplexType</code> instance
        */
        public JudgementBodyTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }
            /**
            * Return <code>java.util.List<Introduction></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Introduction> getIntroductions() {
                java.util.List<Introduction> result = new ArrayList<Introduction>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Introduction".equalsIgnoreCase(widget.getType())) {
            result.add((Introduction)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Introduction></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Introduction> getIntroductionList() {
            return  getIntroductions();
            }
            /**
            * Add <code>java.util.List<Introduction></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Introduction addIntroduction(Introduction introductionElem) {
                this.addOverlayWidget(introductionElem);
                return introductionElem;
            }

            /**
            * Return <code>java.util.List<Background></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Background> getBackgrounds() {
                java.util.List<Background> result = new ArrayList<Background>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Background".equalsIgnoreCase(widget.getType())) {
            result.add((Background)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Background></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Background> getBackgroundList() {
            return  getBackgrounds();
            }
            /**
            * Add <code>java.util.List<Background></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Background addBackground(Background backgroundElem) {
                this.addOverlayWidget(backgroundElem);
                return backgroundElem;
            }

            /**
            * Return <code>java.util.List<Motivation></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Motivation> getMotivations() {
                java.util.List<Motivation> result = new ArrayList<Motivation>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Motivation".equalsIgnoreCase(widget.getType())) {
            result.add((Motivation)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Motivation></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Motivation> getMotivationList() {
            return  getMotivations();
            }
            /**
            * Add <code>java.util.List<Motivation></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Motivation addMotivation(Motivation motivationElem) {
                this.addOverlayWidget(motivationElem);
                return motivationElem;
            }

            /**
            * Return <code>java.util.List<Decision></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Decision> getDecisions() {
                java.util.List<Decision> result = new ArrayList<Decision>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Decision".equalsIgnoreCase(widget.getType())) {
            result.add((Decision)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Decision></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Decision> getDecisionList() {
            return  getDecisions();
            }
            /**
            * Add <code>java.util.List<Decision></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Decision addDecision(Decision decisionElem) {
                this.addOverlayWidget(decisionElem);
                return decisionElem;
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
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
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
public JudgementBodyTypeComplexType html(String s) {
    super.html(s);
    return this;
}
}

