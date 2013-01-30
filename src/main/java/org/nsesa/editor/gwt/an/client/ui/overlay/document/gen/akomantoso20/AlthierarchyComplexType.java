package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ComponentRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Container;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Speech;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Question;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Answer;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Other;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Scene;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Narrative;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Summary;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Foreign;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Block;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Div;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.BlockList;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Toc;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Tblock;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Ul;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Ol;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Table;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.P;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class AlthierarchyComplexType extends BasehierarchyComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new ComponentRef(), new Occurrence(1,1));
            put(new Container(), new Occurrence(0,-1));
            put(new Speech(), new Occurrence(0,-1));
            put(new Question(), new Occurrence(0,-1));
            put(new Answer(), new Occurrence(0,-1));
            put(new Other(), new Occurrence(0,-1));
            put(new Scene(), new Occurrence(0,-1));
            put(new Narrative(), new Occurrence(0,-1));
            put(new Summary(), new Occurrence(0,-1));
            put(new Foreign(), new Occurrence(0,-1));
            put(new Block(), new Occurrence(0,-1));
            put(new AdministrationOfOath(), new Occurrence(0,-1));
            put(new RollCall(), new Occurrence(0,-1));
            put(new Prayers(), new Occurrence(0,-1));
            put(new OralStatements(), new Occurrence(0,-1));
            put(new WrittenStatements(), new Occurrence(0,-1));
            put(new PersonalStatements(), new Occurrence(0,-1));
            put(new MinisterialStatements(), new Occurrence(0,-1));
            put(new Resolutions(), new Occurrence(0,-1));
            put(new NationalInterest(), new Occurrence(0,-1));
            put(new DeclarationOfVote(), new Occurrence(0,-1));
            put(new Communication(), new Occurrence(0,-1));
            put(new Petitions(), new Occurrence(0,-1));
            put(new Papers(), new Occurrence(0,-1));
            put(new NoticesOfMotion(), new Occurrence(0,-1));
            put(new Questions(), new Occurrence(0,-1));
            put(new Address(), new Occurrence(0,-1));
            put(new ProceduralMotions(), new Occurrence(0,-1));
            put(new PointOfOrder(), new Occurrence(0,-1));
            put(new Adjournment(), new Occurrence(0,-1));
            put(new DebateSection(), new Occurrence(0,-1));
            put(new Div(), new Occurrence(0,-1));
            put(new BlockList(), new Occurrence(0,-1));
            put(new Toc(), new Occurrence(0,-1));
            put(new Tblock(), new Occurrence(0,-1));
            put(new Ul(), new Occurrence(0,-1));
            put(new Ol(), new Occurrence(0,-1));
            put(new Table(), new Occurrence(0,-1));
            put(new P(), new Occurrence(0,-1));
            put(new Num(), new Occurrence(0,1));
            put(new Heading(), new Occurrence(0,1));
            put(new Subheading(), new Occurrence(0,1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "althierarchyComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget althierarchyComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public AlthierarchyComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private String wildcardContentAttr;
    private AnyURISimpleType alternativeToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType refersToAttr;
    private StatusTypeSimpleType statusAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType periodAttr;

    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType())) {
                result.add((ComponentRef)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<ComponentRef> getComponentRefList() {
        return  getComponentRefs();
    }
     //DSL Style set value
    public ComponentRef addComponentRef(ComponentRef componentRefElem) {
        this.addAmendableWidget(componentRefElem);
        return componentRefElem;
    }

    public java.util.List<Container> getContainers() {
        java.util.List<Container> result = new ArrayList<Container>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType())) {
                result.add((Container)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Container> getContainerList() {
        return  getContainers();
    }
     //DSL Style set value
    public Container addContainer(Container containerElem) {
        this.addAmendableWidget(containerElem);
        return containerElem;
    }

    public java.util.List<Speech> getSpeechs() {
        java.util.List<Speech> result = new ArrayList<Speech>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Speech".equalsIgnoreCase(widget.getType())) {
                result.add((Speech)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Speech> getSpeechList() {
        return  getSpeechs();
    }
     //DSL Style set value
    public Speech addSpeech(Speech speechElem) {
        this.addAmendableWidget(speechElem);
        return speechElem;
    }

    public java.util.List<Question> getQuestions() {
        java.util.List<Question> result = new ArrayList<Question>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Question".equalsIgnoreCase(widget.getType())) {
                result.add((Question)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Question> getQuestionList() {
        return  getQuestions();
    }
     //DSL Style set value
    public Question addQuestion(Question questionElem) {
        this.addAmendableWidget(questionElem);
        return questionElem;
    }

    public java.util.List<Answer> getAnswers() {
        java.util.List<Answer> result = new ArrayList<Answer>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Answer".equalsIgnoreCase(widget.getType())) {
                result.add((Answer)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Answer> getAnswerList() {
        return  getAnswers();
    }
     //DSL Style set value
    public Answer addAnswer(Answer answerElem) {
        this.addAmendableWidget(answerElem);
        return answerElem;
    }

    public java.util.List<Other> getOthers() {
        java.util.List<Other> result = new ArrayList<Other>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Other".equalsIgnoreCase(widget.getType())) {
                result.add((Other)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Other> getOtherList() {
        return  getOthers();
    }
     //DSL Style set value
    public Other addOther(Other otherElem) {
        this.addAmendableWidget(otherElem);
        return otherElem;
    }

    public java.util.List<Scene> getScenes() {
        java.util.List<Scene> result = new ArrayList<Scene>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Scene".equalsIgnoreCase(widget.getType())) {
                result.add((Scene)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Scene> getSceneList() {
        return  getScenes();
    }
     //DSL Style set value
    public Scene addScene(Scene sceneElem) {
        this.addAmendableWidget(sceneElem);
        return sceneElem;
    }

    public java.util.List<Narrative> getNarratives() {
        java.util.List<Narrative> result = new ArrayList<Narrative>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Narrative".equalsIgnoreCase(widget.getType())) {
                result.add((Narrative)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Narrative> getNarrativeList() {
        return  getNarratives();
    }
     //DSL Style set value
    public Narrative addNarrative(Narrative narrativeElem) {
        this.addAmendableWidget(narrativeElem);
        return narrativeElem;
    }

    public java.util.List<Summary> getSummaries() {
        java.util.List<Summary> result = new ArrayList<Summary>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Summary".equalsIgnoreCase(widget.getType())) {
                result.add((Summary)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Summary> getSummaryList() {
        return  getSummaries();
    }
     //DSL Style set value
    public Summary addSummary(Summary summaryElem) {
        this.addAmendableWidget(summaryElem);
        return summaryElem;
    }

    public java.util.List<Foreign> getForeigns() {
        java.util.List<Foreign> result = new ArrayList<Foreign>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Foreign".equalsIgnoreCase(widget.getType())) {
                result.add((Foreign)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Foreign> getForeignList() {
        return  getForeigns();
    }
     //DSL Style set value
    public Foreign addForeign(Foreign foreignElem) {
        this.addAmendableWidget(foreignElem);
        return foreignElem;
    }

    public java.util.List<Block> getBlocks() {
        java.util.List<Block> result = new ArrayList<Block>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Block".equalsIgnoreCase(widget.getType())) {
                result.add((Block)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Block> getBlockList() {
        return  getBlocks();
    }
     //DSL Style set value
    public Block addBlock(Block blockElem) {
        this.addAmendableWidget(blockElem);
        return blockElem;
    }

    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
     }
     //DSL Style get value
    public String wildcardContentAttr() {
        return  getWildcardContentAttr();
    }

    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType wildcardContentAttr(final String wildcardContentAttr) {
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
        return  getAlternativeToAttr();
    }

    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
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
        return  getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType idAttr(final IDSimpleType idAttr) {
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
        return  getEvolvingIdAttr();
    }

    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
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
        return  getLangAttr();
    }

    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType langAttr(final LanguageSimpleType langAttr) {
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
        return  getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
        return  getStatusAttr();
    }

    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
        return  getClassAttr();
    }

    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType classAttr(final StringSimpleType classAttr) {
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
        return  getStyleAttr();
    }

    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType styleAttr(final StringSimpleType styleAttr) {
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
        return  getTitleAttr();
    }

    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }
    public java.util.List<AdministrationOfOath> getAdministrationOfOaths() {
        java.util.List<AdministrationOfOath> result = new ArrayList<AdministrationOfOath>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType())) {
                result.add((AdministrationOfOath)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<AdministrationOfOath> getAdministrationOfOathList() {
        return  getAdministrationOfOaths();
    }
     //DSL Style set value
    public AdministrationOfOath addAdministrationOfOath(AdministrationOfOath administrationOfOathElem) {
        this.addAmendableWidget(administrationOfOathElem);
        return administrationOfOathElem;
    }

    public java.util.List<RollCall> getRollCalls() {
        java.util.List<RollCall> result = new ArrayList<RollCall>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
                result.add((RollCall)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<RollCall> getRollCallList() {
        return  getRollCalls();
    }
     //DSL Style set value
    public RollCall addRollCall(RollCall rollCallElem) {
        this.addAmendableWidget(rollCallElem);
        return rollCallElem;
    }

    public java.util.List<Prayers> getPrayerses() {
        java.util.List<Prayers> result = new ArrayList<Prayers>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType())) {
                result.add((Prayers)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Prayers> getPrayersList() {
        return  getPrayerses();
    }
     //DSL Style set value
    public Prayers addPrayers(Prayers prayersElem) {
        this.addAmendableWidget(prayersElem);
        return prayersElem;
    }

    public java.util.List<OralStatements> getOralStatementses() {
        java.util.List<OralStatements> result = new ArrayList<OralStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
                result.add((OralStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<OralStatements> getOralStatementsList() {
        return  getOralStatementses();
    }
     //DSL Style set value
    public OralStatements addOralStatements(OralStatements oralStatementsElem) {
        this.addAmendableWidget(oralStatementsElem);
        return oralStatementsElem;
    }

    public java.util.List<WrittenStatements> getWrittenStatementses() {
        java.util.List<WrittenStatements> result = new ArrayList<WrittenStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType())) {
                result.add((WrittenStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<WrittenStatements> getWrittenStatementsList() {
        return  getWrittenStatementses();
    }
     //DSL Style set value
    public WrittenStatements addWrittenStatements(WrittenStatements writtenStatementsElem) {
        this.addAmendableWidget(writtenStatementsElem);
        return writtenStatementsElem;
    }

    public java.util.List<PersonalStatements> getPersonalStatementses() {
        java.util.List<PersonalStatements> result = new ArrayList<PersonalStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
                result.add((PersonalStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<PersonalStatements> getPersonalStatementsList() {
        return  getPersonalStatementses();
    }
     //DSL Style set value
    public PersonalStatements addPersonalStatements(PersonalStatements personalStatementsElem) {
        this.addAmendableWidget(personalStatementsElem);
        return personalStatementsElem;
    }

    public java.util.List<MinisterialStatements> getMinisterialStatementses() {
        java.util.List<MinisterialStatements> result = new ArrayList<MinisterialStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType())) {
                result.add((MinisterialStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<MinisterialStatements> getMinisterialStatementsList() {
        return  getMinisterialStatementses();
    }
     //DSL Style set value
    public MinisterialStatements addMinisterialStatements(MinisterialStatements ministerialStatementsElem) {
        this.addAmendableWidget(ministerialStatementsElem);
        return ministerialStatementsElem;
    }

    public java.util.List<Resolutions> getResolutionses() {
        java.util.List<Resolutions> result = new ArrayList<Resolutions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
                result.add((Resolutions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Resolutions> getResolutionsList() {
        return  getResolutionses();
    }
     //DSL Style set value
    public Resolutions addResolutions(Resolutions resolutionsElem) {
        this.addAmendableWidget(resolutionsElem);
        return resolutionsElem;
    }

    public java.util.List<NationalInterest> getNationalInterests() {
        java.util.List<NationalInterest> result = new ArrayList<NationalInterest>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType())) {
                result.add((NationalInterest)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<NationalInterest> getNationalInterestList() {
        return  getNationalInterests();
    }
     //DSL Style set value
    public NationalInterest addNationalInterest(NationalInterest nationalInterestElem) {
        this.addAmendableWidget(nationalInterestElem);
        return nationalInterestElem;
    }

    public java.util.List<DeclarationOfVote> getDeclarationOfVotes() {
        java.util.List<DeclarationOfVote> result = new ArrayList<DeclarationOfVote>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
                result.add((DeclarationOfVote)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<DeclarationOfVote> getDeclarationOfVoteList() {
        return  getDeclarationOfVotes();
    }
     //DSL Style set value
    public DeclarationOfVote addDeclarationOfVote(DeclarationOfVote declarationOfVoteElem) {
        this.addAmendableWidget(declarationOfVoteElem);
        return declarationOfVoteElem;
    }

    public java.util.List<Communication> getCommunications() {
        java.util.List<Communication> result = new ArrayList<Communication>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType())) {
                result.add((Communication)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Communication> getCommunicationList() {
        return  getCommunications();
    }
     //DSL Style set value
    public Communication addCommunication(Communication communicationElem) {
        this.addAmendableWidget(communicationElem);
        return communicationElem;
    }

    public java.util.List<Petitions> getPetitionses() {
        java.util.List<Petitions> result = new ArrayList<Petitions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
                result.add((Petitions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Petitions> getPetitionsList() {
        return  getPetitionses();
    }
     //DSL Style set value
    public Petitions addPetitions(Petitions petitionsElem) {
        this.addAmendableWidget(petitionsElem);
        return petitionsElem;
    }

    public java.util.List<Papers> getPaperses() {
        java.util.List<Papers> result = new ArrayList<Papers>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType())) {
                result.add((Papers)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Papers> getPapersList() {
        return  getPaperses();
    }
     //DSL Style set value
    public Papers addPapers(Papers papersElem) {
        this.addAmendableWidget(papersElem);
        return papersElem;
    }

    public java.util.List<NoticesOfMotion> getNoticesOfMotions() {
        java.util.List<NoticesOfMotion> result = new ArrayList<NoticesOfMotion>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
                result.add((NoticesOfMotion)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<NoticesOfMotion> getNoticesOfMotionList() {
        return  getNoticesOfMotions();
    }
     //DSL Style set value
    public NoticesOfMotion addNoticesOfMotion(NoticesOfMotion noticesOfMotionElem) {
        this.addAmendableWidget(noticesOfMotionElem);
        return noticesOfMotionElem;
    }

    public java.util.List<Questions> getQuestionses() {
        java.util.List<Questions> result = new ArrayList<Questions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType())) {
                result.add((Questions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Questions> getQuestionsList() {
        return  getQuestionses();
    }
     //DSL Style set value
    public Questions addQuestions(Questions questionsElem) {
        this.addAmendableWidget(questionsElem);
        return questionsElem;
    }

    public java.util.List<Address> getAddresses() {
        java.util.List<Address> result = new ArrayList<Address>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
                result.add((Address)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Address> getAddressList() {
        return  getAddresses();
    }
     //DSL Style set value
    public Address addAddress(Address addressElem) {
        this.addAmendableWidget(addressElem);
        return addressElem;
    }

    public java.util.List<ProceduralMotions> getProceduralMotionses() {
        java.util.List<ProceduralMotions> result = new ArrayList<ProceduralMotions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType())) {
                result.add((ProceduralMotions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<ProceduralMotions> getProceduralMotionsList() {
        return  getProceduralMotionses();
    }
     //DSL Style set value
    public ProceduralMotions addProceduralMotions(ProceduralMotions proceduralMotionsElem) {
        this.addAmendableWidget(proceduralMotionsElem);
        return proceduralMotionsElem;
    }

    public java.util.List<PointOfOrder> getPointOfOrders() {
        java.util.List<PointOfOrder> result = new ArrayList<PointOfOrder>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
                result.add((PointOfOrder)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<PointOfOrder> getPointOfOrderList() {
        return  getPointOfOrders();
    }
     //DSL Style set value
    public PointOfOrder addPointOfOrder(PointOfOrder pointOfOrderElem) {
        this.addAmendableWidget(pointOfOrderElem);
        return pointOfOrderElem;
    }

    public java.util.List<Adjournment> getAdjournments() {
        java.util.List<Adjournment> result = new ArrayList<Adjournment>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType())) {
                result.add((Adjournment)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Adjournment> getAdjournmentList() {
        return  getAdjournments();
    }
     //DSL Style set value
    public Adjournment addAdjournment(Adjournment adjournmentElem) {
        this.addAmendableWidget(adjournmentElem);
        return adjournmentElem;
    }

    public java.util.List<DebateSection> getDebateSections() {
        java.util.List<DebateSection> result = new ArrayList<DebateSection>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
                result.add((DebateSection)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<DebateSection> getDebateSectionList() {
        return  getDebateSections();
    }
     //DSL Style set value
    public DebateSection addDebateSection(DebateSection debateSectionElem) {
        this.addAmendableWidget(debateSectionElem);
        return debateSectionElem;
    }

    public java.util.List<Div> getDivs() {
        java.util.List<Div> result = new ArrayList<Div>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Div".equalsIgnoreCase(widget.getType())) {
                result.add((Div)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Div> getDivList() {
        return  getDivs();
    }
     //DSL Style set value
    public Div addDiv(Div divElem) {
        this.addAmendableWidget(divElem);
        return divElem;
    }

    public java.util.List<BlockList> getBlockLists() {
        java.util.List<BlockList> result = new ArrayList<BlockList>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("BlockList".equalsIgnoreCase(widget.getType())) {
                result.add((BlockList)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<BlockList> getBlockListList() {
        return  getBlockLists();
    }
     //DSL Style set value
    public BlockList addBlockList(BlockList blockListElem) {
        this.addAmendableWidget(blockListElem);
        return blockListElem;
    }

    public java.util.List<Toc> getTocs() {
        java.util.List<Toc> result = new ArrayList<Toc>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Toc".equalsIgnoreCase(widget.getType())) {
                result.add((Toc)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Toc> getTocList() {
        return  getTocs();
    }
     //DSL Style set value
    public Toc addToc(Toc tocElem) {
        this.addAmendableWidget(tocElem);
        return tocElem;
    }

    public java.util.List<Tblock> getTblocks() {
        java.util.List<Tblock> result = new ArrayList<Tblock>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tblock".equalsIgnoreCase(widget.getType())) {
                result.add((Tblock)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Tblock> getTblockList() {
        return  getTblocks();
    }
     //DSL Style set value
    public Tblock addTblock(Tblock tblockElem) {
        this.addAmendableWidget(tblockElem);
        return tblockElem;
    }

    public java.util.List<Ul> getUls() {
        java.util.List<Ul> result = new ArrayList<Ul>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ul".equalsIgnoreCase(widget.getType())) {
                result.add((Ul)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Ul> getUlList() {
        return  getUls();
    }
     //DSL Style set value
    public Ul addUl(Ul ulElem) {
        this.addAmendableWidget(ulElem);
        return ulElem;
    }

    public java.util.List<Ol> getOls() {
        java.util.List<Ol> result = new ArrayList<Ol>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ol".equalsIgnoreCase(widget.getType())) {
                result.add((Ol)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Ol> getOlList() {
        return  getOls();
    }
     //DSL Style set value
    public Ol addOl(Ol olElem) {
        this.addAmendableWidget(olElem);
        return olElem;
    }

    public java.util.List<Table> getTables() {
        java.util.List<Table> result = new ArrayList<Table>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Table".equalsIgnoreCase(widget.getType())) {
                result.add((Table)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Table> getTableList() {
        return  getTables();
    }
     //DSL Style set value
    public Table addTable(Table tableElem) {
        this.addAmendableWidget(tableElem);
        return tableElem;
    }

    public java.util.List<P> getPs() {
        java.util.List<P> result = new ArrayList<P>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("P".equalsIgnoreCase(widget.getType())) {
                result.add((P)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<P> getPList() {
        return  getPs();
    }
     //DSL Style set value
    public P addP(P pElem) {
        this.addAmendableWidget(pElem);
        return pElem;
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
        return  getPeriodAttr();
    }

    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
     //DSL Style set value
    public AlthierarchyComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"address","adjournment","administrationOfOath","answer","block","blockList","communication","componentRef","container","debateSection","declarationOfVote","div","foreign","heading","ministerialStatements","narrative","nationalInterest","noticesOfMotion","num","ol","oralStatements","other","p","papers","personalStatements","petitions","pointOfOrder","prayers","proceduralMotions","question","questions","resolutions","rollCall","scene","speech","subheading","summary","table","tblock","toc","ul","writtenStatements"};
    }

    @Override
    public Map<AmendableWidget, Occurrence> getAllowedSubTypes() {
        return ALLOWED_SUB_TYPES;
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
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }
}

