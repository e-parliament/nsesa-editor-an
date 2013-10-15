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
package org.nsesa.editor.gwt.an.markup.client.ui.main;

import com.bfr.client.selection.Selection;
import com.google.gwt.user.client.Event;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;
import org.nsesa.editor.gwt.an.markup.client.event.SelectionEvent;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.event.BootstrapEvent;
import org.nsesa.editor.gwt.core.client.event.BootstrapEventHandler;
import org.nsesa.editor.gwt.core.client.event.CriticalErrorEvent;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.editor.client.Injector;

import java.util.logging.Logger;

/**
 * Date: 23/03/13 21:01
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class MarkupController {

    private static final Logger LOG = Logger.getLogger(MarkupController.class.getName());

    private final ClientFactory clientFactory;
    private final ServiceFactory serviceFactory;
    private final MarkupView view;
    private Injector injector;
    private HandlerRegistration bootstrapEventHandlerRegistration;
    private com.google.gwt.event.shared.HandlerRegistration nativeEventHandlerRegistration;

    @Inject
    public MarkupController(final ClientFactory clientFactory,
                            final ServiceFactory serviceFactory,
                            final MarkupView view) {
        this.clientFactory = clientFactory;
        this.serviceFactory = serviceFactory;
        this.view = view;
    }

    public void registerListeners() {
        bootstrapEventHandlerRegistration = clientFactory.getEventBus().addHandler(BootstrapEvent.TYPE, new BootstrapEventHandler() {
            @Override
            public void onEvent(BootstrapEvent event) {
                LOG.info("Received bootstrap event.");
                final String[] documentIDs = event.getClientContext().getDocumentIDs();

                if (documentIDs == null) {
                    // no document ids provided in the client context?
                    // TODO handle gracefully, perhaps a list of recent documents?
                    final String message = clientFactory.getCoreMessages().errorDocumentIdMissing();
                    clientFactory.getEventBus().fireEvent(new CriticalErrorEvent(message));
                } else {
                    // retrieve the document

                    DocumentController documentController = getDocumentController();

                    documentController.setDocumentID(clientFactory.getClientContext().getDocumentIDs()[0]);
                    documentController.loadDocument();
                    view.getMainPanel().add(documentController.getView());
                }
            }
        });

        nativeEventHandlerRegistration = Event.addNativePreviewHandler(new Event.NativePreviewHandler() {
            @Override
            public void onPreviewNativeEvent(Event.NativePreviewEvent event) {
                if ("mouseup".equalsIgnoreCase(event.getNativeEvent().getType())) {
                    handleSelectionChange();
                } else if ("keyup".equalsIgnoreCase(event.getNativeEvent().getType())) {
                    handleSelectionChange();
                }

            }
        });
    }

    private void handleSelectionChange() {
        clientFactory.getEventBus().fireEvent(new SelectionEvent(Selection.getSelection()));
    }

    public void removeListeners() {
        bootstrapEventHandlerRegistration.removeHandler();
        nativeEventHandlerRegistration.removeHandler();
    }

    public DocumentController getDocumentController() {
        final DocumentController documentController = injector.getDocumentController();
        documentController.setInjector(documentController.getInjector());
        documentController.registerListeners();
        documentController.registerModes();
        documentController.registerKeyCombos();
        return documentController;
    }

    public MarkupView getView() {
        return view;
    }

    public void setInjector(Injector injector) {
        this.injector = injector;
    }
}
