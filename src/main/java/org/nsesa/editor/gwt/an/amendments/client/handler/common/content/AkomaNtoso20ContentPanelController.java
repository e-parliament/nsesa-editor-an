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
package org.nsesa.editor.gwt.an.amendments.client.handler.common.content;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtoso20AmendmentControllerUtil;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentControllerView;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentPanelController;

/**
 * Date: 23/11/12 11:02
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20ContentPanelController extends ContentPanelController {

    @Inject
    public AkomaNtoso20ContentPanelController(ClientFactory clientFactory, ContentControllerView view) {
        super(clientFactory, view);
    }


    @Override
    public void setContext(DialogContext dialogContext) {
        super.setContext(dialogContext);

        view.getRichTextEditor().setOverlayWidget(dialogContext.getOverlayWidget());

        if (dialogContext.getAmendmentController() != null) {
            // we're editing
            view.setOriginalText(AkomaNtoso20AmendmentControllerUtil.getOriginalContentFromModel(dialogContext.getAmendmentController()));
        } else {
            view.setOriginalText(dialogContext.getOverlayWidget().getInnerHTML());
        }
    }
}
