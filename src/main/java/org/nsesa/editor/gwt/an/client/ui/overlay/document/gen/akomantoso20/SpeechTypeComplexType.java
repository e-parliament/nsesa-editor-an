package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.From;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateTimeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Foreign;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Block;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class SpeechTypeComplexType extends BasehierarchyComplexType  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "speechTypeComplexType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget speechTypeComplexType");
return span;
}

// CONSTRUCTORS ------------------

public SpeechTypeComplexType(Element element) {
super(element);
}

// FIELDS ------------------
private AnyURISimpleType byAttr;
private AnyURISimpleType asAttr;
private DateTimeSimpleType startTimeAttr;
private DateTimeSimpleType endTimeAttr;
private AnyURISimpleType toAttr;
private AnyURISimpleType refersToAttr;
private AnyURISimpleType alternativeToAttr;
private StatusTypeSimpleType statusAttr;
private String wildcardContentAttr;
private LanguageSimpleType langAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private StringSimpleType classAttr;
private StringSimpleType styleAttr;
private StringSimpleType titleAttr;
private AnyURISimpleType periodAttr;

            public From getFrom() {
                From result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("From".equalsIgnoreCase(widget.getType())) {
            result = (From)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public From setFrom(From fromElem) {
                    From result = getFrom();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(fromElem);

                return fromElem;
            }
        public AnyURISimpleType getByAttr() {
        if (byAttr == null) {
                byAttr = new AnyURISimpleType();
                byAttr.setValue(getElement().getAttribute("by"));
        }

        return byAttr;
        }
        //DSL Style get value
        public AnyURISimpleType byAttr() {
        return  getByAttr();
        }

        public void setByAttr(final AnyURISimpleType byAttr) {
        this.byAttr = byAttr;
        }
        //DSL Style set value
        public SpeechTypeComplexType byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
        }
        public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
                asAttr = new AnyURISimpleType();
                asAttr.setValue(getElement().getAttribute("as"));
        }

        return asAttr;
        }
        //DSL Style get value
        public AnyURISimpleType asAttr() {
        return  getAsAttr();
        }

        public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
        }
        //DSL Style set value
        public SpeechTypeComplexType asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
        }
        public DateTimeSimpleType getStartTimeAttr() {
        if (startTimeAttr == null) {
                startTimeAttr = new DateTimeSimpleType();
                startTimeAttr.setValue(getElement().getAttribute("startTime"));
        }

        return startTimeAttr;
        }
        //DSL Style get value
        public DateTimeSimpleType startTimeAttr() {
        return  getStartTimeAttr();
        }

        public void setStartTimeAttr(final DateTimeSimpleType startTimeAttr) {
        this.startTimeAttr = startTimeAttr;
        }
        //DSL Style set value
        public SpeechTypeComplexType startTimeAttr(final DateTimeSimpleType startTimeAttr) {
        setStartTimeAttr(startTimeAttr);
        return this;
        }
        public DateTimeSimpleType getEndTimeAttr() {
        if (endTimeAttr == null) {
                endTimeAttr = new DateTimeSimpleType();
                endTimeAttr.setValue(getElement().getAttribute("endTime"));
        }

        return endTimeAttr;
        }
        //DSL Style get value
        public DateTimeSimpleType endTimeAttr() {
        return  getEndTimeAttr();
        }

        public void setEndTimeAttr(final DateTimeSimpleType endTimeAttr) {
        this.endTimeAttr = endTimeAttr;
        }
        //DSL Style set value
        public SpeechTypeComplexType endTimeAttr(final DateTimeSimpleType endTimeAttr) {
        setEndTimeAttr(endTimeAttr);
        return this;
        }
        public AnyURISimpleType getToAttr() {
        if (toAttr == null) {
                toAttr = new AnyURISimpleType();
                toAttr.setValue(getElement().getAttribute("to"));
        }

        return toAttr;
        }
        //DSL Style get value
        public AnyURISimpleType toAttr() {
        return  getToAttr();
        }

        public void setToAttr(final AnyURISimpleType toAttr) {
        this.toAttr = toAttr;
        }
        //DSL Style set value
        public SpeechTypeComplexType toAttr(final AnyURISimpleType toAttr) {
        setToAttr(toAttr);
        return this;
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
        public SpeechTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
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
        public SpeechTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
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
        return  getStatusAttr();
        }

        public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
        }
        //DSL Style set value
        public SpeechTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
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
        return  getWildcardContentAttr();
        }

        public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        }
        //DSL Style set value
        public SpeechTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
        public SpeechTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
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
        public SpeechTypeComplexType idAttr(final IDSimpleType idAttr) {
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
        public SpeechTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
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
        return  getClassAttr();
        }

        public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
        }
        //DSL Style set value
        public SpeechTypeComplexType classAttr(final StringSimpleType classAttr) {
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
        public SpeechTypeComplexType styleAttr(final StringSimpleType styleAttr) {
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
        public SpeechTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
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
        public SpeechTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"block","blockList","foreign","from","heading","num","ol","p","subheading","table","tblock","toc","ul"};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("by", getByAttr() != null ? getByAttr().getValue() : null);
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("startTime", getStartTimeAttr() != null ? getStartTimeAttr().getValue() : null);
        attrs.put("endTime", getEndTimeAttr() != null ? getEndTimeAttr().getValue() : null);
        attrs.put("to", getToAttr() != null ? getToAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
return attrs;
}
}

