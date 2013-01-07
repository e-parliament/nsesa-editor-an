package org.nsesa.editor.gwt.an.client.handler.modify.content;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.util.AmendmentUtil;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.content.ContentControllerView;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.content.ContentPanelController;

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
            final String originalContent = AmendmentUtil.getOriginalContent(dialogContext.getAmendmentController().asAmendableWidget());
            view.setOriginalText(originalContent);
        } else {
            view.setOriginalText(dialogContext.getAmendableWidget().getInnerHTML());
        }
    }
}
