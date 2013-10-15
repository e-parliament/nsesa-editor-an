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
package org.nsesa.editor.gwt.an.markup.client.mode;

import com.google.gwt.dom.client.Style;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.event.NotificationEvent;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.mode.DocumentMode;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;

/**
 * Date: 26/11/12 14:11
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class WhitespacePreservationMode implements DocumentMode<ActiveState> {

    public static final String KEY = "whitespace";

    private final DocumentController documentController;
    private final ClientFactory clientFactory;

    private ActiveState activeState = new ActiveState(false);

    public WhitespacePreservationMode(DocumentController documentController, ClientFactory clientFactory) {
        this.documentController = documentController;
        this.clientFactory = clientFactory;
    }

    @Override
    public void registerListeners() {

    }

    @Override
    public void removeListeners() {

    }

    @Override
    public boolean apply(ActiveState state) {
        final Style style = documentController.getSourceFileController().getContentController().getView().asWidget().getElement().getStyle();
        if (state.isActive()) {
            // don't do anything when this state is enabled
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Whitespace mode is now active."));
            style.setWhiteSpace(Style.WhiteSpace.PRE);
        } else {
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Whitespace mode is now inactive."));
            style.setWhiteSpace(Style.WhiteSpace.NORMAL);
        }
        this.activeState = state;
        return true;
    }

    @Override
    public ActiveState getState() {
        return activeState;
    }
}
