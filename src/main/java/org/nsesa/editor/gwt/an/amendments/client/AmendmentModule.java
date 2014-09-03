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
package org.nsesa.editor.gwt.an.amendments.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;
import org.nsesa.editor.gwt.amendment.client.ui.document.amendments.AmendmentsPanelModule;
import org.nsesa.editor.gwt.an.amendments.client.handler.common.content.AkomaNtosoContentPanelController;
import org.nsesa.editor.gwt.an.amendments.client.handler.create.AkomaNtosoAmendmentDialogCreateController;
import org.nsesa.editor.gwt.an.amendments.client.handler.delete.AkomaNtosoAmendmentDialogDeleteController;
import org.nsesa.editor.gwt.an.amendments.client.handler.modify.AkomaNtosoAmendmentDialogModifyController;
import org.nsesa.editor.gwt.an.amendments.client.ui.document.AkomaNtoso20AmendmentDocumentController;
import org.nsesa.editor.gwt.an.amendments.client.ui.footer.AkomaNtosoFooterViewImpl;
import org.nsesa.editor.gwt.an.amendments.client.ui.rte.ckeditor.Akomantoso20RichTextEditorPlugin;
import org.nsesa.editor.gwt.an.amendments.client.ui.rte.ckeditor.AkomantosoRichTextEditorConfig;
import org.nsesa.editor.gwt.an.common.client.AkomaNtosoModule;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.AkomaNtosoOverlayStrategy;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.AkomaNtosoOverlayWidgetInjectionStrategy;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.CompositeOverlayLocalizableResource;
import org.nsesa.editor.gwt.compare.client.ui.compare.ComparePanelModule;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayLocalizableResource;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetInjectionStrategy;
import org.nsesa.editor.gwt.core.client.ui.rte.RichTextEditorConfig;
import org.nsesa.editor.gwt.core.client.ui.rte.RichTextEditorPlugin;
import org.nsesa.editor.gwt.core.client.validation.Validator;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.AmendmentDialogModule;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.create.AmendmentDialogCreateController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.delete.AmendmentDialogDeleteController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyController;
import org.nsesa.editor.gwt.editor.client.activity.EditorActivityMapper;
import org.nsesa.editor.gwt.editor.client.ui.footer.FooterView;
import org.nsesa.editor.gwt.editor.client.ui.main.EditorModule;
import org.nsesa.editor.gwt.inline.client.ui.inline.InlineEditorModule;

/**
 * Date: 15/10/12 21:23
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AmendmentModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new ComparePanelModule());
        install(new InlineEditorModule());
        install(new AmendmentDialogModule());
        install(new EditorModule());
        install(new AmendmentsPanelModule());
        install(new AkomaNtosoModule());

        bind(RichTextEditorPlugin.class).to(Akomantoso20RichTextEditorPlugin.class);
        bind(RichTextEditorConfig.class).to(AkomantosoRichTextEditorConfig.class);

        // bind the mapper
        bind(ActivityMapper.class).to(EditorActivityMapper.class).in(Singleton.class);

        bind(OverlayLocalizableResource.class).to(CompositeOverlayLocalizableResource.class).in(Singleton.class);
        bind(OverlayStrategy.class).to(AkomaNtosoOverlayStrategy.class).in(Singleton.class);

        bind(new TypeLiteral<Validator<OverlayWidget>>() {
        }).to(AmendmentOverlayWidgetValidator.class);

        bind(AmendmentDialogModifyController.class).to(AkomaNtosoAmendmentDialogModifyController.class);
        bind(AmendmentDialogCreateController.class).to(AkomaNtosoAmendmentDialogCreateController.class);
        bind(AmendmentDialogDeleteController.class).to(AkomaNtosoAmendmentDialogDeleteController.class);
        bind(ContentPanelController.class).to(AkomaNtosoContentPanelController.class);
        bind(FooterView.class).to(AkomaNtosoFooterViewImpl.class);

        bind(DocumentController.class).to(AkomaNtoso20AmendmentDocumentController.class);
    }
}
