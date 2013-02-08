package org.nsesa.editor.gwt.an.client.ui.rte.ckeditor;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.rte.ckeditor.*;


/**
 * A simple plugin to register all the plugins used by Akomantoso 20 editor.
 * User: groza
 * Date: 11/01/13
 * Time: 12:13
 */
public class Akomantoso20RichTextEditorPlugin extends CkEditorCompositePlugin {

    @Inject
    public Akomantoso20RichTextEditorPlugin(OverlayFactory overlayFactory, ClientFactory clientFactory) {
        //register here the available plugin
        registerPlugin(new CKEditorDisableEnterKeyPlugin());
        registerPlugin(new CKEditorBasicStylesPlugin());
        registerPlugin(new CKEditorSelectionChangedPlugin(clientFactory));
        registerPlugin(new CKEditorDraftingInsertionPlugin(clientFactory));
        registerPlugin(new CKEditorDraftingToolPlugin(clientFactory));
        registerPlugin(new CKEditorRemoveFormatPlugin(clientFactory));
    }
}
