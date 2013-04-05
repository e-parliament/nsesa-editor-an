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
package org.nsesa.editor.gwt.an.drafting.client.ui.rte.ckeditor;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Br;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.rte.ckeditor.*;


/**
 * A simple plugin to register all the plugins used by Akomantoso 20 editor.
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 * Date: 11/01/13 12:13
 */
public class DraftingRichTextEditorPlugin extends CkEditorCompositePlugin {

    /**
     * Create <code>Akomantoso20RichTextEditorPlugin</Akomantoso20RichTextEditorPlugin> object and
     * wrap all the available plugins
     * @param overlayFactory
     * @param clientFactory
     */
    @Inject
    public DraftingRichTextEditorPlugin(OverlayFactory overlayFactory, ClientFactory clientFactory) {
        //register here the available plugin
        CKEditorEnterKeyPlugin ckEditorEnterKeyPlugin = new CKEditorEnterKeyPlugin(overlayFactory, new Br());
//        ckEditorEnterKeyPlugin.addRule(new CKEditorEnterKeyPlugin.DefaultRule(new P(), new Content()));
        registerPlugin(ckEditorEnterKeyPlugin);
        registerPlugin(new CKEditorBasicStylesPlugin());
        registerPlugin(new CKEditorBubbleUpEventsPlugin());
        registerPlugin(new CKEditorSelectionChangedPlugin(clientFactory));
        registerPlugin(new CKEditorVisualStructureInsertionPlugin(clientFactory));
        registerPlugin(new CKEditorVisualStructureModificationPlugin(clientFactory));
        registerPlugin(new CKEditorVisualStructureToolPlugin(clientFactory));
        registerPlugin(new CKEditorVisualStructureAttributesPlugin(clientFactory));
        registerPlugin(new CKEditorRemoveFormatPlugin(clientFactory));
    }
}
