package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.VersionTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoverPage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Preface;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CollectionBody;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Conclusions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Attachments;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class CollectionStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public CollectionStructureComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private VersionTypeSimpleType contains;
private Meta meta;
private CoverPage coverPage;
private Preface preface;
private CollectionBody collectionBody;
private Conclusions conclusions;
private Attachments attachments;

public VersionTypeSimpleType getContains() {
return contains;
}

public void setContains(final VersionTypeSimpleType contains) {
this.contains = contains;
}
public Meta getMeta() {
return meta;
}

public void setMeta(final Meta meta) {
this.meta = meta;
}
public CoverPage getCoverPage() {
return coverPage;
}

public void setCoverPage(final CoverPage coverPage) {
this.coverPage = coverPage;
}
public Preface getPreface() {
return preface;
}

public void setPreface(final Preface preface) {
this.preface = preface;
}
public CollectionBody getCollectionBody() {
return collectionBody;
}

public void setCollectionBody(final CollectionBody collectionBody) {
this.collectionBody = collectionBody;
}
public Conclusions getConclusions() {
return conclusions;
}

public void setConclusions(final Conclusions conclusions) {
this.conclusions = conclusions;
}
public Attachments getAttachments() {
return attachments;
}

public void setAttachments(final Attachments attachments) {
this.attachments = attachments;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"conclusions","preface","versionTypeSimpleType","coverPage","collectionBody","attachments","meta"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

