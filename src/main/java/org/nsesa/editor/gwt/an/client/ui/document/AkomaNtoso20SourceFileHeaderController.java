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
package org.nsesa.editor.gwt.an.client.ui.document;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.client.mode.ConsolidationMode;
import org.nsesa.editor.gwt.an.client.mode.DiffMode;
import org.nsesa.editor.gwt.an.client.mode.InlineEditingMode;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.util.Scope;
import org.nsesa.editor.gwt.editor.client.event.document.DocumentModeChangeEvent;
import org.nsesa.editor.gwt.editor.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.editor.client.ui.document.sourcefile.header.SourceFileHeaderController;
import org.nsesa.editor.gwt.editor.client.ui.document.sourcefile.header.SourceFileHeaderView;

import static org.nsesa.editor.gwt.core.client.util.Scope.ScopeValue.DOCUMENT;

/**
 * Date: 31/01/13 13:55
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
@Scope(DOCUMENT)
public class AkomaNtoso20SourceFileHeaderController extends SourceFileHeaderController {

    // some example modes
    private ToggleButton inlineEditingButton = new ToggleButton("Inline", "Inline", new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
            final InlineEditingMode inline = (InlineEditingMode) sourceFileController.getDocumentController().getMode(InlineEditingMode.KEY);
            documentEventBus.fireEvent(new DocumentModeChangeEvent<InlineEditingMode>(sourceFileController.getDocumentController(), inline, new ActiveState(!inline.getState().isActive())));
        }
    });
    private ToggleButton diffingButton = new ToggleButton("Diffing", "Diffing", new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
            final DiffMode diff = (DiffMode) sourceFileController.getDocumentController().getMode(DiffMode.KEY);
            documentEventBus.fireEvent(new DocumentModeChangeEvent<DiffMode>(sourceFileController.getDocumentController(), diff, new ActiveState(!diff.getState().isActive())));
        }
    });
    private ToggleButton consolidationButton = new ToggleButton("Consolidation", "Consolidation", new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
            final ConsolidationMode consolidationMode = (ConsolidationMode) sourceFileController.getDocumentController().getMode(ConsolidationMode.KEY);
            documentEventBus.fireEvent(new DocumentModeChangeEvent<ConsolidationMode>(sourceFileController.getDocumentController(), consolidationMode, new ActiveState(!consolidationMode.getState().isActive())));
        }
    });

    @Inject
    public AkomaNtoso20SourceFileHeaderController(DocumentEventBus documentEventBus, SourceFileHeaderView view) {
        super(documentEventBus, view);    //To change body of overridden methods use File | Settings | File Templates.
        view.addWidget(inlineEditingButton);
        view.addWidget(diffingButton);
        view.addWidget(consolidationButton);
    }
}
