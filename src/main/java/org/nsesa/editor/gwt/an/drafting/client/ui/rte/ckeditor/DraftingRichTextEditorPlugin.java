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
package org.nsesa.editor.gwt.an.drafting.client.ui.rte.ckeditor;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.*;
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
    public DraftingRichTextEditorPlugin(final OverlayFactory overlayFactory,
                                        final OverlaySnippetFactory snippetFactory,
                                        final ClientFactory clientFactory) {
        //register here the available plugin
        registerPlugin(new CKEditorEnterKeyPlugin(overlayFactory,
                new CKEditorEnterKeyPlugin.DefaultLineBreakProvider(overlayFactory),
                CKEditorEnterKeyPlugin.SPLIT_ALWAYS_ENTER_RULE,
                new CKEditorEnterKeyPlugin.ConversionEnterRule() {
                    @Override
                    public OverlayWidget convert(final OverlayWidget widget) {
                        OverlayWidget result = null;
                        OverlayWidget curr = widget;
                        while (curr != null) {
                            if (curr instanceof BasehierarchyComplexType) {
                                result = overlayFactory.getAmendableWidget(curr.getNamespaceURI(), curr.getType());
                                OverlaySnippet snippet = snippetFactory.getSnippet(curr);
                                if (snippet != null) {
                                    final String content = snippet.getContent(new DefaultOverlaySnippetEvaluator());
                                    result.getOverlayElement().setInnerHTML(content);
                                }
                                break;
                            }
                            curr = curr.getParentOverlayWidget();
                        }
                        return result;
                    };
                }));

        registerPlugin(new CKEditorBasicStylesPlugin());
        registerPlugin(new CKEditorBubbleUpEventsPlugin());
        registerPlugin(new CKEditorSelectionChangedPlugin(clientFactory));
        registerPlugin(new CKEditorVisualStructureInsertionPlugin(clientFactory));
        registerPlugin(new CKEditorVisualStructureModificationPlugin(clientFactory));
        registerPlugin(new CKEditorVisualStructureToolPlugin(clientFactory));
        registerPlugin(new CKEditorVisualStructureAttributesPlugin(clientFactory));
        registerPlugin(new CKEditorRemoveFormatPlugin(clientFactory));
        registerPlugin(new CKEditorCaretPositionSetupPlugin(overlayFactory, snippetFactory.getCaretPositionClassName()));
    }
}
