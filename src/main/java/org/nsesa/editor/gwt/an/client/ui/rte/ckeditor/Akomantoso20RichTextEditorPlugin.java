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
        registerPlugin(new CKEditorDraftingModificationPlugin(clientFactory));
        registerPlugin(new CKEditorDraftingToolPlugin(clientFactory));
        registerPlugin(new CKEditorRemoveFormatPlugin(clientFactory));
    }
}
