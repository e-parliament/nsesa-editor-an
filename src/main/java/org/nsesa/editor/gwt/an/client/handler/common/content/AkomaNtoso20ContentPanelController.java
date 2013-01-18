package org.nsesa.editor.gwt.an.client.handler.common.content;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentControllerView;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentPanelController;

/**
 * Date: 23/11/12 11:02
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
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
        if (dialogContext.getAmendmentController() != null) {
            // we're editing
            final String originalContent = dialogContext.getAmendmentController().getOriginalContentFromModel();
            view.setOriginalText(originalContent);
        } else {
            view.setOriginalText(dialogContext.getAmendableWidget().getInnerHTML());
        }
    }
}
