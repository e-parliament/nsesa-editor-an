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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document.sourcefile;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.SourceFileController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.SourceFileView;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.ActionBarController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.content.ContentController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.header.SourceFileHeaderController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.marker.MarkerController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.an.drafting.client.event.DocumentToggleStructureEvent;

/**
 * Date: 24/03/13 12:45
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class DraftingSourceFileController extends SourceFileController {

    private final ToggleButton structureToggleButton = new ToggleButton("<?>");

    @Inject
    public DraftingSourceFileController(final DocumentEventBus documentEventBus,
                                        final MarkerController markerController,
                                        final SourceFileHeaderController sourceFileHeaderController,
                                        final SourceFileView sourceFileView,
                                        final ContentController contentController,
                                        final ActionBarController actionBarController) {
        super(documentEventBus, markerController, sourceFileHeaderController, sourceFileView, contentController, actionBarController);
        sourceFileHeaderController.getView().addWidget(structureToggleButton);
        structureToggleButton.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
            @Override
            public void onValueChange(ValueChangeEvent<Boolean> event) {
                documentEventBus.fireEvent(new DocumentToggleStructureEvent(documentController,
                        structureToggleButton.isDown()));
            }
        });
    }

    @Override
    public void onMouseOver(OverlayWidget sender, Event event) {
        // do nothing
    }
}
