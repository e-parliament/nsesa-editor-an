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

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.numbering.NumberingController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.path.PathController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.picker.PickerController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.source.SourceController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentInjector;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.outline.OutlineController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.sourcefile.DraftingSourceFileController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.create.ActionBarCreatePanelController;

/**
 * Date: 15/10/12 21:24
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@GinModules({DraftingDocumentModule.class})
public interface DraftingDocumentInjector extends DocumentInjector, Ginjector {
    OutlineController getOutlineController();
    SourceController getSourceController();
    ActionBarCreatePanelController getActionBarCreatePanelController();
    PickerController getPickerController();
    NumberingController getNumberingController();
    PathController getPathController();
}
