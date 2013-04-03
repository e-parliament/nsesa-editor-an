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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Recital;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Citation;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NCNameSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Container;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Hcontainer;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.SpeechGroup;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Speech;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Question;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Answer;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Other;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Scene;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Narrative;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Summary;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.AdministrationOfOath;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.RollCall;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Prayers;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.OralStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.WrittenStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.PersonalStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.MinisterialStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Resolutions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.NationalInterest;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.DeclarationOfVote;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Communication;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Petitions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Papers;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.NoticesOfMotion;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Questions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Address;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ProceduralMotions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.PointOfOrder;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Adjournment;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.DebateSection;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Div;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Clause;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Section;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Part;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Paragraph;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Chapter;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Title;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Article;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Book;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Tome;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Division;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.List;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Point;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Indent;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Alinea;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Subsection;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Subpart;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Subparagraph;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Subchapter;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Subtitle;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Subclause;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Sublist;
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
* the type fragmentBodyType specifies a content model of a container of a fragment of another document
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class FragmentBodyTypeComplexType extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new AdministrationOfOath())
,        new StructureIndicator.DefaultElement(1,1,new RollCall())
,        new StructureIndicator.DefaultElement(1,1,new Prayers())
,        new StructureIndicator.DefaultElement(1,1,new OralStatements())
,        new StructureIndicator.DefaultElement(1,1,new WrittenStatements())
,        new StructureIndicator.DefaultElement(1,1,new PersonalStatements())
,        new StructureIndicator.DefaultElement(1,1,new MinisterialStatements())
,        new StructureIndicator.DefaultElement(1,1,new Resolutions())
,        new StructureIndicator.DefaultElement(1,1,new NationalInterest())
,        new StructureIndicator.DefaultElement(1,1,new DeclarationOfVote())
,        new StructureIndicator.DefaultElement(1,1,new Communication())
,        new StructureIndicator.DefaultElement(1,1,new Petitions())
,        new StructureIndicator.DefaultElement(1,1,new Papers())
,        new StructureIndicator.DefaultElement(1,1,new NoticesOfMotion())
,        new StructureIndicator.DefaultElement(1,1,new Questions())
,        new StructureIndicator.DefaultElement(1,1,new Address())
,        new StructureIndicator.DefaultElement(1,1,new ProceduralMotions())
,        new StructureIndicator.DefaultElement(1,1,new PointOfOrder())
,        new StructureIndicator.DefaultElement(1,1,new Adjournment())
,        new StructureIndicator.DefaultElement(1,1,new DebateSection())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new Div())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Container())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Clause())
,        new StructureIndicator.DefaultElement(1,1,new Section())
,        new StructureIndicator.DefaultElement(1,1,new Part())
,        new StructureIndicator.DefaultElement(1,1,new Paragraph())
,        new StructureIndicator.DefaultElement(1,1,new Chapter())
,        new StructureIndicator.DefaultElement(1,1,new Title())
,        new StructureIndicator.DefaultElement(1,1,new Article())
,        new StructureIndicator.DefaultElement(1,1,new Book())
,        new StructureIndicator.DefaultElement(1,1,new Tome())
,        new StructureIndicator.DefaultElement(1,1,new Division())
,        new StructureIndicator.DefaultElement(1,1,new List())
,        new StructureIndicator.DefaultElement(1,1,new Point())
,        new StructureIndicator.DefaultElement(1,1,new Indent())
,        new StructureIndicator.DefaultElement(1,1,new Alinea())
,        new StructureIndicator.DefaultElement(1,1,new Subsection())
,        new StructureIndicator.DefaultElement(1,1,new Subpart())
,        new StructureIndicator.DefaultElement(1,1,new Subparagraph())
,        new StructureIndicator.DefaultElement(1,1,new Subchapter())
,        new StructureIndicator.DefaultElement(1,1,new Subtitle())
,        new StructureIndicator.DefaultElement(1,1,new Subclause())
,        new StructureIndicator.DefaultElement(1,1,new Sublist())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Hcontainer())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new SpeechGroup())
,        new StructureIndicator.DefaultElement(1,1,new Speech())
,        new StructureIndicator.DefaultElement(1,1,new Question())
,        new StructureIndicator.DefaultElement(1,1,new Answer())
,        new StructureIndicator.DefaultElement(1,1,new Other())
,        new StructureIndicator.DefaultElement(1,1,new Scene())
,        new StructureIndicator.DefaultElement(1,1,new Narrative())
,        new StructureIndicator.DefaultElement(1,1,new Summary())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Recital())
,        new StructureIndicator.DefaultElement(1,1,new Citation())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "fragmentBodyTypeComplexType");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget fragmentBodyTypeComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>FragmentBodyTypeComplexType</code> object with the given DOM element
*/
public FragmentBodyTypeComplexType(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType alternativeToAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private String wildcardContentAttr;
    private LanguageSimpleType langAttr;
    private NCNameSimpleType spaceAttr;
    private StatusTypeSimpleType statusAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType periodAttr;

            /**
            * Add <code>Recital</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Recital getRecital() {
                Recital result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Recital".equalsIgnoreCase(widget.getType())) {
            result = (Recital)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>recitalElem</code> property in DSL way
            * @param recitalElem new value
            * @return <code>Recital</code> instance
            */
            public Recital setRecital(Recital recitalElem) {
                    Recital result = getRecital();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(recitalElem);

                return recitalElem;
            }
            /**
            * Add <code>Citation</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Citation getCitation() {
                Citation result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Citation".equalsIgnoreCase(widget.getType())) {
            result = (Citation)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>citationElem</code> property in DSL way
            * @param citationElem new value
            * @return <code>Citation</code> instance
            */
            public Citation setCitation(Citation citationElem) {
                    Citation result = getCitation();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(citationElem);

                return citationElem;
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType classAttr(final StringSimpleType classAttr) {
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType styleAttr(final StringSimpleType styleAttr) {
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType langAttr(final LanguageSimpleType langAttr) {
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType idAttr(final IDSimpleType idAttr) {
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
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
        * @return <code>FragmentBodyTypeComplexType</code> instance
        */
        public FragmentBodyTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }
            /**
            * Add <code>Container</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Container getContainer() {
                Container result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType())) {
            result = (Container)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>containerElem</code> property in DSL way
            * @param containerElem new value
            * @return <code>Container</code> instance
            */
            public Container setContainer(Container containerElem) {
                    Container result = getContainer();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(containerElem);

                return containerElem;
            }
            /**
            * Add <code>Hcontainer</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Hcontainer getHcontainer() {
                Hcontainer result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Hcontainer".equalsIgnoreCase(widget.getType())) {
            result = (Hcontainer)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>hcontainerElem</code> property in DSL way
            * @param hcontainerElem new value
            * @return <code>Hcontainer</code> instance
            */
            public Hcontainer setHcontainer(Hcontainer hcontainerElem) {
                    Hcontainer result = getHcontainer();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(hcontainerElem);

                return hcontainerElem;
            }
            /**
            * Add <code>SpeechGroup</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public SpeechGroup getSpeechGroup() {
                SpeechGroup result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("SpeechGroup".equalsIgnoreCase(widget.getType())) {
            result = (SpeechGroup)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>speechGroupElem</code> property in DSL way
            * @param speechGroupElem new value
            * @return <code>SpeechGroup</code> instance
            */
            public SpeechGroup setSpeechGroup(SpeechGroup speechGroupElem) {
                    SpeechGroup result = getSpeechGroup();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(speechGroupElem);

                return speechGroupElem;
            }
            /**
            * Add <code>Speech</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Speech getSpeech() {
                Speech result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Speech".equalsIgnoreCase(widget.getType())) {
            result = (Speech)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>speechElem</code> property in DSL way
            * @param speechElem new value
            * @return <code>Speech</code> instance
            */
            public Speech setSpeech(Speech speechElem) {
                    Speech result = getSpeech();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(speechElem);

                return speechElem;
            }
            /**
            * Add <code>Question</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Question getQuestion() {
                Question result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Question".equalsIgnoreCase(widget.getType())) {
            result = (Question)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>questionElem</code> property in DSL way
            * @param questionElem new value
            * @return <code>Question</code> instance
            */
            public Question setQuestion(Question questionElem) {
                    Question result = getQuestion();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(questionElem);

                return questionElem;
            }
            /**
            * Add <code>Answer</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Answer getAnswer() {
                Answer result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Answer".equalsIgnoreCase(widget.getType())) {
            result = (Answer)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>answerElem</code> property in DSL way
            * @param answerElem new value
            * @return <code>Answer</code> instance
            */
            public Answer setAnswer(Answer answerElem) {
                    Answer result = getAnswer();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(answerElem);

                return answerElem;
            }
            /**
            * Add <code>Other</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Other getOther() {
                Other result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Other".equalsIgnoreCase(widget.getType())) {
            result = (Other)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>otherElem</code> property in DSL way
            * @param otherElem new value
            * @return <code>Other</code> instance
            */
            public Other setOther(Other otherElem) {
                    Other result = getOther();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(otherElem);

                return otherElem;
            }
            /**
            * Add <code>Scene</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Scene getScene() {
                Scene result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Scene".equalsIgnoreCase(widget.getType())) {
            result = (Scene)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>sceneElem</code> property in DSL way
            * @param sceneElem new value
            * @return <code>Scene</code> instance
            */
            public Scene setScene(Scene sceneElem) {
                    Scene result = getScene();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(sceneElem);

                return sceneElem;
            }
            /**
            * Add <code>Narrative</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Narrative getNarrative() {
                Narrative result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Narrative".equalsIgnoreCase(widget.getType())) {
            result = (Narrative)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>narrativeElem</code> property in DSL way
            * @param narrativeElem new value
            * @return <code>Narrative</code> instance
            */
            public Narrative setNarrative(Narrative narrativeElem) {
                    Narrative result = getNarrative();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(narrativeElem);

                return narrativeElem;
            }
            /**
            * Add <code>Summary</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Summary getSummary() {
                Summary result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Summary".equalsIgnoreCase(widget.getType())) {
            result = (Summary)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>summaryElem</code> property in DSL way
            * @param summaryElem new value
            * @return <code>Summary</code> instance
            */
            public Summary setSummary(Summary summaryElem) {
                    Summary result = getSummary();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(summaryElem);

                return summaryElem;
            }
            /**
            * Add <code>AdministrationOfOath</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public AdministrationOfOath getAdministrationOfOath() {
                AdministrationOfOath result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType())) {
            result = (AdministrationOfOath)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>administrationOfOathElem</code> property in DSL way
            * @param administrationOfOathElem new value
            * @return <code>AdministrationOfOath</code> instance
            */
            public AdministrationOfOath setAdministrationOfOath(AdministrationOfOath administrationOfOathElem) {
                    AdministrationOfOath result = getAdministrationOfOath();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(administrationOfOathElem);

                return administrationOfOathElem;
            }
            /**
            * Add <code>RollCall</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public RollCall getRollCall() {
                RollCall result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
            result = (RollCall)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>rollCallElem</code> property in DSL way
            * @param rollCallElem new value
            * @return <code>RollCall</code> instance
            */
            public RollCall setRollCall(RollCall rollCallElem) {
                    RollCall result = getRollCall();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(rollCallElem);

                return rollCallElem;
            }
            /**
            * Add <code>Prayers</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Prayers getPrayers() {
                Prayers result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType())) {
            result = (Prayers)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>prayersElem</code> property in DSL way
            * @param prayersElem new value
            * @return <code>Prayers</code> instance
            */
            public Prayers setPrayers(Prayers prayersElem) {
                    Prayers result = getPrayers();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(prayersElem);

                return prayersElem;
            }
            /**
            * Add <code>OralStatements</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public OralStatements getOralStatements() {
                OralStatements result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
            result = (OralStatements)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>oralStatementsElem</code> property in DSL way
            * @param oralStatementsElem new value
            * @return <code>OralStatements</code> instance
            */
            public OralStatements setOralStatements(OralStatements oralStatementsElem) {
                    OralStatements result = getOralStatements();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(oralStatementsElem);

                return oralStatementsElem;
            }
            /**
            * Add <code>WrittenStatements</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public WrittenStatements getWrittenStatements() {
                WrittenStatements result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType())) {
            result = (WrittenStatements)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>writtenStatementsElem</code> property in DSL way
            * @param writtenStatementsElem new value
            * @return <code>WrittenStatements</code> instance
            */
            public WrittenStatements setWrittenStatements(WrittenStatements writtenStatementsElem) {
                    WrittenStatements result = getWrittenStatements();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(writtenStatementsElem);

                return writtenStatementsElem;
            }
            /**
            * Add <code>PersonalStatements</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public PersonalStatements getPersonalStatements() {
                PersonalStatements result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
            result = (PersonalStatements)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>personalStatementsElem</code> property in DSL way
            * @param personalStatementsElem new value
            * @return <code>PersonalStatements</code> instance
            */
            public PersonalStatements setPersonalStatements(PersonalStatements personalStatementsElem) {
                    PersonalStatements result = getPersonalStatements();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(personalStatementsElem);

                return personalStatementsElem;
            }
            /**
            * Add <code>MinisterialStatements</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public MinisterialStatements getMinisterialStatements() {
                MinisterialStatements result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType())) {
            result = (MinisterialStatements)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>ministerialStatementsElem</code> property in DSL way
            * @param ministerialStatementsElem new value
            * @return <code>MinisterialStatements</code> instance
            */
            public MinisterialStatements setMinisterialStatements(MinisterialStatements ministerialStatementsElem) {
                    MinisterialStatements result = getMinisterialStatements();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(ministerialStatementsElem);

                return ministerialStatementsElem;
            }
            /**
            * Add <code>Resolutions</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Resolutions getResolutions() {
                Resolutions result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
            result = (Resolutions)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>resolutionsElem</code> property in DSL way
            * @param resolutionsElem new value
            * @return <code>Resolutions</code> instance
            */
            public Resolutions setResolutions(Resolutions resolutionsElem) {
                    Resolutions result = getResolutions();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(resolutionsElem);

                return resolutionsElem;
            }
            /**
            * Add <code>NationalInterest</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public NationalInterest getNationalInterest() {
                NationalInterest result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType())) {
            result = (NationalInterest)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>nationalInterestElem</code> property in DSL way
            * @param nationalInterestElem new value
            * @return <code>NationalInterest</code> instance
            */
            public NationalInterest setNationalInterest(NationalInterest nationalInterestElem) {
                    NationalInterest result = getNationalInterest();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(nationalInterestElem);

                return nationalInterestElem;
            }
            /**
            * Add <code>DeclarationOfVote</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public DeclarationOfVote getDeclarationOfVote() {
                DeclarationOfVote result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
            result = (DeclarationOfVote)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>declarationOfVoteElem</code> property in DSL way
            * @param declarationOfVoteElem new value
            * @return <code>DeclarationOfVote</code> instance
            */
            public DeclarationOfVote setDeclarationOfVote(DeclarationOfVote declarationOfVoteElem) {
                    DeclarationOfVote result = getDeclarationOfVote();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(declarationOfVoteElem);

                return declarationOfVoteElem;
            }
            /**
            * Add <code>Communication</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Communication getCommunication() {
                Communication result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType())) {
            result = (Communication)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>communicationElem</code> property in DSL way
            * @param communicationElem new value
            * @return <code>Communication</code> instance
            */
            public Communication setCommunication(Communication communicationElem) {
                    Communication result = getCommunication();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(communicationElem);

                return communicationElem;
            }
            /**
            * Add <code>Petitions</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Petitions getPetitions() {
                Petitions result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
            result = (Petitions)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>petitionsElem</code> property in DSL way
            * @param petitionsElem new value
            * @return <code>Petitions</code> instance
            */
            public Petitions setPetitions(Petitions petitionsElem) {
                    Petitions result = getPetitions();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(petitionsElem);

                return petitionsElem;
            }
            /**
            * Add <code>Papers</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Papers getPapers() {
                Papers result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType())) {
            result = (Papers)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>papersElem</code> property in DSL way
            * @param papersElem new value
            * @return <code>Papers</code> instance
            */
            public Papers setPapers(Papers papersElem) {
                    Papers result = getPapers();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(papersElem);

                return papersElem;
            }
            /**
            * Add <code>NoticesOfMotion</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public NoticesOfMotion getNoticesOfMotion() {
                NoticesOfMotion result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
            result = (NoticesOfMotion)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>noticesOfMotionElem</code> property in DSL way
            * @param noticesOfMotionElem new value
            * @return <code>NoticesOfMotion</code> instance
            */
            public NoticesOfMotion setNoticesOfMotion(NoticesOfMotion noticesOfMotionElem) {
                    NoticesOfMotion result = getNoticesOfMotion();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(noticesOfMotionElem);

                return noticesOfMotionElem;
            }
            /**
            * Add <code>Questions</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Questions getQuestions() {
                Questions result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType())) {
            result = (Questions)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>questionsElem</code> property in DSL way
            * @param questionsElem new value
            * @return <code>Questions</code> instance
            */
            public Questions setQuestions(Questions questionsElem) {
                    Questions result = getQuestions();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(questionsElem);

                return questionsElem;
            }
            /**
            * Add <code>Address</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Address getAddress() {
                Address result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
            result = (Address)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>addressElem</code> property in DSL way
            * @param addressElem new value
            * @return <code>Address</code> instance
            */
            public Address setAddress(Address addressElem) {
                    Address result = getAddress();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(addressElem);

                return addressElem;
            }
            /**
            * Add <code>ProceduralMotions</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public ProceduralMotions getProceduralMotions() {
                ProceduralMotions result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType())) {
            result = (ProceduralMotions)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>proceduralMotionsElem</code> property in DSL way
            * @param proceduralMotionsElem new value
            * @return <code>ProceduralMotions</code> instance
            */
            public ProceduralMotions setProceduralMotions(ProceduralMotions proceduralMotionsElem) {
                    ProceduralMotions result = getProceduralMotions();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(proceduralMotionsElem);

                return proceduralMotionsElem;
            }
            /**
            * Add <code>PointOfOrder</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public PointOfOrder getPointOfOrder() {
                PointOfOrder result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
            result = (PointOfOrder)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>pointOfOrderElem</code> property in DSL way
            * @param pointOfOrderElem new value
            * @return <code>PointOfOrder</code> instance
            */
            public PointOfOrder setPointOfOrder(PointOfOrder pointOfOrderElem) {
                    PointOfOrder result = getPointOfOrder();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(pointOfOrderElem);

                return pointOfOrderElem;
            }
            /**
            * Add <code>Adjournment</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Adjournment getAdjournment() {
                Adjournment result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType())) {
            result = (Adjournment)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>adjournmentElem</code> property in DSL way
            * @param adjournmentElem new value
            * @return <code>Adjournment</code> instance
            */
            public Adjournment setAdjournment(Adjournment adjournmentElem) {
                    Adjournment result = getAdjournment();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(adjournmentElem);

                return adjournmentElem;
            }
            /**
            * Add <code>DebateSection</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public DebateSection getDebateSection() {
                DebateSection result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
            result = (DebateSection)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>debateSectionElem</code> property in DSL way
            * @param debateSectionElem new value
            * @return <code>DebateSection</code> instance
            */
            public DebateSection setDebateSection(DebateSection debateSectionElem) {
                    DebateSection result = getDebateSection();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(debateSectionElem);

                return debateSectionElem;
            }
            /**
            * Add <code>Div</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Div getDiv() {
                Div result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Div".equalsIgnoreCase(widget.getType())) {
            result = (Div)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>divElem</code> property in DSL way
            * @param divElem new value
            * @return <code>Div</code> instance
            */
            public Div setDiv(Div divElem) {
                    Div result = getDiv();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(divElem);

                return divElem;
            }
            /**
            * Add <code>Clause</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Clause getClause() {
                Clause result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Clause".equalsIgnoreCase(widget.getType())) {
            result = (Clause)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>clauseElem</code> property in DSL way
            * @param clauseElem new value
            * @return <code>Clause</code> instance
            */
            public Clause setClause(Clause clauseElem) {
                    Clause result = getClause();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(clauseElem);

                return clauseElem;
            }
            /**
            * Add <code>Section</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Section getSection() {
                Section result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Section".equalsIgnoreCase(widget.getType())) {
            result = (Section)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>sectionElem</code> property in DSL way
            * @param sectionElem new value
            * @return <code>Section</code> instance
            */
            public Section setSection(Section sectionElem) {
                    Section result = getSection();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(sectionElem);

                return sectionElem;
            }
            /**
            * Add <code>Part</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Part getPart() {
                Part result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Part".equalsIgnoreCase(widget.getType())) {
            result = (Part)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>partElem</code> property in DSL way
            * @param partElem new value
            * @return <code>Part</code> instance
            */
            public Part setPart(Part partElem) {
                    Part result = getPart();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(partElem);

                return partElem;
            }
            /**
            * Add <code>Paragraph</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Paragraph getParagraph() {
                Paragraph result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Paragraph".equalsIgnoreCase(widget.getType())) {
            result = (Paragraph)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>paragraphElem</code> property in DSL way
            * @param paragraphElem new value
            * @return <code>Paragraph</code> instance
            */
            public Paragraph setParagraph(Paragraph paragraphElem) {
                    Paragraph result = getParagraph();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(paragraphElem);

                return paragraphElem;
            }
            /**
            * Add <code>Chapter</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Chapter getChapter() {
                Chapter result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Chapter".equalsIgnoreCase(widget.getType())) {
            result = (Chapter)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>chapterElem</code> property in DSL way
            * @param chapterElem new value
            * @return <code>Chapter</code> instance
            */
            public Chapter setChapter(Chapter chapterElem) {
                    Chapter result = getChapter();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(chapterElem);

                return chapterElem;
            }
            /**
            * Add <code>Title</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Title getTitle_() {
                Title result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Title".equalsIgnoreCase(widget.getType())) {
            result = (Title)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>title_Elem</code> property in DSL way
            * @param title_Elem new value
            * @return <code>Title</code> instance
            */
            public Title setTitle_(Title title_Elem) {
                    Title result = getTitle_();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(title_Elem);

                return title_Elem;
            }
            /**
            * Add <code>Article</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Article getArticle() {
                Article result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Article".equalsIgnoreCase(widget.getType())) {
            result = (Article)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>articleElem</code> property in DSL way
            * @param articleElem new value
            * @return <code>Article</code> instance
            */
            public Article setArticle(Article articleElem) {
                    Article result = getArticle();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(articleElem);

                return articleElem;
            }
            /**
            * Add <code>Book</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Book getBook() {
                Book result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Book".equalsIgnoreCase(widget.getType())) {
            result = (Book)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>bookElem</code> property in DSL way
            * @param bookElem new value
            * @return <code>Book</code> instance
            */
            public Book setBook(Book bookElem) {
                    Book result = getBook();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(bookElem);

                return bookElem;
            }
            /**
            * Add <code>Tome</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Tome getTome() {
                Tome result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Tome".equalsIgnoreCase(widget.getType())) {
            result = (Tome)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>tomeElem</code> property in DSL way
            * @param tomeElem new value
            * @return <code>Tome</code> instance
            */
            public Tome setTome(Tome tomeElem) {
                    Tome result = getTome();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(tomeElem);

                return tomeElem;
            }
            /**
            * Add <code>Division</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Division getDivision() {
                Division result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Division".equalsIgnoreCase(widget.getType())) {
            result = (Division)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>divisionElem</code> property in DSL way
            * @param divisionElem new value
            * @return <code>Division</code> instance
            */
            public Division setDivision(Division divisionElem) {
                    Division result = getDivision();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(divisionElem);

                return divisionElem;
            }
            /**
            * Add <code>List</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public List getList() {
                List result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("List".equalsIgnoreCase(widget.getType())) {
            result = (List)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>listElem</code> property in DSL way
            * @param listElem new value
            * @return <code>List</code> instance
            */
            public List setList(List listElem) {
                    List result = getList();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(listElem);

                return listElem;
            }
            /**
            * Add <code>Point</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Point getPoint() {
                Point result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Point".equalsIgnoreCase(widget.getType())) {
            result = (Point)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>pointElem</code> property in DSL way
            * @param pointElem new value
            * @return <code>Point</code> instance
            */
            public Point setPoint(Point pointElem) {
                    Point result = getPoint();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(pointElem);

                return pointElem;
            }
            /**
            * Add <code>Indent</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Indent getIndent() {
                Indent result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Indent".equalsIgnoreCase(widget.getType())) {
            result = (Indent)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>indentElem</code> property in DSL way
            * @param indentElem new value
            * @return <code>Indent</code> instance
            */
            public Indent setIndent(Indent indentElem) {
                    Indent result = getIndent();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(indentElem);

                return indentElem;
            }
            /**
            * Add <code>Alinea</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Alinea getAlinea() {
                Alinea result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Alinea".equalsIgnoreCase(widget.getType())) {
            result = (Alinea)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>alineaElem</code> property in DSL way
            * @param alineaElem new value
            * @return <code>Alinea</code> instance
            */
            public Alinea setAlinea(Alinea alineaElem) {
                    Alinea result = getAlinea();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(alineaElem);

                return alineaElem;
            }
            /**
            * Add <code>Subsection</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Subsection getSubsection() {
                Subsection result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subsection".equalsIgnoreCase(widget.getType())) {
            result = (Subsection)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>subsectionElem</code> property in DSL way
            * @param subsectionElem new value
            * @return <code>Subsection</code> instance
            */
            public Subsection setSubsection(Subsection subsectionElem) {
                    Subsection result = getSubsection();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(subsectionElem);

                return subsectionElem;
            }
            /**
            * Add <code>Subpart</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Subpart getSubpart() {
                Subpart result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subpart".equalsIgnoreCase(widget.getType())) {
            result = (Subpart)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>subpartElem</code> property in DSL way
            * @param subpartElem new value
            * @return <code>Subpart</code> instance
            */
            public Subpart setSubpart(Subpart subpartElem) {
                    Subpart result = getSubpart();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(subpartElem);

                return subpartElem;
            }
            /**
            * Add <code>Subparagraph</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Subparagraph getSubparagraph() {
                Subparagraph result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subparagraph".equalsIgnoreCase(widget.getType())) {
            result = (Subparagraph)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>subparagraphElem</code> property in DSL way
            * @param subparagraphElem new value
            * @return <code>Subparagraph</code> instance
            */
            public Subparagraph setSubparagraph(Subparagraph subparagraphElem) {
                    Subparagraph result = getSubparagraph();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(subparagraphElem);

                return subparagraphElem;
            }
            /**
            * Add <code>Subchapter</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Subchapter getSubchapter() {
                Subchapter result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subchapter".equalsIgnoreCase(widget.getType())) {
            result = (Subchapter)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>subchapterElem</code> property in DSL way
            * @param subchapterElem new value
            * @return <code>Subchapter</code> instance
            */
            public Subchapter setSubchapter(Subchapter subchapterElem) {
                    Subchapter result = getSubchapter();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(subchapterElem);

                return subchapterElem;
            }
            /**
            * Add <code>Subtitle</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Subtitle getSubtitle() {
                Subtitle result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subtitle".equalsIgnoreCase(widget.getType())) {
            result = (Subtitle)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>subtitleElem</code> property in DSL way
            * @param subtitleElem new value
            * @return <code>Subtitle</code> instance
            */
            public Subtitle setSubtitle(Subtitle subtitleElem) {
                    Subtitle result = getSubtitle();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(subtitleElem);

                return subtitleElem;
            }
            /**
            * Add <code>Subclause</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Subclause getSubclause() {
                Subclause result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Subclause".equalsIgnoreCase(widget.getType())) {
            result = (Subclause)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>subclauseElem</code> property in DSL way
            * @param subclauseElem new value
            * @return <code>Subclause</code> instance
            */
            public Subclause setSubclause(Subclause subclauseElem) {
                    Subclause result = getSubclause();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(subclauseElem);

                return subclauseElem;
            }
            /**
            * Add <code>Sublist</code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Sublist getSublist() {
                Sublist result = null;
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Sublist".equalsIgnoreCase(widget.getType())) {
            result = (Sublist)widget;
            break;
            }
            }
            return result;
            }
            /**
            * Set <code>sublistElem</code> property in DSL way
            * @param sublistElem new value
            * @return <code>Sublist</code> instance
            */
            public Sublist setSublist(Sublist sublistElem) {
                    Sublist result = getSublist();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeOverlayWidget(result);
                }
                this.addOverlayWidget(sublistElem);

                return sublistElem;
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
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("space", getSpaceAttr() != null ? getSpaceAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
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
public FragmentBodyTypeComplexType html(String s) {
    super.html(s);
    return this;
}
}

