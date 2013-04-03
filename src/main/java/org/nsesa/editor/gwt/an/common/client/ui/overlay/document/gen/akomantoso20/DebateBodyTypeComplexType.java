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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AdministrationOfOath;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.RollCall;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Prayers;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.OralStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.WrittenStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.PersonalStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.MinisterialStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Resolutions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.NationalInterest;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DeclarationOfVote;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Communication;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Petitions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Papers;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.NoticesOfMotion;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Questions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Address;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ProceduralMotions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.PointOfOrder;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Adjournment;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DebateSection;
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
* the type debateBodyType specifies a content model of the main hierarchy of a debate
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class DebateBodyTypeComplexType extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new AdministrationOfOath())
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
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "debateBodyTypeComplexType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget debateBodyTypeComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>DebateBodyTypeComplexType</code> object with the given DOM element
*/
public DebateBodyTypeComplexType(Element element) {
super(element);
}

// FIELDS ------------------
    private StatusTypeSimpleType statusAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType alternativeToAttr;
    private String wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType refersToAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType periodAttr;

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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType classAttr(final StringSimpleType classAttr) {
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType styleAttr(final StringSimpleType styleAttr) {
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType idAttr(final IDSimpleType idAttr) {
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
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
        * @return <code>DebateBodyTypeComplexType</code> instance
        */
        public DebateBodyTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }
            /**
            * Return <code>java.util.List<AdministrationOfOath></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<AdministrationOfOath> getAdministrationOfOaths() {
                java.util.List<AdministrationOfOath> result = new ArrayList<AdministrationOfOath>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType())) {
            result.add((AdministrationOfOath)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<AdministrationOfOath></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<AdministrationOfOath> getAdministrationOfOathList() {
            return  getAdministrationOfOaths();
            }
            /**
            * Add <code>java.util.List<AdministrationOfOath></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public AdministrationOfOath addAdministrationOfOath(AdministrationOfOath administrationOfOathElem) {
                this.addOverlayWidget(administrationOfOathElem);
                return administrationOfOathElem;
            }

            /**
            * Return <code>java.util.List<RollCall></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<RollCall> getRollCalls() {
                java.util.List<RollCall> result = new ArrayList<RollCall>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
            result.add((RollCall)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<RollCall></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<RollCall> getRollCallList() {
            return  getRollCalls();
            }
            /**
            * Add <code>java.util.List<RollCall></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public RollCall addRollCall(RollCall rollCallElem) {
                this.addOverlayWidget(rollCallElem);
                return rollCallElem;
            }

            /**
            * Return <code>java.util.List<Prayers></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Prayers> getPrayerses() {
                java.util.List<Prayers> result = new ArrayList<Prayers>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType())) {
            result.add((Prayers)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Prayers></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Prayers> getPrayersList() {
            return  getPrayerses();
            }
            /**
            * Add <code>java.util.List<Prayers></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Prayers addPrayers(Prayers prayersElem) {
                this.addOverlayWidget(prayersElem);
                return prayersElem;
            }

            /**
            * Return <code>java.util.List<OralStatements></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<OralStatements> getOralStatementses() {
                java.util.List<OralStatements> result = new ArrayList<OralStatements>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
            result.add((OralStatements)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<OralStatements></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<OralStatements> getOralStatementsList() {
            return  getOralStatementses();
            }
            /**
            * Add <code>java.util.List<OralStatements></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public OralStatements addOralStatements(OralStatements oralStatementsElem) {
                this.addOverlayWidget(oralStatementsElem);
                return oralStatementsElem;
            }

            /**
            * Return <code>java.util.List<WrittenStatements></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<WrittenStatements> getWrittenStatementses() {
                java.util.List<WrittenStatements> result = new ArrayList<WrittenStatements>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType())) {
            result.add((WrittenStatements)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<WrittenStatements></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<WrittenStatements> getWrittenStatementsList() {
            return  getWrittenStatementses();
            }
            /**
            * Add <code>java.util.List<WrittenStatements></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public WrittenStatements addWrittenStatements(WrittenStatements writtenStatementsElem) {
                this.addOverlayWidget(writtenStatementsElem);
                return writtenStatementsElem;
            }

            /**
            * Return <code>java.util.List<PersonalStatements></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<PersonalStatements> getPersonalStatementses() {
                java.util.List<PersonalStatements> result = new ArrayList<PersonalStatements>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
            result.add((PersonalStatements)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<PersonalStatements></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<PersonalStatements> getPersonalStatementsList() {
            return  getPersonalStatementses();
            }
            /**
            * Add <code>java.util.List<PersonalStatements></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public PersonalStatements addPersonalStatements(PersonalStatements personalStatementsElem) {
                this.addOverlayWidget(personalStatementsElem);
                return personalStatementsElem;
            }

            /**
            * Return <code>java.util.List<MinisterialStatements></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<MinisterialStatements> getMinisterialStatementses() {
                java.util.List<MinisterialStatements> result = new ArrayList<MinisterialStatements>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType())) {
            result.add((MinisterialStatements)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<MinisterialStatements></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<MinisterialStatements> getMinisterialStatementsList() {
            return  getMinisterialStatementses();
            }
            /**
            * Add <code>java.util.List<MinisterialStatements></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public MinisterialStatements addMinisterialStatements(MinisterialStatements ministerialStatementsElem) {
                this.addOverlayWidget(ministerialStatementsElem);
                return ministerialStatementsElem;
            }

            /**
            * Return <code>java.util.List<Resolutions></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Resolutions> getResolutionses() {
                java.util.List<Resolutions> result = new ArrayList<Resolutions>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
            result.add((Resolutions)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Resolutions></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Resolutions> getResolutionsList() {
            return  getResolutionses();
            }
            /**
            * Add <code>java.util.List<Resolutions></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Resolutions addResolutions(Resolutions resolutionsElem) {
                this.addOverlayWidget(resolutionsElem);
                return resolutionsElem;
            }

            /**
            * Return <code>java.util.List<NationalInterest></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<NationalInterest> getNationalInterests() {
                java.util.List<NationalInterest> result = new ArrayList<NationalInterest>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType())) {
            result.add((NationalInterest)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<NationalInterest></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<NationalInterest> getNationalInterestList() {
            return  getNationalInterests();
            }
            /**
            * Add <code>java.util.List<NationalInterest></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public NationalInterest addNationalInterest(NationalInterest nationalInterestElem) {
                this.addOverlayWidget(nationalInterestElem);
                return nationalInterestElem;
            }

            /**
            * Return <code>java.util.List<DeclarationOfVote></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<DeclarationOfVote> getDeclarationOfVotes() {
                java.util.List<DeclarationOfVote> result = new ArrayList<DeclarationOfVote>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
            result.add((DeclarationOfVote)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<DeclarationOfVote></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<DeclarationOfVote> getDeclarationOfVoteList() {
            return  getDeclarationOfVotes();
            }
            /**
            * Add <code>java.util.List<DeclarationOfVote></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public DeclarationOfVote addDeclarationOfVote(DeclarationOfVote declarationOfVoteElem) {
                this.addOverlayWidget(declarationOfVoteElem);
                return declarationOfVoteElem;
            }

            /**
            * Return <code>java.util.List<Communication></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Communication> getCommunications() {
                java.util.List<Communication> result = new ArrayList<Communication>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType())) {
            result.add((Communication)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Communication></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Communication> getCommunicationList() {
            return  getCommunications();
            }
            /**
            * Add <code>java.util.List<Communication></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Communication addCommunication(Communication communicationElem) {
                this.addOverlayWidget(communicationElem);
                return communicationElem;
            }

            /**
            * Return <code>java.util.List<Petitions></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Petitions> getPetitionses() {
                java.util.List<Petitions> result = new ArrayList<Petitions>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
            result.add((Petitions)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Petitions></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Petitions> getPetitionsList() {
            return  getPetitionses();
            }
            /**
            * Add <code>java.util.List<Petitions></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Petitions addPetitions(Petitions petitionsElem) {
                this.addOverlayWidget(petitionsElem);
                return petitionsElem;
            }

            /**
            * Return <code>java.util.List<Papers></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Papers> getPaperses() {
                java.util.List<Papers> result = new ArrayList<Papers>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType())) {
            result.add((Papers)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Papers></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Papers> getPapersList() {
            return  getPaperses();
            }
            /**
            * Add <code>java.util.List<Papers></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Papers addPapers(Papers papersElem) {
                this.addOverlayWidget(papersElem);
                return papersElem;
            }

            /**
            * Return <code>java.util.List<NoticesOfMotion></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<NoticesOfMotion> getNoticesOfMotions() {
                java.util.List<NoticesOfMotion> result = new ArrayList<NoticesOfMotion>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
            result.add((NoticesOfMotion)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<NoticesOfMotion></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<NoticesOfMotion> getNoticesOfMotionList() {
            return  getNoticesOfMotions();
            }
            /**
            * Add <code>java.util.List<NoticesOfMotion></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public NoticesOfMotion addNoticesOfMotion(NoticesOfMotion noticesOfMotionElem) {
                this.addOverlayWidget(noticesOfMotionElem);
                return noticesOfMotionElem;
            }

            /**
            * Return <code>java.util.List<Questions></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Questions> getQuestionses() {
                java.util.List<Questions> result = new ArrayList<Questions>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType())) {
            result.add((Questions)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Questions></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Questions> getQuestionsList() {
            return  getQuestionses();
            }
            /**
            * Add <code>java.util.List<Questions></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Questions addQuestions(Questions questionsElem) {
                this.addOverlayWidget(questionsElem);
                return questionsElem;
            }

            /**
            * Return <code>java.util.List<Address></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Address> getAddresses() {
                java.util.List<Address> result = new ArrayList<Address>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
            result.add((Address)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Address></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Address> getAddressList() {
            return  getAddresses();
            }
            /**
            * Add <code>java.util.List<Address></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Address addAddress(Address addressElem) {
                this.addOverlayWidget(addressElem);
                return addressElem;
            }

            /**
            * Return <code>java.util.List<ProceduralMotions></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<ProceduralMotions> getProceduralMotionses() {
                java.util.List<ProceduralMotions> result = new ArrayList<ProceduralMotions>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType())) {
            result.add((ProceduralMotions)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<ProceduralMotions></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<ProceduralMotions> getProceduralMotionsList() {
            return  getProceduralMotionses();
            }
            /**
            * Add <code>java.util.List<ProceduralMotions></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public ProceduralMotions addProceduralMotions(ProceduralMotions proceduralMotionsElem) {
                this.addOverlayWidget(proceduralMotionsElem);
                return proceduralMotionsElem;
            }

            /**
            * Return <code>java.util.List<PointOfOrder></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<PointOfOrder> getPointOfOrders() {
                java.util.List<PointOfOrder> result = new ArrayList<PointOfOrder>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
            result.add((PointOfOrder)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<PointOfOrder></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<PointOfOrder> getPointOfOrderList() {
            return  getPointOfOrders();
            }
            /**
            * Add <code>java.util.List<PointOfOrder></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public PointOfOrder addPointOfOrder(PointOfOrder pointOfOrderElem) {
                this.addOverlayWidget(pointOfOrderElem);
                return pointOfOrderElem;
            }

            /**
            * Return <code>java.util.List<Adjournment></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Adjournment> getAdjournments() {
                java.util.List<Adjournment> result = new ArrayList<Adjournment>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType())) {
            result.add((Adjournment)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Adjournment></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Adjournment> getAdjournmentList() {
            return  getAdjournments();
            }
            /**
            * Add <code>java.util.List<Adjournment></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Adjournment addAdjournment(Adjournment adjournmentElem) {
                this.addOverlayWidget(adjournmentElem);
                return adjournmentElem;
            }

            /**
            * Return <code>java.util.List<DebateSection></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<DebateSection> getDebateSections() {
                java.util.List<DebateSection> result = new ArrayList<DebateSection>();
            for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
            result.add((DebateSection)widget);
            }
            }
            return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<DebateSection></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<DebateSection> getDebateSectionList() {
            return  getDebateSections();
            }
            /**
            * Add <code>java.util.List<DebateSection></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public DebateSection addDebateSection(DebateSection debateSectionElem) {
                this.addOverlayWidget(debateSectionElem);
                return debateSectionElem;
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
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
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
public DebateBodyTypeComplexType html(String s) {
    super.html(s);
    return this;
}
}

