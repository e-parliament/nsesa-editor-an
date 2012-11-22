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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class DebateBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public DebateBodyTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType alternativeToAttr;
    private StatusTypeSimpleType statusAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType refersToAttr;
    private String wildcardContentAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType periodAttr;
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
    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(amendableElement.getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(amendableElement.getAttribute("status"));
        }

        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
        }

        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(amendableElement.getAttribute("class"));
        }

        return classAttr;
    }
    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(amendableElement.getAttribute("style"));
        }

        return styleAttr;
    }
    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(amendableElement.getAttribute("title"));
        }

        return titleAttr;
    }
    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(amendableElement.getAttribute("lang"));
        }

        return langAttr;
    }
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(amendableElement.getAttribute("period"));
        }

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
        return new String[]{"petitions","administrationOfOath","communication","debateSection","noticesOfMotion","questions","resolutions","papers","personalStatements","proceduralMotions","oralStatements","rollCall","address","nationalInterest","writtenStatements","declarationOfVote","pointOfOrder","adjournment","prayers","ministerialStatements"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("alternativeToAttr", getAlternativeToAttr().getValue());
        attrs.put("statusAttr", getStatusAttr().value());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());
        attrs.put("classAttr", getClassAttr().getValue());
        attrs.put("styleAttr", getStyleAttr().getValue());
        attrs.put("titleAttr", getTitleAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().toString());
        attrs.put("langAttr", getLangAttr().getValue());
        attrs.put("periodAttr", getPeriodAttr().getValue());

        return attrs;
    }

}

