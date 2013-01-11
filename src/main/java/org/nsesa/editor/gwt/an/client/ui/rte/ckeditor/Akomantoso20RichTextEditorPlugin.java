package org.nsesa.editor.gwt.an.client.ui.rte.ckeditor;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Br;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.dialog.client.ui.rte.ckeditor.CKEditorEnterKeyPlugin;
import org.nsesa.editor.gwt.dialog.client.ui.rte.ckeditor.CkEditorCompositePlugin;


/**
 * A simple plugin to register all the plugins used by Akomantoso 20 editor.
 * User: groza
 * Date: 11/01/13
 * Time: 12:13
 */
public class Akomantoso20RichTextEditorPlugin extends CkEditorCompositePlugin {
    @Inject
    public Akomantoso20RichTextEditorPlugin(OverlayFactory overlayFactory) {
        //register here the available plugind
        registerPlugin(new CKEditorEnterKeyPlugin(overlayFactory, "br"));
    }
}
