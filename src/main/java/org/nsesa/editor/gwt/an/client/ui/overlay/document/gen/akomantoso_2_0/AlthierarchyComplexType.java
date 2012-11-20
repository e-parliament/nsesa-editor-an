package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ComponentRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Container;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Speech;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Question;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Answer;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Other;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Scene;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Narrative;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Summary;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Foreign;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Block;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AdministrationOfOath;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RollCall;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Prayers;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.OralStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.WrittenStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PersonalStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MinisterialStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Resolutions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NationalInterest;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DeclarationOfVote;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Communication;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Petitions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Papers;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NoticesOfMotion;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Questions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Address;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ProceduralMotions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PointOfOrder;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Adjournment;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DebateSection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Div;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlockList;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Toc;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Tblock;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Ul;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Ol;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Table;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.P;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class AlthierarchyComplexType extends BasehierarchyComplexType  {

// CONSTRUCTORS ------------------

    public AlthierarchyComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType alternativeToAttr;
    private LanguageSimpleType langAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType refersToAttr;
    private StatusTypeSimpleType statusAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AmendableWidgetImpl wildcardContentAttr;
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
    public java.util.List<Container> getContainers() {
        java.util.List<Container> result = new ArrayList<Container>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType())) {
                result.add((Container)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<Question> getQuestions() {
        java.util.List<Question> result = new ArrayList<Question>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Question".equalsIgnoreCase(widget.getType())) {
                result.add((Question)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<Other> getOthers() {
        java.util.List<Other> result = new ArrayList<Other>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Other".equalsIgnoreCase(widget.getType())) {
                result.add((Other)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<Narrative> getNarratives() {
        java.util.List<Narrative> result = new ArrayList<Narrative>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Narrative".equalsIgnoreCase(widget.getType())) {
                result.add((Narrative)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<Foreign> getForeigns() {
        java.util.List<Foreign> result = new ArrayList<Foreign>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Foreign".equalsIgnoreCase(widget.getType())) {
                result.add((Foreign)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public AnyURISimpleType getAlternativeToAttr() {
        return alternativeToAttr;
    }
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
    public LanguageSimpleType getLangAttr() {
        return langAttr;
    }
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
    public IDSimpleType getIdAttr() {
        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public StatusTypeSimpleType getStatusAttr() {
        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    public StringSimpleType getClassAttr() {
        return classAttr;
    }
    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
    public StringSimpleType getStyleAttr() {
        return styleAttr;
    }
    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
    public StringSimpleType getTitleAttr() {
        return titleAttr;
    }
    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
    public AmendableWidgetImpl getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
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
    public java.util.List<RollCall> getRollCalls() {
        java.util.List<RollCall> result = new ArrayList<RollCall>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
                result.add((RollCall)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<OralStatements> getOralStatementses() {
        java.util.List<OralStatements> result = new ArrayList<OralStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
                result.add((OralStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<PersonalStatements> getPersonalStatementses() {
        java.util.List<PersonalStatements> result = new ArrayList<PersonalStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
                result.add((PersonalStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<Resolutions> getResolutionses() {
        java.util.List<Resolutions> result = new ArrayList<Resolutions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
                result.add((Resolutions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<DeclarationOfVote> getDeclarationOfVotes() {
        java.util.List<DeclarationOfVote> result = new ArrayList<DeclarationOfVote>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
                result.add((DeclarationOfVote)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<Petitions> getPetitionses() {
        java.util.List<Petitions> result = new ArrayList<Petitions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
                result.add((Petitions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<NoticesOfMotion> getNoticesOfMotions() {
        java.util.List<NoticesOfMotion> result = new ArrayList<NoticesOfMotion>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
                result.add((NoticesOfMotion)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<Address> getAddresses() {
        java.util.List<Address> result = new ArrayList<Address>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
                result.add((Address)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<PointOfOrder> getPointOfOrders() {
        java.util.List<PointOfOrder> result = new ArrayList<PointOfOrder>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
                result.add((PointOfOrder)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<DebateSection> getDebateSections() {
        java.util.List<DebateSection> result = new ArrayList<DebateSection>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
                result.add((DebateSection)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<BlockList> getBlockLists() {
        java.util.List<BlockList> result = new ArrayList<BlockList>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("BlockList".equalsIgnoreCase(widget.getType())) {
                result.add((BlockList)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<Tblock> getTblocks() {
        java.util.List<Tblock> result = new ArrayList<Tblock>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tblock".equalsIgnoreCase(widget.getType())) {
                result.add((Tblock)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<Ol> getOls() {
        java.util.List<Ol> result = new ArrayList<Ol>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ol".equalsIgnoreCase(widget.getType())) {
                result.add((Ol)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public java.util.List<P> getPs() {
        java.util.List<P> result = new ArrayList<P>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("P".equalsIgnoreCase(widget.getType())) {
                result.add((P)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public AnyURISimpleType getPeriodAttr() {
        return periodAttr;
    }
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"summary","toc","other","tblock","subheading","narrative","debateSection","div","block","resolutions","personalStatements","oralStatements","rollCall","blockList","declarationOfVote","adjournment","ol","question","componentRef","petitions","administrationOfOath","ul","communication","noticesOfMotion","answer","questions","papers","table","proceduralMotions","num","speech","address","nationalInterest","container","p","writtenStatements","pointOfOrder","scene","prayers","ministerialStatements","foreign","heading"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("alternativeToAttr", getAlternativeToAttr().getValue());
        attrs.put("langAttr", getLangAttr().getValue());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("statusAttr", getStatusAttr().value());
        attrs.put("classAttr", getClassAttr().getValue());
        attrs.put("styleAttr", getStyleAttr().getValue());
        attrs.put("titleAttr", getTitleAttr().getValue());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().getContent());
        attrs.put("periodAttr", getPeriodAttr().getValue());

        return attrs;
    }

}

