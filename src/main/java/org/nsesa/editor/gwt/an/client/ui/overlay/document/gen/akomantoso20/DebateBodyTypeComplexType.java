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
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AdministrationOfOath;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.RollCall;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Prayers;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.OralStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.WrittenStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PersonalStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MinisterialStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Resolutions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.NationalInterest;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DeclarationOfVote;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Communication;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Petitions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Papers;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.NoticesOfMotion;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Questions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Address;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ProceduralMotions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PointOfOrder;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Adjournment;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DebateSection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;

import java.util.ArrayList;
import java.util.Arrays;

import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;

import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gwt.user.client.DOM;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class DebateBodyTypeComplexType extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new AdministrationOfOath(), new Occurrence(0, -1));
            put(new RollCall(), new Occurrence(0, -1));
            put(new Prayers(), new Occurrence(0, -1));
            put(new OralStatements(), new Occurrence(0, -1));
            put(new WrittenStatements(), new Occurrence(0, -1));
            put(new PersonalStatements(), new Occurrence(0, -1));
            put(new MinisterialStatements(), new Occurrence(0, -1));
            put(new Resolutions(), new Occurrence(0, -1));
            put(new NationalInterest(), new Occurrence(0, -1));
            put(new DeclarationOfVote(), new Occurrence(0, -1));
            put(new Communication(), new Occurrence(0, -1));
            put(new Petitions(), new Occurrence(0, -1));
            put(new Papers(), new Occurrence(0, -1));
            put(new NoticesOfMotion(), new Occurrence(0, -1));
            put(new Questions(), new Occurrence(0, -1));
            put(new Address(), new Occurrence(0, -1));
            put(new ProceduralMotions(), new Occurrence(0, -1));
            put(new PointOfOrder(), new Occurrence(0, -1));
            put(new Adjournment(), new Occurrence(0, -1));
            put(new DebateSection(), new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "debateBodyTypeComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget debateBodyTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public DebateBodyTypeComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private LanguageSimpleType langAttr;
    private AnyURISimpleType refersToAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType alternativeToAttr;
    private StatusTypeSimpleType statusAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType periodAttr;

    public java.util.List<AdministrationOfOath> getAdministrationOfOaths() {
        java.util.List<AdministrationOfOath> result = new ArrayList<AdministrationOfOath>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType())) {
                result.add((AdministrationOfOath) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<AdministrationOfOath> getAdministrationOfOathList() {
        return getAdministrationOfOaths();
    }

    //DSL Style set value
    public AdministrationOfOath addAdministrationOfOath(AdministrationOfOath administrationOfOathElem) {
        this.addOverlayWidget(administrationOfOathElem);
        return administrationOfOathElem;
    }

    public java.util.List<RollCall> getRollCalls() {
        java.util.List<RollCall> result = new ArrayList<RollCall>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
                result.add((RollCall) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<RollCall> getRollCallList() {
        return getRollCalls();
    }

    //DSL Style set value
    public RollCall addRollCall(RollCall rollCallElem) {
        this.addOverlayWidget(rollCallElem);
        return rollCallElem;
    }

    public java.util.List<Prayers> getPrayerses() {
        java.util.List<Prayers> result = new ArrayList<Prayers>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType())) {
                result.add((Prayers) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Prayers> getPrayersList() {
        return getPrayerses();
    }

    //DSL Style set value
    public Prayers addPrayers(Prayers prayersElem) {
        this.addOverlayWidget(prayersElem);
        return prayersElem;
    }

    public java.util.List<OralStatements> getOralStatementses() {
        java.util.List<OralStatements> result = new ArrayList<OralStatements>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
                result.add((OralStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<OralStatements> getOralStatementsList() {
        return getOralStatementses();
    }

    //DSL Style set value
    public OralStatements addOralStatements(OralStatements oralStatementsElem) {
        this.addOverlayWidget(oralStatementsElem);
        return oralStatementsElem;
    }

    public java.util.List<WrittenStatements> getWrittenStatementses() {
        java.util.List<WrittenStatements> result = new ArrayList<WrittenStatements>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType())) {
                result.add((WrittenStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<WrittenStatements> getWrittenStatementsList() {
        return getWrittenStatementses();
    }

    //DSL Style set value
    public WrittenStatements addWrittenStatements(WrittenStatements writtenStatementsElem) {
        this.addOverlayWidget(writtenStatementsElem);
        return writtenStatementsElem;
    }

    public java.util.List<PersonalStatements> getPersonalStatementses() {
        java.util.List<PersonalStatements> result = new ArrayList<PersonalStatements>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
                result.add((PersonalStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<PersonalStatements> getPersonalStatementsList() {
        return getPersonalStatementses();
    }

    //DSL Style set value
    public PersonalStatements addPersonalStatements(PersonalStatements personalStatementsElem) {
        this.addOverlayWidget(personalStatementsElem);
        return personalStatementsElem;
    }

    public java.util.List<MinisterialStatements> getMinisterialStatementses() {
        java.util.List<MinisterialStatements> result = new ArrayList<MinisterialStatements>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType())) {
                result.add((MinisterialStatements) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<MinisterialStatements> getMinisterialStatementsList() {
        return getMinisterialStatementses();
    }

    //DSL Style set value
    public MinisterialStatements addMinisterialStatements(MinisterialStatements ministerialStatementsElem) {
        this.addOverlayWidget(ministerialStatementsElem);
        return ministerialStatementsElem;
    }

    public java.util.List<Resolutions> getResolutionses() {
        java.util.List<Resolutions> result = new ArrayList<Resolutions>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
                result.add((Resolutions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Resolutions> getResolutionsList() {
        return getResolutionses();
    }

    //DSL Style set value
    public Resolutions addResolutions(Resolutions resolutionsElem) {
        this.addOverlayWidget(resolutionsElem);
        return resolutionsElem;
    }

    public java.util.List<NationalInterest> getNationalInterests() {
        java.util.List<NationalInterest> result = new ArrayList<NationalInterest>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType())) {
                result.add((NationalInterest) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<NationalInterest> getNationalInterestList() {
        return getNationalInterests();
    }

    //DSL Style set value
    public NationalInterest addNationalInterest(NationalInterest nationalInterestElem) {
        this.addOverlayWidget(nationalInterestElem);
        return nationalInterestElem;
    }

    public java.util.List<DeclarationOfVote> getDeclarationOfVotes() {
        java.util.List<DeclarationOfVote> result = new ArrayList<DeclarationOfVote>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
                result.add((DeclarationOfVote) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DeclarationOfVote> getDeclarationOfVoteList() {
        return getDeclarationOfVotes();
    }

    //DSL Style set value
    public DeclarationOfVote addDeclarationOfVote(DeclarationOfVote declarationOfVoteElem) {
        this.addOverlayWidget(declarationOfVoteElem);
        return declarationOfVoteElem;
    }

    public java.util.List<Communication> getCommunications() {
        java.util.List<Communication> result = new ArrayList<Communication>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType())) {
                result.add((Communication) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Communication> getCommunicationList() {
        return getCommunications();
    }

    //DSL Style set value
    public Communication addCommunication(Communication communicationElem) {
        this.addOverlayWidget(communicationElem);
        return communicationElem;
    }

    public java.util.List<Petitions> getPetitionses() {
        java.util.List<Petitions> result = new ArrayList<Petitions>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
                result.add((Petitions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Petitions> getPetitionsList() {
        return getPetitionses();
    }

    //DSL Style set value
    public Petitions addPetitions(Petitions petitionsElem) {
        this.addOverlayWidget(petitionsElem);
        return petitionsElem;
    }

    public java.util.List<Papers> getPaperses() {
        java.util.List<Papers> result = new ArrayList<Papers>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType())) {
                result.add((Papers) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Papers> getPapersList() {
        return getPaperses();
    }

    //DSL Style set value
    public Papers addPapers(Papers papersElem) {
        this.addOverlayWidget(papersElem);
        return papersElem;
    }

    public java.util.List<NoticesOfMotion> getNoticesOfMotions() {
        java.util.List<NoticesOfMotion> result = new ArrayList<NoticesOfMotion>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
                result.add((NoticesOfMotion) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<NoticesOfMotion> getNoticesOfMotionList() {
        return getNoticesOfMotions();
    }

    //DSL Style set value
    public NoticesOfMotion addNoticesOfMotion(NoticesOfMotion noticesOfMotionElem) {
        this.addOverlayWidget(noticesOfMotionElem);
        return noticesOfMotionElem;
    }

    public java.util.List<Questions> getQuestionses() {
        java.util.List<Questions> result = new ArrayList<Questions>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType())) {
                result.add((Questions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Questions> getQuestionsList() {
        return getQuestionses();
    }

    //DSL Style set value
    public Questions addQuestions(Questions questionsElem) {
        this.addOverlayWidget(questionsElem);
        return questionsElem;
    }

    public java.util.List<Address> getAddresses() {
        java.util.List<Address> result = new ArrayList<Address>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
                result.add((Address) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Address> getAddressList() {
        return getAddresses();
    }

    //DSL Style set value
    public Address addAddress(Address addressElem) {
        this.addOverlayWidget(addressElem);
        return addressElem;
    }

    public java.util.List<ProceduralMotions> getProceduralMotionses() {
        java.util.List<ProceduralMotions> result = new ArrayList<ProceduralMotions>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType())) {
                result.add((ProceduralMotions) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<ProceduralMotions> getProceduralMotionsList() {
        return getProceduralMotionses();
    }

    //DSL Style set value
    public ProceduralMotions addProceduralMotions(ProceduralMotions proceduralMotionsElem) {
        this.addOverlayWidget(proceduralMotionsElem);
        return proceduralMotionsElem;
    }

    public java.util.List<PointOfOrder> getPointOfOrders() {
        java.util.List<PointOfOrder> result = new ArrayList<PointOfOrder>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
                result.add((PointOfOrder) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<PointOfOrder> getPointOfOrderList() {
        return getPointOfOrders();
    }

    //DSL Style set value
    public PointOfOrder addPointOfOrder(PointOfOrder pointOfOrderElem) {
        this.addOverlayWidget(pointOfOrderElem);
        return pointOfOrderElem;
    }

    public java.util.List<Adjournment> getAdjournments() {
        java.util.List<Adjournment> result = new ArrayList<Adjournment>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType())) {
                result.add((Adjournment) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Adjournment> getAdjournmentList() {
        return getAdjournments();
    }

    //DSL Style set value
    public Adjournment addAdjournment(Adjournment adjournmentElem) {
        this.addOverlayWidget(adjournmentElem);
        return adjournmentElem;
    }

    public java.util.List<DebateSection> getDebateSections() {
        java.util.List<DebateSection> result = new ArrayList<DebateSection>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
                result.add((DebateSection) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<DebateSection> getDebateSectionList() {
        return getDebateSections();
    }

    //DSL Style set value
    public DebateSection addDebateSection(DebateSection debateSectionElem) {
        this.addOverlayWidget(debateSectionElem);
        return debateSectionElem;
    }

    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(getElement().getAttribute("lang"));
        }

        return langAttr;
    }

    //DSL Style get value
    public LanguageSimpleType langAttr() {
        return getLangAttr();
    }

    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
        getElement().setAttribute("lang", langAttr.getValue());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo", refersToAttr.getValue());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
        return getWildcardContentAttr();
    }

    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        getElement().setAttribute("wildcardContent", wildcardContentAttr);
    }

    //DSL Style set value
    public DebateBodyTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(getElement().getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType alternativeToAttr() {
        return getAlternativeToAttr();
    }

    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
        getElement().setAttribute("alternativeTo", alternativeToAttr.getValue());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(getElement().getAttribute("status"));
        }

        return statusAttr;
    }

    //DSL Style get value
    public StatusTypeSimpleType statusAttr() {
        return getStatusAttr();
    }

    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
        getElement().setAttribute("status", statusAttr.value());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
    }

    //DSL Style get value
    public IDSimpleType idAttr() {
        return getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        getElement().setAttribute("id", idAttr.getValue());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType idAttr(final IDSimpleType idAttr) {
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
        return getEvolvingIdAttr();
    }

    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        getElement().setAttribute("evolvingId", evolvingIdAttr.getValue());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(getElement().getAttribute("class"));
        }

        return classAttr;
    }

    //DSL Style get value
    public StringSimpleType classAttr() {
        return getClassAttr();
    }

    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
        getElement().setAttribute("class", classAttr.getValue());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(getElement().getAttribute("style"));
        }

        return styleAttr;
    }

    //DSL Style get value
    public StringSimpleType styleAttr() {
        return getStyleAttr();
    }

    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
        getElement().setAttribute("style", styleAttr.getValue());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(getElement().getAttribute("title"));
        }

        return titleAttr;
    }

    //DSL Style get value
    public StringSimpleType titleAttr() {
        return getTitleAttr();
    }

    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
        getElement().setAttribute("title", titleAttr.getValue());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(getElement().getAttribute("period"));
        }

        return periodAttr;
    }

    //DSL Style get value
    public AnyURISimpleType periodAttr() {
        return getPeriodAttr();
    }

    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
        getElement().setAttribute("period", periodAttr.getValue());
    }

    //DSL Style set value
    public DebateBodyTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
    }

    /**
     * Returns the namespace URI of this amendable widget.
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }
}

