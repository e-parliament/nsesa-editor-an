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
package org.nsesa.editor.gwt.an.amendments.client.ui.document;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.HandlerRegistration;
import org.nsesa.editor.gwt.an.amendments.client.mode.ConsolidationMode;
import org.nsesa.editor.gwt.an.amendments.client.mode.DiffMode;
import org.nsesa.editor.gwt.an.amendments.client.ui.document.resources.Constants;
import org.nsesa.editor.gwt.core.client.event.document.DocumentModeStateChangedEvent;
import org.nsesa.editor.gwt.core.client.event.document.DocumentModeStateChangedEventHandler;
import org.nsesa.editor.gwt.core.client.event.document.DocumentOverlayCompletedEvent;
import org.nsesa.editor.gwt.core.client.event.document.DocumentOverlayCompletedEventHandler;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.header.SourceFileHeaderController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.header.SourceFileHeaderView;
import org.nsesa.editor.gwt.core.client.util.Scope;

import static org.nsesa.editor.gwt.core.client.util.Scope.ScopeValue.DOCUMENT;

/**
 * Date: 31/01/13 13:55
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
@Scope(DOCUMENT)
public class AkomaNtoso20SourceFileHeaderController extends SourceFileHeaderController {

    private final Constants constants;

    private ToggleButton diffingButton;
    private ToggleButton consolidationButton;
    private HandlerRegistration documentOverlayCompletedEventHandlerRegistration;
    private HandlerRegistration documentModeChangeHandlerRegistration;

    @Inject
    public AkomaNtoso20SourceFileHeaderController(DocumentEventBus documentEventBus, SourceFileHeaderView view, Constants constants) {
        super(documentEventBus, view);
        this.constants = constants;

        diffingButton = new ToggleButton(constants.documentModeDiffOff(), constants.documentModeDiffOn(), new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final DiffMode diff = (DiffMode) sourceFileController.getDocumentController().getMode(DiffMode.KEY);
                sourceFileController.getDocumentController().applyState(DiffMode.KEY, new ActiveState(!diff.getState().isActive()));
            }
        });
        consolidationButton = new ToggleButton(constants.documentModeConsolidationOff(), constants.documentModeConsolidationOn(), new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final ConsolidationMode consolidationMode = (ConsolidationMode) sourceFileController.getDocumentController().getMode(ConsolidationMode.KEY);
                sourceFileController.getDocumentController().applyState(ConsolidationMode.KEY, new ActiveState(!consolidationMode.getState().isActive()));
            }
        });

        view.addWidget(diffingButton);
        view.addWidget(consolidationButton);

        registerListeners();
    }

    private void registerListeners() {
        documentOverlayCompletedEventHandlerRegistration = documentEventBus.addHandler(DocumentOverlayCompletedEvent.TYPE, new DocumentOverlayCompletedEventHandler() {
            @Override
            public void onEvent(DocumentOverlayCompletedEvent event) {
                matchModeStates();
            }
        });

        documentModeChangeHandlerRegistration = documentEventBus.addHandler(DocumentModeStateChangedEvent.TYPE, new DocumentModeStateChangedEventHandler() {
            @Override
            public void onEvent(DocumentModeStateChangedEvent event) {
                matchModeStates();
            }
        });
    }

    private void matchModeStates() {
        final DiffMode diff = (DiffMode) sourceFileController.getDocumentController().getMode(DiffMode.KEY);
        final ConsolidationMode consolidationMode = (ConsolidationMode) sourceFileController.getDocumentController().getMode(ConsolidationMode.KEY);

        diffingButton.setDown(diff.getState().isActive());
        consolidationButton.setDown(consolidationMode.getState().isActive());
    }

    @Override
    public void removeListeners() {
        super.removeListeners();
        documentOverlayCompletedEventHandlerRegistration.removeHandler();
        documentModeChangeHandlerRegistration.removeHandler();
    }
}
