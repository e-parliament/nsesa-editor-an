package org.nsesa.editor.gwt.an.client.handler.common.content;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
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

        view.resetBodyClass();
        view.addBodyClass(dialogContext.getAmendableWidget().getAmendableElement().getClassName());

        if (dialogContext.getAmendmentController() != null) {
            // we're editing
            final java.util.List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", dialogContext.getAmendmentController().asAmendableWidget(dialogContext.getAmendmentController().getModel().getBody()));
            view.setOriginalText(quotedStructures.get(0).getAmendableElement().getFirstChildElement().getInnerHTML());
        } else {
            view.setOriginalText(dialogContext.getAmendableWidget().getInnerHTML());
        }
    }
}
