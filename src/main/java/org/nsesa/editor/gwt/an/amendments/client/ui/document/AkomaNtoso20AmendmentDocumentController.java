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

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;
import org.nsesa.editor.gwt.amendment.client.ui.document.AmendmentDocumentController;
import org.nsesa.editor.gwt.an.amendments.client.MyAmendmentDocumentInjector;
import org.nsesa.editor.gwt.an.amendments.client.mode.ConsolidationMode;
import org.nsesa.editor.gwt.an.amendments.client.mode.DiffMode;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.event.KeyComboEvent;
import org.nsesa.editor.gwt.core.client.event.KeyComboEventHandler;
import org.nsesa.editor.gwt.core.client.event.document.DocumentOverlayCompletedEvent;
import org.nsesa.editor.gwt.core.client.event.document.DocumentOverlayCompletedEventHandler;
import org.nsesa.editor.gwt.core.client.keyboard.KeyboardListener;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.ui.overlay.Creator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Mover;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;

import java.util.logging.Logger;

/**
 * Date: 10/01/13 11:23
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentDocumentController extends AmendmentDocumentController {

    private static final Logger LOG = Logger.getLogger(AkomaNtoso20AmendmentDocumentController.class.getName());

    private final KeyboardListener keyboardListener;

    // --- key combos ---

    final KeyboardListener.KeyCombo ctrlEnter = new KeyboardListener.KeyCombo(false, false, true, KeyCodes.KEY_ENTER);

    private HandlerRegistration documentOverlayCompletedEventHandler;
    private HandlerRegistration keyComboHandlerRegistration;

    @Inject
    public AkomaNtoso20AmendmentDocumentController(final ClientFactory clientFactory,
                                                   final ServiceFactory serviceFactory,
                                                   final OverlayFactory overlayFactory,
                                                   final Locator locator,
                                                   final Creator creator,
                                                   final Mover mover,
                                                   final KeyboardListener keyboardListener) {
        super(clientFactory, serviceFactory, overlayFactory, locator, creator, mover);
        this.keyboardListener = keyboardListener;
    }

    @Override
    public void registerKeyCombos() {
        super.registerKeyCombos();
        keyboardListener.register(ctrlEnter);
    }

    @Override
    public void registerModes() {
        super.registerModes();
        registerMode(DiffMode.KEY, new DiffMode(this, clientFactory, serviceFactory));
        registerMode(ConsolidationMode.KEY, new ConsolidationMode(this, clientFactory));
    }

    public void registerListeners() {
        super.registerListeners();
        documentOverlayCompletedEventHandler = documentEventBus.addHandler(DocumentOverlayCompletedEvent.TYPE, new DocumentOverlayCompletedEventHandler() {
            @Override
            public void onEvent(DocumentOverlayCompletedEvent event) {
                applyState(DiffMode.KEY, new ActiveState(true));
            }
        });

        keyComboHandlerRegistration = clientFactory.getEventBus().addHandler(KeyComboEvent.TYPE, new KeyComboEventHandler() {
            @Override
            public void onEvent(KeyComboEvent event) {
                LOG.info("Key combo " + event.getKeyCombo());
            }
        });
    }

    @Override
    public org.nsesa.editor.gwt.amendment.client.ui.document.AmendmentDocumentInjector getInjector() {
        return GWT.create(MyAmendmentDocumentInjector.class);
    }

    @Override
    public void removeListeners() {
        super.removeListeners();
        documentOverlayCompletedEventHandler.removeHandler();
        keyComboHandlerRegistration.removeHandler();
    }
}
