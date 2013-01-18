package org.nsesa.editor.gwt.an.client.ui.rte.ckeditor;

import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Sub;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Sup;
import org.nsesa.editor.gwt.dialog.client.ui.rte.ckeditor.CKEditorConfig;
import org.nsesa.editor.gwt.dialog.client.ui.rte.ckeditor.CKEditorToolbar;

/**
 * The default configuration for Akomantoso20 editor
 * User: groza
 * Date: 14/01/13
 * Time: 14:47
 */
public class Akomantoso20RichTextEditorConfig extends CKEditorConfig {
    static {
        keepEmptyTag("span");
    }

    public Akomantoso20RichTextEditorConfig() {
        super();
        Sub sub = new Sub();
        Sup sup = new Sup();
        //configure the editor
        setContentCss(new String[]{
                GWT.getModuleBaseURL() + "../" + "css/editor.css",
                GWT.getModuleBaseURL() + "../" + "css/document.css",
                GWT.getModuleBaseURL() + "../" + "css/amendment.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-all.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-override.css",
                GWT.getModuleBaseURL() + "../" + "css/ckeditor.css"})
                .setBodyClass("akomaNtoso")
                .setRemovePlugins("elementspath")
                .setExtraPlugins("nsesa")
                .setToolbarLocation("bottom")
                .setResize_enabled(false)
                .setAutoParagraph(false)
                .setFillEmptyBlocks(false)
                .setForcePasteAsPlainText(true);
                //.replaceSubStyle("span", "widget " + sub.getType(), sub.getType(), sub.getNamespaceURI())
                //.replaceSupStyle("span", "widget " + sup.getType(), sup.getType(), sup.getNamespaceURI());
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly(readOnly)
                .setStartupFocus(!readOnly)
                .setExtraPlugins(readOnly ? "" : "nsesa")
                .setToolbar(readOnly ? CKEditorToolbar.EMPTY_TOOLBAR : CKEditorToolbar.DEFAULT_TOOLBAR);

    }

}
