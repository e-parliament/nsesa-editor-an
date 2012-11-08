package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.VersionTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoverPage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Header;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.JudgementBody;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Conclusions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Attachments;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class JudgementStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public JudgementStructureComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private VersionTypeSimpleType contains;
private Meta meta;
private CoverPage coverPage;
private Header header;
private JudgementBody judgementBody;
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
public Header getHeader() {
return header;
}

public void setHeader(final Header header) {
this.header = header;
}
public JudgementBody getJudgementBody() {
return judgementBody;
}

public void setJudgementBody(final JudgementBody judgementBody) {
this.judgementBody = judgementBody;
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
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"conclusions","judgementBody","versionTypeSimpleType","coverPage","attachments","header","meta"};
    return  subtypes;
}
}

