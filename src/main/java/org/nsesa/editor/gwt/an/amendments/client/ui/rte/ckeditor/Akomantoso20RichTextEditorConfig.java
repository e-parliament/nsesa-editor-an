/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.amendments.client.ui.rte.ckeditor;

import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.core.client.ui.rte.ckeditor.CKEditorConfig;
import org.nsesa.editor.gwt.core.client.ui.rte.ckeditor.CKEditorToolbar;

import java.util.Arrays;

/**
 * An akomantoso specific editor configuration
 *
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 * Date: 11/01/13 11:44
 */
public class Akomantoso20RichTextEditorConfig extends CKEditorConfig {
    /**
     * keep empty span tags when editing
     */
    static {
        keepEmptyTag("span");
    }

    /**
     * Create a <code>Akomantoso20RichTextEditorConfig</code> with predefined settings
     */
    public Akomantoso20RichTextEditorConfig() {
        super();
        setDraftingClassName("akomaNtoso-drafting");
        //configure the editor configuration
        setContentCss(Arrays.asList(new String[]{
                GWT.getModuleBaseURL() + "../" + "css/editor.css",
                GWT.getModuleBaseURL() + "../" + "css/document.css",
                GWT.getModuleBaseURL() + "../" + "css/amendment.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-all.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-override.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-visual.css",
                GWT.getModuleBaseURL() + "../" + "css/akomaNtoso-visual-colors.css",
                GWT.getModuleBaseURL() + "../" + "css/ckeditor.css"}))
                .setBodyClass("akomaNtoso")
                .setRemovePlugins("elementspath")
                .setZIndex(30000)
                .setExtraPlugins(NSESA_PLUGIN_NAME)
                .setToolbarLocation("bottom")
                .setResize_enabled(false)
                .setAutoParagraph(false)
                .setFillEmptyBlocks(false)
                .setForcePasteAsPlainText(true);
    }

    /**
     * Set the editor config as read only, remove nsesa extra plugin and set up an empty toolbar
     * @param readOnly
     */
    public void setReadOnly(boolean readOnly) {
        this.readOnly(readOnly)
                .setStartupFocus(!readOnly)
                .setExtraPlugins(readOnly ? "" : NSESA_PLUGIN_NAME)
                .setToolbar(readOnly ? CKEditorToolbar.EMPTY_TOOLBAR : CKEditorToolbar.DEFAULT_TOOLBAR);

    }

}
