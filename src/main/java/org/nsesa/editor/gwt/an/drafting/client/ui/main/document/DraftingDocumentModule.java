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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.CompositeLocator;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.sourcefile.DraftingSourceFileController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.sourcefile.DraftingSourceFileViewImpl;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.sourcefile.actionbar.StaticActionBarController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.sourcefile.actionbar.StaticActionBarViewImpl;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentView;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.SourceFileController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.SourceFileView;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.ActionBarController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.ActionBarView;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.undo.UndoManager;

/**
 * Date: 15/10/12 21:23
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class DraftingDocumentModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(DocumentView.class).to(DraftingDocumentViewImpl.class).in(Singleton.class);
        bind(SourceFileController.class).to(DraftingSourceFileController.class).in(Singleton.class);
        bind(SourceFileView.class).to(DraftingSourceFileViewImpl.class).in(Singleton.class);
        bind(ActionBarController.class).to(StaticActionBarController.class).in(Singleton.class);
        bind(ActionBarView.class).to(StaticActionBarViewImpl.class).in(Singleton.class);
        bind(Locator.class).to(CompositeLocator.class).in(Singleton.class);
        bind(UndoManager.class).in(Singleton.class);
    }
}
