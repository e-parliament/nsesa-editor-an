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
package org.nsesa.editor.gwt.an.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.client.handler.common.content.AkomaNtoso20ContentPanelController;
import org.nsesa.editor.gwt.an.client.handler.create.AkomaNtoso20AmendmentDialogCreateController;
import org.nsesa.editor.gwt.an.client.handler.delete.AkomaNtoso20AmendmentDialogDeleteController;
import org.nsesa.editor.gwt.an.client.handler.modify.AkomaNtoso20AmendmentDialogModifyController;
import org.nsesa.editor.gwt.an.client.ui.document.AkomaNtoso20DocumentController;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20Creator;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20Locator;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20OverlayStrategy;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.Akomantoso20OverlayFactory;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.Akomantoso20OverlayLocalizableResource;
import org.nsesa.editor.gwt.an.client.ui.rte.ckeditor.Akomantoso20RichTextEditorConfig;
import org.nsesa.editor.gwt.an.client.ui.rte.ckeditor.Akomantoso20RichTextEditorPlugin;
import org.nsesa.editor.gwt.core.client.diffing.DiffingManager;
import org.nsesa.editor.gwt.core.client.ui.overlay.Creator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayLocalizableResource;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.core.client.ui.rte.RichTextEditorConfig;
import org.nsesa.editor.gwt.core.client.ui.rte.RichTextEditorPlugin;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.AmendmentDialogModule;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.create.AmendmentDialogCreateController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.delete.AmendmentDialogDeleteController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyController;
import org.nsesa.editor.gwt.editor.client.activity.EditorActivityMapper;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.editor.client.ui.main.EditorModule;
import org.nsesa.editor.gwt.inline.client.ui.inline.InlineEditorModule;

/**
 * Date: 15/10/12 21:23
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20Module extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new InlineEditorModule());
        install(new AmendmentDialogModule());
        install(new EditorModule());

        bind(RichTextEditorPlugin.class).to(Akomantoso20RichTextEditorPlugin.class);
        bind(RichTextEditorConfig.class).to(Akomantoso20RichTextEditorConfig.class);
        // bind the mapper
        bind(ActivityMapper.class).to(EditorActivityMapper.class).in(Singleton.class);
        bind(OverlayFactory.class).to(Akomantoso20OverlayFactory.class).in(Singleton.class);
        bind(OverlayLocalizableResource.class).to(Akomantoso20OverlayLocalizableResource.class).in(Singleton.class);
        bind(OverlayStrategy.class).to(AkomaNtoso20OverlayStrategy.class).in(Singleton.class);
        bind(Locator.class).to(AkomaNtoso20Locator.class).in(Singleton.class);
        bind(Creator.class).to(AkomaNtoso20Creator.class).in(Singleton.class);
        bind(DiffingManager.class).to(AkomaNtoso20DiffingManager.class).in(Singleton.class);
        bind(AmendmentDialogModifyController.class).to(AkomaNtoso20AmendmentDialogModifyController.class);
        bind(AmendmentDialogCreateController.class).to(AkomaNtoso20AmendmentDialogCreateController.class);
        bind(AmendmentDialogDeleteController.class).to(AkomaNtoso20AmendmentDialogDeleteController.class);
        bind(ContentPanelController.class).to(AkomaNtoso20ContentPanelController.class);

        bind(DocumentController.class).to(AkomaNtoso20DocumentController.class);
    }
}
