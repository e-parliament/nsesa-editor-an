package org.nsesa.editor.gwt.an.client.handler.modify;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyView;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.author.AuthorPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.content.ContentPanelController;

import java.util.Arrays;

/**
 * Date: 23/11/12 10:14
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentDialogModifyController extends AmendmentDialogModifyController {

    @Inject
    public AkomaNtoso20AmendmentDialogModifyController(final ClientFactory clientFactory,
                                                       final AmendmentDialogModifyView view,
                                                       final Locator locator,
                                                       final OverlayFactory overlayFactory,
                                                       final AuthorPanelController authorPanelController,
                                                       final ContentPanelController contentPanelController
    ) {
        super(clientFactory, view, locator, overlayFactory, Arrays.asList(contentPanelController, authorPanelController));
    }

    @Override
    public void handleSave() {
        // TODO: just testing ...
        AmendableWidget root = overlayFactory.getAmendableWidget("Amendment");
        root.setContent(view.getAmendmentContent());
        amendment.setRoot(root);

        super.handleSave();
    }
}
