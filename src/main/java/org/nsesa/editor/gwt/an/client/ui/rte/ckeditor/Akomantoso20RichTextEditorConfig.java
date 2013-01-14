package org.nsesa.editor.gwt.an.client.ui.rte.ckeditor;

import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.dialog.client.ui.rte.ckeditor.CKEditorConfig;
import org.nsesa.editor.gwt.dialog.client.ui.rte.ckeditor.CKEditorToolbar;

/**
 * The default configuration for Akomantoso20 editor
 * User: groza
 * Date: 14/01/13
 * Time: 14:47
 */
public class Akomantoso20RichTextEditorConfig extends CKEditorConfig {
    private static String CSS_PATH = "css/editor.css,css/document.css,css/amendment.css,css/akomaNtoso.css,css/akomaNtoso-override.css,css/ckeditor.css";

    public Akomantoso20RichTextEditorConfig() {
        super();
        String[] cssPath = CSS_PATH.split(",");
        for (int i = 0; i < cssPath.length; i++) {
            cssPath[i] = GWT.getModuleBaseURL() + "../" + cssPath[i];
        }
        this.setContentCss(cssPath)
                .setBodyClass("akomaNtoso")
                .setRemovePlugins("elementspath")
                .setExtraPlugins("nsesa")
                .setToolbarLocation("bottom")
                .setResize_enabled(false)
                .setAutoParagraph(false)
                .setFillEmptyBlocks(false)
                .setForcePasteAsPlainText(true)
                .keepEmptyTag("span")
                .replaceSubStyle("span", "widget sub", "sub", "http://www.akomantoso.org/1.0")
                .replaceSupStyle("span", "widget sup", "sup", "http://www.akomantoso.org/1.0")
        ;

    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly(readOnly)
                .setStartupFocus(!readOnly)
                .setToolbar(readOnly ? CKEditorToolbar.EMPTY_TOOLBAR : CKEditorToolbar.DEFAULT_TOOLBAR);

    }


}
