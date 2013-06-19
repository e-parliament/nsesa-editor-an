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
package org.nsesa.editor.gwt.an.common.client.mode;

import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.mode.DocumentMode;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.content.ContentController;

/**
 * Date: 23/03/13 16:58
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class StructureViewMode implements DocumentMode<ActiveState> {

    public final static String KEY = "structure";

    private final DocumentController documentController;

    private ActiveState state = new ActiveState(false);

    public StructureViewMode(DocumentController documentController) {
        this.documentController = documentController;
    }

    @Override
    public void registerListeners() {
    }

    @Override
    public void removeListeners() {
    }

    @Override
    public boolean apply(ActiveState state) {
        final ContentController contentController = documentController.getSourceFileController().getContentController();
        if (state.isActive()) {
            contentController.getView().getContentPanel().asWidget().addStyleName("akomaNtoso-drafting");
        } else {
            contentController.getView().getContentPanel().asWidget().removeStyleName("akomaNtoso-drafting");
        }
        this.state = state;
        return true;
    }

    @Override
    public ActiveState getState() {
        return state;
    }
}
