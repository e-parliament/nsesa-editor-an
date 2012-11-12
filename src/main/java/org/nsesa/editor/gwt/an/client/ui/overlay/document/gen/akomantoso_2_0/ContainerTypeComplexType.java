package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Container;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Foreign;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Block;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
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
public class ContainerTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ContainerTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private java.util.List<Container> containers = new ArrayList<Container>();
private StringSimpleType nameAttr;
private java.util.List<Foreign> foreigns = new ArrayList<Foreign>();
private java.util.List<Block> blocks = new ArrayList<Block>();
private AnyURISimpleType alternativeToAttr;
private AmendableWidgetImpl wildcardContentAttr;
private StringSimpleType classAttr;
private StringSimpleType styleAttr;
private StringSimpleType titleAttr;
private LanguageSimpleType langAttr;
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AnyURISimpleType refersToAttr;
private StatusTypeSimpleType statusAttr;
private java.util.List<BlockList> blockLists = new ArrayList<BlockList>();
private java.util.List<Toc> tocs = new ArrayList<Toc>();
private java.util.List<Tblock> tblocks = new ArrayList<Tblock>();
private java.util.List<Ul> uls = new ArrayList<Ul>();
private java.util.List<Ol> ols = new ArrayList<Ol>();
private java.util.List<Table> tables = new ArrayList<Table>();
private java.util.List<P> ps = new ArrayList<P>();
private AnyURISimpleType periodAttr;

public java.util.List<Container> getContainer() {
return containers;
}

public void setContainer(final java.util.List<Container> containers) {
this.containers = containers;
}
public StringSimpleType getNameAttr() {
return nameAttr;
}

public void setNameAttr(final StringSimpleType nameAttr) {
this.nameAttr = nameAttr;
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
public AnyURISimpleType getAlternativeToAttr() {
return alternativeToAttr;
}

public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
this.alternativeToAttr = alternativeToAttr;
}
public AmendableWidgetImpl getWildcardContentAttr() {
return wildcardContentAttr;
}

public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
this.wildcardContentAttr = wildcardContentAttr;
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
    String[] subtypes = new String[]{"ul","toc","tblock","blockList","container","p","block","table","ol","foreign"};
    return  subtypes;
}
}

