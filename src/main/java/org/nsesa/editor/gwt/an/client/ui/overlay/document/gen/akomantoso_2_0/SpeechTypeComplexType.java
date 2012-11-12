package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.From;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DateTimeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Foreign;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Block;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.StatusTypeSimpleType;
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
/**
* This file is generated.
*/
public class SpeechTypeComplexType extends BasehierarchyComplexType  {

// CONSTRUCTORS ------------------
public SpeechTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private From from;
private AnyURISimpleType byAttr;
private AnyURISimpleType asAttr;
private DateTimeSimpleType startTimeAttr;
private DateTimeSimpleType endTimeAttr;
private AnyURISimpleType toAttr;
private java.util.List<Foreign> foreigns = new ArrayList<Foreign>();
private java.util.List<Block> blocks = new ArrayList<Block>();
private LanguageSimpleType langAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AnyURISimpleType alternativeToAttr;
private StringSimpleType classAttr;
private StringSimpleType styleAttr;
private StringSimpleType titleAttr;
private StatusTypeSimpleType statusAttr;
private AmendableWidgetImpl wildcardContentAttr;
private AnyURISimpleType refersToAttr;
private java.util.List<BlockList> blockLists = new ArrayList<BlockList>();
private java.util.List<Toc> tocs = new ArrayList<Toc>();
private java.util.List<Tblock> tblocks = new ArrayList<Tblock>();
private java.util.List<Ul> uls = new ArrayList<Ul>();
private java.util.List<Ol> ols = new ArrayList<Ol>();
private java.util.List<Table> tables = new ArrayList<Table>();
private java.util.List<P> ps = new ArrayList<P>();
private AnyURISimpleType periodAttr;

public From getFrom() {
return from;
}

public void setFrom(final From from) {
this.from = from;
}
public AnyURISimpleType getByAttr() {
return byAttr;
}

public void setByAttr(final AnyURISimpleType byAttr) {
this.byAttr = byAttr;
}
public AnyURISimpleType getAsAttr() {
return asAttr;
}

public void setAsAttr(final AnyURISimpleType asAttr) {
this.asAttr = asAttr;
}
public DateTimeSimpleType getStartTimeAttr() {
return startTimeAttr;
}

public void setStartTimeAttr(final DateTimeSimpleType startTimeAttr) {
this.startTimeAttr = startTimeAttr;
}
public DateTimeSimpleType getEndTimeAttr() {
return endTimeAttr;
}

public void setEndTimeAttr(final DateTimeSimpleType endTimeAttr) {
this.endTimeAttr = endTimeAttr;
}
public AnyURISimpleType getToAttr() {
return toAttr;
}

public void setToAttr(final AnyURISimpleType toAttr) {
this.toAttr = toAttr;
}
public java.util.List<Foreign> getForeign() {
return foreigns;
}

public void setForeign(final java.util.List<Foreign> foreigns) {
this.foreigns = foreigns;
}
public java.util.List<Block> getBlock() {
return blocks;
}

public void setBlock(final java.util.List<Block> blocks) {
this.blocks = blocks;
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
public AnyURISimpleType getAlternativeToAttr() {
return alternativeToAttr;
}

public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
this.alternativeToAttr = alternativeToAttr;
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
public StatusTypeSimpleType getStatusAttr() {
return statusAttr;
}

public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
this.statusAttr = statusAttr;
}
public AmendableWidgetImpl getWildcardContentAttr() {
return wildcardContentAttr;
}

public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
this.wildcardContentAttr = wildcardContentAttr;
}
public AnyURISimpleType getRefersToAttr() {
return refersToAttr;
}

public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
this.refersToAttr = refersToAttr;
}
public java.util.List<BlockList> getBlockList() {
return blockLists;
}

public void setBlockList(final java.util.List<BlockList> blockLists) {
this.blockLists = blockLists;
}
public java.util.List<Toc> getToc() {
return tocs;
}

public void setToc(final java.util.List<Toc> tocs) {
this.tocs = tocs;
}
public java.util.List<Tblock> getTblock() {
return tblocks;
}

public void setTblock(final java.util.List<Tblock> tblocks) {
this.tblocks = tblocks;
}
public java.util.List<Ul> getUl() {
return uls;
}

public void setUl(final java.util.List<Ul> uls) {
this.uls = uls;
}
public java.util.List<Ol> getOl() {
return ols;
}

public void setOl(final java.util.List<Ol> ols) {
this.ols = ols;
}
public java.util.List<Table> getTable() {
return tables;
}

public void setTable(final java.util.List<Table> tables) {
this.tables = tables;
}
public java.util.List<P> getP() {
return ps;
}

public void setP(final java.util.List<P> ps) {
this.ps = ps;
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
    String[] subtypes = new String[]{"toc","ul","tblock","subheading","block","from","table","num","blockList","p","ol","foreign","heading"};
    return  subtypes;
}
}

