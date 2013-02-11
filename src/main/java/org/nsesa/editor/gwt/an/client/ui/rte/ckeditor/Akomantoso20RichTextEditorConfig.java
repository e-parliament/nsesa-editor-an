/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.rte.ckeditor;

import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.core.client.ui.rte.ckeditor.CKEditorConfig;
import org.nsesa.editor.gwt.core.client.ui.rte.ckeditor.CKEditorToolbar;

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
        setDraftingClassName("akomaNtoso-drafting");
        //configure the editor configuration
        setContentCss(new String[]{
                GWT.getModuleBaseURL() + "../" + "css/editor.css",
                GWT.getModuleBaseURL() + "../" + "css/document.css",
                GWT.getModuleBaseURL() + "../" + "css/amendment.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-all.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-override.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-display.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-drafting.css",
                GWT.getModuleBaseURL() + "../" + "css/ckeditor.css"})
                .setBodyClass("akomaNtoso")
                .setRemovePlugins("elementspath")
                .setZIndex(30000)
                .setExtraPlugins("nsesa")
                .setToolbarLocation("bottom")
                .setResize_enabled(false)
                .setAutoParagraph(false)
                .setFillEmptyBlocks(false)
                .setForcePasteAsPlainText(true);
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly(readOnly)
                .setStartupFocus(!readOnly)
                .setExtraPlugins(readOnly ? "" : "nsesa")
                .setToolbar(readOnly ? CKEditorToolbar.EMPTY_TOOLBAR : CKEditorToolbar.DEFAULT_TOOLBAR);

    }

}
