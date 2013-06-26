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
package org.nsesa.editor.gwt.an.drafting.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import org.nsesa.editor.gwt.an.common.client.AkomaNtosoModule;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.DraftingDocumentController;
import org.nsesa.editor.gwt.an.drafting.client.ui.rte.ckeditor.DraftingRichTextEditorProvider;
import org.nsesa.editor.gwt.core.client.CoreModule;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentModule;
import org.nsesa.editor.gwt.core.client.ui.rte.RichTextEditor;
import org.nsesa.editor.gwt.editor.client.activity.EditorActivityMapper;
import org.nsesa.editor.gwt.editor.client.ui.footer.FooterModule;
import org.nsesa.editor.gwt.editor.client.ui.header.HeaderModule;

/**
 * Date: 15/10/12 21:23
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class DraftingModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new CoreModule());
        install(new DocumentModule());
        install(new HeaderModule());
        install(new FooterModule());

        install(new AkomaNtosoModule());

        bind(ActivityMapper.class).to(EditorActivityMapper.class).in(Singleton.class);
        bind(DocumentController.class).to(DraftingDocumentController.class).in(Singleton.class);
        bind(RichTextEditor.class).annotatedWith(Names.named("inlineRichTextEditor")).toProvider(DraftingRichTextEditorProvider.class).in(Singleton.class);
    }
}
